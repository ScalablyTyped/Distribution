package typings.googleDashAppsDashScript.GoogleAppsScript.Analyticsreporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScreenviewData extends js.Object {
  var appName: js.UndefOr[String] = js.undefined
  var mobileDeviceBranding: js.UndefOr[String] = js.undefined
  var mobileDeviceModel: js.UndefOr[String] = js.undefined
  var screenName: js.UndefOr[String] = js.undefined
}

object ScreenviewData {
  @scala.inline
  def apply(
    appName: String = null,
    mobileDeviceBranding: String = null,
    mobileDeviceModel: String = null,
    screenName: String = null
  ): ScreenviewData = {
    val __obj = js.Dynamic.literal()
    if (appName != null) __obj.updateDynamic("appName")(appName)
    if (mobileDeviceBranding != null) __obj.updateDynamic("mobileDeviceBranding")(mobileDeviceBranding)
    if (mobileDeviceModel != null) __obj.updateDynamic("mobileDeviceModel")(mobileDeviceModel)
    if (screenName != null) __obj.updateDynamic("screenName")(screenName)
    __obj.asInstanceOf[ScreenviewData]
  }
}

