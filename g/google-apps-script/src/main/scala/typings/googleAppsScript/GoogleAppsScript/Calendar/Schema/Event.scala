package typings.googleAppsScript.GoogleAppsScript.Calendar.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Event extends js.Object {
  
  var anyoneCanAddSelf: js.UndefOr[Boolean] = js.native
  
  var attachments: js.UndefOr[js.Array[EventAttachment]] = js.native
  
  var attendees: js.UndefOr[js.Array[EventAttendee]] = js.native
  
  var attendeesOmitted: js.UndefOr[Boolean] = js.native
  
  var colorId: js.UndefOr[String] = js.native
  
  var conferenceData: js.UndefOr[ConferenceData] = js.native
  
  var created: js.UndefOr[String] = js.native
  
  var creator: js.UndefOr[EventCreator] = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var end: js.UndefOr[EventDateTime] = js.native
  
  var endTimeUnspecified: js.UndefOr[Boolean] = js.native
  
  var etag: js.UndefOr[String] = js.native
  
  var extendedProperties: js.UndefOr[EventExtendedProperties] = js.native
  
  var gadget: js.UndefOr[EventGadget] = js.native
  
  var guestsCanInviteOthers: js.UndefOr[Boolean] = js.native
  
  var guestsCanModify: js.UndefOr[Boolean] = js.native
  
  var guestsCanSeeOtherGuests: js.UndefOr[Boolean] = js.native
  
  var hangoutLink: js.UndefOr[String] = js.native
  
  var htmlLink: js.UndefOr[String] = js.native
  
  var iCalUID: js.UndefOr[String] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var kind: js.UndefOr[String] = js.native
  
  var location: js.UndefOr[String] = js.native
  
  var locked: js.UndefOr[Boolean] = js.native
  
  var organizer: js.UndefOr[EventOrganizer] = js.native
  
  var originalStartTime: js.UndefOr[EventDateTime] = js.native
  
  var privateCopy: js.UndefOr[Boolean] = js.native
  
  var recurrence: js.UndefOr[js.Array[String]] = js.native
  
  var recurringEventId: js.UndefOr[String] = js.native
  
  var reminders: js.UndefOr[EventReminders] = js.native
  
  var sequence: js.UndefOr[Double] = js.native
  
  var source: js.UndefOr[EventSource] = js.native
  
  var start: js.UndefOr[EventDateTime] = js.native
  
  var status: js.UndefOr[String] = js.native
  
  var summary: js.UndefOr[String] = js.native
  
  var transparency: js.UndefOr[String] = js.native
  
  var updated: js.UndefOr[String] = js.native
  
  var visibility: js.UndefOr[String] = js.native
}
object Event {
  
  @scala.inline
  def apply(): Event = {
    val __obj = js.Dynamic.literal()
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
    def setAnyoneCanAddSelf(value: Boolean): Self = this.set("anyoneCanAddSelf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnyoneCanAddSelf: Self = this.set("anyoneCanAddSelf", js.undefined)
    
    @scala.inline
    def setAttachmentsVarargs(value: EventAttachment*): Self = this.set("attachments", js.Array(value :_*))
    
    @scala.inline
    def setAttachments(value: js.Array[EventAttachment]): Self = this.set("attachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttachments: Self = this.set("attachments", js.undefined)
    
    @scala.inline
    def setAttendeesVarargs(value: EventAttendee*): Self = this.set("attendees", js.Array(value :_*))
    
    @scala.inline
    def setAttendees(value: js.Array[EventAttendee]): Self = this.set("attendees", value.asInstanceOf[js.Any])
    
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
    def setConferenceData(value: ConferenceData): Self = this.set("conferenceData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConferenceData: Self = this.set("conferenceData", js.undefined)
    
    @scala.inline
    def setCreated(value: String): Self = this.set("created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreated: Self = this.set("created", js.undefined)
    
    @scala.inline
    def setCreator(value: EventCreator): Self = this.set("creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreator: Self = this.set("creator", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setEnd(value: EventDateTime): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    
    @scala.inline
    def setEndTimeUnspecified(value: Boolean): Self = this.set("endTimeUnspecified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTimeUnspecified: Self = this.set("endTimeUnspecified", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    
    @scala.inline
    def setExtendedProperties(value: EventExtendedProperties): Self = this.set("extendedProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtendedProperties: Self = this.set("extendedProperties", js.undefined)
    
    @scala.inline
    def setGadget(value: EventGadget): Self = this.set("gadget", value.asInstanceOf[js.Any])
    
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
    def setHtmlLink(value: String): Self = this.set("htmlLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHtmlLink: Self = this.set("htmlLink", js.undefined)
    
    @scala.inline
    def setICalUID(value: String): Self = this.set("iCalUID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteICalUID: Self = this.set("iCalUID", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setLocked(value: Boolean): Self = this.set("locked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocked: Self = this.set("locked", js.undefined)
    
    @scala.inline
    def setOrganizer(value: EventOrganizer): Self = this.set("organizer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrganizer: Self = this.set("organizer", js.undefined)
    
    @scala.inline
    def setOriginalStartTime(value: EventDateTime): Self = this.set("originalStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginalStartTime: Self = this.set("originalStartTime", js.undefined)
    
    @scala.inline
    def setPrivateCopy(value: Boolean): Self = this.set("privateCopy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivateCopy: Self = this.set("privateCopy", js.undefined)
    
    @scala.inline
    def setRecurrenceVarargs(value: String*): Self = this.set("recurrence", js.Array(value :_*))
    
    @scala.inline
    def setRecurrence(value: js.Array[String]): Self = this.set("recurrence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecurrence: Self = this.set("recurrence", js.undefined)
    
    @scala.inline
    def setRecurringEventId(value: String): Self = this.set("recurringEventId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecurringEventId: Self = this.set("recurringEventId", js.undefined)
    
    @scala.inline
    def setReminders(value: EventReminders): Self = this.set("reminders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReminders: Self = this.set("reminders", js.undefined)
    
    @scala.inline
    def setSequence(value: Double): Self = this.set("sequence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSequence: Self = this.set("sequence", js.undefined)
    
    @scala.inline
    def setSource(value: EventSource): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    
    @scala.inline
    def setStart(value: EventDateTime): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setSummary(value: String): Self = this.set("summary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSummary: Self = this.set("summary", js.undefined)
    
    @scala.inline
    def setTransparency(value: String): Self = this.set("transparency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransparency: Self = this.set("transparency", js.undefined)
    
    @scala.inline
    def setUpdated(value: String): Self = this.set("updated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdated: Self = this.set("updated", js.undefined)
    
    @scala.inline
    def setVisibility(value: String): Self = this.set("visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisibility: Self = this.set("visibility", js.undefined)
  }
}
