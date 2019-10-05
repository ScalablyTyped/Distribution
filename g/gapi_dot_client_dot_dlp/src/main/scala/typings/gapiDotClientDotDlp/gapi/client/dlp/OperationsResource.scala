package typings.gapiDotClientDotDlp.gapi.client.dlp

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotDlp.Anon_Accesstoken
import typings.gapiDotClientDotDlp.Anon_AccesstokenAlt
import typings.gapiDotClientDotDlp.Anon_AccesstokenAltBearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationsResource extends js.Object {
  /** Cancels an operation. Use the `inspect.operations.get` to check whether the cancellation succeeded or the operation completed despite cancellation. */
  def cancel(request: Anon_AccesstokenAlt): Request[js.Object]
  /**
    * Schedules a job scanning content in a Google Cloud Platform data
    * repository.
    */
  def create(request: Anon_Accesstoken): Request[GoogleLongrunningOperation]
  /** This method is not supported and the server returns `UNIMPLEMENTED`. */
  def delete(request: Anon_AccesstokenAlt): Request[js.Object]
  /**
    * Gets the latest state of a long-running operation.  Clients can use this
    * method to poll the operation result at intervals as recommended by the API
    * service.
    */
  def get(request: Anon_AccesstokenAlt): Request[GoogleLongrunningOperation]
  /** Fetches the list of long running operations. */
  def list(request: Anon_AccesstokenAltBearertoken): Request[GoogleLongrunningListOperationsResponse]
}

object OperationsResource {
  @scala.inline
  def apply(
    cancel: Anon_AccesstokenAlt => Request[js.Object],
    create: Anon_Accesstoken => Request[GoogleLongrunningOperation],
    delete: Anon_AccesstokenAlt => Request[js.Object],
    get: Anon_AccesstokenAlt => Request[GoogleLongrunningOperation],
    list: Anon_AccesstokenAltBearertoken => Request[GoogleLongrunningListOperationsResponse]
  ): OperationsResource = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction1(cancel), create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[OperationsResource]
  }
}

