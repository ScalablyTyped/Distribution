package typings.gapiClientStoragetransfer.gapi.client.storagetransfer

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientStoragetransfer.AnonFilter
import typings.gapiClientStoragetransfer.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransferOperationsResource extends js.Object {
  /** Cancels a transfer. Use the get method to check whether the cancellation succeeded or whether the operation completed despite cancellation. */
  def cancel(request: AnonKey): Request_[js.Object]
  /** This method is not supported and the server returns `UNIMPLEMENTED`. */
  def delete(request: AnonKey): Request_[js.Object]
  /**
    * Gets the latest state of a long-running operation.  Clients can use this
    * method to poll the operation result at intervals as recommended by the API
    * service.
    */
  def get(request: AnonKey): Request_[Operation]
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
  def list(request: AnonFilter): Request_[ListOperationsResponse]
  /** Pauses a transfer operation. */
  def pause(request: AnonKey): Request_[js.Object]
  /** Resumes a transfer operation that is paused. */
  def resume(request: AnonKey): Request_[js.Object]
}

object TransferOperationsResource {
  @scala.inline
  def apply(
    cancel: AnonKey => Request_[js.Object],
    delete: AnonKey => Request_[js.Object],
    get: AnonKey => Request_[Operation],
    list: AnonFilter => Request_[ListOperationsResponse],
    pause: AnonKey => Request_[js.Object],
    resume: AnonKey => Request_[js.Object]
  ): TransferOperationsResource = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction1(cancel), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), pause = js.Any.fromFunction1(pause), resume = js.Any.fromFunction1(resume))
    __obj.asInstanceOf[TransferOperationsResource]
  }
}

