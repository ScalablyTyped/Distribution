package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Results of re-identifying a item.
  */
@js.native
trait Schema$GooglePrivacyDlpV2ReidentifyContentResponse extends js.Object {
  /**
    * The re-identified item.
    */
  var item: js.UndefOr[Schema$GooglePrivacyDlpV2ContentItem] = js.native
  /**
    * An overview of the changes that were made to the `item`.
    */
  var overview: js.UndefOr[Schema$GooglePrivacyDlpV2TransformationOverview] = js.native
}

object Schema$GooglePrivacyDlpV2ReidentifyContentResponse {
  @scala.inline
  def apply(
    item: Schema$GooglePrivacyDlpV2ContentItem = null,
    overview: Schema$GooglePrivacyDlpV2TransformationOverview = null
  ): Schema$GooglePrivacyDlpV2ReidentifyContentResponse = {
    val __obj = js.Dynamic.literal()
    if (item != null) __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    if (overview != null) __obj.updateDynamic("overview")(overview.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2ReidentifyContentResponse]
  }
}

