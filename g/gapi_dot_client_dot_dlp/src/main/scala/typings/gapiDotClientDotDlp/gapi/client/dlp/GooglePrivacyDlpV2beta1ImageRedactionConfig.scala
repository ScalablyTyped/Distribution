package typings.gapiDotClientDotDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1ImageRedactionConfig extends js.Object {
  /**
    * Only one per info_type should be provided per request. If not
    * specified, and redact_all_text is false, the DLP API will redact all
    * text that it matches against all info_types that are found, but not
    * specified in another ImageRedactionConfig.
    */
  var infoType: js.UndefOr[GooglePrivacyDlpV2beta1InfoType] = js.undefined
  /**
    * If true, all text found in the image, regardless whether it matches an
    * info_type, is redacted.
    */
  var redactAllText: js.UndefOr[Boolean] = js.undefined
  /**
    * The color to use when redacting content from an image. If not specified,
    * the default is black.
    */
  var redactionColor: js.UndefOr[GooglePrivacyDlpV2beta1Color] = js.undefined
}

object GooglePrivacyDlpV2beta1ImageRedactionConfig {
  @scala.inline
  def apply(
    infoType: GooglePrivacyDlpV2beta1InfoType = null,
    redactAllText: js.UndefOr[Boolean] = js.undefined,
    redactionColor: GooglePrivacyDlpV2beta1Color = null
  ): GooglePrivacyDlpV2beta1ImageRedactionConfig = {
    val __obj = js.Dynamic.literal()
    if (infoType != null) __obj.updateDynamic("infoType")(infoType.asInstanceOf[js.Any])
    if (!js.isUndefined(redactAllText)) __obj.updateDynamic("redactAllText")(redactAllText.asInstanceOf[js.Any])
    if (redactionColor != null) __obj.updateDynamic("redactionColor")(redactionColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1ImageRedactionConfig]
  }
}

