package typings
package gapiDotClientDotTasksLib.gapiNs.clientNs.tasksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Task extends js.Object {
  /** Completion date of the task (as a RFC 3339 timestamp). This field is omitted if the task has not been completed. */
  var completed: js.UndefOr[java.lang.String] = js.undefined
  /** Flag indicating whether the task has been deleted. The default if False. */
  var deleted: js.UndefOr[scala.Boolean] = js.undefined
  /** Due date of the task (as a RFC 3339 timestamp). Optional. */
  var due: js.UndefOr[java.lang.String] = js.undefined
  /** ETag of the resource. */
  var etag: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Flag indicating whether the task is hidden. This is the case if the task had been marked completed when the task list was last cleared. The default is
    * False. This field is read-only.
    */
  var hidden: js.UndefOr[scala.Boolean] = js.undefined
  /** Task identifier. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Type of the resource. This is always "tasks#task". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Collection of links. This collection is read-only. */
  var links: js.UndefOr[js.Array[gapiDotClientDotTasksLib.Anon_Description]] = js.undefined
  /** Notes describing the task. Optional. */
  var notes: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Parent task identifier. This field is omitted if it is a top-level task. This field is read-only. Use the "move" method to move the task under a
    * different parent or to the top level.
    */
  var parent: js.UndefOr[java.lang.String] = js.undefined
  /**
    * String indicating the position of the task among its sibling tasks under the same parent task or at the top level. If this string is greater than
    * another task's corresponding position string according to lexicographical ordering, the task is positioned after the other task under the same parent
    * task (or at the top level). This field is read-only. Use the "move" method to move the task to another position.
    */
  var position: js.UndefOr[java.lang.String] = js.undefined
  /** URL pointing to this task. Used to retrieve, update, or delete this task. */
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
  /** Status of the task. This is either "needsAction" or "completed". */
  var status: js.UndefOr[java.lang.String] = js.undefined
  /** Title of the task. */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /** Last modification time of the task (as a RFC 3339 timestamp). */
  var updated: js.UndefOr[java.lang.String] = js.undefined
}

object Task {
  @scala.inline
  def apply(
    completed: java.lang.String = null,
    deleted: js.UndefOr[scala.Boolean] = js.undefined,
    due: java.lang.String = null,
    etag: java.lang.String = null,
    hidden: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    links: js.Array[gapiDotClientDotTasksLib.Anon_Description] = null,
    notes: java.lang.String = null,
    parent: java.lang.String = null,
    position: java.lang.String = null,
    selfLink: java.lang.String = null,
    status: java.lang.String = null,
    title: java.lang.String = null,
    updated: java.lang.String = null
  ): Task = {
    val __obj = js.Dynamic.literal()
    if (completed != null) __obj.updateDynamic("completed")(completed)
    if (!js.isUndefined(deleted)) __obj.updateDynamic("deleted")(deleted)
    if (due != null) __obj.updateDynamic("due")(due)
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (links != null) __obj.updateDynamic("links")(links)
    if (notes != null) __obj.updateDynamic("notes")(notes)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (position != null) __obj.updateDynamic("position")(position)
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    if (status != null) __obj.updateDynamic("status")(status)
    if (title != null) __obj.updateDynamic("title")(title)
    if (updated != null) __obj.updateDynamic("updated")(updated)
    __obj.asInstanceOf[Task]
  }
}

