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

@js.native
trait Event extends js.Object {
  var anyoneCanAddSelf: js.UndefOr[Boolean] = js.native
  // File attachments for the event. Currently only Google Drive attachments are supported.
  var attachments: js.UndefOr[js.Array[FileId]] = js.native
  // The attendees of the event.
  var attendees: js.UndefOr[js.Array[Comment]] = js.native
  var attendeesOmitted: js.UndefOr[Boolean] = js.native
  var colorId: js.UndefOr[String] = js.native
  var created: datetime = js.native
  // The creator of the event. Read-only.
  var creator: DisplayName = js.native
  var description: String = js.native
  // The (exclusive) end time of the event. For a recurring event, this is the end time of the first instance.
  var end: Date = js.native
  //     Whether the end time is actually unspecified. An end time is still provided for compatibility reasons, even if this attribute is set to True.
  // The default is False.
  var endTimeUnspecified: js.UndefOr[Boolean] = js.native
  var etag: typings.gapiCalendar.gapi.client.calendar.etag = js.native
  // Extended properties of the event.
  var extendedProperties: js.UndefOr[Private] = js.native
  // A gadget that extends this event.
  var gadget: js.UndefOr[Height] = js.native
  var guestsCanInviteOthers: js.UndefOr[Boolean] = js.native
  var guestsCanModify: js.UndefOr[Boolean] = js.native
  var guestsCanSeeOtherGuests: js.UndefOr[Boolean] = js.native
  // An absolute link to the Google+ hangout associated with this event. Read-only.
  var hangoutLink: js.UndefOr[String] = js.native
  var htmlLink: String = js.native
  var iCalUID: String = js.native
  var id: String = js.native
  var kind: calendarNumbersignevent = js.native
  var location: js.UndefOr[String] = js.native
  // Whether this is a locked event copy where no changes can be made to the main event fields "summary", "description", "location", "start", "end" or "recurrence". The default is False. Read-Only.
  var locked: js.UndefOr[Boolean] = js.native
  // The organizer of the event.
  var organizer: DisplayName = js.native
  // Whether the organizer corresponds to the calendar on which this copy of the event appears. Read-only. The default is False.
  var originalStartTime: js.UndefOr[TimeZone] = js.native
  var privateCopy: js.UndefOr[Boolean] = js.native
  var recurrence: js.Array[String] = js.native
  // For an instance of a recurring event, this is the id of the recurring event to which this instance belongs. Immutable.
  var recurringEventId: js.UndefOr[String] = js.native
  var reminders: UseDefault = js.native
  var sequence: integer = js.native
  // Source from which the event was created. For example, a web page, an email message or any document identifiable by an URL with HTTP or HTTPS scheme.
  // Can only be seen or modified by the creator of the event.
  var source: js.UndefOr[Title] = js.native
  // The (inclusive) start time of the event. For a recurring event, this is the start time of the first instance.
  var start: Date = js.native
  var status: js.UndefOr[EventStatus] = js.native
  var summary: String = js.native
  var transparency: js.UndefOr[EventTransparency] = js.native
  var updated: datetime = js.native
  var visibility: js.UndefOr[EventVisibility] = js.native
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
    updated: datetime
  ): Event = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], creator = creator.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], etag = etag.asInstanceOf[js.Any], htmlLink = htmlLink.asInstanceOf[js.Any], iCalUID = iCalUID.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], organizer = organizer.asInstanceOf[js.Any], recurrence = recurrence.asInstanceOf[js.Any], reminders = reminders.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  @scala.inline
  implicit class EventOps[Self <: Event] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreated(value: datetime): Self = this.set("created", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreator(value: DisplayName): Self = this.set("creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnd(value: Date): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def setEtag(value: etag): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def setHtmlLink(value: String): Self = this.set("htmlLink", value.asInstanceOf[js.Any])
    @scala.inline
    def setICalUID(value: String): Self = this.set("iCalUID", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setKind(value: calendarNumbersignevent): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrganizer(value: DisplayName): Self = this.set("organizer", value.asInstanceOf[js.Any])
    @scala.inline
    def setRecurrenceVarargs(value: String*): Self = this.set("recurrence", js.Array(value :_*))
    @scala.inline
    def setRecurrence(value: js.Array[String]): Self = this.set("recurrence", value.asInstanceOf[js.Any])
    @scala.inline
    def setReminders(value: UseDefault): Self = this.set("reminders", value.asInstanceOf[js.Any])
    @scala.inline
    def setSequence(value: integer): Self = this.set("sequence", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart(value: Date): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def setSummary(value: String): Self = this.set("summary", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdated(value: datetime): Self = this.set("updated", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnyoneCanAddSelf(value: Boolean): Self = this.set("anyoneCanAddSelf", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnyoneCanAddSelf: Self = this.set("anyoneCanAddSelf", js.undefined)
    @scala.inline
    def setAttachmentsVarargs(value: FileId*): Self = this.set("attachments", js.Array(value :_*))
    @scala.inline
    def setAttachments(value: js.Array[FileId]): Self = this.set("attachments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttachments: Self = this.set("attachments", js.undefined)
    @scala.inline
    def setAttendeesVarargs(value: Comment*): Self = this.set("attendees", js.Array(value :_*))
    @scala.inline
    def setAttendees(value: js.Array[Comment]): Self = this.set("attendees", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttendees: Self = this.set("attendees", js.undefined)
    @scala.inline
    def setAttendeesOmitted(value: Boolean): Self = this.set("attendeesOmitted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttendeesOmitted: Self = this.set("attendeesOmitted", js.undefined)
    @scala.inline
    def setColorId(value: String): Self = this.set("colorId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorId: Self = this.set("colorId", js.undefined)
    @scala.inline
    def setEndTimeUnspecified(value: Boolean): Self = this.set("endTimeUnspecified", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndTimeUnspecified: Self = this.set("endTimeUnspecified", js.undefined)
    @scala.inline
    def setExtendedProperties(value: Private): Self = this.set("extendedProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtendedProperties: Self = this.set("extendedProperties", js.undefined)
    @scala.inline
    def setGadget(value: Height): Self = this.set("gadget", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGadget: Self = this.set("gadget", js.undefined)
    @scala.inline
    def setGuestsCanInviteOthers(value: Boolean): Self = this.set("guestsCanInviteOthers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGuestsCanInviteOthers: Self = this.set("guestsCanInviteOthers", js.undefined)
    @scala.inline
    def setGuestsCanModify(value: Boolean): Self = this.set("guestsCanModify", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGuestsCanModify: Self = this.set("guestsCanModify", js.undefined)
    @scala.inline
    def setGuestsCanSeeOtherGuests(value: Boolean): Self = this.set("guestsCanSeeOtherGuests", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGuestsCanSeeOtherGuests: Self = this.set("guestsCanSeeOtherGuests", js.undefined)
    @scala.inline
    def setHangoutLink(value: String): Self = this.set("hangoutLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHangoutLink: Self = this.set("hangoutLink", js.undefined)
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setLocked(value: Boolean): Self = this.set("locked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocked: Self = this.set("locked", js.undefined)
    @scala.inline
    def setOriginalStartTime(value: TimeZone): Self = this.set("originalStartTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginalStartTime: Self = this.set("originalStartTime", js.undefined)
    @scala.inline
    def setPrivateCopy(value: Boolean): Self = this.set("privateCopy", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrivateCopy: Self = this.set("privateCopy", js.undefined)
    @scala.inline
    def setRecurringEventId(value: String): Self = this.set("recurringEventId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecurringEventId: Self = this.set("recurringEventId", js.undefined)
    @scala.inline
    def setSource(value: Title): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    @scala.inline
    def setStatus(value: EventStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setTransparency(value: EventTransparency): Self = this.set("transparency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransparency: Self = this.set("transparency", js.undefined)
    @scala.inline
    def setVisibility(value: EventVisibility): Self = this.set("visibility", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisibility: Self = this.set("visibility", js.undefined)
  }
  
}

