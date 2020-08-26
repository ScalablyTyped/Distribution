package typings.emberRunloop.backburnerMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeferredActionQueues
  extends /* index */ StringDictionary[js.Any] {
  var queues: js.Object = js.native
  def flush(fromAutorun: Boolean): js.Any = js.native
  def schedule(queueName: String, target: js.Any, method: js.Any, args: js.Any, onceFlag: Boolean, stack: js.Any): js.Any = js.native
}

object DeferredActionQueues {
  @scala.inline
  def apply(
    flush: Boolean => js.Any,
    queues: js.Object,
    schedule: (String, js.Any, js.Any, js.Any, Boolean, js.Any) => js.Any
  ): DeferredActionQueues = {
    val __obj = js.Dynamic.literal(flush = js.Any.fromFunction1(flush), queues = queues.asInstanceOf[js.Any], schedule = js.Any.fromFunction6(schedule))
    __obj.asInstanceOf[DeferredActionQueues]
  }
  @scala.inline
  implicit class DeferredActionQueuesOps[Self <: DeferredActionQueues] (val x: Self) extends AnyVal {
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
    def setFlush(value: Boolean => js.Any): Self = this.set("flush", js.Any.fromFunction1(value))
    @scala.inline
    def setQueues(value: js.Object): Self = this.set("queues", value.asInstanceOf[js.Any])
    @scala.inline
    def setSchedule(value: (String, js.Any, js.Any, js.Any, Boolean, js.Any) => js.Any): Self = this.set("schedule", js.Any.fromFunction6(value))
  }
  
}

