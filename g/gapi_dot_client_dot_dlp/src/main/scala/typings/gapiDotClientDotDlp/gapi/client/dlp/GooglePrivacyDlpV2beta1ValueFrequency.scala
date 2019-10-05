package typings.gapiDotClientDotDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1ValueFrequency extends js.Object {
  /** How many times the value is contained in the field. */
  var count: js.UndefOr[String] = js.undefined
  /** A value contained in the field in question. */
  var value: js.UndefOr[GooglePrivacyDlpV2beta1Value] = js.undefined
}

object GooglePrivacyDlpV2beta1ValueFrequency {
  @scala.inline
  def apply(count: String = null, value: GooglePrivacyDlpV2beta1Value = null): GooglePrivacyDlpV2beta1ValueFrequency = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1ValueFrequency]
  }
}

