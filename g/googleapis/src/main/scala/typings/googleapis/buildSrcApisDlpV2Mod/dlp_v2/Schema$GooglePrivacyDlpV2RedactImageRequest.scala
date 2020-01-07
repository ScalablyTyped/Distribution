package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to search for potentially sensitive info in an image and redact it
  * by covering it with a colored rectangle.
  */
@js.native
trait Schema$GooglePrivacyDlpV2RedactImageRequest extends js.Object {
  /**
    * The content must be PNG, JPEG, SVG or BMP.
    */
  var byteItem: js.UndefOr[Schema$GooglePrivacyDlpV2ByteContentItem] = js.native
  /**
    * The configuration for specifying what content to redact from images.
    */
  var imageRedactionConfigs: js.UndefOr[js.Array[Schema$GooglePrivacyDlpV2ImageRedactionConfig]] = js.native
  /**
    * Whether the response should include findings along with the redacted
    * image.
    */
  var includeFindings: js.UndefOr[Boolean] = js.native
  /**
    * Configuration for the inspector.
    */
  var inspectConfig: js.UndefOr[Schema$GooglePrivacyDlpV2InspectConfig] = js.native
}

object Schema$GooglePrivacyDlpV2RedactImageRequest {
  @scala.inline
  def apply(
    byteItem: Schema$GooglePrivacyDlpV2ByteContentItem = null,
    imageRedactionConfigs: js.Array[Schema$GooglePrivacyDlpV2ImageRedactionConfig] = null,
    includeFindings: js.UndefOr[Boolean] = js.undefined,
    inspectConfig: Schema$GooglePrivacyDlpV2InspectConfig = null
  ): Schema$GooglePrivacyDlpV2RedactImageRequest = {
    val __obj = js.Dynamic.literal()
    if (byteItem != null) __obj.updateDynamic("byteItem")(byteItem.asInstanceOf[js.Any])
    if (imageRedactionConfigs != null) __obj.updateDynamic("imageRedactionConfigs")(imageRedactionConfigs.asInstanceOf[js.Any])
    if (!js.isUndefined(includeFindings)) __obj.updateDynamic("includeFindings")(includeFindings.asInstanceOf[js.Any])
    if (inspectConfig != null) __obj.updateDynamic("inspectConfig")(inspectConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2RedactImageRequest]
  }
}

