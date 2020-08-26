package typings.gapiAuth2.gapi.auth2

import typings.gapiAuth2.gapiAuth2Strings.popup
import typings.gapiAuth2.gapiAuth2Strings.redirect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SigninOptions extends js.Object {
  /**
    * The package name of the Android app to install over the air.
    * See Android app installs from your web site:
    * https://developers.google.com/identity/sign-in/web/android-app-installs
    */
  var app_package_name: js.UndefOr[String] = js.native
  /**
    *     Fetch users' basic profile information when they sign in.
    *     Adds 'profile', 'email' and 'openid' to the requested scopes.
    *     True if unspecified.
    */
  var fetch_basic_profile: js.UndefOr[Boolean] = js.native
  /**
    * When your app knows which user it is trying to authenticate, it can provide this parameter as a hint to the authentication server.
    * Passing this hint suppresses the account chooser and either pre-fill the email box on the sign-in form, or select the proper session (if the user is using multiple sign-in),
    * which can help you avoid problems that occur if your app logs in the wrong user account. The value can be either an email address or the sub string,
    * which is equivalent to the user's Google ID.
    * https://developers.google.com/identity/protocols/OpenIDConnect?hl=en#authenticationuriparameters
    */
  var login_hint: js.UndefOr[String] = js.native
  /**
    * Specifies whether to prompt the user for re-authentication.
    * See OpenID Connect Request Parameters:
    * https://openid.net/specs/openid-connect-basic-1_0.html#RequestParameters
    */
  var prompt: js.UndefOr[String] = js.native
  /**
    * If using ux_mode='redirect', this parameter allows you to override the default redirect_uri that will be used at the end of the consent flow.
    * The default redirect_uri is the current URL stripped of query parameters and hash fragment.
    */
  var redirect_uri: js.UndefOr[String] = js.native
  /**
    * The scopes to request, as a space-delimited string.
    * Optional if fetch_basic_profile is not set to false.
    */
  var scope: js.UndefOr[String] = js.native
  /**
    * The UX mode to use for the sign-in flow.
    * By default, it will open the consent flow in a popup.
    */
  var ux_mode: js.UndefOr[popup | redirect] = js.native
}

object SigninOptions {
  @scala.inline
  def apply(): SigninOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SigninOptions]
  }
  @scala.inline
  implicit class SigninOptionsOps[Self <: SigninOptions] (val x: Self) extends AnyVal {
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
    def setApp_package_name(value: String): Self = this.set("app_package_name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApp_package_name: Self = this.set("app_package_name", js.undefined)
    @scala.inline
    def setFetch_basic_profile(value: Boolean): Self = this.set("fetch_basic_profile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFetch_basic_profile: Self = this.set("fetch_basic_profile", js.undefined)
    @scala.inline
    def setLogin_hint(value: String): Self = this.set("login_hint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogin_hint: Self = this.set("login_hint", js.undefined)
    @scala.inline
    def setPrompt(value: String): Self = this.set("prompt", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrompt: Self = this.set("prompt", js.undefined)
    @scala.inline
    def setRedirect_uri(value: String): Self = this.set("redirect_uri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRedirect_uri: Self = this.set("redirect_uri", js.undefined)
    @scala.inline
    def setScope(value: String): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    @scala.inline
    def setUx_mode(value: popup | redirect): Self = this.set("ux_mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUx_mode: Self = this.set("ux_mode", js.undefined)
  }
  
}

