package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MachineTypesResource extends js.Object {
  /** Retrieves an aggregated list of machine types. */
  def aggregatedList(request: gapiDotClientDotComputeLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[MachineTypeAggregatedList]
  /** Returns the specified machine type. Get a list of available machine types by making a list() request. */
  def get(request: gapiDotClientDotComputeLib.Anon_AltFieldsKeyMachineType): gapiDotClientLib.gapiNs.clientNs.Request[MachineType]
  /** Retrieves a list of machine types available to the specified project. */
  def list(request: gapiDotClientDotComputeLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[MachineTypeList]
}

object MachineTypesResource {
  @scala.inline
  def apply(
    aggregatedList: js.Function1[
      gapiDotClientDotComputeLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[MachineTypeAggregatedList]
    ],
    get: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsKeyMachineType, 
      gapiDotClientLib.gapiNs.clientNs.Request[MachineType]
    ],
    list: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[MachineTypeList]
    ]
  ): MachineTypesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("aggregatedList")(aggregatedList)
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("list")(list)
    __obj.asInstanceOf[MachineTypesResource]
  }
}

