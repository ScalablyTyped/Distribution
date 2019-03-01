package typings
package fbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FBLoginOptions extends js.Object {
  var auth_type: js.UndefOr[java.lang.String] = js.undefined
  var enable_profile_selector: js.UndefOr[scala.Boolean] = js.undefined
  var profile_selector_ids: js.UndefOr[java.lang.String] = js.undefined
  var return_scopes: js.UndefOr[scala.Boolean] = js.undefined
  var scope: js.UndefOr[java.lang.String] = js.undefined
}

object FBLoginOptions {
  @scala.inline
  def apply(
    auth_type: java.lang.String = null,
    enable_profile_selector: js.UndefOr[scala.Boolean] = js.undefined,
    profile_selector_ids: java.lang.String = null,
    return_scopes: js.UndefOr[scala.Boolean] = js.undefined,
    scope: java.lang.String = null
  ): FBLoginOptions = {
    val __obj = js.Dynamic.literal()
    if (auth_type != null) __obj.updateDynamic("auth_type")(auth_type)
    if (!js.isUndefined(enable_profile_selector)) __obj.updateDynamic("enable_profile_selector")(enable_profile_selector)
    if (profile_selector_ids != null) __obj.updateDynamic("profile_selector_ids")(profile_selector_ids)
    if (!js.isUndefined(return_scopes)) __obj.updateDynamic("return_scopes")(return_scopes)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    __obj.asInstanceOf[FBLoginOptions]
  }
}

