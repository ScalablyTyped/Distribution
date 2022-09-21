package typings.fullcalendarCommon.anon

import typings.fullcalendarCommon.fullcalendarCommonStrings.ADD_EVENT_SOURCES
import typings.fullcalendarCommon.mod.Action
import typings.fullcalendarCommon.mod.EventSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sources
  extends StObject
     with Action {
  
  var sources: js.Array[EventSource[Any]]
  
  var `type`: ADD_EVENT_SOURCES
}
object Sources {
  
  inline def apply(sources: js.Array[EventSource[Any]]): Sources = {
    val __obj = js.Dynamic.literal(sources = sources.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ADD_EVENT_SOURCES")
    __obj.asInstanceOf[Sources]
  }
  
  extension [Self <: Sources](x: Self) {
    
    inline def setSources(value: js.Array[EventSource[Any]]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    inline def setSourcesVarargs(value: EventSource[Any]*): Self = StObject.set(x, "sources", js.Array(value*))
    
    inline def setType(value: ADD_EVENT_SOURCES): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
