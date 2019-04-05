package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventAttendee extends js.Object {
  var additionalGuests: js.UndefOr[scala.Double] = js.undefined
  var comment: js.UndefOr[java.lang.String] = js.undefined
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  var email: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var optional: js.UndefOr[scala.Boolean] = js.undefined
  var organizer: js.UndefOr[scala.Boolean] = js.undefined
  var resource: js.UndefOr[scala.Boolean] = js.undefined
  var responseStatus: js.UndefOr[java.lang.String] = js.undefined
  var self: js.UndefOr[scala.Boolean] = js.undefined
}

object EventAttendee {
  @scala.inline
  def apply(
    additionalGuests: scala.Int | scala.Double = null,
    comment: java.lang.String = null,
    displayName: java.lang.String = null,
    email: java.lang.String = null,
    id: java.lang.String = null,
    optional: js.UndefOr[scala.Boolean] = js.undefined,
    organizer: js.UndefOr[scala.Boolean] = js.undefined,
    resource: js.UndefOr[scala.Boolean] = js.undefined,
    responseStatus: java.lang.String = null,
    self: js.UndefOr[scala.Boolean] = js.undefined
  ): EventAttendee = {
    val __obj = js.Dynamic.literal()
    if (additionalGuests != null) __obj.updateDynamic("additionalGuests")(additionalGuests.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (email != null) __obj.updateDynamic("email")(email)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional)
    if (!js.isUndefined(organizer)) __obj.updateDynamic("organizer")(organizer)
    if (!js.isUndefined(resource)) __obj.updateDynamic("resource")(resource)
    if (responseStatus != null) __obj.updateDynamic("responseStatus")(responseStatus)
    if (!js.isUndefined(self)) __obj.updateDynamic("self")(self)
    __obj.asInstanceOf[EventAttendee]
  }
}

