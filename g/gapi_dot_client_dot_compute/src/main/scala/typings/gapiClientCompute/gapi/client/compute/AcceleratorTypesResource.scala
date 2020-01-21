package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientCompute.AnonAcceleratorType
import typings.gapiClientCompute.AnonAlt
import typings.gapiClientCompute.AnonAltFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AcceleratorTypesResource extends js.Object {
  /** Retrieves an aggregated list of accelerator types. */
  def aggregatedList(request: AnonAlt): Request_[AcceleratorTypeAggregatedList]
  /** Returns the specified accelerator type. Get a list of available accelerator types by making a list() request. */
  def get(request: AnonAcceleratorType): Request_[AcceleratorType]
  /** Retrieves a list of accelerator types available to the specified project. */
  def list(request: AnonAltFields): Request_[AcceleratorTypeList]
}

object AcceleratorTypesResource {
  @scala.inline
  def apply(
    aggregatedList: AnonAlt => Request_[AcceleratorTypeAggregatedList],
    get: AnonAcceleratorType => Request_[AcceleratorType],
    list: AnonAltFields => Request_[AcceleratorTypeList]
  ): AcceleratorTypesResource = {
    val __obj = js.Dynamic.literal(aggregatedList = js.Any.fromFunction1(aggregatedList), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[AcceleratorTypesResource]
  }
}

