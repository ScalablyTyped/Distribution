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
       * The scopes to request, as a space-delimited string.
       * Optional if fetch_basic_profile is not set to false.
       */
  var scope: js.UndefOr[java.lang.String] = js.undefined
}

