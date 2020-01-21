package typings.gapiClientTasks.gapi.client.tasks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskList extends js.Object {
  /** ETag of the resource. */
  var etag: js.UndefOr[String] = js.undefined
  /** Task list identifier. */
  var id: js.UndefOr[String] = js.undefined
  /** Type of the resource. This is always "tasks#taskList". */
  var kind: js.UndefOr[String] = js.undefined
  /** URL pointing to this task list. Used to retrieve, update, or delete this task list. */
  var selfLink: js.UndefOr[String] = js.undefined
  /** Title of the task list. */
  var title: js.UndefOr[String] = js.undefined
  /** Last modification time of the task list (as a RFC 3339 timestamp). */
  var updated: js.UndefOr[String] = js.undefined
}

object TaskList {
  @scala.inline
  def apply(
    etag: String = null,
    id: String = null,
    kind: String = null,
    selfLink: String = null,
    title: String = null,
    updated: String = null
  ): TaskList = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (updated != null) __obj.updateDynamic("updated")(updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskList]
  }
}

