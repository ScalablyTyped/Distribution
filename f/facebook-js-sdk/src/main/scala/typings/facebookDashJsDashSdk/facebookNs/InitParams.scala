package typings.facebookDashJsDashSdk.facebookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitParams extends js.Object {
  var appId: String
  var autoLogAppEvents: js.UndefOr[Boolean] = js.undefined
  var cookie: js.UndefOr[Boolean] = js.undefined
  var frictionlessRequests: js.UndefOr[Boolean] = js.undefined
  var hideFlashCallback: js.UndefOr[Boolean] = js.undefined
  var status: js.UndefOr[Boolean] = js.undefined
  var version: js.UndefOr[String] = js.undefined
  var xfbml: js.UndefOr[Boolean] = js.undefined
}

object InitParams {
  @scala.inline
  def apply(
    appId: String,
    autoLogAppEvents: js.UndefOr[Boolean] = js.undefined,
    cookie: js.UndefOr[Boolean] = js.undefined,
    frictionlessRequests: js.UndefOr[Boolean] = js.undefined,
    hideFlashCallback: js.UndefOr[Boolean] = js.undefined,
    status: js.UndefOr[Boolean] = js.undefined,
    version: String = null,
    xfbml: js.UndefOr[Boolean] = js.undefined
  ): InitParams = {
    val __obj = js.Dynamic.literal(appId = appId)
    if (!js.isUndefined(autoLogAppEvents)) __obj.updateDynamic("autoLogAppEvents")(autoLogAppEvents)
    if (!js.isUndefined(cookie)) __obj.updateDynamic("cookie")(cookie)
    if (!js.isUndefined(frictionlessRequests)) __obj.updateDynamic("frictionlessRequests")(frictionlessRequests)
    if (!js.isUndefined(hideFlashCallback)) __obj.updateDynamic("hideFlashCallback")(hideFlashCallback)
    if (!js.isUndefined(status)) __obj.updateDynamic("status")(status)
    if (version != null) __obj.updateDynamic("version")(version)
    if (!js.isUndefined(xfbml)) __obj.updateDynamic("xfbml")(xfbml)
    __obj.asInstanceOf[InitParams]
  }
}

