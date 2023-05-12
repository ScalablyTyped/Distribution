package typings.ethers

import typings.ethers.ethersStrings.nonpayable
import typings.ethers.ethersStrings.pure
import typings.ethers.ethersStrings.view
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesAbiFragmentsMod {
  
  @JSImport("ethers/types/abi/fragments", "ConstructorFragment")
  @js.native
  open class ConstructorFragment protected () extends Fragment {
    /**
      *  @private
      */
    def this(guard: Any, `type`: FragmentType, inputs: js.Array[ParamType], payable: Boolean) = this()
    def this(guard: Any, `type`: FragmentType, inputs: js.Array[ParamType], payable: Boolean, gas: js.BigInt) = this()
    
    val gas: Null | js.BigInt = js.native
    
    val payable: Boolean = js.native
  }
  /* static members */
  object ConstructorFragment {
    
    @JSImport("ethers/types/abi/fragments", "ConstructorFragment")
    @js.native
    val ^ : js.Any = js.native
    
    inline def from(obj: Any): ConstructorFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(obj.asInstanceOf[js.Any]).asInstanceOf[ConstructorFragment]
    
    inline def isFragment(value: Any): /* is ethers.ethers/types/abi/fragments.ConstructorFragment */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFragment")(value.asInstanceOf[js.Any]).asInstanceOf[/* is ethers.ethers/types/abi/fragments.ConstructorFragment */ Boolean]
  }
  
  @JSImport("ethers/types/abi/fragments", "ErrorFragment")
  @js.native
  open class ErrorFragment protected () extends NamedFragment {
    /**
      *  @private
      */
    def this(guard: Any, name: String, inputs: js.Array[ParamType]) = this()
    
    /**
      *  The Custom Error selector.
      */
    def selector: String = js.native
  }
  /* static members */
  object ErrorFragment {
    
    @JSImport("ethers/types/abi/fragments", "ErrorFragment")
    @js.native
    val ^ : js.Any = js.native
    
    inline def from(obj: Any): ErrorFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(obj.asInstanceOf[js.Any]).asInstanceOf[ErrorFragment]
    
    inline def isFragment(value: Any): /* is ethers.ethers/types/abi/fragments.ErrorFragment */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFragment")(value.asInstanceOf[js.Any]).asInstanceOf[/* is ethers.ethers/types/abi/fragments.ErrorFragment */ Boolean]
  }
  
  @JSImport("ethers/types/abi/fragments", "EventFragment")
  @js.native
  open class EventFragment protected () extends NamedFragment {
    /**
      *  @private
      */
    def this(guard: Any, name: String, inputs: js.Array[ParamType], anonymous: Boolean) = this()
    
    val anonymous: Boolean = js.native
    
    /**
      *  The Event topic hash.
      */
    def topicHash: String = js.native
  }
  /* static members */
  object EventFragment {
    
    @JSImport("ethers/types/abi/fragments", "EventFragment")
    @js.native
    val ^ : js.Any = js.native
    
    inline def from(obj: Any): EventFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(obj.asInstanceOf[js.Any]).asInstanceOf[EventFragment]
    
    inline def getTopicHash(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTopicHash")(name.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def getTopicHash(name: String, params: js.Array[Any]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getTopicHash")(name.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def isFragment(value: Any): /* is ethers.ethers/types/abi/fragments.EventFragment */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFragment")(value.asInstanceOf[js.Any]).asInstanceOf[/* is ethers.ethers/types/abi/fragments.EventFragment */ Boolean]
  }
  
  @JSImport("ethers/types/abi/fragments", "FallbackFragment")
  @js.native
  open class FallbackFragment protected () extends Fragment {
    def this(guard: Any, inputs: js.Array[ParamType], payable: Boolean) = this()
    
    /**
      *  If the function can be sent value during invocation.
      */
    val payable: Boolean = js.native
  }
  /* static members */
  object FallbackFragment {
    
    @JSImport("ethers/types/abi/fragments", "FallbackFragment")
    @js.native
    val ^ : js.Any = js.native
    
    inline def from(obj: Any): FallbackFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(obj.asInstanceOf[js.Any]).asInstanceOf[FallbackFragment]
    
    inline def isFragment(value: Any): /* is ethers.ethers/types/abi/fragments.FallbackFragment */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFragment")(value.asInstanceOf[js.Any]).asInstanceOf[/* is ethers.ethers/types/abi/fragments.FallbackFragment */ Boolean]
  }
  
  /* note: abstract class */ @JSImport("ethers/types/abi/fragments", "Fragment")
  @js.native
  open class Fragment protected () extends StObject {
    /**
      *  @private
      */
    def this(guard: Any, `type`: FragmentType, inputs: js.Array[ParamType]) = this()
    
    /**
      *  Returns a string representation of this fragment.
      */
    def format(): String = js.native
    def format(format: FormatType): String = js.native
    
    /**
      *  The inputs for the fragment.
      */
    val inputs: js.Array[ParamType] = js.native
    
    /**
      *  The type of the fragment.
      */
    val `type`: FragmentType = js.native
  }
  /* static members */
  object Fragment {
    
    @JSImport("ethers/types/abi/fragments", "Fragment")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      *  Creates a new **Fragment** for %%obj%%, wich can be any supported
      *  ABI frgament type.
      */
    inline def from(obj: Any): Fragment = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(obj.asInstanceOf[js.Any]).asInstanceOf[Fragment]
    
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
  
  @JSImport("ethers/types/abi/fragments", "FunctionFragment")
  @js.native
  open class FunctionFragment protected () extends NamedFragment {
    /**
      *  @private
      */
    def this(
      guard: Any,
      name: String,
      stateMutability: typings.ethers.ethersStrings.payable | nonpayable | view | pure,
      inputs: js.Array[ParamType],
      outputs: js.Array[ParamType]
    ) = this()
    def this(
      guard: Any,
      name: String,
      stateMutability: typings.ethers.ethersStrings.payable | nonpayable | view | pure,
      inputs: js.Array[ParamType],
      outputs: js.Array[ParamType],
      gas: js.BigInt
    ) = this()
    
    /**
      *  If the function is constant (e.g. ``pure`` or ``view`` functions).
      */
    val constant: Boolean = js.native
    
    /**
      *  The amount of gas to send when calling this function
      */
    val gas: Null | js.BigInt = js.native
    
    /**
      *  The returned types for the result of calling this function.
      */
    val outputs: js.Array[ParamType] = js.native
    
    /**
      *  If the function can be sent value during invocation.
      */
    val payable: Boolean = js.native
    
    /**
      *  The Function selector.
      */
    def selector: String = js.native
    
    /**
      *  The state mutability (e.g. ``payable``, ``nonpayable``, ``view``
      *  or ``pure``)
      */
    val stateMutability: typings.ethers.ethersStrings.payable | nonpayable | view | pure = js.native
  }
  /* static members */
  object FunctionFragment {
    
    @JSImport("ethers/types/abi/fragments", "FunctionFragment")
    @js.native
    val ^ : js.Any = js.native
    
    inline def from(obj: Any): FunctionFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(obj.asInstanceOf[js.Any]).asInstanceOf[FunctionFragment]
    
    inline def getSelector(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSelector")(name.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def getSelector(name: String, params: js.Array[Any]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getSelector")(name.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def isFragment(value: Any): /* is ethers.ethers/types/abi/fragments.FunctionFragment */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFragment")(value.asInstanceOf[js.Any]).asInstanceOf[/* is ethers.ethers/types/abi/fragments.FunctionFragment */ Boolean]
  }
  
  /* note: abstract class */ @JSImport("ethers/types/abi/fragments", "NamedFragment")
  @js.native
  open class NamedFragment protected () extends Fragment {
    /**
      *  @private
      */
    def this(guard: Any, `type`: FragmentType, name: String, inputs: js.Array[ParamType]) = this()
    
    /**
      *  The name of the fragment.
      */
    val name: String = js.native
  }
  
  @JSImport("ethers/types/abi/fragments", "ParamType")
  @js.native
  open class ParamType protected () extends StObject {
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
      components: js.Array[ParamType]
    ) = this()
    def this(
      guard: Any,
      name: String,
      `type`: String,
      baseType: String,
      indexed: Null,
      components: js.Array[ParamType]
    ) = this()
    def this(
      guard: Any,
      name: String,
      `type`: String,
      baseType: String,
      indexed: Boolean,
      components: js.Array[ParamType],
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
      components: js.Array[ParamType],
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
      components: js.Array[ParamType],
      arrayLength: Double,
      arrayChildren: ParamType
    ) = this()
    def this(
      guard: Any,
      name: String,
      `type`: String,
      baseType: String,
      indexed: Boolean,
      components: js.Array[ParamType],
      arrayLength: Null,
      arrayChildren: ParamType
    ) = this()
    def this(
      guard: Any,
      name: String,
      `type`: String,
      baseType: String,
      indexed: Boolean,
      components: Null,
      arrayLength: Double,
      arrayChildren: ParamType
    ) = this()
    def this(
      guard: Any,
      name: String,
      `type`: String,
      baseType: String,
      indexed: Boolean,
      components: Null,
      arrayLength: Null,
      arrayChildren: ParamType
    ) = this()
    def this(
      guard: Any,
      name: String,
      `type`: String,
      baseType: String,
      indexed: Null,
      components: js.Array[ParamType],
      arrayLength: Double,
      arrayChildren: ParamType
    ) = this()
    def this(
      guard: Any,
      name: String,
      `type`: String,
      baseType: String,
      indexed: Null,
      components: js.Array[ParamType],
      arrayLength: Null,
      arrayChildren: ParamType
    ) = this()
    def this(
      guard: Any,
      name: String,
      `type`: String,
      baseType: String,
      indexed: Null,
      components: Null,
      arrayLength: Double,
      arrayChildren: ParamType
    ) = this()
    def this(
      guard: Any,
      name: String,
      `type`: String,
      baseType: String,
      indexed: Null,
      components: Null,
      arrayLength: Null,
      arrayChildren: ParamType
    ) = this()
    
    /**
      *  The type of each child in the array.
      *
      *  For non-array types this is ``null``.
      */
    val arrayChildren: Null | ParamType = js.native
    
    /**
      *  The array length, or ``-1`` for dynamic-lengthed arrays.
      *
      *  For non-array types this is ``null``.
      */
    val arrayLength: Null | Double = js.native
    
    /**
      *  The base type (e.g. ``"address"``, ``"tuple"``, ``"array"``)
      */
    val baseType: String = js.native
    
    /**
      *  The components for the tuple.
      *
      *  For non-tuple types this is ``null``.
      */
    val components: Null | js.Array[ParamType] = js.native
    
    /**
      *  Return a string representation of this type.
      *
      *  For example,
      *
      *  ``sighash" => "(uint256,address)"``
      *
      *  ``"minimal" => "tuple(uint256,address) indexed"``
      *
      *  ``"full" => "tuple(uint256 foo, address bar) indexed baz"``
      */
    def format(): String = js.native
    def format(format: FormatType): String = js.native
    
    /**
      *  True if the parameters is indexed.
      *
      *  For non-indexable types this is ``null``.
      */
    val indexed: Null | Boolean = js.native
    
    /**
      *  Returns true if %%this%% is an Array type.
      *
      *  This provides a type gaurd ensuring that [[arrayChildren]]
      *  and [[arrayLength]] are non-null.
      */
    def isArray(): /* is ethers.anon.ParamTypearrayChildrenPar */ Boolean = js.native
    
    /**
      *  Returns true if %%this%% is an Indexable type.
      *
      *  This provides a type gaurd ensuring that [[indexed]]
      *  is non-null.
      */
    def isIndexable(): /* is ethers.anon.ParamTypeindexedbooleanBaseType */ Boolean = js.native
    
    /**
      *  Returns true if %%this%% is a Tuple type.
      *
      *  This provides a type gaurd ensuring that [[components]]
      *  is non-null.
      */
    def isTuple(): /* is ethers.anon.ParamTypecomponentsReadonArrayLength */ Boolean = js.native
    
    /**
      *  The local name of the parameter (or ``""`` if unbound)
      */
    val name: String = js.native
    
    /* private */ var `private`: Any = js.native
    
    /**
      *  The fully qualified type (e.g. ``"address"``, ``"tuple(address)"``,
      *  ``"uint256[3][]"``)
      */
    val `type`: String = js.native
    
    /**
      *  Walks the **ParamType** with %%value%%, calling %%process%%
      *  on each type, destructing the %%value%% recursively.
      */
    def walk(value: Any, process: ParamTypeWalkFunc): Any = js.native
    
    /**
      *  Walks the **ParamType** with %%value%%, asynchronously calling
      *  %%process%% on each type, destructing the %%value%% recursively.
      *
      *  This can be used to resolve ENS naes by walking and resolving each
      *  ``"address"`` type.
      */
    def walkAsync(value: Any, process: ParamTypeWalkAsyncFunc): js.Promise[Any] = js.native
  }
  /* static members */
  object ParamType {
    
    @JSImport("ethers/types/abi/fragments", "ParamType")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      *  Creates a new **ParamType** for %%obj%%.
      *
      *  If %%allowIndexed%% then the ``indexed`` keyword is permitted,
      *  otherwise the ``indexed`` keyword will throw an error.
      */
    inline def from(obj: Any): ParamType = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(obj.asInstanceOf[js.Any]).asInstanceOf[ParamType]
    inline def from(obj: Any, allowIndexed: Boolean): ParamType = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(obj.asInstanceOf[js.Any], allowIndexed.asInstanceOf[js.Any])).asInstanceOf[ParamType]
    
    /**
      *  Returns true if %%value%% is a **ParamType**.
      */
    inline def isParamType(value: Any): /* is ethers.ethers/types/abi/fragments.ParamType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isParamType")(value.asInstanceOf[js.Any]).asInstanceOf[/* is ethers.ethers/types/abi/fragments.ParamType */ Boolean]
  }
  
  @JSImport("ethers/types/abi/fragments", "StructFragment")
  @js.native
  open class StructFragment protected () extends NamedFragment {
    /**
      *  @private
      */
    def this(guard: Any, name: String, inputs: js.Array[ParamType]) = this()
  }
  /* static members */
  object StructFragment {
    
    @JSImport("ethers/types/abi/fragments", "StructFragment")
    @js.native
    val ^ : js.Any = js.native
    
    inline def from(obj: Any): StructFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(obj.asInstanceOf[js.Any]).asInstanceOf[StructFragment]
    
    inline def isFragment(value: Any): /* is ethers.ethers/types/abi/fragments.FunctionFragment */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFragment")(value.asInstanceOf[js.Any]).asInstanceOf[/* is ethers.ethers/types/abi/fragments.FunctionFragment */ Boolean]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ethers.ethersStrings.sighash
    - typings.ethers.ethersStrings.minimal
    - typings.ethers.ethersStrings.full
    - typings.ethers.ethersStrings.json
  */
  trait FormatType extends StObject
  object FormatType {
    
    inline def full: typings.ethers.ethersStrings.full = "full".asInstanceOf[typings.ethers.ethersStrings.full]
    
    inline def json: typings.ethers.ethersStrings.json = "json".asInstanceOf[typings.ethers.ethersStrings.json]
    
    inline def minimal: typings.ethers.ethersStrings.minimal = "minimal".asInstanceOf[typings.ethers.ethersStrings.minimal]
    
    inline def sighash: typings.ethers.ethersStrings.sighash = "sighash".asInstanceOf[typings.ethers.ethersStrings.sighash]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ethers.ethersStrings.constructor
    - typings.ethers.ethersStrings.error
    - typings.ethers.ethersStrings.event
    - typings.ethers.ethersStrings.fallback
    - typings.ethers.ethersStrings.function
    - typings.ethers.ethersStrings.struct
  */
  trait FragmentType extends StObject
  object FragmentType {
    
    inline def constructor: typings.ethers.ethersStrings.constructor = "constructor".asInstanceOf[typings.ethers.ethersStrings.constructor]
    
    inline def error: typings.ethers.ethersStrings.error = "error".asInstanceOf[typings.ethers.ethersStrings.error]
    
    inline def event: typings.ethers.ethersStrings.event = "event".asInstanceOf[typings.ethers.ethersStrings.event]
    
    inline def fallback: typings.ethers.ethersStrings.fallback = "fallback".asInstanceOf[typings.ethers.ethersStrings.fallback]
    
    inline def function: typings.ethers.ethersStrings.function = "function".asInstanceOf[typings.ethers.ethersStrings.function]
    
    inline def struct: typings.ethers.ethersStrings.struct = "struct".asInstanceOf[typings.ethers.ethersStrings.struct]
  }
  
  trait JsonFragment extends StObject {
    
    /**
      *  If the event is anonymous.
      */
    val anonymous: js.UndefOr[Boolean] = js.undefined
    
    /**
      *  If the function is constant.
      */
    val constant: js.UndefOr[Boolean] = js.undefined
    
    /**
      *  The gas limit to use when sending a transaction for this function.
      */
    val gas: js.UndefOr[String] = js.undefined
    
    /**
      *  The input parameters.
      */
    val inputs: js.UndefOr[js.Array[JsonFragmentType]] = js.undefined
    
    /**
      *  The name of the error, event, function, etc.
      */
    val name: js.UndefOr[String] = js.undefined
    
    /**
      *  The output parameters.
      */
    val outputs: js.UndefOr[js.Array[JsonFragmentType]] = js.undefined
    
    /**
      *  If the function is payable.
      */
    val payable: js.UndefOr[Boolean] = js.undefined
    
    /**
      *  The mutability state of the function.
      */
    val stateMutability: js.UndefOr[String] = js.undefined
    
    /**
      *  The type of the fragment (e.g. ``event``, ``"function"``, etc.)
      */
    val `type`: js.UndefOr[String] = js.undefined
  }
  object JsonFragment {
    
    inline def apply(): JsonFragment = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JsonFragment]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JsonFragment] (val x: Self) extends AnyVal {
      
      inline def setAnonymous(value: Boolean): Self = StObject.set(x, "anonymous", value.asInstanceOf[js.Any])
      
      inline def setAnonymousUndefined: Self = StObject.set(x, "anonymous", js.undefined)
      
      inline def setConstant(value: Boolean): Self = StObject.set(x, "constant", value.asInstanceOf[js.Any])
      
      inline def setConstantUndefined: Self = StObject.set(x, "constant", js.undefined)
      
      inline def setGas(value: String): Self = StObject.set(x, "gas", value.asInstanceOf[js.Any])
      
      inline def setGasUndefined: Self = StObject.set(x, "gas", js.undefined)
      
      inline def setInputs(value: js.Array[JsonFragmentType]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
      
      inline def setInputsUndefined: Self = StObject.set(x, "inputs", js.undefined)
      
      inline def setInputsVarargs(value: JsonFragmentType*): Self = StObject.set(x, "inputs", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOutputs(value: js.Array[JsonFragmentType]): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
      
      inline def setOutputsUndefined: Self = StObject.set(x, "outputs", js.undefined)
      
      inline def setOutputsVarargs(value: JsonFragmentType*): Self = StObject.set(x, "outputs", js.Array(value*))
      
      inline def setPayable(value: Boolean): Self = StObject.set(x, "payable", value.asInstanceOf[js.Any])
      
      inline def setPayableUndefined: Self = StObject.set(x, "payable", js.undefined)
      
      inline def setStateMutability(value: String): Self = StObject.set(x, "stateMutability", value.asInstanceOf[js.Any])
      
      inline def setStateMutabilityUndefined: Self = StObject.set(x, "stateMutability", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait JsonFragmentType extends StObject {
    
    /**
      *  The components for a tuple.
      */
    val components: js.UndefOr[js.Array[JsonFragmentType]] = js.undefined
    
    /**
      *  If the parameter is indexed.
      */
    val indexed: js.UndefOr[Boolean] = js.undefined
    
    /**
      *  The internal Solidity type.
      */
    val internalType: js.UndefOr[String] = js.undefined
    
    /**
      *  The parameter name.
      */
    val name: js.UndefOr[String] = js.undefined
    
    /**
      *  The type of the parameter.
      */
    val `type`: js.UndefOr[String] = js.undefined
  }
  object JsonFragmentType {
    
    inline def apply(): JsonFragmentType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JsonFragmentType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JsonFragmentType] (val x: Self) extends AnyVal {
      
      inline def setComponents(value: js.Array[JsonFragmentType]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
      
      inline def setComponentsVarargs(value: JsonFragmentType*): Self = StObject.set(x, "components", js.Array(value*))
      
      inline def setIndexed(value: Boolean): Self = StObject.set(x, "indexed", value.asInstanceOf[js.Any])
      
      inline def setIndexedUndefined: Self = StObject.set(x, "indexed", js.undefined)
      
      inline def setInternalType(value: String): Self = StObject.set(x, "internalType", value.asInstanceOf[js.Any])
      
      inline def setInternalTypeUndefined: Self = StObject.set(x, "internalType", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  type ParamTypeWalkAsyncFunc = js.Function2[/* type */ String, /* value */ Any, Any | js.Promise[Any]]
  
  type ParamTypeWalkFunc = js.Function2[/* type */ String, /* value */ Any, Any]
}
