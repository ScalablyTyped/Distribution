package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceCustomersConfigurationsList
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The customer that manages the listed configurations. An API resource name in the format `customers/[CUSTOMER_ID]`.
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceCustomersConfigurationsList {
  
  inline def apply(): ParamsResourceCustomersConfigurationsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCustomersConfigurationsList]
  }
  
  extension [Self <: ParamsResourceCustomersConfigurationsList](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
