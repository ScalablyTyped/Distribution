package typings.gapiDotCalendar.gapi.client.calendar

import typings.gapiDotCalendar.Anon_AdditionalGuests
import typings.gapiDotCalendar.Anon_Date
import typings.gapiDotCalendar.Anon_DateDateTime
import typings.gapiDotCalendar.Anon_Display
import typings.gapiDotCalendar.Anon_FileUrl
import typings.gapiDotCalendar.Anon_Overrides
import typings.gapiDotCalendar.Anon_Private
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
  var extendedProperties: js.UndefOr[Anon_Private] = js.undefined
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
    extendedProperties: Anon_Private = null,
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
    if (sequence != null) __obj.updateDynamic("sequence")(sequence.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source)
    if (status != null) __obj.updateDynamic("status")(status)
    if (summary != null) __obj.updateDynamic("summary")(summary)
    if (transparency != null) __obj.updateDynamic("transparency")(transparency)
    if (visibility != null) __obj.updateDynamic("visibility")(visibility)
    __obj.asInstanceOf[EventInput]
  }
}

