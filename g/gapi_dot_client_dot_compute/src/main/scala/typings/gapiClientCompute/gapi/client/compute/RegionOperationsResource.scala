package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientCompute.AnonFilter
import typings.gapiClientCompute.AnonOauthtokenOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegionOperationsResource extends js.Object {
  /** Deletes the specified region-specific Operations resource. */
  def delete(request: AnonOauthtokenOperation): Request_[Unit]
  /** Retrieves the specified region-specific Operations resource. */
  def get(request: AnonOauthtokenOperation): Request_[Operation]
  /** Retrieves a list of Operation resources contained within the specified region. */
  def list(request: AnonFilter): Request_[OperationList]
}

object RegionOperationsResource {
  @scala.inline
  def apply(
    delete: AnonOauthtokenOperation => Request_[Unit],
    get: AnonOauthtokenOperation => Request_[Operation],
    list: AnonFilter => Request_[OperationList]
  ): RegionOperationsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[RegionOperationsResource]
  }
}

