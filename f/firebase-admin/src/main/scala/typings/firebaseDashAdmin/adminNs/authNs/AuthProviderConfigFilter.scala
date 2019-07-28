package typings.firebaseDashAdmin.adminNs.authNs

import typings.firebaseDashAdmin.firebaseDashAdminStrings.oidc
import typings.firebaseDashAdmin.firebaseDashAdminStrings.saml
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
  var maxResults: js.UndefOr[Double] = js.undefined
  /**
    * The next page token. When not specified, the lookup starts from the beginning
    * of the list.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  /**
    * The Auth provider configuration filter. This can be either `saml` or `oidc`.
    * The former is used to look up SAML providers only, while the latter is used
    * for OIDC providers.
    */
  var `type`: saml | oidc
}

object AuthProviderConfigFilter {
  @scala.inline
  def apply(`type`: saml | oidc, maxResults: Int | Double = null, pageToken: String = null): AuthProviderConfigFilter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken)
    __obj.asInstanceOf[AuthProviderConfigFilter]
  }
}

