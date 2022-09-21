package typings.fullcalendarCommon.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuiltInCalendarOptionRefiners extends StObject {
  
  def buttonHints(raw: ButtonHintCompoundInput): ButtonHintCompoundInput
  @JSName("buttonHints")
  var buttonHints_Original: Identity_[ButtonHintCompoundInput]
  
  def buttonText(raw: ButtonTextCompoundInput): ButtonTextCompoundInput
  @JSName("buttonText")
  var buttonText_Original: Identity_[ButtonTextCompoundInput]
  
  def eventSources(raw: js.Array[EventSourceInput]): js.Array[EventSourceInput]
  @JSName("eventSources")
  var eventSources_Original: Identity_[js.Array[EventSourceInput]]
  
  def events(raw: EventSourceInput): EventSourceInput
  @JSName("events")
  var events_Original: Identity_[EventSourceInput]
  
  def initialEvents(raw: EventSourceInput): EventSourceInput
  @JSName("initialEvents")
  var initialEvents_Original: Identity_[EventSourceInput]
  
  def plugins(raw: js.Array[PluginDef]): js.Array[PluginDef]
  @JSName("plugins")
  var plugins_Original: Identity_[js.Array[PluginDef]]
  
  def views(raw: StringDictionary[ViewOptions]): StringDictionary[ViewOptions]
  @JSName("views")
  var views_Original: Identity_[StringDictionary[ViewOptions]]
}
object BuiltInCalendarOptionRefiners {
  
  inline def apply(
    buttonHints: ButtonHintCompoundInput => ButtonHintCompoundInput,
    buttonText: ButtonTextCompoundInput => ButtonTextCompoundInput,
    eventSources: js.Array[EventSourceInput] => js.Array[EventSourceInput],
    events: EventSourceInput => EventSourceInput,
    initialEvents: EventSourceInput => EventSourceInput,
    plugins: js.Array[PluginDef] => js.Array[PluginDef],
    views: StringDictionary[ViewOptions] => StringDictionary[ViewOptions]
  ): BuiltInCalendarOptionRefiners = {
    val __obj = js.Dynamic.literal(buttonHints = js.Any.fromFunction1(buttonHints), buttonText = js.Any.fromFunction1(buttonText), eventSources = js.Any.fromFunction1(eventSources), events = js.Any.fromFunction1(events), initialEvents = js.Any.fromFunction1(initialEvents), plugins = js.Any.fromFunction1(plugins), views = js.Any.fromFunction1(views))
    __obj.asInstanceOf[BuiltInCalendarOptionRefiners]
  }
  
  extension [Self <: BuiltInCalendarOptionRefiners](x: Self) {
    
    inline def setButtonHints(value: ButtonHintCompoundInput => ButtonHintCompoundInput): Self = StObject.set(x, "buttonHints", js.Any.fromFunction1(value))
    
    inline def setButtonText(value: ButtonTextCompoundInput => ButtonTextCompoundInput): Self = StObject.set(x, "buttonText", js.Any.fromFunction1(value))
    
    inline def setEventSources(value: js.Array[EventSourceInput] => js.Array[EventSourceInput]): Self = StObject.set(x, "eventSources", js.Any.fromFunction1(value))
    
    inline def setEvents(value: EventSourceInput => EventSourceInput): Self = StObject.set(x, "events", js.Any.fromFunction1(value))
    
    inline def setInitialEvents(value: EventSourceInput => EventSourceInput): Self = StObject.set(x, "initialEvents", js.Any.fromFunction1(value))
    
    inline def setPlugins(value: js.Array[PluginDef] => js.Array[PluginDef]): Self = StObject.set(x, "plugins", js.Any.fromFunction1(value))
    
    inline def setViews(value: StringDictionary[ViewOptions] => StringDictionary[ViewOptions]): Self = StObject.set(x, "views", js.Any.fromFunction1(value))
  }
}
