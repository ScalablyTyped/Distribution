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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Event extends StObject {
  
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
    organizer: DisplayName,
    recurrence: js.Array[String],
    reminders: UseDefault,
    sequence: integer,
    start: Date,
    summary: String,
    updated: datetime
  ): Event = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], creator = creator.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], etag = etag.asInstanceOf[js.Any], htmlLink = htmlLink.asInstanceOf[js.Any], iCalUID = iCalUID.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = "calendar#event", organizer = organizer.asInstanceOf[js.Any], recurrence = recurrence.asInstanceOf[js.Any], reminders = reminders.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  
  @scala.inline
  implicit class EventMutableBuilder[Self <: Event] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnyoneCanAddSelf(value: Boolean): Self = StObject.set(x, "anyoneCanAddSelf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnyoneCanAddSelfUndefined: Self = StObject.set(x, "anyoneCanAddSelf", js.undefined)
    
    @scala.inline
    def setAttachments(value: js.Array[FileId]): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentsUndefined: Self = StObject.set(x, "attachments", js.undefined)
    
    @scala.inline
    def setAttachmentsVarargs(value: FileId*): Self = StObject.set(x, "attachments", js.Array(value :_*))
    
    @scala.inline
    def setAttendees(value: js.Array[Comment]): Self = StObject.set(x, "attendees", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttendeesOmitted(value: Boolean): Self = StObject.set(x, "attendeesOmitted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttendeesOmittedUndefined: Self = StObject.set(x, "attendeesOmitted", js.undefined)
    
    @scala.inline
    def setAttendeesUndefined: Self = StObject.set(x, "attendees", js.undefined)
    
    @scala.inline
    def setAttendeesVarargs(value: Comment*): Self = StObject.set(x, "attendees", js.Array(value :_*))
    
    @scala.inline
    def setColorId(value: String): Self = StObject.set(x, "colorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorIdUndefined: Self = StObject.set(x, "colorId", js.undefined)
    
    @scala.inline
    def setCreated(value: datetime): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: DisplayName): Self = StObject.set(x, "creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnd(value: Date): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUnspecified(value: Boolean): Self = StObject.set(x, "endTimeUnspecified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUnspecifiedUndefined: Self = StObject.set(x, "endTimeUnspecified", js.undefined)
    
    @scala.inline
    def setEtag(value: etag): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtendedProperties(value: Private): Self = StObject.set(x, "extendedProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtendedPropertiesUndefined: Self = StObject.set(x, "extendedProperties", js.undefined)
    
    @scala.inline
    def setGadget(value: Height): Self = StObject.set(x, "gadget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGadgetUndefined: Self = StObject.set(x, "gadget", js.undefined)
    
    @scala.inline
    def setGuestsCanInviteOthers(value: Boolean): Self = StObject.set(x, "guestsCanInviteOthers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGuestsCanInviteOthersUndefined: Self = StObject.set(x, "guestsCanInviteOthers", js.undefined)
    
    @scala.inline
    def setGuestsCanModify(value: Boolean): Self = StObject.set(x, "guestsCanModify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGuestsCanModifyUndefined: Self = StObject.set(x, "guestsCanModify", js.undefined)
    
    @scala.inline
    def setGuestsCanSeeOtherGuests(value: Boolean): Self = StObject.set(x, "guestsCanSeeOtherGuests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGuestsCanSeeOtherGuestsUndefined: Self = StObject.set(x, "guestsCanSeeOtherGuests", js.undefined)
    
    @scala.inline
    def setHangoutLink(value: String): Self = StObject.set(x, "hangoutLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHangoutLinkUndefined: Self = StObject.set(x, "hangoutLink", js.undefined)
    
    @scala.inline
    def setHtmlLink(value: String): Self = StObject.set(x, "htmlLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setICalUID(value: String): Self = StObject.set(x, "iCalUID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: calendarNumbersignevent): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setLocked(value: Boolean): Self = StObject.set(x, "locked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLockedUndefined: Self = StObject.set(x, "locked", js.undefined)
    
    @scala.inline
    def setOrganizer(value: DisplayName): Self = StObject.set(x, "organizer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalStartTime(value: TimeZone): Self = StObject.set(x, "originalStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalStartTimeUndefined: Self = StObject.set(x, "originalStartTime", js.undefined)
    
    @scala.inline
    def setPrivateCopy(value: Boolean): Self = StObject.set(x, "privateCopy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateCopyUndefined: Self = StObject.set(x, "privateCopy", js.undefined)
    
    @scala.inline
    def setRecurrence(value: js.Array[String]): Self = StObject.set(x, "recurrence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecurrenceVarargs(value: String*): Self = StObject.set(x, "recurrence", js.Array(value :_*))
    
    @scala.inline
    def setRecurringEventId(value: String): Self = StObject.set(x, "recurringEventId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecurringEventIdUndefined: Self = StObject.set(x, "recurringEventId", js.undefined)
    
    @scala.inline
    def setReminders(value: UseDefault): Self = StObject.set(x, "reminders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSequence(value: integer): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: Title): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setStart(value: Date): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: EventStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransparency(value: EventTransparency): Self = StObject.set(x, "transparency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransparencyUndefined: Self = StObject.set(x, "transparency", js.undefined)
    
    @scala.inline
    def setUpdated(value: datetime): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibility(value: EventVisibility): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
  }
}
