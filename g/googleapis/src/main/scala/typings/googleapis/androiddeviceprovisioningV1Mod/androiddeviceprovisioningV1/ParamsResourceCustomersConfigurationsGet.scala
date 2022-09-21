package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceCustomersConfigurationsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The configuration to get. An API resource name in the format `customers/[CUSTOMER_ID]/configurations/[CONFIGURATION_ID]`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceCustomersConfigurationsGet {
  
  inline def apply(): ParamsResourceCustomersConfigurationsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCustomersConfigurationsGet]
  }
  
  extension [Self <: ParamsResourceCustomersConfigurationsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
