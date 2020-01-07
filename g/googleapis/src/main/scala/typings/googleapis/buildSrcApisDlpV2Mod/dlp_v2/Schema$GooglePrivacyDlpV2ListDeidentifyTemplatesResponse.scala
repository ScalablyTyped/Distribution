package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for ListDeidentifyTemplates.
  */
@js.native
trait Schema$GooglePrivacyDlpV2ListDeidentifyTemplatesResponse extends js.Object {
  /**
    * List of deidentify templates, up to page_size in
    * ListDeidentifyTemplatesRequest.
    */
  var deidentifyTemplates: js.UndefOr[js.Array[Schema$GooglePrivacyDlpV2DeidentifyTemplate]] = js.native
  /**
    * If the next page is available then the next page token to be used in
    * following ListDeidentifyTemplates request.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$GooglePrivacyDlpV2ListDeidentifyTemplatesResponse {
  @scala.inline
  def apply(
    deidentifyTemplates: js.Array[Schema$GooglePrivacyDlpV2DeidentifyTemplate] = null,
    nextPageToken: String = null
  ): Schema$GooglePrivacyDlpV2ListDeidentifyTemplatesResponse = {
    val __obj = js.Dynamic.literal()
    if (deidentifyTemplates != null) __obj.updateDynamic("deidentifyTemplates")(deidentifyTemplates.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2ListDeidentifyTemplatesResponse]
  }
}

