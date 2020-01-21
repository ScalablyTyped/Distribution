package typings.googleAppsScript.GoogleAppsScript.Tasks.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Task extends js.Object {
  var completed: js.UndefOr[String] = js.undefined
  var deleted: js.UndefOr[Boolean] = js.undefined
  var due: js.UndefOr[String] = js.undefined
  var etag: js.UndefOr[String] = js.undefined
  var hidden: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var links: js.UndefOr[js.Array[TaskLinks]] = js.undefined
  var notes: js.UndefOr[String] = js.undefined
  var parent: js.UndefOr[String] = js.undefined
  var position: js.UndefOr[String] = js.undefined
  var selfLink: js.UndefOr[String] = js.undefined
  var status: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
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
    links: js.Array[TaskLinks] = null,
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
    if (!js.isUndefined(deleted)) __obj.updateDynamic("deleted")(deleted.asInstanceOf[js.Any])
    if (due != null) __obj.updateDynamic("due")(due.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
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

