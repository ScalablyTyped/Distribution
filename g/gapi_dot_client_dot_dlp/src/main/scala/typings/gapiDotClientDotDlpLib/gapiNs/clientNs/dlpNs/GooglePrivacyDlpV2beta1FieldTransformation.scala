package typings
package gapiDotClientDotDlpLib.gapiNs.clientNs.dlpNs

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

