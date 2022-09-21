package typings.googleapis.accessapprovalV1Mod.accessapprovalV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceOrganizationsApprovalrequestsGet
  extends StObject
     with StandardParameters {
  
  /**
    * The name of the approval request to retrieve. Format: "{projects|folders|organizations\}/{id\}/approvalRequests/{approval_request\}"
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceOrganizationsApprovalrequestsGet {
  
  inline def apply(): ParamsResourceOrganizationsApprovalrequestsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceOrganizationsApprovalrequestsGet]
  }
  
  extension [Self <: ParamsResourceOrganizationsApprovalrequestsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
