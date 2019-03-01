package typings
package gapiDotClientDotFirebasedynamiclinksLib.gapiNs.clientNs.firebasedynamiclinksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceInfo extends js.Object {
  /** Device model name. */
  var deviceModelName: js.UndefOr[java.lang.String] = js.undefined
  /** Device language code setting. */
  var languageCode: js.UndefOr[java.lang.String] = js.undefined
  /** Device display resolution height. */
  var screenResolutionHeight: js.UndefOr[java.lang.String] = js.undefined
  /** Device display resolution width. */
  var screenResolutionWidth: js.UndefOr[java.lang.String] = js.undefined
  /** Device timezone setting. */
  var timezone: js.UndefOr[java.lang.String] = js.undefined
}

object DeviceInfo {
  @scala.inline
  def apply(
    deviceModelName: java.lang.String = null,
    languageCode: java.lang.String = null,
    screenResolutionHeight: java.lang.String = null,
    screenResolutionWidth: java.lang.String = null,
    timezone: java.lang.String = null
  ): DeviceInfo = {
    val __obj = js.Dynamic.literal()
    if (deviceModelName != null) __obj.updateDynamic("deviceModelName")(deviceModelName)
    if (languageCode != null) __obj.updateDynamic("languageCode")(languageCode)
    if (screenResolutionHeight != null) __obj.updateDynamic("screenResolutionHeight")(screenResolutionHeight)
    if (screenResolutionWidth != null) __obj.updateDynamic("screenResolutionWidth")(screenResolutionWidth)
    if (timezone != null) __obj.updateDynamic("timezone")(timezone)
    __obj.asInstanceOf[DeviceInfo]
  }
}

