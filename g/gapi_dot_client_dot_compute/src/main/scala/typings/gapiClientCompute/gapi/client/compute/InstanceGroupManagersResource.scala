package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.gapiClientCompute.anon.Alt
import typings.gapiClientCompute.anon.Fields
import typings.gapiClientCompute.anon.FieldsInstanceGroupManager
import typings.gapiClientCompute.anon.MaxResults
import typings.gapiClientCompute.anon.QuotaUser
import typings.gapiClientCompute.anon.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceGroupManagersResource extends js.Object {
  /**
    * Schedules a group action to remove the specified instances from the managed instance group. Abandoning an instance does not delete the instance, but it
    * does remove the instance from any target pools that are applied by the managed instance group. This method reduces the targetSize of the managed
    * instance group by the number of instances that you abandon. This operation is marked as DONE when the action is scheduled even if the instances have
    * not yet been removed from the group. You must separately verify the status of the abandoning action with the listmanagedinstances method.
    *
    * If the group is part of a backend service that has enabled connection draining, it can take up to 60 seconds after the connection draining duration has
    * elapsed before the VM instance is removed or deleted.
    *
    * You can specify a maximum of 1000 instances with this method per request.
    */
  def abandonInstances(request: typings.gapiClientCompute.anon.InstanceGroupManager): Request[Operation] = js.native
  /** Retrieves the list of managed instance groups and groups them by zone. */
  def aggregatedList(request: Alt): Request[InstanceGroupManagerAggregatedList] = js.native
  /**
    * Deletes the specified managed instance group and all of the instances in that group. Note that the instance group must not belong to a backend service.
    * Read  Deleting an instance group for more information.
    */
  def delete(request: typings.gapiClientCompute.anon.InstanceGroupManager): Request[Operation] = js.native
  /**
    * Schedules a group action to delete the specified instances in the managed instance group. The instances are also removed from any target pools of which
    * they were a member. This method reduces the targetSize of the managed instance group by the number of instances that you delete. This operation is
    * marked as DONE when the action is scheduled even if the instances are still being deleted. You must separately verify the status of the deleting action
    * with the listmanagedinstances method.
    *
    * If the group is part of a backend service that has enabled connection draining, it can take up to 60 seconds after the connection draining duration has
    * elapsed before the VM instance is removed or deleted.
    *
    * You can specify a maximum of 1000 instances with this method per request.
    */
  def deleteInstances(request: typings.gapiClientCompute.anon.InstanceGroupManager): Request[Operation] = js.native
  /** Returns all of the details about the specified managed instance group. Get a list of available managed instance groups by making a list() request. */
  def get(request: FieldsInstanceGroupManager): Request[InstanceGroupManager] = js.native
  /**
    * Creates a managed instance group using the information that you specify in the request. After the group is created, it schedules an action to create
    * instances in the group using the specified instance template. This operation is marked as DONE when the group is created even if the instances in the
    * group have not yet been created. You must separately verify the status of the individual instances with the listmanagedinstances method.
    *
    * A managed instance group can have up to 1000 VM instances per group. Please contact Cloud Support if you need an increase in this limit.
    */
  def insert(request: QuotaUser): Request[Operation] = js.native
  /** Retrieves a list of managed instance groups that are contained within the specified project and zone. */
  def list(request: Fields): Request[InstanceGroupManagerList] = js.native
  /**
    * Lists all of the instances in the managed instance group. Each instance in the list has a currentAction, which indicates the action that the managed
    * instance group is performing on the instance. For example, if the group is still creating an instance, the currentAction is CREATING. If a previous
    * action failed, the list displays the errors for that failed action.
    */
  def listManagedInstances(request: MaxResults): Request[InstanceGroupManagersListManagedInstancesResponse] = js.native
  /**
    * Schedules a group action to recreate the specified instances in the managed instance group. The instances are deleted and recreated using the current
    * instance template for the managed instance group. This operation is marked as DONE when the action is scheduled even if the instances have not yet been
    * recreated. You must separately verify the status of the recreating action with the listmanagedinstances method.
    *
    * If the group is part of a backend service that has enabled connection draining, it can take up to 60 seconds after the connection draining duration has
    * elapsed before the VM instance is removed or deleted.
    *
    * You can specify a maximum of 1000 instances with this method per request.
    */
  def recreateInstances(request: typings.gapiClientCompute.anon.InstanceGroupManager): Request[Operation] = js.native
  /**
    * Resizes the managed instance group. If you increase the size, the group creates new instances using the current instance template. If you decrease the
    * size, the group deletes instances. The resize operation is marked DONE when the resize actions are scheduled even if the group has not yet added or
    * deleted any instances. You must separately verify the status of the creating or deleting actions with the listmanagedinstances method.
    *
    * If the group is part of a backend service that has enabled connection draining, it can take up to 60 seconds after the connection draining duration has
    * elapsed before the VM instance is removed or deleted.
    */
  def resize(request: Size): Request[Operation] = js.native
  /**
    * Specifies the instance template to use when creating new instances in this group. The templates for existing instances in the group do not change
    * unless you recreate them.
    */
  def setInstanceTemplate(request: typings.gapiClientCompute.anon.InstanceGroupManager): Request[Operation] = js.native
  /**
    * Modifies the target pools to which all instances in this managed instance group are assigned. The target pools automatically apply to all of the
    * instances in the managed instance group. This operation is marked DONE when you make the request even if the instances have not yet been added to their
    * target pools. The change might take some time to apply to all of the instances in the group depending on the size of the group.
    */
  def setTargetPools(request: typings.gapiClientCompute.anon.InstanceGroupManager): Request[Operation] = js.native
}

