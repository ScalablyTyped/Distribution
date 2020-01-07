package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response to the ListInfoTypes request.
  */
@js.native
trait Schema$GooglePrivacyDlpV2ListInfoTypesResponse extends js.Object {
  /**
    * Set of sensitive infoTypes.
    */
  var infoTypes: js.UndefOr[js.Array[Schema$GooglePrivacyDlpV2InfoTypeDescription]] = js.native
}

object Schema$GooglePrivacyDlpV2ListInfoTypesResponse {
  @scala.inline
  def apply(infoTypes: js.Array[Schema$GooglePrivacyDlpV2InfoTypeDescription] = null): Schema$GooglePrivacyDlpV2ListInfoTypesResponse = {
    val __obj = js.Dynamic.literal()
    if (infoTypes != null) __obj.updateDynamic("infoTypes")(infoTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2ListInfoTypesResponse]
  }
}

