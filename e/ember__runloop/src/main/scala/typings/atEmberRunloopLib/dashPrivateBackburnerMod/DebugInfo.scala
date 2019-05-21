package typings
package atEmberRunloopLib.dashPrivateBackburnerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DebugInfo extends js.Object {
  var autorun: js.UndefOr[stdLib.Error | scala.Null] = js.undefined
  var counters: js.Object
  var instanceStack: js.Array[DeferredActionQueues]
  var timers: js.Array[QueueItem]
}

object DebugInfo {
  @scala.inline
  def apply(
    counters: js.Object,
    instanceStack: js.Array[DeferredActionQueues],
    timers: js.Array[QueueItem],
    autorun: stdLib.Error = null
  ): DebugInfo = {
    val __obj = js.Dynamic.literal(counters = counters, instanceStack = instanceStack, timers = timers)
    if (autorun != null) __obj.updateDynamic("autorun")(autorun)
    __obj.asInstanceOf[DebugInfo]
  }
}

