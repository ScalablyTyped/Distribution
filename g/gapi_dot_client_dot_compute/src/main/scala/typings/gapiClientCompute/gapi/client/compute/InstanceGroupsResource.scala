package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientCompute.AnonAlt
import typings.gapiClientCompute.AnonAltFields
import typings.gapiClientCompute.AnonAltFieldsFilterInstanceGroup
import typings.gapiClientCompute.AnonAltFieldsInstanceGroup
import typings.gapiClientCompute.AnonAltFieldsInstanceGroupKey
import typings.gapiClientCompute.AnonAltFieldsKeyOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceGroupsResource extends js.Object {
  /**
    * Adds a list of instances to the specified instance group. All of the instances in the instance group must be in the same network/subnetwork. Read
    * Adding instances for more information.
    */
  def addInstances(request: AnonAltFieldsInstanceGroup): Request_[Operation]
  /** Retrieves the list of instance groups and sorts them by zone. */
  def aggregatedList(request: AnonAlt): Request_[InstanceGroupAggregatedList]
  /**
    * Deletes the specified instance group. The instances in the group are not deleted. Note that instance group must not belong to a backend service. Read
    * Deleting an instance group for more information.
    */
  def delete(request: AnonAltFieldsInstanceGroup): Request_[Operation]
  /** Returns the specified instance group. Get a list of available instance groups by making a list() request. */
  def get(request: AnonAltFieldsInstanceGroupKey): Request_[InstanceGroup]
  /** Creates an instance group in the specified project using the parameters that are included in the request. */
  def insert(request: AnonAltFieldsKeyOauthtoken): Request_[Operation]
  /** Retrieves the list of instance groups that are located in the specified project and zone. */
  def list(request: AnonAltFields): Request_[InstanceGroupList]
  /** Lists the instances in the specified instance group. */
  def listInstances(request: AnonAltFieldsFilterInstanceGroup): Request_[InstanceGroupsListInstances]
  /**
    * Removes one or more instances from the specified instance group, but does not delete those instances.
    *
    * If the group is part of a backend service that has enabled connection draining, it can take up to 60 seconds after the connection draining duration
    * before the VM instance is removed or deleted.
    */
  def removeInstances(request: AnonAltFieldsInstanceGroup): Request_[Operation]
  /** Sets the named ports for the specified instance group. */
  def setNamedPorts(request: AnonAltFieldsInstanceGroup): Request_[Operation]
}

object InstanceGroupsResource {
  @scala.inline
  def apply(
    addInstances: AnonAltFieldsInstanceGroup => Request_[Operation],
    aggregatedList: AnonAlt => Request_[InstanceGroupAggregatedList],
    delete: AnonAltFieldsInstanceGroup => Request_[Operation],
    get: AnonAltFieldsInstanceGroupKey => Request_[InstanceGroup],
    insert: AnonAltFieldsKeyOauthtoken => Request_[Operation],
    list: AnonAltFields => Request_[InstanceGroupList],
    listInstances: AnonAltFieldsFilterInstanceGroup => Request_[InstanceGroupsListInstances],
    removeInstances: AnonAltFieldsInstanceGroup => Request_[Operation],
    setNamedPorts: AnonAltFieldsInstanceGroup => Request_[Operation]
  ): InstanceGroupsResource = {
    val __obj = js.Dynamic.literal(addInstances = js.Any.fromFunction1(addInstances), aggregatedList = js.Any.fromFunction1(aggregatedList), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), listInstances = js.Any.fromFunction1(listInstances), removeInstances = js.Any.fromFunction1(removeInstances), setNamedPorts = js.Any.fromFunction1(setNamedPorts))
  
    __obj.asInstanceOf[InstanceGroupsResource]
  }
}

