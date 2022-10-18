package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatcherTriggerEventResult extends StObject {
  
  var manual: WatcherTriggerEventContainer
  
  var triggered_time: DateTime
  
  var `type`: String
}
object WatcherTriggerEventResult {
  
  inline def apply(manual: WatcherTriggerEventContainer, triggered_time: DateTime, `type`: String): WatcherTriggerEventResult = {
    val __obj = js.Dynamic.literal(manual = manual.asInstanceOf[js.Any], triggered_time = triggered_time.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatcherTriggerEventResult]
  }
  
  extension [Self <: WatcherTriggerEventResult](x: Self) {
    
    inline def setManual(value: WatcherTriggerEventContainer): Self = StObject.set(x, "manual", value.asInstanceOf[js.Any])
    
    inline def setTriggered_time(value: DateTime): Self = StObject.set(x, "triggered_time", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
