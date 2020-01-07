package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for ListInspectTemplates.
  */
@js.native
trait Schema$GooglePrivacyDlpV2ListInspectTemplatesResponse extends js.Object {
  /**
    * List of inspectTemplates, up to page_size in ListInspectTemplatesRequest.
    */
  var inspectTemplates: js.UndefOr[js.Array[Schema$GooglePrivacyDlpV2InspectTemplate]] = js.native
  /**
    * If the next page is available then the next page token to be used in
    * following ListInspectTemplates request.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$GooglePrivacyDlpV2ListInspectTemplatesResponse {
  @scala.inline
  def apply(
    inspectTemplates: js.Array[Schema$GooglePrivacyDlpV2InspectTemplate] = null,
    nextPageToken: String = null
  ): Schema$GooglePrivacyDlpV2ListInspectTemplatesResponse = {
    val __obj = js.Dynamic.literal()
    if (inspectTemplates != null) __obj.updateDynamic("inspectTemplates")(inspectTemplates.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2ListInspectTemplatesResponse]
  }
}

