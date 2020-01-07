package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Summary of a single transformation. Only one of &#39;transformation&#39;,
  * &#39;field_transformation&#39;, or &#39;record_suppress&#39; will be set.
  */
@js.native
trait Schema$GooglePrivacyDlpV2TransformationSummary extends js.Object {
  /**
    * Set if the transformation was limited to a specific FieldId.
    */
  var field: js.UndefOr[Schema$GooglePrivacyDlpV2FieldId] = js.native
  /**
    * The field transformation that was applied. If multiple field
    * transformations are requested for a single field, this list will contain
    * all of them; otherwise, only one is supplied.
    */
  var fieldTransformations: js.UndefOr[js.Array[Schema$GooglePrivacyDlpV2FieldTransformation]] = js.native
  /**
    * Set if the transformation was limited to a specific InfoType.
    */
  var infoType: js.UndefOr[Schema$GooglePrivacyDlpV2InfoType] = js.native
  /**
    * The specific suppression option these stats apply to.
    */
  var recordSuppress: js.UndefOr[Schema$GooglePrivacyDlpV2RecordSuppression] = js.native
  var results: js.UndefOr[js.Array[Schema$GooglePrivacyDlpV2SummaryResult]] = js.native
  /**
    * The specific transformation these stats apply to.
    */
  var transformation: js.UndefOr[Schema$GooglePrivacyDlpV2PrimitiveTransformation] = js.native
  /**
    * Total size in bytes that were transformed in some way.
    */
  var transformedBytes: js.UndefOr[String] = js.native
}

object Schema$GooglePrivacyDlpV2TransformationSummary {
  @scala.inline
  def apply(
    field: Schema$GooglePrivacyDlpV2FieldId = null,
    fieldTransformations: js.Array[Schema$GooglePrivacyDlpV2FieldTransformation] = null,
    infoType: Schema$GooglePrivacyDlpV2InfoType = null,
    recordSuppress: Schema$GooglePrivacyDlpV2RecordSuppression = null,
    results: js.Array[Schema$GooglePrivacyDlpV2SummaryResult] = null,
    transformation: Schema$GooglePrivacyDlpV2PrimitiveTransformation = null,
    transformedBytes: String = null
  ): Schema$GooglePrivacyDlpV2TransformationSummary = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (fieldTransformations != null) __obj.updateDynamic("fieldTransformations")(fieldTransformations.asInstanceOf[js.Any])
    if (infoType != null) __obj.updateDynamic("infoType")(infoType.asInstanceOf[js.Any])
    if (recordSuppress != null) __obj.updateDynamic("recordSuppress")(recordSuppress.asInstanceOf[js.Any])
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    if (transformation != null) __obj.updateDynamic("transformation")(transformation.asInstanceOf[js.Any])
    if (transformedBytes != null) __obj.updateDynamic("transformedBytes")(transformedBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2TransformationSummary]
  }
}

