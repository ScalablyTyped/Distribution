package typings.gapiCalendar.anon

import typings.gapiCalendar.gapi.client.calendar.AttendeeResponseStatus
import typings.gapiCalendar.gapi.client.calendar.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdditionalGuests extends js.Object {
  var additionalGuests: js.UndefOr[integer] = js.undefined
  var comment: js.UndefOr[String] = js.undefined
  var displayName: js.UndefOr[String] = js.undefined
  var email: String
  var optional: js.UndefOr[Boolean] = js.undefined
  var responseStatus: js.UndefOr[AttendeeResponseStatus] = js.undefined
}

object AdditionalGuests {
  @scala.inline
  def apply(
    email: String,
    additionalGuests: js.UndefOr[integer] = js.undefined,
    comment: String = null,
    displayName: String = null,
    optional: js.UndefOr[Boolean] = js.undefined,
    responseStatus: AttendeeResponseStatus = null
  ): AdditionalGuests = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any])
    if (!js.isUndefined(additionalGuests)) __obj.updateDynamic("additionalGuests")(additionalGuests.get.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional.get.asInstanceOf[js.Any])
    if (responseStatus != null) __obj.updateDynamic("responseStatus")(responseStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdditionalGuests]
  }
}

