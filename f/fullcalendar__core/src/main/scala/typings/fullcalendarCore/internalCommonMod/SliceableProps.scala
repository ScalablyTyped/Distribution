package typings.fullcalendarCore.internalCommonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SliceableProps extends StObject {
  
  var businessHours: EventStore
  
  var dateSelection: DateSpan
  
  var eventDrag: EventInteractionState | Null
  
  var eventResize: EventInteractionState | Null
  
  var eventSelection: String
  
  var eventStore: EventStore
  
  var eventUiBases: EventUiHash
}
object SliceableProps {
  
  inline def apply(
    businessHours: EventStore,
    dateSelection: DateSpan,
    eventSelection: String,
    eventStore: EventStore,
    eventUiBases: EventUiHash
  ): SliceableProps = {
    val __obj = js.Dynamic.literal(businessHours = businessHours.asInstanceOf[js.Any], dateSelection = dateSelection.asInstanceOf[js.Any], eventSelection = eventSelection.asInstanceOf[js.Any], eventStore = eventStore.asInstanceOf[js.Any], eventUiBases = eventUiBases.asInstanceOf[js.Any], eventDrag = null, eventResize = null)
    __obj.asInstanceOf[SliceableProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SliceableProps] (val x: Self) extends AnyVal {
    
    inline def setBusinessHours(value: EventStore): Self = StObject.set(x, "businessHours", value.asInstanceOf[js.Any])
    
    inline def setDateSelection(value: DateSpan): Self = StObject.set(x, "dateSelection", value.asInstanceOf[js.Any])
    
    inline def setEventDrag(value: EventInteractionState): Self = StObject.set(x, "eventDrag", value.asInstanceOf[js.Any])
    
    inline def setEventDragNull: Self = StObject.set(x, "eventDrag", null)
    
    inline def setEventResize(value: EventInteractionState): Self = StObject.set(x, "eventResize", value.asInstanceOf[js.Any])
    
    inline def setEventResizeNull: Self = StObject.set(x, "eventResize", null)
    
    inline def setEventSelection(value: String): Self = StObject.set(x, "eventSelection", value.asInstanceOf[js.Any])
    
    inline def setEventStore(value: EventStore): Self = StObject.set(x, "eventStore", value.asInstanceOf[js.Any])
    
    inline def setEventUiBases(value: EventUiHash): Self = StObject.set(x, "eventUiBases", value.asInstanceOf[js.Any])
  }
}
