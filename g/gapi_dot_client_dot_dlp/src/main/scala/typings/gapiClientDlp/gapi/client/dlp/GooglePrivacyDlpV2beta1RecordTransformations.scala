package typings.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GooglePrivacyDlpV2beta1RecordTransformations extends js.Object {
  /** Transform the record by applying various field transformations. */
  var fieldTransformations: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1FieldTransformation]] = js.native
  /**
    * Configuration defining which records get suppressed entirely. Records that
    * match any suppression rule are omitted from the output [optional].
    */
  var recordSuppressions: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1RecordSuppression]] = js.native
}

object GooglePrivacyDlpV2beta1RecordTransformations {
  @scala.inline
  def apply(): GooglePrivacyDlpV2beta1RecordTransformations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1RecordTransformations]
  }
  @scala.inline
  implicit class GooglePrivacyDlpV2beta1RecordTransformationsOps[Self <: GooglePrivacyDlpV2beta1RecordTransformations] (val x: Self) extends AnyVal {
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
    def setFieldTransformationsVarargs(value: GooglePrivacyDlpV2beta1FieldTransformation*): Self = this.set("fieldTransformations", js.Array(value :_*))
    @scala.inline
    def setFieldTransformations(value: js.Array[GooglePrivacyDlpV2beta1FieldTransformation]): Self = this.set("fieldTransformations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFieldTransformations: Self = this.set("fieldTransformations", js.undefined)
    @scala.inline
    def setRecordSuppressionsVarargs(value: GooglePrivacyDlpV2beta1RecordSuppression*): Self = this.set("recordSuppressions", js.Array(value :_*))
    @scala.inline
    def setRecordSuppressions(value: js.Array[GooglePrivacyDlpV2beta1RecordSuppression]): Self = this.set("recordSuppressions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecordSuppressions: Self = this.set("recordSuppressions", js.undefined)
  }
  
}

