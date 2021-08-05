package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthenticationStatus extends StObject {
  
  /**
    * The result of a user's attempt to authenticate by using an access code. It returns:
    *
    * - `Status`: `Pass` or `Fail`.
    * - `dateTime`: The date and time that the event occurred.
    * - `FailureDescription`: A string containing the details about a failed authentication.
    * - `VendorFailureStatusCode`: A string containing the vendor's status code for a failed authentication.
    */
  var accessCodeResult: js.UndefOr[/* Information about the result of an event. */ EventResult] = js.undefined
  
  /**
    * The result of an age verification check. It returns:
    *
    * - `Status`: `Pass` or `Fail`.
    * - `dateTime`: The date and time that the event occurred.
    * - `FailureDescription`: A string containing the details about a failed authentication.
    * - `VendorFailureStatusCode`: A string containing the vendor's status code for a failed authentication.
    */
  var ageVerifyResult: js.UndefOr[/* Information about the result of an event. */ EventResult] = js.undefined
  
  /**
    * Deprecated.
    */
  var anySocialIDResult: js.UndefOr[/* Information about the result of an event. */ EventResult] = js.undefined
  
  /**
    * Deprecated.
    */
  var facebookResult: js.UndefOr[/* Information about the result of an event. */ EventResult] = js.undefined
  
  /**
    * Deprecated.
    */
  var googleResult: js.UndefOr[/* Information about the result of an event. */ EventResult] = js.undefined
  
  /**
    * The result of an ID lookup authentication check. It returns:
    *
    * - `Status`: `Pass` or `Fail`.
    * - `dateTime`: The date and time that the event occurred.
    * - `FailureDescription`: A string containing the details about a failed authentication.
    * - `VendorFailureStatusCode`: A string containing the vendor's status code for a failed authentication.
    */
  var idLookupResult: js.UndefOr[/* Information about the result of an event. */ EventResult] = js.undefined
  
  /**
    * The result of the user's answers to ID challenge questions. It returns:
    *
    * - `Status`: `Pass` or `Fail`.
    * - `dateTime`: The date and time that the event occurred.
    * - `FailureDescription`: A string containing the details about a failed authentication.
    * - `VendorFailureStatusCode`: A string containing the vendor's status code for a failed authentication.
    */
  var idQuestionsResult: js.UndefOr[/* Information about the result of an event. */ EventResult] = js.undefined
  
  /**
    * The result of an [Identity Verification][IDV] workflow.
    *
    * [IDV]: /esign/restapi/Accounts/IdentityVerifications/
    */
  var identityVerificationResult: js.UndefOr[/* Information about the result of an event. */ EventResult] = js.undefined
  
  /**
    * Deprecated.
    */
  var linkedinResult: js.UndefOr[/* Information about the result of an event. */ EventResult] = js.undefined
  
  /**
    * Deprecated.
    */
  var liveIDResult: js.UndefOr[/* Information about the result of an event. */ EventResult] = js.undefined
  
  /**
    * The result of an Office of Foreign Asset Control (OFAC) check. It returns:
    *
    * - `Status`: `Pass` or `Fail`.
    * - `dateTime`: The date and time that the event occurred.
    * - `FailureDescription`: A string containing the details about a failed authentication.
    * - `VendorFailureStatusCode`: A string containing the vendor's status code for a failed authentication.
    */
  var ofacResult: js.UndefOr[/* Information about the result of an event. */ EventResult] = js.undefined
  
  /**
    * Deprecated.
    */
  var openIDResult: js.UndefOr[/* Information about the result of an event. */ EventResult] = js.undefined
  
  /**
    * The result of the user's attempt to authenticate by using two-factor authentication (2FA) through phone messaging. It returns:
    *
    * - `Status`: `Pass` or `Fail`.
    * - `dateTime`: The date and time that the event occurred.
    * - `FailureDescription`: A string containing the details about a failed authentication.
    * - `VendorFailureStatusCode`: A string containing the vendor's status code for a failed authentication.
    */
  var phoneAuthResult: js.UndefOr[/* Information about the result of an event. */ EventResult] = js.undefined
  
  /**
    * The result of a Student Authentication Network (STAN) authentication check. It returns:
    *
    * - `Status`: `Pass` or `Fail`.
    * - `dateTime`: The date and time that the event occurred.
    * - `FailureDescription`: A string containing the details about a failed authentication.
    * - `VendorFailureStatusCode`: A string containing the vendor's status code for a failed authentication.
    */
  var sTANPinResult: js.UndefOr[/* Information about the result of an event. */ EventResult] = js.undefined
  
  /**
    * Success/failure result of authentication using sign-in with a Salesforce account. It returns:
    *
    * - `Status`: `Pass` or `Fail`.
    * - `dateTime`: The date and time that the event occurred.
    * - `FailureDescription`: A string containing the details about a failed authentication.
    * - `VendorFailureStatusCode`: A string containing the vendor's status code for a failed authentication.
    */
  var salesforceResult: js.UndefOr[/* Information about the result of an event. */ EventResult] = js.undefined
  
  /**
    * The result of the user's attempt to authenticate by using a signature provider.
    */
  var signatureProviderResult: js.UndefOr[/* Information about the result of an event. */ EventResult] = js.undefined
  
  /**
    * The result of the user's attempt to authenticate by using two-factor authentication (2FA) through SMS messaging on a mobile phone.
    */
  var smsAuthResult: js.UndefOr[/* Information about the result of an event. */ EventResult] = js.undefined
  
  /**
    * Deprecated.
    */
  var twitterResult: js.UndefOr[/* Information about the result of an event. */ EventResult] = js.undefined
  
  /**
    * Deprecated.
    */
  var yahooResult: js.UndefOr[/* Information about the result of an event. */ EventResult] = js.undefined
}
object AuthenticationStatus {
  
