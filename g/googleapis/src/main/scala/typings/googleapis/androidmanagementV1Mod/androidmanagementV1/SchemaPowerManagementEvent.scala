package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPowerManagementEvent extends StObject {
  
  /**
    * For BATTERY_LEVEL_COLLECTED events, the battery level as a percentage.
    */
  var batteryLevel: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The creation time of the event.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Event type.
    */
  var eventType: js.UndefOr[String | Null] = js.undefined
}
object SchemaPowerManagementEvent {
  
  inline def apply(): SchemaPowerManagementEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPowerManagementEvent]
  }
  
  extension [Self <: SchemaPowerManagementEvent](x: Self) {
    
    inline def setBatteryLevel(value: Double): Self = StObject.set(x, "batteryLevel", value.asInstanceOf[js.Any])
    
    inline def setBatteryLevelNull: Self = StObject.set(x, "batteryLevel", null)
    
    inline def setBatteryLevelUndefined: Self = StObject.set(x, "batteryLevel", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setEventType(value: String): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
    
    inline def setEventTypeNull: Self = StObject.set(x, "eventType", null)
    
    inline def setEventTypeUndefined: Self = StObject.set(x, "eventType", js.undefined)
  }
}
