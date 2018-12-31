package typings
package gapiDotAuth2Lib.gapiNs.auth2Ns

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
  var client_id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The domains for which to create sign-in cookies. Either a URI, single_host_origin, or none.
    * Defaults to single_host_origin if unspecified.
    */
  var cookie_policy: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Fetch users' basic profile information when they sign in. Adds 'profile' and 'email' to the requested scopes. True if unspecified.
    */
  var fetch_basic_profile: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The Google Apps domain to which users must belong to sign in. This is susceptible to modification by clients,
    * so be sure to verify the hosted domain property of the returned user. Use GoogleUser.getHostedDomain() on the client,
    * and the hd claim in the ID Token on the server to verify the domain is what you expected.
    */
  var hosted_domain: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used only for OpenID 2.0 client migration. Set to the value of the realm that you are currently using for OpenID 2.0,
    * as described in <a href="https://developers.google.com/accounts/docs/OpenID#openid-connect">OpenID 2.0 (Migration)</a>.
    */
  var openid_realm: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If using ux_mode='redirect', this parameter allows you to override the default redirect_uri that will be used at the end of the consent flow.
    * The default redirect_uri is the current URL stripped of query parameters and hash fragment.
    */
  var redirect_uri: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The scopes to request, as a space-delimited string. Optional if fetch_basic_profile is not set to false.
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