object InstanceGroupManagersResource {
  @scala.inline
  def apply(
    abandonInstances: typings.gapiClientCompute.anon.InstanceGroupManager => Request[Operation],
    aggregatedList: Alt => Request[InstanceGroupManagerAggregatedList],
    delete: typings.gapiClientCompute.anon.InstanceGroupManager => Request[Operation],
    deleteInstances: typings.gapiClientCompute.anon.InstanceGroupManager => Request[Operation],
    get: FieldsInstanceGroupManager => Request[InstanceGroupManager],
    insert: QuotaUser => Request[Operation],
    list: Fields => Request[InstanceGroupManagerList],
    listManagedInstances: MaxResults => Request[InstanceGroupManagersListManagedInstancesResponse],
    recreateInstances: typings.gapiClientCompute.anon.InstanceGroupManager => Request[Operation],
    resize: Size => Request[Operation],
    setInstanceTemplate: typings.gapiClientCompute.anon.InstanceGroupManager => Request[Operation],
    setTargetPools: typings.gapiClientCompute.anon.InstanceGroupManager => Request[Operation]
  ): InstanceGroupManagersResource = {
    val __obj = js.Dynamic.literal(abandonInstances = js.Any.fromFunction1(abandonInstances), aggregatedList = js.Any.fromFunction1(aggregatedList), delete = js.Any.fromFunction1(delete), deleteInstances = js.Any.fromFunction1(deleteInstances), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), listManagedInstances = js.Any.fromFunction1(listManagedInstances), recreateInstances = js.Any.fromFunction1(recreateInstances), resize = js.Any.fromFunction1(resize), setInstanceTemplate = js.Any.fromFunction1(setInstanceTemplate), setTargetPools = js.Any.fromFunction1(setTargetPools))
    __obj.asInstanceOf[InstanceGroupManagersResource]
  }
  @scala.inline
  implicit class InstanceGroupManagersResourceOps[Self <: InstanceGroupManagersResource] (val x: Self) extends AnyVal {
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
    def setAbandonInstances(value: typings.gapiClientCompute.anon.InstanceGroupManager => Request[Operation]): Self = this.set("abandonInstances", js.Any.fromFunction1(value))
    @scala.inline
    def setAggregatedList(value: Alt => Request[InstanceGroupManagerAggregatedList]): Self = this.set("aggregatedList", js.Any.fromFunction1(value))
    @scala.inline
    def setDelete(value: typings.gapiClientCompute.anon.InstanceGroupManager => Request[Operation]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setDeleteInstances(value: typings.gapiClientCompute.anon.InstanceGroupManager => Request[Operation]): Self = this.set("deleteInstances", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: FieldsInstanceGroupManager => Request[InstanceGroupManager]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: QuotaUser => Request[Operation]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Fields => Request[InstanceGroupManagerList]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setListManagedInstances(value: MaxResults => Request[InstanceGroupManagersListManagedInstancesResponse]): Self = this.set("listManagedInstances", js.Any.fromFunction1(value))
    @scala.inline
    def setRecreateInstances(value: typings.gapiClientCompute.anon.InstanceGroupManager => Request[Operation]): Self = this.set("recreateInstances", js.Any.fromFunction1(value))
    @scala.inline
    def setResize(value: Size => Request[Operation]): Self = this.set("resize", js.Any.fromFunction1(value))
    @scala.inline
    def setSetInstanceTemplate(value: typings.gapiClientCompute.anon.InstanceGroupManager => Request[Operation]): Self = this.set("setInstanceTemplate", js.Any.fromFunction1(value))
    @scala.inline
    def setSetTargetPools(value: typings.gapiClientCompute.anon.InstanceGroupManager => Request[Operation]): Self = this.set("setTargetPools", js.Any.fromFunction1(value))
  }
  
}

