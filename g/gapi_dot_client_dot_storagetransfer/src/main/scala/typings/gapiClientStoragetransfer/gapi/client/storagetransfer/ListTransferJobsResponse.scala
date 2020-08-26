package typings.gapiClientStoragetransfer.gapi.client.storagetransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTransferJobsResponse extends js.Object {
  /** The list next page token. */
  var nextPageToken: js.UndefOr[String] = js.native
  /** A list of transfer jobs. */
  var transferJobs: js.UndefOr[js.Array[TransferJob]] = js.native
}

object ListTransferJobsResponse {
  @scala.inline
  def apply(): ListTransferJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTransferJobsResponse]
  }
  @scala.inline
  implicit class ListTransferJobsResponseOps[Self <: ListTransferJobsResponse] (val x: Self) extends AnyVal {
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
    def setTransferJobsVarargs(value: TransferJob*): Self = this.set("transferJobs", js.Array(value :_*))
    @scala.inline
    def setTransferJobs(value: js.Array[TransferJob]): Self = this.set("transferJobs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransferJobs: Self = this.set("transferJobs", js.undefined)
  }
  
}

