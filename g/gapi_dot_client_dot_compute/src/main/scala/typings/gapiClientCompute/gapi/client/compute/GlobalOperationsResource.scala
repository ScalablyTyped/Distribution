package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientCompute.AnonAlt
import typings.gapiClientCompute.AnonOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalOperationsResource extends js.Object {
  /** Retrieves an aggregated list of all operations. */
  def aggregatedList(request: AnonAlt): Request_[OperationAggregatedList]
  /** Deletes the specified Operations resource. */
  def delete(request: AnonOperation): Request_[Unit]
  /** Retrieves the specified Operations resource. Get a list of operations by making a list() request. */
  def get(request: AnonOperation): Request_[Operation]
  /** Retrieves a list of Operation resources contained within the specified project. */
  def list(request: AnonAlt): Request_[OperationList]
}

object GlobalOperationsResource {
  @scala.inline
  def apply(
    aggregatedList: AnonAlt => Request_[OperationAggregatedList],
    delete: AnonOperation => Request_[Unit],
    get: AnonOperation => Request_[Operation],
    list: AnonAlt => Request_[OperationList]
  ): GlobalOperationsResource = {
    val __obj = js.Dynamic.literal(aggregatedList = js.Any.fromFunction1(aggregatedList), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[GlobalOperationsResource]
  }
}

