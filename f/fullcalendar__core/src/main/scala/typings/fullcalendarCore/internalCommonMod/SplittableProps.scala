package typings.fullcalendarCore.internalCommonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SplittableProps extends StObject {
  
  var businessHours: EventStore | Null
  
  var dateSelection: DateSpan | Null
  
  var eventDrag: EventInteractionState | Null
  
  var eventResize: EventInteractionState | Null
  
  var eventSelection: String
  
  var eventStore: EventStore
  
  var eventUiBases: EventUiHash
}
object SplittableProps {
  
  inline def apply(eventSelection: String, eventStore: EventStore, eventUiBases: EventUiHash): SplittableProps = {
    val __obj = js.Dynamic.literal(eventSelection = eventSelection.asInstanceOf[js.Any], eventStore = eventStore.asInstanceOf[js.Any], eventUiBases = eventUiBases.asInstanceOf[js.Any], businessHours = null, dateSelection = null, eventDrag = null, eventResize = null)
    __obj.asInstanceOf[SplittableProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SplittableProps] (val x: Self) extends AnyVal {
    
    inline def setBusinessHours(value: EventStore): Self = StObject.set(x, "businessHours", value.asInstanceOf[js.Any])
    
    inline def setBusinessHoursNull: Self = StObject.set(x, "businessHours", null)
    
    inline def setDateSelection(value: DateSpan): Self = StObject.set(x, "dateSelection", value.asInstanceOf[js.Any])
    
    inline def setDateSelectionNull: Self = StObject.set(x, "dateSelection", null)
    
    inline def setEventDrag(value: EventInteractionState): Self = StObject.set(x, "eventDrag", value.asInstanceOf[js.Any])
    
    inline def setEventDragNull: Self = StObject.set(x, "eventDrag", null)
    
    inline def setEventResize(value: EventInteractionState): Self = StObject.set(x, "eventResize", value.asInstanceOf[js.Any])
    
    inline def setEventResizeNull: Self = StObject.set(x, "eventResize", null)
    
    inline def setEventSelection(value: String): Self = StObject.set(x, "eventSelection", value.asInstanceOf[js.Any])
    
    inline def setEventStore(value: EventStore): Self = StObject.set(x, "eventStore", value.asInstanceOf[js.Any])
    
    inline def setEventUiBases(value: EventUiHash): Self = StObject.set(x, "eventUiBases", value.asInstanceOf[js.Any])
  }
}
