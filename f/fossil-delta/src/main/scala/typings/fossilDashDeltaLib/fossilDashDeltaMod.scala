package typings
package fossilDashDeltaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fossil-delta", JSImport.Namespace)
@js.native
object fossilDashDeltaMod extends js.Object {
  @JSName("apply")
  def apply(origin: fossilDashDeltaLib.ByteArray, delta: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  @JSName("apply")
  def apply(
    origin: fossilDashDeltaLib.ByteArray,
    delta: js.Array[scala.Double],
    ops: fossilDashDeltaLib.Anon_VerifyChecksum
  ): js.Array[scala.Double] = js.native
  def create(origin: fossilDashDeltaLib.ByteArray, target: fossilDashDeltaLib.ByteArray): js.Array[scala.Double] = js.native
  def outputSize(delta: js.Array[scala.Double]): scala.Double = js.native
}

