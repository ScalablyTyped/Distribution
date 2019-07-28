package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DriveNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PermissionList extends js.Object {
  var etag: js.UndefOr[String] = js.undefined
  var items: js.UndefOr[
    js.Array[typings.googleDashAppsDashScript.GoogleAppsScriptNs.DriveNs.SchemaNs.Permission]
  ] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var nextPageToken: js.UndefOr[String] = js.undefined
  var selfLink: js.UndefOr[String] = js.undefined
}

object PermissionList {
  @scala.inline
  def apply(
    etag: String = null,
    items: js.Array[typings.googleDashAppsDashScript.GoogleAppsScriptNs.DriveNs.SchemaNs.Permission] = null,
    kind: String = null,
    nextPageToken: String = null,
    selfLink: String = null
  ): PermissionList = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    __obj.asInstanceOf[PermissionList]
  }
}

