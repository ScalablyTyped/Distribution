package typings
package gapiDotClientDotTagmanagerLib.gapiNs.clientNs.tagmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Zone extends js.Object {
  /** GTM Account ID. */
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  /** This Zone's boundary. */
  var boundary: js.UndefOr[ZoneBoundary] = js.undefined
  /** Containers that are children of this Zone. */
  var childContainer: js.UndefOr[js.Array[ZoneChildContainer]] = js.undefined
  /** GTM Container ID. */
  var containerId: js.UndefOr[java.lang.String] = js.undefined
  /** The fingerprint of the GTM Zone as computed at storage time. This value is recomputed whenever the zone is modified. */
  var fingerprint: js.UndefOr[java.lang.String] = js.undefined
  /** Zone display name. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** User notes on how to apply this zone in the container. */
  var notes: js.UndefOr[java.lang.String] = js.undefined
  /** GTM Zone's API relative path. */
  var path: js.UndefOr[java.lang.String] = js.undefined
  /** Auto generated link to the tag manager UI */
  var tagManagerUrl: js.UndefOr[java.lang.String] = js.undefined
  /** This Zone's type restrictions. */
  var typeRestriction: js.UndefOr[ZoneTypeRestriction] = js.undefined
  /** GTM Workspace ID. */
  var workspaceId: js.UndefOr[java.lang.String] = js.undefined
  /** The Zone ID uniquely identifies the GTM Zone. */
  var zoneId: js.UndefOr[java.lang.String] = js.undefined
}

