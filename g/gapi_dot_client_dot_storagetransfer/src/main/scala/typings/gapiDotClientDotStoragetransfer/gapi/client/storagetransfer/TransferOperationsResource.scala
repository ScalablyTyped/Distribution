package typings.gapiDotClientDotStoragetransfer.gapi.client.storagetransfer

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotStoragetransfer.Anon_AccesstokenAltBearertokenCallbackFieldsFilter
import typings.gapiDotClientDotStoragetransfer.Anon_AccesstokenAltBearertokenCallbackFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransferOperationsResource extends js.Object {
  /** Cancels a transfer. Use the get method to check whether the cancellation succeeded or whether the operation completed despite cancellation. */
  def cancel(request: Anon_AccesstokenAltBearertokenCallbackFieldsKey): Request[js.Object]
  /** This method is not supported and the server returns `UNIMPLEMENTED`. */
  def delete(request: Anon_AccesstokenAltBearertokenCallbackFieldsKey): Request[js.Object]
  /**
    * Gets the latest state of a long-running operation.  Clients can use this
    * method to poll the operation result at intervals as recommended by the API
    * service.
    */
  def get(request: Anon_AccesstokenAltBearertokenCallbackFieldsKey): Request[Operation]
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
  def list(request: Anon_AccesstokenAltBearertokenCallbackFieldsFilter): Request[ListOperationsResponse]
  /** Pauses a transfer operation. */
  def pause(request: Anon_AccesstokenAltBearertokenCallbackFieldsKey): Request[js.Object]
  /** Resumes a transfer operation that is paused. */
  def resume(request: Anon_AccesstokenAltBearertokenCallbackFieldsKey): Request[js.Object]
}

object TransferOperationsResource {
  @scala.inline
  def apply(
    cancel: Anon_AccesstokenAltBearertokenCallbackFieldsKey => Request[js.Object],
    delete: Anon_AccesstokenAltBearertokenCallbackFieldsKey => Request[js.Object],
    get: Anon_AccesstokenAltBearertokenCallbackFieldsKey => Request[Operation],
    list: Anon_AccesstokenAltBearertokenCallbackFieldsFilter => Request[ListOperationsResponse],
    pause: Anon_AccesstokenAltBearertokenCallbackFieldsKey => Request[js.Object],
    resume: Anon_AccesstokenAltBearertokenCallbackFieldsKey => Request[js.Object]
  ): TransferOperationsResource = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction1(cancel), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), pause = js.Any.fromFunction1(pause), resume = js.Any.fromFunction1(resume))
  
    __obj.asInstanceOf[TransferOperationsResource]
  }
}

