package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarUnderscoreV3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntryPoint extends js.Object {
  var accessCode: js.UndefOr[java.lang.String] = js.undefined
  var entryPointFeatures: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var entryPointType: js.UndefOr[java.lang.String] = js.undefined
  var label: js.UndefOr[java.lang.String] = js.undefined
  var meetingCode: js.UndefOr[java.lang.String] = js.undefined
  var passcode: js.UndefOr[java.lang.String] = js.undefined
  var password: js.UndefOr[java.lang.String] = js.undefined
  var pin: js.UndefOr[java.lang.String] = js.undefined
  var regionCode: js.UndefOr[java.lang.String] = js.undefined
  var uri: js.UndefOr[java.lang.String] = js.undefined
}

object EntryPoint {
  @scala.inline
  def apply(
    accessCode: java.lang.String = null,
    entryPointFeatures: js.Array[java.lang.String] = null,
    entryPointType: java.lang.String = null,
    label: java.lang.String = null,
    meetingCode: java.lang.String = null,
    passcode: java.lang.String = null,
    password: java.lang.String = null,
    pin: java.lang.String = null,
    regionCode: java.lang.String = null,
    uri: java.lang.String = null
  ): EntryPoint = {
    val __obj = js.Dynamic.literal()
    if (accessCode != null) __obj.updateDynamic("accessCode")(accessCode)
    if (entryPointFeatures != null) __obj.updateDynamic("entryPointFeatures")(entryPointFeatures)
    if (entryPointType != null) __obj.updateDynamic("entryPointType")(entryPointType)
    if (label != null) __obj.updateDynamic("label")(label)
    if (meetingCode != null) __obj.updateDynamic("meetingCode")(meetingCode)
    if (passcode != null) __obj.updateDynamic("passcode")(passcode)
    if (password != null) __obj.updateDynamic("password")(password)
    if (pin != null) __obj.updateDynamic("pin")(pin)
    if (regionCode != null) __obj.updateDynamic("regionCode")(regionCode)
    if (uri != null) __obj.updateDynamic("uri")(uri)
    __obj.asInstanceOf[EntryPoint]
  }
}

