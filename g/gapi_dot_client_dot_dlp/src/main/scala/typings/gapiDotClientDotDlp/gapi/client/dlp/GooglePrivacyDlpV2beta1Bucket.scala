package typings.gapiDotClientDotDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1Bucket extends js.Object {
  /** Upper bound of the range, exclusive; type must match min. */
  var max: js.UndefOr[GooglePrivacyDlpV2beta1Value] = js.undefined
  /**
    * Lower bound of the range, inclusive. Type should be the same as max if
    * used.
    */
  var min: js.UndefOr[GooglePrivacyDlpV2beta1Value] = js.undefined
  /**
    * Replacement value for this bucket. If not provided
    * the default behavior will be to hyphenate the min-max range.
    */
  var replacementValue: js.UndefOr[GooglePrivacyDlpV2beta1Value] = js.undefined
}

object GooglePrivacyDlpV2beta1Bucket {
  @scala.inline
  def apply(
    max: GooglePrivacyDlpV2beta1Value = null,
    min: GooglePrivacyDlpV2beta1Value = null,
    replacementValue: GooglePrivacyDlpV2beta1Value = null
  ): GooglePrivacyDlpV2beta1Bucket = {
    val __obj = js.Dynamic.literal()
    if (max != null) __obj.updateDynamic("max")(max)
    if (min != null) __obj.updateDynamic("min")(min)
    if (replacementValue != null) __obj.updateDynamic("replacementValue")(replacementValue)
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1Bucket]
  }
}

