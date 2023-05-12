package typings.fullcalendarCore.internalCommonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.fullcalendarCore.anon.Type
  - typings.fullcalendarCore.anon.OptionName
  - typings.fullcalendarCore.anon.`0`
  - typings.fullcalendarCore.anon.`1`
  - typings.fullcalendarCore.anon.DateMarker
  - typings.fullcalendarCore.anon.ViewType
  - typings.fullcalendarCore.anon.Selection
  - typings.fullcalendarCore.anon.`2`
  - typings.fullcalendarCore.anon.EventInstanceId
  - typings.fullcalendarCore.anon.`3`
  - typings.fullcalendarCore.anon.State
  - typings.fullcalendarCore.anon.`4`
  - typings.fullcalendarCore.anon.StateType
  - typings.fullcalendarCore.anon.`5`
  - typings.fullcalendarCore.anon.Sources
  - typings.fullcalendarCore.anon.SourceId
  - typings.fullcalendarCore.anon.`6`
  - typings.fullcalendarCore.anon.IsRefetch
  - typings.fullcalendarCore.anon.FetchId
  - typings.fullcalendarCore.anon.Error
  - typings.fullcalendarCore.anon.EventStore
  - typings.fullcalendarCore.anon.EventStoreType
  - typings.fullcalendarCore.anon.RawEvents
  - typings.fullcalendarCore.anon.EventStoreEventStore
  - typings.fullcalendarCore.anon.EventStoreEventStoreType
  - typings.fullcalendarCore.anon.`7`
*/
trait Action extends StObject
object Action {
  
