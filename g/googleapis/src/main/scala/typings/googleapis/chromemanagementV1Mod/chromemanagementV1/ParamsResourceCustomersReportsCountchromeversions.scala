package typings.googleapis.chromemanagementV1Mod.chromemanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceCustomersReportsCountchromeversions
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Customer id or "my_customer" to use the customer associated to the account making the request.
    */
  var customer: js.UndefOr[String] = js.undefined
  
  /**
    * Query string to filter results, AND-separated fields in EBNF syntax. Note: OR operations are not supported in this filter. Supported filter fields: * last_active_date
    */
  var filter: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the organizational unit.
    */
  var orgUnitId: js.UndefOr[String] = js.undefined
  
  /**
    * Maximum number of results to return. Maximum and default are 100.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Token to specify the page of the request to be returned.
    */
  var pageToken: js.UndefOr[String] = js.undefined
}
object ParamsResourceCustomersReportsCountchromeversions {
  
  inline def apply(): ParamsResourceCustomersReportsCountchromeversions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCustomersReportsCountchromeversions]
  }
  
  extension [Self <: ParamsResourceCustomersReportsCountchromeversions](x: Self) {
    
    inline def setCustomer(value: String): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
    
    inline def setCustomerUndefined: Self = StObject.set(x, "customer", js.undefined)
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setOrgUnitId(value: String): Self = StObject.set(x, "orgUnitId", value.asInstanceOf[js.Any])
    
    inline def setOrgUnitIdUndefined: Self = StObject.set(x, "orgUnitId", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
  }
}
