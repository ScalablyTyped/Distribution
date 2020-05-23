package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.gapiClientCompute.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalOperationsResource extends js.Object {
  /** Retrieves an aggregated list of all operations. */
  def aggregatedList(request: Alt): Request[OperationAggregatedList]
  /** Deletes the specified Operations resource. */
  def delete(request: typings.gapiClientCompute.anon.Operation): Request[Unit]
  /** Retrieves the specified Operations resource. Get a list of operations by making a list() request. */
  def get(request: typings.gapiClientCompute.anon.Operation): Request[Operation]
  /** Retrieves a list of Operation resources contained within the specified project. */
  def list(request: Alt): Request[OperationList]
}

object GlobalOperationsResource {
  @scala.inline
  def apply(
    aggregatedList: Alt => Request[OperationAggregatedList],
    delete: typings.gapiClientCompute.anon.Operation => Request[Unit],
    get: typings.gapiClientCompute.anon.Operation => Request[Operation],
    list: Alt => Request[OperationList]
  ): GlobalOperationsResource = {
    val __obj = js.Dynamic.literal(aggregatedList = js.Any.fromFunction1(aggregatedList), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[GlobalOperationsResource]
  }
}

