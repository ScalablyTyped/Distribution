package typings.gapiClientStoragetransfer.gapi.client.storagetransfer

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientStoragetransfer.AnonAccesstokenAltBearertokenCallbackFieldsFilter
import typings.gapiClientStoragetransfer.AnonAccesstokenAltBearertokenCallbackFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransferOperationsResource extends js.Object {
  /** Cancels a transfer. Use the get method to check whether the cancellation succeeded or whether the operation completed despite cancellation. */
  def cancel(request: AnonAccesstokenAltBearertokenCallbackFieldsKey): Request_[js.Object]
  /** This method is not supported and the server returns `UNIMPLEMENTED`. */
  def delete(request: AnonAccesstokenAltBearertokenCallbackFieldsKey): Request_[js.Object]
  /**
    * Gets the latest state of a long-running operation.  Clients can use this
    * method to poll the operation result at intervals as recommended by the API
    * service.
    */
  def get(request: AnonAccesstokenAltBearertokenCallbackFieldsKey): Request_[Operation]
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
  def list(request: AnonAccesstokenAltBearertokenCallbackFieldsFilter): Request_[ListOperationsResponse]
  /** Pauses a transfer operation. */
  def pause(request: AnonAccesstokenAltBearertokenCallbackFieldsKey): Request_[js.Object]
  /** Resumes a transfer operation that is paused. */
  def resume(request: AnonAccesstokenAltBearertokenCallbackFieldsKey): Request_[js.Object]
}

object TransferOperationsResource {
  @scala.inline
  def apply(
    cancel: AnonAccesstokenAltBearertokenCallbackFieldsKey => Request_[js.Object],
    delete: AnonAccesstokenAltBearertokenCallbackFieldsKey => Request_[js.Object],
    get: AnonAccesstokenAltBearertokenCallbackFieldsKey => Request_[Operation],
    list: AnonAccesstokenAltBearertokenCallbackFieldsFilter => Request_[ListOperationsResponse],
    pause: AnonAccesstokenAltBearertokenCallbackFieldsKey => Request_[js.Object],
    resume: AnonAccesstokenAltBearertokenCallbackFieldsKey => Request_[js.Object]
  ): TransferOperationsResource = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction1(cancel), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), pause = js.Any.fromFunction1(pause), resume = js.Any.fromFunction1(resume))
  
    __obj.asInstanceOf[TransferOperationsResource]
  }
}

