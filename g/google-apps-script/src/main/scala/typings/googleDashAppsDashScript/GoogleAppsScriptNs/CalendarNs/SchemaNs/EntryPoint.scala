package typings.googleDashAppsDashScript.GoogleAppsScriptNs.CalendarNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntryPoint extends js.Object {
  var accessCode: js.UndefOr[String] = js.undefined
  var entryPointFeatures: js.UndefOr[js.Array[String]] = js.undefined
  var entryPointType: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var meetingCode: js.UndefOr[String] = js.undefined
  var passcode: js.UndefOr[String] = js.undefined
  var password: js.UndefOr[String] = js.undefined
  var pin: js.UndefOr[String] = js.undefined
  var regionCode: js.UndefOr[String] = js.undefined
  var uri: js.UndefOr[String] = js.undefined
}

object EntryPoint {
  @scala.inline
  def apply(
    accessCode: String = null,
    entryPointFeatures: js.Array[String] = null,
    entryPointType: String = null,
    label: String = null,
    meetingCode: String = null,
    passcode: String = null,
    password: String = null,
    pin: String = null,
    regionCode: String = null,
    uri: String = null
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

