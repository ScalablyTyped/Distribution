package typings.gapiDotClientDotTasks.gapiNs.clientNs.tasksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tasks extends js.Object {
  /** ETag of the resource. */
  var etag: js.UndefOr[String] = js.undefined
  /** Collection of tasks. */
  var items: js.UndefOr[js.Array[Task]] = js.undefined
  /** Type of the resource. This is always "tasks#tasks". */
  var kind: js.UndefOr[String] = js.undefined
  /** Token used to access the next page of this result. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object Tasks {
  @scala.inline
  def apply(
    etag: String = null,
    items: js.Array[Task] = null,
    kind: String = null,
    nextPageToken: String = null
  ): Tasks = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[Tasks]
  }
}

