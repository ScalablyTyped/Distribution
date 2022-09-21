package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePartnersDevicesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The device API resource name in the format `partners/[PARTNER_ID]/devices/[DEVICE_ID]`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourcePartnersDevicesGet {
  
  inline def apply(): ParamsResourcePartnersDevicesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePartnersDevicesGet]
  }
  
  extension [Self <: ParamsResourcePartnersDevicesGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
