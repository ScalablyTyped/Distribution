package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecipientIdentityVerification extends js.Object {
  
  var inputOptions: js.UndefOr[js.Array[RecipientIdentityInputOption]] = js.native
  
  /**
    * ID of the Identity Verification worklow used to verify recipients' identity. </br> This ID must match one of the [workflowId]
    * (https://developers.docusign.com/esign-rest-api/reference/Accounts/IdentityVerifications/list#accountIdentityVerificationWorkflow) available to your account.
    */
  var workflowId: js.UndefOr[String] = js.native
}
object RecipientIdentityVerification {
  
  @scala.inline
  def apply(): RecipientIdentityVerification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecipientIdentityVerification]
  }
  
  @scala.inline
  implicit class RecipientIdentityVerificationOps[Self <: RecipientIdentityVerification] (val x: Self) extends AnyVal {
    
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
    def setInputOptionsVarargs(value: RecipientIdentityInputOption*): Self = this.set("inputOptions", js.Array(value :_*))
    
    @scala.inline
    def setInputOptions(value: js.Array[RecipientIdentityInputOption]): Self = this.set("inputOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputOptions: Self = this.set("inputOptions", js.undefined)
    
    @scala.inline
    def setWorkflowId(value: String): Self = this.set("workflowId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkflowId: Self = this.set("workflowId", js.undefined)
  }
}
