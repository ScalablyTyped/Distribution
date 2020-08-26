package typings.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GooglePrivacyDlpV2beta1DeidentifyConfig extends js.Object {
  /**
    * Treat the dataset as free-form text and apply the same free text
    * transformation everywhere.
    */
  var infoTypeTransformations: js.UndefOr[GooglePrivacyDlpV2beta1InfoTypeTransformations] = js.native
  /**
    * Treat the dataset as structured. Transformations can be applied to
    * specific locations within structured datasets, such as transforming
    * a column within a table.
    */
  var recordTransformations: js.UndefOr[GooglePrivacyDlpV2beta1RecordTransformations] = js.native
}

object GooglePrivacyDlpV2beta1DeidentifyConfig {
  @scala.inline
  def apply(): GooglePrivacyDlpV2beta1DeidentifyConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1DeidentifyConfig]
  }
  @scala.inline
  implicit class GooglePrivacyDlpV2beta1DeidentifyConfigOps[Self <: GooglePrivacyDlpV2beta1DeidentifyConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setInfoTypeTransformations(value: GooglePrivacyDlpV2beta1InfoTypeTransformations): Self = this.set("infoTypeTransformations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInfoTypeTransformations: Self = this.set("infoTypeTransformations", js.undefined)
    @scala.inline
    def setRecordTransformations(value: GooglePrivacyDlpV2beta1RecordTransformations): Self = this.set("recordTransformations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecordTransformations: Self = this.set("recordTransformations", js.undefined)
  }
  
}

