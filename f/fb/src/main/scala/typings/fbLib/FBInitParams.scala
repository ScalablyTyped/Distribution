package typings
package fbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FBInitParams extends js.Object {
  var appId: js.UndefOr[java.lang.String] = js.undefined
  var authResponse: js.UndefOr[java.lang.String] = js.undefined
  var cookie: js.UndefOr[scala.Boolean] = js.undefined
  var frictionlessRequests: js.UndefOr[scala.Boolean] = js.undefined
  var hideFlashCallback: js.UndefOr[js.Function] = js.undefined
  var logging: js.UndefOr[scala.Boolean] = js.undefined
  var status: js.UndefOr[scala.Boolean] = js.undefined
  var version: js.UndefOr[java.lang.String] = js.undefined
  var xfbml: js.UndefOr[scala.Boolean] = js.undefined
}

object FBInitParams {
  @scala.inline
  def apply(
    appId: java.lang.String = null,
    authResponse: java.lang.String = null,
    cookie: js.UndefOr[scala.Boolean] = js.undefined,
    frictionlessRequests: js.UndefOr[scala.Boolean] = js.undefined,
    hideFlashCallback: js.Function = null,
    logging: js.UndefOr[scala.Boolean] = js.undefined,
    status: js.UndefOr[scala.Boolean] = js.undefined,
    version: java.lang.String = null,
    xfbml: js.UndefOr[scala.Boolean] = js.undefined
  ): FBInitParams = {
    val __obj = js.Dynamic.literal()
    if (appId != null) __obj.updateDynamic("appId")(appId)
    if (authResponse != null) __obj.updateDynamic("authResponse")(authResponse)
    if (!js.isUndefined(cookie)) __obj.updateDynamic("cookie")(cookie)
    if (!js.isUndefined(frictionlessRequests)) __obj.updateDynamic("frictionlessRequests")(frictionlessRequests)
    if (hideFlashCallback != null) __obj.updateDynamic("hideFlashCallback")(hideFlashCallback)
    if (!js.isUndefined(logging)) __obj.updateDynamic("logging")(logging)
    if (!js.isUndefined(status)) __obj.updateDynamic("status")(status)
    if (version != null) __obj.updateDynamic("version")(version)
    if (!js.isUndefined(xfbml)) __obj.updateDynamic("xfbml")(xfbml)
    __obj.asInstanceOf[FBInitParams]
  }
}

