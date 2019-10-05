package typings.gapiDotClientDotMl.gapi.client.ml

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotMl.Anon_Accesstoken
import typings.gapiDotClientDotMl.Anon_AccesstokenAltBearertokenCallbackFieldsFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationsResource extends js.Object {
  /**
    * Starts asynchronous cancellation on a long-running operation.  The server
    * makes a best effort to cancel the operation, but success is not
    * guaranteed.  If the server doesn't support this method, it returns
    * `google.rpc.Code.UNIMPLEMENTED`.  Clients can use
    * Operations.GetOperation or
    * other methods to check whether the cancellation succeeded or whether the
    * operation completed despite cancellation. On successful cancellation,
    * the operation is not deleted; instead, it becomes an operation with
    * an Operation.error value with a google.rpc.Status.code of 1,
    * corresponding to `Code.CANCELLED`.
    */
  def cancel(request: Anon_Accesstoken): Request[js.Object]
  /**
    * Deletes a long-running operation. This method indicates that the client is
    * no longer interested in the operation result. It does not cancel the
    * operation. If the server doesn't support this method, it returns
    * `google.rpc.Code.UNIMPLEMENTED`.
    */
  def delete(request: Anon_Accesstoken): Request[js.Object]
  /**
    * Gets the latest state of a long-running operation.  Clients can use this
    * method to poll the operation result at intervals as recommended by the API
    * service.
    */
  def get(request: Anon_Accesstoken): Request[GoogleLongrunning__Operation]
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
  def list(request: Anon_AccesstokenAltBearertokenCallbackFieldsFilter): Request[GoogleLongrunning__ListOperationsResponse]
}

object OperationsResource {
  @scala.inline
  def apply(
    cancel: Anon_Accesstoken => Request[js.Object],
    delete: Anon_Accesstoken => Request[js.Object],
    get: Anon_Accesstoken => Request[GoogleLongrunning__Operation],
    list: Anon_AccesstokenAltBearertokenCallbackFieldsFilter => Request[GoogleLongrunning__ListOperationsResponse]
  ): OperationsResource = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction1(cancel), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[OperationsResource]
  }
}

