package typings
package gapiDotClientDotDlpLib.gapiNs.clientNs.dlpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1TransformationSummary extends js.Object {
  /** Set if the transformation was limited to a specific FieldId. */
  var field: js.UndefOr[GooglePrivacyDlpV2beta1FieldId] = js.undefined
  /**
    * The field transformation that was applied. This list will contain
    * multiple only in the case of errors.
    */
  var fieldTransformations: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1FieldTransformation]] = js.undefined
  /** Set if the transformation was limited to a specific info_type. */
  var infoType: js.UndefOr[GooglePrivacyDlpV2beta1InfoType] = js.undefined
  /** The specific suppression option these stats apply to. */
  var recordSuppress: js.UndefOr[GooglePrivacyDlpV2beta1RecordSuppression] = js.undefined
  var results: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1SummaryResult]] = js.undefined
  /** The specific transformation these stats apply to. */
  var transformation: js.UndefOr[GooglePrivacyDlpV2beta1PrimitiveTransformation] = js.undefined
}

object GooglePrivacyDlpV2beta1TransformationSummary {
  @scala.inline
  def apply(
    field: GooglePrivacyDlpV2beta1FieldId = null,
    fieldTransformations: js.Array[GooglePrivacyDlpV2beta1FieldTransformation] = null,
    infoType: GooglePrivacyDlpV2beta1InfoType = null,
    recordSuppress: GooglePrivacyDlpV2beta1RecordSuppression = null,
    results: js.Array[GooglePrivacyDlpV2beta1SummaryResult] = null,
    transformation: GooglePrivacyDlpV2beta1PrimitiveTransformation = null
  ): GooglePrivacyDlpV2beta1TransformationSummary = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field)
    if (fieldTransformations != null) __obj.updateDynamic("fieldTransformations")(fieldTransformations)
    if (infoType != null) __obj.updateDynamic("infoType")(infoType)
    if (recordSuppress != null) __obj.updateDynamic("recordSuppress")(recordSuppress)
    if (results != null) __obj.updateDynamic("results")(results)
    if (transformation != null) __obj.updateDynamic("transformation")(transformation)
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1TransformationSummary]
  }
}

