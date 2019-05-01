package typings
package fossilDashDeltaLib.fossilDashDeltaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fossil-delta", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  @JSName("apply")
  def apply(origin: ByteArray, delta: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  @JSName("apply")
  def apply(origin: ByteArray, delta: js.Array[scala.Double], ops: fossilDashDeltaLib.Anon_VerifyChecksum): js.Array[scala.Double] = js.native
  def create(origin: ByteArray, target: ByteArray): js.Array[scala.Double] = js.native
  def outputSize(delta: js.Array[scala.Double]): scala.Double = js.native
}

