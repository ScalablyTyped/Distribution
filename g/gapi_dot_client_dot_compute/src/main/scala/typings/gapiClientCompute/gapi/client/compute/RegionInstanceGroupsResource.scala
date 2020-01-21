package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientCompute.AnonAltFieldsFilter
import typings.gapiClientCompute.AnonAltFieldsFilterInstanceGroupKey
import typings.gapiClientCompute.AnonAltFieldsInstanceGroupKeyOauthtoken
import typings.gapiClientCompute.AnonAltFieldsInstanceGroupKeyOauthtokenPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegionInstanceGroupsResource extends js.Object {
  /** Returns the specified instance group resource. */
  def get(request: AnonAltFieldsInstanceGroupKeyOauthtoken): Request_[InstanceGroup]
  /** Retrieves the list of instance group resources contained within the specified region. */
  def list(request: AnonAltFieldsFilter): Request_[RegionInstanceGroupList]
  /**
    * Lists the instances in the specified instance group and displays information about the named ports. Depending on the specified options, this method can
    * list all instances or only the instances that are running.
    */
  def listInstances(request: AnonAltFieldsFilterInstanceGroupKey): Request_[RegionInstanceGroupsListInstances]
  /** Sets the named ports for the specified regional instance group. */
  def setNamedPorts(request: AnonAltFieldsInstanceGroupKeyOauthtokenPrettyPrint): Request_[Operation]
}

object RegionInstanceGroupsResource {
  @scala.inline
  def apply(
    get: AnonAltFieldsInstanceGroupKeyOauthtoken => Request_[InstanceGroup],
    list: AnonAltFieldsFilter => Request_[RegionInstanceGroupList],
    listInstances: AnonAltFieldsFilterInstanceGroupKey => Request_[RegionInstanceGroupsListInstances],
    setNamedPorts: AnonAltFieldsInstanceGroupKeyOauthtokenPrettyPrint => Request_[Operation]
  ): RegionInstanceGroupsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), listInstances = js.Any.fromFunction1(listInstances), setNamedPorts = js.Any.fromFunction1(setNamedPorts))
  
    __obj.asInstanceOf[RegionInstanceGroupsResource]
  }
}

