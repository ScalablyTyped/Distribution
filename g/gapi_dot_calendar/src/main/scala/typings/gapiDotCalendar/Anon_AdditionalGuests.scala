package typings.gapiDotCalendar

import typings.gapiDotCalendar.gapi.client.calendar.AttendeeResponseStatus
import typings.gapiDotCalendar.gapi.client.calendar.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AdditionalGuests extends js.Object {
  var additionalGuests: js.UndefOr[integer] = js.undefined
  var comment: js.UndefOr[String] = js.undefined
  var displayName: js.UndefOr[String] = js.undefined
  var email: String
  var optional: js.UndefOr[Boolean] = js.undefined
  var responseStatus: js.UndefOr[AttendeeResponseStatus] = js.undefined
}

object Anon_AdditionalGuests {
  @scala.inline
  def apply(
    email: String,
    additionalGuests: Int | Double = null,
    comment: String = null,
    displayName: String = null,
    optional: js.UndefOr[Boolean] = js.undefined,
    responseStatus: AttendeeResponseStatus = null
  ): Anon_AdditionalGuests = {
    val __obj = js.Dynamic.literal(email = email)
    if (additionalGuests != null) __obj.updateDynamic("additionalGuests")(additionalGuests.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional)
    if (responseStatus != null) __obj.updateDynamic("responseStatus")(responseStatus)
    __obj.asInstanceOf[Anon_AdditionalGuests]
  }
}

