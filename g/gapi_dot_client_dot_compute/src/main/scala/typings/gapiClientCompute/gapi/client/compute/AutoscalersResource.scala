package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.gapiClientCompute.anon.Alt
import typings.gapiClientCompute.anon.Fields
import typings.gapiClientCompute.anon.QuotaUser
import typings.gapiClientCompute.anon.RequestId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoscalersResource extends js.Object {
  /** Retrieves an aggregated list of autoscalers. */
  def aggregatedList(request: Alt): Request[AutoscalerAggregatedList]
  /** Deletes the specified autoscaler. */
  def delete(request: typings.gapiClientCompute.anon.Autoscaler): Request[Operation]
  /** Returns the specified autoscaler resource. Get a list of available autoscalers by making a list() request. */
  def get(request: typings.gapiClientCompute.anon.Project): Request[Autoscaler]
  /** Creates an autoscaler in the specified project using the data included in the request. */
  def insert(request: QuotaUser): Request[Operation]
  /** Retrieves a list of autoscalers contained within the specified zone. */
  def list(request: Fields): Request[AutoscalerList]
  /**
    * Updates an autoscaler in the specified project using the data included in the request. This method supports PATCH semantics and uses the JSON merge
    * patch format and processing rules.
    */
  def patch(request: RequestId): Request[Operation]
  /** Updates an autoscaler in the specified project using the data included in the request. */
  def update(request: RequestId): Request[Operation]
}

object AutoscalersResource {
  @scala.inline
  def apply(
    aggregatedList: Alt => Request[AutoscalerAggregatedList],
    delete: typings.gapiClientCompute.anon.Autoscaler => Request[Operation],
    get: typings.gapiClientCompute.anon.Project => Request[Autoscaler],
    insert: QuotaUser => Request[Operation],
    list: Fields => Request[AutoscalerList],
    patch: RequestId => Request[Operation],
    update: RequestId => Request[Operation]
  ): AutoscalersResource = {
    val __obj = js.Dynamic.literal(aggregatedList = js.Any.fromFunction1(aggregatedList), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[AutoscalersResource]
  }
}

