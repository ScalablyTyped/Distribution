package typings.googleapis.chromemanagementV1Mod.chromemanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceCustomersTelemetryDevicesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Name of the `TelemetryDevice` to return.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Read mask to specify which fields to return.
    */
  var readMask: js.UndefOr[String] = js.undefined
}
object ParamsResourceCustomersTelemetryDevicesGet {
  
  inline def apply(): ParamsResourceCustomersTelemetryDevicesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCustomersTelemetryDevicesGet]
  }
  
  extension [Self <: ParamsResourceCustomersTelemetryDevicesGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setReadMask(value: String): Self = StObject.set(x, "readMask", value.asInstanceOf[js.Any])
    
    inline def setReadMaskUndefined: Self = StObject.set(x, "readMask", js.undefined)
  }
}
