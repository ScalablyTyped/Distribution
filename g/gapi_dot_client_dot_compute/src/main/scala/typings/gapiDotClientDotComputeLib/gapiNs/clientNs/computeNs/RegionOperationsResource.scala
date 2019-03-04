package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegionOperationsResource extends js.Object {
  /** Deletes the specified region-specific Operations resource. */
  def delete(request: gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenOperationPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Retrieves the specified region-specific Operations resource. */
  def get(request: gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenOperationPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Retrieves a list of Operation resources contained within the specified region. */
  def list(request: gapiDotClientDotComputeLib.Anon_AltFieldsFilter): gapiDotClientLib.gapiNs.clientNs.Request[OperationList]
}

object RegionOperationsResource {
  @scala.inline
  def apply(
    delete: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenOperationPrettyPrint, 
      gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
    ],
    get: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenOperationPrettyPrint, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    list: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsFilter, 
      gapiDotClientLib.gapiNs.clientNs.Request[OperationList]
    ]
  ): RegionOperationsResource = {
    val __obj = js.Dynamic.literal(delete = delete, get = get, list = list)
  
    __obj.asInstanceOf[RegionOperationsResource]
  }
}

