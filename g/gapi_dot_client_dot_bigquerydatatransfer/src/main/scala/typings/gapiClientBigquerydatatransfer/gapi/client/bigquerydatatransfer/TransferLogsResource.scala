package typings.gapiClientBigquerydatatransfer.gapi.client.bigquerydatatransfer

import typings.gapiClient.gapi.client.Request
import typings.gapiClientBigquerydatatransfer.anon.Bearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransferLogsResource extends js.Object {
  /** Returns user facing log messages for the data transfer run. */
  def list(request: Bearertoken): Request[ListTransferLogsResponse] = js.native
}

object TransferLogsResource {
  @scala.inline
  def apply(list: Bearertoken => Request[ListTransferLogsResponse]): TransferLogsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[TransferLogsResource]
  }
  @scala.inline
  implicit class TransferLogsResourceOps[Self <: TransferLogsResource] (val x: Self) extends AnyVal {
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
    def setList(value: Bearertoken => Request[ListTransferLogsResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

