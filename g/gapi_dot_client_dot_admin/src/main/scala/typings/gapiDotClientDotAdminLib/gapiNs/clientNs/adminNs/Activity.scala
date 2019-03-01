package typings
package gapiDotClientDotAdminLib.gapiNs.clientNs.adminNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Activity extends js.Object {
  /** User doing the action. */
  var actor: js.UndefOr[gapiDotClientDotAdminLib.Anon_CallerType] = js.undefined
  /** ETag of the entry. */
  var etag: js.UndefOr[java.lang.String] = js.undefined
  /** Activity events. */
  var events: js.UndefOr[js.Array[gapiDotClientDotAdminLib.Anon_Name]] = js.undefined
  /** Unique identifier for each activity record. */
  var id: js.UndefOr[gapiDotClientDotAdminLib.Anon_ApplicationName] = js.undefined
  /** IP Address of the user doing the action. */
  var ipAddress: js.UndefOr[java.lang.String] = js.undefined
  /** Kind of resource this is. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Domain of source customer. */
  var ownerDomain: js.UndefOr[java.lang.String] = js.undefined
}

object Activity {
  @scala.inline
  def apply(
    actor: gapiDotClientDotAdminLib.Anon_CallerType = null,
    etag: java.lang.String = null,
    events: js.Array[gapiDotClientDotAdminLib.Anon_Name] = null,
    id: gapiDotClientDotAdminLib.Anon_ApplicationName = null,
    ipAddress: java.lang.String = null,
    kind: java.lang.String = null,
    ownerDomain: java.lang.String = null
  ): Activity = {
    val __obj = js.Dynamic.literal()
    if (actor != null) __obj.updateDynamic("actor")(actor)
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (events != null) __obj.updateDynamic("events")(events)
    if (id != null) __obj.updateDynamic("id")(id)
    if (ipAddress != null) __obj.updateDynamic("ipAddress")(ipAddress)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (ownerDomain != null) __obj.updateDynamic("ownerDomain")(ownerDomain)
    __obj.asInstanceOf[Activity]
  }
}

