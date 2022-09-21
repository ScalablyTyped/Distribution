package typings.fullcalendarCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.fullcalendarCommon.anon.Type
  - typings.fullcalendarCommon.anon.OptionName
  - typings.fullcalendarCommon.anon.`0`
  - typings.fullcalendarCommon.anon.`1`
  - typings.fullcalendarCommon.anon.DateMarker
  - typings.fullcalendarCommon.anon.ViewType
  - typings.fullcalendarCommon.anon.Selection
  - typings.fullcalendarCommon.anon.`2`
  - typings.fullcalendarCommon.anon.EventInstanceId
  - typings.fullcalendarCommon.anon.`3`
  - typings.fullcalendarCommon.anon.State
  - typings.fullcalendarCommon.anon.`4`
  - typings.fullcalendarCommon.anon.StateType
  - typings.fullcalendarCommon.anon.`5`
  - typings.fullcalendarCommon.anon.Sources
  - typings.fullcalendarCommon.anon.SourceId
  - typings.fullcalendarCommon.anon.`6`
  - typings.fullcalendarCommon.anon.IsRefetch
  - typings.fullcalendarCommon.anon.FetchId
  - typings.fullcalendarCommon.anon.Error
  - typings.fullcalendarCommon.anon.EventStore
  - typings.fullcalendarCommon.anon.EventStoreType
  - typings.fullcalendarCommon.anon.EventStoreEventStore
  - typings.fullcalendarCommon.anon.EventStoreEventStoreType
  - typings.fullcalendarCommon.anon.`7`
*/
trait Action extends StObject
object Action {
  
