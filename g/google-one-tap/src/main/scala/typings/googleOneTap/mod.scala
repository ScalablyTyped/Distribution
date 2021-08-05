package typings.googleOneTap

import typings.googleOneTap.anon.Cancel
import typings.googleOneTap.googleOneTapStrings.auto_cancel
import typings.googleOneTap.googleOneTapStrings.browser_not_supported
import typings.googleOneTap.googleOneTapStrings.cancel_called
import typings.googleOneTap.googleOneTapStrings.credential_returned
import typings.googleOneTap.googleOneTapStrings.dismissed
import typings.googleOneTap.googleOneTapStrings.display
import typings.googleOneTap.googleOneTapStrings.flow_restarted
import typings.googleOneTap.googleOneTapStrings.invalid_client
import typings.googleOneTap.googleOneTapStrings.issuing_failed
import typings.googleOneTap.googleOneTapStrings.missing_client_id
import typings.googleOneTap.googleOneTapStrings.opt_out_or_no_session
import typings.googleOneTap.googleOneTapStrings.secure_http_required
import typings.googleOneTap.googleOneTapStrings.skipped
import typings.googleOneTap.googleOneTapStrings.suppressed_by_user
import typings.googleOneTap.googleOneTapStrings.tap_outside
import typings.googleOneTap.googleOneTapStrings.unknown_reason
import typings.googleOneTap.googleOneTapStrings.unregistered_origin
import typings.googleOneTap.googleOneTapStrings.user_cancel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  trait accounts extends StObject {
    
    var id: Cancel
  }
  object accounts {
    
    @JSImport("google-one-tap", "accounts")
    @js.native
    val ^ : accounts = js.native
    
    extension [Self <: accounts](x: Self) {
      
      inline def setId(value: Cancel): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  trait CredentialResponse extends StObject {
    
    var client_id: String
    
    var credential: String
    
    var select_by: String
  }
  object CredentialResponse {
    
    inline def apply(client_id: String, credential: String, select_by: String): CredentialResponse = {
      val __obj = js.Dynamic.literal(client_id = client_id.asInstanceOf[js.Any], credential = credential.asInstanceOf[js.Any], select_by = select_by.asInstanceOf[js.Any])
      __obj.asInstanceOf[CredentialResponse]
    }
    
    extension [Self <: CredentialResponse](x: Self) {
      
      inline def setClient_id(value: String): Self = StObject.set(x, "client_id", value.asInstanceOf[js.Any])
      
      inline def setCredential(value: String): Self = StObject.set(x, "credential", value.asInstanceOf[js.Any])
      
      inline def setSelect_by(value: String): Self = StObject.set(x, "select_by", value.asInstanceOf[js.Any])
    }
  }
  
  trait IdConfiguration extends StObject {
    
    var auto_select: js.UndefOr[Boolean] = js.undefined
    
    var callback: js.UndefOr[js.Function1[/* credentialResponse */ CredentialResponse, Unit]] = js.undefined
    
    var cancel_on_tap_outside: js.UndefOr[Boolean] = js.undefined
    
    var client_id: js.UndefOr[String] = js.undefined
    
    var context: js.UndefOr[String] = js.undefined
    
    var native_callback: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var nonce: js.UndefOr[String] = js.undefined
    
    var prompt_parent_id: js.UndefOr[String] = js.undefined
    
    var state_cookie_domain: js.UndefOr[String] = js.undefined
  }
  object IdConfiguration {
    
    inline def apply(): IdConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IdConfiguration]
    }
    
    extension [Self <: IdConfiguration](x: Self) {
      
      inline def setAuto_select(value: Boolean): Self = StObject.set(x, "auto_select", value.asInstanceOf[js.Any])
      
      inline def setAuto_selectUndefined: Self = StObject.set(x, "auto_select", js.undefined)
      
      inline def setCallback(value: /* credentialResponse */ CredentialResponse => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setCancel_on_tap_outside(value: Boolean): Self = StObject.set(x, "cancel_on_tap_outside", value.asInstanceOf[js.Any])
      
      inline def setCancel_on_tap_outsideUndefined: Self = StObject.set(x, "cancel_on_tap_outside", js.undefined)
      
      inline def setClient_id(value: String): Self = StObject.set(x, "client_id", value.asInstanceOf[js.Any])
      
      inline def setClient_idUndefined: Self = StObject.set(x, "client_id", js.undefined)
      
      inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setNative_callback(value: () => Unit): Self = StObject.set(x, "native_callback", js.Any.fromFunction0(value))
      
      inline def setNative_callbackUndefined: Self = StObject.set(x, "native_callback", js.undefined)
      
      inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      inline def setPrompt_parent_id(value: String): Self = StObject.set(x, "prompt_parent_id", value.asInstanceOf[js.Any])
      
      inline def setPrompt_parent_idUndefined: Self = StObject.set(x, "prompt_parent_id", js.undefined)
      
      inline def setState_cookie_domain(value: String): Self = StObject.set(x, "state_cookie_domain", value.asInstanceOf[js.Any])
      
      inline def setState_cookie_domainUndefined: Self = StObject.set(x, "state_cookie_domain", js.undefined)
    }
  }
  
  trait PromptMomentNotification extends StObject {
    
    def getDismissedReason(): credential_returned | cancel_called | flow_restarted
    
    def getMomentType(): display | skipped | dismissed
    
    def getNotDisplayedReason(): browser_not_supported | invalid_client | missing_client_id | opt_out_or_no_session | secure_http_required | suppressed_by_user | unregistered_origin | unknown_reason
    
    def getSkippedReason(): auto_cancel | user_cancel | tap_outside | issuing_failed
    
    def isDismissedMoment(): Boolean
    
    def isDisplayMoment(): Boolean
    
    def isDisplayed(): Boolean
    
    def isNotDisplayed(): Boolean
    
    def isSkippedMoment(): Boolean
  }
  object PromptMomentNotification {
    
    inline def apply(
      getDismissedReason: () => credential_returned | cancel_called | flow_restarted,
      getMomentType: () => display | skipped | dismissed,
      getNotDisplayedReason: () => browser_not_supported | invalid_client | missing_client_id | opt_out_or_no_session | secure_http_required | suppressed_by_user | unregistered_origin | unknown_reason,
      getSkippedReason: () => auto_cancel | user_cancel | tap_outside | issuing_failed,
      isDismissedMoment: () => Boolean,
      isDisplayMoment: () => Boolean,
      isDisplayed: () => Boolean,
      isNotDisplayed: () => Boolean,
      isSkippedMoment: () => Boolean
    ): PromptMomentNotification = {
      val __obj = js.Dynamic.literal(getDismissedReason = js.Any.fromFunction0(getDismissedReason), getMomentType = js.Any.fromFunction0(getMomentType), getNotDisplayedReason = js.Any.fromFunction0(getNotDisplayedReason), getSkippedReason = js.Any.fromFunction0(getSkippedReason), isDismissedMoment = js.Any.fromFunction0(isDismissedMoment), isDisplayMoment = js.Any.fromFunction0(isDisplayMoment), isDisplayed = js.Any.fromFunction0(isDisplayed), isNotDisplayed = js.Any.fromFunction0(isNotDisplayed), isSkippedMoment = js.Any.fromFunction0(isSkippedMoment))
      __obj.asInstanceOf[PromptMomentNotification]
    }
    
    extension [Self <: PromptMomentNotification](x: Self) {
      
      inline def setGetDismissedReason(value: () => credential_returned | cancel_called | flow_restarted): Self = StObject.set(x, "getDismissedReason", js.Any.fromFunction0(value))
      
      inline def setGetMomentType(value: () => display | skipped | dismissed): Self = StObject.set(x, "getMomentType", js.Any.fromFunction0(value))
      
      inline def setGetNotDisplayedReason(
        value: () => browser_not_supported | invalid_client | missing_client_id | opt_out_or_no_session | secure_http_required | suppressed_by_user | unregistered_origin | unknown_reason
      ): Self = StObject.set(x, "getNotDisplayedReason", js.Any.fromFunction0(value))
      
      inline def setGetSkippedReason(value: () => auto_cancel | user_cancel | tap_outside | issuing_failed): Self = StObject.set(x, "getSkippedReason", js.Any.fromFunction0(value))
      
      inline def setIsDismissedMoment(value: () => Boolean): Self = StObject.set(x, "isDismissedMoment", js.Any.fromFunction0(value))
      
      inline def setIsDisplayMoment(value: () => Boolean): Self = StObject.set(x, "isDisplayMoment", js.Any.fromFunction0(value))
      
      inline def setIsDisplayed(value: () => Boolean): Self = StObject.set(x, "isDisplayed", js.Any.fromFunction0(value))
      
      inline def setIsNotDisplayed(value: () => Boolean): Self = StObject.set(x, "isNotDisplayed", js.Any.fromFunction0(value))
      
      inline def setIsSkippedMoment(value: () => Boolean): Self = StObject.set(x, "isSkippedMoment", js.Any.fromFunction0(value))
    }
  }
}
