package typings.ethers.distTypesUtilsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Event extends Log {
  var args: js.Array[_] = js.native
  var event: String = js.native
  var eventSignature: String = js.native
  def decode(data: String): js.Any = js.native
  def decode(data: String, topics: js.Array[String]): js.Any = js.native
  def getBlock(): js.Promise[Block] = js.native
  def getTransaction(): js.Promise[TransactionResponse] = js.native
  def getTransactionReceipt(): js.Promise[TransactionReceipt] = js.native
  def removeListener(): Unit = js.native
}

