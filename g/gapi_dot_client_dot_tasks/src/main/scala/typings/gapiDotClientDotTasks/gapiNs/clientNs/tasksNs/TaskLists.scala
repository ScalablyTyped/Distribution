package typings.gapiDotClientDotTasks.gapiNs.clientNs.tasksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskLists extends js.Object {
  /** ETag of the resource. */
  var etag: js.UndefOr[String] = js.undefined
  /** Collection of task lists. */
  var items: js.UndefOr[js.Array[TaskList]] = js.undefined
  /** Type of the resource. This is always "tasks#taskLists". */
  var kind: js.UndefOr[String] = js.undefined
  /** Token that can be used to request the next page of this result. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object TaskLists {
  @scala.inline
  def apply(
    etag: String = null,
    items: js.Array[TaskList] = null,
    kind: String = null,
    nextPageToken: String = null
  ): TaskLists = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[TaskLists]
  }
}

