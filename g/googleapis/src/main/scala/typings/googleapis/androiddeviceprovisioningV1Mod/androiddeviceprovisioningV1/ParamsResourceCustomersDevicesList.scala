package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceCustomersDevicesList
  extends StObject
     with StandardParameters {
  
  /**
    * The maximum number of devices to show in a page of results. Must be between 1 and 100 inclusive.
    */
  var pageSize: js.UndefOr[String] = js.undefined
  
  /**
    * A token specifying which result page to return.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The customer managing the devices. An API resource name in the format `customers/[CUSTOMER_ID]`.
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceCustomersDevicesList {
  
  inline def apply(): ParamsResourceCustomersDevicesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCustomersDevicesList]
  }
  
  extension [Self <: ParamsResourceCustomersDevicesList](x: Self) {
    
    inline def setPageSize(value: String): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
