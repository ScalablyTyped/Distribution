package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScreenviewData extends js.Object {
  var appName: js.UndefOr[java.lang.String] = js.undefined
  var mobileDeviceBranding: js.UndefOr[java.lang.String] = js.undefined
  var mobileDeviceModel: js.UndefOr[java.lang.String] = js.undefined
  var screenName: js.UndefOr[java.lang.String] = js.undefined
}

object ScreenviewData {
  @scala.inline
  def apply(
    appName: java.lang.String = null,
    mobileDeviceBranding: java.lang.String = null,
    mobileDeviceModel: java.lang.String = null,
    screenName: java.lang.String = null
  ): ScreenviewData = {
    val __obj = js.Dynamic.literal()
    if (appName != null) __obj.updateDynamic("appName")(appName)
    if (mobileDeviceBranding != null) __obj.updateDynamic("mobileDeviceBranding")(mobileDeviceBranding)
    if (mobileDeviceModel != null) __obj.updateDynamic("mobileDeviceModel")(mobileDeviceModel)
    if (screenName != null) __obj.updateDynamic("screenName")(screenName)
    __obj.asInstanceOf[ScreenviewData]
  }
}

