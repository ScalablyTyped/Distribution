package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientCompute.AnonAltFieldsFilter
import typings.gapiClientCompute.AnonAltFieldsKeyOauthtokenOperationPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegionOperationsResource extends js.Object {
  /** Deletes the specified region-specific Operations resource. */
  def delete(request: AnonAltFieldsKeyOauthtokenOperationPrettyPrint): Request_[Unit]
  /** Retrieves the specified region-specific Operations resource. */
  def get(request: AnonAltFieldsKeyOauthtokenOperationPrettyPrint): Request_[Operation]
  /** Retrieves a list of Operation resources contained within the specified region. */
  def list(request: AnonAltFieldsFilter): Request_[OperationList]
}

object RegionOperationsResource {
  @scala.inline
  def apply(
    delete: AnonAltFieldsKeyOauthtokenOperationPrettyPrint => Request_[Unit],
    get: AnonAltFieldsKeyOauthtokenOperationPrettyPrint => Request_[Operation],
    list: AnonAltFieldsFilter => Request_[OperationList]
  ): RegionOperationsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[RegionOperationsResource]
  }
}

