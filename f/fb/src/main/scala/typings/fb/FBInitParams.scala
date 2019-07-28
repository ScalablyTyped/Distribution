package typings.fb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FBInitParams extends js.Object {
  var appId: js.UndefOr[String] = js.undefined
  var authResponse: js.UndefOr[String] = js.undefined
  var cookie: js.UndefOr[Boolean] = js.undefined
  var frictionlessRequests: js.UndefOr[Boolean] = js.undefined
  var hideFlashCallback: js.UndefOr[js.Function] = js.undefined
  var logging: js.UndefOr[Boolean] = js.undefined
  var status: js.UndefOr[Boolean] = js.undefined
  var version: js.UndefOr[String] = js.undefined
  var xfbml: js.UndefOr[Boolean] = js.undefined
}

object FBInitParams {
  @scala.inline
  def apply(
    appId: String = null,
    authResponse: String = null,
    cookie: js.UndefOr[Boolean] = js.undefined,
    frictionlessRequests: js.UndefOr[Boolean] = js.undefined,
    hideFlashCallback: js.Function = null,
    logging: js.UndefOr[Boolean] = js.undefined,
    status: js.UndefOr[Boolean] = js.undefined,
    version: String = null,
    xfbml: js.UndefOr[Boolean] = js.undefined
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

