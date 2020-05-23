package typings.gapiClientAppengine.gapi.client.appengine

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAppengine.anon.Filter
import typings.gapiClientAppengine.anon.OperationsId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationsResource extends js.Object {
  /**
    * Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API
    * service.
    */
  def get(request: OperationsId): Request[Operation]
  /**
    * Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns UNIMPLEMENTED.NOTE: the name
    * binding allows API services to override the binding to use different resource name schemes, such as users/&#42;/operations. To override the binding, API
    * services can add a binding such as "/v1/{name=users/&#42;}/operations" to their service configuration. For backwards compatibility, the default name
    * includes the operations collection id, however overriding users must ensure the name binding is the parent resource, without the operations collection
    * id.
    */
  def list(request: Filter): Request[ListOperationsResponse]
}

object OperationsResource {
  @scala.inline
  def apply(get: OperationsId => Request[Operation], list: Filter => Request[ListOperationsResponse]): OperationsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[OperationsResource]
  }
}

