package typings.googleOneTap

import typings.googleOneTap.anon.Cancel
import typings.googleOneTap.googleOneTapStrings.auto
import typings.googleOneTap.googleOneTapStrings.auto_cancel
import typings.googleOneTap.googleOneTapStrings.browser_not_supported
import typings.googleOneTap.googleOneTapStrings.btn
import typings.googleOneTap.googleOneTapStrings.btn_add_session
import typings.googleOneTap.googleOneTapStrings.btn_confirm
import typings.googleOneTap.googleOneTapStrings.btn_confirm_add_session
import typings.googleOneTap.googleOneTapStrings.cancel_called
import typings.googleOneTap.googleOneTapStrings.center
import typings.googleOneTap.googleOneTapStrings.circle
import typings.googleOneTap.googleOneTapStrings.continue_with
import typings.googleOneTap.googleOneTapStrings.credential_returned
import typings.googleOneTap.googleOneTapStrings.debug
import typings.googleOneTap.googleOneTapStrings.dismissed
import typings.googleOneTap.googleOneTapStrings.display
import typings.googleOneTap.googleOneTapStrings.filled_black
import typings.googleOneTap.googleOneTapStrings.filled_blue
import typings.googleOneTap.googleOneTapStrings.flow_restarted
import typings.googleOneTap.googleOneTapStrings.icon
import typings.googleOneTap.googleOneTapStrings.info
import typings.googleOneTap.googleOneTapStrings.invalid_client
import typings.googleOneTap.googleOneTapStrings.issuing_failed
import typings.googleOneTap.googleOneTapStrings.large
import typings.googleOneTap.googleOneTapStrings.left
import typings.googleOneTap.googleOneTapStrings.medium
import typings.googleOneTap.googleOneTapStrings.missing_client_id
import typings.googleOneTap.googleOneTapStrings.opt_out_or_no_session
import typings.googleOneTap.googleOneTapStrings.outline
import typings.googleOneTap.googleOneTapStrings.pill
import typings.googleOneTap.googleOneTapStrings.popup
import typings.googleOneTap.googleOneTapStrings.rectangular
import typings.googleOneTap.googleOneTapStrings.redirect
import typings.googleOneTap.googleOneTapStrings.secure_http_required
import typings.googleOneTap.googleOneTapStrings.signin
import typings.googleOneTap.googleOneTapStrings.signin_with
import typings.googleOneTap.googleOneTapStrings.signup
import typings.googleOneTap.googleOneTapStrings.signup_with
import typings.googleOneTap.googleOneTapStrings.skipped
import typings.googleOneTap.googleOneTapStrings.small
import typings.googleOneTap.googleOneTapStrings.square
import typings.googleOneTap.googleOneTapStrings.standard
import typings.googleOneTap.googleOneTapStrings.suppressed_by_user
import typings.googleOneTap.googleOneTapStrings.tap_outside
import typings.googleOneTap.googleOneTapStrings.unknown_reason
import typings.googleOneTap.googleOneTapStrings.unregistered_origin
import typings.googleOneTap.googleOneTapStrings.use
import typings.googleOneTap.googleOneTapStrings.user
import typings.googleOneTap.googleOneTapStrings.user_1tap
import typings.googleOneTap.googleOneTapStrings.user_2tap
import typings.googleOneTap.googleOneTapStrings.user_cancel
import typings.googleOneTap.googleOneTapStrings.warn
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: accounts] (val x: Self) extends AnyVal {
      
      inline def setId(value: Cancel): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  trait CredentialResponse extends StObject {
    
    var credential: String
    
    var select_by: auto | user | user_1tap | user_2tap | btn | btn_confirm | btn_add_session | btn_confirm_add_session
  }
  object CredentialResponse {
    
    inline def apply(
      credential: String,
      select_by: auto | user | user_1tap | user_2tap | btn | btn_confirm | btn_add_session | btn_confirm_add_session
    ): CredentialResponse = {
      val __obj = js.Dynamic.literal(credential = credential.asInstanceOf[js.Any], select_by = select_by.asInstanceOf[js.Any])
      __obj.asInstanceOf[CredentialResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CredentialResponse] (val x: Self) extends AnyVal {
      
      inline def setCredential(value: String): Self = StObject.set(x, "credential", value.asInstanceOf[js.Any])
      
      inline def setSelect_by(
        value: auto | user | user_1tap | user_2tap | btn | btn_confirm | btn_add_session | btn_confirm_add_session
      ): Self = StObject.set(x, "select_by", value.asInstanceOf[js.Any])
    }
  }
  
  trait GsiButtonConfiguration extends StObject {
    
    var locale: js.UndefOr[String] = js.undefined
    
    var logo_alignment: js.UndefOr[left | center] = js.undefined
    
    var shape: js.UndefOr[rectangular | pill | circle | square] = js.undefined
    
    var size: js.UndefOr[large | medium | small] = js.undefined
    
    var text: js.UndefOr[signin_with | signup_with | continue_with | signin] = js.undefined
    
    var theme: js.UndefOr[outline | filled_blue | filled_black] = js.undefined
    
    var `type`: js.UndefOr[standard | icon] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object GsiButtonConfiguration {
    
    inline def apply(): GsiButtonConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GsiButtonConfiguration]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GsiButtonConfiguration] (val x: Self) extends AnyVal {
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setLogo_alignment(value: left | center): Self = StObject.set(x, "logo_alignment", value.asInstanceOf[js.Any])
      
      inline def setLogo_alignmentUndefined: Self = StObject.set(x, "logo_alignment", js.undefined)
      
      inline def setShape(value: rectangular | pill | circle | square): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      inline def setSize(value: large | medium | small): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setText(value: signin_with | signup_with | continue_with | signin): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setTheme(value: outline | filled_blue | filled_black): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setType(value: standard | icon): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait IdConfiguration extends StObject {
    
    var allowed_parent_origin: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var auto_select: js.UndefOr[Boolean] = js.undefined
    
    var callback: js.UndefOr[js.Function1[/* credentialResponse */ CredentialResponse, Unit]] = js.undefined
    
    var cancel_on_tap_outside: js.UndefOr[Boolean] = js.undefined
    
    var client_id: String
    
    var context: js.UndefOr[signin | signup | use] = js.undefined
    
    var intermediate_iframe_close_callback: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var itp_support: js.UndefOr[Boolean] = js.undefined
    
    // Undocumented, but extraordinarily helpful: https://stackoverflow.com/a/72883451/229792
    var log_level: js.UndefOr[debug | info | warn] = js.undefined
    
    var login_uri: js.UndefOr[String] = js.undefined
    
    var native_callback: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var nonce: js.UndefOr[String] = js.undefined
    
    var prompt_parent_id: js.UndefOr[String] = js.undefined
    
    var state_cookie_domain: js.UndefOr[String] = js.undefined
    
    var ux_mode: js.UndefOr[popup | redirect] = js.undefined
  }
  object IdConfiguration {
    
    inline def apply(client_id: String): IdConfiguration = {
      val __obj = js.Dynamic.literal(client_id = client_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[IdConfiguration]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IdConfiguration] (val x: Self) extends AnyVal {
      
      inline def setAllowed_parent_origin(value: String | js.Array[String]): Self = StObject.set(x, "allowed_parent_origin", value.asInstanceOf[js.Any])
      
      inline def setAllowed_parent_originUndefined: Self = StObject.set(x, "allowed_parent_origin", js.undefined)
      
      inline def setAllowed_parent_originVarargs(value: String*): Self = StObject.set(x, "allowed_parent_origin", js.Array(value*))
      
      inline def setAuto_select(value: Boolean): Self = StObject.set(x, "auto_select", value.asInstanceOf[js.Any])
      
      inline def setAuto_selectUndefined: Self = StObject.set(x, "auto_select", js.undefined)
      
      inline def setCallback(value: /* credentialResponse */ CredentialResponse => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setCancel_on_tap_outside(value: Boolean): Self = StObject.set(x, "cancel_on_tap_outside", value.asInstanceOf[js.Any])
      
      inline def setCancel_on_tap_outsideUndefined: Self = StObject.set(x, "cancel_on_tap_outside", js.undefined)
      
      inline def setClient_id(value: String): Self = StObject.set(x, "client_id", value.asInstanceOf[js.Any])
      
      inline def setContext(value: signin | signup | use): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setIntermediate_iframe_close_callback(value: () => Unit): Self = StObject.set(x, "intermediate_iframe_close_callback", js.Any.fromFunction0(value))
      
      inline def setIntermediate_iframe_close_callbackUndefined: Self = StObject.set(x, "intermediate_iframe_close_callback", js.undefined)
      
      inline def setItp_support(value: Boolean): Self = StObject.set(x, "itp_support", value.asInstanceOf[js.Any])
      
      inline def setItp_supportUndefined: Self = StObject.set(x, "itp_support", js.undefined)
      
      inline def setLog_level(value: debug | info | warn): Self = StObject.set(x, "log_level", value.asInstanceOf[js.Any])
      
      inline def setLog_levelUndefined: Self = StObject.set(x, "log_level", js.undefined)
      
      inline def setLogin_uri(value: String): Self = StObject.set(x, "login_uri", value.asInstanceOf[js.Any])
      
      inline def setLogin_uriUndefined: Self = StObject.set(x, "login_uri", js.undefined)
      
      inline def setNative_callback(value: () => Unit): Self = StObject.set(x, "native_callback", js.Any.fromFunction0(value))
      
      inline def setNative_callbackUndefined: Self = StObject.set(x, "native_callback", js.undefined)
      
      inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      inline def setPrompt_parent_id(value: String): Self = StObject.set(x, "prompt_parent_id", value.asInstanceOf[js.Any])
      
      inline def setPrompt_parent_idUndefined: Self = StObject.set(x, "prompt_parent_id", js.undefined)
      
      inline def setState_cookie_domain(value: String): Self = StObject.set(x, "state_cookie_domain", value.asInstanceOf[js.Any])
      
      inline def setState_cookie_domainUndefined: Self = StObject.set(x, "state_cookie_domain", js.undefined)
      
      inline def setUx_mode(value: popup | redirect): Self = StObject.set(x, "ux_mode", value.asInstanceOf[js.Any])
      
      inline def setUx_modeUndefined: Self = StObject.set(x, "ux_mode", js.undefined)
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PromptMomentNotification] (val x: Self) extends AnyVal {
      
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
  
  trait RevocationResponse extends StObject {
    
    var error: js.UndefOr[String] = js.undefined
    
    var successful: Boolean
  }
  object RevocationResponse {
    
    inline def apply(successful: Boolean): RevocationResponse = {
      val __obj = js.Dynamic.literal(successful = successful.asInstanceOf[js.Any])
      __obj.asInstanceOf[RevocationResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RevocationResponse] (val x: Self) extends AnyVal {
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setSuccessful(value: Boolean): Self = StObject.set(x, "successful", value.asInstanceOf[js.Any])
    }
  }
}
