package typings.gapiClientStoragetransfer.gapi.client.storagetransfer

import typings.gapiClient.gapi.client.Request
import typings.gapiClientStoragetransfer.anon.Filter
import typings.gapiClientStoragetransfer.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransferOperationsResource extends js.Object {
  /** Cancels a transfer. Use the get method to check whether the cancellation succeeded or whether the operation completed despite cancellation. */
  def cancel(request: Key): Request[js.Object] = js.native
  /** This method is not supported and the server returns `UNIMPLEMENTED`. */
  def delete(request: Key): Request[js.Object] = js.native
  /**
    * Gets the latest state of a long-running operation.  Clients can use this
    * method to poll the operation result at intervals as recommended by the API
    * service.
    */
  def get(request: Key): Request[Operation] = js.native
  /**
    * Lists operations that match the specified filter in the request. If the
    * server doesn't support this method, it returns `UNIMPLEMENTED`.
    *
    * NOTE: the `name` binding allows API services to override the binding
    * to use different resource name schemes, such as `users/&#42;/operations`. To
    * override the binding, API services can add a binding such as
    * `"/v1/{name=users/&#42;}/operations"` to their service configuration.
    * For backwards compatibility, the default name includes the operations
    * collection id, however overriding users must ensure the name binding
    * is the parent resource, without the operations collection id.
    */
  def list(request: Filter): Request[ListOperationsResponse] = js.native
  /** Pauses a transfer operation. */
  def pause(request: Key): Request[js.Object] = js.native
  /** Resumes a transfer operation that is paused. */
  def resume(request: Key): Request[js.Object] = js.native
}

object TransferOperationsResource {
  @scala.inline
  def apply(
    cancel: Key => Request[js.Object],
    delete: Key => Request[js.Object],
    get: Key => Request[Operation],
    list: Filter => Request[ListOperationsResponse],
    pause: Key => Request[js.Object],
    resume: Key => Request[js.Object]
  ): TransferOperationsResource = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction1(cancel), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), pause = js.Any.fromFunction1(pause), resume = js.Any.fromFunction1(resume))
    __obj.asInstanceOf[TransferOperationsResource]
  }
  @scala.inline
  implicit class TransferOperationsResourceOps[Self <: TransferOperationsResource] (val x: Self) extends AnyVal {
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
    def setCancel(value: Key => Request[js.Object]): Self = this.set("cancel", js.Any.fromFunction1(value))
    @scala.inline
    def setDelete(value: Key => Request[js.Object]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: Key => Request[Operation]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Filter => Request[ListOperationsResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setPause(value: Key => Request[js.Object]): Self = this.set("pause", js.Any.fromFunction1(value))
    @scala.inline
    def setResume(value: Key => Request[js.Object]): Self = this.set("resume", js.Any.fromFunction1(value))
  }
  
}

