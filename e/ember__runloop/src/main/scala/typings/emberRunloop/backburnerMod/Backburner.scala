package typings.emberRunloop.backburnerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Backburner extends js.Object {
  var DEBUG: Boolean = js.native
  def ensureInstance(): Unit = js.native
  def getDebugInfo(): DebugInfo = js.native
  def join(args: js.Any*): Unit = js.native
  def on(args: js.Any*): Unit = js.native
  def schedule(queueName: String, target: js.Object, method: js.Function0[Unit | String]): Unit = js.native
  def schedule(queueName: String, target: Null, method: js.Function0[Unit | String]): Unit = js.native
  def scheduleOnce(args: js.Any*): Unit = js.native
}

