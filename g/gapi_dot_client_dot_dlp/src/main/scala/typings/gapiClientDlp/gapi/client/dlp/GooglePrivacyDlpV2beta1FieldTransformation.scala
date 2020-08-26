package typings.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GooglePrivacyDlpV2beta1FieldTransformation extends js.Object {
  /**
    * Only apply the transformation if the condition evaluates to true for the
    * given `RecordCondition`. The conditions are allowed to reference fields
    * that are not used in the actual transformation. [optional]
    *
    * Example Use Cases:
    *
    * - Apply a different bucket transformation to an age column if the zip code
    * column for the same record is within a specific range.
    * - Redact a field if the date of birth field is greater than 85.
    */
  var condition: js.UndefOr[GooglePrivacyDlpV2beta1RecordCondition] = js.native
  /** Input field(s) to apply the transformation to. [required] */
  var fields: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1FieldId]] = js.native
  /**
    * Treat the contents of the field as free text, and selectively
    * transform content that matches an `InfoType`.
    */
  var infoTypeTransformations: js.UndefOr[GooglePrivacyDlpV2beta1InfoTypeTransformations] = js.native
  /** Apply the transformation to the entire field. */
  var primitiveTransformation: js.UndefOr[GooglePrivacyDlpV2beta1PrimitiveTransformation] = js.native
}

object GooglePrivacyDlpV2beta1FieldTransformation {
  @scala.inline
  def apply(): GooglePrivacyDlpV2beta1FieldTransformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1FieldTransformation]
  }
  @scala.inline
  implicit class GooglePrivacyDlpV2beta1FieldTransformationOps[Self <: GooglePrivacyDlpV2beta1FieldTransformation] (val x: Self) extends AnyVal {
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
    def setCondition(value: GooglePrivacyDlpV2beta1RecordCondition): Self = this.set("condition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCondition: Self = this.set("condition", js.undefined)
    @scala.inline
    def setFieldsVarargs(value: GooglePrivacyDlpV2beta1FieldId*): Self = this.set("fields", js.Array(value :_*))
    @scala.inline
    def setFields(value: js.Array[GooglePrivacyDlpV2beta1FieldId]): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    @scala.inline
    def setInfoTypeTransformations(value: GooglePrivacyDlpV2beta1InfoTypeTransformations): Self = this.set("infoTypeTransformations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInfoTypeTransformations: Self = this.set("infoTypeTransformations", js.undefined)
    @scala.inline
    def setPrimitiveTransformation(value: GooglePrivacyDlpV2beta1PrimitiveTransformation): Self = this.set("primitiveTransformation", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimitiveTransformation: Self = this.set("primitiveTransformation", js.undefined)
  }
  
}

