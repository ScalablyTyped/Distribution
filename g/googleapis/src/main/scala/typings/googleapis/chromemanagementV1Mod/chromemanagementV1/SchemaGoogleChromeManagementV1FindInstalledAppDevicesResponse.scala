package typings.googleapis.chromemanagementV1Mod.chromemanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleChromeManagementV1FindInstalledAppDevicesResponse extends StObject {
  
  /**
    * A list of devices which have the app installed. Sorted in ascending alphabetical order on the Device.machine field.
    */
  var devices: js.UndefOr[js.Array[SchemaGoogleChromeManagementV1Device]] = js.undefined
  
  /**
    * Token to specify the next page of the request.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Total number of devices matching request.
    */
  var totalSize: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGoogleChromeManagementV1FindInstalledAppDevicesResponse {
  
  inline def apply(): SchemaGoogleChromeManagementV1FindInstalledAppDevicesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleChromeManagementV1FindInstalledAppDevicesResponse]
  }
  
  extension [Self <: SchemaGoogleChromeManagementV1FindInstalledAppDevicesResponse](x: Self) {
    
    inline def setDevices(value: js.Array[SchemaGoogleChromeManagementV1Device]): Self = StObject.set(x, "devices", value.asInstanceOf[js.Any])
    
    inline def setDevicesUndefined: Self = StObject.set(x, "devices", js.undefined)
    
    inline def setDevicesVarargs(value: SchemaGoogleChromeManagementV1Device*): Self = StObject.set(x, "devices", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTotalSize(value: Double): Self = StObject.set(x, "totalSize", value.asInstanceOf[js.Any])
    
    inline def setTotalSizeNull: Self = StObject.set(x, "totalSize", null)
    
    inline def setTotalSizeUndefined: Self = StObject.set(x, "totalSize", js.undefined)
  }
}
