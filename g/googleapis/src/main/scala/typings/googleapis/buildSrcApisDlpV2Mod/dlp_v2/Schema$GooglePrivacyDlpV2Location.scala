package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies the location of the finding.
  */
@js.native
trait Schema$GooglePrivacyDlpV2Location extends js.Object {
  /**
    * Zero-based byte offsets delimiting the finding. These are relative to the
    * finding&#39;s containing element. Note that when the content is not
    * textual, this references the UTF-8 encoded textual representation of the
    * content. Omitted if content is an image.
    */
  var byteRange: js.UndefOr[Schema$GooglePrivacyDlpV2Range] = js.native
  /**
    * Unicode character offsets delimiting the finding. These are relative to
    * the finding&#39;s containing element. Provided when the content is text.
    */
  var codepointRange: js.UndefOr[Schema$GooglePrivacyDlpV2Range] = js.native
  /**
    * List of nested objects pointing to the precise location of the finding
    * within the file or record.
    */
  var contentLocations: js.UndefOr[js.Array[Schema$GooglePrivacyDlpV2ContentLocation]] = js.native
}

object Schema$GooglePrivacyDlpV2Location {
  @scala.inline
  def apply(
    byteRange: Schema$GooglePrivacyDlpV2Range = null,
    codepointRange: Schema$GooglePrivacyDlpV2Range = null,
    contentLocations: js.Array[Schema$GooglePrivacyDlpV2ContentLocation] = null
  ): Schema$GooglePrivacyDlpV2Location = {
    val __obj = js.Dynamic.literal()
    if (byteRange != null) __obj.updateDynamic("byteRange")(byteRange.asInstanceOf[js.Any])
    if (codepointRange != null) __obj.updateDynamic("codepointRange")(codepointRange.asInstanceOf[js.Any])
    if (contentLocations != null) __obj.updateDynamic("contentLocations")(contentLocations.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2Location]
  }
}

