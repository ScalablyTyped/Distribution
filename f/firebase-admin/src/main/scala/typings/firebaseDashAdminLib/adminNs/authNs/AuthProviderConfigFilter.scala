package typings
package firebaseDashAdminLib.adminNs.authNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The filter interface used for listing provider configurations. This is used
  * when specifying how to list configured identity providers via
  * {@link https://firebase.google.com/docs/reference/admin/node/admin.auth.Auth#listProviderConfigs `listProviderConfigs()`}.
  */
trait AuthProviderConfigFilter extends js.Object {
  /**
    * The maximum number of results to return per page. The default and maximum is
    * 100.
    */
  var maxResults: js.UndefOr[scala.Double] = js.undefined
  /**
    * The next page token. When not specified, the lookup starts from the beginning
    * of the list.
    */
  var pageToken: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The Auth provider configuration filter. This can be either `saml` or `oidc`.
    * The former is used to look up SAML providers only, while the latter is used
    * for OIDC providers.
    */
  var `type`: firebaseDashAdminLib.firebaseDashAdminLibStrings.saml | firebaseDashAdminLib.firebaseDashAdminLibStrings.oidc
}

object AuthProviderConfigFilter {
  @scala.inline
  def apply(
    `type`: firebaseDashAdminLib.firebaseDashAdminLibStrings.saml | firebaseDashAdminLib.firebaseDashAdminLibStrings.oidc,
    maxResults: scala.Int | scala.Double = null,
    pageToken: java.lang.String = null
  ): AuthProviderConfigFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken)
    __obj.asInstanceOf[AuthProviderConfigFilter]
  }
}

