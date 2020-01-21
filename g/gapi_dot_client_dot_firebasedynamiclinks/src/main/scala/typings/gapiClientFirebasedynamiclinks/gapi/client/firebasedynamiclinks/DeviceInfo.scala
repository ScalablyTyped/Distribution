package typings.gapiClientFirebasedynamiclinks.gapi.client.firebasedynamiclinks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceInfo extends js.Object {
  /** Device model name. */
  var deviceModelName: js.UndefOr[String] = js.undefined
  /** Device language code setting. */
  var languageCode: js.UndefOr[String] = js.undefined
  /** Device display resolution height. */
  var screenResolutionHeight: js.UndefOr[String] = js.undefined
  /** Device display resolution width. */
  var screenResolutionWidth: js.UndefOr[String] = js.undefined
  /** Device timezone setting. */
  var timezone: js.UndefOr[String] = js.undefined
}

object DeviceInfo {
  @scala.inline
  def apply(
    deviceModelName: String = null,
    languageCode: String = null,
    screenResolutionHeight: String = null,
    screenResolutionWidth: String = null,
    timezone: String = null
  ): DeviceInfo = {
    val __obj = js.Dynamic.literal()
    if (deviceModelName != null) __obj.updateDynamic("deviceModelName")(deviceModelName.asInstanceOf[js.Any])
    if (languageCode != null) __obj.updateDynamic("languageCode")(languageCode.asInstanceOf[js.Any])
    if (screenResolutionHeight != null) __obj.updateDynamic("screenResolutionHeight")(screenResolutionHeight.asInstanceOf[js.Any])
    if (screenResolutionWidth != null) __obj.updateDynamic("screenResolutionWidth")(screenResolutionWidth.asInstanceOf[js.Any])
    if (timezone != null) __obj.updateDynamic("timezone")(timezone.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceInfo]
  }
}

