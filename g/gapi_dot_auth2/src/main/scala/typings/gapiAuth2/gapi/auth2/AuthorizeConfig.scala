package typings.gapiAuth2.gapi.auth2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Reference: https://developers.google.com/api-client-library/javascript/reference/referencedocs#gapiauth2authorizeconfig
  */
trait AuthorizeConfig extends js.Object {
  var app_package_name: js.UndefOr[String] = js.undefined
  var client_id: String
  var cookie_policy: js.UndefOr[String] = js.undefined
  var hosted_domain: js.UndefOr[String] = js.undefined
  var include_granted_scopes: js.UndefOr[Boolean] = js.undefined
  var login_hint: js.UndefOr[String] = js.undefined
  var openid_realm: js.UndefOr[String] = js.undefined
  var prompt: js.UndefOr[String] = js.undefined
  var response_type: js.UndefOr[String] = js.undefined
  var scope: String
}

object AuthorizeConfig {
  @scala.inline
  def apply(
    client_id: String,
    scope: String,
    app_package_name: String = null,
    cookie_policy: String = null,
    hosted_domain: String = null,
    include_granted_scopes: js.UndefOr[Boolean] = js.undefined,
    login_hint: String = null,
    openid_realm: String = null,
    prompt: String = null,
    response_type: String = null
  ): AuthorizeConfig = {
    val __obj = js.Dynamic.literal(client_id = client_id.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
    if (app_package_name != null) __obj.updateDynamic("app_package_name")(app_package_name.asInstanceOf[js.Any])
    if (cookie_policy != null) __obj.updateDynamic("cookie_policy")(cookie_policy.asInstanceOf[js.Any])
    if (hosted_domain != null) __obj.updateDynamic("hosted_domain")(hosted_domain.asInstanceOf[js.Any])
    if (!js.isUndefined(include_granted_scopes)) __obj.updateDynamic("include_granted_scopes")(include_granted_scopes.asInstanceOf[js.Any])
    if (login_hint != null) __obj.updateDynamic("login_hint")(login_hint.asInstanceOf[js.Any])
    if (openid_realm != null) __obj.updateDynamic("openid_realm")(openid_realm.asInstanceOf[js.Any])
    if (prompt != null) __obj.updateDynamic("prompt")(prompt.asInstanceOf[js.Any])
    if (response_type != null) __obj.updateDynamic("response_type")(response_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizeConfig]
  }
}

