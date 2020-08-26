package typings.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GooglePrivacyDlpV2beta1TransformationSummary extends js.Object {
  /** Set if the transformation was limited to a specific FieldId. */
  var field: js.UndefOr[GooglePrivacyDlpV2beta1FieldId] = js.native
  /**
    * The field transformation that was applied. This list will contain
    * multiple only in the case of errors.
    */
  var fieldTransformations: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1FieldTransformation]] = js.native
  /** Set if the transformation was limited to a specific info_type. */
  var infoType: js.UndefOr[GooglePrivacyDlpV2beta1InfoType] = js.native
  /** The specific suppression option these stats apply to. */
  var recordSuppress: js.UndefOr[GooglePrivacyDlpV2beta1RecordSuppression] = js.native
  var results: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1SummaryResult]] = js.native
  /** The specific transformation these stats apply to. */
  var transformation: js.UndefOr[GooglePrivacyDlpV2beta1PrimitiveTransformation] = js.native
}

object GooglePrivacyDlpV2beta1TransformationSummary {
  @scala.inline
  def apply(): GooglePrivacyDlpV2beta1TransformationSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1TransformationSummary]
  }
  @scala.inline
  implicit class GooglePrivacyDlpV2beta1TransformationSummaryOps[Self <: GooglePrivacyDlpV2beta1TransformationSummary] (val x: Self) extends AnyVal {
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
    def setField(value: GooglePrivacyDlpV2beta1FieldId): Self = this.set("field", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
    @scala.inline
    def setFieldTransformationsVarargs(value: GooglePrivacyDlpV2beta1FieldTransformation*): Self = this.set("fieldTransformations", js.Array(value :_*))
    @scala.inline
    def setFieldTransformations(value: js.Array[GooglePrivacyDlpV2beta1FieldTransformation]): Self = this.set("fieldTransformations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFieldTransformations: Self = this.set("fieldTransformations", js.undefined)
    @scala.inline
    def setInfoType(value: GooglePrivacyDlpV2beta1InfoType): Self = this.set("infoType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInfoType: Self = this.set("infoType", js.undefined)
    @scala.inline
    def setRecordSuppress(value: GooglePrivacyDlpV2beta1RecordSuppression): Self = this.set("recordSuppress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecordSuppress: Self = this.set("recordSuppress", js.undefined)
    @scala.inline
    def setResultsVarargs(value: GooglePrivacyDlpV2beta1SummaryResult*): Self = this.set("results", js.Array(value :_*))
    @scala.inline
    def setResults(value: js.Array[GooglePrivacyDlpV2beta1SummaryResult]): Self = this.set("results", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResults: Self = this.set("results", js.undefined)
    @scala.inline
    def setTransformation(value: GooglePrivacyDlpV2beta1PrimitiveTransformation): Self = this.set("transformation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransformation: Self = this.set("transformation", js.undefined)
  }
  
}

