package typings
package facebookDashJsDashSdkLib.facebookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitParams extends js.Object {
  var appId: java.lang.String
  var autoLogAppEvents: js.UndefOr[scala.Boolean] = js.undefined
  var cookie: js.UndefOr[scala.Boolean] = js.undefined
  var frictionlessRequests: js.UndefOr[scala.Boolean] = js.undefined
  var hideFlashCallback: js.UndefOr[scala.Boolean] = js.undefined
  var status: js.UndefOr[scala.Boolean] = js.undefined
  var version: js.UndefOr[java.lang.String] = js.undefined
  var xfbml: js.UndefOr[scala.Boolean] = js.undefined
}

object InitParams {
  @scala.inline
  def apply(
    appId: java.lang.String,
    autoLogAppEvents: js.UndefOr[scala.Boolean] = js.undefined,
    cookie: js.UndefOr[scala.Boolean] = js.undefined,
    frictionlessRequests: js.UndefOr[scala.Boolean] = js.undefined,
    hideFlashCallback: js.UndefOr[scala.Boolean] = js.undefined,
    status: js.UndefOr[scala.Boolean] = js.undefined,
    version: java.lang.String = null,
    xfbml: js.UndefOr[scala.Boolean] = js.undefined
  ): InitParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("appId")(appId)
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

