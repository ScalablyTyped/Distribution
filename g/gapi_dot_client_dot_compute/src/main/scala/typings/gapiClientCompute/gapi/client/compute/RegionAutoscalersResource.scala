package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.gapiClientCompute.anon.AltAutoscaler
import typings.gapiClientCompute.anon.AutoscalerFields
import typings.gapiClientCompute.anon.Filter
import typings.gapiClientCompute.anon.PrettyPrint
import typings.gapiClientCompute.anon.PrettyPrintProject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegionAutoscalersResource extends js.Object {
  /** Deletes the specified autoscaler. */
  def delete(request: AltAutoscaler): Request[Operation]
  /** Returns the specified autoscaler. */
  def get(request: AutoscalerFields): Request[Autoscaler]
  /** Creates an autoscaler in the specified project using the data included in the request. */
  def insert(request: PrettyPrint): Request[Operation]
  /** Retrieves a list of autoscalers contained within the specified region. */
  def list(request: Filter): Request[RegionAutoscalerList]
  /**
    * Updates an autoscaler in the specified project using the data included in the request. This method supports PATCH semantics and uses the JSON merge
    * patch format and processing rules.
    */
  def patch(request: PrettyPrintProject): Request[Operation]
  /** Updates an autoscaler in the specified project using the data included in the request. */
  def update(request: PrettyPrintProject): Request[Operation]
}

object RegionAutoscalersResource {
  @scala.inline
  def apply(
    delete: AltAutoscaler => Request[Operation],
    get: AutoscalerFields => Request[Autoscaler],
    insert: PrettyPrint => Request[Operation],
    list: Filter => Request[RegionAutoscalerList],
    patch: PrettyPrintProject => Request[Operation],
    update: PrettyPrintProject => Request[Operation]
  ): RegionAutoscalersResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[RegionAutoscalersResource]
  }
}

