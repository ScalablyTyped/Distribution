package typings.gapiDotClientDotRuntimeconfig.gapiNs.clientNs.runtimeconfigNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotRuntimeconfig.Anon_Accesstoken
import typings.gapiDotClientDotRuntimeconfig.Anon_AccesstokenAlt
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
  def list(request: Anon_AccesstokenAlt): Request[ListOperationsResponse]
}

object OperationsResource {
  @scala.inline
  def apply(
    cancel: Anon_Accesstoken => Request[js.Object],
    delete: Anon_Accesstoken => Request[js.Object],
    list: Anon_AccesstokenAlt => Request[ListOperationsResponse]
  ): OperationsResource = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction1(cancel), delete = js.Any.fromFunction1(delete), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[OperationsResource]
  }
}

