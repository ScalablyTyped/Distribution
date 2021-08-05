package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A power management event.
  */
trait SchemaPowerManagementEvent extends StObject {
  
  /**
    * For BATTERY_LEVEL_COLLECTED events, the battery level as a percentage.
    */
  var batteryLevel: js.UndefOr[Double] = js.undefined
  
  /**
    * The creation time of the event.
    */
  var createTime: js.UndefOr[String] = js.undefined
  
  /**
    * Event type.
    */
  var eventType: js.UndefOr[String] = js.undefined
}
object SchemaPowerManagementEvent {
  
  inline def apply(): SchemaPowerManagementEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPowerManagementEvent]
  }
  
  extension [Self <: SchemaPowerManagementEvent](x: Self) {
    
    inline def setBatteryLevel(value: Double): Self = StObject.set(x, "batteryLevel", value.asInstanceOf[js.Any])
    
    inline def setBatteryLevelUndefined: Self = StObject.set(x, "batteryLevel", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setEventType(value: String): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
    
    inline def setEventTypeUndefined: Self = StObject.set(x, "eventType", js.undefined)
  }
}
