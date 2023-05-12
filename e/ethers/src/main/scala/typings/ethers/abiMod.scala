package typings.ethers

import typings.ethers.anon.Data
import typings.ethers.anon.Error
import typings.ethers.ethersStrings.nonpayable
import typings.ethers.ethersStrings.pure
import typings.ethers.ethersStrings.view
import typings.ethers.typesAbiFragmentsMod.FragmentType
import typings.ethers.typesAbiInterfaceMod.InterfaceAbi
import typings.ethers.typesAddressMod.Addressable
import typings.ethers.typesUtilsDataMod.BytesLike
import typings.ethers.typesUtilsErrorsMod.CallExceptionAction
import typings.ethers.typesUtilsErrorsMod.CallExceptionError
import typings.ethers.typesUtilsMathsMod.BigNumberish
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object abiMod {
  
  @JSImport("ethers/abi", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ethers/abi", "AbiCoder")
  @js.native
  open class AbiCoder ()
    extends typings.ethers.typesAbiMod.AbiCoder
  /* static members */
  object AbiCoder {
    
    @JSImport("ethers/abi", "AbiCoder")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      *  Returns the shared singleton instance of a default [[AbiCoder]].
      *
      *  On the first call, the instance is created internally.
      */
    inline def defaultAbiCoder(): typings.ethers.typesAbiAbiCoderMod.AbiCoder = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultAbiCoder")().asInstanceOf[typings.ethers.typesAbiAbiCoderMod.AbiCoder]
    
    /**
      *  Returns an ethers-compatible [[CallExceptionError]] Error for the given
      *  result %%data%% for the [[CallExceptionAction]] %%action%% against
      *  the Transaction %%tx%%.
      */
    inline def getBuiltinCallException(action: CallExceptionAction, tx: Data): CallExceptionError = (^.asInstanceOf[js.Dynamic].applyDynamic("getBuiltinCallException")(action.asInstanceOf[js.Any], tx.asInstanceOf[js.Any])).asInstanceOf[CallExceptionError]
    inline def getBuiltinCallException(action: CallExceptionAction, tx: Data, data: BytesLike): CallExceptionError = (^.asInstanceOf[js.Dynamic].applyDynamic("getBuiltinCallException")(action.asInstanceOf[js.Any], tx.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[CallExceptionError]
  }
  
  @JSImport("ethers/abi", "ConstructorFragment")
  @js.native
  open class ConstructorFragment protected ()
    extends typings.ethers.typesAbiMod.ConstructorFragment {
    /**
      *  @private
      */
    def this(
      guard: Any,
      `type`: FragmentType,
      inputs: js.Array[typings.ethers.typesAbiFragmentsMod.ParamType],
      payable: Boolean
    ) = this()
    def this(
      guard: Any,
      `type`: FragmentType,
      inputs: js.Array[typings.ethers.typesAbiFragmentsMod.ParamType],
      payable: Boolean,
      gas: js.BigInt
    ) = this()
  }
  /* static members */
  object ConstructorFragment {
    
    @JSImport("ethers/abi", "ConstructorFragment")
    @js.native
    val ^ : js.Any = js.native
    
    inline def from(obj: Any): typings.ethers.typesAbiFragmentsMod.ConstructorFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(obj.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiFragmentsMod.ConstructorFragment]
    
    inline def isFragment(value: Any): /* is ethers.ethers/types/abi/fragments.ConstructorFragment */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFragment")(value.asInstanceOf[js.Any]).asInstanceOf[/* is ethers.ethers/types/abi/fragments.ConstructorFragment */ Boolean]
  }
  
  @JSImport("ethers/abi", "ErrorDescription")
  @js.native
  open class ErrorDescription protected ()
    extends typings.ethers.typesAbiMod.ErrorDescription {
    def this(
      fragment: typings.ethers.typesAbiFragmentsMod.ErrorFragment,
      selector: String,
      args: typings.ethers.typesAbiCodersAbstractCoderMod.Result
    ) = this()
  }
  
  @JSImport("ethers/abi", "ErrorFragment")
  @js.native
  open class ErrorFragment protected ()
    extends typings.ethers.typesAbiMod.ErrorFragment {
    /**
      *  @private
      */
    def this(guard: Any, name: String, inputs: js.Array[typings.ethers.typesAbiFragmentsMod.ParamType]) = this()
  }
  /* static members */
  object ErrorFragment {
    
    @JSImport("ethers/abi", "ErrorFragment")
    @js.native
    val ^ : js.Any = js.native
    
    inline def from(obj: Any): typings.ethers.typesAbiFragmentsMod.ErrorFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(obj.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiFragmentsMod.ErrorFragment]
    
    inline def isFragment(value: Any): /* is ethers.ethers/types/abi/fragments.ErrorFragment */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFragment")(value.asInstanceOf[js.Any]).asInstanceOf[/* is ethers.ethers/types/abi/fragments.ErrorFragment */ Boolean]
  }
  
  @JSImport("ethers/abi", "EventFragment")
  @js.native
  open class EventFragment protected ()
    extends typings.ethers.typesAbiMod.EventFragment {
    /**
      *  @private
      */
    def this(
      guard: Any,
      name: String,
      inputs: js.Array[typings.ethers.typesAbiFragmentsMod.ParamType],
      anonymous: Boolean
    ) = this()
  }
  /* static members */
  object EventFragment {
    
    @JSImport("ethers/abi", "EventFragment")
    @js.native
    val ^ : js.Any = js.native
    
    inline def from(obj: Any): typings.ethers.typesAbiFragmentsMod.EventFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(obj.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiFragmentsMod.EventFragment]
    
    inline def getTopicHash(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTopicHash")(name.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def getTopicHash(name: String, params: js.Array[Any]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getTopicHash")(name.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def isFragment(value: Any): /* is ethers.ethers/types/abi/fragments.EventFragment */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFragment")(value.asInstanceOf[js.Any]).asInstanceOf[/* is ethers.ethers/types/abi/fragments.EventFragment */ Boolean]
  }
  
  @JSImport("ethers/abi", "FallbackFragment")
  @js.native
  open class FallbackFragment protected ()
    extends typings.ethers.typesAbiMod.FallbackFragment {
    def this(guard: Any, inputs: js.Array[typings.ethers.typesAbiFragmentsMod.ParamType], payable: Boolean) = this()
  }
  /* static members */
  object FallbackFragment {
    
    @JSImport("ethers/abi", "FallbackFragment")
    @js.native
    val ^ : js.Any = js.native
    
    inline def from(obj: Any): typings.ethers.typesAbiFragmentsMod.FallbackFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(obj.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiFragmentsMod.FallbackFragment]
    
    inline def isFragment(value: Any): /* is ethers.ethers/types/abi/fragments.FallbackFragment */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFragment")(value.asInstanceOf[js.Any]).asInstanceOf[/* is ethers.ethers/types/abi/fragments.FallbackFragment */ Boolean]
  }
  
  /* note: abstract class */ @JSImport("ethers/abi", "Fragment")
  @js.native
  open class Fragment protected ()
    extends typings.ethers.typesAbiMod.Fragment {
    /**
      *  @private
      */
    def this(guard: Any, `type`: FragmentType, inputs: js.Array[typings.ethers.typesAbiFragmentsMod.ParamType]) = this()
  }
  /* static members */
  object Fragment {
    
    @JSImport("ethers/abi", "Fragment")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      *  Creates a new **Fragment** for %%obj%%, wich can be any supported
      *  ABI frgament type.
      */
    inline def from(obj: Any): typings.ethers.typesAbiFragmentsMod.Fragment = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(obj.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiFragmentsMod.Fragment]
    
    /**
      *  Returns true if %%value%% is a [[ConstructorFragment]].
      */
    inline def isConstructor(value: Any): /* is ethers.ethers/types/abi/fragments.ConstructorFragment */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isConstructor")(value.asInstanceOf[js.Any]).asInstanceOf[/* is ethers.ethers/types/abi/fragments.ConstructorFragment */ Boolean]
    
    /**
      *  Returns true if %%value%% is an [[ErrorFragment]].
      */
    inline def isError(value: Any): /* is ethers.ethers/types/abi/fragments.ErrorFragment */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isError")(value.asInstanceOf[js.Any]).asInstanceOf[/* is ethers.ethers/types/abi/fragments.ErrorFragment */ Boolean]
    
    /**
      *  Returns true if %%value%% is an [[EventFragment]].
      */
    inline def isEvent(value: Any): /* is ethers.ethers/types/abi/fragments.EventFragment */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEvent")(value.asInstanceOf[js.Any]).asInstanceOf[/* is ethers.ethers/types/abi/fragments.EventFragment */ Boolean]
    
    /**
      *  Returns true if %%value%% is a [[FunctionFragment]].
      */
    inline def isFunction(value: Any): /* is ethers.ethers/types/abi/fragments.FunctionFragment */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(value.asInstanceOf[js.Any]).asInstanceOf[/* is ethers.ethers/types/abi/fragments.FunctionFragment */ Boolean]
    
    /**
      *  Returns true if %%value%% is a [[StructFragment]].
      */
    inline def isStruct(value: Any): /* is ethers.ethers/types/abi/fragments.StructFragment */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStruct")(value.asInstanceOf[js.Any]).asInstanceOf[/* is ethers.ethers/types/abi/fragments.StructFragment */ Boolean]
  }
  
  @JSImport("ethers/abi", "FunctionFragment")
  @js.native
  open class FunctionFragment protected ()
    extends typings.ethers.typesAbiMod.FunctionFragment {
    /**
      *  @private
      */
    def this(
      guard: Any,
      name: String,
      stateMutability: typings.ethers.ethersStrings.payable | nonpayable | view | pure,
      inputs: js.Array[typings.ethers.typesAbiFragmentsMod.ParamType],
      outputs: js.Array[typings.ethers.typesAbiFragmentsMod.ParamType]
    ) = this()
    def this(
      guard: Any,
      name: String,
      stateMutability: typings.ethers.ethersStrings.payable | nonpayable | view | pure,
      inputs: js.Array[typings.ethers.typesAbiFragmentsMod.ParamType],
      outputs: js.Array[typings.ethers.typesAbiFragmentsMod.ParamType],
      gas: js.BigInt
    ) = this()
  }
  /* static members */
  object FunctionFragment {
    
    @JSImport("ethers/abi", "FunctionFragment")
    @js.native
    val ^ : js.Any = js.native
    
    inline def from(obj: Any): typings.ethers.typesAbiFragmentsMod.FunctionFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(obj.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiFragmentsMod.FunctionFragment]
    
    inline def getSelector(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSelector")(name.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def getSelector(name: String, params: js.Array[Any]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getSelector")(name.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def isFragment(value: Any): /* is ethers.ethers/types/abi/fragments.FunctionFragment */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFragment")(value.asInstanceOf[js.Any]).asInstanceOf[/* is ethers.ethers/types/abi/fragments.FunctionFragment */ Boolean]
  }
  
  @JSImport("ethers/abi", "Indexed")
  @js.native
  open class Indexed ()
    extends typings.ethers.typesAbiMod.Indexed {
    def this(hash: String) = this()
  }
  /* static members */
  object Indexed {
    
    @JSImport("ethers/abi", "Indexed")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isIndexed(value: Any): /* is ethers.ethers/types/abi/interface.Indexed */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIndexed")(value.asInstanceOf[js.Any]).asInstanceOf[/* is ethers.ethers/types/abi/interface.Indexed */ Boolean]
  }
  
  @JSImport("ethers/abi", "Interface")
  @js.native
  open class Interface protected ()
    extends typings.ethers.typesAbiMod.Interface {
    /**
      *  Create a new Interface for the %%fragments%%.
      */
    def this(fragments: InterfaceAbi) = this()
  }
  /* static members */
  object Interface {
    
    @JSImport("ethers/abi", "Interface")
    @js.native
    val ^ : js.Any = js.native
    
    inline def from(value: typings.ethers.typesAbiInterfaceMod.Interface): typings.ethers.typesAbiInterfaceMod.Interface = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiInterfaceMod.Interface]
    /**
      *  Creates a new [[Interface]] from the ABI %%value%%.
      *
      *  The %%value%% may be provided as an existing [[Interface]] object,
      *  a JSON-encoded ABI or any Human-Readable ABI format.
      */
    inline def from(value: InterfaceAbi): typings.ethers.typesAbiInterfaceMod.Interface = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiInterfaceMod.Interface]
  }
  
  @JSImport("ethers/abi", "LogDescription")
  @js.native
  open class LogDescription protected ()
    extends typings.ethers.typesAbiMod.LogDescription {
    def this(
      fragment: typings.ethers.typesAbiFragmentsMod.EventFragment,
      topic: String,
      args: typings.ethers.typesAbiCodersAbstractCoderMod.Result
    ) = this()
  }
  
  /* note: abstract class */ @JSImport("ethers/abi", "NamedFragment")
  @js.native
  open class NamedFragment protected ()
    extends typings.ethers.typesAbiMod.NamedFragment {
    /**
      *  @private
      */
    def this(
      guard: Any,
      `type`: FragmentType,
      name: String,
      inputs: js.Array[typings.ethers.typesAbiFragmentsMod.ParamType]
    ) = this()
  }
  
  @JSImport("ethers/abi", "ParamType")
  @js.native
  open class ParamType protected ()
    extends typings.ethers.typesAbiMod.ParamType {
    /**
      *  @private
      */
    def this(guard: Any, name: String, `type`: String, baseType: String) = this()
    def this(guard: Any, name: String, `type`: String, baseType: String, indexed: Boolean) = this()
    def this(
      guard: Any,
      name: String,
      `type`: String,
      baseType: String,
      indexed: Boolean,
      components: js.Array[typings.ethers.typesAbiFragmentsMod.ParamType]
    ) = this()
    def this(
      guard: Any,
      name: String,
      `type`: String,
      baseType: String,
      indexed: Null,
      components: js.Array[typings.ethers.typesAbiFragmentsMod.ParamType]
    ) = this()
    def this(
      guard: Any,
      name: String,
      `type`: String,
      baseType: String,
      indexed: Boolean,
      components: js.Array[typings.ethers.typesAbiFragmentsMod.ParamType],
      arrayLength: Double
    ) = this()
    def this(
      guard: Any,
      name: String,
      `type`: String,
      baseType: String,
      indexed: Boolean,
      components: Null,
      arrayLength: Double
    ) = this()
    def this(
      guard: Any,
      name: String,
      `type`: String,
      baseType: String,
      indexed: Null,
      components: js.Array[typings.ethers.typesAbiFragmentsMod.ParamType],
      arrayLength: Double
    ) = this()
    def this(
      guard: Any,
      name: String,
      `type`: String,
      baseType: String,
      indexed: Null,
      components: Null,
      arrayLength: Double
    ) = this()
    def this(
      guard: Any,
      name: String,
      `type`: String,
      baseType: String,
      indexed: Boolean,
      components: js.Array[typings.ethers.typesAbiFragmentsMod.ParamType],
      arrayLength: Double,
      arrayChildren: typings.ethers.typesAbiFragmentsMod.ParamType
    ) = this()
    def this(
      guard: Any,
      name: String,
      `type`: String,
      baseType: String,
      indexed: Boolean,
      components: js.Array[typings.ethers.typesAbiFragmentsMod.ParamType],
      arrayLength: Null,
      arrayChildren: typings.ethers.typesAbiFragmentsMod.ParamType
    ) = this()
    def this(
      guard: Any,
      name: String,
      `type`: String,
      baseType: String,
      indexed: Boolean,
      components: Null,
      arrayLength: Double,
      arrayChildren: typings.ethers.typesAbiFragmentsMod.ParamType
    ) = this()
    def this(
      guard: Any,
      name: String,
      `type`: String,
      baseType: String,
      indexed: Boolean,
      components: Null,
      arrayLength: Null,
      arrayChildren: typings.ethers.typesAbiFragmentsMod.ParamType
    ) = this()
    def this(
      guard: Any,
      name: String,
      `type`: String,
      baseType: String,
      indexed: Null,
      components: js.Array[typings.ethers.typesAbiFragmentsMod.ParamType],
      arrayLength: Double,
      arrayChildren: typings.ethers.typesAbiFragmentsMod.ParamType
    ) = this()
    def this(
      guard: Any,
      name: String,
      `type`: String,
      baseType: String,
      indexed: Null,
      components: js.Array[typings.ethers.typesAbiFragmentsMod.ParamType],
      arrayLength: Null,
      arrayChildren: typings.ethers.typesAbiFragmentsMod.ParamType
    ) = this()
    def this(
      guard: Any,
      name: String,
      `type`: String,
      baseType: String,
      indexed: Null,
      components: Null,
      arrayLength: Double,
      arrayChildren: typings.ethers.typesAbiFragmentsMod.ParamType
    ) = this()
    def this(
      guard: Any,
      name: String,
      `type`: String,
      baseType: String,
      indexed: Null,
      components: Null,
      arrayLength: Null,
      arrayChildren: typings.ethers.typesAbiFragmentsMod.ParamType
    ) = this()
  }
  /* static members */
  object ParamType {
    
    @JSImport("ethers/abi", "ParamType")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      *  Creates a new **ParamType** for %%obj%%.
      *
      *  If %%allowIndexed%% then the ``indexed`` keyword is permitted,
      *  otherwise the ``indexed`` keyword will throw an error.
      */
    inline def from(obj: Any): typings.ethers.typesAbiFragmentsMod.ParamType = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(obj.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiFragmentsMod.ParamType]
    inline def from(obj: Any, allowIndexed: Boolean): typings.ethers.typesAbiFragmentsMod.ParamType = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(obj.asInstanceOf[js.Any], allowIndexed.asInstanceOf[js.Any])).asInstanceOf[typings.ethers.typesAbiFragmentsMod.ParamType]
    
    /**
      *  Returns true if %%value%% is a **ParamType**.
      */
    inline def isParamType(value: Any): /* is ethers.ethers/types/abi/fragments.ParamType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isParamType")(value.asInstanceOf[js.Any]).asInstanceOf[/* is ethers.ethers/types/abi/fragments.ParamType */ Boolean]
  }
  
  @JSImport("ethers/abi", "Result")
  @js.native
  open class Result protected ()
    extends typings.ethers.typesAbiMod.Result {
    /**
      *  @private
      */
    def this(args: Any*) = this()
  }
  /* static members */
  object Result {
    
    @JSImport("ethers/abi", "Result")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      *  Creates a new [[Result]] for %%items%% with each entry
      *  also accessible by its corresponding name in %%keys%%.
      */
    inline def fromItems(items: js.Array[Any]): typings.ethers.typesAbiCodersAbstractCoderMod.Result = ^.asInstanceOf[js.Dynamic].applyDynamic("fromItems")(items.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiCodersAbstractCoderMod.Result]
    inline def fromItems(items: js.Array[Any], keys: js.Array[Null | String]): typings.ethers.typesAbiCodersAbstractCoderMod.Result = (^.asInstanceOf[js.Dynamic].applyDynamic("fromItems")(items.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[typings.ethers.typesAbiCodersAbstractCoderMod.Result]
  }
  
  @JSImport("ethers/abi", "StructFragment")
  @js.native
  open class StructFragment protected ()
    extends typings.ethers.typesAbiMod.StructFragment {
    /**
      *  @private
      */
    def this(guard: Any, name: String, inputs: js.Array[typings.ethers.typesAbiFragmentsMod.ParamType]) = this()
  }
  /* static members */
  object StructFragment {
    
    @JSImport("ethers/abi", "StructFragment")
    @js.native
    val ^ : js.Any = js.native
    
    inline def from(obj: Any): typings.ethers.typesAbiFragmentsMod.StructFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(obj.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiFragmentsMod.StructFragment]
    
    inline def isFragment(value: Any): /* is ethers.ethers/types/abi/fragments.FunctionFragment */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFragment")(value.asInstanceOf[js.Any]).asInstanceOf[/* is ethers.ethers/types/abi/fragments.FunctionFragment */ Boolean]
  }
  
  @JSImport("ethers/abi", "TransactionDescription")
  @js.native
  open class TransactionDescription protected ()
    extends typings.ethers.typesAbiMod.TransactionDescription {
    def this(
      fragment: typings.ethers.typesAbiFragmentsMod.FunctionFragment,
      selector: String,
      args: typings.ethers.typesAbiCodersAbstractCoderMod.Result,
      value: js.BigInt
    ) = this()
  }
  
  @JSImport("ethers/abi", "Typed")
  @js.native
  open class Typed protected ()
    extends typings.ethers.typesAbiMod.Typed {
    def this(gaurd: Any, `type`: String, value: Any) = this()
    def this(gaurd: Any, `type`: String, value: Any, options: Any) = this()
  }
  /* static members */
  object Typed {
    
    @JSImport("ethers/abi", "Typed")
    @js.native
    val ^ : js.Any = js.native
    
    inline def address(v: String): typings.ethers.typesAbiTypedMod.Typed = ^.asInstanceOf[js.Dynamic].applyDynamic("address")(v.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    inline def address(v: Addressable): typings.ethers.typesAbiTypedMod.Typed = ^.asInstanceOf[js.Dynamic].applyDynamic("address")(v.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    
    inline def array(v: js.Array[Any | typings.ethers.typesAbiTypedMod.Typed]): typings.ethers.typesAbiTypedMod.Typed = ^.asInstanceOf[js.Dynamic].applyDynamic("array")(v.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    inline def array(v: js.Array[Any | typings.ethers.typesAbiTypedMod.Typed], dynamic: Boolean): typings.ethers.typesAbiTypedMod.Typed = (^.asInstanceOf[js.Dynamic].applyDynamic("array")(v.asInstanceOf[js.Any], dynamic.asInstanceOf[js.Any])).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    
    inline def bool(v: Any): typings.ethers.typesAbiTypedMod.Typed = ^.asInstanceOf[js.Dynamic].applyDynamic("bool")(v.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    
    inline def bytes(v: BytesLike): typings.ethers.typesAbiTypedMod.Typed = ^.asInstanceOf[js.Dynamic].applyDynamic("bytes")(v.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    
    inline def bytes1(v: BytesLike): typings.ethers.typesAbiTypedMod.Typed = ^.asInstanceOf[js.Dynamic].applyDynamic("bytes1")(v.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    
    inline def bytes10(v: BytesLike): typings.ethers.typesAbiTypedMod.Typed = ^.asInstanceOf[js.Dynamic].applyDynamic("bytes10")(v.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    
    inline def bytes11(v: BytesLike): typings.ethers.typesAbiTypedMod.Typed = ^.asInstanceOf[js.Dynamic].applyDynamic("bytes11")(v.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    
    inline def bytes12(v: BytesLike): typings.ethers.typesAbiTypedMod.Typed = ^.asInstanceOf[js.Dynamic].applyDynamic("bytes12")(v.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    
    inline def bytes13(v: BytesLike): typings.ethers.typesAbiTypedMod.Typed = ^.asInstanceOf[js.Dynamic].applyDynamic("bytes13")(v.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    
    inline def bytes14(v: BytesLike): typings.ethers.typesAbiTypedMod.Typed = ^.asInstanceOf[js.Dynamic].applyDynamic("bytes14")(v.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    
    inline def bytes15(v: BytesLike): typings.ethers.typesAbiTypedMod.Typed = ^.asInstanceOf[js.Dynamic].applyDynamic("bytes15")(v.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    
    inline def bytes16(v: BytesLike): typings.ethers.typesAbiTypedMod.Typed = ^.asInstanceOf[js.Dynamic].applyDynamic("bytes16")(v.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    
    inline def bytes17(v: BytesLike): typings.ethers.typesAbiTypedMod.Typed = ^.asInstanceOf[js.Dynamic].applyDynamic("bytes17")(v.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    
    inline def bytes18(v: BytesLike): typings.ethers.typesAbiTypedMod.Typed = ^.asInstanceOf[js.Dynamic].applyDynamic("bytes18")(v.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    
    inline def bytes19(v: BytesLike): typings.ethers.typesAbiTypedMod.Typed = ^.asInstanceOf[js.Dynamic].applyDynamic("bytes19")(v.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    
    inline def bytes2(v: BytesLike): typings.ethers.typesAbiTypedMod.Typed = ^.asInstanceOf[js.Dynamic].applyDynamic("bytes2")(v.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    
    inline def bytes20(v: BytesLike): typings.ethers.typesAbiTypedMod.Typed = ^.asInstanceOf[js.Dynamic].applyDynamic("bytes20")(v.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    
    inline def bytes21(v: BytesLike): typings.ethers.typesAbiTypedMod.Typed = ^.asInstanceOf[js.Dynamic].applyDynamic("bytes21")(v.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    
    inline def bytes22(v: BytesLike): typings.ethers.typesAbiTypedMod.Typed = ^.asInstanceOf[js.Dynamic].applyDynamic("bytes22")(v.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    
    inline def bytes23(v: BytesLike): typings.ethers.typesAbiTypedMod.Typed = ^.asInstanceOf[js.Dynamic].applyDynamic("bytes23")(v.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    
    inline def bytes24(v: BytesLike): typings.ethers.typesAbiTypedMod.Typed = ^.asInstanceOf[js.Dynamic].applyDynamic("bytes24")(v.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    
    inline def bytes25(v: BytesLike): typings.ethers.typesAbiTypedMod.Typed = ^.asInstanceOf[js.Dynamic].applyDynamic("bytes25")(v.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    
    inline def bytes26(v: BytesLike): typings.ethers.typesAbiTypedMod.Typed = ^.asInstanceOf[js.Dynamic].applyDynamic("bytes26")(v.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    
    inline def bytes27(v: BytesLike): typings.ethers.typesAbiTypedMod.Typed = ^.asInstanceOf[js.Dynamic].applyDynamic("bytes27")(v.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    
    inline def bytes28(v: BytesLike): typings.ethers.typesAbiTypedMod.Typed = ^.asInstanceOf[js.Dynamic].applyDynamic("bytes28")(v.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    
    inline def bytes29(v: BytesLike): typings.ethers.typesAbiTypedMod.Typed = ^.asInstanceOf[js.Dynamic].applyDynamic("bytes29")(v.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    
    inline def bytes3(v: BytesLike): typings.ethers.typesAbiTypedMod.Typed = ^.asInstanceOf[js.Dynamic].applyDynamic("bytes3")(v.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    
    inline def bytes30(v: BytesLike): typings.ethers.typesAbiTypedMod.Typed = ^.asInstanceOf[js.Dynamic].applyDynamic("bytes30")(v.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    
    inline def bytes31(v: BytesLike): typings.ethers.typesAbiTypedMod.Typed = ^.asInstanceOf[js.Dynamic].applyDynamic("bytes31")(v.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    
    inline def bytes32(v: BytesLike): typings.ethers.typesAbiTypedMod.Typed = ^.asInstanceOf[js.Dynamic].applyDynamic("bytes32")(v.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    
    inline def bytes4(v: BytesLike): typings.ethers.typesAbiTypedMod.Typed = ^.asInstanceOf[js.Dynamic].applyDynamic("bytes4")(v.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    
    inline def bytes5(v: BytesLike): typings.ethers.typesAbiTypedMod.Typed = ^.asInstanceOf[js.Dynamic].applyDynamic("bytes5")(v.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    
    inline def bytes6(v: BytesLike): typings.ethers.typesAbiTypedMod.Typed = ^.asInstanceOf[js.Dynamic].applyDynamic("bytes6")(v.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    
    inline def bytes7(v: BytesLike): typings.ethers.typesAbiTypedMod.Typed = ^.asInstanceOf[js.Dynamic].applyDynamic("bytes7")(v.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    
    inline def bytes8(v: BytesLike): typings.ethers.typesAbiTypedMod.Typed = ^.asInstanceOf[js.Dynamic].applyDynamic("bytes8")(v.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    
    inline def bytes9(v: BytesLike): typings.ethers.typesAbiTypedMod.Typed = ^.asInstanceOf[js.Dynamic].applyDynamic("bytes9")(v.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    
    inline def dereference[T](value: T, `type`: String): T = (^.asInstanceOf[js.Dynamic].applyDynamic("dereference")(value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[T]
    /**
      *  If the value is a [[Typed]] instance, validates the underlying value
      *  and returns it, otherwise returns value directly.
      *
      *  This is useful for functions that with to accept either a [[Typed]]
      *  object or values.
      */
    inline def dereference[T](value: typings.ethers.typesAbiTypedMod.Typed, `type`: String): T = (^.asInstanceOf[js.Dynamic].applyDynamic("dereference")(value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[T]
    
    inline def from(`type`: String, value: Any): typings.ethers.typesAbiTypedMod.Typed = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(`type`.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    
    inline def int(v: BigNumberish): typings.ethers.typesAbiTypedMod.Typed = ^.asInstanceOf[js.Dynamic].applyDynamic("int")(v.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    
    inline def int104(v: BigNumberish): typings.ethers.typesAbiTypedMod.Typed = ^.asInstanceOf[js.Dynamic].applyDynamic("int104")(v.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    
    inline def int112(v: BigNumberish): typings.ethers.typesAbiTypedMod.Typed = ^.asInstanceOf[js.Dynamic].applyDynamic("int112")(v.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    
    inline def int120(v: BigNumberish): typings.ethers.typesAbiTypedMod.Typed = ^.asInstanceOf[js.Dynamic].applyDynamic("int120")(v.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    
    inline def int128(v: BigNumberish): typings.ethers.typesAbiTypedMod.Typed = ^.asInstanceOf[js.Dynamic].applyDynamic("int128")(v.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    
    inline def int136(v: BigNumberish): typings.ethers.typesAbiTypedMod.Typed = ^.asInstanceOf[js.Dynamic].applyDynamic("int136")(v.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    
    inline def int144(v: BigNumberish): typings.ethers.typesAbiTypedMod.Typed = ^.asInstanceOf[js.Dynamic].applyDynamic("int144")(v.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    
    inline def int152(v: BigNumberish): typings.ethers.typesAbiTypedMod.Typed = ^.asInstanceOf[js.Dynamic].applyDynamic("int152")(v.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    
    inline def int16(v: BigNumberish): typings.ethers.typesAbiTypedMod.Typed = ^.asInstanceOf[js.Dynamic].applyDynamic("int16")(v.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    
    inline def int160(v: BigNumberish): typings.ethers.typesAbiTypedMod.Typed = ^.asInstanceOf[js.Dynamic].applyDynamic("int160")(v.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    
    inline def int168(v: BigNumberish): typings.ethers.typesAbiTypedMod.Typed = ^.asInstanceOf[js.Dynamic].applyDynamic("int168")(v.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    
    inline def int176(v: BigNumberish): typings.ethers.typesAbiTypedMod.Typed = ^.asInstanceOf[js.Dynamic].applyDynamic("int176")(v.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    
    inline def int184(v: BigNumberish): typings.ethers.typesAbiTypedMod.Typed = ^.asInstanceOf[js.Dynamic].applyDynamic("int184")(v.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    
    inline def int192(v: BigNumberish): typings.ethers.typesAbiTypedMod.Typed = ^.asInstanceOf[js.Dynamic].applyDynamic("int192")(v.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    
    inline def int200(v: BigNumberish): typings.ethers.typesAbiTypedMod.Typed = ^.asInstanceOf[js.Dynamic].applyDynamic("int200")(v.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    
    inline def int208(v: BigNumberish): typings.ethers.typesAbiTypedMod.Typed = ^.asInstanceOf[js.Dynamic].applyDynamic("int208")(v.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    
    inline def int216(v: BigNumberish): typings.ethers.typesAbiTypedMod.Typed = ^.asInstanceOf[js.Dynamic].applyDynamic("int216")(v.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    
    inline def int224(v: BigNumberish): typings.ethers.typesAbiTypedMod.Typed = ^.asInstanceOf[js.Dynamic].applyDynamic("int224")(v.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    
    inline def int232(v: BigNumberish): typings.ethers.typesAbiTypedMod.Typed = ^.asInstanceOf[js.Dynamic].applyDynamic("int232")(v.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    
    inline def int24(v: BigNumberish): typings.ethers.typesAbiTypedMod.Typed = ^.asInstanceOf[js.Dynamic].applyDynamic("int24")(v.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    
    inline def int240(v: BigNumberish): typings.ethers.typesAbiTypedMod.Typed = ^.asInstanceOf[js.Dynamic].applyDynamic("int240")(v.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    
    inline def int248(v: BigNumberish): typings.ethers.typesAbiTypedMod.Typed = ^.asInstanceOf[js.Dynamic].applyDynamic("int248")(v.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    
    inline def int256(v: BigNumberish): typings.ethers.typesAbiTypedMod.Typed = ^.asInstanceOf[js.Dynamic].applyDynamic("int256")(v.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    
    inline def int32(v: BigNumberish): typings.ethers.typesAbiTypedMod.Typed = ^.asInstanceOf[js.Dynamic].applyDynamic("int32")(v.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    
    inline def int40(v: BigNumberish): typings.ethers.typesAbiTypedMod.Typed = ^.asInstanceOf[js.Dynamic].applyDynamic("int40")(v.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    
    inline def int48(v: BigNumberish): typings.ethers.typesAbiTypedMod.Typed = ^.asInstanceOf[js.Dynamic].applyDynamic("int48")(v.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    
    inline def int56(v: BigNumberish): typings.ethers.typesAbiTypedMod.Typed = ^.asInstanceOf[js.Dynamic].applyDynamic("int56")(v.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    
    inline def int64(v: BigNumberish): typings.ethers.typesAbiTypedMod.Typed = ^.asInstanceOf[js.Dynamic].applyDynamic("int64")(v.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    
    inline def int72(v: BigNumberish): typings.ethers.typesAbiTypedMod.Typed = ^.asInstanceOf[js.Dynamic].applyDynamic("int72")(v.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    
    inline def int8(v: BigNumberish): typings.ethers.typesAbiTypedMod.Typed = ^.asInstanceOf[js.Dynamic].applyDynamic("int8")(v.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    
    inline def int80(v: BigNumberish): typings.ethers.typesAbiTypedMod.Typed = ^.asInstanceOf[js.Dynamic].applyDynamic("int80")(v.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    
    inline def int88(v: BigNumberish): typings.ethers.typesAbiTypedMod.Typed = ^.asInstanceOf[js.Dynamic].applyDynamic("int88")(v.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    
    inline def int96(v: BigNumberish): typings.ethers.typesAbiTypedMod.Typed = ^.asInstanceOf[js.Dynamic].applyDynamic("int96")(v.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    
    /**
      *  Returns true only if %%value%% is a [[Typed]] instance.
      */
    inline def isTyped(value: Any): /* is ethers.ethers/types/abi/typed.Typed */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTyped")(value.asInstanceOf[js.Any]).asInstanceOf[/* is ethers.ethers/types/abi/typed.Typed */ Boolean]
    
    inline def overrides(v: Record[String, Any]): typings.ethers.typesAbiTypedMod.Typed = ^.asInstanceOf[js.Dynamic].applyDynamic("overrides")(v.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    
    inline def string(v: String): typings.ethers.typesAbiTypedMod.Typed = ^.asInstanceOf[js.Dynamic].applyDynamic("string")(v.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    
    inline def tuple(v: js.Array[Any | typings.ethers.typesAbiTypedMod.Typed]): typings.ethers.typesAbiTypedMod.Typed = ^.asInstanceOf[js.Dynamic].applyDynamic("tuple")(v.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    inline def tuple(v: js.Array[Any | typings.ethers.typesAbiTypedMod.Typed], name: String): typings.ethers.typesAbiTypedMod.Typed = (^.asInstanceOf[js.Dynamic].applyDynamic("tuple")(v.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    inline def tuple(v: Record[String, Any | typings.ethers.typesAbiTypedMod.Typed]): typings.ethers.typesAbiTypedMod.Typed = ^.asInstanceOf[js.Dynamic].applyDynamic("tuple")(v.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    inline def tuple(v: Record[String, Any | typings.ethers.typesAbiTypedMod.Typed], name: String): typings.ethers.typesAbiTypedMod.Typed = (^.asInstanceOf[js.Dynamic].applyDynamic("tuple")(v.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    
    inline def uint(v: BigNumberish): typings.ethers.typesAbiTypedMod.Typed = ^.asInstanceOf[js.Dynamic].applyDynamic("uint")(v.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    
    inline def uint104(v: BigNumberish): typings.ethers.typesAbiTypedMod.Typed = ^.asInstanceOf[js.Dynamic].applyDynamic("uint104")(v.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    
    inline def uint112(v: BigNumberish): typings.ethers.typesAbiTypedMod.Typed = ^.asInstanceOf[js.Dynamic].applyDynamic("uint112")(v.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    
    inline def uint120(v: BigNumberish): typings.ethers.typesAbiTypedMod.Typed = ^.asInstanceOf[js.Dynamic].applyDynamic("uint120")(v.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    
    inline def uint128(v: BigNumberish): typings.ethers.typesAbiTypedMod.Typed = ^.asInstanceOf[js.Dynamic].applyDynamic("uint128")(v.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    
    inline def uint136(v: BigNumberish): typings.ethers.typesAbiTypedMod.Typed = ^.asInstanceOf[js.Dynamic].applyDynamic("uint136")(v.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    
    inline def uint144(v: BigNumberish): typings.ethers.typesAbiTypedMod.Typed = ^.asInstanceOf[js.Dynamic].applyDynamic("uint144")(v.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    
    inline def uint152(v: BigNumberish): typings.ethers.typesAbiTypedMod.Typed = ^.asInstanceOf[js.Dynamic].applyDynamic("uint152")(v.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    
    inline def uint16(v: BigNumberish): typings.ethers.typesAbiTypedMod.Typed = ^.asInstanceOf[js.Dynamic].applyDynamic("uint16")(v.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    
    inline def uint160(v: BigNumberish): typings.ethers.typesAbiTypedMod.Typed = ^.asInstanceOf[js.Dynamic].applyDynamic("uint160")(v.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    
    inline def uint168(v: BigNumberish): typings.ethers.typesAbiTypedMod.Typed = ^.asInstanceOf[js.Dynamic].applyDynamic("uint168")(v.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    
    inline def uint176(v: BigNumberish): typings.ethers.typesAbiTypedMod.Typed = ^.asInstanceOf[js.Dynamic].applyDynamic("uint176")(v.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    
    inline def uint184(v: BigNumberish): typings.ethers.typesAbiTypedMod.Typed = ^.asInstanceOf[js.Dynamic].applyDynamic("uint184")(v.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    
    inline def uint192(v: BigNumberish): typings.ethers.typesAbiTypedMod.Typed = ^.asInstanceOf[js.Dynamic].applyDynamic("uint192")(v.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    
    inline def uint200(v: BigNumberish): typings.ethers.typesAbiTypedMod.Typed = ^.asInstanceOf[js.Dynamic].applyDynamic("uint200")(v.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    
    inline def uint208(v: BigNumberish): typings.ethers.typesAbiTypedMod.Typed = ^.asInstanceOf[js.Dynamic].applyDynamic("uint208")(v.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    
    inline def uint216(v: BigNumberish): typings.ethers.typesAbiTypedMod.Typed = ^.asInstanceOf[js.Dynamic].applyDynamic("uint216")(v.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    
    inline def uint224(v: BigNumberish): typings.ethers.typesAbiTypedMod.Typed = ^.asInstanceOf[js.Dynamic].applyDynamic("uint224")(v.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    
    inline def uint232(v: BigNumberish): typings.ethers.typesAbiTypedMod.Typed = ^.asInstanceOf[js.Dynamic].applyDynamic("uint232")(v.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    
    inline def uint24(v: BigNumberish): typings.ethers.typesAbiTypedMod.Typed = ^.asInstanceOf[js.Dynamic].applyDynamic("uint24")(v.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    
    inline def uint240(v: BigNumberish): typings.ethers.typesAbiTypedMod.Typed = ^.asInstanceOf[js.Dynamic].applyDynamic("uint240")(v.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    
    inline def uint248(v: BigNumberish): typings.ethers.typesAbiTypedMod.Typed = ^.asInstanceOf[js.Dynamic].applyDynamic("uint248")(v.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    
    inline def uint256(v: BigNumberish): typings.ethers.typesAbiTypedMod.Typed = ^.asInstanceOf[js.Dynamic].applyDynamic("uint256")(v.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    
    inline def uint32(v: BigNumberish): typings.ethers.typesAbiTypedMod.Typed = ^.asInstanceOf[js.Dynamic].applyDynamic("uint32")(v.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    
    inline def uint40(v: BigNumberish): typings.ethers.typesAbiTypedMod.Typed = ^.asInstanceOf[js.Dynamic].applyDynamic("uint40")(v.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    
    inline def uint48(v: BigNumberish): typings.ethers.typesAbiTypedMod.Typed = ^.asInstanceOf[js.Dynamic].applyDynamic("uint48")(v.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    
    inline def uint56(v: BigNumberish): typings.ethers.typesAbiTypedMod.Typed = ^.asInstanceOf[js.Dynamic].applyDynamic("uint56")(v.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    
    inline def uint64(v: BigNumberish): typings.ethers.typesAbiTypedMod.Typed = ^.asInstanceOf[js.Dynamic].applyDynamic("uint64")(v.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    
    inline def uint72(v: BigNumberish): typings.ethers.typesAbiTypedMod.Typed = ^.asInstanceOf[js.Dynamic].applyDynamic("uint72")(v.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    
    inline def uint8(v: BigNumberish): typings.ethers.typesAbiTypedMod.Typed = ^.asInstanceOf[js.Dynamic].applyDynamic("uint8")(v.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    
    inline def uint80(v: BigNumberish): typings.ethers.typesAbiTypedMod.Typed = ^.asInstanceOf[js.Dynamic].applyDynamic("uint80")(v.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    
    inline def uint88(v: BigNumberish): typings.ethers.typesAbiTypedMod.Typed = ^.asInstanceOf[js.Dynamic].applyDynamic("uint88")(v.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
    
    inline def uint96(v: BigNumberish): typings.ethers.typesAbiTypedMod.Typed = ^.asInstanceOf[js.Dynamic].applyDynamic("uint96")(v.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiTypedMod.Typed]
  }
  
  inline def checkResultErrors(result: typings.ethers.typesAbiCodersAbstractCoderMod.Result): js.Array[Error] = ^.asInstanceOf[js.Dynamic].applyDynamic("checkResultErrors")(result.asInstanceOf[js.Any]).asInstanceOf[js.Array[Error]]
  
  inline def decodeBytes32String(_bytes: BytesLike): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeBytes32String")(_bytes.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def encodeBytes32String(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeBytes32String")(text.asInstanceOf[js.Any]).asInstanceOf[String]
}
