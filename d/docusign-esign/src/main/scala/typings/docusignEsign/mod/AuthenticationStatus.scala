package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthenticationStatus extends js.Object {
  
  /**
    * The result of a user's attempt to authenticate by using an access code. It returns:
    *
    * - `Status`: `Pass` or `Fail`.
    * - `dateTime`: The date and time that the event occurred.
    * - `FailureDescription`: A string containing the details about a failed authentication.
    * - `VendorFailureStatusCode`: A string containing the vendor's status code for a failed authentication.
    */
  var accessCodeResult: js.UndefOr[/* Information about the result of an event. */ EventResult] = js.native
  
  /**
    * The result of an age verification check. It returns:
    *
    * - `Status`: `Pass` or `Fail`.
    * - `dateTime`: The date and time that the event occurred.
    * - `FailureDescription`: A string containing the details about a failed authentication.
    * - `VendorFailureStatusCode`: A string containing the vendor's status code for a failed authentication.
    */
  var ageVerifyResult: js.UndefOr[/* Information about the result of an event. */ EventResult] = js.native
  
  /**
    * Deprecated.
    */
  var anySocialIDResult: js.UndefOr[/* Information about the result of an event. */ EventResult] = js.native
  
  /**
    * Deprecated.
    */
  var facebookResult: js.UndefOr[/* Information about the result of an event. */ EventResult] = js.native
  
  /**
    * Deprecated.
    */
  var googleResult: js.UndefOr[/* Information about the result of an event. */ EventResult] = js.native
  
  /**
    * The result of an ID lookup authentication check. It returns:
    *
    * - `Status`: `Pass` or `Fail`.
    * - `dateTime`: The date and time that the event occurred.
    * - `FailureDescription`: A string containing the details about a failed authentication.
    * - `VendorFailureStatusCode`: A string containing the vendor's status code for a failed authentication.
    */
  var idLookupResult: js.UndefOr[/* Information about the result of an event. */ EventResult] = js.native
  
  /**
    * The result of the user's answers to ID challenge questions. It returns:
    *
    * - `Status`: `Pass` or `Fail`.
    * - `dateTime`: The date and time that the event occurred.
    * - `FailureDescription`: A string containing the details about a failed authentication.
    * - `VendorFailureStatusCode`: A string containing the vendor's status code for a failed authentication.
    */
  var idQuestionsResult: js.UndefOr[/* Information about the result of an event. */ EventResult] = js.native
  
  /**
    * The result of an [Identity Verification][IDV] workflow.
    *
    * [IDV]: /esign/restapi/Accounts/IdentityVerifications/
    */
  var identityVerificationResult: js.UndefOr[/* Information about the result of an event. */ EventResult] = js.native
  
  /**
    * Deprecated.
    */
  var linkedinResult: js.UndefOr[/* Information about the result of an event. */ EventResult] = js.native
  
  /**
    * Deprecated.
    */
  var liveIDResult: js.UndefOr[/* Information about the result of an event. */ EventResult] = js.native
  
  /**
    * The result of an Office of Foreign Asset Control (OFAC) check. It returns:
    *
    * - `Status`: `Pass` or `Fail`.
    * - `dateTime`: The date and time that the event occurred.
    * - `FailureDescription`: A string containing the details about a failed authentication.
    * - `VendorFailureStatusCode`: A string containing the vendor's status code for a failed authentication.
    */
  var ofacResult: js.UndefOr[/* Information about the result of an event. */ EventResult] = js.native
  
  /**
    * Deprecated.
    */
  var openIDResult: js.UndefOr[/* Information about the result of an event. */ EventResult] = js.native
  
  /**
    * The result of the user's attempt to authenticate by using two-factor authentication (2FA) through phone messaging. It returns:
    *
    * - `Status`: `Pass` or `Fail`.
    * - `dateTime`: The date and time that the event occurred.
    * - `FailureDescription`: A string containing the details about a failed authentication.
    * - `VendorFailureStatusCode`: A string containing the vendor's status code for a failed authentication.
    */
  var phoneAuthResult: js.UndefOr[/* Information about the result of an event. */ EventResult] = js.native
  
  /**
    * The result of a Student Authentication Network (STAN) authentication check. It returns:
    *
    * - `Status`: `Pass` or `Fail`.
    * - `dateTime`: The date and time that the event occurred.
    * - `FailureDescription`: A string containing the details about a failed authentication.
    * - `VendorFailureStatusCode`: A string containing the vendor's status code for a failed authentication.
    */
  var sTANPinResult: js.UndefOr[/* Information about the result of an event. */ EventResult] = js.native
  
  /**
    * Success/failure result of authentication using sign-in with a Salesforce account. It returns:
    *
    * - `Status`: `Pass` or `Fail`.
    * - `dateTime`: The date and time that the event occurred.
    * - `FailureDescription`: A string containing the details about a failed authentication.
    * - `VendorFailureStatusCode`: A string containing the vendor's status code for a failed authentication.
    */
  var salesforceResult: js.UndefOr[/* Information about the result of an event. */ EventResult] = js.native
  
  /**
    * The result of the user's attempt to authenticate by using a signature provider.
    */
  var signatureProviderResult: js.UndefOr[/* Information about the result of an event. */ EventResult] = js.native
  
  /**
    * The result of the user's attempt to authenticate by using two-factor authentication (2FA) through SMS messaging on a mobile phone.
    */
  var smsAuthResult: js.UndefOr[/* Information about the result of an event. */ EventResult] = js.native
  
  /**
    * Deprecated.
    */
  var twitterResult: js.UndefOr[/* Information about the result of an event. */ EventResult] = js.native
  
  /**
    * Deprecated.
    */
  var yahooResult: js.UndefOr[/* Information about the result of an event. */ EventResult] = js.native
}
object AuthenticationStatus {
  
