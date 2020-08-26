package typings.emberRunloop.backburnerMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DebugInfo extends js.Object {
  var autorun: js.UndefOr[Error | Null] = js.native
  var counters: js.Object = js.native
  var instanceStack: js.Array[DeferredActionQueues] = js.native
  var timers: js.Array[QueueItem] = js.native
}

object DebugInfo {
  @scala.inline
  def apply(counters: js.Object, instanceStack: js.Array[DeferredActionQueues], timers: js.Array[QueueItem]): DebugInfo = {
    val __obj = js.Dynamic.literal(counters = counters.asInstanceOf[js.Any], instanceStack = instanceStack.asInstanceOf[js.Any], timers = timers.asInstanceOf[js.Any])
    __obj.asInstanceOf[DebugInfo]
  }
  @scala.inline
  implicit class DebugInfoOps[Self <: DebugInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCounters(value: js.Object): Self = this.set("counters", value.asInstanceOf[js.Any])
    @scala.inline
    def setInstanceStackVarargs(value: DeferredActionQueues*): Self = this.set("instanceStack", js.Array(value :_*))
    @scala.inline
    def setInstanceStack(value: js.Array[DeferredActionQueues]): Self = this.set("instanceStack", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimersVarargs(value: QueueItem*): Self = this.set("timers", js.Array(value :_*))
    @scala.inline
    def setTimers(value: js.Array[QueueItem]): Self = this.set("timers", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutorun(value: Error): Self = this.set("autorun", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutorun: Self = this.set("autorun", js.undefined)
    @scala.inline
    def setAutorunNull: Self = this.set("autorun", null)
  }
  
}

