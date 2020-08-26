package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.gapiClientCompute.anon.Filter
import typings.gapiClientCompute.anon.InstanceGroupManagerKey
import typings.gapiClientCompute.anon.PageToken
import typings.gapiClientCompute.anon.PrettyPrint
import typings.gapiClientCompute.anon.QuotaUserRegion
import typings.gapiClientCompute.anon.RegionRequestId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegionInstanceGroupManagersResource extends js.Object {
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
  def abandonInstances(request: InstanceGroupManagerKey): Request[Operation] = js.native
  /** Deletes the specified managed instance group and all of the instances in that group. */
  def delete(request: InstanceGroupManagerKey): Request[Operation] = js.native
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
  def deleteInstances(request: InstanceGroupManagerKey): Request[Operation] = js.native
  /** Returns all of the details about the specified managed instance group. */
  def get(request: QuotaUserRegion): Request[InstanceGroupManager] = js.native
  /**
    * Creates a managed instance group using the information that you specify in the request. After the group is created, it schedules an action to create
    * instances in the group using the specified instance template. This operation is marked as DONE when the group is created even if the instances in the
    * group have not yet been created. You must separately verify the status of the individual instances with the listmanagedinstances method.
    *
    * A regional managed instance group can contain up to 2000 instances.
    */
  def insert(request: PrettyPrint): Request[Operation] = js.native
  /** Retrieves the list of managed instance groups that are contained within the specified region. */
  def list(request: Filter): Request[RegionInstanceGroupManagerList] = js.native
  /**
    * Lists the instances in the managed instance group and instances that are scheduled to be created. The list includes any current actions that the group
    * has scheduled for its instances.
    */
  def listManagedInstances(request: PageToken): Request[RegionInstanceGroupManagersListInstancesResponse] = js.native
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
  def recreateInstances(request: InstanceGroupManagerKey): Request[Operation] = js.native
  /**
    * Changes the intended size for the managed instance group. If you increase the size, the group schedules actions to create new instances using the
    * current instance template. If you decrease the size, the group schedules delete actions on one or more instances. The resize operation is marked DONE
    * when the resize actions are scheduled even if the group has not yet added or deleted any instances. You must separately verify the status of the
    * creating or deleting actions with the listmanagedinstances method.
    *
    * If the group is part of a backend service that has enabled connection draining, it can take up to 60 seconds after the connection draining duration has
    * elapsed before the VM instance is removed or deleted.
    */
  def resize(request: RegionRequestId): Request[Operation] = js.native
  /** Sets the instance template to use when creating new instances or recreating instances in this group. Existing instances are not affected. */
  def setInstanceTemplate(request: InstanceGroupManagerKey): Request[Operation] = js.native
  /** Modifies the target pools to which all new instances in this group are assigned. Existing instances in the group are not affected. */
  def setTargetPools(request: InstanceGroupManagerKey): Request[Operation] = js.native
}

object RegionInstanceGroupManagersResource {
  @scala.inline
  def apply(
    abandonInstances: InstanceGroupManagerKey => Request[Operation],
    delete: InstanceGroupManagerKey => Request[Operation],
    deleteInstances: InstanceGroupManagerKey => Request[Operation],
    get: QuotaUserRegion => Request[InstanceGroupManager],
    insert: PrettyPrint => Request[Operation],
    list: Filter => Request[RegionInstanceGroupManagerList],
    listManagedInstances: PageToken => Request[RegionInstanceGroupManagersListInstancesResponse],
    recreateInstances: InstanceGroupManagerKey => Request[Operation],
    resize: RegionRequestId => Request[Operation],
    setInstanceTemplate: InstanceGroupManagerKey => Request[Operation],
    setTargetPools: InstanceGroupManagerKey => Request[Operation]
  ): RegionInstanceGroupManagersResource = {
    val __obj = js.Dynamic.literal(abandonInstances = js.Any.fromFunction1(abandonInstances), delete = js.Any.fromFunction1(delete), deleteInstances = js.Any.fromFunction1(deleteInstances), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), listManagedInstances = js.Any.fromFunction1(listManagedInstances), recreateInstances = js.Any.fromFunction1(recreateInstances), resize = js.Any.fromFunction1(resize), setInstanceTemplate = js.Any.fromFunction1(setInstanceTemplate), setTargetPools = js.Any.fromFunction1(setTargetPools))
    __obj.asInstanceOf[RegionInstanceGroupManagersResource]
  }
  @scala.inline
  implicit class RegionInstanceGroupManagersResourceOps[Self <: RegionInstanceGroupManagersResource] (val x: Self) extends AnyVal {
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
    def setAbandonInstances(value: InstanceGroupManagerKey => Request[Operation]): Self = this.set("abandonInstances", js.Any.fromFunction1(value))
    @scala.inline
    def setDelete(value: InstanceGroupManagerKey => Request[Operation]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setDeleteInstances(value: InstanceGroupManagerKey => Request[Operation]): Self = this.set("deleteInstances", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: QuotaUserRegion => Request[InstanceGroupManager]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: PrettyPrint => Request[Operation]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Filter => Request[RegionInstanceGroupManagerList]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setListManagedInstances(value: PageToken => Request[RegionInstanceGroupManagersListInstancesResponse]): Self = this.set("listManagedInstances", js.Any.fromFunction1(value))
    @scala.inline
    def setRecreateInstances(value: InstanceGroupManagerKey => Request[Operation]): Self = this.set("recreateInstances", js.Any.fromFunction1(value))
    @scala.inline
    def setResize(value: RegionRequestId => Request[Operation]): Self = this.set("resize", js.Any.fromFunction1(value))
    @scala.inline
    def setSetInstanceTemplate(value: InstanceGroupManagerKey => Request[Operation]): Self = this.set("setInstanceTemplate", js.Any.fromFunction1(value))
    @scala.inline
    def setSetTargetPools(value: InstanceGroupManagerKey => Request[Operation]): Self = this.set("setTargetPools", js.Any.fromFunction1(value))
  }
  
}

