package typings.ethersprojectAbi

import typings.ethersprojectBignumber.mod.BigNumber
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFragmentsMod {
  
  @JSImport("@ethersproject/abi/lib/fragments", "ConstructorFragment")
  @js.native
  open class ConstructorFragment protected () extends Fragment {
    def this(constructorGuard: Any, params: Any) = this()
    
    var gas: js.UndefOr[BigNumber] = js.native
    
    var payable: Boolean = js.native
    
    var stateMutability: String = js.native
  }
  /* static members */
  object ConstructorFragment {
    
    @JSImport("@ethersproject/abi/lib/fragments", "ConstructorFragment")
    @js.native
    val ^ : js.Any = js.native
    
    inline def from(value: String): ConstructorFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any]).asInstanceOf[ConstructorFragment]
    inline def from(value: ConstructorFragment): ConstructorFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any]).asInstanceOf[ConstructorFragment]
    inline def from(value: JsonFragment): ConstructorFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any]).asInstanceOf[ConstructorFragment]
    
    inline def fromObject(value: ConstructorFragment): ConstructorFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(value.asInstanceOf[js.Any]).asInstanceOf[ConstructorFragment]
    inline def fromObject(value: JsonFragment): ConstructorFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(value.asInstanceOf[js.Any]).asInstanceOf[ConstructorFragment]
    
    inline def fromString(value: String): ConstructorFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(value.asInstanceOf[js.Any]).asInstanceOf[ConstructorFragment]
    
    inline def isConstructorFragment(value: Any): /* is @ethersproject/abi.@ethersproject/abi/lib/fragments.ConstructorFragment */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isConstructorFragment")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @ethersproject/abi.@ethersproject/abi/lib/fragments.ConstructorFragment */ Boolean]
  }
  
  @JSImport("@ethersproject/abi/lib/fragments", "ErrorFragment")
  @js.native
  open class ErrorFragment protected () extends Fragment {
    def this(constructorGuard: Any, params: Any) = this()
  }
  /* static members */
  object ErrorFragment {
    
    @JSImport("@ethersproject/abi/lib/fragments", "ErrorFragment")
    @js.native
    val ^ : js.Any = js.native
    
    inline def from(value: String): ErrorFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any]).asInstanceOf[ErrorFragment]
    inline def from(value: ErrorFragment): ErrorFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any]).asInstanceOf[ErrorFragment]
    inline def from(value: JsonFragment): ErrorFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any]).asInstanceOf[ErrorFragment]
    
    inline def fromObject(value: ErrorFragment): ErrorFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(value.asInstanceOf[js.Any]).asInstanceOf[ErrorFragment]
    inline def fromObject(value: JsonFragment): ErrorFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(value.asInstanceOf[js.Any]).asInstanceOf[ErrorFragment]
    
    inline def fromString(value: String): ErrorFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(value.asInstanceOf[js.Any]).asInstanceOf[ErrorFragment]
    
    inline def isErrorFragment(value: Any): /* is @ethersproject/abi.@ethersproject/abi/lib/fragments.ErrorFragment */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isErrorFragment")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @ethersproject/abi.@ethersproject/abi/lib/fragments.ErrorFragment */ Boolean]
  }
  
  @JSImport("@ethersproject/abi/lib/fragments", "EventFragment")
  @js.native
  open class EventFragment protected () extends Fragment {
    def this(constructorGuard: Any, params: Any) = this()
    
    val anonymous: Boolean = js.native
  }
  /* static members */
  object EventFragment {
    
    @JSImport("@ethersproject/abi/lib/fragments", "EventFragment")
    @js.native
    val ^ : js.Any = js.native
    
    inline def from(value: String): EventFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any]).asInstanceOf[EventFragment]
    inline def from(value: EventFragment): EventFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any]).asInstanceOf[EventFragment]
    inline def from(value: JsonFragment): EventFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any]).asInstanceOf[EventFragment]
    
    inline def fromObject(value: EventFragment): EventFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(value.asInstanceOf[js.Any]).asInstanceOf[EventFragment]
    inline def fromObject(value: JsonFragment): EventFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(value.asInstanceOf[js.Any]).asInstanceOf[EventFragment]
    
    inline def fromString(value: String): EventFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(value.asInstanceOf[js.Any]).asInstanceOf[EventFragment]
    
    inline def isEventFragment(value: Any): /* is @ethersproject/abi.@ethersproject/abi/lib/fragments.EventFragment */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEventFragment")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @ethersproject/abi.@ethersproject/abi/lib/fragments.EventFragment */ Boolean]
  }
  
  /* note: abstract class */ @JSImport("@ethersproject/abi/lib/fragments", "Fragment")
  @js.native
  open class Fragment protected () extends StObject {
    def this(constructorGuard: Any, params: Any) = this()
    
    val _isFragment: Boolean = js.native
    
    def format(): String = js.native
    def format(format: String): String = js.native
    
    val inputs: js.Array[ParamType] = js.native
    
    val name: String = js.native
    
    val `type`: String = js.native
  }
  /* static members */
  object Fragment {
    
    @JSImport("@ethersproject/abi/lib/fragments", "Fragment")
    @js.native
    val ^ : js.Any = js.native
    
    inline def from(value: String): Fragment = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any]).asInstanceOf[Fragment]
    inline def from(value: Fragment): Fragment = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any]).asInstanceOf[Fragment]
    inline def from(value: JsonFragment): Fragment = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any]).asInstanceOf[Fragment]
    
    inline def fromObject(value: Fragment): Fragment = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(value.asInstanceOf[js.Any]).asInstanceOf[Fragment]
    inline def fromObject(value: JsonFragment): Fragment = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(value.asInstanceOf[js.Any]).asInstanceOf[Fragment]
    
    inline def fromString(value: String): Fragment = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(value.asInstanceOf[js.Any]).asInstanceOf[Fragment]
    
    inline def isFragment(value: Any): /* is @ethersproject/abi.@ethersproject/abi/lib/fragments.Fragment */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFragment")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @ethersproject/abi.@ethersproject/abi/lib/fragments.Fragment */ Boolean]
  }
  
  @JSImport("@ethersproject/abi/lib/fragments", "FunctionFragment")
  @js.native
  open class FunctionFragment protected () extends ConstructorFragment {
    def this(constructorGuard: Any, params: Any) = this()
    
    var constant: Boolean = js.native
    
    var outputs: js.UndefOr[js.Array[ParamType]] = js.native
  }
  /* static members */
  object FunctionFragment {
    
    @JSImport("@ethersproject/abi/lib/fragments", "FunctionFragment")
    @js.native
    val ^ : js.Any = js.native
    
    inline def from(value: String): FunctionFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any]).asInstanceOf[FunctionFragment]
    inline def from(value: FunctionFragment): FunctionFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any]).asInstanceOf[FunctionFragment]
    inline def from(value: JsonFragment): FunctionFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any]).asInstanceOf[FunctionFragment]
    
    inline def fromObject(value: FunctionFragment): FunctionFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(value.asInstanceOf[js.Any]).asInstanceOf[FunctionFragment]
    inline def fromObject(value: JsonFragment): FunctionFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(value.asInstanceOf[js.Any]).asInstanceOf[FunctionFragment]
    
    inline def fromString(value: String): FunctionFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(value.asInstanceOf[js.Any]).asInstanceOf[FunctionFragment]
    
    inline def isFunctionFragment(value: Any): /* is @ethersproject/abi.@ethersproject/abi/lib/fragments.FunctionFragment */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunctionFragment")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @ethersproject/abi.@ethersproject/abi/lib/fragments.FunctionFragment */ Boolean]
  }
  
  @JSImport("@ethersproject/abi/lib/fragments", "ParamType")
  @js.native
  open class ParamType protected () extends StObject {
    def this(constructorGuard: Any, params: Any) = this()
    
    val _isParamType: Boolean = js.native
    
    val arrayChildren: ParamType = js.native
    
    val arrayLength: Double = js.native
    
    val baseType: String = js.native
    
    val components: js.Array[ParamType] = js.native
    
    def format(): String = js.native
    def format(format: String): String = js.native
    
    val indexed: Boolean = js.native
    
    val name: String = js.native
    
    val `type`: String = js.native
  }
  /* static members */
  object ParamType {
    
    @JSImport("@ethersproject/abi/lib/fragments", "ParamType")
    @js.native
    val ^ : js.Any = js.native
    
    inline def from(value: String): ParamType = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any]).asInstanceOf[ParamType]
    inline def from(value: String, allowIndexed: Boolean): ParamType = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any], allowIndexed.asInstanceOf[js.Any])).asInstanceOf[ParamType]
    inline def from(value: JsonFragmentType): ParamType = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any]).asInstanceOf[ParamType]
    inline def from(value: JsonFragmentType, allowIndexed: Boolean): ParamType = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any], allowIndexed.asInstanceOf[js.Any])).asInstanceOf[ParamType]
    inline def from(value: ParamType): ParamType = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any]).asInstanceOf[ParamType]
    inline def from(value: ParamType, allowIndexed: Boolean): ParamType = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any], allowIndexed.asInstanceOf[js.Any])).asInstanceOf[ParamType]
    
    inline def fromObject(value: JsonFragmentType): ParamType = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(value.asInstanceOf[js.Any]).asInstanceOf[ParamType]
    inline def fromObject(value: ParamType): ParamType = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(value.asInstanceOf[js.Any]).asInstanceOf[ParamType]
    
    inline def fromString(value: String): ParamType = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(value.asInstanceOf[js.Any]).asInstanceOf[ParamType]
    inline def fromString(value: String, allowIndexed: Boolean): ParamType = (^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(value.asInstanceOf[js.Any], allowIndexed.asInstanceOf[js.Any])).asInstanceOf[ParamType]
    
    inline def isParamType(value: Any): /* is @ethersproject/abi.@ethersproject/abi/lib/fragments.ParamType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isParamType")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @ethersproject/abi.@ethersproject/abi/lib/fragments.ParamType */ Boolean]
  }
  
  trait JsonFragment extends StObject {
    
    val anonymous: js.UndefOr[Boolean] = js.undefined
    
    val constant: js.UndefOr[Boolean] = js.undefined
    
    val gas: js.UndefOr[String] = js.undefined
    
    val inputs: js.UndefOr[js.Array[JsonFragmentType]] = js.undefined
    
    val name: js.UndefOr[String] = js.undefined
    
    val outputs: js.UndefOr[js.Array[JsonFragmentType]] = js.undefined
    
    val payable: js.UndefOr[Boolean] = js.undefined
    
    val stateMutability: js.UndefOr[String] = js.undefined
    
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
    
    val components: js.UndefOr[js.Array[JsonFragmentType]] = js.undefined
    
    val indexed: js.UndefOr[Boolean] = js.undefined
    
    val internalType: js.UndefOr[Any] = js.undefined
    
    val name: js.UndefOr[String] = js.undefined
    
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
      
      inline def setInternalType(value: Any): Self = StObject.set(x, "internalType", value.asInstanceOf[js.Any])
      
      inline def setInternalTypeUndefined: Self = StObject.set(x, "internalType", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
