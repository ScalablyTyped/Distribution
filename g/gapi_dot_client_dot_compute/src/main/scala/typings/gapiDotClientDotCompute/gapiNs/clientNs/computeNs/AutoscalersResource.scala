package typings.gapiDotClientDotCompute.gapiNs.clientNs.computeNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotCompute.Anon_Alt
import typings.gapiDotClientDotCompute.Anon_AltAutoscaler
import typings.gapiDotClientDotCompute.Anon_AltAutoscalerFields
import typings.gapiDotClientDotCompute.Anon_AltAutoscalerFieldsKey
import typings.gapiDotClientDotCompute.Anon_AltFields
import typings.gapiDotClientDotCompute.Anon_AltFieldsKeyOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoscalersResource extends js.Object {
  /** Retrieves an aggregated list of autoscalers. */
  def aggregatedList(request: Anon_Alt): Request[AutoscalerAggregatedList]
  /** Deletes the specified autoscaler. */
  def delete(request: Anon_AltAutoscaler): Request[Operation]
  /** Returns the specified autoscaler resource. Get a list of available autoscalers by making a list() request. */
  def get(request: Anon_AltAutoscalerFields): Request[Autoscaler]
  /** Creates an autoscaler in the specified project using the data included in the request. */
  def insert(request: Anon_AltFieldsKeyOauthtoken): Request[Operation]
  /** Retrieves a list of autoscalers contained within the specified zone. */
  def list(request: Anon_AltFields): Request[AutoscalerList]
  /**
    * Updates an autoscaler in the specified project using the data included in the request. This method supports PATCH semantics and uses the JSON merge
    * patch format and processing rules.
    */
  def patch(request: Anon_AltAutoscalerFieldsKey): Request[Operation]
  /** Updates an autoscaler in the specified project using the data included in the request. */
  def update(request: Anon_AltAutoscalerFieldsKey): Request[Operation]
}

object AutoscalersResource {
  @scala.inline
  def apply(
    aggregatedList: Anon_Alt => Request[AutoscalerAggregatedList],
    delete: Anon_AltAutoscaler => Request[Operation],
    get: Anon_AltAutoscalerFields => Request[Autoscaler],
    insert: Anon_AltFieldsKeyOauthtoken => Request[Operation],
    list: Anon_AltFields => Request[AutoscalerList],
    patch: Anon_AltAutoscalerFieldsKey => Request[Operation],
    update: Anon_AltAutoscalerFieldsKey => Request[Operation]
  ): AutoscalersResource = {
    val __obj = js.Dynamic.literal(aggregatedList = js.Any.fromFunction1(aggregatedList), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[AutoscalersResource]
  }
}

