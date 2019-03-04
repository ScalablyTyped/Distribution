package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalOperationsResource extends js.Object {
  /** Retrieves an aggregated list of all operations. */
  def aggregatedList(request: gapiDotClientDotComputeLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[OperationAggregatedList]
  /** Deletes the specified Operations resource. */
  def delete(request: gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenOperation): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Retrieves the specified Operations resource. Get a list of operations by making a list() request. */
  def get(request: gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenOperation): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Retrieves a list of Operation resources contained within the specified project. */
  def list(request: gapiDotClientDotComputeLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[OperationList]
}

object GlobalOperationsResource {
  @scala.inline
  def apply(
    aggregatedList: js.Function1[
      gapiDotClientDotComputeLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[OperationAggregatedList]
    ],
    delete: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenOperation, 
      gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
    ],
    get: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenOperation, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    list: js.Function1[
      gapiDotClientDotComputeLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[OperationList]
    ]
  ): GlobalOperationsResource = {
    val __obj = js.Dynamic.literal(aggregatedList = aggregatedList, delete = delete, get = get, list = list)
  
    __obj.asInstanceOf[GlobalOperationsResource]
  }
}

