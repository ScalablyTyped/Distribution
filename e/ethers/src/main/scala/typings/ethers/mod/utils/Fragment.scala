package typings.ethers.mod.utils

import typings.ethersprojectAbi.fragmentsMod.JsonFragment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers", "utils.Fragment")
@js.native
abstract class Fragment protected ()
  extends typings.ethers.utilsMod.Fragment {
  def this(constructorGuard: js.Any, params: js.Any) = this()
}
/* static members */
@JSImport("ethers", "utils.Fragment")
@js.native
object Fragment extends js.Object {
  
  def from(value: String): typings.ethersprojectAbi.fragmentsMod.Fragment = js.native
  def from(value: typings.ethersprojectAbi.fragmentsMod.Fragment): typings.ethersprojectAbi.fragmentsMod.Fragment = js.native
  def from(value: JsonFragment): typings.ethersprojectAbi.fragmentsMod.Fragment = js.native
  
  def fromObject(value: typings.ethersprojectAbi.fragmentsMod.Fragment): typings.ethersprojectAbi.fragmentsMod.Fragment = js.native
  def fromObject(value: JsonFragment): typings.ethersprojectAbi.fragmentsMod.Fragment = js.native
  
  def fromString(value: String): typings.ethersprojectAbi.fragmentsMod.Fragment = js.native
  
  def isFragment(value: js.Any): /* is @ethersproject/abi.@ethersproject/abi/lib/fragments.Fragment */ Boolean = js.native
}
