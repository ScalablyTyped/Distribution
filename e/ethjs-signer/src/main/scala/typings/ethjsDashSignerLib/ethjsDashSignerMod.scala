package typings
package ethjsDashSignerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethjs-signer", JSImport.Namespace)
@js.native
object ethjsDashSignerMod extends js.Object {
  def recover(rawTx: java.lang.String, v: scala.Double, r: nodeLib.Buffer, s: nodeLib.Buffer): nodeLib.Buffer = js.native
  def recover(rawTx: nodeLib.Buffer, v: scala.Double, r: nodeLib.Buffer, s: nodeLib.Buffer): nodeLib.Buffer = js.native
  def sign(transaction: js.Object, privateKey: java.lang.String): java.lang.String = js.native
  @JSName("sign")
  def sign_false(
    transaction: js.Object,
    privateKey: java.lang.String,
    toObject: ethjsDashSignerLib.ethjsDashSignerLibNumbers.`false`
  ): java.lang.String = js.native
  @JSName("sign")
  def sign_true(
    transaction: js.Object,
    privateKey: java.lang.String,
    toObject: ethjsDashSignerLib.ethjsDashSignerLibNumbers.`true`
  ): js.Array[_] = js.native
}

