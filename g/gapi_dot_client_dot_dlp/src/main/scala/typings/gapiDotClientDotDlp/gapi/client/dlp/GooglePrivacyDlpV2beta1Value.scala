package typings.gapiDotClientDotDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1Value extends js.Object {
  var booleanValue: js.UndefOr[Boolean] = js.undefined
  var dateValue: js.UndefOr[GoogleTypeDate] = js.undefined
  var floatValue: js.UndefOr[Double] = js.undefined
  var integerValue: js.UndefOr[String] = js.undefined
  var stringValue: js.UndefOr[String] = js.undefined
  var timeValue: js.UndefOr[GoogleTypeTimeOfDay] = js.undefined
  var timestampValue: js.UndefOr[String] = js.undefined
}

object GooglePrivacyDlpV2beta1Value {
  @scala.inline
  def apply(
    booleanValue: js.UndefOr[Boolean] = js.undefined,
    dateValue: GoogleTypeDate = null,
    floatValue: Int | Double = null,
    integerValue: String = null,
    stringValue: String = null,
    timeValue: GoogleTypeTimeOfDay = null,
    timestampValue: String = null
  ): GooglePrivacyDlpV2beta1Value = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(booleanValue)) __obj.updateDynamic("booleanValue")(booleanValue)
    if (dateValue != null) __obj.updateDynamic("dateValue")(dateValue)
    if (floatValue != null) __obj.updateDynamic("floatValue")(floatValue.asInstanceOf[js.Any])
    if (integerValue != null) __obj.updateDynamic("integerValue")(integerValue)
    if (stringValue != null) __obj.updateDynamic("stringValue")(stringValue)
    if (timeValue != null) __obj.updateDynamic("timeValue")(timeValue)
    if (timestampValue != null) __obj.updateDynamic("timestampValue")(timestampValue)
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1Value]
  }
}

