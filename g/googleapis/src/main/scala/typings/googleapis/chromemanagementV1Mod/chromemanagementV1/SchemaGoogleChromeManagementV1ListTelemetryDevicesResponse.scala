package typings.googleapis.chromemanagementV1Mod.chromemanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleChromeManagementV1ListTelemetryDevicesResponse extends StObject {
  
  /**
    * Telemetry devices returned in the response.
    */
  var devices: js.UndefOr[js.Array[SchemaGoogleChromeManagementV1TelemetryDevice]] = js.undefined
  
  /**
    * Token to specify next page in the list.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleChromeManagementV1ListTelemetryDevicesResponse {
  
  inline def apply(): SchemaGoogleChromeManagementV1ListTelemetryDevicesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleChromeManagementV1ListTelemetryDevicesResponse]
  }
  
  extension [Self <: SchemaGoogleChromeManagementV1ListTelemetryDevicesResponse](x: Self) {
    
    inline def setDevices(value: js.Array[SchemaGoogleChromeManagementV1TelemetryDevice]): Self = StObject.set(x, "devices", value.asInstanceOf[js.Any])
    
    inline def setDevicesUndefined: Self = StObject.set(x, "devices", js.undefined)
    
    inline def setDevicesVarargs(value: SchemaGoogleChromeManagementV1TelemetryDevice*): Self = StObject.set(x, "devices", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
