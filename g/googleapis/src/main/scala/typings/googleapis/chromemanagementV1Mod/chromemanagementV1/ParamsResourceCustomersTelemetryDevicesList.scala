package typings.googleapis.chromemanagementV1Mod.chromemanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceCustomersTelemetryDevicesList
  extends StObject
     with StandardParameters {
  
  /**
    * Optional. Only include resources that match the filter. Supported filter fields: - org_unit_id - serial_number - device_id
    */
  var filter: js.UndefOr[String] = js.undefined
  
  /**
    * Maximum number of results to return. Default value is 100. Maximum value is 1000.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Token to specify next page in the list.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Customer id or "my_customer" to use the customer associated to the account making the request.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Read mask to specify which fields to return.
    */
  var readMask: js.UndefOr[String] = js.undefined
}
object ParamsResourceCustomersTelemetryDevicesList {
  
  inline def apply(): ParamsResourceCustomersTelemetryDevicesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCustomersTelemetryDevicesList]
  }
  
  extension [Self <: ParamsResourceCustomersTelemetryDevicesList](x: Self) {
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setReadMask(value: String): Self = StObject.set(x, "readMask", value.asInstanceOf[js.Any])
    
    inline def setReadMaskUndefined: Self = StObject.set(x, "readMask", js.undefined)
  }
}
