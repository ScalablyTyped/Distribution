package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatcherTriggerEventContainer extends StObject {
  
  var schedule: js.UndefOr[WatcherScheduleTriggerEvent] = js.undefined
}
object WatcherTriggerEventContainer {
  
  inline def apply(): WatcherTriggerEventContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WatcherTriggerEventContainer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WatcherTriggerEventContainer] (val x: Self) extends AnyVal {
    
    inline def setSchedule(value: WatcherScheduleTriggerEvent): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
    
    inline def setScheduleUndefined: Self = StObject.set(x, "schedule", js.undefined)
  }
}
