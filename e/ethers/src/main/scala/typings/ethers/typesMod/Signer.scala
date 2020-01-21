package typings.ethers.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethers/dist/types/utils/types", "Signer")
@js.native
abstract class Signer () extends js.Object {
  var provider: js.UndefOr[MinimalProvider] = js.native
  def getAddress(): js.Promise[String] = js.native
  def sendTransaction(transaction: TransactionRequest): js.Promise[TransactionResponse] = js.native
  def signMessage(message: String): js.Promise[String] = js.native
  def signMessage(message: Arrayish): js.Promise[String] = js.native
}

