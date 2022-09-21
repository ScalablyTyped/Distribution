package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDeviceReportUpdateEvent extends StObject {
  
  /**
    * The Android ID of the device. This field will always be present.
    */
  var deviceId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The device report updated with the latest app states. This field will always be present.
    */
  var report: js.UndefOr[SchemaDeviceReport] = js.undefined
  
  /**
    * The ID of the user. This field will always be present.
    */
  var userId: js.UndefOr[String | Null] = js.undefined
}
object SchemaDeviceReportUpdateEvent {
  
  inline def apply(): SchemaDeviceReportUpdateEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeviceReportUpdateEvent]
  }
  
  extension [Self <: SchemaDeviceReportUpdateEvent](x: Self) {
    
    inline def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    inline def setDeviceIdNull: Self = StObject.set(x, "deviceId", null)
    
    inline def setDeviceIdUndefined: Self = StObject.set(x, "deviceId", js.undefined)
    
    inline def setReport(value: SchemaDeviceReport): Self = StObject.set(x, "report", value.asInstanceOf[js.Any])
    
    inline def setReportUndefined: Self = StObject.set(x, "report", js.undefined)
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdNull: Self = StObject.set(x, "userId", null)
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
