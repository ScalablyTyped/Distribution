package typings.gapiClientContainer.gapi.client.container

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientContainer.AnonAccesstokenAltBearertoken
import typings.gapiClientContainer.AnonAccesstokenAltBearertokenCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationsResource extends js.Object {
  /** Cancels the specified operation. */
  def cancel(request: AnonAccesstokenAltBearertokenCallback): Request_[js.Object]
  /** Gets the specified operation. */
  def get(request: AnonAccesstokenAltBearertokenCallback): Request_[Operation]
  /** Lists all operations in a project in a specific zone or all zones. */
  def list(request: AnonAccesstokenAltBearertoken): Request_[ListOperationsResponse]
}

object OperationsResource {
  @scala.inline
  def apply(
    cancel: AnonAccesstokenAltBearertokenCallback => Request_[js.Object],
    get: AnonAccesstokenAltBearertokenCallback => Request_[Operation],
    list: AnonAccesstokenAltBearertoken => Request_[ListOperationsResponse]
  ): OperationsResource = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction1(cancel), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[OperationsResource]
  }
}

