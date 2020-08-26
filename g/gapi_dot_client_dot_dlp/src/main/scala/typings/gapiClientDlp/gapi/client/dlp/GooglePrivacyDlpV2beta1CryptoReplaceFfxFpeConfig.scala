package typings.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GooglePrivacyDlpV2beta1CryptoReplaceFfxFpeConfig extends js.Object {
  var commonAlphabet: js.UndefOr[String] = js.native
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
  var context: js.UndefOr[GooglePrivacyDlpV2beta1FieldId] = js.native
  /** The key used by the encryption algorithm. [required] */
  var cryptoKey: js.UndefOr[GooglePrivacyDlpV2beta1CryptoKey] = js.native
  /**
    * This is supported by mapping these to the alphanumeric characters
    * that the FFX mode natively supports. This happens before/after
    * encryption/decryption.
    * Each character listed must appear only once.
    * Number of characters must be in the range [2, 62].
    * This must be encoded as ASCII.
    * The order of characters does not matter.
    */
  var customAlphabet: js.UndefOr[String] = js.native
  /** The native way to select the alphabet. Must be in the range [2, 62]. */
  var radix: js.UndefOr[Double] = js.native
}

object GooglePrivacyDlpV2beta1CryptoReplaceFfxFpeConfig {
  @scala.inline
  def apply(): GooglePrivacyDlpV2beta1CryptoReplaceFfxFpeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1CryptoReplaceFfxFpeConfig]
  }
  @scala.inline
  implicit class GooglePrivacyDlpV2beta1CryptoReplaceFfxFpeConfigOps[Self <: GooglePrivacyDlpV2beta1CryptoReplaceFfxFpeConfig] (val x: Self) extends AnyVal {
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
    def setCommonAlphabet(value: String): Self = this.set("commonAlphabet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommonAlphabet: Self = this.set("commonAlphabet", js.undefined)
    @scala.inline
    def setContext(value: GooglePrivacyDlpV2beta1FieldId): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    @scala.inline
    def setCryptoKey(value: GooglePrivacyDlpV2beta1CryptoKey): Self = this.set("cryptoKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCryptoKey: Self = this.set("cryptoKey", js.undefined)
    @scala.inline
    def setCustomAlphabet(value: String): Self = this.set("customAlphabet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomAlphabet: Self = this.set("customAlphabet", js.undefined)
    @scala.inline
    def setRadix(value: Double): Self = this.set("radix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRadix: Self = this.set("radix", js.undefined)
  }
  
}

