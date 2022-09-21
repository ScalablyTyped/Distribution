package typings.googleapis.chromepolicyV1Mod.chromepolicyV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceCustomersPoliciesGroupsUpdategrouppriorityordering
  extends StObject
     with StandardParameters {
  
  /**
    * Required. ID of the Google Workspace account or literal "my_customer" for the customer associated to the request.
    */
  var customer: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleChromePolicyV1UpdateGroupPriorityOrderingRequest] = js.undefined
}
object ParamsResourceCustomersPoliciesGroupsUpdategrouppriorityordering {
  
  inline def apply(): ParamsResourceCustomersPoliciesGroupsUpdategrouppriorityordering = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCustomersPoliciesGroupsUpdategrouppriorityordering]
  }
  
  extension [Self <: ParamsResourceCustomersPoliciesGroupsUpdategrouppriorityordering](x: Self) {
    
    inline def setCustomer(value: String): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
    
    inline def setCustomerUndefined: Self = StObject.set(x, "customer", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleChromePolicyV1UpdateGroupPriorityOrderingRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
