package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Results of de-identifying a ContentItem.
  */
@js.native
trait Schema$GooglePrivacyDlpV2DeidentifyContentResponse extends js.Object {
  /**
    * The de-identified item.
    */
  var item: js.UndefOr[Schema$GooglePrivacyDlpV2ContentItem] = js.native
  /**
    * An overview of the changes that were made on the `item`.
    */
  var overview: js.UndefOr[Schema$GooglePrivacyDlpV2TransformationOverview] = js.native
}

object Schema$GooglePrivacyDlpV2DeidentifyContentResponse {
  @scala.inline
  def apply(
    item: Schema$GooglePrivacyDlpV2ContentItem = null,
    overview: Schema$GooglePrivacyDlpV2TransformationOverview = null
  ): Schema$GooglePrivacyDlpV2DeidentifyContentResponse = {
    val __obj = js.Dynamic.literal()
    if (item != null) __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    if (overview != null) __obj.updateDynamic("overview")(overview.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2DeidentifyContentResponse]
  }
}

