package typings
package gapiDotCalendarLib.gapiNs.clientNs.calendarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventInput extends js.Object {
  // Optional Properties
  var anyoneCanAddSelf: js.UndefOr[scala.Boolean] = js.undefined
  // Required Properties
  var attachments: js.UndefOr[js.Array[gapiDotCalendarLib.Anon_FileUrl]] = js.undefined
  var attendees: js.UndefOr[js.Array[gapiDotCalendarLib.Anon_DisplayNameEmailOptional]] = js.undefined
  var colorId: js.UndefOr[java.lang.String] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var end: gapiDotCalendarLib.Anon_Date
  var extendedProperties: js.UndefOr[gapiDotCalendarLib.Anon_Shared] = js.undefined
  var gadget: js.UndefOr[gapiDotCalendarLib.Anon_HeightIconLink] = js.undefined
  var guestsCanInviteOthers: js.UndefOr[scala.Boolean] = js.undefined
  var guestsCanSeeOtherGuests: js.UndefOr[scala.Boolean] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var location: js.UndefOr[java.lang.String] = js.undefined
  var originalStartTime: js.UndefOr[gapiDotCalendarLib.Anon_DateDateTimeTimeZone] = js.undefined
  var recurrence: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var reminders: js.UndefOr[gapiDotCalendarLib.Anon_OverridesUseDefault] = js.undefined
  var sequence: js.UndefOr[integer] = js.undefined
  var source: js.UndefOr[gapiDotCalendarLib.Anon_Url] = js.undefined
  var start: gapiDotCalendarLib.Anon_Date
  var status: js.UndefOr[EventStatus] = js.undefined
  var summary: js.UndefOr[java.lang.String] = js.undefined
  var transparency: js.UndefOr[EventTransparency] = js.undefined
  var visibility: js.UndefOr[EventVisibility] = js.undefined
}

