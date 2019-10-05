package typings.gapiDotClientDotCompute.gapi.client.compute

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotCompute.Anon_Alt
import typings.gapiDotClientDotCompute.Anon_AltFields
import typings.gapiDotClientDotCompute.Anon_AltFieldsFilterInstanceGroup
import typings.gapiDotClientDotCompute.Anon_AltFieldsInstanceGroup
import typings.gapiDotClientDotCompute.Anon_AltFieldsInstanceGroupKey
import typings.gapiDotClientDotCompute.Anon_AltFieldsKeyOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceGroupsResource extends js.Object {
  /**
    * Adds a list of instances to the specified instance group. All of the instances in the instance group must be in the same network/subnetwork. Read
    * Adding instances for more information.
    */
  def addInstances(request: Anon_AltFieldsInstanceGroup): Request[Operation]
  /** Retrieves the list of instance groups and sorts them by zone. */
  def aggregatedList(request: Anon_Alt): Request[InstanceGroupAggregatedList]
  /**
    * Deletes the specified instance group. The instances in the group are not deleted. Note that instance group must not belong to a backend service. Read
    * Deleting an instance group for more information.
    */
  def delete(request: Anon_AltFieldsInstanceGroup): Request[Operation]
  /** Returns the specified instance group. Get a list of available instance groups by making a list() request. */
  def get(request: Anon_AltFieldsInstanceGroupKey): Request[InstanceGroup]
  /** Creates an instance group in the specified project using the parameters that are included in the request. */
  def insert(request: Anon_AltFieldsKeyOauthtoken): Request[Operation]
  /** Retrieves the list of instance groups that are located in the specified project and zone. */
  def list(request: Anon_AltFields): Request[InstanceGroupList]
  /** Lists the instances in the specified instance group. */
  def listInstances(request: Anon_AltFieldsFilterInstanceGroup): Request[InstanceGroupsListInstances]
  /**
    * Removes one or more instances from the specified instance group, but does not delete those instances.
    *
    * If the group is part of a backend service that has enabled connection draining, it can take up to 60 seconds after the connection draining duration
    * before the VM instance is removed or deleted.
    */
  def removeInstances(request: Anon_AltFieldsInstanceGroup): Request[Operation]
  /** Sets the named ports for the specified instance group. */
  def setNamedPorts(request: Anon_AltFieldsInstanceGroup): Request[Operation]
}

object InstanceGroupsResource {
  @scala.inline
  def apply(
    addInstances: Anon_AltFieldsInstanceGroup => Request[Operation],
    aggregatedList: Anon_Alt => Request[InstanceGroupAggregatedList],
    delete: Anon_AltFieldsInstanceGroup => Request[Operation],
    get: Anon_AltFieldsInstanceGroupKey => Request[InstanceGroup],
    insert: Anon_AltFieldsKeyOauthtoken => Request[Operation],
    list: Anon_AltFields => Request[InstanceGroupList],
    listInstances: Anon_AltFieldsFilterInstanceGroup => Request[InstanceGroupsListInstances],
    removeInstances: Anon_AltFieldsInstanceGroup => Request[Operation],
    setNamedPorts: Anon_AltFieldsInstanceGroup => Request[Operation]
  ): InstanceGroupsResource = {
    val __obj = js.Dynamic.literal(addInstances = js.Any.fromFunction1(addInstances), aggregatedList = js.Any.fromFunction1(aggregatedList), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), listInstances = js.Any.fromFunction1(listInstances), removeInstances = js.Any.fromFunction1(removeInstances), setNamedPorts = js.Any.fromFunction1(setNamedPorts))
  
    __obj.asInstanceOf[InstanceGroupsResource]
  }
}

