package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecipientIdentityVerification extends StObject {
  
  var inputOptions: js.UndefOr[js.Array[RecipientIdentityInputOption]] = js.undefined
  
  /**
    * ID of the Identity Verification worklow used to verify recipients' identity. </br> This ID must match one of the [workflowId]
    * (https://developers.docusign.com/esign-rest-api/reference/Accounts/IdentityVerifications/list#accountIdentityVerificationWorkflow) available to your account.
    */
  var workflowId: js.UndefOr[String] = js.undefined
}
object RecipientIdentityVerification {
  
  inline def apply(): RecipientIdentityVerification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecipientIdentityVerification]
  }
  
  extension [Self <: RecipientIdentityVerification](x: Self) {
    
    inline def setInputOptions(value: js.Array[RecipientIdentityInputOption]): Self = StObject.set(x, "inputOptions", value.asInstanceOf[js.Any])
    
    inline def setInputOptionsUndefined: Self = StObject.set(x, "inputOptions", js.undefined)
    
    inline def setInputOptionsVarargs(value: RecipientIdentityInputOption*): Self = StObject.set(x, "inputOptions", js.Array(value :_*))
    
    inline def setWorkflowId(value: String): Self = StObject.set(x, "workflowId", value.asInstanceOf[js.Any])
    
    inline def setWorkflowIdUndefined: Self = StObject.set(x, "workflowId", js.undefined)
  }
}
