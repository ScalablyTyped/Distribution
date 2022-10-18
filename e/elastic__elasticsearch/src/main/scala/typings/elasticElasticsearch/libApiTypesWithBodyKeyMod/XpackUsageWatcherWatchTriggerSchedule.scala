package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XpackUsageWatcherWatchTriggerSchedule
  extends StObject
     with XpackUsageCounter {
  
  var _all: XpackUsageCounter
  
  var cron: XpackUsageCounter
}
object XpackUsageWatcherWatchTriggerSchedule {
  
  inline def apply(_all: XpackUsageCounter, active: long, cron: XpackUsageCounter, total: long): XpackUsageWatcherWatchTriggerSchedule = {
    val __obj = js.Dynamic.literal(_all = _all.asInstanceOf[js.Any], active = active.asInstanceOf[js.Any], cron = cron.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[XpackUsageWatcherWatchTriggerSchedule]
  }
  
  extension [Self <: XpackUsageWatcherWatchTriggerSchedule](x: Self) {
    
    inline def setCron(value: XpackUsageCounter): Self = StObject.set(x, "cron", value.asInstanceOf[js.Any])
    
    inline def set_all(value: XpackUsageCounter): Self = StObject.set(x, "_all", value.asInstanceOf[js.Any])
  }
}
