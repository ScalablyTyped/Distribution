package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientCompute.AnonAlt
import typings.gapiClientCompute.AnonFields
import typings.gapiClientCompute.AnonMachineType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MachineTypesResource extends js.Object {
  /** Retrieves an aggregated list of machine types. */
  def aggregatedList(request: AnonAlt): Request_[MachineTypeAggregatedList]
  /** Returns the specified machine type. Get a list of available machine types by making a list() request. */
  def get(request: AnonMachineType): Request_[MachineType]
  /** Retrieves a list of machine types available to the specified project. */
  def list(request: AnonFields): Request_[MachineTypeList]
}

object MachineTypesResource {
  @scala.inline
  def apply(
    aggregatedList: AnonAlt => Request_[MachineTypeAggregatedList],
    get: AnonMachineType => Request_[MachineType],
    list: AnonFields => Request_[MachineTypeList]
  ): MachineTypesResource = {
    val __obj = js.Dynamic.literal(aggregatedList = js.Any.fromFunction1(aggregatedList), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[MachineTypesResource]
  }
}

