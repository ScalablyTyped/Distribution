package typings.ethers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethers/dist/types/utils/json-wallet", JSImport.Namespace)
@js.native
object jsonWalletMod extends js.Object {
  def getJsonWalletAddress(json: String): String = js.native
  def isCrowdsaleWallet(json: String): Boolean = js.native
  def isSecretStorageWallet(json: String): Boolean = js.native
}

