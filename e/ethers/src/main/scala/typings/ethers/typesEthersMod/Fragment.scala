package typings.ethers.typesEthersMod

import typings.ethers.typesAbiFragmentsMod.FragmentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("ethers/types/ethers", "Fragment")
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
  
  @JSImport("ethers/types/ethers", "Fragment")
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
