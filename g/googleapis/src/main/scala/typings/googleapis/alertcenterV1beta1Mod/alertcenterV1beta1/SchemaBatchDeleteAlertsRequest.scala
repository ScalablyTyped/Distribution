package typings.googleapis.alertcenterV1beta1Mod.alertcenterV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBatchDeleteAlertsRequest extends StObject {
  
  /**
    * Required. list of alert IDs.
    */
  var alertId: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Optional. The unique identifier of the Google Workspace organization account of the customer the alerts are associated with.
    */
  var customerId: js.UndefOr[String | Null] = js.undefined
}
object SchemaBatchDeleteAlertsRequest {
  
  inline def apply(): SchemaBatchDeleteAlertsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchDeleteAlertsRequest]
  }
  
  extension [Self <: SchemaBatchDeleteAlertsRequest](x: Self) {
    
    inline def setAlertId(value: js.Array[String]): Self = StObject.set(x, "alertId", value.asInstanceOf[js.Any])
    
    inline def setAlertIdNull: Self = StObject.set(x, "alertId", null)
    
    inline def setAlertIdUndefined: Self = StObject.set(x, "alertId", js.undefined)
    
    inline def setAlertIdVarargs(value: String*): Self = StObject.set(x, "alertId", js.Array(value*))
    
    inline def setCustomerId(value: String): Self = StObject.set(x, "customerId", value.asInstanceOf[js.Any])
    
    inline def setCustomerIdNull: Self = StObject.set(x, "customerId", null)
    
    inline def setCustomerIdUndefined: Self = StObject.set(x, "customerId", js.undefined)
  }
}
