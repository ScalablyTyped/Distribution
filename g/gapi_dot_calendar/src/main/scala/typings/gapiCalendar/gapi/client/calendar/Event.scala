package typings.gapiCalendar.gapi.client.calendar

import typings.gapiCalendar.anon.Comment
import typings.gapiCalendar.anon.Date
import typings.gapiCalendar.anon.DisplayName
import typings.gapiCalendar.anon.FileId
import typings.gapiCalendar.anon.Height
import typings.gapiCalendar.anon.Private
import typings.gapiCalendar.anon.TimeZone
import typings.gapiCalendar.anon.Title
import typings.gapiCalendar.anon.UseDefault
import typings.gapiCalendar.gapiCalendarStrings.calendarNumbersignevent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event extends js.Object {
  var anyoneCanAddSelf: js.UndefOr[Boolean] = js.undefined
  // File attachments for the event. Currently only Google Drive attachments are supported.
  var attachments: js.UndefOr[js.Array[FileId]] = js.undefined
  // The attendees of the event.
  var attendees: js.UndefOr[js.Array[Comment]] = js.undefined
  var attendeesOmitted: js.UndefOr[Boolean] = js.undefined
  var colorId: js.UndefOr[String] = js.undefined
  var created: datetime
  // The creator of the event. Read-only.
  var creator: DisplayName
  var description: String
  // The (exclusive) end time of the event. For a recurring event, this is the end time of the first instance.
  var end: Date
  //     Whether the end time is actually unspecified. An end time is still provided for compatibility reasons, even if this attribute is set to True.
  // The default is False.
  var endTimeUnspecified: js.UndefOr[Boolean] = js.undefined
  var etag: typings.gapiCalendar.gapi.client.calendar.etag
  // Extended properties of the event.
  var extendedProperties: js.UndefOr[Private] = js.undefined
  // A gadget that extends this event.
  var gadget: js.UndefOr[Height] = js.undefined
  var guestsCanInviteOthers: js.UndefOr[Boolean] = js.undefined
  var guestsCanModify: js.UndefOr[Boolean] = js.undefined
  var guestsCanSeeOtherGuests: js.UndefOr[Boolean] = js.undefined
  // An absolute link to the Google+ hangout associated with this event. Read-only.
  var hangoutLink: js.UndefOr[String] = js.undefined
  var htmlLink: String
  var iCalUID: String
  var id: String
  var kind: calendarNumbersignevent
  var location: js.UndefOr[String] = js.undefined
  // Whether this is a locked event copy where no changes can be made to the main event fields "summary", "description", "location", "start", "end" or "recurrence". The default is False. Read-Only.
  var locked: js.UndefOr[Boolean] = js.undefined
  // The organizer of the event.
  var organizer: DisplayName
  // Whether the organizer corresponds to the calendar on which this copy of the event appears. Read-only. The default is False.
  var originalStartTime: js.UndefOr[TimeZone] = js.undefined
  var privateCopy: js.UndefOr[Boolean] = js.undefined
  var recurrence: js.Array[String]
  // For an instance of a recurring event, this is the id of the recurring event to which this instance belongs. Immutable.
  var recurringEventId: js.UndefOr[String] = js.undefined
  var reminders: UseDefault
  var sequence: integer
  // Source from which the event was created. For example, a web page, an email message or any document identifiable by an URL with HTTP or HTTPS scheme.
  // Can only be seen or modified by the creator of the event.
  var source: js.UndefOr[Title] = js.undefined
  // The (inclusive) start time of the event. For a recurring event, this is the start time of the first instance.
  var start: Date
  var status: js.UndefOr[EventStatus] = js.undefined
  var summary: String
  var transparency: js.UndefOr[EventTransparency] = js.undefined
  var updated: datetime
  var visibility: js.UndefOr[EventVisibility] = js.undefined
}

