package typings.gapiCalendar

import typings.gapiCalendar.gapi.client.calendar.AttendeeResponseStatus
import typings.gapiCalendar.gapi.client.calendar.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAdditionalGuests extends js.Object {
  var additionalGuests: js.UndefOr[integer] = js.undefined
  var comment: js.UndefOr[String] = js.undefined
  var displayName: js.UndefOr[String] = js.undefined
  var email: String
  var optional: js.UndefOr[Boolean] = js.undefined
  var responseStatus: js.UndefOr[AttendeeResponseStatus] = js.undefined
}

object AnonAdditionalGuests {
  @scala.inline
  def apply(
    email: String,
    additionalGuests: Int | Double = null,
    comment: String = null,
    displayName: String = null,
    optional: js.UndefOr[Boolean] = js.undefined,
    responseStatus: AttendeeResponseStatus = null
  ): AnonAdditionalGuests = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any])
    if (additionalGuests != null) __obj.updateDynamic("additionalGuests")(additionalGuests.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional.asInstanceOf[js.Any])
    if (responseStatus != null) __obj.updateDynamic("responseStatus")(responseStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAdditionalGuests]
  }
}

