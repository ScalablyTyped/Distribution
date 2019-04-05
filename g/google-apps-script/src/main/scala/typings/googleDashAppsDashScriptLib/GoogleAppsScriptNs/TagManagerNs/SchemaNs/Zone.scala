package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Zone extends js.Object {
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  var boundary: js.UndefOr[ZoneBoundary] = js.undefined
  var childContainer: js.UndefOr[js.Array[ZoneChildContainer]] = js.undefined
  var containerId: js.UndefOr[java.lang.String] = js.undefined
  var fingerprint: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var notes: js.UndefOr[java.lang.String] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var tagManagerUrl: js.UndefOr[java.lang.String] = js.undefined
  var typeRestriction: js.UndefOr[ZoneTypeRestriction] = js.undefined
  var workspaceId: js.UndefOr[java.lang.String] = js.undefined
  var zoneId: js.UndefOr[java.lang.String] = js.undefined
}

object Zone {
  @scala.inline
  def apply(
    accountId: java.lang.String = null,
    boundary: ZoneBoundary = null,
    childContainer: js.Array[ZoneChildContainer] = null,
    containerId: java.lang.String = null,
    fingerprint: java.lang.String = null,
    name: java.lang.String = null,
    notes: java.lang.String = null,
    path: java.lang.String = null,
    tagManagerUrl: java.lang.String = null,
    typeRestriction: ZoneTypeRestriction = null,
    workspaceId: java.lang.String = null,
    zoneId: java.lang.String = null
  ): Zone = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (boundary != null) __obj.updateDynamic("boundary")(boundary)
    if (childContainer != null) __obj.updateDynamic("childContainer")(childContainer)
    if (containerId != null) __obj.updateDynamic("containerId")(containerId)
    if (fingerprint != null) __obj.updateDynamic("fingerprint")(fingerprint)
    if (name != null) __obj.updateDynamic("name")(name)
    if (notes != null) __obj.updateDynamic("notes")(notes)
    if (path != null) __obj.updateDynamic("path")(path)
    if (tagManagerUrl != null) __obj.updateDynamic("tagManagerUrl")(tagManagerUrl)
    if (typeRestriction != null) __obj.updateDynamic("typeRestriction")(typeRestriction)
    if (workspaceId != null) __obj.updateDynamic("workspaceId")(workspaceId)
    if (zoneId != null) __obj.updateDynamic("zoneId")(zoneId)
    __obj.asInstanceOf[Zone]
  }
}

