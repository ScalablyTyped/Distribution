package typings.ethers.mod.ethers

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers", "ethers.FallbackFragment")
@js.native
open class FallbackFragment protected ()
  extends typings.ethers.typesEthersMod.FallbackFragment {
  def this(guard: Any, inputs: js.Array[typings.ethers.typesAbiFragmentsMod.ParamType], payable: Boolean) = this()
}
/* static members */
object FallbackFragment {
  
  @JSImport("ethers", "ethers.FallbackFragment")
  @js.native
  val ^ : js.Any = js.native
  
  inline def from(obj: Any): typings.ethers.typesAbiFragmentsMod.FallbackFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(obj.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiFragmentsMod.FallbackFragment]
  
  inline def isFragment(value: Any): /* is ethers.ethers/types/abi/fragments.FallbackFragment */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFragment")(value.asInstanceOf[js.Any]).asInstanceOf[/* is ethers.ethers/types/abi/fragments.FallbackFragment */ Boolean]
}
