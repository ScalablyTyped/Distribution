package typings.googleapis.cloudbuildV1alpha2Mod.cloudbuildV1alpha2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaApprovalResult extends StObject {
  
  /**
    * Output only. The time when the approval decision was made.
    */
  var approvalTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Email of the user that called the ApproveBuild API to approve or reject a build at the time that the API was called.
    */
  var approverAccount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. An optional comment for this manual approval result.
    */
  var comment: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The decision of this manual approval.
    */
  var decision: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. An optional URL tied to this manual approval result. This field is essentially the same as comment, except that it will be rendered by the UI differently. An example use case is a link to an external job that approved this Build.
    */
  var url: js.UndefOr[String | Null] = js.undefined
}
object SchemaApprovalResult {
  
  inline def apply(): SchemaApprovalResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApprovalResult]
  }
  
  extension [Self <: SchemaApprovalResult](x: Self) {
    
    inline def setApprovalTime(value: String): Self = StObject.set(x, "approvalTime", value.asInstanceOf[js.Any])
    
    inline def setApprovalTimeNull: Self = StObject.set(x, "approvalTime", null)
    
    inline def setApprovalTimeUndefined: Self = StObject.set(x, "approvalTime", js.undefined)
    
    inline def setApproverAccount(value: String): Self = StObject.set(x, "approverAccount", value.asInstanceOf[js.Any])
    
    inline def setApproverAccountNull: Self = StObject.set(x, "approverAccount", null)
    
    inline def setApproverAccountUndefined: Self = StObject.set(x, "approverAccount", js.undefined)
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentNull: Self = StObject.set(x, "comment", null)
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setDecision(value: String): Self = StObject.set(x, "decision", value.asInstanceOf[js.Any])
    
    inline def setDecisionNull: Self = StObject.set(x, "decision", null)
    
    inline def setDecisionUndefined: Self = StObject.set(x, "decision", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlNull: Self = StObject.set(x, "url", null)
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
