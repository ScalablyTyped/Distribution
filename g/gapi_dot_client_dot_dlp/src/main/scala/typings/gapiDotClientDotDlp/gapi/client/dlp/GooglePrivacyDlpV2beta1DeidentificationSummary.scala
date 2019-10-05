package typings.gapiDotClientDotDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1DeidentificationSummary extends js.Object {
  /** Transformations applied to the dataset. */
  var transformationSummaries: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1TransformationSummary]] = js.undefined
  /** Total size in bytes that were transformed in some way. */
  var transformedBytes: js.UndefOr[String] = js.undefined
}

object GooglePrivacyDlpV2beta1DeidentificationSummary {
  @scala.inline
  def apply(
    transformationSummaries: js.Array[GooglePrivacyDlpV2beta1TransformationSummary] = null,
    transformedBytes: String = null
  ): GooglePrivacyDlpV2beta1DeidentificationSummary = {
    val __obj = js.Dynamic.literal()
    if (transformationSummaries != null) __obj.updateDynamic("transformationSummaries")(transformationSummaries)
    if (transformedBytes != null) __obj.updateDynamic("transformedBytes")(transformedBytes)
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1DeidentificationSummary]
  }
}

