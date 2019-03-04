package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegionInstanceGroupsResource extends js.Object {
  /** Returns the specified instance group resource. */
  def get(request: gapiDotClientDotComputeLib.Anon_AltFieldsInstanceGroupKeyOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[InstanceGroup]
  /** Retrieves the list of instance group resources contained within the specified region. */
  def list(request: gapiDotClientDotComputeLib.Anon_AltFieldsFilter): gapiDotClientLib.gapiNs.clientNs.Request[RegionInstanceGroupList]
  /**
    * Lists the instances in the specified instance group and displays information about the named ports. Depending on the specified options, this method can
    * list all instances or only the instances that are running.
    */
  def listInstances(request: gapiDotClientDotComputeLib.Anon_AltFieldsFilterInstanceGroupKey): gapiDotClientLib.gapiNs.clientNs.Request[RegionInstanceGroupsListInstances]
  /** Sets the named ports for the specified regional instance group. */
  def setNamedPorts(request: gapiDotClientDotComputeLib.Anon_AltFieldsInstanceGroupKeyOauthtokenPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
}

object RegionInstanceGroupsResource {
  @scala.inline
  def apply(
    get: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsInstanceGroupKeyOauthtoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[InstanceGroup]
    ],
    list: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsFilter, 
      gapiDotClientLib.gapiNs.clientNs.Request[RegionInstanceGroupList]
    ],
    listInstances: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsFilterInstanceGroupKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[RegionInstanceGroupsListInstances]
    ],
    setNamedPorts: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsInstanceGroupKeyOauthtokenPrettyPrint, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ]
  ): RegionInstanceGroupsResource = {
    val __obj = js.Dynamic.literal(get = get, list = list, listInstances = listInstances, setNamedPorts = setNamedPorts)
  
    __obj.asInstanceOf[RegionInstanceGroupsResource]
  }
}