  @scala.inline
  def apply(): AuthenticationStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthenticationStatus]
  }
  
  @scala.inline
  implicit class AuthenticationStatusOps[Self <: AuthenticationStatus] (val x: Self) extends AnyVal {
    
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
    def setAccessCodeResult(value: /* Information about the result of an event. */ EventResult): Self = this.set("accessCodeResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessCodeResult: Self = this.set("accessCodeResult", js.undefined)
    
    @scala.inline
    def setAgeVerifyResult(value: /* Information about the result of an event. */ EventResult): Self = this.set("ageVerifyResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAgeVerifyResult: Self = this.set("ageVerifyResult", js.undefined)
    
    @scala.inline
    def setAnySocialIDResult(value: /* Information about the result of an event. */ EventResult): Self = this.set("anySocialIDResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnySocialIDResult: Self = this.set("anySocialIDResult", js.undefined)
    
    @scala.inline
    def setFacebookResult(value: /* Information about the result of an event. */ EventResult): Self = this.set("facebookResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFacebookResult: Self = this.set("facebookResult", js.undefined)
    
    @scala.inline
    def setGoogleResult(value: /* Information about the result of an event. */ EventResult): Self = this.set("googleResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGoogleResult: Self = this.set("googleResult", js.undefined)
    
    @scala.inline
    def setIdLookupResult(value: /* Information about the result of an event. */ EventResult): Self = this.set("idLookupResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdLookupResult: Self = this.set("idLookupResult", js.undefined)
    
    @scala.inline
    def setIdQuestionsResult(value: /* Information about the result of an event. */ EventResult): Self = this.set("idQuestionsResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdQuestionsResult: Self = this.set("idQuestionsResult", js.undefined)
    
    @scala.inline
    def setIdentityVerificationResult(value: /* Information about the result of an event. */ EventResult): Self = this.set("identityVerificationResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentityVerificationResult: Self = this.set("identityVerificationResult", js.undefined)
    
    @scala.inline
    def setLinkedinResult(value: /* Information about the result of an event. */ EventResult): Self = this.set("linkedinResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinkedinResult: Self = this.set("linkedinResult", js.undefined)
    
    @scala.inline
    def setLiveIDResult(value: /* Information about the result of an event. */ EventResult): Self = this.set("liveIDResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLiveIDResult: Self = this.set("liveIDResult", js.undefined)
    
    @scala.inline
    def setOfacResult(value: /* Information about the result of an event. */ EventResult): Self = this.set("ofacResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOfacResult: Self = this.set("ofacResult", js.undefined)
    
    @scala.inline
    def setOpenIDResult(value: /* Information about the result of an event. */ EventResult): Self = this.set("openIDResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpenIDResult: Self = this.set("openIDResult", js.undefined)
    
    @scala.inline
    def setPhoneAuthResult(value: /* Information about the result of an event. */ EventResult): Self = this.set("phoneAuthResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhoneAuthResult: Self = this.set("phoneAuthResult", js.undefined)
    
    @scala.inline
    def setSTANPinResult(value: /* Information about the result of an event. */ EventResult): Self = this.set("sTANPinResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSTANPinResult: Self = this.set("sTANPinResult", js.undefined)
    
    @scala.inline
    def setSalesforceResult(value: /* Information about the result of an event. */ EventResult): Self = this.set("salesforceResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSalesforceResult: Self = this.set("salesforceResult", js.undefined)
    
    @scala.inline
    def setSignatureProviderResult(value: /* Information about the result of an event. */ EventResult): Self = this.set("signatureProviderResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignatureProviderResult: Self = this.set("signatureProviderResult", js.undefined)
    
    @scala.inline
    def setSmsAuthResult(value: /* Information about the result of an event. */ EventResult): Self = this.set("smsAuthResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmsAuthResult: Self = this.set("smsAuthResult", js.undefined)
    
    @scala.inline
    def setTwitterResult(value: /* Information about the result of an event. */ EventResult): Self = this.set("twitterResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTwitterResult: Self = this.set("twitterResult", js.undefined)
    
    @scala.inline
    def setYahooResult(value: /* Information about the result of an event. */ EventResult): Self = this.set("yahooResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYahooResult: Self = this.set("yahooResult", js.undefined)
  }
}
