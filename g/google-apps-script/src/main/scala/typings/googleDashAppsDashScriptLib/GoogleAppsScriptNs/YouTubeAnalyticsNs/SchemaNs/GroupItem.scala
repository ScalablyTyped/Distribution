package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YouTubeAnalyticsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupItem extends js.Object {
  var errors: js.UndefOr[Errors] = js.undefined
  var etag: js.UndefOr[java.lang.String] = js.undefined
  var groupId: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var resource: js.UndefOr[GroupItemResource] = js.undefined
}

object GroupItem {
  @scala.inline
  def apply(
    errors: Errors = null,
    etag: java.lang.String = null,
    groupId: java.lang.String = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    resource: GroupItemResource = null
  ): GroupItem = {
    val __obj = js.Dynamic.literal()
    if (errors != null) __obj.updateDynamic("errors")(errors)
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (groupId != null) __obj.updateDynamic("groupId")(groupId)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (resource != null) __obj.updateDynamic("resource")(resource)
    __obj.asInstanceOf[GroupItem]
  }
}

