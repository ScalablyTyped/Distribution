package typings.gapiClientDlp.gapi.client.dlp

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDlp.anon.Accesstoken
import typings.gapiClientDlp.anon.Alt
import typings.gapiClientDlp.anon.Bearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OperationsResource extends js.Object {
  /** Cancels an operation. Use the `inspect.operations.get` to check whether the cancellation succeeded or the operation completed despite cancellation. */
  def cancel(request: Alt): Request[js.Object] = js.native
  /**
    * Schedules a job scanning content in a Google Cloud Platform data
    * repository.
    */
  def create(request: Accesstoken): Request[GoogleLongrunningOperation] = js.native
  /** This method is not supported and the server returns `UNIMPLEMENTED`. */
  def delete(request: Alt): Request[js.Object] = js.native
  /**
    * Gets the latest state of a long-running operation.  Clients can use this
    * method to poll the operation result at intervals as recommended by the API
    * service.
    */
  def get(request: Alt): Request[GoogleLongrunningOperation] = js.native
  /** Fetches the list of long running operations. */
  def list(request: Bearertoken): Request[GoogleLongrunningListOperationsResponse] = js.native
}

object OperationsResource {
  @scala.inline
  def apply(
    cancel: Alt => Request[js.Object],
    create: Accesstoken => Request[GoogleLongrunningOperation],
    delete: Alt => Request[js.Object],
    get: Alt => Request[GoogleLongrunningOperation],
    list: Bearertoken => Request[GoogleLongrunningListOperationsResponse]
  ): OperationsResource = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction1(cancel), create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[OperationsResource]
  }
  @scala.inline
  implicit class OperationsResourceOps[Self <: OperationsResource] (val x: Self) extends AnyVal {
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
    def setCancel(value: Alt => Request[js.Object]): Self = this.set("cancel", js.Any.fromFunction1(value))
    @scala.inline
    def setCreate(value: Accesstoken => Request[GoogleLongrunningOperation]): Self = this.set("create", js.Any.fromFunction1(value))
    @scala.inline
    def setDelete(value: Alt => Request[js.Object]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: Alt => Request[GoogleLongrunningOperation]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Bearertoken => Request[GoogleLongrunningListOperationsResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

