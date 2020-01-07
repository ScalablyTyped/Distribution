package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A type of transformation that is applied over structured data such as a
  * table.
  */
@js.native
trait Schema$GooglePrivacyDlpV2RecordTransformations extends js.Object {
  /**
    * Transform the record by applying various field transformations.
    */
  var fieldTransformations: js.UndefOr[js.Array[Schema$GooglePrivacyDlpV2FieldTransformation]] = js.native
  /**
    * Configuration defining which records get suppressed entirely. Records
    * that match any suppression rule are omitted from the output [optional].
    */
  var recordSuppressions: js.UndefOr[js.Array[Schema$GooglePrivacyDlpV2RecordSuppression]] = js.native
}

object Schema$GooglePrivacyDlpV2RecordTransformations {
  @scala.inline
  def apply(
    fieldTransformations: js.Array[Schema$GooglePrivacyDlpV2FieldTransformation] = null,
    recordSuppressions: js.Array[Schema$GooglePrivacyDlpV2RecordSuppression] = null
  ): Schema$GooglePrivacyDlpV2RecordTransformations = {
    val __obj = js.Dynamic.literal()
    if (fieldTransformations != null) __obj.updateDynamic("fieldTransformations")(fieldTransformations.asInstanceOf[js.Any])
    if (recordSuppressions != null) __obj.updateDynamic("recordSuppressions")(recordSuppressions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2RecordTransformations]
  }
}

