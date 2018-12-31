package typings
package gapiDotClientDotServicemanagementLib.gapiNs.clientNs.servicemanagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationsResource extends js.Object {
  /**
    * Gets the latest state of a long-running operation.  Clients can use this
    * method to poll the operation result at intervals as recommended by the API
    * service.
    */
  def get(request: gapiDotClientDotServicemanagementLib.Anon_Name): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Lists service operations that match the specified filter in the request. */
  def list(request: gapiDotClientDotServicemanagementLib.Anon_NameAccesstoken): gapiDotClientLib.gapiNs.clientNs.Request[ListOperationsResponse]
}

