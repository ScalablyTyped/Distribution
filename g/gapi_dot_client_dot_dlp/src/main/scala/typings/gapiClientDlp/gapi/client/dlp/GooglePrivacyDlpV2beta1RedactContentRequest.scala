package typings.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1RedactContentRequest extends js.Object {
  /** The configuration for specifying what content to redact from images. */
  var imageRedactionConfigs: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1ImageRedactionConfig]] = js.undefined
  /** Configuration for the inspector. */
  var inspectConfig: js.UndefOr[GooglePrivacyDlpV2beta1InspectConfig] = js.undefined
  /** The list of items to inspect. Up to 100 are allowed per request. */
  var items: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1ContentItem]] = js.undefined
  /**
    * The strings to replace findings text findings with. Must specify at least
    * one of these or one ImageRedactionConfig if redacting images.
    */
  var replaceConfigs: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1ReplaceConfig]] = js.undefined
}

object GooglePrivacyDlpV2beta1RedactContentRequest {
  @scala.inline
  def apply(
    imageRedactionConfigs: js.Array[GooglePrivacyDlpV2beta1ImageRedactionConfig] = null,
    inspectConfig: GooglePrivacyDlpV2beta1InspectConfig = null,
    items: js.Array[GooglePrivacyDlpV2beta1ContentItem] = null,
    replaceConfigs: js.Array[GooglePrivacyDlpV2beta1ReplaceConfig] = null
  ): GooglePrivacyDlpV2beta1RedactContentRequest = {
    val __obj = js.Dynamic.literal()
    if (imageRedactionConfigs != null) __obj.updateDynamic("imageRedactionConfigs")(imageRedactionConfigs.asInstanceOf[js.Any])
    if (inspectConfig != null) __obj.updateDynamic("inspectConfig")(inspectConfig.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (replaceConfigs != null) __obj.updateDynamic("replaceConfigs")(replaceConfigs.asInstanceOf[js.Any])
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1RedactContentRequest]
  }
}

