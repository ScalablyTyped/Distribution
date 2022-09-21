package typings.googleapis.alertcenterV1beta1Mod.alertcenterV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAlertsGetmetadata
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The identifier of the alert this metadata belongs to.
    */
  var alertId: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The unique identifier of the Google Workspace organization account of the customer the alert metadata is associated with. Inferred from the caller identity if not provided.
    */
  var customerId: js.UndefOr[String] = js.undefined
}
object ParamsResourceAlertsGetmetadata {
  
  inline def apply(): ParamsResourceAlertsGetmetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAlertsGetmetadata]
  }
  
  extension [Self <: ParamsResourceAlertsGetmetadata](x: Self) {
    
    inline def setAlertId(value: String): Self = StObject.set(x, "alertId", value.asInstanceOf[js.Any])
    
    inline def setAlertIdUndefined: Self = StObject.set(x, "alertId", js.undefined)
    
    inline def setCustomerId(value: String): Self = StObject.set(x, "customerId", value.asInstanceOf[js.Any])
    
    inline def setCustomerIdUndefined: Self = StObject.set(x, "customerId", js.undefined)
  }
}
