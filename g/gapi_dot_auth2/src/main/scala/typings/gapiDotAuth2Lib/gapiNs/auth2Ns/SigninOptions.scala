package typings
package gapiDotAuth2Lib.gapiNs.auth2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SigninOptions extends js.Object {
  /**
    * The package name of the Android app to install over the air.
    * See Android app installs from your web site:
    * https://developers.google.com/identity/sign-in/web/android-app-installs
    */
  var app_package_name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 	Fetch users' basic profile information when they sign in.
    * 	Adds 'profile', 'email' and 'openid' to the requested scopes.
    * 	True if unspecified.
    */
  var fetch_basic_profile: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Specifies whether to prompt the user for re-authentication.
    * See OpenID Connect Request Parameters:
    * https://openid.net/specs/openid-connect-basic-1_0.html#RequestParameters
    */
  var prompt: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If using ux_mode='redirect', this parameter allows you to override the default redirect_uri that will be used at the end of the consent flow.
    * The default redirect_uri is the current URL stripped of query parameters and hash fragment.
    */
  var redirect_uri: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The scopes to request, as a space-delimited string.
    * Optional if fetch_basic_profile is not set to false.
    */
  var scope: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The UX mode to use for the sign-in flow.
    * By default, it will open the consent flow in a popup.
    */
  var ux_mode: js.UndefOr[
    gapiDotAuth2Lib.gapiDotAuth2LibStrings.popup | gapiDotAuth2Lib.gapiDotAuth2LibStrings.redirect
  ] = js.undefined
}

