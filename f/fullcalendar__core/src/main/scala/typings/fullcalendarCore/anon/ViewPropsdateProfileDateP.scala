package typings.fullcalendarCore.anon

import typings.fullcalendarCore.internalCommonMod.DateProfile
import typings.fullcalendarCore.internalCommonMod.DateSpan
import typings.fullcalendarCore.internalCommonMod.EventInteractionState
import typings.fullcalendarCore.internalCommonMod.EventUiHash
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @fullcalendar/core.@fullcalendar/core/internal-common.ViewProps & {  dateProfile :@fullcalendar/core.@fullcalendar/core/internal-common.DateProfile,   nextDayThreshold :@fullcalendar/core.@fullcalendar/core/internal-common.Duration} */
trait ViewPropsdateProfileDateP extends StObject {
  
  var businessHours: typings.fullcalendarCore.internalCommonMod.EventStore
  
  var dateProfile: DateProfile
  
  var dateSelection: DateSpan | Null
  
  var eventDrag: EventInteractionState | Null
  
  var eventResize: EventInteractionState | Null
  
  var eventSelection: String
  
  var eventStore: typings.fullcalendarCore.internalCommonMod.EventStore
  
  var eventUiBases: EventUiHash
  
  var forPrint: Boolean
  
  var isHeightAuto: Boolean
  
  var nextDayThreshold: typings.fullcalendarCore.internalCommonMod.Duration
}
object ViewPropsdateProfileDateP {
  
  inline def apply(
    businessHours: typings.fullcalendarCore.internalCommonMod.EventStore,
    dateProfile: DateProfile,
    eventSelection: String,
    eventStore: typings.fullcalendarCore.internalCommonMod.EventStore,
    eventUiBases: EventUiHash,
    forPrint: Boolean,
    isHeightAuto: Boolean,
    nextDayThreshold: typings.fullcalendarCore.internalCommonMod.Duration
  ): ViewPropsdateProfileDateP = {
    val __obj = js.Dynamic.literal(businessHours = businessHours.asInstanceOf[js.Any], dateProfile = dateProfile.asInstanceOf[js.Any], eventSelection = eventSelection.asInstanceOf[js.Any], eventStore = eventStore.asInstanceOf[js.Any], eventUiBases = eventUiBases.asInstanceOf[js.Any], forPrint = forPrint.asInstanceOf[js.Any], isHeightAuto = isHeightAuto.asInstanceOf[js.Any], nextDayThreshold = nextDayThreshold.asInstanceOf[js.Any], dateSelection = null, eventDrag = null, eventResize = null)
    __obj.asInstanceOf[ViewPropsdateProfileDateP]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ViewPropsdateProfileDateP] (val x: Self) extends AnyVal {
    
    inline def setBusinessHours(value: typings.fullcalendarCore.internalCommonMod.EventStore): Self = StObject.set(x, "businessHours", value.asInstanceOf[js.Any])
    
    inline def setDateProfile(value: DateProfile): Self = StObject.set(x, "dateProfile", value.asInstanceOf[js.Any])
    
    inline def setDateSelection(value: DateSpan): Self = StObject.set(x, "dateSelection", value.asInstanceOf[js.Any])
    
    inline def setDateSelectionNull: Self = StObject.set(x, "dateSelection", null)
    
    inline def setEventDrag(value: EventInteractionState): Self = StObject.set(x, "eventDrag", value.asInstanceOf[js.Any])
    
    inline def setEventDragNull: Self = StObject.set(x, "eventDrag", null)
    
    inline def setEventResize(value: EventInteractionState): Self = StObject.set(x, "eventResize", value.asInstanceOf[js.Any])
    
    inline def setEventResizeNull: Self = StObject.set(x, "eventResize", null)
    
    inline def setEventSelection(value: String): Self = StObject.set(x, "eventSelection", value.asInstanceOf[js.Any])
    
    inline def setEventStore(value: typings.fullcalendarCore.internalCommonMod.EventStore): Self = StObject.set(x, "eventStore", value.asInstanceOf[js.Any])
    
    inline def setEventUiBases(value: EventUiHash): Self = StObject.set(x, "eventUiBases", value.asInstanceOf[js.Any])
    
    inline def setForPrint(value: Boolean): Self = StObject.set(x, "forPrint", value.asInstanceOf[js.Any])
    
    inline def setIsHeightAuto(value: Boolean): Self = StObject.set(x, "isHeightAuto", value.asInstanceOf[js.Any])
    
    inline def setNextDayThreshold(value: typings.fullcalendarCore.internalCommonMod.Duration): Self = StObject.set(x, "nextDayThreshold", value.asInstanceOf[js.Any])
  }
}
