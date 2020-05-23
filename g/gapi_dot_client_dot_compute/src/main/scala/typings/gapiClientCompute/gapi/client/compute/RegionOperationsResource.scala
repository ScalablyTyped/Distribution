package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.gapiClientCompute.anon.Filter
import typings.gapiClientCompute.anon.OauthtokenOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegionOperationsResource extends js.Object {
  /** Deletes the specified region-specific Operations resource. */
  def delete(request: OauthtokenOperation): Request[Unit]
  /** Retrieves the specified region-specific Operations resource. */
  def get(request: OauthtokenOperation): Request[Operation]
  /** Retrieves a list of Operation resources contained within the specified region. */
  def list(request: Filter): Request[OperationList]
}

object RegionOperationsResource {
  @scala.inline
  def apply(
    delete: OauthtokenOperation => Request[Unit],
    get: OauthtokenOperation => Request[Operation],
    list: Filter => Request[OperationList]
  ): RegionOperationsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[RegionOperationsResource]
  }
}

