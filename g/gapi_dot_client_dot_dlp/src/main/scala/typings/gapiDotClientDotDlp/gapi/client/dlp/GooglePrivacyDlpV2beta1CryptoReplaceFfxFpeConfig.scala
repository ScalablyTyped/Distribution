package typings.gapiDotClientDotDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1CryptoReplaceFfxFpeConfig extends js.Object {
  var commonAlphabet: js.UndefOr[String] = js.undefined
  /**
    * A context may be used for higher security since the same
    * identifier in two different contexts likely will be given a distinct
    * surrogate. The principle is that the likeliness is inversely related
    * to the ratio of the number of distinct identifiers per context over the
    * number of possible surrogates: As long as this ratio is small, the
    * likehood is large.
    *
    * If the context is not set, a default tweak will be used.
    * If the context is set but:
    *
    * 1. there is no record present when transforming a given value or
    * 1. the field is not present when transforming a given value,
    *
    * a default tweak will be used.
    *
    * Note that case (1) is expected when an `InfoTypeTransformation` is
    * applied to both structured and non-structured `ContentItem`s.
    * Currently, the referenced field may be of value type integer or string.
    *
    * The tweak is constructed as a sequence of bytes in big endian byte order
    * such that:
    *
    * - a 64 bit integer is encoded followed by a single byte of value 1
    * - a string is encoded in UTF-8 format followed by a single byte of value 2
    *
    * This is also known as the 'tweak', as in tweakable encryption.
    */
  var context: js.UndefOr[GooglePrivacyDlpV2beta1FieldId] = js.undefined
  /** The key used by the encryption algorithm. [required] */
  var cryptoKey: js.UndefOr[GooglePrivacyDlpV2beta1CryptoKey] = js.undefined
  /**
    * This is supported by mapping these to the alphanumeric characters
    * that the FFX mode natively supports. This happens before/after
    * encryption/decryption.
    * Each character listed must appear only once.
    * Number of characters must be in the range [2, 62].
    * This must be encoded as ASCII.
    * The order of characters does not matter.
    */
  var customAlphabet: js.UndefOr[String] = js.undefined
  /** The native way to select the alphabet. Must be in the range [2, 62]. */
  var radix: js.UndefOr[Double] = js.undefined
}

object GooglePrivacyDlpV2beta1CryptoReplaceFfxFpeConfig {
  @scala.inline
  def apply(
    commonAlphabet: String = null,
    context: GooglePrivacyDlpV2beta1FieldId = null,
    cryptoKey: GooglePrivacyDlpV2beta1CryptoKey = null,
    customAlphabet: String = null,
    radix: Int | Double = null
  ): GooglePrivacyDlpV2beta1CryptoReplaceFfxFpeConfig = {
    val __obj = js.Dynamic.literal()
    if (commonAlphabet != null) __obj.updateDynamic("commonAlphabet")(commonAlphabet)
    if (context != null) __obj.updateDynamic("context")(context)
    if (cryptoKey != null) __obj.updateDynamic("cryptoKey")(cryptoKey)
    if (customAlphabet != null) __obj.updateDynamic("customAlphabet")(customAlphabet)
    if (radix != null) __obj.updateDynamic("radix")(radix.asInstanceOf[js.Any])
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1CryptoReplaceFfxFpeConfig]
  }
}

