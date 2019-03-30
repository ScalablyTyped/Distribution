package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.TasksUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskList extends js.Object {
  var etag: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
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

