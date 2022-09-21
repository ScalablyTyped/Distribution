package typings.googleapis.chromemanagementV1Mod.chromemanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleChromeManagementV1DeviceAueCountReport extends StObject {
  
  /**
    * Enum value of month corresponding to the auto update expiration date in UTC time zone. If the device is already expired, this field is empty.
    */
  var aueMonth: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Int value of year corresponding to the Auto Update Expiration date in UTC time zone. If the device is already expired, this field is empty.
    */
  var aueYear: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Count of devices of this model.
    */
  var count: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Boolean value for whether or not the device has already expired.
    */
  var expired: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Public model name of the devices.
    */
  var model: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleChromeManagementV1DeviceAueCountReport {
  
  inline def apply(): SchemaGoogleChromeManagementV1DeviceAueCountReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleChromeManagementV1DeviceAueCountReport]
  }
  
  extension [Self <: SchemaGoogleChromeManagementV1DeviceAueCountReport](x: Self) {
    
    inline def setAueMonth(value: String): Self = StObject.set(x, "aueMonth", value.asInstanceOf[js.Any])
    
    inline def setAueMonthNull: Self = StObject.set(x, "aueMonth", null)
    
    inline def setAueMonthUndefined: Self = StObject.set(x, "aueMonth", js.undefined)
    
    inline def setAueYear(value: String): Self = StObject.set(x, "aueYear", value.asInstanceOf[js.Any])
    
    inline def setAueYearNull: Self = StObject.set(x, "aueYear", null)
    
    inline def setAueYearUndefined: Self = StObject.set(x, "aueYear", js.undefined)
    
    inline def setCount(value: String): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountNull: Self = StObject.set(x, "count", null)
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setExpired(value: Boolean): Self = StObject.set(x, "expired", value.asInstanceOf[js.Any])
    
    inline def setExpiredNull: Self = StObject.set(x, "expired", null)
    
    inline def setExpiredUndefined: Self = StObject.set(x, "expired", js.undefined)
    
    inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelNull: Self = StObject.set(x, "model", null)
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
  }
}
