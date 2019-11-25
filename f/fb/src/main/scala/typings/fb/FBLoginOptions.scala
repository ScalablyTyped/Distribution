package typings.fb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FBLoginOptions extends js.Object {
  var auth_type: js.UndefOr[String] = js.undefined
  var enable_profile_selector: js.UndefOr[Boolean] = js.undefined
  var profile_selector_ids: js.UndefOr[String] = js.undefined
  var return_scopes: js.UndefOr[Boolean] = js.undefined
  var scope: js.UndefOr[String] = js.undefined
}

object FBLoginOptions {
  @scala.inline
  def apply(
    auth_type: String = null,
    enable_profile_selector: js.UndefOr[Boolean] = js.undefined,
    profile_selector_ids: String = null,
    return_scopes: js.UndefOr[Boolean] = js.undefined,
    scope: String = null
  ): FBLoginOptions = {
    val __obj = js.Dynamic.literal()
    if (auth_type != null) __obj.updateDynamic("auth_type")(auth_type.asInstanceOf[js.Any])
    if (!js.isUndefined(enable_profile_selector)) __obj.updateDynamic("enable_profile_selector")(enable_profile_selector.asInstanceOf[js.Any])
    if (profile_selector_ids != null) __obj.updateDynamic("profile_selector_ids")(profile_selector_ids.asInstanceOf[js.Any])
    if (!js.isUndefined(return_scopes)) __obj.updateDynamic("return_scopes")(return_scopes.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[FBLoginOptions]
  }
}

