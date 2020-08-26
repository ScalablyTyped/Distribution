package typings.gapiClientBigquerydatatransfer.gapi.client.bigquerydatatransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTransferRunsResponse extends js.Object {
  /**
    * Output only. The next-pagination token. For multiple-page list results,
    * this token can be used as the
    * `ListTransferRunsRequest.page_token`
    * to request the next page of list results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /** Output only. The stored pipeline transfer runs. */
  var transferRuns: js.UndefOr[js.Array[TransferRun]] = js.native
}

object ListTransferRunsResponse {
  @scala.inline
  def apply(): ListTransferRunsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTransferRunsResponse]
  }
  @scala.inline
  implicit class ListTransferRunsResponseOps[Self <: ListTransferRunsResponse] (val x: Self) extends AnyVal {
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
    def setTransferRunsVarargs(value: TransferRun*): Self = this.set("transferRuns", js.Array(value :_*))
    @scala.inline
    def setTransferRuns(value: js.Array[TransferRun]): Self = this.set("transferRuns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransferRuns: Self = this.set("transferRuns", js.undefined)
  }
  
}

