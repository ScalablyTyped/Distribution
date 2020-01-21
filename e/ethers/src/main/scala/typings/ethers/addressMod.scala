package typings.ethers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethers/dist/types/utils/address", JSImport.Namespace)
@js.native
object addressMod extends js.Object {
  def getAddress(address: String): String = js.native
  def getContractAddress(transaction: AnonFrom): String = js.native
  def getIcapAddress(address: String): String = js.native
}

