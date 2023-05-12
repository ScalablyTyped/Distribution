package typings.fullcalendarCore.internalCommonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CalendarDataManagerState extends StObject {
  
  var businessHours: EventStore
  
  var currentDate: js.Date
  
  var currentViewType: String
  
  var dateProfile: DateProfile
  
  var dateSelection: DateSpan | Null
  
  var dynamicOptionOverrides: CalendarOptions
  
  var eventDrag: EventInteractionState | Null
  
  var eventResize: EventInteractionState | Null
  
  var eventSelection: String
  
  var eventSources: EventSourceHash
  
  var eventStore: EventStore
  
  var eventUiBases: EventUiHash
  
  var renderableEventStore: EventStore
  
  var selectionConfig: EventUi
}
object CalendarDataManagerState {
  
  inline def apply(
    businessHours: EventStore,
    currentDate: js.Date,
    currentViewType: String,
    dateProfile: DateProfile,
    dynamicOptionOverrides: CalendarOptions,
    eventSelection: String,
    eventSources: EventSourceHash,
    eventStore: EventStore,
    eventUiBases: EventUiHash,
    renderableEventStore: EventStore,
    selectionConfig: EventUi
  ): CalendarDataManagerState = {
    val __obj = js.Dynamic.literal(businessHours = businessHours.asInstanceOf[js.Any], currentDate = currentDate.asInstanceOf[js.Any], currentViewType = currentViewType.asInstanceOf[js.Any], dateProfile = dateProfile.asInstanceOf[js.Any], dynamicOptionOverrides = dynamicOptionOverrides.asInstanceOf[js.Any], eventSelection = eventSelection.asInstanceOf[js.Any], eventSources = eventSources.asInstanceOf[js.Any], eventStore = eventStore.asInstanceOf[js.Any], eventUiBases = eventUiBases.asInstanceOf[js.Any], renderableEventStore = renderableEventStore.asInstanceOf[js.Any], selectionConfig = selectionConfig.asInstanceOf[js.Any], dateSelection = null, eventDrag = null, eventResize = null)
    __obj.asInstanceOf[CalendarDataManagerState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CalendarDataManagerState] (val x: Self) extends AnyVal {
    
    inline def setBusinessHours(value: EventStore): Self = StObject.set(x, "businessHours", value.asInstanceOf[js.Any])
    
    inline def setCurrentDate(value: js.Date): Self = StObject.set(x, "currentDate", value.asInstanceOf[js.Any])
    
    inline def setCurrentViewType(value: String): Self = StObject.set(x, "currentViewType", value.asInstanceOf[js.Any])
    
    inline def setDateProfile(value: DateProfile): Self = StObject.set(x, "dateProfile", value.asInstanceOf[js.Any])
    
    inline def setDateSelection(value: DateSpan): Self = StObject.set(x, "dateSelection", value.asInstanceOf[js.Any])
    
    inline def setDateSelectionNull: Self = StObject.set(x, "dateSelection", null)
    
    inline def setDynamicOptionOverrides(value: CalendarOptions): Self = StObject.set(x, "dynamicOptionOverrides", value.asInstanceOf[js.Any])
    
    inline def setEventDrag(value: EventInteractionState): Self = StObject.set(x, "eventDrag", value.asInstanceOf[js.Any])
    
    inline def setEventDragNull: Self = StObject.set(x, "eventDrag", null)
    
    inline def setEventResize(value: EventInteractionState): Self = StObject.set(x, "eventResize", value.asInstanceOf[js.Any])
    
    inline def setEventResizeNull: Self = StObject.set(x, "eventResize", null)
    
    inline def setEventSelection(value: String): Self = StObject.set(x, "eventSelection", value.asInstanceOf[js.Any])
    
    inline def setEventSources(value: EventSourceHash): Self = StObject.set(x, "eventSources", value.asInstanceOf[js.Any])
    
    inline def setEventStore(value: EventStore): Self = StObject.set(x, "eventStore", value.asInstanceOf[js.Any])
    
    inline def setEventUiBases(value: EventUiHash): Self = StObject.set(x, "eventUiBases", value.asInstanceOf[js.Any])
    
    inline def setRenderableEventStore(value: EventStore): Self = StObject.set(x, "renderableEventStore", value.asInstanceOf[js.Any])
    
    inline def setSelectionConfig(value: EventUi): Self = StObject.set(x, "selectionConfig", value.asInstanceOf[js.Any])
  }
}
