package typings.googleapis.accessapprovalV1Mod.accessapprovalV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceFoldersApprovalrequestsGet
  extends StObject
     with StandardParameters {
  
  /**
    * The name of the approval request to retrieve. Format: "{projects|folders|organizations\}/{id\}/approvalRequests/{approval_request\}"
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceFoldersApprovalrequestsGet {
  
  inline def apply(): ParamsResourceFoldersApprovalrequestsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceFoldersApprovalrequestsGet]
  }
  
  extension [Self <: ParamsResourceFoldersApprovalrequestsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
