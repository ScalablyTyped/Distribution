package typings
package gapiDotCalendarLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AdditionalGuests extends js.Object {
  var additionalGuests: js.UndefOr[gapiDotCalendarLib.gapiNs.clientNs.calendarNs.integer] = js.undefined
  var comment: js.UndefOr[java.lang.String] = js.undefined
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  var email: java.lang.String
  var optional: js.UndefOr[scala.Boolean] = js.undefined
  var responseStatus: js.UndefOr[gapiDotCalendarLib.gapiNs.clientNs.calendarNs.AttendeeResponseStatus] = js.undefined
}

object Anon_AdditionalGuests {
  @scala.inline
  def apply(
    email: java.lang.String,
    additionalGuests: js.UndefOr[gapiDotCalendarLib.gapiNs.clientNs.calendarNs.integer] = js.undefined,
    comment: java.lang.String = null,
    displayName: java.lang.String = null,
    optional: js.UndefOr[scala.Boolean] = js.undefined,
    responseStatus: gapiDotCalendarLib.gapiNs.clientNs.calendarNs.AttendeeResponseStatus = null
  ): Anon_AdditionalGuests = {
    val __obj = js.Dynamic.literal(email = email)
    if (!js.isUndefined(additionalGuests)) __obj.updateDynamic("additionalGuests")(additionalGuests)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional)
    if (responseStatus != null) __obj.updateDynamic("responseStatus")(responseStatus)
    __obj.asInstanceOf[Anon_AdditionalGuests]
  }
}

