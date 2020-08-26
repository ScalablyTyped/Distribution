package typings.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GooglePrivacyDlpV2beta1ListInspectFindingsResponse extends js.Object {
  /**
    * If not empty, indicates that there may be more results that match the
    * request; this value should be passed in a new `ListInspectFindingsRequest`.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /** The results. */
  var result: js.UndefOr[GooglePrivacyDlpV2beta1InspectResult] = js.native
}

object GooglePrivacyDlpV2beta1ListInspectFindingsResponse {
  @scala.inline
  def apply(): GooglePrivacyDlpV2beta1ListInspectFindingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1ListInspectFindingsResponse]
  }
  @scala.inline
  implicit class GooglePrivacyDlpV2beta1ListInspectFindingsResponseOps[Self <: GooglePrivacyDlpV2beta1ListInspectFindingsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    @scala.inline
    def setResult(value: GooglePrivacyDlpV2beta1InspectResult): Self = this.set("result", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResult: Self = this.set("result", js.undefined)
  }
  
}

