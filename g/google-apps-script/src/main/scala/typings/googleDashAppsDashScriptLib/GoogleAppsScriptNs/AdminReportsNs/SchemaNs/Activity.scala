package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminReportsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Activity extends js.Object {
  var actor: js.UndefOr[ActivityActor] = js.undefined
  var etag: js.UndefOr[java.lang.String] = js.undefined
  var events: js.UndefOr[js.Array[ActivityEvents]] = js.undefined
  var id: js.UndefOr[ActivityId] = js.undefined
  var ipAddress: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var ownerDomain: js.UndefOr[java.lang.String] = js.undefined
}

object Activity {
  @scala.inline
  def apply(
    actor: ActivityActor = null,
    etag: java.lang.String = null,
    events: js.Array[ActivityEvents] = null,
    id: ActivityId = null,
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

