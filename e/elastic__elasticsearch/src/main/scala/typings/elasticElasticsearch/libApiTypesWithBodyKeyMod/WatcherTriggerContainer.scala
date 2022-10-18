package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatcherTriggerContainer extends StObject {
  
  var schedule: js.UndefOr[WatcherScheduleContainer] = js.undefined
}
object WatcherTriggerContainer {
  
  inline def apply(): WatcherTriggerContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WatcherTriggerContainer]
  }
  
  extension [Self <: WatcherTriggerContainer](x: Self) {
    
    inline def setSchedule(value: WatcherScheduleContainer): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
    
    inline def setScheduleUndefined: Self = StObject.set(x, "schedule", js.undefined)
  }
}
