package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MachineTypesResource extends js.Object {
  /** Retrieves an aggregated list of machine types. */
  def aggregatedList(request: gapiDotClientDotComputeLib.Anon_Project): gapiDotClientLib.gapiNs.clientNs.Request[MachineTypeAggregatedList]
  /** Returns the specified machine type. Get a list of available machine types by making a list() request. */
  def get(request: gapiDotClientDotComputeLib.Anon_ProjectPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[MachineType]
  /** Retrieves a list of machine types available to the specified project. */
  def list(request: gapiDotClientDotComputeLib.Anon_ProjectMaxResults): gapiDotClientLib.gapiNs.clientNs.Request[MachineTypeList]
}

