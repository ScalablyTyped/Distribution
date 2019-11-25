package typings.googleDashAppsDashScript.GoogleAppsScript.Calendar.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event extends js.Object {
  var anyoneCanAddSelf: js.UndefOr[Boolean] = js.undefined
  var attachments: js.UndefOr[js.Array[EventAttachment]] = js.undefined
  var attendees: js.UndefOr[js.Array[EventAttendee]] = js.undefined
  var attendeesOmitted: js.UndefOr[Boolean] = js.undefined
  var colorId: js.UndefOr[String] = js.undefined
  var conferenceData: js.UndefOr[ConferenceData] = js.undefined
  var created: js.UndefOr[String] = js.undefined
  var creator: js.UndefOr[EventCreator] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var end: js.UndefOr[EventDateTime] = js.undefined
  var endTimeUnspecified: js.UndefOr[Boolean] = js.undefined
  var etag: js.UndefOr[String] = js.undefined
  var extendedProperties: js.UndefOr[EventExtendedProperties] = js.undefined
  var gadget: js.UndefOr[EventGadget] = js.undefined
  var guestsCanInviteOthers: js.UndefOr[Boolean] = js.undefined
  var guestsCanModify: js.UndefOr[Boolean] = js.undefined
  var guestsCanSeeOtherGuests: js.UndefOr[Boolean] = js.undefined
  var hangoutLink: js.UndefOr[String] = js.undefined
  var htmlLink: js.UndefOr[String] = js.undefined
  var iCalUID: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var location: js.UndefOr[String] = js.undefined
  var locked: js.UndefOr[Boolean] = js.undefined
  var organizer: js.UndefOr[EventOrganizer] = js.undefined
  var originalStartTime: js.UndefOr[EventDateTime] = js.undefined
  var privateCopy: js.UndefOr[Boolean] = js.undefined
  var recurrence: js.UndefOr[js.Array[String]] = js.undefined
  var recurringEventId: js.UndefOr[String] = js.undefined
  var reminders: js.UndefOr[EventReminders] = js.undefined
  var sequence: js.UndefOr[Double] = js.undefined
  var source: js.UndefOr[EventSource] = js.undefined
  var start: js.UndefOr[EventDateTime] = js.undefined
  var status: js.UndefOr[String] = js.undefined
  var summary: js.UndefOr[String] = js.undefined
  var transparency: js.UndefOr[String] = js.undefined
  var updated: js.UndefOr[String] = js.undefined
  var visibility: js.UndefOr[String] = js.undefined
}

object Event {
  @scala.inline
  def apply(
    anyoneCanAddSelf: js.UndefOr[Boolean] = js.undefined,
    attachments: js.Array[EventAttachment] = null,
    attendees: js.Array[EventAttendee] = null,
    attendeesOmitted: js.UndefOr[Boolean] = js.undefined,
    colorId: String = null,
    conferenceData: ConferenceData = null,
    created: String = null,
    creator: EventCreator = null,
    description: String = null,
    end: EventDateTime = null,
    endTimeUnspecified: js.UndefOr[Boolean] = js.undefined,
    etag: String = null,
    extendedProperties: EventExtendedProperties = null,
    gadget: EventGadget = null,
    guestsCanInviteOthers: js.UndefOr[Boolean] = js.undefined,
    guestsCanModify: js.UndefOr[Boolean] = js.undefined,
    guestsCanSeeOtherGuests: js.UndefOr[Boolean] = js.undefined,
    hangoutLink: String = null,
    htmlLink: String = null,
    iCalUID: String = null,
    id: String = null,
    kind: String = null,
    location: String = null,
    locked: js.UndefOr[Boolean] = js.undefined,
    organizer: EventOrganizer = null,
    originalStartTime: EventDateTime = null,
    privateCopy: js.UndefOr[Boolean] = js.undefined,
    recurrence: js.Array[String] = null,
    recurringEventId: String = null,
    reminders: EventReminders = null,
    sequence: Int | Double = null,
    source: EventSource = null,
    start: EventDateTime = null,
    status: String = null,
    summary: String = null,
    transparency: String = null,
    updated: String = null,
    visibility: String = null
  ): Event = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(anyoneCanAddSelf)) __obj.updateDynamic("anyoneCanAddSelf")(anyoneCanAddSelf.asInstanceOf[js.Any])
    if (attachments != null) __obj.updateDynamic("attachments")(attachments.asInstanceOf[js.Any])
    if (attendees != null) __obj.updateDynamic("attendees")(attendees.asInstanceOf[js.Any])
    if (!js.isUndefined(attendeesOmitted)) __obj.updateDynamic("attendeesOmitted")(attendeesOmitted.asInstanceOf[js.Any])
    if (colorId != null) __obj.updateDynamic("colorId")(colorId.asInstanceOf[js.Any])
    if (conferenceData != null) __obj.updateDynamic("conferenceData")(conferenceData.asInstanceOf[js.Any])
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (creator != null) __obj.updateDynamic("creator")(creator.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (!js.isUndefined(endTimeUnspecified)) __obj.updateDynamic("endTimeUnspecified")(endTimeUnspecified.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (extendedProperties != null) __obj.updateDynamic("extendedProperties")(extendedProperties.asInstanceOf[js.Any])
    if (gadget != null) __obj.updateDynamic("gadget")(gadget.asInstanceOf[js.Any])
    if (!js.isUndefined(guestsCanInviteOthers)) __obj.updateDynamic("guestsCanInviteOthers")(guestsCanInviteOthers.asInstanceOf[js.Any])
    if (!js.isUndefined(guestsCanModify)) __obj.updateDynamic("guestsCanModify")(guestsCanModify.asInstanceOf[js.Any])
    if (!js.isUndefined(guestsCanSeeOtherGuests)) __obj.updateDynamic("guestsCanSeeOtherGuests")(guestsCanSeeOtherGuests.asInstanceOf[js.Any])
    if (hangoutLink != null) __obj.updateDynamic("hangoutLink")(hangoutLink.asInstanceOf[js.Any])
    if (htmlLink != null) __obj.updateDynamic("htmlLink")(htmlLink.asInstanceOf[js.Any])
    if (iCalUID != null) __obj.updateDynamic("iCalUID")(iCalUID.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (!js.isUndefined(locked)) __obj.updateDynamic("locked")(locked.asInstanceOf[js.Any])
    if (organizer != null) __obj.updateDynamic("organizer")(organizer.asInstanceOf[js.Any])
    if (originalStartTime != null) __obj.updateDynamic("originalStartTime")(originalStartTime.asInstanceOf[js.Any])
    if (!js.isUndefined(privateCopy)) __obj.updateDynamic("privateCopy")(privateCopy.asInstanceOf[js.Any])
    if (recurrence != null) __obj.updateDynamic("recurrence")(recurrence.asInstanceOf[js.Any])
    if (recurringEventId != null) __obj.updateDynamic("recurringEventId")(recurringEventId.asInstanceOf[js.Any])
    if (reminders != null) __obj.updateDynamic("reminders")(reminders.asInstanceOf[js.Any])
    if (sequence != null) __obj.updateDynamic("sequence")(sequence.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (summary != null) __obj.updateDynamic("summary")(summary.asInstanceOf[js.Any])
    if (transparency != null) __obj.updateDynamic("transparency")(transparency.asInstanceOf[js.Any])
    if (updated != null) __obj.updateDynamic("updated")(updated.asInstanceOf[js.Any])
    if (visibility != null) __obj.updateDynamic("visibility")(visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
}

