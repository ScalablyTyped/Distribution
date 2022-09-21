package typings.googleapis.alertcenterV1beta1Mod.alertcenterV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceV1beta1Updatesettings
  extends StObject
     with StandardParameters {
  
  /**
    * Optional. The unique identifier of the Google Workspace organization account of the customer the alert settings are associated with. Inferred from the caller identity if not provided.
    */
  var customerId: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaSettings] = js.undefined
}
object ParamsResourceV1beta1Updatesettings {
  
  inline def apply(): ParamsResourceV1beta1Updatesettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceV1beta1Updatesettings]
  }
  
  extension [Self <: ParamsResourceV1beta1Updatesettings](x: Self) {
    
    inline def setCustomerId(value: String): Self = StObject.set(x, "customerId", value.asInstanceOf[js.Any])
    
    inline def setCustomerIdUndefined: Self = StObject.set(x, "customerId", js.undefined)
    
    inline def setRequestBody(value: SchemaSettings): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
