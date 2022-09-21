package typings.googleapis.chromemanagementV1Mod.chromemanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceCustomersAppsCountchromeapprequests
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Customer id or "my_customer" to use the customer associated to the account making the request.
    */
  var customer: js.UndefOr[String] = js.undefined
  
  /**
    * Field used to order results. Supported fields: * request_count * latest_request_time
    */
  var orderBy: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the organizational unit.
    */
  var orgUnitId: js.UndefOr[String] = js.undefined
  
  /**
    * Maximum number of results to return. Maximum and default are 50, anything above will be coerced to 50.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Token to specify the page of the request to be returned.
    */
  var pageToken: js.UndefOr[String] = js.undefined
}
object ParamsResourceCustomersAppsCountchromeapprequests {
  
  inline def apply(): ParamsResourceCustomersAppsCountchromeapprequests = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCustomersAppsCountchromeapprequests]
  }
  
  extension [Self <: ParamsResourceCustomersAppsCountchromeapprequests](x: Self) {
    
    inline def setCustomer(value: String): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
    
    inline def setCustomerUndefined: Self = StObject.set(x, "customer", js.undefined)
    
    inline def setOrderBy(value: String): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
    
    inline def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
    
    inline def setOrgUnitId(value: String): Self = StObject.set(x, "orgUnitId", value.asInstanceOf[js.Any])
    
    inline def setOrgUnitIdUndefined: Self = StObject.set(x, "orgUnitId", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
  }
}
