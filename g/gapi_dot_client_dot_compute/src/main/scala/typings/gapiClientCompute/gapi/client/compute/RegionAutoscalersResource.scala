package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientCompute.AnonAltAutoscalerFieldsKeyOauthtoken
import typings.gapiClientCompute.AnonAltAutoscalerFieldsKeyOauthtokenPrettyPrint
import typings.gapiClientCompute.AnonAltAutoscalerFieldsKeyOauthtokenPrettyPrintProject
import typings.gapiClientCompute.AnonAltFieldsFilter
import typings.gapiClientCompute.AnonAltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegionAutoscalersResource extends js.Object {
  /** Deletes the specified autoscaler. */
  def delete(request: AnonAltAutoscalerFieldsKeyOauthtoken): Request_[Operation]
  /** Returns the specified autoscaler. */
  def get(request: AnonAltAutoscalerFieldsKeyOauthtokenPrettyPrint): Request_[Autoscaler]
  /** Creates an autoscaler in the specified project using the data included in the request. */
  def insert(request: AnonAltFieldsKey): Request_[Operation]
  /** Retrieves a list of autoscalers contained within the specified region. */
  def list(request: AnonAltFieldsFilter): Request_[RegionAutoscalerList]
  /**
    * Updates an autoscaler in the specified project using the data included in the request. This method supports PATCH semantics and uses the JSON merge
    * patch format and processing rules.
    */
  def patch(request: AnonAltAutoscalerFieldsKeyOauthtokenPrettyPrintProject): Request_[Operation]
  /** Updates an autoscaler in the specified project using the data included in the request. */
  def update(request: AnonAltAutoscalerFieldsKeyOauthtokenPrettyPrintProject): Request_[Operation]
}

object RegionAutoscalersResource {
  @scala.inline
  def apply(
    delete: AnonAltAutoscalerFieldsKeyOauthtoken => Request_[Operation],
    get: AnonAltAutoscalerFieldsKeyOauthtokenPrettyPrint => Request_[Autoscaler],
    insert: AnonAltFieldsKey => Request_[Operation],
    list: AnonAltFieldsFilter => Request_[RegionAutoscalerList],
    patch: AnonAltAutoscalerFieldsKeyOauthtokenPrettyPrintProject => Request_[Operation],
    update: AnonAltAutoscalerFieldsKeyOauthtokenPrettyPrintProject => Request_[Operation]
  ): RegionAutoscalersResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[RegionAutoscalersResource]
  }
}

