package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.gapiClientCompute.anon.Alt
import typings.gapiClientCompute.anon.Fields
import typings.gapiClientCompute.anon.FieldsInstanceGroup
import typings.gapiClientCompute.anon.OrderBy_
import typings.gapiClientCompute.anon.QuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceGroupsResource extends js.Object {
  /**
    * Adds a list of instances to the specified instance group. All of the instances in the instance group must be in the same network/subnetwork. Read
    * Adding instances for more information.
    */
  def addInstances(request: typings.gapiClientCompute.anon.InstanceGroup): Request[Operation] = js.native
  /** Retrieves the list of instance groups and sorts them by zone. */
  def aggregatedList(request: Alt): Request[InstanceGroupAggregatedList] = js.native
  /**
    * Deletes the specified instance group. The instances in the group are not deleted. Note that instance group must not belong to a backend service. Read
    * Deleting an instance group for more information.
    */
  def delete(request: typings.gapiClientCompute.anon.InstanceGroup): Request[Operation] = js.native
  /** Returns the specified instance group. Get a list of available instance groups by making a list() request. */
  def get(request: FieldsInstanceGroup): Request[InstanceGroup] = js.native
  /** Creates an instance group in the specified project using the parameters that are included in the request. */
  def insert(request: QuotaUser): Request[Operation] = js.native
  /** Retrieves the list of instance groups that are located in the specified project and zone. */
  def list(request: Fields): Request[InstanceGroupList] = js.native
  /** Lists the instances in the specified instance group. */
  def listInstances(request: OrderBy_): Request[InstanceGroupsListInstances] = js.native
  /**
    * Removes one or more instances from the specified instance group, but does not delete those instances.
    *
    * If the group is part of a backend service that has enabled connection draining, it can take up to 60 seconds after the connection draining duration
    * before the VM instance is removed or deleted.
    */
  def removeInstances(request: typings.gapiClientCompute.anon.InstanceGroup): Request[Operation] = js.native
  /** Sets the named ports for the specified instance group. */
  def setNamedPorts(request: typings.gapiClientCompute.anon.InstanceGroup): Request[Operation] = js.native
}

object InstanceGroupsResource {
  @scala.inline
  def apply(
    addInstances: typings.gapiClientCompute.anon.InstanceGroup => Request[Operation],
    aggregatedList: Alt => Request[InstanceGroupAggregatedList],
    delete: typings.gapiClientCompute.anon.InstanceGroup => Request[Operation],
    get: FieldsInstanceGroup => Request[InstanceGroup],
    insert: QuotaUser => Request[Operation],
    list: Fields => Request[InstanceGroupList],
    listInstances: OrderBy_ => Request[InstanceGroupsListInstances],
    removeInstances: typings.gapiClientCompute.anon.InstanceGroup => Request[Operation],
    setNamedPorts: typings.gapiClientCompute.anon.InstanceGroup => Request[Operation]
  ): InstanceGroupsResource = {
    val __obj = js.Dynamic.literal(addInstances = js.Any.fromFunction1(addInstances), aggregatedList = js.Any.fromFunction1(aggregatedList), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), listInstances = js.Any.fromFunction1(listInstances), removeInstances = js.Any.fromFunction1(removeInstances), setNamedPorts = js.Any.fromFunction1(setNamedPorts))
    __obj.asInstanceOf[InstanceGroupsResource]
  }
  @scala.inline
  implicit class InstanceGroupsResourceOps[Self <: InstanceGroupsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddInstances(value: typings.gapiClientCompute.anon.InstanceGroup => Request[Operation]): Self = this.set("addInstances", js.Any.fromFunction1(value))
    @scala.inline
    def setAggregatedList(value: Alt => Request[InstanceGroupAggregatedList]): Self = this.set("aggregatedList", js.Any.fromFunction1(value))
    @scala.inline
    def setDelete(value: typings.gapiClientCompute.anon.InstanceGroup => Request[Operation]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: FieldsInstanceGroup => Request[InstanceGroup]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: QuotaUser => Request[Operation]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Fields => Request[InstanceGroupList]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setListInstances(value: OrderBy_ => Request[InstanceGroupsListInstances]): Self = this.set("listInstances", js.Any.fromFunction1(value))
    @scala.inline
    def setRemoveInstances(value: typings.gapiClientCompute.anon.InstanceGroup => Request[Operation]): Self = this.set("removeInstances", js.Any.fromFunction1(value))
    @scala.inline
    def setSetNamedPorts(value: typings.gapiClientCompute.anon.InstanceGroup => Request[Operation]): Self = this.set("setNamedPorts", js.Any.fromFunction1(value))
  }
  
}

