package typings.gapiClientContainer.gapi.client.container

import typings.gapiClient.gapi.client.Request
import typings.gapiClientContainer.anon.Bearertoken
import typings.gapiClientContainer.anon.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationsResource extends js.Object {
  /** Cancels the specified operation. */
  def cancel(request: Callback): Request[js.Object]
  /** Gets the specified operation. */
  def get(request: Callback): Request[Operation]
  /** Lists all operations in a project in a specific zone or all zones. */
  def list(request: Bearertoken): Request[ListOperationsResponse]
}

object OperationsResource {
  @scala.inline
  def apply(
    cancel: Callback => Request[js.Object],
    get: Callback => Request[Operation],
    list: Bearertoken => Request[ListOperationsResponse]
  ): OperationsResource = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction1(cancel), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[OperationsResource]
  }
}

