package typings
package gapiDotClientDotAppengineLib.gapiNs.clientNs.appengineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait OperationsResource extends js.Object {
  /**
               * Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API
               * service.
               */
  def get(
    request: gapiDotClientDotAppengineLib.Anon_AccesstokenAppsIdPrettyPrintBearertokenCallbackQuotaUser
  ): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /**
               * Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns UNIMPLEMENTED.NOTE: the name
               * binding allows API services to override the binding to use different resource name schemes, such as users/&#42;/operations. To override the binding, API
               * services can add a binding such as "/v1/{name=users/&#42;}/operations" to their service configuration. For backwards compatibility, the default name
               * includes the operations collection id, however overriding users must ensure the name binding is the parent resource, without the operations collection
               * id.
               */
  def list(request: gapiDotClientDotAppengineLib.Anon_AccesstokenPageSizeAppsId): gapiDotClientLib.gapiNs.clientNs.Request[ListOperationsResponse]
}

