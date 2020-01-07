package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The configuration that controls how the data will change.
  */
@js.native
trait Schema$GooglePrivacyDlpV2DeidentifyConfig extends js.Object {
  /**
    * Treat the dataset as free-form text and apply the same free text
    * transformation everywhere.
    */
  var infoTypeTransformations: js.UndefOr[Schema$GooglePrivacyDlpV2InfoTypeTransformations] = js.native
  /**
    * Treat the dataset as structured. Transformations can be applied to
    * specific locations within structured datasets, such as transforming a
    * column within a table.
    */
  var recordTransformations: js.UndefOr[Schema$GooglePrivacyDlpV2RecordTransformations] = js.native
}

object Schema$GooglePrivacyDlpV2DeidentifyConfig {
  @scala.inline
  def apply(
    infoTypeTransformations: Schema$GooglePrivacyDlpV2InfoTypeTransformations = null,
    recordTransformations: Schema$GooglePrivacyDlpV2RecordTransformations = null
  ): Schema$GooglePrivacyDlpV2DeidentifyConfig = {
    val __obj = js.Dynamic.literal()
    if (infoTypeTransformations != null) __obj.updateDynamic("infoTypeTransformations")(infoTypeTransformations.asInstanceOf[js.Any])
    if (recordTransformations != null) __obj.updateDynamic("recordTransformations")(recordTransformations.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2DeidentifyConfig]
  }
}

