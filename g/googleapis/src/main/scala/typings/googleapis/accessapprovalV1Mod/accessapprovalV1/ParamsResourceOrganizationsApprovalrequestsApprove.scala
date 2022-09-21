package typings.googleapis.accessapprovalV1Mod.accessapprovalV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceOrganizationsApprovalrequestsApprove
  extends StObject
     with StandardParameters {
  
  /**
    * Name of the approval request to approve.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaApproveApprovalRequestMessage] = js.undefined
}
object ParamsResourceOrganizationsApprovalrequestsApprove {
  
  inline def apply(): ParamsResourceOrganizationsApprovalrequestsApprove = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceOrganizationsApprovalrequestsApprove]
  }
  
  extension [Self <: ParamsResourceOrganizationsApprovalrequestsApprove](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaApproveApprovalRequestMessage): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
