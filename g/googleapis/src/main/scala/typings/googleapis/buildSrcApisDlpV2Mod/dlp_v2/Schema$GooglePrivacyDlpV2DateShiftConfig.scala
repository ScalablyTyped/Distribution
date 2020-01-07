package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Shifts dates by random number of days, with option to be consistent for the
  * same context. See https://cloud.google.com/dlp/docs/concepts-date-shifting
  * to learn more.
  */
@js.native
trait Schema$GooglePrivacyDlpV2DateShiftConfig extends js.Object {
  /**
    * Points to the field that contains the context, for example, an entity id.
    * If set, must also set method. If set, shift will be consistent for the
    * given context.
    */
  var context: js.UndefOr[Schema$GooglePrivacyDlpV2FieldId] = js.native
  /**
    * Causes the shift to be computed based on this key and the context. This
    * results in the same shift for the same context and crypto_key.
    */
  var cryptoKey: js.UndefOr[Schema$GooglePrivacyDlpV2CryptoKey] = js.native
  /**
    * For example, -5 means shift date to at most 5 days back in the past.
    * [Required]
    */
  var lowerBoundDays: js.UndefOr[Double] = js.native
  /**
    * Range of shift in days. Actual shift will be selected at random within
    * this range (inclusive ends). Negative means shift to earlier in time.
    * Must not be more than 365250 days (1000 years) each direction.  For
    * example, 3 means shift date to at most 3 days into the future. [Required]
    */
  var upperBoundDays: js.UndefOr[Double] = js.native
}

object Schema$GooglePrivacyDlpV2DateShiftConfig {
  @scala.inline
  def apply(
    context: Schema$GooglePrivacyDlpV2FieldId = null,
    cryptoKey: Schema$GooglePrivacyDlpV2CryptoKey = null,
    lowerBoundDays: Int | Double = null,
    upperBoundDays: Int | Double = null
  ): Schema$GooglePrivacyDlpV2DateShiftConfig = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (cryptoKey != null) __obj.updateDynamic("cryptoKey")(cryptoKey.asInstanceOf[js.Any])
    if (lowerBoundDays != null) __obj.updateDynamic("lowerBoundDays")(lowerBoundDays.asInstanceOf[js.Any])
    if (upperBoundDays != null) __obj.updateDynamic("upperBoundDays")(upperBoundDays.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2DateShiftConfig]
  }
}

