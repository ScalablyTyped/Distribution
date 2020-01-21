package typings.gapiClientTaskqueue.gapi.client.taskqueue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tasks extends js.Object {
  /** The actual list of tasks returned as a result of the lease operation. */
  var items: js.UndefOr[js.Array[Task]] = js.undefined
  /** The kind of object returned, a list of tasks. */
  var kind: js.UndefOr[String] = js.undefined
}

object Tasks {
  @scala.inline
  def apply(items: js.Array[Task] = null, kind: String = null): Tasks = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tasks]
  }
}

