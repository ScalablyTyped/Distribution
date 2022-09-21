package typings.googleapis.cloudbuildV1Mod.cloudbuildV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaApproveBuildRequest extends StObject {
  
  /**
    * Approval decision and metadata.
    */
  var approvalResult: js.UndefOr[SchemaApprovalResult] = js.undefined
}
object SchemaApproveBuildRequest {
  
  inline def apply(): SchemaApproveBuildRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApproveBuildRequest]
  }
  
  extension [Self <: SchemaApproveBuildRequest](x: Self) {
    
    inline def setApprovalResult(value: SchemaApprovalResult): Self = StObject.set(x, "approvalResult", value.asInstanceOf[js.Any])
    
    inline def setApprovalResultUndefined: Self = StObject.set(x, "approvalResult", js.undefined)
  }
}
