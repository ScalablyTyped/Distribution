package typings.atEmberRunloop.dashPrivateBackburnerMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeferredActionQueues
  extends /* index */ StringDictionary[js.Any] {
  var queues: js.Object
  def flush(fromAutorun: Boolean): js.Any
  def schedule(queueName: String, target: js.Any, method: js.Any, args: js.Any, onceFlag: Boolean, stack: js.Any): js.Any
}

object DeferredActionQueues {
  @scala.inline
  def apply(
    flush: Boolean => js.Any,
    queues: js.Object,
    schedule: (String, js.Any, js.Any, js.Any, Boolean, js.Any) => js.Any,
    StringDictionary: /* index */ StringDictionary[js.Any] = null
  ): DeferredActionQueues = {
    val __obj = js.Dynamic.literal(flush = js.Any.fromFunction1(flush), queues = queues, schedule = js.Any.fromFunction6(schedule))
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[DeferredActionQueues]
  }
}

