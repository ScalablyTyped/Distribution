package typings.googleapis.alertcenterV1beta1Mod.alertcenterV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAlertsFeedbackCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The identifier of the alert this feedback belongs to.
    */
  var alertId: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The unique identifier of the Google Workspace organization account of the customer the alert is associated with. Inferred from the caller identity if not provided.
    */
  var customerId: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaAlertFeedback] = js.undefined
}
object ParamsResourceAlertsFeedbackCreate {
  
  inline def apply(): ParamsResourceAlertsFeedbackCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAlertsFeedbackCreate]
  }
  
  extension [Self <: ParamsResourceAlertsFeedbackCreate](x: Self) {
    
    inline def setAlertId(value: String): Self = StObject.set(x, "alertId", value.asInstanceOf[js.Any])
    
    inline def setAlertIdUndefined: Self = StObject.set(x, "alertId", js.undefined)
    
    inline def setCustomerId(value: String): Self = StObject.set(x, "customerId", value.asInstanceOf[js.Any])
    
    inline def setCustomerIdUndefined: Self = StObject.set(x, "customerId", js.undefined)
    
    inline def setRequestBody(value: SchemaAlertFeedback): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
