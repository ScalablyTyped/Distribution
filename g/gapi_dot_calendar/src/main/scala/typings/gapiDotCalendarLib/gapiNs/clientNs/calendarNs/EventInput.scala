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
  var attendees: js.UndefOr[js.Array[gapiDotCalendarLib.Anon_AdditionalGuests]] = js.undefined
  var colorId: js.UndefOr[java.lang.String] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var end: gapiDotCalendarLib.Anon_Date
  var extendedProperties: js.UndefOr[gapiDotCalendarLib.Anon_KeyPrivate] = js.undefined
  var gadget: js.UndefOr[gapiDotCalendarLib.Anon_Display] = js.undefined
  var guestsCanInviteOthers: js.UndefOr[scala.Boolean] = js.undefined
  var guestsCanSeeOtherGuests: js.UndefOr[scala.Boolean] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var location: js.UndefOr[java.lang.String] = js.undefined
  var originalStartTime: js.UndefOr[gapiDotCalendarLib.Anon_DateDateTime] = js.undefined
  var recurrence: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var reminders: js.UndefOr[gapiDotCalendarLib.Anon_Overrides] = js.undefined
  var sequence: js.UndefOr[integer] = js.undefined
  var source: js.UndefOr[gapiDotCalendarLib.Anon_Title] = js.undefined
  var start: gapiDotCalendarLib.Anon_Date
  var status: js.UndefOr[EventStatus] = js.undefined
  var summary: js.UndefOr[java.lang.String] = js.undefined
  var transparency: js.UndefOr[EventTransparency] = js.undefined
  var visibility: js.UndefOr[EventVisibility] = js.undefined
}

object EventInput {
  @scala.inline
  def apply(
    end: gapiDotCalendarLib.Anon_Date,
    start: gapiDotCalendarLib.Anon_Date,
    anyoneCanAddSelf: js.UndefOr[scala.Boolean] = js.undefined,
    attachments: js.Array[gapiDotCalendarLib.Anon_FileUrl] = null,
    attendees: js.Array[gapiDotCalendarLib.Anon_AdditionalGuests] = null,
    colorId: java.lang.String = null,
    description: java.lang.String = null,
    extendedProperties: gapiDotCalendarLib.Anon_KeyPrivate = null,
    gadget: gapiDotCalendarLib.Anon_Display = null,
    guestsCanInviteOthers: js.UndefOr[scala.Boolean] = js.undefined,
    guestsCanSeeOtherGuests: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    location: java.lang.String = null,
    originalStartTime: gapiDotCalendarLib.Anon_DateDateTime = null,
    recurrence: js.Array[java.lang.String] = null,
    reminders: gapiDotCalendarLib.Anon_Overrides = null,
    sequence: js.UndefOr[integer] = js.undefined,
    source: gapiDotCalendarLib.Anon_Title = null,
    status: EventStatus = null,
    summary: java.lang.String = null,
    transparency: EventTransparency = null,
    visibility: EventVisibility = null
  ): EventInput = {
    val __obj = js.Dynamic.literal(end = end, start = start)
    if (!js.isUndefined(anyoneCanAddSelf)) __obj.updateDynamic("anyoneCanAddSelf")(anyoneCanAddSelf)
    if (attachments != null) __obj.updateDynamic("attachments")(attachments)
    if (attendees != null) __obj.updateDynamic("attendees")(attendees)
    if (colorId != null) __obj.updateDynamic("colorId")(colorId)
    if (description != null) __obj.updateDynamic("description")(description)
    if (extendedProperties != null) __obj.updateDynamic("extendedProperties")(extendedProperties)
    if (gadget != null) __obj.updateDynamic("gadget")(gadget)
    if (!js.isUndefined(guestsCanInviteOthers)) __obj.updateDynamic("guestsCanInviteOthers")(guestsCanInviteOthers)
    if (!js.isUndefined(guestsCanSeeOtherGuests)) __obj.updateDynamic("guestsCanSeeOtherGuests")(guestsCanSeeOtherGuests)
    if (id != null) __obj.updateDynamic("id")(id)
    if (location != null) __obj.updateDynamic("location")(location)
    if (originalStartTime != null) __obj.updateDynamic("originalStartTime")(originalStartTime)
    if (recurrence != null) __obj.updateDynamic("recurrence")(recurrence)
    if (reminders != null) __obj.updateDynamic("reminders")(reminders)
    if (!js.isUndefined(sequence)) __obj.updateDynamic("sequence")(sequence)
    if (source != null) __obj.updateDynamic("source")(source)
    if (status != null) __obj.updateDynamic("status")(status)
    if (summary != null) __obj.updateDynamic("summary")(summary)
    if (transparency != null) __obj.updateDynamic("transparency")(transparency)
    if (visibility != null) __obj.updateDynamic("visibility")(visibility)
    __obj.asInstanceOf[EventInput]
  }
}

