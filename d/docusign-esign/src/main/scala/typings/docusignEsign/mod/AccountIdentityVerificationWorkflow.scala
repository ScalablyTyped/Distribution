package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountIdentityVerificationWorkflow extends js.Object {
  
  /**
    * Text describing the purpose of the Identity Verification workflow.
    */
  var defaultDescription: js.UndefOr[String] = js.native
  
  /**
    * The name of the Identity Verification workflow.
    */
  var defaultName: js.UndefOr[String] = js.native
  
  var inputOptions: js.UndefOr[js.Array[AccountIdentityInputOption]] = js.native
  
  /**
    * The signature provider associated with the Identity Verification workflow.
    */
  var signatureProvider: js.UndefOr[AccountSignatureProvider] = js.native
  
  /**
    * Workflow unique ID</br>This is the ID you must specify when setting ID Verification in an envelope using the `identityVerification`
    * [core recipient parameter](https://developers.docusign.com/esign-rest-api/reference/Envelopes/EnvelopeRecipients#core-recipient-parameters)
    */
  var workflowId: js.UndefOr[String] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var workflowResourceKey: js.UndefOr[String] = js.native
}
object AccountIdentityVerificationWorkflow {
  
  @scala.inline
  def apply(): AccountIdentityVerificationWorkflow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountIdentityVerificationWorkflow]
  }
  
  @scala.inline
  implicit class AccountIdentityVerificationWorkflowOps[Self <: AccountIdentityVerificationWorkflow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDefaultDescription(value: String): Self = this.set("defaultDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultDescription: Self = this.set("defaultDescription", js.undefined)
    
    @scala.inline
    def setDefaultName(value: String): Self = this.set("defaultName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultName: Self = this.set("defaultName", js.undefined)
    
    @scala.inline
    def setInputOptionsVarargs(value: AccountIdentityInputOption*): Self = this.set("inputOptions", js.Array(value :_*))
    
    @scala.inline
    def setInputOptions(value: js.Array[AccountIdentityInputOption]): Self = this.set("inputOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputOptions: Self = this.set("inputOptions", js.undefined)
    
    @scala.inline
    def setSignatureProvider(value: AccountSignatureProvider): Self = this.set("signatureProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignatureProvider: Self = this.set("signatureProvider", js.undefined)
    
    @scala.inline
    def setWorkflowId(value: String): Self = this.set("workflowId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkflowId: Self = this.set("workflowId", js.undefined)
    
    @scala.inline
    def setWorkflowResourceKey(value: String): Self = this.set("workflowResourceKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkflowResourceKey: Self = this.set("workflowResourceKey", js.undefined)
  }
}
