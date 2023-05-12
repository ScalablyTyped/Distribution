package typings.ethers

import typings.ethers.anon.DataTopics
import typings.ethers.anon.Error
import typings.ethers.anon.Topics
import typings.ethers.anon.Value
import typings.ethers.typesAbiAbiCoderMod.AbiCoder
import typings.ethers.typesAbiFragmentsMod.ConstructorFragment
import typings.ethers.typesAbiFragmentsMod.ErrorFragment
import typings.ethers.typesAbiFragmentsMod.EventFragment
import typings.ethers.typesAbiFragmentsMod.FallbackFragment
import typings.ethers.typesAbiFragmentsMod.Fragment
import typings.ethers.typesAbiFragmentsMod.FunctionFragment
import typings.ethers.typesAbiFragmentsMod.JsonFragment
import typings.ethers.typesAbiFragmentsMod.ParamType
import typings.ethers.typesAbiTypedMod.Typed
import typings.ethers.typesUtilsDataMod.BytesLike
import typings.ethers.typesUtilsErrorsMod.CallExceptionError
import typings.ethers.typesUtilsErrorsMod.CallExceptionTransaction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesAbiInterfaceMod {
  
  @JSImport("ethers/types/abi/interface", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ethers/types/abi/interface", "ErrorDescription")
  @js.native
  open class ErrorDescription protected () extends StObject {
    def this(
      fragment: ErrorFragment,
      selector: String,
      args: typings.ethers.typesAbiCodersAbstractCoderMod.Result
    ) = this()
    
    val args: typings.ethers.typesAbiCodersAbstractCoderMod.Result = js.native
    
    val fragment: ErrorFragment = js.native
    
    val name: String = js.native
    
    val selector: String = js.native
    
    val signature: String = js.native
  }
  
  @JSImport("ethers/types/abi/interface", "Indexed")
  @js.native
  open class Indexed () extends StObject {
    def this(hash: String) = this()
    
    val _isIndexed: Boolean = js.native
    
    val hash: Null | String = js.native
  }
  /* static members */
  object Indexed {
    
    @JSImport("ethers/types/abi/interface", "Indexed")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isIndexed(value: Any): /* is ethers.ethers/types/abi/interface.Indexed */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIndexed")(value.asInstanceOf[js.Any]).asInstanceOf[/* is ethers.ethers/types/abi/interface.Indexed */ Boolean]
  }
  
  @JSImport("ethers/types/abi/interface", "Interface")
  @js.native
  open class Interface protected () extends StObject {
    /**
      *  Create a new Interface for the %%fragments%%.
      */
    def this(fragments: InterfaceAbi) = this()
    
    def _decodeParams(params: js.Array[ParamType], data: BytesLike): typings.ethers.typesAbiCodersAbstractCoderMod.Result = js.native
    
    def _encodeParams(params: js.Array[ParamType], values: js.Array[Any]): String = js.native
    
    def decodeErrorResult(fragment: String, data: BytesLike): typings.ethers.typesAbiCodersAbstractCoderMod.Result = js.native
    /**
      *  Decodes the result %%data%% (e.g. from an ``eth_call``) for the
      *  specified error (see [[getError]] for valid values for
      *  %%key%%).
      *
      *  Most developers should prefer the [[parseCallResult]] method instead,
      *  which will automatically detect a ``CALL_EXCEPTION`` and throw the
      *  corresponding error.
      */
    def decodeErrorResult(fragment: ErrorFragment, data: BytesLike): typings.ethers.typesAbiCodersAbstractCoderMod.Result = js.native
    
    def decodeEventLog(fragment: String, data: BytesLike): typings.ethers.typesAbiCodersAbstractCoderMod.Result = js.native
    def decodeEventLog(fragment: String, data: BytesLike, topics: js.Array[String]): typings.ethers.typesAbiCodersAbstractCoderMod.Result = js.native
    def decodeEventLog(fragment: EventFragment, data: BytesLike): typings.ethers.typesAbiCodersAbstractCoderMod.Result = js.native
    def decodeEventLog(fragment: EventFragment, data: BytesLike, topics: js.Array[String]): typings.ethers.typesAbiCodersAbstractCoderMod.Result = js.native
    
    def decodeFunctionData(fragment: String, data: BytesLike): typings.ethers.typesAbiCodersAbstractCoderMod.Result = js.native
    /**
      *  Decodes the %%data%% from a transaction ``tx.data`` for
      *  the function specified (see [[getFunction]] for valid values
      *  for %%fragment%%).
      *
      *  Most developers should prefer the [[parseTransaction]] method
      *  instead, which will automatically detect the fragment.
      */
    def decodeFunctionData(fragment: FunctionFragment, data: BytesLike): typings.ethers.typesAbiCodersAbstractCoderMod.Result = js.native
    
    def decodeFunctionResult(fragment: String, data: BytesLike): typings.ethers.typesAbiCodersAbstractCoderMod.Result = js.native
    /**
      *  Decodes the result %%data%% (e.g. from an ``eth_call``) for the
      *  specified function (see [[getFunction]] for valid values for
      *  %%key%%).
      *
      *  Most developers should prefer the [[parseCallResult]] method instead,
      *  which will automatically detect a ``CALL_EXCEPTION`` and throw the
      *  corresponding error.
      */
    def decodeFunctionResult(fragment: FunctionFragment, data: BytesLike): typings.ethers.typesAbiCodersAbstractCoderMod.Result = js.native
    
    /**
      *  The Contract constructor.
      */
    val deploy: ConstructorFragment = js.native
    
    /**
      *  Encodes a ``tx.data`` object for deploying the Contract with
      *  the %%values%% as the constructor arguments.
      */
    def encodeDeploy(): String = js.native
    def encodeDeploy(values: js.Array[Any]): String = js.native
    
    def encodeErrorResult(fragment: String): String = js.native
    def encodeErrorResult(fragment: String, values: js.Array[Any]): String = js.native
    /**
      *  Encodes the transaction revert data for a call result that
      *  reverted from the the Contract with the sepcified %%error%%
      *  (see [[getError]] for valid values for %%fragment%%) with the %%values%%.
      *
      *  This is generally not used by most developers, unless trying to mock
      *  a result from a Contract.
      */
    def encodeErrorResult(fragment: ErrorFragment): String = js.native
    def encodeErrorResult(fragment: ErrorFragment, values: js.Array[Any]): String = js.native
    
    def encodeEventLog(fragment: String, values: js.Array[Any]): Topics = js.native
    def encodeEventLog(fragment: EventFragment, values: js.Array[Any]): Topics = js.native
    
    def encodeFilterTopics(fragment: String, values: js.Array[Any]): js.Array[Null | String | js.Array[String]] = js.native
    def encodeFilterTopics(fragment: EventFragment, values: js.Array[Any]): js.Array[Null | String | js.Array[String]] = js.native
    
    def encodeFunctionData(fragment: String): String = js.native
    def encodeFunctionData(fragment: String, values: js.Array[Any]): String = js.native
    /**
      *  Encodes the ``tx.data`` for a transaction that calls the function
      *  specified (see [[getFunction]] for valid values for %%fragment%%) with
      *  the %%values%%.
      */
    def encodeFunctionData(fragment: FunctionFragment): String = js.native
    def encodeFunctionData(fragment: FunctionFragment, values: js.Array[Any]): String = js.native
    
    def encodeFunctionResult(fragment: String): String = js.native
    def encodeFunctionResult(fragment: String, values: js.Array[Any]): String = js.native
    /**
      *  Encodes the result data (e.g. from an ``eth_call``) for the
      *  specified function (see [[getFunction]] for valid values
      *  for %%fragment%%) with %%values%%.
      *
      *  This is generally not used by most developers, unless trying to mock
      *  a result from a Contract.
      */
    def encodeFunctionResult(fragment: FunctionFragment): String = js.native
    def encodeFunctionResult(fragment: FunctionFragment, values: js.Array[Any]): String = js.native
    
    /**
      *  The Fallback method, if any.
      */
    val fallback: Null | FallbackFragment = js.native
    
    /**
      *  Iterate over all errors, calling %%callback%%, sorted by their name.
      */
    def forEachError(callback: js.Function2[/* func */ ErrorFragment, /* index */ Double, Unit]): Unit = js.native
    
    /**
      *  Iterate over all events, calling %%callback%%, sorted by their name.
      */
    def forEachEvent(callback: js.Function2[/* func */ EventFragment, /* index */ Double, Unit]): Unit = js.native
    
    /**
      *  Iterate over all functions, calling %%callback%%, sorted by their name.
      */
    def forEachFunction(callback: js.Function2[/* func */ FunctionFragment, /* index */ Double, Unit]): Unit = js.native
    
    /**
      *  Returns the entire Human-Readable ABI, as an array of
      *  signatures, optionally as %%minimal%% strings, which
      *  removes parameter names and unneceesary spaces.
      */
    def format(): js.Array[String] = js.native
    def format(minimal: Boolean): js.Array[String] = js.native
    
    /**
      *  Return the JSON-encoded ABI. This is the format Solidiy
      *  returns.
      */
    def formatJson(): String = js.native
    
    /**
      *  All the Contract ABI members (i.e. methods, events, errors, etc).
      */
    val fragments: js.Array[Fragment] = js.native
    
    /**
      *  The ABI coder that will be used to encode and decode binary
      *  data.
      */
    def getAbiCoder(): AbiCoder = js.native
    
    /**
      *  Get the [[ErrorFragment]] for %%key%%, which may be an error
      *  selector, error name or error signature that belongs to the ABI.
      *
      *  If %%values%% is provided, it will use the Typed API to handle
      *  ambiguous cases where multiple errors match by name.
      *
      *  If the %%key%% and %%values%% do not refine to a single error in
      *  the ABI, this will throw.
      */
    def getError(key: String): Null | ErrorFragment = js.native
    def getError(key: String, values: js.Array[Any | Typed]): Null | ErrorFragment = js.native
    
    /**
      *  Get the [[EventFragment]] for %%key%%, which may be a topic hash,
      *  event name or event signature that belongs to the ABI.
      *
      *  If %%values%% is provided, it will use the Typed API to handle
      *  ambiguous cases where multiple events match by name.
      *
      *  If the %%key%% and %%values%% do not refine to a single event in
      *  the ABI, this will throw.
      */
    def getEvent(key: String): Null | EventFragment = js.native
    def getEvent(key: String, values: js.Array[Any | Typed]): Null | EventFragment = js.native
    
    /**
      *  Get the event name for %%key%%, which may be a topic hash,
      *  event name or event signature that belongs to the ABI.
      */
    def getEventName(key: String): String = js.native
    
    /**
      *  Get the [[FunctionFragment]] for %%key%%, which may be a function
      *  selector, function name or function signature that belongs to the ABI.
      *
      *  If %%values%% is provided, it will use the Typed API to handle
      *  ambiguous cases where multiple functions match by name.
      *
      *  If the %%key%% and %%values%% do not refine to a single function in
      *  the ABI, this will throw.
      */
    def getFunction(key: String): Null | FunctionFragment = js.native
    def getFunction(key: String, values: js.Array[Any | Typed]): Null | FunctionFragment = js.native
    
    /**
      *  Get the function name for %%key%%, which may be a function selector,
      *  function name or function signature that belongs to the ABI.
      */
    def getFunctionName(key: String): String = js.native
    
    /**
      *  Returns true if %%key%% (an event topic hash, event name or
      *  event signature) is present in the ABI.
      *
      *  In the case of an event name, the name may be ambiguous, so
      *  accessing the [[EventFragment]] may require refinement.
      */
    def hasEvent(key: String): Boolean = js.native
    
    /**
      *  Returns true if %%key%% (a function selector, function name or
      *  function signature) is present in the ABI.
      *
      *  In the case of a function name, the name may be ambiguous, so
      *  accessing the [[FunctionFragment]] may require refinement.
      */
    def hasFunction(key: String): Boolean = js.native
    
    def makeError(_data: BytesLike, tx: CallExceptionTransaction): CallExceptionError = js.native
    
    def parseCallResult(data: BytesLike): typings.ethers.typesAbiCodersAbstractCoderMod.Result = js.native
    
    /**
      *  Parses a revert data, finding the matching error and extracts
      *  the parameter values along with other useful error details.
      *
      *  If the matching event cannot be found, returns null.
      */
    def parseError(data: BytesLike): Null | ErrorDescription = js.native
    
    /**
      *  Parses a receipt log, finding the matching event and extracts
      *  the parameter values along with other useful event details.
      *
      *  If the matching event cannot be found, returns null.
      */
    def parseLog(log: DataTopics): Null | LogDescription = js.native
    
    /**
      *  Parses a transaction, finding the matching function and extracts
      *  the parameter values along with other useful function details.
      *
      *  If the matching function cannot be found, return null.
      */
    def parseTransaction(tx: Value): Null | TransactionDescription = js.native
    
    /* private */ var `private`: Any = js.native
    
    /**
      *  If receiving ether is supported.
      */
    val receive: Boolean = js.native
  }
  /* static members */
  object Interface {
    
    @JSImport("ethers/types/abi/interface", "Interface")
    @js.native
    val ^ : js.Any = js.native
    
    inline def from(value: Interface): Interface = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any]).asInstanceOf[Interface]
    /**
      *  Creates a new [[Interface]] from the ABI %%value%%.
      *
      *  The %%value%% may be provided as an existing [[Interface]] object,
      *  a JSON-encoded ABI or any Human-Readable ABI format.
      */
    inline def from(value: InterfaceAbi): Interface = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any]).asInstanceOf[Interface]
  }
  
  @JSImport("ethers/types/abi/interface", "LogDescription")
  @js.native
  open class LogDescription protected () extends StObject {
    def this(fragment: EventFragment, topic: String, args: typings.ethers.typesAbiCodersAbstractCoderMod.Result) = this()
    
    val args: typings.ethers.typesAbiCodersAbstractCoderMod.Result = js.native
    
    val fragment: EventFragment = js.native
    
    val name: String = js.native
    
    val signature: String = js.native
    
    val topic: String = js.native
  }
  
  @JSImport("ethers/types/abi/interface", "Result")
  @js.native
  open class Result protected ()
    extends typings.ethers.typesAbiCodersAbstractCoderMod.Result {
    /**
      *  @private
      */
    def this(args: Any*) = this()
  }
  /* static members */
  object Result {
    
    @JSImport("ethers/types/abi/interface", "Result")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      *  Creates a new [[Result]] for %%items%% with each entry
      *  also accessible by its corresponding name in %%keys%%.
      */
    inline def fromItems(items: js.Array[Any]): typings.ethers.typesAbiCodersAbstractCoderMod.Result = ^.asInstanceOf[js.Dynamic].applyDynamic("fromItems")(items.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiCodersAbstractCoderMod.Result]
    inline def fromItems(items: js.Array[Any], keys: js.Array[Null | String]): typings.ethers.typesAbiCodersAbstractCoderMod.Result = (^.asInstanceOf[js.Dynamic].applyDynamic("fromItems")(items.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[typings.ethers.typesAbiCodersAbstractCoderMod.Result]
  }
  
  @JSImport("ethers/types/abi/interface", "TransactionDescription")
  @js.native
  open class TransactionDescription protected () extends StObject {
    def this(
      fragment: FunctionFragment,
      selector: String,
      args: typings.ethers.typesAbiCodersAbstractCoderMod.Result,
      value: js.BigInt
    ) = this()
    
    val args: typings.ethers.typesAbiCodersAbstractCoderMod.Result = js.native
    
    val fragment: FunctionFragment = js.native
    
    val name: String = js.native
    
    val selector: String = js.native
    
    val signature: String = js.native
    
    val value: js.BigInt = js.native
  }
  
  inline def checkResultErrors(result: typings.ethers.typesAbiCodersAbstractCoderMod.Result): js.Array[Error] = ^.asInstanceOf[js.Dynamic].applyDynamic("checkResultErrors")(result.asInstanceOf[js.Any]).asInstanceOf[js.Array[Error]]
  
  type InterfaceAbi = String | (js.Array[Fragment | JsonFragment | String])
}
