package typings
package atEmberRunloopLib.dashPrivateBackburnerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeferredActionQueues
  extends /* index */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var queues: js.Object
  def flush(fromAutorun: scala.Boolean): js.Any
  def schedule(
    queueName: java.lang.String,
    target: js.Any,
    method: js.Any,
    args: js.Any,
    onceFlag: scala.Boolean,
    stack: js.Any
  ): js.Any
}

object DeferredActionQueues {
  @scala.inline
  def apply(
    flush: js.Function1[scala.Boolean, js.Any],
    queues: js.Object,
    schedule: js.Function6[java.lang.String, js.Any, js.Any, js.Any, scala.Boolean, js.Any, js.Any],
    StringDictionary: /* index */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): DeferredActionQueues = {
    val __obj = js.Dynamic.literal(flush = flush, queues = queues, schedule = schedule)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[DeferredActionQueues]
  }
}

