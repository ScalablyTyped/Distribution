package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchUpdateSpreadsheetRequest extends js.Object {
  var includeSpreadsheetInResponse: js.UndefOr[Boolean] = js.native
  var requests: js.UndefOr[js.Array[Request]] = js.native
  var responseIncludeGridData: js.UndefOr[Boolean] = js.native
  var responseRanges: js.UndefOr[js.Array[String]] = js.native
}

object BatchUpdateSpreadsheetRequest {
  @scala.inline
  def apply(): BatchUpdateSpreadsheetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchUpdateSpreadsheetRequest]
  }
  @scala.inline
  implicit class BatchUpdateSpreadsheetRequestOps[Self <: BatchUpdateSpreadsheetRequest] (val x: Self) extends AnyVal {
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
    def setIncludeSpreadsheetInResponse(value: Boolean): Self = this.set("includeSpreadsheetInResponse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeSpreadsheetInResponse: Self = this.set("includeSpreadsheetInResponse", js.undefined)
    @scala.inline
    def setRequestsVarargs(value: Request*): Self = this.set("requests", js.Array(value :_*))
    @scala.inline
    def setRequests(value: js.Array[Request]): Self = this.set("requests", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequests: Self = this.set("requests", js.undefined)
    @scala.inline
    def setResponseIncludeGridData(value: Boolean): Self = this.set("responseIncludeGridData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseIncludeGridData: Self = this.set("responseIncludeGridData", js.undefined)
    @scala.inline
    def setResponseRangesVarargs(value: String*): Self = this.set("responseRanges", js.Array(value :_*))
    @scala.inline
    def setResponseRanges(value: js.Array[String]): Self = this.set("responseRanges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseRanges: Self = this.set("responseRanges", js.undefined)
  }
  
}

