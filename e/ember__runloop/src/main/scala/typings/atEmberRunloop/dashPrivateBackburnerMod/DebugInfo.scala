package typings.atEmberRunloop.dashPrivateBackburnerMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DebugInfo extends js.Object {
  var autorun: js.UndefOr[Error | Null] = js.undefined
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
    autorun: Error = null
  ): DebugInfo = {
    val __obj = js.Dynamic.literal(counters = counters.asInstanceOf[js.Any], instanceStack = instanceStack.asInstanceOf[js.Any], timers = timers.asInstanceOf[js.Any])
    if (autorun != null) __obj.updateDynamic("autorun")(autorun.asInstanceOf[js.Any])
    __obj.asInstanceOf[DebugInfo]
  }
}

