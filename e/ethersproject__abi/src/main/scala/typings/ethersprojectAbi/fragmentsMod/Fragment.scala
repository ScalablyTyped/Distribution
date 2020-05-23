package typings.ethersprojectAbi.fragmentsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ethersproject/abi/lib/fragments", "Fragment")
@js.native
abstract class Fragment protected () extends js.Object {
  def this(constructorGuard: js.Any, params: js.Any) = this()
  val _isFragment: Boolean = js.native
  val inputs: js.Array[ParamType] = js.native
  val name: String = js.native
  val `type`: String = js.native
  def format(): String = js.native
  def format(format: String): String = js.native
}

/* static members */
@JSImport("@ethersproject/abi/lib/fragments", "Fragment")
@js.native
object Fragment extends js.Object {
  def from(value: String): Fragment = js.native
  def from(value: Fragment): Fragment = js.native
  def from(value: JsonFragment): Fragment = js.native
  def fromObject(value: Fragment): Fragment = js.native
  def fromObject(value: JsonFragment): Fragment = js.native
  def fromString(value: String): Fragment = js.native
  def isFragment(value: js.Any): /* is @ethersproject/abi.@ethersproject/abi/lib/fragments.Fragment */ Boolean = js.native
}

