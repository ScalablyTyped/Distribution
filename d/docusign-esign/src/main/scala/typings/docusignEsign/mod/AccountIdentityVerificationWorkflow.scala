package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountIdentityVerificationWorkflow extends StObject {
  
  /**
    * Text describing the purpose of the Identity Verification workflow.
    */
  var defaultDescription: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the Identity Verification workflow.
    */
  var defaultName: js.UndefOr[String] = js.undefined
  
  var inputOptions: js.UndefOr[js.Array[AccountIdentityInputOption]] = js.undefined
  
  /**
    * The signature provider associated with the Identity Verification workflow.
    */
  var signatureProvider: js.UndefOr[AccountSignatureProvider] = js.undefined
  
  /**
    * Workflow unique ID</br>This is the ID you must specify when setting ID Verification in an envelope using the `identityVerification`
    * [core recipient parameter](https://developers.docusign.com/esign-rest-api/reference/Envelopes/EnvelopeRecipients#core-recipient-parameters)
    */
  var workflowId: js.UndefOr[String] = js.undefined
  
  /**
    * Reserved for DocuSign.
    */
  var workflowResourceKey: js.UndefOr[String] = js.undefined
}
object AccountIdentityVerificationWorkflow {
  
  inline def apply(): AccountIdentityVerificationWorkflow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountIdentityVerificationWorkflow]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccountIdentityVerificationWorkflow] (val x: Self) extends AnyVal {
    
    inline def setDefaultDescription(value: String): Self = StObject.set(x, "defaultDescription", value.asInstanceOf[js.Any])
    
    inline def setDefaultDescriptionUndefined: Self = StObject.set(x, "defaultDescription", js.undefined)
    
    inline def setDefaultName(value: String): Self = StObject.set(x, "defaultName", value.asInstanceOf[js.Any])
    
    inline def setDefaultNameUndefined: Self = StObject.set(x, "defaultName", js.undefined)
    
    inline def setInputOptions(value: js.Array[AccountIdentityInputOption]): Self = StObject.set(x, "inputOptions", value.asInstanceOf[js.Any])
    
    inline def setInputOptionsUndefined: Self = StObject.set(x, "inputOptions", js.undefined)
    
    inline def setInputOptionsVarargs(value: AccountIdentityInputOption*): Self = StObject.set(x, "inputOptions", js.Array(value*))
    
    inline def setSignatureProvider(value: AccountSignatureProvider): Self = StObject.set(x, "signatureProvider", value.asInstanceOf[js.Any])
    
    inline def setSignatureProviderUndefined: Self = StObject.set(x, "signatureProvider", js.undefined)
    
    inline def setWorkflowId(value: String): Self = StObject.set(x, "workflowId", value.asInstanceOf[js.Any])
    
    inline def setWorkflowIdUndefined: Self = StObject.set(x, "workflowId", js.undefined)
    
    inline def setWorkflowResourceKey(value: String): Self = StObject.set(x, "workflowResourceKey", value.asInstanceOf[js.Any])
    
    inline def setWorkflowResourceKeyUndefined: Self = StObject.set(x, "workflowResourceKey", js.undefined)
  }
}
