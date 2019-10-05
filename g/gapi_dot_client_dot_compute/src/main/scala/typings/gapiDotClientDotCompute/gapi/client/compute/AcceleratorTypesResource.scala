package typings.gapiDotClientDotCompute.gapi.client.compute

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotCompute.Anon_AcceleratorType
import typings.gapiDotClientDotCompute.Anon_Alt
import typings.gapiDotClientDotCompute.Anon_AltFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AcceleratorTypesResource extends js.Object {
  /** Retrieves an aggregated list of accelerator types. */
  def aggregatedList(request: Anon_Alt): Request[AcceleratorTypeAggregatedList]
  /** Returns the specified accelerator type. Get a list of available accelerator types by making a list() request. */
  def get(request: Anon_AcceleratorType): Request[AcceleratorType]
  /** Retrieves a list of accelerator types available to the specified project. */
  def list(request: Anon_AltFields): Request[AcceleratorTypeList]
}

object AcceleratorTypesResource {
  @scala.inline
  def apply(
    aggregatedList: Anon_Alt => Request[AcceleratorTypeAggregatedList],
    get: Anon_AcceleratorType => Request[AcceleratorType],
    list: Anon_AltFields => Request[AcceleratorTypeList]
  ): AcceleratorTypesResource = {
    val __obj = js.Dynamic.literal(aggregatedList = js.Any.fromFunction1(aggregatedList), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[AcceleratorTypesResource]
  }
}

