package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientCompute.AnonAltAutoscaler
import typings.gapiClientCompute.AnonAutoscalerFields
import typings.gapiClientCompute.AnonFilter
import typings.gapiClientCompute.AnonPrettyPrint
import typings.gapiClientCompute.AnonPrettyPrintProject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegionAutoscalersResource extends js.Object {
  /** Deletes the specified autoscaler. */
  def delete(request: AnonAltAutoscaler): Request_[Operation]
  /** Returns the specified autoscaler. */
  def get(request: AnonAutoscalerFields): Request_[Autoscaler]
  /** Creates an autoscaler in the specified project using the data included in the request. */
  def insert(request: AnonPrettyPrint): Request_[Operation]
  /** Retrieves a list of autoscalers contained within the specified region. */
  def list(request: AnonFilter): Request_[RegionAutoscalerList]
  /**
    * Updates an autoscaler in the specified project using the data included in the request. This method supports PATCH semantics and uses the JSON merge
    * patch format and processing rules.
    */
  def patch(request: AnonPrettyPrintProject): Request_[Operation]
  /** Updates an autoscaler in the specified project using the data included in the request. */
  def update(request: AnonPrettyPrintProject): Request_[Operation]
}

object RegionAutoscalersResource {
  @scala.inline
  def apply(
    delete: AnonAltAutoscaler => Request_[Operation],
    get: AnonAutoscalerFields => Request_[Autoscaler],
    insert: AnonPrettyPrint => Request_[Operation],
    list: AnonFilter => Request_[RegionAutoscalerList],
    patch: AnonPrettyPrintProject => Request_[Operation],
    update: AnonPrettyPrintProject => Request_[Operation]
  ): RegionAutoscalersResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[RegionAutoscalersResource]
  }
}

