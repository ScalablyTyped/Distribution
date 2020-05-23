package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.gapiClientCompute.anon.Alt
import typings.gapiClientCompute.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MachineTypesResource extends js.Object {
  /** Retrieves an aggregated list of machine types. */
  def aggregatedList(request: Alt): Request[MachineTypeAggregatedList]
  /** Returns the specified machine type. Get a list of available machine types by making a list() request. */
  def get(request: typings.gapiClientCompute.anon.MachineType): Request[MachineType]
  /** Retrieves a list of machine types available to the specified project. */
  def list(request: Fields): Request[MachineTypeList]
}

object MachineTypesResource {
  @scala.inline
  def apply(
    aggregatedList: Alt => Request[MachineTypeAggregatedList],
    get: typings.gapiClientCompute.anon.MachineType => Request[MachineType],
    list: Fields => Request[MachineTypeList]
  ): MachineTypesResource = {
    val __obj = js.Dynamic.literal(aggregatedList = js.Any.fromFunction1(aggregatedList), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[MachineTypesResource]
  }
}

