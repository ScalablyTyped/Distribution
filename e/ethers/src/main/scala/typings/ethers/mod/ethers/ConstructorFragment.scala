package typings.ethers.mod.ethers

import typings.ethers.typesAbiFragmentsMod.FragmentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers", "ethers.ConstructorFragment")
@js.native
open class ConstructorFragment protected ()
  extends typings.ethers.typesEthersMod.ConstructorFragment {
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
  
  @JSImport("ethers", "ethers.ConstructorFragment")
  @js.native
  val ^ : js.Any = js.native
  
  inline def from(obj: Any): typings.ethers.typesAbiFragmentsMod.ConstructorFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(obj.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiFragmentsMod.ConstructorFragment]
  
  inline def isFragment(value: Any): /* is ethers.ethers/types/abi/fragments.ConstructorFragment */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFragment")(value.asInstanceOf[js.Any]).asInstanceOf[/* is ethers.ethers/types/abi/fragments.ConstructorFragment */ Boolean]
}
