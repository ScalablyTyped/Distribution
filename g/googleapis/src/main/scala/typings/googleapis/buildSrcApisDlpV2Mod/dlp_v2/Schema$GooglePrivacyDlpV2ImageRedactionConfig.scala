package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration for determining how redaction of images should occur.
  */
@js.native
trait Schema$GooglePrivacyDlpV2ImageRedactionConfig extends js.Object {
  /**
    * Only one per info_type should be provided per request. If not specified,
    * and redact_all_text is false, the DLP API will redact all text that it
    * matches against all info_types that are found, but not specified in
    * another ImageRedactionConfig.
    */
  var infoType: js.UndefOr[Schema$GooglePrivacyDlpV2InfoType] = js.native
  /**
    * If true, all text found in the image, regardless whether it matches an
    * info_type, is redacted. Only one should be provided.
    */
  var redactAllText: js.UndefOr[Boolean] = js.native
  /**
    * The color to use when redacting content from an image. If not specified,
    * the default is black.
    */
  var redactionColor: js.UndefOr[Schema$GooglePrivacyDlpV2Color] = js.native
}

object Schema$GooglePrivacyDlpV2ImageRedactionConfig {
  @scala.inline
  def apply(
    infoType: Schema$GooglePrivacyDlpV2InfoType = null,
    redactAllText: js.UndefOr[Boolean] = js.undefined,
    redactionColor: Schema$GooglePrivacyDlpV2Color = null
  ): Schema$GooglePrivacyDlpV2ImageRedactionConfig = {
    val __obj = js.Dynamic.literal()
    if (infoType != null) __obj.updateDynamic("infoType")(infoType.asInstanceOf[js.Any])
    if (!js.isUndefined(redactAllText)) __obj.updateDynamic("redactAllText")(redactAllText.asInstanceOf[js.Any])
    if (redactionColor != null) __obj.updateDynamic("redactionColor")(redactionColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2ImageRedactionConfig]
  }
}

