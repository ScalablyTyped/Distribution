package typings.googleAccounts.google.accounts

import typings.googleAccounts.googleAccountsStrings._empty
import typings.googleAccounts.googleAccountsStrings.consent
import typings.googleAccounts.googleAccountsStrings.none
import typings.googleAccounts.googleAccountsStrings.popup
import typings.googleAccounts.googleAccountsStrings.popup_closed
import typings.googleAccounts.googleAccountsStrings.popup_failed_to_open
import typings.googleAccounts.googleAccountsStrings.redirect
import typings.googleAccounts.googleAccountsStrings.select_account
import typings.googleAccounts.googleAccountsStrings.unknown
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object oauth2 {
  
  trait ClientConfigError
    extends StObject
       with Error {
    
    var `type`: unknown | popup_closed | popup_failed_to_open
  }
  object ClientConfigError {
    
    inline def apply(message: String, name: String, `type`: unknown | popup_closed | popup_failed_to_open): ClientConfigError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientConfigError]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ClientConfigError] (val x: Self) extends AnyVal {
      
      inline def setType(value: unknown | popup_closed | popup_failed_to_open): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
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
    var callback: js.UndefOr[js.Function1[/* response */ CodeResponse, Unit]] = js.undefined
    
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
      * Optional. The JavaScript function that handles some non-OAuth
      * errors, such as the popup window is failed to open; or closed
      * before an OAuth response is returned.
      */
    var error_callback: js.UndefOr[js.Function1[/* error */ ClientConfigError, Unit]] = js.undefined
    
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
      
      inline def setCallback(value: /* response */ CodeResponse => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setClient_id(value: String): Self = StObject.set(x, "client_id", value.asInstanceOf[js.Any])
      
      inline def setEnable_serial_consent(value: Boolean): Self = StObject.set(x, "enable_serial_consent", value.asInstanceOf[js.Any])
      
      inline def setEnable_serial_consentUndefined: Self = StObject.set(x, "enable_serial_consent", js.undefined)
      
      inline def setError_callback(value: /* error */ ClientConfigError => Unit): Self = StObject.set(x, "error_callback", js.Any.fromFunction1(value))
      
      inline def setError_callbackUndefined: Self = StObject.set(x, "error_callback", js.undefined)
      
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
  
  /**
    * A CodeResponse JavaScript object will be passed to your callback
    * method (as defined in CodeClientConfig) in the popup UX.
    */
  trait CodeResponse extends StObject {
    
    /**
      * The authorization code of a successful token response.
      */
    var code: String
    
    /**
      * A single ASCII error code.
      */
    var error: String
    
    /**
      * Human-readable ASCII text providing additional information,
      * used to assist the client developer in understanding
      * the error that occurred.
      */
    var error_description: String
    
    /**
      * A URI identifying a human-readable web page with information
      * about the error, used to provide the client developer with
      * additional information about the error.
      */
    var error_uri: String
    
    /**
      * A space-delimited list of scopes that are approved by the user.
      */
    var scope: String
    
    /**
      * The string value that your application uses to maintain state
      * between your authorization request and the response.
      */
    var state: String
  }
  object CodeResponse {
    
    inline def apply(
      code: String,
      error: String,
      error_description: String,
      error_uri: String,
      scope: String,
      state: String
    ): CodeResponse = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], error_description = error_description.asInstanceOf[js.Any], error_uri = error_uri.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[CodeResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CodeResponse] (val x: Self) extends AnyVal {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setError_description(value: String): Self = StObject.set(x, "error_description", value.asInstanceOf[js.Any])
      
      inline def setError_uri(value: String): Self = StObject.set(x, "error_uri", value.asInstanceOf[js.Any])
      
      inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
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
      * Optional. The JavaScript function that handles some non-OAuth
      * errors, such as the popup window is failed to open; or closed
      * before an OAuth response is returned.
      */
    var error_callback: js.UndefOr[js.Function1[/* error */ ClientConfigError, Unit]] = js.undefined
    
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
      * Required.
      * A space-delimited list of scopes that identify the resources that
      * your application could access on the user's behalf. These values
      * inform the consent screen that Google displays to the user.
      */
    var scope: String
    
    /**
      * Optional. Not recommended.
      * Specifies any string value that your application uses to maintain
      * state between your authorization request and the authorization
      * server's response.
      */
    var state: js.UndefOr[String] = js.undefined
  }
  object TokenClientConfig {
    
    inline def apply(callback: TokenResponse => Unit, client_id: String, scope: String): TokenClientConfig = {
      val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), client_id = client_id.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
      __obj.asInstanceOf[TokenClientConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TokenClientConfig] (val x: Self) extends AnyVal {
      
      inline def setCallback(value: TokenResponse => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
      
      inline def setClient_id(value: String): Self = StObject.set(x, "client_id", value.asInstanceOf[js.Any])
      
      inline def setEnable_serial_consent(value: Boolean): Self = StObject.set(x, "enable_serial_consent", value.asInstanceOf[js.Any])
      
      inline def setEnable_serial_consentUndefined: Self = StObject.set(x, "enable_serial_consent", js.undefined)
      
      inline def setError_callback(value: /* error */ ClientConfigError => Unit): Self = StObject.set(x, "error_callback", js.Any.fromFunction1(value))
      
      inline def setError_callbackUndefined: Self = StObject.set(x, "error_callback", js.undefined)
      
      inline def setHint(value: String): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
      
      inline def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
      
      inline def setHosted_domain(value: String): Self = StObject.set(x, "hosted_domain", value.asInstanceOf[js.Any])
      
      inline def setHosted_domainUndefined: Self = StObject.set(x, "hosted_domain", js.undefined)
      
      inline def setPrompt(value: _empty | none | consent | select_account): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
      
      inline def setPromptUndefined: Self = StObject.set(x, "prompt", js.undefined)
      
      inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    }
  }
  
  /**
    * A TokenResponse JavaScript object will be passed to your callback
    * method (as defined in TokenClientConfig) in the popup UX.
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
    var scope: String
    
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
      scope: String,
      state: String,
      token_type: String
    ): TokenResponse = {
      val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], error_description = error_description.asInstanceOf[js.Any], error_uri = error_uri.asInstanceOf[js.Any], expires_in = expires_in.asInstanceOf[js.Any], hd = hd.asInstanceOf[js.Any], prompt = prompt.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], token_type = token_type.asInstanceOf[js.Any])
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
      
      inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setToken_type(value: String): Self = StObject.set(x, "token_type", value.asInstanceOf[js.Any])
    }
  }
}
