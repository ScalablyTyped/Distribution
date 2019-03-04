package typings
package gapiDotAuth2Lib.gapiNs.auth2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Reference: https://developers.google.com/api-client-library/javascript/reference/referencedocs#gapiauth2authorizeconfig
  */
trait AuthorizeConfig extends js.Object {
  var app_package_name: js.UndefOr[java.lang.String] = js.undefined
  var client_id: java.lang.String
  var cookie_policy: js.UndefOr[java.lang.String] = js.undefined
  var hosted_domain: js.UndefOr[java.lang.String] = js.undefined
  var include_granted_scopes: js.UndefOr[scala.Boolean] = js.undefined
  var login_hint: js.UndefOr[java.lang.String] = js.undefined
  var openid_realm: js.UndefOr[java.lang.String] = js.undefined
  var prompt: js.UndefOr[java.lang.String] = js.undefined
  var response_type: js.UndefOr[java.lang.String] = js.undefined
  var scope: java.lang.String
}

object AuthorizeConfig {
  @scala.inline
  def apply(
    client_id: java.lang.String,
    scope: java.lang.String,
    app_package_name: java.lang.String = null,
    cookie_policy: java.lang.String = null,
    hosted_domain: java.lang.String = null,
    include_granted_scopes: js.UndefOr[scala.Boolean] = js.undefined,
    login_hint: java.lang.String = null,
    openid_realm: java.lang.String = null,
    prompt: java.lang.String = null,
    response_type: java.lang.String = null
  ): AuthorizeConfig = {
    val __obj = js.Dynamic.literal(client_id = client_id, scope = scope)
    if (app_package_name != null) __obj.updateDynamic("app_package_name")(app_package_name)
    if (cookie_policy != null) __obj.updateDynamic("cookie_policy")(cookie_policy)
    if (hosted_domain != null) __obj.updateDynamic("hosted_domain")(hosted_domain)
    if (!js.isUndefined(include_granted_scopes)) __obj.updateDynamic("include_granted_scopes")(include_granted_scopes)
    if (login_hint != null) __obj.updateDynamic("login_hint")(login_hint)
    if (openid_realm != null) __obj.updateDynamic("openid_realm")(openid_realm)
    if (prompt != null) __obj.updateDynamic("prompt")(prompt)
    if (response_type != null) __obj.updateDynamic("response_type")(response_type)
    __obj.asInstanceOf[AuthorizeConfig]
  }
}

