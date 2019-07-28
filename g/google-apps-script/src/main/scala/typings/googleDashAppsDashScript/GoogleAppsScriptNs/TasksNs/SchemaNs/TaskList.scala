package typings.googleDashAppsDashScript.GoogleAppsScriptNs.TasksNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskList extends js.Object {
  var etag: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var selfLink: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
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
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    if (title != null) __obj.updateDynamic("title")(title)
    if (updated != null) __obj.updateDynamic("updated")(updated)
    __obj.asInstanceOf[TaskList]
  }
}

