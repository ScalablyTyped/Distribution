package typings.gapiDotClientDotDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1DeidentifyConfig extends js.Object {
  /**
    * Treat the dataset as free-form text and apply the same free text
    * transformation everywhere.
    */
  var infoTypeTransformations: js.UndefOr[GooglePrivacyDlpV2beta1InfoTypeTransformations] = js.undefined
  /**
    * Treat the dataset as structured. Transformations can be applied to
    * specific locations within structured datasets, such as transforming
    * a column within a table.
    */
  var recordTransformations: js.UndefOr[GooglePrivacyDlpV2beta1RecordTransformations] = js.undefined
}

object GooglePrivacyDlpV2beta1DeidentifyConfig {
  @scala.inline
  def apply(
    infoTypeTransformations: GooglePrivacyDlpV2beta1InfoTypeTransformations = null,
    recordTransformations: GooglePrivacyDlpV2beta1RecordTransformations = null
  ): GooglePrivacyDlpV2beta1DeidentifyConfig = {
    val __obj = js.Dynamic.literal()
    if (infoTypeTransformations != null) __obj.updateDynamic("infoTypeTransformations")(infoTypeTransformations)
    if (recordTransformations != null) __obj.updateDynamic("recordTransformations")(recordTransformations)
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1DeidentifyConfig]
  }
}

