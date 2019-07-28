package typings.gapiDotClientDotCompute.gapiNs.clientNs.computeNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotCompute.Anon_AltAutoscalerFieldsKeyOauthtoken
import typings.gapiDotClientDotCompute.Anon_AltAutoscalerFieldsKeyOauthtokenPrettyPrint
import typings.gapiDotClientDotCompute.Anon_AltAutoscalerFieldsKeyOauthtokenPrettyPrintProject
import typings.gapiDotClientDotCompute.Anon_AltFieldsFilter
import typings.gapiDotClientDotCompute.Anon_AltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegionAutoscalersResource extends js.Object {
  /** Deletes the specified autoscaler. */
  def delete(request: Anon_AltAutoscalerFieldsKeyOauthtoken): Request[Operation]
  /** Returns the specified autoscaler. */
  def get(request: Anon_AltAutoscalerFieldsKeyOauthtokenPrettyPrint): Request[Autoscaler]
  /** Creates an autoscaler in the specified project using the data included in the request. */
  def insert(request: Anon_AltFieldsKey): Request[Operation]
  /** Retrieves a list of autoscalers contained within the specified region. */
  def list(request: Anon_AltFieldsFilter): Request[RegionAutoscalerList]
  /**
    * Updates an autoscaler in the specified project using the data included in the request. This method supports PATCH semantics and uses the JSON merge
    * patch format and processing rules.
    */
  def patch(request: Anon_AltAutoscalerFieldsKeyOauthtokenPrettyPrintProject): Request[Operation]
  /** Updates an autoscaler in the specified project using the data included in the request. */
  def update(request: Anon_AltAutoscalerFieldsKeyOauthtokenPrettyPrintProject): Request[Operation]
}

object RegionAutoscalersResource {
  @scala.inline
  def apply(
    delete: Anon_AltAutoscalerFieldsKeyOauthtoken => Request[Operation],
    get: Anon_AltAutoscalerFieldsKeyOauthtokenPrettyPrint => Request[Autoscaler],
    insert: Anon_AltFieldsKey => Request[Operation],
    list: Anon_AltFieldsFilter => Request[RegionAutoscalerList],
    patch: Anon_AltAutoscalerFieldsKeyOauthtokenPrettyPrintProject => Request[Operation],
    update: Anon_AltAutoscalerFieldsKeyOauthtokenPrettyPrintProject => Request[Operation]
  ): RegionAutoscalersResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[RegionAutoscalersResource]
  }
}

