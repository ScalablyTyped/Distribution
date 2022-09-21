package typings.googleapis.chromemanagementV1Mod.chromemanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceCustomersReportsCountchromedevicesreachingautoexpirationdate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The customer ID or "my_customer" prefixed with "customers/".
    */
  var customer: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. Maximum expiration date in format yyyy-mm-dd in UTC timezone. If included returns all devices that have already expired and devices with auto expiration date equal to or earlier than the maximum date.
    */
  var maxAueDate: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. Maximum expiration date in format yyyy-mm-dd in UTC timezone. If included returns all devices that have already expired and devices with auto expiration date equal to or later than the minimum date.
    */
  var minAueDate: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The organizational unit ID, if omitted, will return data for all organizational units.
    */
  var orgUnitId: js.UndefOr[String] = js.undefined
}
object ParamsResourceCustomersReportsCountchromedevicesreachingautoexpirationdate {
  
  inline def apply(): ParamsResourceCustomersReportsCountchromedevicesreachingautoexpirationdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCustomersReportsCountchromedevicesreachingautoexpirationdate]
  }
  
  extension [Self <: ParamsResourceCustomersReportsCountchromedevicesreachingautoexpirationdate](x: Self) {
    
    inline def setCustomer(value: String): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
    
    inline def setCustomerUndefined: Self = StObject.set(x, "customer", js.undefined)
    
    inline def setMaxAueDate(value: String): Self = StObject.set(x, "maxAueDate", value.asInstanceOf[js.Any])
    
    inline def setMaxAueDateUndefined: Self = StObject.set(x, "maxAueDate", js.undefined)
    
    inline def setMinAueDate(value: String): Self = StObject.set(x, "minAueDate", value.asInstanceOf[js.Any])
    
    inline def setMinAueDateUndefined: Self = StObject.set(x, "minAueDate", js.undefined)
    
    inline def setOrgUnitId(value: String): Self = StObject.set(x, "orgUnitId", value.asInstanceOf[js.Any])
    
    inline def setOrgUnitIdUndefined: Self = StObject.set(x, "orgUnitId", js.undefined)
  }
}
