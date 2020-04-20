package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientCompute.AnonFields
import typings.gapiClientCompute.AnonOperationPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoneOperationsResource extends js.Object {
  /** Deletes the specified zone-specific Operations resource. */
  def delete(request: AnonOperationPrettyPrint): Request_[Unit]
  /** Retrieves the specified zone-specific Operations resource. */
  def get(request: AnonOperationPrettyPrint): Request_[Operation]
  /** Retrieves a list of Operation resources contained within the specified zone. */
  def list(request: AnonFields): Request_[OperationList]
}

object ZoneOperationsResource {
  @scala.inline
  def apply(
    delete: AnonOperationPrettyPrint => Request_[Unit],
    get: AnonOperationPrettyPrint => Request_[Operation],
    list: AnonFields => Request_[OperationList]
  ): ZoneOperationsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[ZoneOperationsResource]
  }
}

