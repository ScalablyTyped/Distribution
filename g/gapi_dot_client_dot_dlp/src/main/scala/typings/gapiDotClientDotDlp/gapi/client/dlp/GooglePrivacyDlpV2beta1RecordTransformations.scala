package typings.gapiDotClientDotDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1RecordTransformations extends js.Object {
  /** Transform the record by applying various field transformations. */
  var fieldTransformations: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1FieldTransformation]] = js.undefined
  /**
    * Configuration defining which records get suppressed entirely. Records that
    * match any suppression rule are omitted from the output [optional].
    */
  var recordSuppressions: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1RecordSuppression]] = js.undefined
}

object GooglePrivacyDlpV2beta1RecordTransformations {
  @scala.inline
  def apply(
    fieldTransformations: js.Array[GooglePrivacyDlpV2beta1FieldTransformation] = null,
    recordSuppressions: js.Array[GooglePrivacyDlpV2beta1RecordSuppression] = null
  ): GooglePrivacyDlpV2beta1RecordTransformations = {
    val __obj = js.Dynamic.literal()
    if (fieldTransformations != null) __obj.updateDynamic("fieldTransformations")(fieldTransformations.asInstanceOf[js.Any])
    if (recordSuppressions != null) __obj.updateDynamic("recordSuppressions")(recordSuppressions.asInstanceOf[js.Any])
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1RecordTransformations]
  }
}

