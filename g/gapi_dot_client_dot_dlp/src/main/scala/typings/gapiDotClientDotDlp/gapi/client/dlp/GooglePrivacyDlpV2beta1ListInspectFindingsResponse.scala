package typings.gapiDotClientDotDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1ListInspectFindingsResponse extends js.Object {
  /**
    * If not empty, indicates that there may be more results that match the
    * request; this value should be passed in a new `ListInspectFindingsRequest`.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  /** The results. */
  var result: js.UndefOr[GooglePrivacyDlpV2beta1InspectResult] = js.undefined
}

object GooglePrivacyDlpV2beta1ListInspectFindingsResponse {
  @scala.inline
  def apply(nextPageToken: String = null, result: GooglePrivacyDlpV2beta1InspectResult = null): GooglePrivacyDlpV2beta1ListInspectFindingsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1ListInspectFindingsResponse]
  }
}

