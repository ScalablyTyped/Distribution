package typings
package gapiDotClientDotDlpLib.gapiNs.clientNs.dlpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationsResource extends js.Object {
  /** Cancels an operation. Use the `inspect.operations.get` to check whether the cancellation succeeded or the operation completed despite cancellation. */
  def cancel(request: gapiDotClientDotDlpLib.Anon_AccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
  /**
    * Schedules a job scanning content in a Google Cloud Platform data
    * repository.
    */
  def create(request: gapiDotClientDotDlpLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[GoogleLongrunningOperation]
  /** This method is not supported and the server returns `UNIMPLEMENTED`. */
  def delete(request: gapiDotClientDotDlpLib.Anon_AccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
  /**
    * Gets the latest state of a long-running operation.  Clients can use this
    * method to poll the operation result at intervals as recommended by the API
    * service.
    */
  def get(request: gapiDotClientDotDlpLib.Anon_AccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[GoogleLongrunningOperation]
  /** Fetches the list of long running operations. */
  def list(request: gapiDotClientDotDlpLib.Anon_AccesstokenAltBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[GoogleLongrunningListOperationsResponse]
}

object OperationsResource {
  @scala.inline
  def apply(
    cancel: js.Function1[
      gapiDotClientDotDlpLib.Anon_AccesstokenAlt, 
      gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
    ],
    create: js.Function1[
      gapiDotClientDotDlpLib.Anon_Accesstoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[GoogleLongrunningOperation]
    ],
    delete: js.Function1[
      gapiDotClientDotDlpLib.Anon_AccesstokenAlt, 
      gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
    ],
    get: js.Function1[
      gapiDotClientDotDlpLib.Anon_AccesstokenAlt, 
      gapiDotClientLib.gapiNs.clientNs.Request[GoogleLongrunningOperation]
    ],
    list: js.Function1[
      gapiDotClientDotDlpLib.Anon_AccesstokenAltBearertoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[GoogleLongrunningListOperationsResponse]
    ]
  ): OperationsResource = {
    val __obj = js.Dynamic.literal(cancel = cancel, create = create, delete = delete, get = get, list = list)
  
    __obj.asInstanceOf[OperationsResource]
  }
}

