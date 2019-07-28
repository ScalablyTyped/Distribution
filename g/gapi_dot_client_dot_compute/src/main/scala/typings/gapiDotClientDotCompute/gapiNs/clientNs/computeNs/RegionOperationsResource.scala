package typings.gapiDotClientDotCompute.gapiNs.clientNs.computeNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotCompute.Anon_AltFieldsFilter
import typings.gapiDotClientDotCompute.Anon_AltFieldsKeyOauthtokenOperationPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegionOperationsResource extends js.Object {
  /** Deletes the specified region-specific Operations resource. */
  def delete(request: Anon_AltFieldsKeyOauthtokenOperationPrettyPrint): Request[Unit]
  /** Retrieves the specified region-specific Operations resource. */
  def get(request: Anon_AltFieldsKeyOauthtokenOperationPrettyPrint): Request[Operation]
  /** Retrieves a list of Operation resources contained within the specified region. */
  def list(request: Anon_AltFieldsFilter): Request[OperationList]
}

object RegionOperationsResource {
  @scala.inline
  def apply(
    delete: Anon_AltFieldsKeyOauthtokenOperationPrettyPrint => Request[Unit],
    get: Anon_AltFieldsKeyOauthtokenOperationPrettyPrint => Request[Operation],
    list: Anon_AltFieldsFilter => Request[OperationList]
  ): RegionOperationsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[RegionOperationsResource]
  }
}

