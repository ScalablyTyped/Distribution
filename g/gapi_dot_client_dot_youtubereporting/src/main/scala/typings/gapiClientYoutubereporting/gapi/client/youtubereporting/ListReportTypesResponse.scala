package typings.gapiClientYoutubereporting.gapi.client.youtubereporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListReportTypesResponse extends js.Object {
  /**
    * A token to retrieve next page of results.
    * Pass this value in the
    * ListReportTypesRequest.page_token
    * field in the subsequent call to `ListReportTypes` method to retrieve the next
    * page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /** The list of report types. */
  var reportTypes: js.UndefOr[js.Array[ReportType]] = js.native
}

object ListReportTypesResponse {
  @scala.inline
  def apply(): ListReportTypesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListReportTypesResponse]
  }
  @scala.inline
  implicit class ListReportTypesResponseOps[Self <: ListReportTypesResponse] (val x: Self) extends AnyVal {
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
    def setReportTypesVarargs(value: ReportType*): Self = this.set("reportTypes", js.Array(value :_*))
    @scala.inline
    def setReportTypes(value: js.Array[ReportType]): Self = this.set("reportTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReportTypes: Self = this.set("reportTypes", js.undefined)
  }
  
}

