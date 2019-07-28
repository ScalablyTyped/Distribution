package typings.gapiDotClientDotCompute.gapiNs.clientNs.computeNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotCompute.Anon_Alt
import typings.gapiDotClientDotCompute.Anon_AltFieldsKeyOauthtokenOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalOperationsResource extends js.Object {
  /** Retrieves an aggregated list of all operations. */
  def aggregatedList(request: Anon_Alt): Request[OperationAggregatedList]
  /** Deletes the specified Operations resource. */
  def delete(request: Anon_AltFieldsKeyOauthtokenOperation): Request[Unit]
  /** Retrieves the specified Operations resource. Get a list of operations by making a list() request. */
  def get(request: Anon_AltFieldsKeyOauthtokenOperation): Request[Operation]
  /** Retrieves a list of Operation resources contained within the specified project. */
  def list(request: Anon_Alt): Request[OperationList]
}

object GlobalOperationsResource {
  @scala.inline
  def apply(
    aggregatedList: Anon_Alt => Request[OperationAggregatedList],
    delete: Anon_AltFieldsKeyOauthtokenOperation => Request[Unit],
    get: Anon_AltFieldsKeyOauthtokenOperation => Request[Operation],
    list: Anon_Alt => Request[OperationList]
  ): GlobalOperationsResource = {
    val __obj = js.Dynamic.literal(aggregatedList = js.Any.fromFunction1(aggregatedList), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[GlobalOperationsResource]
  }
}

