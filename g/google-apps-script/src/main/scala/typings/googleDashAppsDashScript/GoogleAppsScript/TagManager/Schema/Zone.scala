package typings.googleDashAppsDashScript.GoogleAppsScript.TagManager.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Zone extends js.Object {
  var accountId: js.UndefOr[String] = js.undefined
  var boundary: js.UndefOr[ZoneBoundary] = js.undefined
  var childContainer: js.UndefOr[js.Array[ZoneChildContainer]] = js.undefined
  var containerId: js.UndefOr[String] = js.undefined
  var fingerprint: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var notes: js.UndefOr[String] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var tagManagerUrl: js.UndefOr[String] = js.undefined
  var typeRestriction: js.UndefOr[ZoneTypeRestriction] = js.undefined
  var workspaceId: js.UndefOr[String] = js.undefined
  var zoneId: js.UndefOr[String] = js.undefined
}

object Zone {
  @scala.inline
  def apply(
    accountId: String = null,
    boundary: ZoneBoundary = null,
    childContainer: js.Array[ZoneChildContainer] = null,
    containerId: String = null,
    fingerprint: String = null,
    name: String = null,
    notes: String = null,
    path: String = null,
    tagManagerUrl: String = null,
    typeRestriction: ZoneTypeRestriction = null,
    workspaceId: String = null,
    zoneId: String = null
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

