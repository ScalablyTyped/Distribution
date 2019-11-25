package typings.gapiDotClientDotDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1CharacterMaskConfig extends js.Object {
  /**
    * When masking a string, items in this list will be skipped when replacing.
    * For example, if your string is 555-555-5555 and you ask us to skip `-` and
    * mask 5 chars with &#42; we would produce &#42;&#42;&#42;-&#42;55-5555.
    */
  var charactersToIgnore: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1CharsToIgnore]] = js.undefined
  /**
    * Character to mask the sensitive values&mdash;for example, "&#42;" for an
    * alphabetic string such as name, or "0" for a numeric string such as ZIP
    * code or credit card number. String must have length 1. If not supplied, we
    * will default to "&#42;" for strings, 0 for digits.
    */
  var maskingCharacter: js.UndefOr[String] = js.undefined
  /**
    * Number of characters to mask. If not set, all matching chars will be
    * masked. Skipped characters do not count towards this tally.
    */
  var numberToMask: js.UndefOr[Double] = js.undefined
  /**
    * Mask characters in reverse order. For example, if `masking_character` is
    * '0', number_to_mask is 14, and `reverse_order` is false, then
    * 1234-5678-9012-3456 -> 00000000000000-3456
    * If `masking_character` is '&#42;', `number_to_mask` is 3, and `reverse_order`
    * is true, then 12345 -> 12&#42;&#42;&#42;
    */
  var reverseOrder: js.UndefOr[Boolean] = js.undefined
}

object GooglePrivacyDlpV2beta1CharacterMaskConfig {
  @scala.inline
  def apply(
    charactersToIgnore: js.Array[GooglePrivacyDlpV2beta1CharsToIgnore] = null,
    maskingCharacter: String = null,
    numberToMask: Int | Double = null,
    reverseOrder: js.UndefOr[Boolean] = js.undefined
  ): GooglePrivacyDlpV2beta1CharacterMaskConfig = {
    val __obj = js.Dynamic.literal()
    if (charactersToIgnore != null) __obj.updateDynamic("charactersToIgnore")(charactersToIgnore.asInstanceOf[js.Any])
    if (maskingCharacter != null) __obj.updateDynamic("maskingCharacter")(maskingCharacter.asInstanceOf[js.Any])
    if (numberToMask != null) __obj.updateDynamic("numberToMask")(numberToMask.asInstanceOf[js.Any])
    if (!js.isUndefined(reverseOrder)) __obj.updateDynamic("reverseOrder")(reverseOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1CharacterMaskConfig]
  }
}

