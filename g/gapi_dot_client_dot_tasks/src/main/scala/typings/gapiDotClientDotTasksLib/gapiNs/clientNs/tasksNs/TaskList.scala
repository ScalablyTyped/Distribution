package typings
package gapiDotClientDotTasksLib.gapiNs.clientNs.tasksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskList extends js.Object {
  /** ETag of the resource. */
  var etag: js.UndefOr[java.lang.String] = js.undefined
  /** Task list identifier. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Type of the resource. This is always "tasks#taskList". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** URL pointing to this task list. Used to retrieve, update, or delete this task list. */
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
  /** Title of the task list. */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /** Last modification time of the task list (as a RFC 3339 timestamp). */
  var updated: js.UndefOr[java.lang.String] = js.undefined
}

object TaskList {
  @scala.inline
  def apply(
    etag: java.lang.String = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    selfLink: java.lang.String = null,
    title: java.lang.String = null,
    updated: java.lang.String = null
  ): TaskList = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    if (title != null) __obj.updateDynamic("title")(title)
    if (updated != null) __obj.updateDynamic("updated")(updated)
    __obj.asInstanceOf[TaskList]
  }
}

