package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.TasksNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Task extends js.Object {
  var completed: js.UndefOr[java.lang.String] = js.undefined
  var deleted: js.UndefOr[scala.Boolean] = js.undefined
  var due: js.UndefOr[java.lang.String] = js.undefined
  var etag: js.UndefOr[java.lang.String] = js.undefined
  var hidden: js.UndefOr[scala.Boolean] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var links: js.UndefOr[js.Array[TaskLinks]] = js.undefined
  var notes: js.UndefOr[java.lang.String] = js.undefined
  var parent: js.UndefOr[java.lang.String] = js.undefined
  var position: js.UndefOr[java.lang.String] = js.undefined
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
  var status: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
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
    links: js.Array[TaskLinks] = null,
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

