package typings.ethereumjsDashTx.ethereumjsDashTxMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EthereumTx extends js.Object {
  var data: Buffer = js.native
  var gasLimit: Buffer = js.native
  var gasPrice: Buffer = js.native
  var nonce: Buffer = js.native
  var r: Buffer = js.native
  var raw: js.Array[Buffer] = js.native
  var s: Buffer = js.native
  var to: Buffer = js.native
  var v: Buffer = js.native
  var value: Buffer = js.native
  def getBaseFee(): js.Any = js.native
  def getChainId(): Buffer = js.native
  def getDataFee(): js.Any = js.native
  def getSenderAddress(): Buffer = js.native
  def getSenderPublicKey(): Buffer = js.native
  def getUpfrontCost(): js.Any = js.native
  def hash(): Buffer = js.native
  def hash(includeSignature: Boolean): Buffer = js.native
  def serialize(): Buffer = js.native
  def sign(buffer: Buffer): Unit = js.native
  def toCreationAddress(): Boolean = js.native
  def toJSON(): String | js.Array[String] = js.native
  def validate(): String | Boolean = js.native
  def validate(stringError: Boolean): String | Boolean = js.native
  def verifySignature(): Boolean = js.native
}

