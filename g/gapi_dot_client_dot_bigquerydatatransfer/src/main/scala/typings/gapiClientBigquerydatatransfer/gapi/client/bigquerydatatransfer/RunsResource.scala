package typings.gapiClientBigquerydatatransfer.gapi.client.bigquerydatatransfer

import typings.gapiClient.gapi.client.Request
import typings.gapiClientBigquerydatatransfer.anon.Accesstoken
import typings.gapiClientBigquerydatatransfer.anon.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RunsResource extends js.Object {
  var transferLogs: TransferLogsResource = js.native
  /** Deletes the specified transfer run. */
  def delete(request: Accesstoken): Request[js.Object] = js.native
  /** Returns information about the particular transfer run. */
  def get(request: Accesstoken): Request[TransferRun] = js.native
  /** Returns information about running and completed jobs. */
  def list(request: Callback): Request[ListTransferRunsResponse] = js.native
}

object RunsResource {
  @scala.inline
  def apply(
    delete: Accesstoken => Request[js.Object],
    get: Accesstoken => Request[TransferRun],
    list: Callback => Request[ListTransferRunsResponse],
    transferLogs: TransferLogsResource
  ): RunsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), transferLogs = transferLogs.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunsResource]
  }
  @scala.inline
  implicit class RunsResourceOps[Self <: RunsResource] (val x: Self) extends AnyVal {
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
    def setDelete(value: Accesstoken => Request[js.Object]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: Accesstoken => Request[TransferRun]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Callback => Request[ListTransferRunsResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setTransferLogs(value: TransferLogsResource): Self = this.set("transferLogs", value.asInstanceOf[js.Any])
  }
  
}

