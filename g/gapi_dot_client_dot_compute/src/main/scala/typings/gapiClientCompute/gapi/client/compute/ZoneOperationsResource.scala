package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.gapiClientCompute.anon.Fields
import typings.gapiClientCompute.anon.OperationPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoneOperationsResource extends js.Object {
  /** Deletes the specified zone-specific Operations resource. */
  def delete(request: OperationPrettyPrint): Request[Unit]
  /** Retrieves the specified zone-specific Operations resource. */
  def get(request: OperationPrettyPrint): Request[Operation]
  /** Retrieves a list of Operation resources contained within the specified zone. */
  def list(request: Fields): Request[OperationList]
}

object ZoneOperationsResource {
  @scala.inline
  def apply(
    delete: OperationPrettyPrint => Request[Unit],
    get: OperationPrettyPrint => Request[Operation],
    list: Fields => Request[OperationList]
  ): ZoneOperationsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[ZoneOperationsResource]
  }
}

