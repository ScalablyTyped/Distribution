package typings
package ethereumjsDashTxLib.ethereumjsDashTxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait EthereumTx extends js.Object {
  var nonce: nodeLib.Buffer
  var r: nodeLib.Buffer
  var raw: js.Array[nodeLib.Buffer]
  var s: nodeLib.Buffer
  var v: nodeLib.Buffer
  def getSenderAddress(): nodeLib.Buffer
  def serialize(): nodeLib.Buffer
  def sign(buffer: nodeLib.Buffer): scala.Unit
}

