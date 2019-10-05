package typings.fossilDashDelta

import typings.fossilDashDelta.fossilDashDeltaMod.ByteArray
import typings.node.Buffer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fossil-delta", JSImport.Namespace)
@js.native
object fossilDashDeltaMod extends js.Object {
  @JSName("apply")
  def apply(origin: ByteArray, delta: js.Array[Double]): js.Array[Double] = js.native
  @JSName("apply")
  def apply(origin: ByteArray, delta: js.Array[Double], ops: Anon_VerifyChecksum): js.Array[Double] = js.native
  def create(origin: ByteArray, target: ByteArray): js.Array[Double] = js.native
  def outputSize(delta: js.Array[Double]): Double = js.native
  type ByteArray = js.Array[Double] | Uint8Array | Buffer
}

