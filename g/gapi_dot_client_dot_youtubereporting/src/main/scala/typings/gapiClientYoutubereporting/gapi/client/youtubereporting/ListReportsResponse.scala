package typings.gapiClientYoutubereporting.gapi.client.youtubereporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListReportsResponse extends js.Object {
  /**
    * A token to retrieve next page of results.
    * Pass this value in the
    * ListReportsRequest.page_token
    * field in the subsequent call to `ListReports` method to retrieve the next
    * page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /** The list of report types. */
  var reports: js.UndefOr[js.Array[Report]] = js.native
}

object ListReportsResponse {
  @scala.inline
  def apply(): ListReportsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListReportsResponse]
  }
  @scala.inline
  implicit class ListReportsResponseOps[Self <: ListReportsResponse] (val x: Self) extends AnyVal {
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
    def setReportsVarargs(value: Report*): Self = this.set("reports", js.Array(value :_*))
    @scala.inline
    def setReports(value: js.Array[Report]): Self = this.set("reports", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReports: Self = this.set("reports", js.undefined)
  }
  
}

