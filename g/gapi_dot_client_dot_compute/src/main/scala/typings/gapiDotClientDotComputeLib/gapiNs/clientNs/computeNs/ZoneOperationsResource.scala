package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoneOperationsResource extends js.Object {
  /** Deletes the specified zone-specific Operations resource. */
  def delete(request: gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenOperationPrettyPrintProject): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Retrieves the specified zone-specific Operations resource. */
  def get(request: gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenOperationPrettyPrintProject): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Retrieves a list of Operation resources contained within the specified zone. */
  def list(request: gapiDotClientDotComputeLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[OperationList]
}

object ZoneOperationsResource {
  @scala.inline
  def apply(
    delete: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenOperationPrettyPrintProject, 
      gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
    ],
    get: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenOperationPrettyPrintProject, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    list: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[OperationList]
    ]
  ): ZoneOperationsResource = {
    val __obj = js.Dynamic.literal(delete = delete, get = get, list = list)
  
    __obj.asInstanceOf[ZoneOperationsResource]
  }
}

