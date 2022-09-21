package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceApplicationsDevicetierconfigsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Whether the service should accept device IDs that are unknown to Play's device catalog.
    */
  var allowUnknownDevices: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Package name of the app.
    */
  var packageName: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaDeviceTierConfig] = js.undefined
}
object ParamsResourceApplicationsDevicetierconfigsCreate {
  
  inline def apply(): ParamsResourceApplicationsDevicetierconfigsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceApplicationsDevicetierconfigsCreate]
  }
  
  extension [Self <: ParamsResourceApplicationsDevicetierconfigsCreate](x: Self) {
    
    inline def setAllowUnknownDevices(value: Boolean): Self = StObject.set(x, "allowUnknownDevices", value.asInstanceOf[js.Any])
    
    inline def setAllowUnknownDevicesUndefined: Self = StObject.set(x, "allowUnknownDevices", js.undefined)
    
    inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    inline def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
    
    inline def setRequestBody(value: SchemaDeviceTierConfig): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
