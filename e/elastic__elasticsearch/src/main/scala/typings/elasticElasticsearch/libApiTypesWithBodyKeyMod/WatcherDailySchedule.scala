package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatcherDailySchedule extends StObject {
  
  var at: js.Array[WatcherScheduleTimeOfDay]
}
object WatcherDailySchedule {
  
  inline def apply(at: js.Array[WatcherScheduleTimeOfDay]): WatcherDailySchedule = {
    val __obj = js.Dynamic.literal(at = at.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatcherDailySchedule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WatcherDailySchedule] (val x: Self) extends AnyVal {
    
    inline def setAt(value: js.Array[WatcherScheduleTimeOfDay]): Self = StObject.set(x, "at", value.asInstanceOf[js.Any])
    
    inline def setAtVarargs(value: WatcherScheduleTimeOfDay*): Self = StObject.set(x, "at", js.Array(value*))
  }
}
