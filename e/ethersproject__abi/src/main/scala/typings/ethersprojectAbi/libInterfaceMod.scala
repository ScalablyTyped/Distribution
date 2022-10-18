package typings.ethersprojectAbi

import org.scalablytyped.runtime.StringDictionary
import typings.ethersprojectAbi.anon.Data
import typings.ethersprojectAbi.anon.Error
import typings.ethersprojectAbi.anon.Topics
import typings.ethersprojectAbi.anon.Value
import typings.ethersprojectAbi.libAbiCoderMod.AbiCoder
import typings.ethersprojectAbi.libCodersAbstractCoderMod.Result
import typings.ethersprojectAbi.libFragmentsMod.ConstructorFragment
import typings.ethersprojectAbi.libFragmentsMod.ErrorFragment
import typings.ethersprojectAbi.libFragmentsMod.EventFragment
import typings.ethersprojectAbi.libFragmentsMod.Fragment
import typings.ethersprojectAbi.libFragmentsMod.FunctionFragment
import typings.ethersprojectAbi.libFragmentsMod.JsonFragment
import typings.ethersprojectAbi.libFragmentsMod.ParamType
import typings.ethersprojectBignumber.mod.BigNumber
import typings.ethersprojectBytes.mod.BytesLike
import typings.ethersprojectProperties.mod.Description
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libInterfaceMod {
  
  @JSImport("@ethersproject/abi/lib/interface", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ethersproject/abi/lib/interface", "ErrorDescription")
  @js.native
  open class ErrorDescription protected () extends Description[ErrorDescription] {
    def this(info: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof @ethersproject/abi.@ethersproject/abi/lib/interface.ErrorDescription ]: @ethersproject/abi.@ethersproject/abi/lib/interface.ErrorDescription[K]} */ js.Any) = this()
    
    val args: Result = js.native
    
    val errorFragment: ErrorFragment = js.native
    
    val name: String = js.native
    
    val sighash: String = js.native
    
    val signature: String = js.native
  }
  
  @JSImport("@ethersproject/abi/lib/interface", "Indexed")
  @js.native
  open class Indexed protected () extends Description[Indexed] {
    def this(info: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof @ethersproject/abi.@ethersproject/abi/lib/interface.Indexed ]: @ethersproject/abi.@ethersproject/abi/lib/interface.Indexed[K]} */ js.Any) = this()
    
    val _isIndexed: Boolean = js.native
    
    val hash: String = js.native
  }
  /* static members */
  object Indexed {
    
    @JSImport("@ethersproject/abi/lib/interface", "Indexed")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isIndexed(value: Any): /* is @ethersproject/abi.@ethersproject/abi/lib/interface.Indexed */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIndexed")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @ethersproject/abi.@ethersproject/abi/lib/interface.Indexed */ Boolean]
  }
  
  @JSImport("@ethersproject/abi/lib/interface", "Interface")
  @js.native
  open class Interface protected () extends StObject {
    def this(fragments: String) = this()
    def this(fragments: js.Array[Fragment | JsonFragment | String]) = this()
    
    val _abiCoder: AbiCoder = js.native
    
    def _decodeParams(params: js.Array[ParamType], data: BytesLike): Result = js.native
    
    def _encodeParams(params: js.Array[ParamType], values: js.Array[Any]): String = js.native
    
    val _isInterface: Boolean = js.native
    
    def decodeErrorResult(fragment: String, data: BytesLike): Result = js.native
    def decodeErrorResult(fragment: ErrorFragment, data: BytesLike): Result = js.native
    
    def decodeEventLog(eventFragment: String, data: BytesLike): Result = js.native
    def decodeEventLog(eventFragment: String, data: BytesLike, topics: js.Array[String]): Result = js.native
    def decodeEventLog(eventFragment: EventFragment, data: BytesLike): Result = js.native
    def decodeEventLog(eventFragment: EventFragment, data: BytesLike, topics: js.Array[String]): Result = js.native
    
    def decodeFunctionData(functionFragment: String, data: BytesLike): Result = js.native
    def decodeFunctionData(functionFragment: FunctionFragment, data: BytesLike): Result = js.native
    
    def decodeFunctionResult(functionFragment: String, data: BytesLike): Result = js.native
    def decodeFunctionResult(functionFragment: FunctionFragment, data: BytesLike): Result = js.native
    
    val deploy: ConstructorFragment = js.native
    
    def encodeDeploy(): String = js.native
    def encodeDeploy(values: js.Array[Any]): String = js.native
    
    def encodeErrorResult(fragment: String): String = js.native
    def encodeErrorResult(fragment: String, values: js.Array[Any]): String = js.native
    def encodeErrorResult(fragment: ErrorFragment): String = js.native
    def encodeErrorResult(fragment: ErrorFragment, values: js.Array[Any]): String = js.native
    
    def encodeEventLog(eventFragment: String, values: js.Array[Any]): Data = js.native
    def encodeEventLog(eventFragment: EventFragment, values: js.Array[Any]): Data = js.native
    
    def encodeFilterTopics(eventFragment: String, values: js.Array[Any]): js.Array[String | js.Array[String]] = js.native
    def encodeFilterTopics(eventFragment: EventFragment, values: js.Array[Any]): js.Array[String | js.Array[String]] = js.native
    
    def encodeFunctionData(functionFragment: String): String = js.native
    def encodeFunctionData(functionFragment: String, values: js.Array[Any]): String = js.native
    def encodeFunctionData(functionFragment: FunctionFragment): String = js.native
    def encodeFunctionData(functionFragment: FunctionFragment, values: js.Array[Any]): String = js.native
    
    def encodeFunctionResult(functionFragment: String): String = js.native
    def encodeFunctionResult(functionFragment: String, values: js.Array[Any]): String = js.native
    def encodeFunctionResult(functionFragment: FunctionFragment): String = js.native
    def encodeFunctionResult(functionFragment: FunctionFragment, values: js.Array[Any]): String = js.native
    
    val errors: StringDictionary[ErrorFragment] = js.native
    
    val events: StringDictionary[EventFragment] = js.native
    
    def format(): String | js.Array[String] = js.native
    def format(format: String): String | js.Array[String] = js.native
    
    val fragments: js.Array[Fragment] = js.native
    
    val functions: StringDictionary[FunctionFragment] = js.native
    
    def getError(nameOrSignatureOrSighash: String): ErrorFragment = js.native
    
    def getEvent(nameOrSignatureOrTopic: String): EventFragment = js.native
    
    def getEventTopic(eventFragment: String): String = js.native
    def getEventTopic(eventFragment: EventFragment): String = js.native
    
    def getFunction(nameOrSignatureOrSighash: String): FunctionFragment = js.native
    
    def getSighash(fragment: String): String = js.native
    def getSighash(fragment: ErrorFragment): String = js.native
    def getSighash(fragment: FunctionFragment): String = js.native
    
    def parseError(data: BytesLike): ErrorDescription = js.native
    
    def parseLog(log: Topics): LogDescription = js.native
    
    def parseTransaction(tx: Value): TransactionDescription = js.native
    
    val structs: StringDictionary[Any] = js.native
  }
  /* static members */
  object Interface {
    
    @JSImport("@ethersproject/abi/lib/interface", "Interface")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getAbiCoder(): AbiCoder = ^.asInstanceOf[js.Dynamic].applyDynamic("getAbiCoder")().asInstanceOf[AbiCoder]
    
    inline def getAddress(address: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAddress")(address.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def getEventTopic(eventFragment: EventFragment): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getEventTopic")(eventFragment.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def getSighash(fragment: ErrorFragment): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSighash")(fragment.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def getSighash(fragment: FunctionFragment): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSighash")(fragment.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def isInterface(value: Any): /* is @ethersproject/abi.@ethersproject/abi/lib/interface.Interface */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInterface")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @ethersproject/abi.@ethersproject/abi/lib/interface.Interface */ Boolean]
  }
  
  @JSImport("@ethersproject/abi/lib/interface", "LogDescription")
  @js.native
  open class LogDescription protected () extends Description[LogDescription] {
    def this(info: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof @ethersproject/abi.@ethersproject/abi/lib/interface.LogDescription ]: @ethersproject/abi.@ethersproject/abi/lib/interface.LogDescription[K]} */ js.Any) = this()
    
    val args: Result = js.native
    
    val eventFragment: EventFragment = js.native
    
    val name: String = js.native
    
    val signature: String = js.native
    
    val topic: String = js.native
  }
  
  @JSImport("@ethersproject/abi/lib/interface", "TransactionDescription")
  @js.native
  open class TransactionDescription protected () extends Description[TransactionDescription] {
    def this(info: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof @ethersproject/abi.@ethersproject/abi/lib/interface.TransactionDescription ]: @ethersproject/abi.@ethersproject/abi/lib/interface.TransactionDescription[K]} */ js.Any) = this()
    
    val args: Result = js.native
    
    val functionFragment: FunctionFragment = js.native
    
    val name: String = js.native
    
    val sighash: String = js.native
    
    val signature: String = js.native
    
    val value: BigNumber = js.native
  }
  
  inline def checkResultErrors(result: Result): js.Array[Error] = ^.asInstanceOf[js.Dynamic].applyDynamic("checkResultErrors")(result.asInstanceOf[js.Any]).asInstanceOf[js.Array[Error]]
}
