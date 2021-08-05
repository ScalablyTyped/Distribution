package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NewAccountSummary extends StObject {
  
  /**
    * The account ID associated with the envelope.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * The GUID associated with the account ID.
    */
  var accountIdGuid: js.UndefOr[String] = js.undefined
  
  /**
    * The account name for the new account.
    */
  var accountName: js.UndefOr[String] = js.undefined
  
  /**
    * Contains a token that can be used for authentication in API calls instead of using the user name and password.
    */
  var apiPassword: js.UndefOr[String] = js.undefined
  
  /**
    * The URL that should be used for successive calls to this account. It includes the protocal (https), the DocuSign server where the account is located,
    * and the account number. Use this Url to make API calls against this account. Many of the API calls provide Uri's that are relative to this baseUrl.
    */
  var baseUrl: js.UndefOr[String] = js.undefined
  
  var billingPlanPreview: js.UndefOr[
    /* Information used to provide a preview of a billing plan. */ BillingPlanPreview
  ] = js.undefined
  
  /**
    * Specifies the user ID of the new user.
    */
  var userId: js.UndefOr[String] = js.undefined
}
object NewAccountSummary {
  
  inline def apply(): NewAccountSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NewAccountSummary]
  }
  
  extension [Self <: NewAccountSummary](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdGuid(value: String): Self = StObject.set(x, "accountIdGuid", value.asInstanceOf[js.Any])
    
    inline def setAccountIdGuidUndefined: Self = StObject.set(x, "accountIdGuid", js.undefined)
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setAccountName(value: String): Self = StObject.set(x, "accountName", value.asInstanceOf[js.Any])
    
    inline def setAccountNameUndefined: Self = StObject.set(x, "accountName", js.undefined)
    
    inline def setApiPassword(value: String): Self = StObject.set(x, "apiPassword", value.asInstanceOf[js.Any])
    
    inline def setApiPasswordUndefined: Self = StObject.set(x, "apiPassword", js.undefined)
    
    inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
    
    inline def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
    
    inline def setBillingPlanPreview(value: /* Information used to provide a preview of a billing plan. */ BillingPlanPreview): Self = StObject.set(x, "billingPlanPreview", value.asInstanceOf[js.Any])
    
    inline def setBillingPlanPreviewUndefined: Self = StObject.set(x, "billingPlanPreview", js.undefined)
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
