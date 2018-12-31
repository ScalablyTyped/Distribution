package typings
package gapiDotClientDotGenomicsLib.gapiNs.clientNs.genomicsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationsResource extends js.Object {
  /**
    * Starts asynchronous cancellation on a long-running operation. The server makes a best effort to cancel the operation, but success is not guaranteed.
    * Clients may use Operations.GetOperation or Operations.ListOperations to check whether the cancellation succeeded or the operation completed despite
    * cancellation.
    */
  def cancel(request: gapiDotClientDotGenomicsLib.Anon_Name): gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
  /**
    * Gets the latest state of a long-running operation.  Clients can use this
    * method to poll the operation result at intervals as recommended by the API
    * service.
    */
  def get(request: gapiDotClientDotGenomicsLib.Anon_Name): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Lists operations that match the specified filter in the request. */
  def list(request: gapiDotClientDotGenomicsLib.Anon_NameAccesstoken): gapiDotClientLib.gapiNs.clientNs.Request[ListOperationsResponse]
}

