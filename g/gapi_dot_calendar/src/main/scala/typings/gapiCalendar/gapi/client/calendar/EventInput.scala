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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventInput extends StObject {
  
  // Optional Properties
  var anyoneCanAddSelf: js.UndefOr[Boolean] = js.undefined
  
  // Required Properties
  var attachments: js.UndefOr[js.Array[FileUrl]] = js.undefined
  
  var attendees: js.UndefOr[js.Array[AdditionalGuests]] = js.undefined
  
  var colorId: js.UndefOr[String] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var end: Date
  
  var extendedProperties: js.UndefOr[Private] = js.undefined
  
  var gadget: js.UndefOr[Display] = js.undefined
  
  var guestsCanInviteOthers: js.UndefOr[Boolean] = js.undefined
  
  var guestsCanSeeOtherGuests: js.UndefOr[Boolean] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var location: js.UndefOr[String] = js.undefined
  
  var originalStartTime: js.UndefOr[DateTime] = js.undefined
  
  var recurrence: js.UndefOr[js.Array[String]] = js.undefined
  
  var reminders: js.UndefOr[Overrides] = js.undefined
  
  var sequence: js.UndefOr[integer] = js.undefined
  
  var source: js.UndefOr[Title] = js.undefined
  
  var start: Date
  
  var status: js.UndefOr[EventStatus] = js.undefined
  
  var summary: js.UndefOr[String] = js.undefined
  
  var transparency: js.UndefOr[EventTransparency] = js.undefined
  
  var visibility: js.UndefOr[EventVisibility] = js.undefined
}
object EventInput {
  
  inline def apply(end: Date, start: Date): EventInput = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventInput]
  }
  
  extension [Self <: EventInput](x: Self) {
    
    inline def setAnyoneCanAddSelf(value: Boolean): Self = StObject.set(x, "anyoneCanAddSelf", value.asInstanceOf[js.Any])
    
    inline def setAnyoneCanAddSelfUndefined: Self = StObject.set(x, "anyoneCanAddSelf", js.undefined)
    
    inline def setAttachments(value: js.Array[FileUrl]): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
    
    inline def setAttachmentsUndefined: Self = StObject.set(x, "attachments", js.undefined)
    
    inline def setAttachmentsVarargs(value: FileUrl*): Self = StObject.set(x, "attachments", js.Array(value :_*))
    
    inline def setAttendees(value: js.Array[AdditionalGuests]): Self = StObject.set(x, "attendees", value.asInstanceOf[js.Any])
    
    inline def setAttendeesUndefined: Self = StObject.set(x, "attendees", js.undefined)
    
    inline def setAttendeesVarargs(value: AdditionalGuests*): Self = StObject.set(x, "attendees", js.Array(value :_*))
    
    inline def setColorId(value: String): Self = StObject.set(x, "colorId", value.asInstanceOf[js.Any])
    
    inline def setColorIdUndefined: Self = StObject.set(x, "colorId", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEnd(value: Date): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setExtendedProperties(value: Private): Self = StObject.set(x, "extendedProperties", value.asInstanceOf[js.Any])
    
    inline def setExtendedPropertiesUndefined: Self = StObject.set(x, "extendedProperties", js.undefined)
    
    inline def setGadget(value: Display): Self = StObject.set(x, "gadget", value.asInstanceOf[js.Any])
    
    inline def setGadgetUndefined: Self = StObject.set(x, "gadget", js.undefined)
    
    inline def setGuestsCanInviteOthers(value: Boolean): Self = StObject.set(x, "guestsCanInviteOthers", value.asInstanceOf[js.Any])
    
    inline def setGuestsCanInviteOthersUndefined: Self = StObject.set(x, "guestsCanInviteOthers", js.undefined)
    
    inline def setGuestsCanSeeOtherGuests(value: Boolean): Self = StObject.set(x, "guestsCanSeeOtherGuests", value.asInstanceOf[js.Any])
    
    inline def setGuestsCanSeeOtherGuestsUndefined: Self = StObject.set(x, "guestsCanSeeOtherGuests", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setOriginalStartTime(value: DateTime): Self = StObject.set(x, "originalStartTime", value.asInstanceOf[js.Any])
    
    inline def setOriginalStartTimeUndefined: Self = StObject.set(x, "originalStartTime", js.undefined)
    
    inline def setRecurrence(value: js.Array[String]): Self = StObject.set(x, "recurrence", value.asInstanceOf[js.Any])
    
    inline def setRecurrenceUndefined: Self = StObject.set(x, "recurrence", js.undefined)
    
    inline def setRecurrenceVarargs(value: String*): Self = StObject.set(x, "recurrence", js.Array(value :_*))
    
    inline def setReminders(value: Overrides): Self = StObject.set(x, "reminders", value.asInstanceOf[js.Any])
    
    inline def setRemindersUndefined: Self = StObject.set(x, "reminders", js.undefined)
    
    inline def setSequence(value: integer): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
    
    inline def setSequenceUndefined: Self = StObject.set(x, "sequence", js.undefined)
    
    inline def setSource(value: Title): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setStart(value: Date): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: EventStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    inline def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
    
    inline def setTransparency(value: EventTransparency): Self = StObject.set(x, "transparency", value.asInstanceOf[js.Any])
    
    inline def setTransparencyUndefined: Self = StObject.set(x, "transparency", js.undefined)
    
    inline def setVisibility(value: EventVisibility): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    inline def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
  }
}
