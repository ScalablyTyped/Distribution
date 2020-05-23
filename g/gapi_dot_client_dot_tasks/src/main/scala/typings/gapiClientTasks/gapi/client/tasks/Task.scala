package typings.gapiClientTasks.gapi.client.tasks

import typings.gapiClientTasks.anon.Description
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Task extends js.Object {
  /** Completion date of the task (as a RFC 3339 timestamp). This field is omitted if the task has not been completed. */
  var completed: js.UndefOr[String] = js.undefined
  /** Flag indicating whether the task has been deleted. The default if False. */
  var deleted: js.UndefOr[Boolean] = js.undefined
  /**
    * Due date of the task (as a RFC 3339 timestamp). Optional. The due date only records date information; the time portion of the timestamp is discarded
    * when setting the due date. It isn't possible to read or write the time that a task is due via the API.
    */
  var due: js.UndefOr[String] = js.undefined
  /** ETag of the resource. */
  var etag: js.UndefOr[String] = js.undefined
  /**
    * Flag indicating whether the task is hidden. This is the case if the task had been marked completed when the task list was last cleared. The default is
    * False. This field is read-only.
    */
  var hidden: js.UndefOr[Boolean] = js.undefined
  /** Task identifier. */
  var id: js.UndefOr[String] = js.undefined
  /** Type of the resource. This is always "tasks#task". */
  var kind: js.UndefOr[String] = js.undefined
  /** Collection of links. This collection is read-only. */
  var links: js.UndefOr[js.Array[Description]] = js.undefined
  /** Notes describing the task. Optional. */
  var notes: js.UndefOr[String] = js.undefined
  /**
    * Parent task identifier. This field is omitted if it is a top-level task. This field is read-only. Use the "move" method to move the task under a
    * different parent or to the top level.
    */
  var parent: js.UndefOr[String] = js.undefined
  /**
    * String indicating the position of the task among its sibling tasks under the same parent task or at the top level. If this string is greater than
    * another task's corresponding position string according to lexicographical ordering, the task is positioned after the other task under the same parent
    * task (or at the top level). This field is read-only. Use the "move" method to move the task to another position.
    */
  var position: js.UndefOr[String] = js.undefined
  /** URL pointing to this task. Used to retrieve, update, or delete this task. */
  var selfLink: js.UndefOr[String] = js.undefined
  /** Status of the task. This is either "needsAction" or "completed". */
  var status: js.UndefOr[String] = js.undefined
  /** Title of the task. */
  var title: js.UndefOr[String] = js.undefined
  /** Last modification time of the task (as a RFC 3339 timestamp). */
  var updated: js.UndefOr[String] = js.undefined
}

object Task {
  @scala.inline
  def apply(
    completed: String = null,
    deleted: js.UndefOr[Boolean] = js.undefined,
    due: String = null,
    etag: String = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    kind: String = null,
    links: js.Array[Description] = null,
    notes: String = null,
    parent: String = null,
    position: String = null,
    selfLink: String = null,
    status: String = null,
    title: String = null,
    updated: String = null
  ): Task = {
    val __obj = js.Dynamic.literal()
    if (completed != null) __obj.updateDynamic("completed")(completed.asInstanceOf[js.Any])
    if (!js.isUndefined(deleted)) __obj.updateDynamic("deleted")(deleted.get.asInstanceOf[js.Any])
    if (due != null) __obj.updateDynamic("due")(due.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (links != null) __obj.updateDynamic("links")(links.asInstanceOf[js.Any])
    if (notes != null) __obj.updateDynamic("notes")(notes.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (updated != null) __obj.updateDynamic("updated")(updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[Task]
  }
}

