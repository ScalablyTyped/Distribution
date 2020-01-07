package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Results of inspecting an item.
  */
@js.native
trait Schema$GooglePrivacyDlpV2InspectContentResponse extends js.Object {
  /**
    * The findings.
    */
  var result: js.UndefOr[Schema$GooglePrivacyDlpV2InspectResult] = js.native
}

object Schema$GooglePrivacyDlpV2InspectContentResponse {
  @scala.inline
  def apply(result: Schema$GooglePrivacyDlpV2InspectResult = null): Schema$GooglePrivacyDlpV2InspectContentResponse = {
    val __obj = js.Dynamic.literal()
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2InspectContentResponse]
  }
}

