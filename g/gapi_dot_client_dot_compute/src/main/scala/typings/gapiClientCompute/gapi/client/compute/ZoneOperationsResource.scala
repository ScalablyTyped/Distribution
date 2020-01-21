package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientCompute.AnonAltFields
import typings.gapiClientCompute.AnonAltFieldsKeyOauthtokenOperationPrettyPrintProject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoneOperationsResource extends js.Object {
  /** Deletes the specified zone-specific Operations resource. */
  def delete(request: AnonAltFieldsKeyOauthtokenOperationPrettyPrintProject): Request_[Unit]
  /** Retrieves the specified zone-specific Operations resource. */
  def get(request: AnonAltFieldsKeyOauthtokenOperationPrettyPrintProject): Request_[Operation]
  /** Retrieves a list of Operation resources contained within the specified zone. */
  def list(request: AnonAltFields): Request_[OperationList]
}

object ZoneOperationsResource {
  @scala.inline
  def apply(
    delete: AnonAltFieldsKeyOauthtokenOperationPrettyPrintProject => Request_[Unit],
    get: AnonAltFieldsKeyOauthtokenOperationPrettyPrintProject => Request_[Operation],
    list: AnonAltFields => Request_[OperationList]
  ): ZoneOperationsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[ZoneOperationsResource]
  }
}

