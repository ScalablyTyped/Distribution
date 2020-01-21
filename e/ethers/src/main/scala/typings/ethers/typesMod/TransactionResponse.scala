package typings.ethers.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransactionResponse extends Transaction {
  var blockHash: js.UndefOr[String] = js.native
  var blockNumber: js.UndefOr[Double] = js.native
  @JSName("from")
  var from_TransactionResponse: String = js.native
  var raw: js.UndefOr[String] = js.native
  var timestamp: js.UndefOr[Double] = js.native
  def wait(timeout: Double): js.Promise[TransactionReceipt] = js.native
}

