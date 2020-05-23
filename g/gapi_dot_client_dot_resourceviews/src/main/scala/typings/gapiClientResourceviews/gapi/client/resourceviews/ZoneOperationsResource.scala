package typings.gapiClientResourceviews.gapi.client.resourceviews

import typings.gapiClient.gapi.client.Request
import typings.gapiClientResourceviews.anon.Alt
import typings.gapiClientResourceviews.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoneOperationsResource extends js.Object {
  /** Retrieves the specified zone-specific operation resource. */
  def get(request: Alt): Request[Operation]
  /** Retrieves the list of operation resources contained within the specified zone. */
  def list(request: Fields): Request[OperationList]
}

object ZoneOperationsResource {
  @scala.inline
  def apply(get: Alt => Request[Operation], list: Fields => Request[OperationList]): ZoneOperationsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[ZoneOperationsResource]
  }
}

