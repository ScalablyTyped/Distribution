package typings.googleapis.accessapprovalV1Mod.accessapprovalV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsApprovalrequestsInvalidate
  extends StObject
     with StandardParameters {
  
  /**
    * Name of the ApprovalRequest to invalidate.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaInvalidateApprovalRequestMessage] = js.undefined
}
object ParamsResourceProjectsApprovalrequestsInvalidate {
  
  inline def apply(): ParamsResourceProjectsApprovalrequestsInvalidate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsApprovalrequestsInvalidate]
  }
  
  extension [Self <: ParamsResourceProjectsApprovalrequestsInvalidate](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaInvalidateApprovalRequestMessage): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