  inline def `0`(): typings.fullcalendarCommon.anon.`0` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("PREV")
    __obj.asInstanceOf[typings.fullcalendarCommon.anon.`0`]
  }
  
  inline def `1`(): typings.fullcalendarCommon.anon.`1` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("NEXT")
    __obj.asInstanceOf[typings.fullcalendarCommon.anon.`1`]
  }
  
  inline def `2`(): typings.fullcalendarCommon.anon.`2` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("UNSELECT_DATES")
    __obj.asInstanceOf[typings.fullcalendarCommon.anon.`2`]
  }
  
  inline def `3`(): typings.fullcalendarCommon.anon.`3` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("UNSELECT_EVENT")
    __obj.asInstanceOf[typings.fullcalendarCommon.anon.`3`]
  }
  
  inline def `4`(): typings.fullcalendarCommon.anon.`4` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("UNSET_EVENT_DRAG")
    __obj.asInstanceOf[typings.fullcalendarCommon.anon.`4`]
  }
  
  inline def `5`(): typings.fullcalendarCommon.anon.`5` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("UNSET_EVENT_RESIZE")
    __obj.asInstanceOf[typings.fullcalendarCommon.anon.`5`]
  }
  
  inline def `6`(): typings.fullcalendarCommon.anon.`6` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("REMOVE_ALL_EVENT_SOURCES")
    __obj.asInstanceOf[typings.fullcalendarCommon.anon.`6`]
  }
  
  inline def `7`(): typings.fullcalendarCommon.anon.`7` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("REMOVE_ALL_EVENTS")
    __obj.asInstanceOf[typings.fullcalendarCommon.anon.`7`]
  }
  
  inline def DateMarker(dateMarker: js.Date): typings.fullcalendarCommon.anon.DateMarker = {
    val __obj = js.Dynamic.literal(dateMarker = dateMarker.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CHANGE_DATE")
    __obj.asInstanceOf[typings.fullcalendarCommon.anon.DateMarker]
  }
  
  inline def Error(error: EventSourceError, fetchId: String, sourceId: String): typings.fullcalendarCommon.anon.Error = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], fetchId = fetchId.asInstanceOf[js.Any], sourceId = sourceId.asInstanceOf[js.Any], fetchRange = null)
    __obj.updateDynamic("type")("RECEIVE_EVENT_ERROR")
    __obj.asInstanceOf[typings.fullcalendarCommon.anon.Error]
  }
  
  inline def EventInstanceId(eventInstanceId: String): typings.fullcalendarCommon.anon.EventInstanceId = {
    val __obj = js.Dynamic.literal(eventInstanceId = eventInstanceId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SELECT_EVENT")
    __obj.asInstanceOf[typings.fullcalendarCommon.anon.EventInstanceId]
  }
  
  inline def EventStore(eventStore: typings.fullcalendarCommon.mod.EventStore): typings.fullcalendarCommon.anon.EventStore = {
    val __obj = js.Dynamic.literal(eventStore = eventStore.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ADD_EVENTS")
    __obj.asInstanceOf[typings.fullcalendarCommon.anon.EventStore]
  }
  
  inline def EventStoreEventStore(eventStore: EventStore): typings.fullcalendarCommon.anon.EventStoreEventStore = {
    val __obj = js.Dynamic.literal(eventStore = eventStore.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("MERGE_EVENTS")
    __obj.asInstanceOf[typings.fullcalendarCommon.anon.EventStoreEventStore]
  }
  
  inline def EventStoreEventStoreType(eventStore: EventStore): typings.fullcalendarCommon.anon.EventStoreEventStoreType = {
    val __obj = js.Dynamic.literal(eventStore = eventStore.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("REMOVE_EVENTS")
    __obj.asInstanceOf[typings.fullcalendarCommon.anon.EventStoreEventStoreType]
  }
  
  inline def EventStoreType(eventStore: EventStore): typings.fullcalendarCommon.anon.EventStoreType = {
    val __obj = js.Dynamic.literal(eventStore = eventStore.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("RESET_EVENTS")
    __obj.asInstanceOf[typings.fullcalendarCommon.anon.EventStoreType]
  }
  
  inline def FetchId(fetchId: String, rawEvents: js.Array[EventInput], sourceId: String): typings.fullcalendarCommon.anon.FetchId = {
    val __obj = js.Dynamic.literal(fetchId = fetchId.asInstanceOf[js.Any], rawEvents = rawEvents.asInstanceOf[js.Any], sourceId = sourceId.asInstanceOf[js.Any], fetchRange = null)
    __obj.updateDynamic("type")("RECEIVE_EVENTS")
    __obj.asInstanceOf[typings.fullcalendarCommon.anon.FetchId]
  }
  
  inline def IsRefetch(): typings.fullcalendarCommon.anon.IsRefetch = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("FETCH_EVENT_SOURCES")
    __obj.asInstanceOf[typings.fullcalendarCommon.anon.IsRefetch]
  }
  
  inline def OptionName(optionName: String, rawOptionValue: Any): typings.fullcalendarCommon.anon.OptionName = {
    val __obj = js.Dynamic.literal(optionName = optionName.asInstanceOf[js.Any], rawOptionValue = rawOptionValue.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SET_OPTION")
    __obj.asInstanceOf[typings.fullcalendarCommon.anon.OptionName]
  }
  
  inline def Selection(selection: DateSpan): typings.fullcalendarCommon.anon.Selection = {
    val __obj = js.Dynamic.literal(selection = selection.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SELECT_DATES")
    __obj.asInstanceOf[typings.fullcalendarCommon.anon.Selection]
  }
  
  inline def SourceId(sourceId: String): typings.fullcalendarCommon.anon.SourceId = {
    val __obj = js.Dynamic.literal(sourceId = sourceId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("REMOVE_EVENT_SOURCE")
    __obj.asInstanceOf[typings.fullcalendarCommon.anon.SourceId]
  }
  
  inline def Sources(sources: js.Array[EventSource[Any]]): typings.fullcalendarCommon.anon.Sources = {
    val __obj = js.Dynamic.literal(sources = sources.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ADD_EVENT_SOURCES")
    __obj.asInstanceOf[typings.fullcalendarCommon.anon.Sources]
  }
  
  inline def State(state: EventInteractionState): typings.fullcalendarCommon.anon.State = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SET_EVENT_DRAG")
    __obj.asInstanceOf[typings.fullcalendarCommon.anon.State]
  }
  
  inline def StateType(state: EventInteractionState): typings.fullcalendarCommon.anon.StateType = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SET_EVENT_RESIZE")
    __obj.asInstanceOf[typings.fullcalendarCommon.anon.StateType]
  }
  
  inline def Type(): typings.fullcalendarCommon.anon.Type = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("NOTHING")
    __obj.asInstanceOf[typings.fullcalendarCommon.anon.Type]
  }
  
  inline def ViewType(viewType: String): typings.fullcalendarCommon.anon.ViewType = {
    val __obj = js.Dynamic.literal(viewType = viewType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CHANGE_VIEW_TYPE")
    __obj.asInstanceOf[typings.fullcalendarCommon.anon.ViewType]
  }
}
