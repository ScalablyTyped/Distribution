package typings.googleDashAppsDashScript.GoogleAppsScriptNs.CalendarNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventAttendee extends js.Object {
  var additionalGuests: js.UndefOr[Double] = js.undefined
  var comment: js.UndefOr[String] = js.undefined
  var displayName: js.UndefOr[String] = js.undefined
  var email: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var optional: js.UndefOr[Boolean] = js.undefined
  var organizer: js.UndefOr[Boolean] = js.undefined
  var resource: js.UndefOr[Boolean] = js.undefined
  var responseStatus: js.UndefOr[String] = js.undefined
  var self: js.UndefOr[Boolean] = js.undefined
}

object EventAttendee {
  @scala.inline
  def apply(
    additionalGuests: Int | Double = null,
    comment: String = null,
    displayName: String = null,
    email: String = null,
    id: String = null,
    optional: js.UndefOr[Boolean] = js.undefined,
    organizer: js.UndefOr[Boolean] = js.undefined,
    resource: js.UndefOr[Boolean] = js.undefined,
    responseStatus: String = null,
    self: js.UndefOr[Boolean] = js.undefined
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

