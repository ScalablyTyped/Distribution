package typings.gapiClientTagmanager.gapi.client.tagmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Zone extends js.Object {
  /** GTM Account ID. */
  var accountId: js.UndefOr[String] = js.undefined
  /** This Zone's boundary. */
  var boundary: js.UndefOr[ZoneBoundary] = js.undefined
  /** Containers that are children of this Zone. */
  var childContainer: js.UndefOr[js.Array[ZoneChildContainer]] = js.undefined
  /** GTM Container ID. */
  var containerId: js.UndefOr[String] = js.undefined
  /** The fingerprint of the GTM Zone as computed at storage time. This value is recomputed whenever the zone is modified. */
  var fingerprint: js.UndefOr[String] = js.undefined
  /** Zone display name. */
  var name: js.UndefOr[String] = js.undefined
  /** User notes on how to apply this zone in the container. */
  var notes: js.UndefOr[String] = js.undefined
  /** GTM Zone's API relative path. */
  var path: js.UndefOr[String] = js.undefined
  /** Auto generated link to the tag manager UI */
  var tagManagerUrl: js.UndefOr[String] = js.undefined
  /** This Zone's type restrictions. */
  var typeRestriction: js.UndefOr[ZoneTypeRestriction] = js.undefined
  /** GTM Workspace ID. */
  var workspaceId: js.UndefOr[String] = js.undefined
  /** The Zone ID uniquely identifies the GTM Zone. */
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
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (boundary != null) __obj.updateDynamic("boundary")(boundary.asInstanceOf[js.Any])
    if (childContainer != null) __obj.updateDynamic("childContainer")(childContainer.asInstanceOf[js.Any])
    if (containerId != null) __obj.updateDynamic("containerId")(containerId.asInstanceOf[js.Any])
    if (fingerprint != null) __obj.updateDynamic("fingerprint")(fingerprint.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (notes != null) __obj.updateDynamic("notes")(notes.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (tagManagerUrl != null) __obj.updateDynamic("tagManagerUrl")(tagManagerUrl.asInstanceOf[js.Any])
    if (typeRestriction != null) __obj.updateDynamic("typeRestriction")(typeRestriction.asInstanceOf[js.Any])
    if (workspaceId != null) __obj.updateDynamic("workspaceId")(workspaceId.asInstanceOf[js.Any])
    if (zoneId != null) __obj.updateDynamic("zoneId")(zoneId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Zone]
  }
}

