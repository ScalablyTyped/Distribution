package typings.googleapis.chromemanagementV1Mod.chromemanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleChromeManagementV1CountChromeDevicesReachingAutoExpirationDateResponse extends StObject {
  
  /**
    * The list of reports sorted by auto update expiration date in ascending order.
    */
  var deviceAueCountReports: js.UndefOr[js.Array[SchemaGoogleChromeManagementV1DeviceAueCountReport]] = js.undefined
}
object SchemaGoogleChromeManagementV1CountChromeDevicesReachingAutoExpirationDateResponse {
  
  inline def apply(): SchemaGoogleChromeManagementV1CountChromeDevicesReachingAutoExpirationDateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleChromeManagementV1CountChromeDevicesReachingAutoExpirationDateResponse]
  }
  
  extension [Self <: SchemaGoogleChromeManagementV1CountChromeDevicesReachingAutoExpirationDateResponse](x: Self) {
    
    inline def setDeviceAueCountReports(value: js.Array[SchemaGoogleChromeManagementV1DeviceAueCountReport]): Self = StObject.set(x, "deviceAueCountReports", value.asInstanceOf[js.Any])
    
    inline def setDeviceAueCountReportsUndefined: Self = StObject.set(x, "deviceAueCountReports", js.undefined)
    
    inline def setDeviceAueCountReportsVarargs(value: SchemaGoogleChromeManagementV1DeviceAueCountReport*): Self = StObject.set(x, "deviceAueCountReports", js.Array(value*))
  }
}
