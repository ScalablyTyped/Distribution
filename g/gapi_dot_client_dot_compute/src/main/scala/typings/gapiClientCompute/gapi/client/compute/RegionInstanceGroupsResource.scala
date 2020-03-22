package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientCompute.AnonFieldsFilter
import typings.gapiClientCompute.AnonFilter
import typings.gapiClientCompute.AnonInstanceGroupKey
import typings.gapiClientCompute.AnonRequestIdUserIp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegionInstanceGroupsResource extends js.Object {
  /** Returns the specified instance group resource. */
  def get(request: AnonInstanceGroupKey): Request_[InstanceGroup]
  /** Retrieves the list of instance group resources contained within the specified region. */
  def list(request: AnonFilter): Request_[RegionInstanceGroupList]
  /**
    * Lists the instances in the specified instance group and displays information about the named ports. Depending on the specified options, this method can
    * list all instances or only the instances that are running.
    */
  def listInstances(request: AnonFieldsFilter): Request_[RegionInstanceGroupsListInstances]
  /** Sets the named ports for the specified regional instance group. */
  def setNamedPorts(request: AnonRequestIdUserIp): Request_[Operation]
}

object RegionInstanceGroupsResource {
  @scala.inline
  def apply(
    get: AnonInstanceGroupKey => Request_[InstanceGroup],
    list: AnonFilter => Request_[RegionInstanceGroupList],
    listInstances: AnonFieldsFilter => Request_[RegionInstanceGroupsListInstances],
    setNamedPorts: AnonRequestIdUserIp => Request_[Operation]
  ): RegionInstanceGroupsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), listInstances = js.Any.fromFunction1(listInstances), setNamedPorts = js.Any.fromFunction1(setNamedPorts))
  
    __obj.asInstanceOf[RegionInstanceGroupsResource]
  }
}