  inline def `0`(): typings.fullcalendarCore.anon.`0` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("PREV")
    __obj.asInstanceOf[typings.fullcalendarCore.anon.`0`]
  }
  
  inline def `1`(): typings.fullcalendarCore.anon.`1` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("NEXT")
    __obj.asInstanceOf[typings.fullcalendarCore.anon.`1`]
  }
  
  inline def `2`(): typings.fullcalendarCore.anon.`2` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("UNSELECT_DATES")
    __obj.asInstanceOf[typings.fullcalendarCore.anon.`2`]
  }
  
  inline def `3`(): typings.fullcalendarCore.anon.`3` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("UNSELECT_EVENT")
    __obj.asInstanceOf[typings.fullcalendarCore.anon.`3`]
  }
  
  inline def `4`(): typings.fullcalendarCore.anon.`4` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("UNSET_EVENT_DRAG")
    __obj.asInstanceOf[typings.fullcalendarCore.anon.`4`]
  }
  
  inline def `5`(): typings.fullcalendarCore.anon.`5` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("UNSET_EVENT_RESIZE")
    __obj.asInstanceOf[typings.fullcalendarCore.anon.`5`]
  }
  
  inline def `6`(): typings.fullcalendarCore.anon.`6` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("REMOVE_ALL_EVENT_SOURCES")
    __obj.asInstanceOf[typings.fullcalendarCore.anon.`6`]
  }
  
  inline def `7`(): typings.fullcalendarCore.anon.`7` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("REMOVE_ALL_EVENTS")
    __obj.asInstanceOf[typings.fullcalendarCore.anon.`7`]
  }
  
  inline def DateMarker(dateMarker: js.Date): typings.fullcalendarCore.anon.DateMarker = {
    val __obj = js.Dynamic.literal(dateMarker = dateMarker.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CHANGE_DATE")
    __obj.asInstanceOf[typings.fullcalendarCore.anon.DateMarker]
  }
  
  inline def Error(error: js.Error, fetchId: String, sourceId: String): typings.fullcalendarCore.anon.Error = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], fetchId = fetchId.asInstanceOf[js.Any], sourceId = sourceId.asInstanceOf[js.Any], fetchRange = null)
    __obj.updateDynamic("type")("RECEIVE_EVENT_ERROR")
    __obj.asInstanceOf[typings.fullcalendarCore.anon.Error]
  }
  
  inline def EventInstanceId(eventInstanceId: String): typings.fullcalendarCore.anon.EventInstanceId = {
    val __obj = js.Dynamic.literal(eventInstanceId = eventInstanceId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SELECT_EVENT")
    __obj.asInstanceOf[typings.fullcalendarCore.anon.EventInstanceId]
  }
  
  inline def EventStore(eventStore: typings.fullcalendarCore.internalCommonMod.EventStore): typings.fullcalendarCore.anon.EventStore = {
    val __obj = js.Dynamic.literal(eventStore = eventStore.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ADD_EVENTS")
    __obj.asInstanceOf[typings.fullcalendarCore.anon.EventStore]
  }
  
  inline def EventStoreEventStore(eventStore: EventStore): typings.fullcalendarCore.anon.EventStoreEventStore = {
    val __obj = js.Dynamic.literal(eventStore = eventStore.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("MERGE_EVENTS")
    __obj.asInstanceOf[typings.fullcalendarCore.anon.EventStoreEventStore]
  }
  
  inline def EventStoreEventStoreType(eventStore: EventStore): typings.fullcalendarCore.anon.EventStoreEventStoreType = {
    val __obj = js.Dynamic.literal(eventStore = eventStore.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("REMOVE_EVENTS")
    __obj.asInstanceOf[typings.fullcalendarCore.anon.EventStoreEventStoreType]
  }
  
  inline def EventStoreType(eventStore: EventStore): typings.fullcalendarCore.anon.EventStoreType = {
    val __obj = js.Dynamic.literal(eventStore = eventStore.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("RESET_EVENTS")
    __obj.asInstanceOf[typings.fullcalendarCore.anon.EventStoreType]
  }
  
  inline def FetchId(fetchId: String, rawEvents: js.Array[EventInput], sourceId: String): typings.fullcalendarCore.anon.FetchId = {
    val __obj = js.Dynamic.literal(fetchId = fetchId.asInstanceOf[js.Any], rawEvents = rawEvents.asInstanceOf[js.Any], sourceId = sourceId.asInstanceOf[js.Any], fetchRange = null)
    __obj.updateDynamic("type")("RECEIVE_EVENTS")
    __obj.asInstanceOf[typings.fullcalendarCore.anon.FetchId]
  }
  
  inline def IsRefetch(): typings.fullcalendarCore.anon.IsRefetch = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("FETCH_EVENT_SOURCES")
    __obj.asInstanceOf[typings.fullcalendarCore.anon.IsRefetch]
  }
  
  inline def OptionName(optionName: String, rawOptionValue: Any): typings.fullcalendarCore.anon.OptionName = {
    val __obj = js.Dynamic.literal(optionName = optionName.asInstanceOf[js.Any], rawOptionValue = rawOptionValue.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SET_OPTION")
    __obj.asInstanceOf[typings.fullcalendarCore.anon.OptionName]
  }
  
  inline def RawEvents(rawEvents: js.Array[EventInput], sourceId: String): typings.fullcalendarCore.anon.RawEvents = {
    val __obj = js.Dynamic.literal(rawEvents = rawEvents.asInstanceOf[js.Any], sourceId = sourceId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("RESET_RAW_EVENTS")
    __obj.asInstanceOf[typings.fullcalendarCore.anon.RawEvents]
  }
  
  inline def Selection(selection: DateSpan): typings.fullcalendarCore.anon.Selection = {
    val __obj = js.Dynamic.literal(selection = selection.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SELECT_DATES")
    __obj.asInstanceOf[typings.fullcalendarCore.anon.Selection]
  }
  
  inline def SourceId(sourceId: String): typings.fullcalendarCore.anon.SourceId = {
    val __obj = js.Dynamic.literal(sourceId = sourceId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("REMOVE_EVENT_SOURCE")
    __obj.asInstanceOf[typings.fullcalendarCore.anon.SourceId]
  }
  
  inline def Sources(sources: js.Array[EventSource[Any]]): typings.fullcalendarCore.anon.Sources = {
    val __obj = js.Dynamic.literal(sources = sources.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ADD_EVENT_SOURCES")
    __obj.asInstanceOf[typings.fullcalendarCore.anon.Sources]
  }
  
  inline def State(state: EventInteractionState): typings.fullcalendarCore.anon.State = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SET_EVENT_DRAG")
    __obj.asInstanceOf[typings.fullcalendarCore.anon.State]
  }
  
  inline def StateType(state: EventInteractionState): typings.fullcalendarCore.anon.StateType = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SET_EVENT_RESIZE")
    __obj.asInstanceOf[typings.fullcalendarCore.anon.StateType]
  }
  
  inline def Type(): typings.fullcalendarCore.anon.Type = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("NOTHING")
    __obj.asInstanceOf[typings.fullcalendarCore.anon.Type]
  }
  
  inline def ViewType(viewType: String): typings.fullcalendarCore.anon.ViewType = {
    val __obj = js.Dynamic.literal(viewType = viewType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CHANGE_VIEW_TYPE")
    __obj.asInstanceOf[typings.fullcalendarCore.anon.ViewType]
  }
}