object Event {
  @scala.inline
  def apply(
    created: datetime,
    creator: DisplayName,
    description: String,
    end: Date,
    etag: etag,
    htmlLink: String,
    iCalUID: String,
    id: String,
    kind: calendarNumbersignevent,
    organizer: DisplayName,
    recurrence: js.Array[String],
    reminders: UseDefault,
    sequence: integer,
    start: Date,
    summary: String,
    updated: datetime,
    anyoneCanAddSelf: js.UndefOr[Boolean] = js.undefined,
    attachments: js.Array[FileId] = null,
    attendees: js.Array[Comment] = null,
    attendeesOmitted: js.UndefOr[Boolean] = js.undefined,
    colorId: String = null,
    endTimeUnspecified: js.UndefOr[Boolean] = js.undefined,
    extendedProperties: Private = null,
    gadget: Height = null,
    guestsCanInviteOthers: js.UndefOr[Boolean] = js.undefined,
    guestsCanModify: js.UndefOr[Boolean] = js.undefined,
    guestsCanSeeOtherGuests: js.UndefOr[Boolean] = js.undefined,
    hangoutLink: String = null,
    location: String = null,
    locked: js.UndefOr[Boolean] = js.undefined,
    originalStartTime: TimeZone = null,
    privateCopy: js.UndefOr[Boolean] = js.undefined,
    recurringEventId: String = null,
    source: Title = null,
    status: EventStatus = null,
    transparency: EventTransparency = null,
    visibility: EventVisibility = null
  ): Event = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], creator = creator.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], etag = etag.asInstanceOf[js.Any], htmlLink = htmlLink.asInstanceOf[js.Any], iCalUID = iCalUID.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], organizer = organizer.asInstanceOf[js.Any], recurrence = recurrence.asInstanceOf[js.Any], reminders = reminders.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
    if (!js.isUndefined(anyoneCanAddSelf)) __obj.updateDynamic("anyoneCanAddSelf")(anyoneCanAddSelf.get.asInstanceOf[js.Any])
    if (attachments != null) __obj.updateDynamic("attachments")(attachments.asInstanceOf[js.Any])
    if (attendees != null) __obj.updateDynamic("attendees")(attendees.asInstanceOf[js.Any])
    if (!js.isUndefined(attendeesOmitted)) __obj.updateDynamic("attendeesOmitted")(attendeesOmitted.get.asInstanceOf[js.Any])
    if (colorId != null) __obj.updateDynamic("colorId")(colorId.asInstanceOf[js.Any])
    if (!js.isUndefined(endTimeUnspecified)) __obj.updateDynamic("endTimeUnspecified")(endTimeUnspecified.get.asInstanceOf[js.Any])
    if (extendedProperties != null) __obj.updateDynamic("extendedProperties")(extendedProperties.asInstanceOf[js.Any])
    if (gadget != null) __obj.updateDynamic("gadget")(gadget.asInstanceOf[js.Any])
    if (!js.isUndefined(guestsCanInviteOthers)) __obj.updateDynamic("guestsCanInviteOthers")(guestsCanInviteOthers.get.asInstanceOf[js.Any])
    if (!js.isUndefined(guestsCanModify)) __obj.updateDynamic("guestsCanModify")(guestsCanModify.get.asInstanceOf[js.Any])
    if (!js.isUndefined(guestsCanSeeOtherGuests)) __obj.updateDynamic("guestsCanSeeOtherGuests")(guestsCanSeeOtherGuests.get.asInstanceOf[js.Any])
    if (hangoutLink != null) __obj.updateDynamic("hangoutLink")(hangoutLink.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (!js.isUndefined(locked)) __obj.updateDynamic("locked")(locked.get.asInstanceOf[js.Any])
    if (originalStartTime != null) __obj.updateDynamic("originalStartTime")(originalStartTime.asInstanceOf[js.Any])
    if (!js.isUndefined(privateCopy)) __obj.updateDynamic("privateCopy")(privateCopy.get.asInstanceOf[js.Any])
    if (recurringEventId != null) __obj.updateDynamic("recurringEventId")(recurringEventId.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (transparency != null) __obj.updateDynamic("transparency")(transparency.asInstanceOf[js.Any])
    if (visibility != null) __obj.updateDynamic("visibility")(visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
}

