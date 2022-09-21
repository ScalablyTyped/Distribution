package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceApplicationsDevicetierconfigsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Id of an existing device tier config.
    */
  var deviceTierConfigId: js.UndefOr[String] = js.undefined
  
  /**
    * Package name of the app.
    */
  var packageName: js.UndefOr[String] = js.undefined
}
object ParamsResourceApplicationsDevicetierconfigsGet {
  
  inline def apply(): ParamsResourceApplicationsDevicetierconfigsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceApplicationsDevicetierconfigsGet]
  }
  
  extension [Self <: ParamsResourceApplicationsDevicetierconfigsGet](x: Self) {
    
    inline def setDeviceTierConfigId(value: String): Self = StObject.set(x, "deviceTierConfigId", value.asInstanceOf[js.Any])
    
    inline def setDeviceTierConfigIdUndefined: Self = StObject.set(x, "deviceTierConfigId", js.undefined)
    
    inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    inline def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
  }
}
