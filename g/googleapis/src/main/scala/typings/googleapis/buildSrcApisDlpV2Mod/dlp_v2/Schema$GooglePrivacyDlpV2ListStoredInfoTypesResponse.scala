package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for ListStoredInfoTypes.
  */
@js.native
trait Schema$GooglePrivacyDlpV2ListStoredInfoTypesResponse extends js.Object {
  /**
    * If the next page is available then the next page token to be used in
    * following ListStoredInfoTypes request.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * List of storedInfoTypes, up to page_size in ListStoredInfoTypesRequest.
    */
  var storedInfoTypes: js.UndefOr[js.Array[Schema$GooglePrivacyDlpV2StoredInfoType]] = js.native
}

object Schema$GooglePrivacyDlpV2ListStoredInfoTypesResponse {
  @scala.inline
  def apply(
    nextPageToken: String = null,
    storedInfoTypes: js.Array[Schema$GooglePrivacyDlpV2StoredInfoType] = null
  ): Schema$GooglePrivacyDlpV2ListStoredInfoTypesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (storedInfoTypes != null) __obj.updateDynamic("storedInfoTypes")(storedInfoTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2ListStoredInfoTypesResponse]
  }
}

