package typings
package ethereumjsDashTxLib.ethereumjsDashTxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethereumjs-tx", JSImport.Namespace)
@js.native
class namespaced protected () extends EthereumTx {
  def this(txParams: js.Any) = this()
  /* CompleteClass */
  override var nonce: nodeLib.Buffer = js.native
  /* CompleteClass */
  override var r: nodeLib.Buffer = js.native
  /* CompleteClass */
  override var raw: js.Array[nodeLib.Buffer] = js.native
  /* CompleteClass */
  override var s: nodeLib.Buffer = js.native
  /* CompleteClass */
  override var v: nodeLib.Buffer = js.native
  /* CompleteClass */
  override def getSenderAddress(): nodeLib.Buffer = js.native
  /* CompleteClass */
  override def serialize(): nodeLib.Buffer = js.native
  /* CompleteClass */
  override def sign(buffer: nodeLib.Buffer): scala.Unit = js.native
}

