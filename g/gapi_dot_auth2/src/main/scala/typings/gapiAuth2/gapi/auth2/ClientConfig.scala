package typings.gapiAuth2.gapi.auth2

import typings.gapiAuth2.gapiAuth2Strings.popup
import typings.gapiAuth2.gapiAuth2Strings.redirect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface that represents the different configuration parameters for the gapi.auth2.init method.
  * Reference: https://developers.google.com/api-client-library/javascript/reference/referencedocs#gapiauth2clientconfig
  */
trait ClientConfig extends js.Object {
  /**
    * The app's client ID, found and created in the Google Developers Console.
    */
  var client_id: js.UndefOr[String] = js.undefined
  /**
    * The domains for which to create sign-in cookies. Either a URI, single_host_origin, or none.
    * Defaults to single_host_origin if unspecified.
    */
  var cookie_policy: js.UndefOr[String] = js.undefined
  /**
    * Fetch users' basic profile information when they sign in. Adds 'profile' and 'email' to the requested scopes. True if unspecified.
    */
  var fetch_basic_profile: js.UndefOr[Boolean] = js.undefined
  /**
    * The Google Apps domain to which users must belong to sign in. This is susceptible to modification by clients,
    * so be sure to verify the hosted domain property of the returned user. Use GoogleUser.getHostedDomain() on the client,
    * and the hd claim in the ID Token on the server to verify the domain is what you expected.
    */
  var hosted_domain: js.UndefOr[String] = js.undefined
  /**
    * Used only for OpenID 2.0 client migration. Set to the value of the realm that you are currently using for OpenID 2.0,
    * as described in <a href="https://developers.google.com/accounts/docs/OpenID#openid-connect">OpenID 2.0 (Migration)</a>.
    */
  var openid_realm: js.UndefOr[String] = js.undefined
  /**
    * If using ux_mode='redirect', this parameter allows you to override the default redirect_uri that will be used at the end of the consent flow.
    * The default redirect_uri is the current URL stripped of query parameters and hash fragment.
    */
  var redirect_uri: js.UndefOr[String] = js.undefined
  /**
    * The scopes to request, as a space-delimited string. Optional if fetch_basic_profile is not set to false.
    */
  var scope: js.UndefOr[String] = js.undefined
  /**
    * The UX mode to use for the sign-in flow.
    * By default, it will open the consent flow in a popup.
    */
  var ux_mode: js.UndefOr[popup | redirect] = js.undefined
}

object ClientConfig {
  @scala.inline
  def apply(
    client_id: String = null,
    cookie_policy: String = null,
    fetch_basic_profile: js.UndefOr[Boolean] = js.undefined,
    hosted_domain: String = null,
    openid_realm: String = null,
    redirect_uri: String = null,
    scope: String = null,
    ux_mode: popup | redirect = null
  ): ClientConfig = {
    val __obj = js.Dynamic.literal()
    if (client_id != null) __obj.updateDynamic("client_id")(client_id.asInstanceOf[js.Any])
    if (cookie_policy != null) __obj.updateDynamic("cookie_policy")(cookie_policy.asInstanceOf[js.Any])
    if (!js.isUndefined(fetch_basic_profile)) __obj.updateDynamic("fetch_basic_profile")(fetch_basic_profile.get.asInstanceOf[js.Any])
    if (hosted_domain != null) __obj.updateDynamic("hosted_domain")(hosted_domain.asInstanceOf[js.Any])
    if (openid_realm != null) __obj.updateDynamic("openid_realm")(openid_realm.asInstanceOf[js.Any])
    if (redirect_uri != null) __obj.updateDynamic("redirect_uri")(redirect_uri.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (ux_mode != null) __obj.updateDynamic("ux_mode")(ux_mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientConfig]
  }
}

