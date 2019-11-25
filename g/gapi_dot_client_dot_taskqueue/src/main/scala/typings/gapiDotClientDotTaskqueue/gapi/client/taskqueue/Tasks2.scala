package typings.gapiDotClientDotTaskqueue.gapi.client.taskqueue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tasks2 extends js.Object {
  /** The actual list of tasks currently active in the TaskQueue. */
  var items: js.UndefOr[js.Array[Task]] = js.undefined
  /** The kind of object returned, a list of tasks. */
  var kind: js.UndefOr[String] = js.undefined
}

object Tasks2 {
  @scala.inline
  def apply(items: js.Array[Task] = null, kind: String = null): Tasks2 = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tasks2]
  }
}

