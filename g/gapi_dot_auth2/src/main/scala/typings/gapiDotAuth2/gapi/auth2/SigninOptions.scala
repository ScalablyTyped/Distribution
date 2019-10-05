package typings.gapiDotAuth2.gapi.auth2

import typings.gapiDotAuth2.gapiDotAuth2Strings.popup
import typings.gapiDotAuth2.gapiDotAuth2Strings.redirect
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
    prompt: String = null,
    redirect_uri: String = null,
    scope: String = null,
    ux_mode: popup | redirect = null
  ): SigninOptions = {
    val __obj = js.Dynamic.literal()
    if (app_package_name != null) __obj.updateDynamic("app_package_name")(app_package_name)
    if (!js.isUndefined(fetch_basic_profile)) __obj.updateDynamic("fetch_basic_profile")(fetch_basic_profile)
    if (prompt != null) __obj.updateDynamic("prompt")(prompt)
    if (redirect_uri != null) __obj.updateDynamic("redirect_uri")(redirect_uri)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    if (ux_mode != null) __obj.updateDynamic("ux_mode")(ux_mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SigninOptions]
  }
}

