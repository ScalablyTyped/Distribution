package typings.gapiDotClientDotDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  var condition: js.UndefOr[GooglePrivacyDlpV2beta1RecordCondition] = js.undefined
  /** Input field(s) to apply the transformation to. [required] */
  var fields: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1FieldId]] = js.undefined
  /**
    * Treat the contents of the field as free text, and selectively
    * transform content that matches an `InfoType`.
    */
  var infoTypeTransformations: js.UndefOr[GooglePrivacyDlpV2beta1InfoTypeTransformations] = js.undefined
  /** Apply the transformation to the entire field. */
  var primitiveTransformation: js.UndefOr[GooglePrivacyDlpV2beta1PrimitiveTransformation] = js.undefined
}

object GooglePrivacyDlpV2beta1FieldTransformation {
  @scala.inline
  def apply(
    condition: GooglePrivacyDlpV2beta1RecordCondition = null,
    fields: js.Array[GooglePrivacyDlpV2beta1FieldId] = null,
    infoTypeTransformations: GooglePrivacyDlpV2beta1InfoTypeTransformations = null,
    primitiveTransformation: GooglePrivacyDlpV2beta1PrimitiveTransformation = null
  ): GooglePrivacyDlpV2beta1FieldTransformation = {
    val __obj = js.Dynamic.literal()
    if (condition != null) __obj.updateDynamic("condition")(condition)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (infoTypeTransformations != null) __obj.updateDynamic("infoTypeTransformations")(infoTypeTransformations)
    if (primitiveTransformation != null) __obj.updateDynamic("primitiveTransformation")(primitiveTransformation)
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1FieldTransformation]
  }
}

