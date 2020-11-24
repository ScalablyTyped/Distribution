package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NewAccountSummary extends js.Object {
  
  /**
    * The account ID associated with the envelope.
    */
  var accountId: js.UndefOr[String] = js.native
  
  /**
    * The GUID associated with the account ID.
    */
  var accountIdGuid: js.UndefOr[String] = js.native
  
  /**
    * The account name for the new account.
    */
  var accountName: js.UndefOr[String] = js.native
  
  /**
    * Contains a token that can be used for authentication in API calls instead of using the user name and password.
    */
  var apiPassword: js.UndefOr[String] = js.native
  
  /**
    * The URL that should be used for successive calls to this account. It includes the protocal (https), the DocuSign server where the account is located,
    * and the account number. Use this Url to make API calls against this account. Many of the API calls provide Uri's that are relative to this baseUrl.
    */
  var baseUrl: js.UndefOr[String] = js.native
  
  var billingPlanPreview: js.UndefOr[
    /* Information used to provide a preview of a billing plan. */ BillingPlanPreview
  ] = js.native
  
  /**
    * Specifies the user ID of the new user.
    */
  var userId: js.UndefOr[String] = js.native
}
object NewAccountSummary {
  
  @scala.inline
  def apply(): NewAccountSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NewAccountSummary]
  }
  
  @scala.inline
  implicit class NewAccountSummaryOps[Self <: NewAccountSummary] (val x: Self) extends AnyVal {
    
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
    def setAccountId(value: String): Self = this.set("accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    
    @scala.inline
    def setAccountIdGuid(value: String): Self = this.set("accountIdGuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountIdGuid: Self = this.set("accountIdGuid", js.undefined)
    
    @scala.inline
    def setAccountName(value: String): Self = this.set("accountName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountName: Self = this.set("accountName", js.undefined)
    
    @scala.inline
    def setApiPassword(value: String): Self = this.set("apiPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApiPassword: Self = this.set("apiPassword", js.undefined)
    
    @scala.inline
    def setBaseUrl(value: String): Self = this.set("baseUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseUrl: Self = this.set("baseUrl", js.undefined)
    
    @scala.inline
    def setBillingPlanPreview(value: /* Information used to provide a preview of a billing plan. */ BillingPlanPreview): Self = this.set("billingPlanPreview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBillingPlanPreview: Self = this.set("billingPlanPreview", js.undefined)
    
    @scala.inline
    def setUserId(value: String): Self = this.set("userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserId: Self = this.set("userId", js.undefined)
  }
}
