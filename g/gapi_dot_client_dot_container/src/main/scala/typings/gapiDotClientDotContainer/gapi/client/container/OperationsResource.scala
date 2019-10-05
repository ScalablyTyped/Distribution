package typings.gapiDotClientDotContainer.gapi.client.container

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotContainer.Anon_AccesstokenAltBearertoken
import typings.gapiDotClientDotContainer.Anon_AccesstokenAltBearertokenCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationsResource extends js.Object {
  /** Cancels the specified operation. */
  def cancel(request: Anon_AccesstokenAltBearertokenCallback): Request[js.Object]
  /** Gets the specified operation. */
  def get(request: Anon_AccesstokenAltBearertokenCallback): Request[Operation]
  /** Lists all operations in a project in a specific zone or all zones. */
  def list(request: Anon_AccesstokenAltBearertoken): Request[ListOperationsResponse]
}

object OperationsResource {
  @scala.inline
  def apply(
    cancel: Anon_AccesstokenAltBearertokenCallback => Request[js.Object],
    get: Anon_AccesstokenAltBearertokenCallback => Request[Operation],
    list: Anon_AccesstokenAltBearertoken => Request[ListOperationsResponse]
  ): OperationsResource = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction1(cancel), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[OperationsResource]
  }
}

