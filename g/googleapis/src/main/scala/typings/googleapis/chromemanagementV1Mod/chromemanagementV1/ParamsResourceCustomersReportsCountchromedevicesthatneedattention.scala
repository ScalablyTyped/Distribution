package typings.googleapis.chromemanagementV1Mod.chromemanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceCustomersReportsCountchromedevicesthatneedattention
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The customer ID or "my_customer" prefixed with "customers/".
    */
  var customer: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The ID of the organizational unit. If omitted, all data will be returned.
    */
  var orgUnitId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Mask of the fields that should be populated in the returned report.
    */
  var readMask: js.UndefOr[String] = js.undefined
}
object ParamsResourceCustomersReportsCountchromedevicesthatneedattention {
  
  inline def apply(): ParamsResourceCustomersReportsCountchromedevicesthatneedattention = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCustomersReportsCountchromedevicesthatneedattention]
  }
  
  extension [Self <: ParamsResourceCustomersReportsCountchromedevicesthatneedattention](x: Self) {
    
    inline def setCustomer(value: String): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
    
    inline def setCustomerUndefined: Self = StObject.set(x, "customer", js.undefined)
    
    inline def setOrgUnitId(value: String): Self = StObject.set(x, "orgUnitId", value.asInstanceOf[js.Any])
    
    inline def setOrgUnitIdUndefined: Self = StObject.set(x, "orgUnitId", js.undefined)
    
    inline def setReadMask(value: String): Self = StObject.set(x, "readMask", value.asInstanceOf[js.Any])
    
    inline def setReadMaskUndefined: Self = StObject.set(x, "readMask", js.undefined)
  }
}
