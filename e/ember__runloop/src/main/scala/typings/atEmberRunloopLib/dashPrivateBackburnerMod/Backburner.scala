package typings
package atEmberRunloopLib.dashPrivateBackburnerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Backburner extends js.Object {
  var DEBUG: scala.Boolean = js.native
  def ensureInstance(): scala.Unit = js.native
  def getDebugInfo(): DebugInfo = js.native
  def join(args: js.Any*): scala.Unit = js.native
  def on(args: js.Any*): scala.Unit = js.native
  def schedule(
    queueName: java.lang.String,
    target: js.Object,
    method: js.Function0[scala.Unit | java.lang.String]
  ): scala.Unit = js.native
  def schedule(
    queueName: java.lang.String,
    target: scala.Null,
    method: js.Function0[scala.Unit | java.lang.String]
  ): scala.Unit = js.native
  def scheduleOnce(args: js.Any*): scala.Unit = js.native
}

