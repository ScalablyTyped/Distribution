package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The field type of `value` and `field` do not need to match to be considered
  * equal, but not all comparisons are possible. EQUAL_TO and NOT_EQUAL_TO
  * attempt to compare even with incompatible types, but all other comparisons
  * are invalid with incompatible types. A `value` of type:  - `string` can be
  * compared against all other types - `boolean` can only be compared against
  * other booleans - `integer` can be compared against doubles or a string if
  * the string value can be parsed as an integer. - `double` can be compared
  * against integers or a string if the string can be parsed as a double. -
  * `Timestamp` can be compared against strings in RFC 3339 date string format.
  * - `TimeOfDay` can be compared against timestamps and strings in the format
  * of &#39;HH:mm:ss&#39;.  If we fail to compare do to type mismatch, a
  * warning will be given and the condition will evaluate to false.
  */
@js.native
trait Schema$GooglePrivacyDlpV2Condition extends js.Object {
  /**
    * Field within the record this condition is evaluated against. [required]
    */
  var field: js.UndefOr[Schema$GooglePrivacyDlpV2FieldId] = js.native
  /**
    * Operator used to compare the field or infoType to the value. [required]
    */
  var operator: js.UndefOr[String] = js.native
  /**
    * Value to compare against. [Required, except for `EXISTS` tests.]
    */
  var value: js.UndefOr[Schema$GooglePrivacyDlpV2Value] = js.native
}

object Schema$GooglePrivacyDlpV2Condition {
  @scala.inline
  def apply(
    field: Schema$GooglePrivacyDlpV2FieldId = null,
    operator: String = null,
    value: Schema$GooglePrivacyDlpV2Value = null
  ): Schema$GooglePrivacyDlpV2Condition = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (operator != null) __obj.updateDynamic("operator")(operator.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2Condition]
  }
}

