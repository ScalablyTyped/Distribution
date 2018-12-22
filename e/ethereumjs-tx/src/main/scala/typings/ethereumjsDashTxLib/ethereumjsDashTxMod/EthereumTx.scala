package typings
package ethereumjsDashTxLib.ethereumjsDashTxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EthereumTx extends js.Object {
  var data: nodeLib.Buffer = js.native
  var gasLimit: nodeLib.Buffer = js.native
  var gasPrice: nodeLib.Buffer = js.native
  var nonce: nodeLib.Buffer = js.native
  var r: nodeLib.Buffer = js.native
  var raw: js.Array[nodeLib.Buffer] = js.native
  var s: nodeLib.Buffer = js.native
  var to: nodeLib.Buffer = js.native
  var v: nodeLib.Buffer = js.native
  var value: nodeLib.Buffer = js.native
  def getBaseFee(): js.Any = js.native
  def getChainId(): nodeLib.Buffer = js.native
  def getDataFee(): js.Any = js.native
  def getSenderAddress(): nodeLib.Buffer = js.native
  def getSenderPublicKey(): nodeLib.Buffer = js.native
  def getUpfrontCost(): js.Any = js.native
  def hash(): nodeLib.Buffer = js.native
  def hash(includeSignature: scala.Boolean): nodeLib.Buffer = js.native
  def serialize(): nodeLib.Buffer = js.native
  def sign(buffer: nodeLib.Buffer): scala.Unit = js.native
  def toCreationAddress(): scala.Boolean = js.native
  def toJSON(): java.lang.String | js.Array[java.lang.String] = js.native
  def validate(): java.lang.String | scala.Boolean = js.native
  def validate(stringError: scala.Boolean): java.lang.String | scala.Boolean = js.native
  def verifySignature(): scala.Boolean = js.native
}

