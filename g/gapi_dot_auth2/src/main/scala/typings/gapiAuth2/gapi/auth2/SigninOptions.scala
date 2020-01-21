package typings.gapiAuth2.gapi.auth2

import typings.gapiAuth2.gapiAuth2Strings.popup
import typings.gapiAuth2.gapiAuth2Strings.redirect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SigninOptions extends js.Object {
  /**
    * The package name of the Android app to install over the air.
    * See Android app installs from your web site:
    * https://developers.google.com/identity/sign-in/web/android-app-installs
    */
  var app_package_name: js.UndefOr[String] = js.undefined
  /**
    * 	Fetch users' basic profile information when they sign in.
    * 	Adds 'profile', 'email' and 'openid' to the requested scopes.
    * 	True if unspecified.
    */
  var fetch_basic_profile: js.UndefOr[Boolean] = js.undefined
  /**
    * When your app knows which user it is trying to authenticate, it can provide this parameter as a hint to the authentication server.
    * Passing this hint suppresses the account chooser and either pre-fill the email box on the sign-in form, or select the proper session (if the user is using multiple sign-in),
    * which can help you avoid problems that occur if your app logs in the wrong user account. The value can be either an email address or the sub string,
    * which is equivalent to the user's Google ID.
    * https://developers.google.com/identity/protocols/OpenIDConnect?hl=en#authenticationuriparameters
    */
  var login_hint: js.UndefOr[String] = js.undefined
  /**
    * Specifies whether to prompt the user for re-authentication.
    * See OpenID Connect Request Parameters:
    * https://openid.net/specs/openid-connect-basic-1_0.html#RequestParameters
    */
  var prompt: js.UndefOr[String] = js.undefined
  /**
    * If using ux_mode='redirect', this parameter allows you to override the default redirect_uri that will be used at the end of the consent flow.
    * The default redirect_uri is the current URL stripped of query parameters and hash fragment.
    */
  var redirect_uri: js.UndefOr[String] = js.undefined
  /**
    * The scopes to request, as a space-delimited string.
    * Optional if fetch_basic_profile is not set to false.
    */
  var scope: js.UndefOr[String] = js.undefined
  /**
    * The UX mode to use for the sign-in flow.
    * By default, it will open the consent flow in a popup.
    */
  var ux_mode: js.UndefOr[popup | redirect] = js.undefined
}

object SigninOptions {
  @scala.inline
  def apply(
    app_package_name: String = null,
    fetch_basic_profile: js.UndefOr[Boolean] = js.undefined,
    login_hint: String = null,
    prompt: String = null,
    redirect_uri: String = null,
    scope: String = null,
    ux_mode: popup | redirect = null
  ): SigninOptions = {
    val __obj = js.Dynamic.literal()
    if (app_package_name != null) __obj.updateDynamic("app_package_name")(app_package_name.asInstanceOf[js.Any])
    if (!js.isUndefined(fetch_basic_profile)) __obj.updateDynamic("fetch_basic_profile")(fetch_basic_profile.asInstanceOf[js.Any])
    if (login_hint != null) __obj.updateDynamic("login_hint")(login_hint.asInstanceOf[js.Any])
    if (prompt != null) __obj.updateDynamic("prompt")(prompt.asInstanceOf[js.Any])
    if (redirect_uri != null) __obj.updateDynamic("redirect_uri")(redirect_uri.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (ux_mode != null) __obj.updateDynamic("ux_mode")(ux_mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SigninOptions]
  }
}

