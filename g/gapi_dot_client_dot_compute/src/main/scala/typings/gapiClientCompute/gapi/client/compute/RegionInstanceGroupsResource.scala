package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.gapiClientCompute.anon.FieldsFilter
import typings.gapiClientCompute.anon.Filter
import typings.gapiClientCompute.anon.InstanceGroupKey
import typings.gapiClientCompute.anon.RequestIdUserIp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegionInstanceGroupsResource extends js.Object {
  /** Returns the specified instance group resource. */
  def get(request: InstanceGroupKey): Request[InstanceGroup]
  /** Retrieves the list of instance group resources contained within the specified region. */
  def list(request: Filter): Request[RegionInstanceGroupList]
  /**
    * Lists the instances in the specified instance group and displays information about the named ports. Depending on the specified options, this method can
    * list all instances or only the instances that are running.
    */
  def listInstances(request: FieldsFilter): Request[RegionInstanceGroupsListInstances]
  /** Sets the named ports for the specified regional instance group. */
  def setNamedPorts(request: RequestIdUserIp): Request[Operation]
}

object RegionInstanceGroupsResource {
  @scala.inline
  def apply(
    get: InstanceGroupKey => Request[InstanceGroup],
    list: Filter => Request[RegionInstanceGroupList],
    listInstances: FieldsFilter => Request[RegionInstanceGroupsListInstances],
    setNamedPorts: RequestIdUserIp => Request[Operation]
  ): RegionInstanceGroupsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), listInstances = js.Any.fromFunction1(listInstances), setNamedPorts = js.Any.fromFunction1(setNamedPorts))
    __obj.asInstanceOf[RegionInstanceGroupsResource]
  }
}

