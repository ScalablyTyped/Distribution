package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.gapiClientCompute.anon.Alt
import typings.gapiClientCompute.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AcceleratorTypesResource extends js.Object {
  /** Retrieves an aggregated list of accelerator types. */
  def aggregatedList(request: Alt): Request[AcceleratorTypeAggregatedList]
  /** Returns the specified accelerator type. Get a list of available accelerator types by making a list() request. */
  def get(request: typings.gapiClientCompute.anon.AcceleratorType): Request[AcceleratorType]
  /** Retrieves a list of accelerator types available to the specified project. */
  def list(request: Fields): Request[AcceleratorTypeList]
}

object AcceleratorTypesResource {
  @scala.inline
  def apply(
    aggregatedList: Alt => Request[AcceleratorTypeAggregatedList],
    get: typings.gapiClientCompute.anon.AcceleratorType => Request[AcceleratorType],
    list: Fields => Request[AcceleratorTypeList]
  ): AcceleratorTypesResource = {
    val __obj = js.Dynamic.literal(aggregatedList = js.Any.fromFunction1(aggregatedList), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[AcceleratorTypesResource]
  }
}

