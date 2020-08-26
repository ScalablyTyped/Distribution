package typings.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GooglePrivacyDlpV2beta1InspectContentResponse extends js.Object {
  /**
    * Each content_item from the request has a result in this list, in the
    * same order as the request.
    */
  var results: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1InspectResult]] = js.native
}

object GooglePrivacyDlpV2beta1InspectContentResponse {
  @scala.inline
  def apply(): GooglePrivacyDlpV2beta1InspectContentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1InspectContentResponse]
  }
  @scala.inline
  implicit class GooglePrivacyDlpV2beta1InspectContentResponseOps[Self <: GooglePrivacyDlpV2beta1InspectContentResponse] (val x: Self) extends AnyVal {
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
    def setResultsVarargs(value: GooglePrivacyDlpV2beta1InspectResult*): Self = this.set("results", js.Array(value :_*))
    @scala.inline
    def setResults(value: js.Array[GooglePrivacyDlpV2beta1InspectResult]): Self = this.set("results", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResults: Self = this.set("results", js.undefined)
  }
  
}

