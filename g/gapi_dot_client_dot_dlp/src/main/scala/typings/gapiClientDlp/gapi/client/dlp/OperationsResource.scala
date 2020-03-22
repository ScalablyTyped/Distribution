package typings.gapiClientDlp.gapi.client.dlp

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDlp.AnonAccesstoken
import typings.gapiClientDlp.AnonAlt
import typings.gapiClientDlp.AnonBearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationsResource extends js.Object {
  /** Cancels an operation. Use the `inspect.operations.get` to check whether the cancellation succeeded or the operation completed despite cancellation. */
  def cancel(request: AnonAlt): Request_[js.Object]
  /**
    * Schedules a job scanning content in a Google Cloud Platform data
    * repository.
    */
  def create(request: AnonAccesstoken): Request_[GoogleLongrunningOperation]
  /** This method is not supported and the server returns `UNIMPLEMENTED`. */
  def delete(request: AnonAlt): Request_[js.Object]
  /**
    * Gets the latest state of a long-running operation.  Clients can use this
    * method to poll the operation result at intervals as recommended by the API
    * service.
    */
  def get(request: AnonAlt): Request_[GoogleLongrunningOperation]
  /** Fetches the list of long running operations. */
  def list(request: AnonBearertoken): Request_[GoogleLongrunningListOperationsResponse]
}

object OperationsResource {
  @scala.inline
  def apply(
    cancel: AnonAlt => Request_[js.Object],
    create: AnonAccesstoken => Request_[GoogleLongrunningOperation],
    delete: AnonAlt => Request_[js.Object],
    get: AnonAlt => Request_[GoogleLongrunningOperation],
    list: AnonBearertoken => Request_[GoogleLongrunningListOperationsResponse]
  ): OperationsResource = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction1(cancel), create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[OperationsResource]
  }
}