  inline def apply(): AuthenticationStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthenticationStatus]
  }
  
  extension [Self <: AuthenticationStatus](x: Self) {
    
    inline def setAccessCodeResult(value: /* Information about the result of an event. */ EventResult): Self = StObject.set(x, "accessCodeResult", value.asInstanceOf[js.Any])
    
    inline def setAccessCodeResultUndefined: Self = StObject.set(x, "accessCodeResult", js.undefined)
    
    inline def setAgeVerifyResult(value: /* Information about the result of an event. */ EventResult): Self = StObject.set(x, "ageVerifyResult", value.asInstanceOf[js.Any])
    
    inline def setAgeVerifyResultUndefined: Self = StObject.set(x, "ageVerifyResult", js.undefined)
    
    inline def setAnySocialIDResult(value: /* Information about the result of an event. */ EventResult): Self = StObject.set(x, "anySocialIDResult", value.asInstanceOf[js.Any])
    
    inline def setAnySocialIDResultUndefined: Self = StObject.set(x, "anySocialIDResult", js.undefined)
    
    inline def setFacebookResult(value: /* Information about the result of an event. */ EventResult): Self = StObject.set(x, "facebookResult", value.asInstanceOf[js.Any])
    
    inline def setFacebookResultUndefined: Self = StObject.set(x, "facebookResult", js.undefined)
    
    inline def setGoogleResult(value: /* Information about the result of an event. */ EventResult): Self = StObject.set(x, "googleResult", value.asInstanceOf[js.Any])
    
    inline def setGoogleResultUndefined: Self = StObject.set(x, "googleResult", js.undefined)
    
    inline def setIdLookupResult(value: /* Information about the result of an event. */ EventResult): Self = StObject.set(x, "idLookupResult", value.asInstanceOf[js.Any])
    
    inline def setIdLookupResultUndefined: Self = StObject.set(x, "idLookupResult", js.undefined)
    
    inline def setIdQuestionsResult(value: /* Information about the result of an event. */ EventResult): Self = StObject.set(x, "idQuestionsResult", value.asInstanceOf[js.Any])
    
    inline def setIdQuestionsResultUndefined: Self = StObject.set(x, "idQuestionsResult", js.undefined)
    
    inline def setIdentityVerificationResult(value: /* Information about the result of an event. */ EventResult): Self = StObject.set(x, "identityVerificationResult", value.asInstanceOf[js.Any])
    
    inline def setIdentityVerificationResultUndefined: Self = StObject.set(x, "identityVerificationResult", js.undefined)
    
    inline def setLinkedinResult(value: /* Information about the result of an event. */ EventResult): Self = StObject.set(x, "linkedinResult", value.asInstanceOf[js.Any])
    
    inline def setLinkedinResultUndefined: Self = StObject.set(x, "linkedinResult", js.undefined)
    
    inline def setLiveIDResult(value: /* Information about the result of an event. */ EventResult): Self = StObject.set(x, "liveIDResult", value.asInstanceOf[js.Any])
    
    inline def setLiveIDResultUndefined: Self = StObject.set(x, "liveIDResult", js.undefined)
    
    inline def setOfacResult(value: /* Information about the result of an event. */ EventResult): Self = StObject.set(x, "ofacResult", value.asInstanceOf[js.Any])
    
    inline def setOfacResultUndefined: Self = StObject.set(x, "ofacResult", js.undefined)
    
    inline def setOpenIDResult(value: /* Information about the result of an event. */ EventResult): Self = StObject.set(x, "openIDResult", value.asInstanceOf[js.Any])
    
    inline def setOpenIDResultUndefined: Self = StObject.set(x, "openIDResult", js.undefined)
    
    inline def setPhoneAuthResult(value: /* Information about the result of an event. */ EventResult): Self = StObject.set(x, "phoneAuthResult", value.asInstanceOf[js.Any])
    
    inline def setPhoneAuthResultUndefined: Self = StObject.set(x, "phoneAuthResult", js.undefined)
    
    inline def setSTANPinResult(value: /* Information about the result of an event. */ EventResult): Self = StObject.set(x, "sTANPinResult", value.asInstanceOf[js.Any])
    
    inline def setSTANPinResultUndefined: Self = StObject.set(x, "sTANPinResult", js.undefined)
    
    inline def setSalesforceResult(value: /* Information about the result of an event. */ EventResult): Self = StObject.set(x, "salesforceResult", value.asInstanceOf[js.Any])
    
    inline def setSalesforceResultUndefined: Self = StObject.set(x, "salesforceResult", js.undefined)
    
    inline def setSignatureProviderResult(value: /* Information about the result of an event. */ EventResult): Self = StObject.set(x, "signatureProviderResult", value.asInstanceOf[js.Any])
    
    inline def setSignatureProviderResultUndefined: Self = StObject.set(x, "signatureProviderResult", js.undefined)
    
    inline def setSmsAuthResult(value: /* Information about the result of an event. */ EventResult): Self = StObject.set(x, "smsAuthResult", value.asInstanceOf[js.Any])
    
    inline def setSmsAuthResultUndefined: Self = StObject.set(x, "smsAuthResult", js.undefined)
    
    inline def setTwitterResult(value: /* Information about the result of an event. */ EventResult): Self = StObject.set(x, "twitterResult", value.asInstanceOf[js.Any])
    
    inline def setTwitterResultUndefined: Self = StObject.set(x, "twitterResult", js.undefined)
    
    inline def setYahooResult(value: /* Information about the result of an event. */ EventResult): Self = StObject.set(x, "yahooResult", value.asInstanceOf[js.Any])
    
    inline def setYahooResultUndefined: Self = StObject.set(x, "yahooResult", js.undefined)
  }
}
