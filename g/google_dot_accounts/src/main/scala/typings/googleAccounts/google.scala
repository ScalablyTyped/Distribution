package typings.googleAccounts

import typings.googleAccounts.googleAccountsStrings._empty
import typings.googleAccounts.googleAccountsStrings.auto_cancel
import typings.googleAccounts.googleAccountsStrings.browser_not_supported
import typings.googleAccounts.googleAccountsStrings.cancel_called
import typings.googleAccounts.googleAccountsStrings.center
import typings.googleAccounts.googleAccountsStrings.circle
import typings.googleAccounts.googleAccountsStrings.consent
import typings.googleAccounts.googleAccountsStrings.continue_with
import typings.googleAccounts.googleAccountsStrings.credential_returned
import typings.googleAccounts.googleAccountsStrings.dismissed
import typings.googleAccounts.googleAccountsStrings.display
import typings.googleAccounts.googleAccountsStrings.filled_black
import typings.googleAccounts.googleAccountsStrings.filled_blue
import typings.googleAccounts.googleAccountsStrings.flow_restarted
import typings.googleAccounts.googleAccountsStrings.icon
import typings.googleAccounts.googleAccountsStrings.invalid_client
import typings.googleAccounts.googleAccountsStrings.issuing_failed
import typings.googleAccounts.googleAccountsStrings.large
import typings.googleAccounts.googleAccountsStrings.left
import typings.googleAccounts.googleAccountsStrings.medium
import typings.googleAccounts.googleAccountsStrings.missing_client_id
import typings.googleAccounts.googleAccountsStrings.none
import typings.googleAccounts.googleAccountsStrings.opt_out_or_no_session
import typings.googleAccounts.googleAccountsStrings.outline
import typings.googleAccounts.googleAccountsStrings.pill
import typings.googleAccounts.googleAccountsStrings.popup
import typings.googleAccounts.googleAccountsStrings.rectangular
import typings.googleAccounts.googleAccountsStrings.redirect
import typings.googleAccounts.googleAccountsStrings.secure_http_required
import typings.googleAccounts.googleAccountsStrings.select_account
import typings.googleAccounts.googleAccountsStrings.signin
import typings.googleAccounts.googleAccountsStrings.signin_with
import typings.googleAccounts.googleAccountsStrings.signup
import typings.googleAccounts.googleAccountsStrings.signup_with
import typings.googleAccounts.googleAccountsStrings.skipped
import typings.googleAccounts.googleAccountsStrings.small
import typings.googleAccounts.googleAccountsStrings.square
import typings.googleAccounts.googleAccountsStrings.standard
import typings.googleAccounts.googleAccountsStrings.suppressed_by_user
import typings.googleAccounts.googleAccountsStrings.tap_outside
import typings.googleAccounts.googleAccountsStrings.unknown_reason
import typings.googleAccounts.googleAccountsStrings.unregistered_origin
import typings.googleAccounts.googleAccountsStrings.use
import typings.googleAccounts.googleAccountsStrings.user_cancel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object google {
  
  object accounts {
    
    object id {
      
      trait Credential extends StObject {
        
        var id: String
        
        var password: String
      }
      object Credential {
        
        inline def apply(id: String, password: String): Credential = {
          val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any])
          __obj.asInstanceOf[Credential]
        }
        
        @scala.inline
        implicit open class MutableBuilder[Self <: Credential] (val x: Self) extends AnyVal {
          
          inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
          
          inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
        }
      }
      
      /**
        * When your callback function is invoked, a CredentialResponse object
        * is passed as the parameter.
        */
      trait CredentialResponse extends StObject {
        
        /**
          * the ID token as a base64-encoded JSON Web Token (JWT) string.
          */
        var credential: String
        
        /**
          * This field sets how the credential is selected.
          */
        var select_by: String
      }
      object CredentialResponse {
        
        inline def apply(credential: String, select_by: String): CredentialResponse = {
          val __obj = js.Dynamic.literal(credential = credential.asInstanceOf[js.Any], select_by = select_by.asInstanceOf[js.Any])
          __obj.asInstanceOf[CredentialResponse]
        }
        
        @scala.inline
        implicit open class MutableBuilder[Self <: CredentialResponse] (val x: Self) extends AnyVal {
          
          inline def setCredential(value: String): Self = StObject.set(x, "credential", value.asInstanceOf[js.Any])
          
          inline def setSelect_by(value: String): Self = StObject.set(x, "select_by", value.asInstanceOf[js.Any])
        }
      }
      
      trait GsiButtonConfiguration extends StObject {
        
        /**
          * The pre-set locale of the button text. If it's not set, the
          * browser's default locale or the Google session user’s preference
          * is used.
          */
        var locale: js.UndefOr[String] = js.undefined
        
        /**
          * The alignment of the Google logo. The default value is left.
          * This attribute only applies to the standard button type.
          */
        var logo_alignment: js.UndefOr[left | center] = js.undefined
        
        /**
          * The button shape. The default value is rectangular.
          */
        var shape: js.UndefOr[rectangular | pill | circle | square] = js.undefined
        
        /**
          * The button size. For example, small or large.
          */
        var size: js.UndefOr[small | medium | large] = js.undefined
        
        /**
          * The button text. The default value is signin_with.
          * There are no visual differences for the text of icon buttons that
          * have different text attributes. The only exception is when the
          * text is read for screen accessibility.
          *
          * signin_with  The button text is “Sign in with Google”:
          * signup_with  The button text is “Sign up with Google”:
          * continue_with  The button text is “Continue with Google”:
          * signup_with  The button text is “Sign in”:
          */
        var text: js.UndefOr[signin_with | signup_with | continue_with | signin] = js.undefined
        
        /**
          * The button theme. For example, filled_blue or filled_black.
          * outline  A standard button theme:
          * filled_blue  A blue-filled button theme:
          * filled_black  A black-filled button theme:
          */
        var theme: js.UndefOr[outline | filled_blue | filled_black] = js.undefined
        
        /**
          * The button type: icon, or standard button.
          */
        var `type`: standard | icon
        
        /**
          * The minimum button width, in pixels. The maximum width is 400
          * pixels.
          */
        var width: js.UndefOr[String] = js.undefined
      }
      object GsiButtonConfiguration {
        
        inline def apply(`type`: standard | icon): GsiButtonConfiguration = {
          val __obj = js.Dynamic.literal()
          __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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
          
          inline def setSize(value: small | medium | large): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
          
          inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
          
          inline def setText(value: signin_with | signup_with | continue_with | signin): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
          
          inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
          
          inline def setTheme(value: outline | filled_blue | filled_black): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
          
          inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
          
          inline def setType(value: standard | icon): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
          
          inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
          
          inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
        }
      }
      
      trait IdConfiguration extends StObject {
        
        /**
          * The origins that are allowed to embed the intermediate iframe.
          * One Tap will run in the intermediate iframe mode if this field
          * presents.
          */
        var allowed_parent_origin: js.UndefOr[String | js.Array[String]] = js.undefined
        
        /**
          * Enables automatic selection.
          */
        var auto_select: js.UndefOr[Boolean] = js.undefined
        
        /**
          * The JavaScript function that handles ID tokens.
          * Required for Google One Tap and the Sign In With Google button
          * popup UX mode
          */
        var callback: js.UndefOr[js.Function1[/* response */ CredentialResponse, Unit]] = js.undefined
        
        /**
          * Cancels the prompt if the user clicks outside the prompt.
          * Default value is true.
          */
        var cancel_on_tap_outside: js.UndefOr[Boolean] = js.undefined
        
        /**
          * Your application's client ID
          */
        var client_id: String
        
        /**
          * Sets the title and message in the One Tap prompt
          * Available contexts:
          *   signin "Sign in with Google"
          *   signup "Sign up with Google"
          *   use    "Use with Google"
          */
        var context: js.UndefOr[signin | signup | use] = js.undefined
        
        /**
          * Overrides the default intermediate iframe behavior when users
          * manually close One Tap.
          */
        var intermediate_iframe_close_callback: js.UndefOr[js.Function0[Unit]] = js.undefined
        
        /**
          * This field determines if the upgraded One Tap UX should be enabled
          * on browsers that support Intelligent Tracking Prevention (ITP).
          */
        var itp_support: js.UndefOr[Boolean] = js.undefined
        
        /**
          * The URL of your login endpoint.
          * Defaults to the URI of the current page, or the value you
          * specify.
          * Only used when ux_mode: "redirect" is set.
          */
        var login_uri: js.UndefOr[String] = js.undefined
        
        /**
          * The JavaScript function that handles password credentials.
          */
        var native_callback: js.UndefOr[js.Function1[/* response */ CredentialResponse, Unit]] = js.undefined
        
        /**
          * A random string for ID tokens
          */
        var nonce: js.UndefOr[String] = js.undefined
        
        /**
          * The DOM ID of the One Tap prompt container element
          * If it's not set, the One Tap prompt is displayed in the top-right
          * corner of the window.
          */
        var prompt_parent_id: js.UndefOr[String] = js.undefined
        
        /**
          * If you need to call One Tap in the parent domain and its
          * subdomains, pass the parent domain to this field so that a single
          * shared cookie is used.
          */
        var state_cookie_domain: js.UndefOr[String] = js.undefined
        
        /**
          * The Sign In With Google button UX flow. The default value is
          * popup.
          */
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
          
          inline def setCallback(value: /* response */ CredentialResponse => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
          
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
          
          inline def setLogin_uri(value: String): Self = StObject.set(x, "login_uri", value.asInstanceOf[js.Any])
          
          inline def setLogin_uriUndefined: Self = StObject.set(x, "login_uri", js.undefined)
          
          inline def setNative_callback(value: /* response */ CredentialResponse => Unit): Self = StObject.set(x, "native_callback", js.Any.fromFunction1(value))
          
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
        
        /**
          * The detailed reason for the dismissal.
          */
        def getDismissedReason(): credential_returned | cancel_called | flow_restarted
        
        /**
          * Return a string for the moment type.
          */
        def getMomentType(): display | skipped | dismissed
        
        /**
          * The detailed reason why the UI isn't displayed.
          */
        def getNotDisplayedReason(): browser_not_supported | invalid_client | missing_client_id | opt_out_or_no_session | secure_http_required | suppressed_by_user | unregistered_origin | unknown_reason
        
        /**
          * The detailed reason for the skipped moment.
          */
        def getSkippedReason(): auto_cancel | user_cancel | tap_outside | issuing_failed
        
        /**
          * Is this notification for a dismissed moment?
          */
        def isDismissedMoment(): Boolean
        
        /**
          * Is this notification for a display moment?
          */
        def isDisplayMoment(): Boolean
        
        /**
          * Is this notification for a display moment, and the UI is
          * displayed?
          */
        def isDisplayed(): Boolean
        
        /**
          * Is this notification for a display moment, and the UI isn't
          * displayed?
          */
        def isNotDisplayed(): Boolean
        
        /**
          * Is this notification for a skipped moment?
          */
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
        
        /**
          * This field is a string value and contains a detailed error
          * message if the revoke method call failed, it is undefined on
          * success.
          */
        var error: js.UndefOr[String] = js.undefined
        
        /**
          * This field is a boolean value set to true if the revoke method
          * call succeeded or false on failure.
          */
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
    
    object oauth2 {
      
      trait CodeClient extends StObject {
        
        /**
          * starts the OAuth 2.0 Code UX flow.
          */
        def requestCode(): Unit
      }
      object CodeClient {
        
        inline def apply(requestCode: () => Unit): CodeClient = {
          val __obj = js.Dynamic.literal(requestCode = js.Any.fromFunction0(requestCode))
          __obj.asInstanceOf[CodeClient]
        }
        
        @scala.inline
        implicit open class MutableBuilder[Self <: CodeClient] (val x: Self) extends AnyVal {
          
          inline def setRequestCode(value: () => Unit): Self = StObject.set(x, "requestCode", js.Any.fromFunction0(value))
        }
      }
      
      trait CodeClientConfig extends StObject {
        
        /**
          * Required for popup UX. The JavaScript function name that handles
          * returned code response. The property will be ignored by the
          * redirect UX.
          */
        var callback: js.UndefOr[js.Function1[/* response */ Any, Unit]] = js.undefined
        
        /**
          * Required. The client ID for your application. You can find this
          * value in the API Console.
          */
        var client_id: String
        
        /**
          * Optional, defaults to true. If set to false, more granular Google
          * Account permissions will be disabled for clients created before
          * 2019. No effect for newer clients, since more granular
          * permissions is always enabled for them.
          */
        var enable_serial_consent: js.UndefOr[Boolean] = js.undefined
        
        /**
          * Optional. If your application knows which user should authorize
          * the request, it can use this property to provide a hint to
          * Google. The email address for the target user. For more
          * information, see the login_hint field in the OpenID Connect docs.
          */
        var hint: js.UndefOr[String] = js.undefined
        
        /**
          * Optional. If your application knows the Workspace domain the user
          * belongs to, use this to provide a hint to Google. For more
          * information, see the hd field in the OpenID Connect docs.
          */
        var hosted_domain: js.UndefOr[String] = js.undefined
        
        /**
          * Required for redirect UX. Determines where the API server
          * redirects the user after the user completes the authorization
          * flow. The value must exactly match one of the authorized redirect
          * URIs for the OAuth 2.0 client, which you configured in the API
          * Console and must conform to our Redirect URI validation rules.
          * The property will be ignored by the popup UX.
          */
        var redirect_uri: js.UndefOr[String] = js.undefined
        
        /**
          * Required. A space-delimited list of scopes that identify the
          * resources that your application could access on the user's
          * behalf. These values inform the consent screen that Google
          * displays to the user.
          */
        var scope: String
        
        /**
          * Optional, defaults to 'false'. Boolean value to prompt the user
          * to select an account.
          */
        var select_account: js.UndefOr[Boolean] = js.undefined
        
        /**
          * Optional. Recommended for redirect UX. Specifies any string value
          * that your application uses to maintain state between your
          * authorization request and the authorization server's response.
          */
        var state: js.UndefOr[String] = js.undefined
        
        /**
          * Optional. The UX mode to use for the authorization flow. By
          * default, it will open the consent flow in a popup. Valid values
          * are popup and redirect.
          */
        var ux_mode: js.UndefOr[popup | redirect] = js.undefined
      }
      object CodeClientConfig {
        
        inline def apply(client_id: String, scope: String): CodeClientConfig = {
          val __obj = js.Dynamic.literal(client_id = client_id.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
          __obj.asInstanceOf[CodeClientConfig]
        }
        
        @scala.inline
        implicit open class MutableBuilder[Self <: CodeClientConfig] (val x: Self) extends AnyVal {
          
          inline def setCallback(value: /* response */ Any => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
          
          inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
          
          inline def setClient_id(value: String): Self = StObject.set(x, "client_id", value.asInstanceOf[js.Any])
          
          inline def setEnable_serial_consent(value: Boolean): Self = StObject.set(x, "enable_serial_consent", value.asInstanceOf[js.Any])
          
          inline def setEnable_serial_consentUndefined: Self = StObject.set(x, "enable_serial_consent", js.undefined)
          
          inline def setHint(value: String): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
          
          inline def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
          
          inline def setHosted_domain(value: String): Self = StObject.set(x, "hosted_domain", value.asInstanceOf[js.Any])
          
          inline def setHosted_domainUndefined: Self = StObject.set(x, "hosted_domain", js.undefined)
          
          inline def setRedirect_uri(value: String): Self = StObject.set(x, "redirect_uri", value.asInstanceOf[js.Any])
          
          inline def setRedirect_uriUndefined: Self = StObject.set(x, "redirect_uri", js.undefined)
          
          inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
          
          inline def setSelect_account(value: Boolean): Self = StObject.set(x, "select_account", value.asInstanceOf[js.Any])
          
          inline def setSelect_accountUndefined: Self = StObject.set(x, "select_account", js.undefined)
          
          inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
          
          inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
          
          inline def setUx_mode(value: popup | redirect): Self = StObject.set(x, "ux_mode", value.asInstanceOf[js.Any])
          
          inline def setUx_modeUndefined: Self = StObject.set(x, "ux_mode", js.undefined)
        }
      }
      
      trait OverridableTokenClientConfig extends StObject {
        
        /**
          * Optional. If set to false, more granular Google Account
          * permissions will be disabled for clients created before 2019. No
          * effect for newer clients, since more granular permissions is
          * always enabled for them.
          */
        var enable_serial_consent: js.UndefOr[Boolean] = js.undefined
        
        /**
          * Optional. If your application knows which user should authorize
          * the request, it can use this property to provide a hint to
          * Google. The email address for the target user. For more
          * information, see the login_hint field in the OpenID Connect docs.
          */
        var hint: js.UndefOr[String] = js.undefined
        
        /**
          * Optional. A space-delimited, case-sensitive list of prompts to
          * present the user.
          */
        var prompt: js.UndefOr[String] = js.undefined
        
        /**
          * Optional. Not recommended. Specifies any string value that your
          * application uses to maintain state between your authorization
          * request and the authorization server's response.
          */
        var state: js.UndefOr[String] = js.undefined
      }
      object OverridableTokenClientConfig {
        
        inline def apply(): OverridableTokenClientConfig = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[OverridableTokenClientConfig]
        }
        
        @scala.inline
        implicit open class MutableBuilder[Self <: OverridableTokenClientConfig] (val x: Self) extends AnyVal {
          
          inline def setEnable_serial_consent(value: Boolean): Self = StObject.set(x, "enable_serial_consent", value.asInstanceOf[js.Any])
          
          inline def setEnable_serial_consentUndefined: Self = StObject.set(x, "enable_serial_consent", js.undefined)
          
          inline def setHint(value: String): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
          
          inline def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
          
          inline def setPrompt(value: String): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
          
          inline def setPromptUndefined: Self = StObject.set(x, "prompt", js.undefined)
          
          inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
          
          inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
        }
      }
      
      @js.native
      trait TokenClient extends StObject {
        
        /**
          * starts the OAuth 2.0 Token UX flow
          */
        def requestAccessToken(): Unit = js.native
        def requestAccessToken(overrideConfig: OverridableTokenClientConfig): Unit = js.native
      }
      
      trait TokenClientConfig extends StObject {
        
        /**
          * Required. The JavaScript function name that handles returned
          * token response.
          */
        def callback(tokenResponse: TokenResponse): Unit
        
        /**
          * Required.
          * The client ID for your application. You can find this value in
          * the API Console.
          */
        var client_id: String
        
        /**
          * Optional, defaults to true.
          * If set to false, more granular Google Account permissions will be
          * disabled for clients created before 2019. No effect for newer
          * clients, since more granular permissions is always enabled for
          * them.
          */
        var enable_serial_consent: js.UndefOr[Boolean] = js.undefined
        
        /**
          * Optional.
          * If your application knows which user should authorize the
          * request, it can use this property to provide a hint to Google.
          * The email address for the target user. For more information, see
          * the login_hint field in the OpenID Connect docs.
          */
        var hint: js.UndefOr[String] = js.undefined
        
        /**
          * Optional.
          * If your application knows the Workspace domain the user belongs
          * to, use this to provide a hint to Google. For more information,
          * see the hd field in the OpenID Connect docs.
          */
        var hosted_domain: js.UndefOr[String] = js.undefined
        
        /**
          * Optional, defaults to 'select_account'.
          * A space-delimited, case-sensitive list of prompts to present the
          * user.
          * Possible values are:
          * empty string The user will be prompted only the first time your
          *     app requests access. Cannot be specified with other values.
          * 'none' Do not display any authentication or consent screens. Must
          *     not be specified with other values.
          * 'consent' Prompt the user for consent.
          * 'select_account' Prompt the user to select an account.
          */
        var prompt: js.UndefOr[_empty | none | consent | select_account] = js.undefined
        
        /**
          * Optional.
          * A space-delimited list of scopes that identify the resources that
          * your application could access on the user's behalf. These values
          * inform the consent screen that Google displays to the user.
          */
        var scope: js.UndefOr[String] = js.undefined
        
        /**
          * Optional. Not recommended.
          * Specifies any string value that your application uses to maintain
          * state between your authorization request and the authorization
          * server's response.
          */
        var state: js.UndefOr[String] = js.undefined
      }
      object TokenClientConfig {
        
        inline def apply(callback: TokenResponse => Unit, client_id: String): TokenClientConfig = {
          val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), client_id = client_id.asInstanceOf[js.Any])
          __obj.asInstanceOf[TokenClientConfig]
        }
        
        @scala.inline
        implicit open class MutableBuilder[Self <: TokenClientConfig] (val x: Self) extends AnyVal {
          
          inline def setCallback(value: TokenResponse => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
          
          inline def setClient_id(value: String): Self = StObject.set(x, "client_id", value.asInstanceOf[js.Any])
          
          inline def setEnable_serial_consent(value: Boolean): Self = StObject.set(x, "enable_serial_consent", value.asInstanceOf[js.Any])
          
          inline def setEnable_serial_consentUndefined: Self = StObject.set(x, "enable_serial_consent", js.undefined)
          
          inline def setHint(value: String): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
          
          inline def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
          
          inline def setHosted_domain(value: String): Self = StObject.set(x, "hosted_domain", value.asInstanceOf[js.Any])
          
          inline def setHosted_domainUndefined: Self = StObject.set(x, "hosted_domain", js.undefined)
          
          inline def setPrompt(value: _empty | none | consent | select_account): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
          
          inline def setPromptUndefined: Self = StObject.set(x, "prompt", js.undefined)
          
          inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
          
          inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
          
          inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
          
          inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
        }
      }
      
      /**
        * A TokenResponse JavaScript object will be passed to your callback
        * method in the popup UX.
        */
      trait TokenResponse extends StObject {
        
        /**
          * The access token of a successful token response.
          */
        var access_token: String
        
        /**
          * A single ASCII error code.
          */
        var error: String
        
        /**
          * Human-readable ASCII text providing additional information, used
          * to assist the client developer in understanding the error that
          * occurred.
          */
        var error_description: String
        
        /**
          * A URI identifying a human-readable web page with information
          * about the error, used to provide the client developer with
          * additional information about the error.
          */
        var error_uri: String
        
        /**
          * The lifetime in seconds of the access token.
          */
        var expires_in: String
        
        /**
          * The hosted domain the signed-in user belongs to.
          */
        var hd: String
        
        /**
          * The prompt value that was used from the possible list of values
          * specified by TokenClientConfig or OverridableTokenClientConfig.
          */
        var prompt: String
        
        /**
          * A space-delimited list of scopes that are approved by the user.
          */
        var scopes: String
        
        /**
          * The string value that your application uses to maintain state
          * between your authorization request and the response.
          */
        var state: String
        
        /**
          * The type of the token issued.
          */
        var token_type: String
      }
      object TokenResponse {
        
        inline def apply(
          access_token: String,
          error: String,
          error_description: String,
          error_uri: String,
          expires_in: String,
          hd: String,
          prompt: String,
          scopes: String,
          state: String,
          token_type: String
        ): TokenResponse = {
          val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], error_description = error_description.asInstanceOf[js.Any], error_uri = error_uri.asInstanceOf[js.Any], expires_in = expires_in.asInstanceOf[js.Any], hd = hd.asInstanceOf[js.Any], prompt = prompt.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], token_type = token_type.asInstanceOf[js.Any])
          __obj.asInstanceOf[TokenResponse]
        }
        
        @scala.inline
        implicit open class MutableBuilder[Self <: TokenResponse] (val x: Self) extends AnyVal {
          
          inline def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
          
          inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
          
          inline def setError_description(value: String): Self = StObject.set(x, "error_description", value.asInstanceOf[js.Any])
          
          inline def setError_uri(value: String): Self = StObject.set(x, "error_uri", value.asInstanceOf[js.Any])
          
          inline def setExpires_in(value: String): Self = StObject.set(x, "expires_in", value.asInstanceOf[js.Any])
          
          inline def setHd(value: String): Self = StObject.set(x, "hd", value.asInstanceOf[js.Any])
          
          inline def setPrompt(value: String): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
          
          inline def setScopes(value: String): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
          
          inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
          
          inline def setToken_type(value: String): Self = StObject.set(x, "token_type", value.asInstanceOf[js.Any])
        }
      }
    }
  }
}
