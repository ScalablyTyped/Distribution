package typings.gapiDotClientDotResourceviews.gapi.client.resourceviews

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotResourceviews.Anon_Alt
import typings.gapiDotClientDotResourceviews.Anon_AltFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoneOperationsResource extends js.Object {
  /** Retrieves the specified zone-specific operation resource. */
  def get(request: Anon_Alt): Request[Operation]
  /** Retrieves the list of operation resources contained within the specified zone. */
  def list(request: Anon_AltFields): Request[OperationList]
}

object ZoneOperationsResource {
  @scala.inline
  def apply(get: Anon_Alt => Request[Operation], list: Anon_AltFields => Request[OperationList]): ZoneOperationsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[ZoneOperationsResource]
  }
}

