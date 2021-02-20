package typings.ethersprojectAbi

import typings.ethersprojectBignumber.mod.BigNumber
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fragmentsMod {
  
  @JSImport("@ethersproject/abi/lib/fragments", "ConstructorFragment")
  @js.native
  class ConstructorFragment protected () extends Fragment {
    def this(constructorGuard: js.Any, params: js.Any) = this()
    
    var gas: js.UndefOr[BigNumber] = js.native
    
    var payable: Boolean = js.native
    
    var stateMutability: String = js.native
  }
  /* static members */
  object ConstructorFragment {
    
    @JSImport("@ethersproject/abi/lib/fragments", "ConstructorFragment.from")
    @js.native
    def from(value: String): ConstructorFragment = js.native
    @JSImport("@ethersproject/abi/lib/fragments", "ConstructorFragment.from")
    @js.native
    def from(value: ConstructorFragment): ConstructorFragment = js.native
    @JSImport("@ethersproject/abi/lib/fragments", "ConstructorFragment.from")
    @js.native
    def from(value: JsonFragment): ConstructorFragment = js.native
    
    @JSImport("@ethersproject/abi/lib/fragments", "ConstructorFragment.fromObject")
    @js.native
    def fromObject(value: ConstructorFragment): ConstructorFragment = js.native
    @JSImport("@ethersproject/abi/lib/fragments", "ConstructorFragment.fromObject")
    @js.native
    def fromObject(value: JsonFragment): ConstructorFragment = js.native
    
    @JSImport("@ethersproject/abi/lib/fragments", "ConstructorFragment.fromString")
    @js.native
    def fromString(value: String): ConstructorFragment = js.native
    
    @JSImport("@ethersproject/abi/lib/fragments", "ConstructorFragment.isConstructorFragment")
    @js.native
    def isConstructorFragment(value: js.Any): /* is @ethersproject/abi.@ethersproject/abi/lib/fragments.ConstructorFragment */ Boolean = js.native
  }
  
  @JSImport("@ethersproject/abi/lib/fragments", "EventFragment")
  @js.native
  class EventFragment protected () extends Fragment {
    def this(constructorGuard: js.Any, params: js.Any) = this()
    
    val anonymous: Boolean = js.native
  }
  /* static members */
  object EventFragment {
    
    @JSImport("@ethersproject/abi/lib/fragments", "EventFragment.from")
    @js.native
    def from(value: String): EventFragment = js.native
    @JSImport("@ethersproject/abi/lib/fragments", "EventFragment.from")
    @js.native
    def from(value: EventFragment): EventFragment = js.native
    @JSImport("@ethersproject/abi/lib/fragments", "EventFragment.from")
    @js.native
    def from(value: JsonFragment): EventFragment = js.native
    
    @JSImport("@ethersproject/abi/lib/fragments", "EventFragment.fromObject")
    @js.native
    def fromObject(value: EventFragment): EventFragment = js.native
    @JSImport("@ethersproject/abi/lib/fragments", "EventFragment.fromObject")
    @js.native
    def fromObject(value: JsonFragment): EventFragment = js.native
    
    @JSImport("@ethersproject/abi/lib/fragments", "EventFragment.fromString")
    @js.native
    def fromString(value: String): EventFragment = js.native
    
    @JSImport("@ethersproject/abi/lib/fragments", "EventFragment.isEventFragment")
    @js.native
    def isEventFragment(value: js.Any): /* is @ethersproject/abi.@ethersproject/abi/lib/fragments.EventFragment */ Boolean = js.native
  }
  
  @JSImport("@ethersproject/abi/lib/fragments", "Fragment")
  @js.native
  abstract class Fragment protected () extends StObject {
    def this(constructorGuard: js.Any, params: js.Any) = this()
    
    val _isFragment: Boolean = js.native
    
    def format(): String = js.native
    def format(format: String): String = js.native
    
    val inputs: js.Array[ParamType] = js.native
    
    val name: String = js.native
    
    val `type`: String = js.native
  }
  /* static members */
  object Fragment {
    
    @JSImport("@ethersproject/abi/lib/fragments", "Fragment.from")
    @js.native
    def from(value: String): Fragment = js.native
    @JSImport("@ethersproject/abi/lib/fragments", "Fragment.from")
    @js.native
    def from(value: Fragment): Fragment = js.native
    @JSImport("@ethersproject/abi/lib/fragments", "Fragment.from")
    @js.native
    def from(value: JsonFragment): Fragment = js.native
    
    @JSImport("@ethersproject/abi/lib/fragments", "Fragment.fromObject")
    @js.native
    def fromObject(value: Fragment): Fragment = js.native
    @JSImport("@ethersproject/abi/lib/fragments", "Fragment.fromObject")
    @js.native
    def fromObject(value: JsonFragment): Fragment = js.native
    
    @JSImport("@ethersproject/abi/lib/fragments", "Fragment.fromString")
    @js.native
    def fromString(value: String): Fragment = js.native
    
    @JSImport("@ethersproject/abi/lib/fragments", "Fragment.isFragment")
    @js.native
    def isFragment(value: js.Any): /* is @ethersproject/abi.@ethersproject/abi/lib/fragments.Fragment */ Boolean = js.native
  }
  
  @JSImport("@ethersproject/abi/lib/fragments", "FunctionFragment")
  @js.native
  class FunctionFragment protected () extends ConstructorFragment {
    def this(constructorGuard: js.Any, params: js.Any) = this()
    
    var constant: Boolean = js.native
    
    var outputs: js.UndefOr[js.Array[ParamType]] = js.native
  }
  /* static members */
  object FunctionFragment {
    
    @JSImport("@ethersproject/abi/lib/fragments", "FunctionFragment.from")
    @js.native
    def from(value: String): FunctionFragment = js.native
    @JSImport("@ethersproject/abi/lib/fragments", "FunctionFragment.from")
    @js.native
    def from(value: FunctionFragment): FunctionFragment = js.native
    @JSImport("@ethersproject/abi/lib/fragments", "FunctionFragment.from")
    @js.native
    def from(value: JsonFragment): FunctionFragment = js.native
    
    @JSImport("@ethersproject/abi/lib/fragments", "FunctionFragment.fromObject")
    @js.native
    def fromObject(value: FunctionFragment): FunctionFragment = js.native
    @JSImport("@ethersproject/abi/lib/fragments", "FunctionFragment.fromObject")
    @js.native
    def fromObject(value: JsonFragment): FunctionFragment = js.native
    
    @JSImport("@ethersproject/abi/lib/fragments", "FunctionFragment.fromString")
    @js.native
    def fromString(value: String): FunctionFragment = js.native
    
    @JSImport("@ethersproject/abi/lib/fragments", "FunctionFragment.isFunctionFragment")
    @js.native
    def isFunctionFragment(value: js.Any): /* is @ethersproject/abi.@ethersproject/abi/lib/fragments.FunctionFragment */ Boolean = js.native
  }
  
  @JSImport("@ethersproject/abi/lib/fragments", "ParamType")
  @js.native
  class ParamType protected () extends StObject {
    def this(constructorGuard: js.Any, params: js.Any) = this()
    
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
    
    @JSImport("@ethersproject/abi/lib/fragments", "ParamType.from")
    @js.native
    def from(value: String): ParamType = js.native
    @JSImport("@ethersproject/abi/lib/fragments", "ParamType.from")
    @js.native
    def from(value: String, allowIndexed: Boolean): ParamType = js.native
    @JSImport("@ethersproject/abi/lib/fragments", "ParamType.from")
    @js.native
    def from(value: JsonFragmentType): ParamType = js.native
    @JSImport("@ethersproject/abi/lib/fragments", "ParamType.from")
    @js.native
    def from(value: JsonFragmentType, allowIndexed: Boolean): ParamType = js.native
    @JSImport("@ethersproject/abi/lib/fragments", "ParamType.from")
    @js.native
    def from(value: ParamType): ParamType = js.native
    @JSImport("@ethersproject/abi/lib/fragments", "ParamType.from")
    @js.native
    def from(value: ParamType, allowIndexed: Boolean): ParamType = js.native
    
    @JSImport("@ethersproject/abi/lib/fragments", "ParamType.fromObject")
    @js.native
    def fromObject(value: JsonFragmentType): ParamType = js.native
    @JSImport("@ethersproject/abi/lib/fragments", "ParamType.fromObject")
    @js.native
    def fromObject(value: ParamType): ParamType = js.native
    
    @JSImport("@ethersproject/abi/lib/fragments", "ParamType.fromString")
    @js.native
    def fromString(value: String): ParamType = js.native
    @JSImport("@ethersproject/abi/lib/fragments", "ParamType.fromString")
    @js.native
    def fromString(value: String, allowIndexed: Boolean): ParamType = js.native
    
    @JSImport("@ethersproject/abi/lib/fragments", "ParamType.isParamType")
    @js.native
    def isParamType(value: js.Any): /* is @ethersproject/abi.@ethersproject/abi/lib/fragments.ParamType */ Boolean = js.native
  }
  
  @js.native
  trait JsonFragment extends StObject {
    
    var anonymous: js.UndefOr[Boolean] = js.native
    
    var constant: js.UndefOr[Boolean] = js.native
    
    var gas: js.UndefOr[String] = js.native
    
    var inputs: js.UndefOr[js.Array[JsonFragmentType]] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var outputs: js.UndefOr[js.Array[JsonFragmentType]] = js.native
    
    var payable: js.UndefOr[Boolean] = js.native
    
    var stateMutability: js.UndefOr[String] = js.native
    
    var `type`: js.UndefOr[String] = js.native
  }
  object JsonFragment {
    
    @scala.inline
    def apply(): JsonFragment = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JsonFragment]
    }
    
    @scala.inline
    implicit class JsonFragmentMutableBuilder[Self <: JsonFragment] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnonymous(value: Boolean): Self = StObject.set(x, "anonymous", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnonymousUndefined: Self = StObject.set(x, "anonymous", js.undefined)
      
      @scala.inline
      def setConstant(value: Boolean): Self = StObject.set(x, "constant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConstantUndefined: Self = StObject.set(x, "constant", js.undefined)
      
      @scala.inline
      def setGas(value: String): Self = StObject.set(x, "gas", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGasUndefined: Self = StObject.set(x, "gas", js.undefined)
      
      @scala.inline
      def setInputs(value: js.Array[JsonFragmentType]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputsUndefined: Self = StObject.set(x, "inputs", js.undefined)
      
      @scala.inline
      def setInputsVarargs(value: JsonFragmentType*): Self = StObject.set(x, "inputs", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOutputs(value: js.Array[JsonFragmentType]): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputsUndefined: Self = StObject.set(x, "outputs", js.undefined)
      
      @scala.inline
      def setOutputsVarargs(value: JsonFragmentType*): Self = StObject.set(x, "outputs", js.Array(value :_*))
      
      @scala.inline
      def setPayable(value: Boolean): Self = StObject.set(x, "payable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayableUndefined: Self = StObject.set(x, "payable", js.undefined)
      
      @scala.inline
      def setStateMutability(value: String): Self = StObject.set(x, "stateMutability", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateMutabilityUndefined: Self = StObject.set(x, "stateMutability", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait JsonFragmentType extends StObject {
    
    var components: js.UndefOr[js.Array[JsonFragmentType]] = js.native
    
    var indexed: js.UndefOr[Boolean] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var `type`: js.UndefOr[String] = js.native
  }
  object JsonFragmentType {
    
    @scala.inline
    def apply(): JsonFragmentType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JsonFragmentType]
    }
    
    @scala.inline
    implicit class JsonFragmentTypeMutableBuilder[Self <: JsonFragmentType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComponents(value: js.Array[JsonFragmentType]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
      
      @scala.inline
      def setComponentsVarargs(value: JsonFragmentType*): Self = StObject.set(x, "components", js.Array(value :_*))
      
      @scala.inline
      def setIndexed(value: Boolean): Self = StObject.set(x, "indexed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexedUndefined: Self = StObject.set(x, "indexed", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
