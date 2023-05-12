package typings.ethers.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers", "StructFragment")
@js.native
open class StructFragment protected ()
  extends typings.ethers.typesEthersMod.StructFragment {
  /**
    *  @private
    */
  def this(guard: Any, name: String, inputs: js.Array[typings.ethers.typesAbiFragmentsMod.ParamType]) = this()
}
/* static members */
object StructFragment {
  
  @JSImport("ethers", "StructFragment")
  @js.native
  val ^ : js.Any = js.native
  
  inline def from(obj: Any): typings.ethers.typesAbiFragmentsMod.StructFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(obj.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiFragmentsMod.StructFragment]
  
  inline def isFragment(value: Any): /* is ethers.ethers/types/abi/fragments.FunctionFragment */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFragment")(value.asInstanceOf[js.Any]).asInstanceOf[/* is ethers.ethers/types/abi/fragments.FunctionFragment */ Boolean]
}
