package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XpackUsageWatcherWatchTrigger extends StObject {
  
  var _all: XpackUsageCounter
  
  var schedule: js.UndefOr[XpackUsageWatcherWatchTriggerSchedule] = js.undefined
}
object XpackUsageWatcherWatchTrigger {
  
  inline def apply(_all: XpackUsageCounter): XpackUsageWatcherWatchTrigger = {
    val __obj = js.Dynamic.literal(_all = _all.asInstanceOf[js.Any])
    __obj.asInstanceOf[XpackUsageWatcherWatchTrigger]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XpackUsageWatcherWatchTrigger] (val x: Self) extends AnyVal {
    
    inline def setSchedule(value: XpackUsageWatcherWatchTriggerSchedule): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
    
    inline def setScheduleUndefined: Self = StObject.set(x, "schedule", js.undefined)
    
    inline def set_all(value: XpackUsageCounter): Self = StObject.set(x, "_all", value.asInstanceOf[js.Any])
  }
}
