package typings.gapiClientResourceviews.gapi.client.resourceviews

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientResourceviews.AnonAlt
import typings.gapiClientResourceviews.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoneOperationsResource extends js.Object {
  /** Retrieves the specified zone-specific operation resource. */
  def get(request: AnonAlt): Request_[Operation]
  /** Retrieves the list of operation resources contained within the specified zone. */
  def list(request: AnonFields): Request_[OperationList]
}

object ZoneOperationsResource {
  @scala.inline
  def apply(get: AnonAlt => Request_[Operation], list: AnonFields => Request_[OperationList]): ZoneOperationsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[ZoneOperationsResource]
  }
}

