package typings.googleapis.buildSrcApisFirebasedynamiclinksV1Mod.firebasedynamiclinks_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Signals associated with the device making the request.
  */
@js.native
trait Schema$DeviceInfo extends js.Object {
  /**
    * Device model name.
    */
  var deviceModelName: js.UndefOr[String] = js.native
  /**
    * Device language code setting.
    */
  var languageCode: js.UndefOr[String] = js.native
  /**
    * Device language code setting obtained by executing JavaScript code in
    * WebView.
    */
  var languageCodeFromWebview: js.UndefOr[String] = js.native
  /**
    * Device language code raw setting. iOS does returns language code in
    * different format than iOS WebView. For example WebView returns en_US, but
    * iOS returns en-US. Field below will return raw value returned by iOS.
    */
  var languageCodeRaw: js.UndefOr[String] = js.native
  /**
    * Device display resolution height.
    */
  var screenResolutionHeight: js.UndefOr[String] = js.native
  /**
    * Device display resolution width.
    */
  var screenResolutionWidth: js.UndefOr[String] = js.native
  /**
    * Device timezone setting.
    */
  var timezone: js.UndefOr[String] = js.native
}

object Schema$DeviceInfo {
  @scala.inline
  def apply(
    deviceModelName: String = null,
    languageCode: String = null,
    languageCodeFromWebview: String = null,
    languageCodeRaw: String = null,
    screenResolutionHeight: String = null,
    screenResolutionWidth: String = null,
    timezone: String = null
  ): Schema$DeviceInfo = {
    val __obj = js.Dynamic.literal()
    if (deviceModelName != null) __obj.updateDynamic("deviceModelName")(deviceModelName.asInstanceOf[js.Any])
    if (languageCode != null) __obj.updateDynamic("languageCode")(languageCode.asInstanceOf[js.Any])
    if (languageCodeFromWebview != null) __obj.updateDynamic("languageCodeFromWebview")(languageCodeFromWebview.asInstanceOf[js.Any])
    if (languageCodeRaw != null) __obj.updateDynamic("languageCodeRaw")(languageCodeRaw.asInstanceOf[js.Any])
    if (screenResolutionHeight != null) __obj.updateDynamic("screenResolutionHeight")(screenResolutionHeight.asInstanceOf[js.Any])
    if (screenResolutionWidth != null) __obj.updateDynamic("screenResolutionWidth")(screenResolutionWidth.asInstanceOf[js.Any])
    if (timezone != null) __obj.updateDynamic("timezone")(timezone.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DeviceInfo]
  }
}

