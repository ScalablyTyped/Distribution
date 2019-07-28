package typings.gapiDotClientDotCompute.gapiNs.clientNs.computeNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotCompute.Anon_Alt
import typings.gapiDotClientDotCompute.Anon_AltFields
import typings.gapiDotClientDotCompute.Anon_AltFieldsKeyMachineType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MachineTypesResource extends js.Object {
  /** Retrieves an aggregated list of machine types. */
  def aggregatedList(request: Anon_Alt): Request[MachineTypeAggregatedList]
  /** Returns the specified machine type. Get a list of available machine types by making a list() request. */
  def get(request: Anon_AltFieldsKeyMachineType): Request[MachineType]
  /** Retrieves a list of machine types available to the specified project. */
  def list(request: Anon_AltFields): Request[MachineTypeList]
}

object MachineTypesResource {
  @scala.inline
  def apply(
    aggregatedList: Anon_Alt => Request[MachineTypeAggregatedList],
    get: Anon_AltFieldsKeyMachineType => Request[MachineType],
    list: Anon_AltFields => Request[MachineTypeList]
  ): MachineTypesResource = {
    val __obj = js.Dynamic.literal(aggregatedList = js.Any.fromFunction1(aggregatedList), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[MachineTypesResource]
  }
}

