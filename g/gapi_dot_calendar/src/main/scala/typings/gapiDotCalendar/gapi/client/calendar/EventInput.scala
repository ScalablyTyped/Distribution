package typings.gapiDotCalendar.gapi.client.calendar

import typings.gapiDotCalendar.Anon_AdditionalGuests
import typings.gapiDotCalendar.Anon_Date
import typings.gapiDotCalendar.Anon_DateDateTime
import typings.gapiDotCalendar.Anon_Display
import typings.gapiDotCalendar.Anon_FileUrl
import typings.gapiDotCalendar.Anon_Key
import typings.gapiDotCalendar.Anon_Overrides
import typings.gapiDotCalendar.Anon_Title
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventInput extends js.Object {
  // Optional Properties
  var anyoneCanAddSelf: js.UndefOr[Boolean] = js.undefined
  // Required Properties
  var attachments: js.UndefOr[js.Array[Anon_FileUrl]] = js.undefined
  var attendees: js.UndefOr[js.Array[Anon_AdditionalGuests]] = js.undefined
  var colorId: js.UndefOr[String] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var end: Anon_Date
  var extendedProperties: js.UndefOr[Anon_Key] = js.undefined
  var gadget: js.UndefOr[Anon_Display] = js.undefined
  var guestsCanInviteOthers: js.UndefOr[Boolean] = js.undefined
  var guestsCanSeeOtherGuests: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var location: js.UndefOr[String] = js.undefined
  var originalStartTime: js.UndefOr[Anon_DateDateTime] = js.undefined
  var recurrence: js.UndefOr[js.Array[String]] = js.undefined
  var reminders: js.UndefOr[Anon_Overrides] = js.undefined
  var sequence: js.UndefOr[integer] = js.undefined
  var source: js.UndefOr[Anon_Title] = js.undefined
  var start: Anon_Date
  var status: js.UndefOr[EventStatus] = js.undefined
  var summary: js.UndefOr[String] = js.undefined
  var transparency: js.UndefOr[EventTransparency] = js.undefined
  var visibility: js.UndefOr[EventVisibility] = js.undefined
}

object EventInput {
  @scala.inline
  def apply(
    end: Anon_Date,
    start: Anon_Date,
    anyoneCanAddSelf: js.UndefOr[Boolean] = js.undefined,
    attachments: js.Array[Anon_FileUrl] = null,
    attendees: js.Array[Anon_AdditionalGuests] = null,
    colorId: String = null,
    description: String = null,
    extendedProperties: Anon_Key = null,
    gadget: Anon_Display = null,
    guestsCanInviteOthers: js.UndefOr[Boolean] = js.undefined,
    guestsCanSeeOtherGuests: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    location: String = null,
    originalStartTime: Anon_DateDateTime = null,
    recurrence: js.Array[String] = null,
    reminders: Anon_Overrides = null,
    sequence: Int | Double = null,
    source: Anon_Title = null,
    status: EventStatus = null,
    summary: String = null,
    transparency: EventTransparency = null,
    visibility: EventVisibility = null
  ): EventInput = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    if (!js.isUndefined(anyoneCanAddSelf)) __obj.updateDynamic("anyoneCanAddSelf")(anyoneCanAddSelf.asInstanceOf[js.Any])
    if (attachments != null) __obj.updateDynamic("attachments")(attachments.asInstanceOf[js.Any])
    if (attendees != null) __obj.updateDynamic("attendees")(attendees.asInstanceOf[js.Any])
    if (colorId != null) __obj.updateDynamic("colorId")(colorId.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (extendedProperties != null) __obj.updateDynamic("extendedProperties")(extendedProperties.asInstanceOf[js.Any])
    if (gadget != null) __obj.updateDynamic("gadget")(gadget.asInstanceOf[js.Any])
    if (!js.isUndefined(guestsCanInviteOthers)) __obj.updateDynamic("guestsCanInviteOthers")(guestsCanInviteOthers.asInstanceOf[js.Any])
    if (!js.isUndefined(guestsCanSeeOtherGuests)) __obj.updateDynamic("guestsCanSeeOtherGuests")(guestsCanSeeOtherGuests.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (originalStartTime != null) __obj.updateDynamic("originalStartTime")(originalStartTime.asInstanceOf[js.Any])
    if (recurrence != null) __obj.updateDynamic("recurrence")(recurrence.asInstanceOf[js.Any])
    if (reminders != null) __obj.updateDynamic("reminders")(reminders.asInstanceOf[js.Any])
    if (sequence != null) __obj.updateDynamic("sequence")(sequence.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (summary != null) __obj.updateDynamic("summary")(summary.asInstanceOf[js.Any])
    if (transparency != null) __obj.updateDynamic("transparency")(transparency.asInstanceOf[js.Any])
    if (visibility != null) __obj.updateDynamic("visibility")(visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventInput]
  }
}

