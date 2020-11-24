package typings.gapiCalendar.gapi.client.calendar

import typings.gapiCalendar.anon.AdditionalGuests
import typings.gapiCalendar.anon.Date
import typings.gapiCalendar.anon.DateTime
import typings.gapiCalendar.anon.Display
import typings.gapiCalendar.anon.FileUrl
import typings.gapiCalendar.anon.Overrides
import typings.gapiCalendar.anon.Private
import typings.gapiCalendar.anon.Title
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventInput extends js.Object {
  
  // Optional Properties
  var anyoneCanAddSelf: js.UndefOr[Boolean] = js.native
  
  // Required Properties
  var attachments: js.UndefOr[js.Array[FileUrl]] = js.native
  
  var attendees: js.UndefOr[js.Array[AdditionalGuests]] = js.native
  
  var colorId: js.UndefOr[String] = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var end: Date = js.native
  
  var extendedProperties: js.UndefOr[Private] = js.native
  
  var gadget: js.UndefOr[Display] = js.native
  
  var guestsCanInviteOthers: js.UndefOr[Boolean] = js.native
  
  var guestsCanSeeOtherGuests: js.UndefOr[Boolean] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var location: js.UndefOr[String] = js.native
  
  var originalStartTime: js.UndefOr[DateTime] = js.native
  
  var recurrence: js.UndefOr[js.Array[String]] = js.native
  
  var reminders: js.UndefOr[Overrides] = js.native
  
  var sequence: js.UndefOr[integer] = js.native
  
  var source: js.UndefOr[Title] = js.native
  
  var start: Date = js.native
  
  var status: js.UndefOr[EventStatus] = js.native
  
  var summary: js.UndefOr[String] = js.native
  
  var transparency: js.UndefOr[EventTransparency] = js.native
  
  var visibility: js.UndefOr[EventVisibility] = js.native
}
object EventInput {
  
  @scala.inline
  def apply(end: Date, start: Date): EventInput = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventInput]
  }
  
  @scala.inline
  implicit class EventInputOps[Self <: EventInput] (val x: Self) extends AnyVal {
    
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
    def setEnd(value: Date): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Date): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnyoneCanAddSelf(value: Boolean): Self = this.set("anyoneCanAddSelf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnyoneCanAddSelf: Self = this.set("anyoneCanAddSelf", js.undefined)
    
    @scala.inline
    def setAttachmentsVarargs(value: FileUrl*): Self = this.set("attachments", js.Array(value :_*))
    
    @scala.inline
    def setAttachments(value: js.Array[FileUrl]): Self = this.set("attachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttachments: Self = this.set("attachments", js.undefined)
    
    @scala.inline
    def setAttendeesVarargs(value: AdditionalGuests*): Self = this.set("attendees", js.Array(value :_*))
    
    @scala.inline
    def setAttendees(value: js.Array[AdditionalGuests]): Self = this.set("attendees", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttendees: Self = this.set("attendees", js.undefined)
    
    @scala.inline
    def setColorId(value: String): Self = this.set("colorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorId: Self = this.set("colorId", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setExtendedProperties(value: Private): Self = this.set("extendedProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtendedProperties: Self = this.set("extendedProperties", js.undefined)
    
    @scala.inline
    def setGadget(value: Display): Self = this.set("gadget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGadget: Self = this.set("gadget", js.undefined)
    
    @scala.inline
    def setGuestsCanInviteOthers(value: Boolean): Self = this.set("guestsCanInviteOthers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGuestsCanInviteOthers: Self = this.set("guestsCanInviteOthers", js.undefined)
    
    @scala.inline
    def setGuestsCanSeeOtherGuests(value: Boolean): Self = this.set("guestsCanSeeOtherGuests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGuestsCanSeeOtherGuests: Self = this.set("guestsCanSeeOtherGuests", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setOriginalStartTime(value: DateTime): Self = this.set("originalStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginalStartTime: Self = this.set("originalStartTime", js.undefined)
    
    @scala.inline
    def setRecurrenceVarargs(value: String*): Self = this.set("recurrence", js.Array(value :_*))
    
    @scala.inline
    def setRecurrence(value: js.Array[String]): Self = this.set("recurrence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecurrence: Self = this.set("recurrence", js.undefined)
    
    @scala.inline
    def setReminders(value: Overrides): Self = this.set("reminders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReminders: Self = this.set("reminders", js.undefined)
    
    @scala.inline
    def setSequence(value: integer): Self = this.set("sequence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSequence: Self = this.set("sequence", js.undefined)
    
    @scala.inline
    def setSource(value: Title): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    
    @scala.inline
    def setStatus(value: EventStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setSummary(value: String): Self = this.set("summary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSummary: Self = this.set("summary", js.undefined)
    
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
