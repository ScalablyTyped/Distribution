package typings.gapiCalendar.gapi.client.calendar

import typings.gapiCalendar.anon.AdditionalGuests
import typings.gapiCalendar.anon.Date
import typings.gapiCalendar.anon.DateTime
import typings.gapiCalendar.anon.Display
import typings.gapiCalendar.anon.FileUrl
import typings.gapiCalendar.anon.Overrides
import typings.gapiCalendar.anon.Private
import typings.gapiCalendar.anon.Title
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventInput extends StObject {
  
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
  implicit class EventInputMutableBuilder[Self <: EventInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnyoneCanAddSelf(value: Boolean): Self = StObject.set(x, "anyoneCanAddSelf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnyoneCanAddSelfUndefined: Self = StObject.set(x, "anyoneCanAddSelf", js.undefined)
    
    @scala.inline
    def setAttachments(value: js.Array[FileUrl]): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentsUndefined: Self = StObject.set(x, "attachments", js.undefined)
    
    @scala.inline
    def setAttachmentsVarargs(value: FileUrl*): Self = StObject.set(x, "attachments", js.Array(value :_*))
    
    @scala.inline
    def setAttendees(value: js.Array[AdditionalGuests]): Self = StObject.set(x, "attendees", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttendeesUndefined: Self = StObject.set(x, "attendees", js.undefined)
    
    @scala.inline
    def setAttendeesVarargs(value: AdditionalGuests*): Self = StObject.set(x, "attendees", js.Array(value :_*))
    
    @scala.inline
    def setColorId(value: String): Self = StObject.set(x, "colorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorIdUndefined: Self = StObject.set(x, "colorId", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setEnd(value: Date): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtendedProperties(value: Private): Self = StObject.set(x, "extendedProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtendedPropertiesUndefined: Self = StObject.set(x, "extendedProperties", js.undefined)
    
    @scala.inline
    def setGadget(value: Display): Self = StObject.set(x, "gadget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGadgetUndefined: Self = StObject.set(x, "gadget", js.undefined)
    
    @scala.inline
    def setGuestsCanInviteOthers(value: Boolean): Self = StObject.set(x, "guestsCanInviteOthers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGuestsCanInviteOthersUndefined: Self = StObject.set(x, "guestsCanInviteOthers", js.undefined)
    
    @scala.inline
    def setGuestsCanSeeOtherGuests(value: Boolean): Self = StObject.set(x, "guestsCanSeeOtherGuests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGuestsCanSeeOtherGuestsUndefined: Self = StObject.set(x, "guestsCanSeeOtherGuests", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setOriginalStartTime(value: DateTime): Self = StObject.set(x, "originalStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalStartTimeUndefined: Self = StObject.set(x, "originalStartTime", js.undefined)
    
    @scala.inline
    def setRecurrence(value: js.Array[String]): Self = StObject.set(x, "recurrence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecurrenceUndefined: Self = StObject.set(x, "recurrence", js.undefined)
    
    @scala.inline
    def setRecurrenceVarargs(value: String*): Self = StObject.set(x, "recurrence", js.Array(value :_*))
    
    @scala.inline
    def setReminders(value: Overrides): Self = StObject.set(x, "reminders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemindersUndefined: Self = StObject.set(x, "reminders", js.undefined)
    
    @scala.inline
    def setSequence(value: integer): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSequenceUndefined: Self = StObject.set(x, "sequence", js.undefined)
    
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
    def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
    
    @scala.inline
    def setTransparency(value: EventTransparency): Self = StObject.set(x, "transparency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransparencyUndefined: Self = StObject.set(x, "transparency", js.undefined)
    
    @scala.inline
    def setVisibility(value: EventVisibility): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
  }
}
