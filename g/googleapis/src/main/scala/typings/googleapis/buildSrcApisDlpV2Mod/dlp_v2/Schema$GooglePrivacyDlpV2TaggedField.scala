package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$GooglePrivacyDlpV2TaggedField extends js.Object {
  /**
    * A column can be tagged with a custom tag. In this case, the user must
    * indicate an auxiliary table that contains statistical information on the
    * possible values of this column (below).
    */
  var customTag: js.UndefOr[String] = js.native
  /**
    * Identifies the column. [required]
    */
  var field: js.UndefOr[Schema$GooglePrivacyDlpV2FieldId] = js.native
  /**
    * If no semantic tag is indicated, we infer the statistical model from the
    * distribution of values in the input data
    */
  var inferred: js.UndefOr[Schema$GoogleProtobufEmpty] = js.native
  /**
    * A column can be tagged with a InfoType to use the relevant public dataset
    * as a statistical model of population, if available. We currently support
    * US ZIP codes, region codes, ages and genders. To programmatically obtain
    * the list of supported InfoTypes, use ListInfoTypes with the
    * supported_by=RISK_ANALYSIS filter.
    */
  var infoType: js.UndefOr[Schema$GooglePrivacyDlpV2InfoType] = js.native
}

object Schema$GooglePrivacyDlpV2TaggedField {
  @scala.inline
  def apply(
    customTag: String = null,
    field: Schema$GooglePrivacyDlpV2FieldId = null,
    inferred: Schema$GoogleProtobufEmpty = null,
    infoType: Schema$GooglePrivacyDlpV2InfoType = null
  ): Schema$GooglePrivacyDlpV2TaggedField = {
    val __obj = js.Dynamic.literal()
    if (customTag != null) __obj.updateDynamic("customTag")(customTag.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (inferred != null) __obj.updateDynamic("inferred")(inferred.asInstanceOf[js.Any])
    if (infoType != null) __obj.updateDynamic("infoType")(infoType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2TaggedField]
  }
}

