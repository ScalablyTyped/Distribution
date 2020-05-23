package typings.ethersprojectAbi.fragmentsMod

import typings.ethersprojectBignumber.mod.BigNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ethersproject/abi/lib/fragments", "ConstructorFragment")
@js.native
class ConstructorFragment () extends Fragment {
  var gas: js.UndefOr[BigNumber] = js.native
  var payable: Boolean = js.native
  var stateMutability: String = js.native
}

/* static members */
@JSImport("@ethersproject/abi/lib/fragments", "ConstructorFragment")
@js.native
object ConstructorFragment extends js.Object {
  def from(value: String): ConstructorFragment = js.native
  def from(value: ConstructorFragment): ConstructorFragment = js.native
  def from(value: JsonFragment): ConstructorFragment = js.native
  def fromObject(value: ConstructorFragment): ConstructorFragment = js.native
  def fromObject(value: JsonFragment): ConstructorFragment = js.native
  def fromString(value: String): ConstructorFragment = js.native
  def isConstructorFragment(value: js.Any): /* is @ethersproject/abi.@ethersproject/abi/lib/fragments.ConstructorFragment */ Boolean = js.native
}

