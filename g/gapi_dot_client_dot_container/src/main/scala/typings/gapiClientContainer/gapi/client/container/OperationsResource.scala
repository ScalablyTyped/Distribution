package typings.gapiClientContainer.gapi.client.container

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientContainer.AnonBearertoken
import typings.gapiClientContainer.AnonCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationsResource extends js.Object {
  /** Cancels the specified operation. */
  def cancel(request: AnonCallback): Request_[js.Object]
  /** Gets the specified operation. */
  def get(request: AnonCallback): Request_[Operation]
  /** Lists all operations in a project in a specific zone or all zones. */
  def list(request: AnonBearertoken): Request_[ListOperationsResponse]
}

object OperationsResource {
  @scala.inline
  def apply(
    cancel: AnonCallback => Request_[js.Object],
    get: AnonCallback => Request_[Operation],
    list: AnonBearertoken => Request_[ListOperationsResponse]
  ): OperationsResource = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction1(cancel), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[OperationsResource]
  }
}

