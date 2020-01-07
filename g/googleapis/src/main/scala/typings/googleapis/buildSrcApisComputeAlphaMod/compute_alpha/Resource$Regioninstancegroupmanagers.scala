package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/compute/alpha", "compute_alpha.Resource$Regioninstancegroupmanagers")
@js.native
class Resource$Regioninstancegroupmanagers protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * compute.regionInstanceGroupManagers.abandonInstances
    * @desc Flags the specified instances to be immediately removed from the
    * managed instance group. Abandoning an instance does not delete the
    * instance, but it does remove the instance from any target pools that are
    * applied by the managed instance group. This method reduces the targetSize
    * of the managed instance group by the number of instances that you
    * abandon. This operation is marked as DONE when the action is scheduled
    * even if the instances have not yet been removed from the group. You must
    * separately verify the status of the abandoning action with the
    * listmanagedinstances method.  If the group is part of a backend service
    * that has enabled connection draining, it can take up to 60 seconds after
    * the connection draining duration has elapsed before the VM instance is
    * removed or deleted.  You can specify a maximum of 1000 instances with
    * this method per request.
    * @alias compute.regionInstanceGroupManagers.abandonInstances
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instanceGroupManager Name of the managed instance group.
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region Name of the region scoping this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {().RegionInstanceGroupManagersAbandonInstancesRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def abandonInstances(): GaxiosPromise[Schema$Operation] = js.native
  def abandonInstances(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def abandonInstances(params: ParamsDollarResourceDollarRegioninstancegroupmanagersDollarAbandoninstances): GaxiosPromise[Schema$Operation] = js.native
  def abandonInstances(
    params: ParamsDollarResourceDollarRegioninstancegroupmanagersDollarAbandoninstances,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def abandonInstances(
    params: ParamsDollarResourceDollarRegioninstancegroupmanagersDollarAbandoninstances,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def abandonInstances(
    params: ParamsDollarResourceDollarRegioninstancegroupmanagersDollarAbandoninstances,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def abandonInstances(
    params: ParamsDollarResourceDollarRegioninstancegroupmanagersDollarAbandoninstances,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * compute.regionInstanceGroupManagers.applyUpdatesToInstances
    * @desc Apply updates to selected instances the managed instance group.
    * @alias compute.regionInstanceGroupManagers.applyUpdatesToInstances
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instanceGroupManager The name of the managed instance group, should conform to RFC1035.
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region Name of the region scoping this request, should conform to RFC1035.
    * @param {().RegionInstanceGroupManagersApplyUpdatesRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def applyUpdatesToInstances(): GaxiosPromise[Schema$Operation] = js.native
  def applyUpdatesToInstances(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def applyUpdatesToInstances(params: ParamsDollarResourceDollarRegioninstancegroupmanagersDollarApplyupdatestoinstances): GaxiosPromise[Schema$Operation] = js.native
  def applyUpdatesToInstances(
    params: ParamsDollarResourceDollarRegioninstancegroupmanagersDollarApplyupdatestoinstances,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def applyUpdatesToInstances(
    params: ParamsDollarResourceDollarRegioninstancegroupmanagersDollarApplyupdatestoinstances,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def applyUpdatesToInstances(
    params: ParamsDollarResourceDollarRegioninstancegroupmanagersDollarApplyupdatestoinstances,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def applyUpdatesToInstances(
    params: ParamsDollarResourceDollarRegioninstancegroupmanagersDollarApplyupdatestoinstances,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * compute.regionInstanceGroupManagers.createInstances
    * @desc Creates instances with per-instance configs in this regional
    * managed instance group. Instances are created using the current instance
    * template. The create instances operation is marked DONE if the
    * createInstances request is successful. The underlying actions take
    * additional time. You must separately verify the status of the creating or
    * actions with the listmanagedinstances method.
    * @alias compute.regionInstanceGroupManagers.createInstances
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instanceGroupManager The name of the managed instance group. It should conform to RFC1035.
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region The name of the region where the managed instance group is located. It should conform to RFC1035.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {().RegionInstanceGroupManagersCreateInstancesRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def createInstances(): GaxiosPromise[Schema$Operation] = js.native
  def createInstances(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def createInstances(params: ParamsDollarResourceDollarRegioninstancegroupmanagersDollarCreateinstances): GaxiosPromise[Schema$Operation] = js.native
  def createInstances(
    params: ParamsDollarResourceDollarRegioninstancegroupmanagersDollarCreateinstances,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def createInstances(
    params: ParamsDollarResourceDollarRegioninstancegroupmanagersDollarCreateinstances,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def createInstances(
    params: ParamsDollarResourceDollarRegioninstancegroupmanagersDollarCreateinstances,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def createInstances(
    params: ParamsDollarResourceDollarRegioninstancegroupmanagersDollarCreateinstances,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * compute.regionInstanceGroupManagers.delete
    * @desc Deletes the specified managed instance group and all of the
    * instances in that group.
    * @alias compute.regionInstanceGroupManagers.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instanceGroupManager Name of the managed instance group to delete.
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region Name of the region scoping this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Operation] = js.native
  def delete(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarRegioninstancegroupmanagersDollarDelete): GaxiosPromise[Schema$Operation] = js.native
  def delete(
    params: ParamsDollarResourceDollarRegioninstancegroupmanagersDollarDelete,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarRegioninstancegroupmanagersDollarDelete,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarRegioninstancegroupmanagersDollarDelete, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def delete(
    params: ParamsDollarResourceDollarRegioninstancegroupmanagersDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * compute.regionInstanceGroupManagers.deleteInstances
    * @desc Flags the specified instances in the managed instance group to be
    * immediately deleted. The instances are also removed from any target pools
    * of which they were a member. This method reduces the targetSize of the
    * managed instance group by the number of instances that you delete. The
    * deleteInstances operation is marked DONE if the deleteInstances request
    * is successful. The underlying actions take additional time. You must
    * separately verify the status of the deleting action with the
    * listmanagedinstances method.  If the group is part of a backend service
    * that has enabled connection draining, it can take up to 60 seconds after
    * the connection draining duration has elapsed before the VM instance is
    * removed or deleted.  You can specify a maximum of 1000 instances with
    * this method per request.
    * @alias compute.regionInstanceGroupManagers.deleteInstances
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instanceGroupManager Name of the managed instance group.
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region Name of the region scoping this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {().RegionInstanceGroupManagersDeleteInstancesRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def deleteInstances(): GaxiosPromise[Schema$Operation] = js.native
  def deleteInstances(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def deleteInstances(params: ParamsDollarResourceDollarRegioninstancegroupmanagersDollarDeleteinstances): GaxiosPromise[Schema$Operation] = js.native
  def deleteInstances(
    params: ParamsDollarResourceDollarRegioninstancegroupmanagersDollarDeleteinstances,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def deleteInstances(
    params: ParamsDollarResourceDollarRegioninstancegroupmanagersDollarDeleteinstances,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def deleteInstances(
    params: ParamsDollarResourceDollarRegioninstancegroupmanagersDollarDeleteinstances,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def deleteInstances(
    params: ParamsDollarResourceDollarRegioninstancegroupmanagersDollarDeleteinstances,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * compute.regionInstanceGroupManagers.deletePerInstanceConfigs
    * @desc Deletes selected per-instance configs for the managed instance
    * group.
    * @alias compute.regionInstanceGroupManagers.deletePerInstanceConfigs
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instanceGroupManager The name of the managed instance group. It should conform to RFC1035.
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region Name of the region scoping this request, should conform to RFC1035.
    * @param {().RegionInstanceGroupManagerDeleteInstanceConfigReq} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def deletePerInstanceConfigs(): GaxiosPromise[Schema$Operation] = js.native
  def deletePerInstanceConfigs(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def deletePerInstanceConfigs(params: ParamsDollarResourceDollarRegioninstancegroupmanagersDollarDeleteperinstanceconfigs): GaxiosPromise[Schema$Operation] = js.native
  def deletePerInstanceConfigs(
    params: ParamsDollarResourceDollarRegioninstancegroupmanagersDollarDeleteperinstanceconfigs,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def deletePerInstanceConfigs(
    params: ParamsDollarResourceDollarRegioninstancegroupmanagersDollarDeleteperinstanceconfigs,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def deletePerInstanceConfigs(
    params: ParamsDollarResourceDollarRegioninstancegroupmanagersDollarDeleteperinstanceconfigs,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def deletePerInstanceConfigs(
    params: ParamsDollarResourceDollarRegioninstancegroupmanagersDollarDeleteperinstanceconfigs,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * compute.regionInstanceGroupManagers.get
    * @desc Returns all of the details about the specified managed instance
    * group.
    * @alias compute.regionInstanceGroupManagers.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instanceGroupManager Name of the managed instance group to return.
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region Name of the region scoping this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$InstanceGroupManager] = js.native
  def get(callback: BodyResponseCallback[Schema$InstanceGroupManager]): Unit = js.native
  def get(params: ParamsDollarResourceDollarRegioninstancegroupmanagersDollarGet): GaxiosPromise[Schema$InstanceGroupManager] = js.native
  def get(
    params: ParamsDollarResourceDollarRegioninstancegroupmanagersDollarGet,
    callback: BodyResponseCallback[Schema$InstanceGroupManager]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarRegioninstancegroupmanagersDollarGet,
    options: BodyResponseCallback[Schema$InstanceGroupManager],
    callback: BodyResponseCallback[Schema$InstanceGroupManager]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarRegioninstancegroupmanagersDollarGet, options: MethodOptions): GaxiosPromise[Schema$InstanceGroupManager] = js.native
  def get(
    params: ParamsDollarResourceDollarRegioninstancegroupmanagersDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$InstanceGroupManager]
  ): Unit = js.native
  /**
    * compute.regionInstanceGroupManagers.insert
    * @desc Creates a managed instance group using the information that you
    * specify in the request. After the group is created, instances in the
    * group are created using the specified instance template. This operation
    * is marked as DONE when the group is created even if the instances in the
    * group have not yet been created. You must separately verify the status of
    * the individual instances with the listmanagedinstances method.  A
    * regional managed instance group can contain up to 2000 instances.
    * @alias compute.regionInstanceGroupManagers.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region Name of the region scoping this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {().InstanceGroupManager} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$Operation] = js.native
  def insert(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarRegioninstancegroupmanagersDollarInsert): GaxiosPromise[Schema$Operation] = js.native
  def insert(
    params: ParamsDollarResourceDollarRegioninstancegroupmanagersDollarInsert,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarRegioninstancegroupmanagersDollarInsert,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarRegioninstancegroupmanagersDollarInsert, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def insert(
    params: ParamsDollarResourceDollarRegioninstancegroupmanagersDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * compute.regionInstanceGroupManagers.list
    * @desc Retrieves the list of managed instance groups that are contained
    * within the specified region.
    * @alias compute.regionInstanceGroupManagers.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter A filter expression that filters resources listed in the response. The expression must specify the field name, a comparison operator, and the value that you want to use for filtering. The value must be a string, a number, or a boolean. The comparison operator must be either =, !=, >, or <.  For example, if you are filtering Compute Engine instances, you can exclude instances named example-instance by specifying name != example-instance.  You can also filter nested fields. For example, you could specify scheduling.automaticRestart = false to include instances only if they are not scheduled for automatic restarts. You can use filtering on nested fields to filter based on resource labels.  To filter on multiple expressions, provide each separate expression within parentheses. For example, (scheduling.automaticRestart = true) (cpuPlatform = "Intel Skylake"). By default, each expression is an AND expression. However, you can include AND and OR expressions explicitly. For example, (cpuPlatform = "Intel Skylake") OR (cpuPlatform = "Intel Broadwell") AND (scheduling.automaticRestart = true).
    * @param {integer=} params.maxResults The maximum number of results per page that should be returned. If the number of available results is larger than maxResults, Compute Engine returns a nextPageToken that can be used to get the next page of results in subsequent list requests. Acceptable values are 0 to 500, inclusive. (Default: 500)
    * @param {string=} params.orderBy Sorts list results by a certain order. By default, results are returned in alphanumerical order based on the resource name.  You can also sort results in descending order based on the creation timestamp using orderBy="creationTimestamp desc". This sorts results based on the creationTimestamp field in reverse chronological order (newest result first). Use this to sort resources like operations so that the newest operation is returned first.  Currently, only sorting by name or creationTimestamp desc is supported.
    * @param {string=} params.pageToken Specifies a page token to use. Set pageToken to the nextPageToken returned by a previous list request to get the next page of results.
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region Name of the region scoping this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$RegionInstanceGroupManagerList] = js.native
  def list(callback: BodyResponseCallback[Schema$RegionInstanceGroupManagerList]): Unit = js.native
  def list(params: ParamsDollarResourceDollarRegioninstancegroupmanagersDollarList): GaxiosPromise[Schema$RegionInstanceGroupManagerList] = js.native
  def list(
    params: ParamsDollarResourceDollarRegioninstancegroupmanagersDollarList,
    callback: BodyResponseCallback[Schema$RegionInstanceGroupManagerList]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarRegioninstancegroupmanagersDollarList,
    options: BodyResponseCallback[Schema$RegionInstanceGroupManagerList],
    callback: BodyResponseCallback[Schema$RegionInstanceGroupManagerList]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarRegioninstancegroupmanagersDollarList, options: MethodOptions): GaxiosPromise[Schema$RegionInstanceGroupManagerList] = js.native
  def list(
    params: ParamsDollarResourceDollarRegioninstancegroupmanagersDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$RegionInstanceGroupManagerList]
  ): Unit = js.native
  /**
    * compute.regionInstanceGroupManagers.listManagedInstances
    * @desc Lists the instances in the managed instance group and instances
    * that are scheduled to be created. The list includes any current actions
    * that the group has scheduled for its instances.
    * @alias compute.regionInstanceGroupManagers.listManagedInstances
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter A filter expression that filters resources listed in the response. The expression must specify the field name, a comparison operator, and the value that you want to use for filtering. The value must be a string, a number, or a boolean. The comparison operator must be either =, !=, >, or <.  For example, if you are filtering Compute Engine instances, you can exclude instances named example-instance by specifying name != example-instance.  You can also filter nested fields. For example, you could specify scheduling.automaticRestart = false to include instances only if they are not scheduled for automatic restarts. You can use filtering on nested fields to filter based on resource labels.  To filter on multiple expressions, provide each separate expression within parentheses. For example, (scheduling.automaticRestart = true) (cpuPlatform = "Intel Skylake"). By default, each expression is an AND expression. However, you can include AND and OR expressions explicitly. For example, (cpuPlatform = "Intel Skylake") OR (cpuPlatform = "Intel Broadwell") AND (scheduling.automaticRestart = true).
    * @param {string} params.instanceGroupManager The name of the managed instance group.
    * @param {integer=} params.maxResults The maximum number of results per page that should be returned. If the number of available results is larger than maxResults, Compute Engine returns a nextPageToken that can be used to get the next page of results in subsequent list requests. Acceptable values are 0 to 500, inclusive. (Default: 500)
    * @param {string=} params.order_by Sorts list results by a certain order. By default, results are returned in alphanumerical order based on the resource name.  You can also sort results in descending order based on the creation timestamp using orderBy="creationTimestamp desc". This sorts results based on the creationTimestamp field in reverse chronological order (newest result first). Use this to sort resources like operations so that the newest operation is returned first.  Currently, only sorting by name or creationTimestamp desc is supported.
    * @param {string=} params.pageToken Specifies a page token to use. Set pageToken to the nextPageToken returned by a previous list request to get the next page of results.
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region Name of the region scoping this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def listManagedInstances(): GaxiosPromise[Schema$RegionInstanceGroupManagersListInstancesResponse] = js.native
  def listManagedInstances(callback: BodyResponseCallback[Schema$RegionInstanceGroupManagersListInstancesResponse]): Unit = js.native
  def listManagedInstances(params: ParamsDollarResourceDollarRegioninstancegroupmanagersDollarListmanagedinstances): GaxiosPromise[Schema$RegionInstanceGroupManagersListInstancesResponse] = js.native
  def listManagedInstances(
    params: ParamsDollarResourceDollarRegioninstancegroupmanagersDollarListmanagedinstances,
    callback: BodyResponseCallback[Schema$RegionInstanceGroupManagersListInstancesResponse]
  ): Unit = js.native
  def listManagedInstances(
    params: ParamsDollarResourceDollarRegioninstancegroupmanagersDollarListmanagedinstances,
    options: BodyResponseCallback[Schema$RegionInstanceGroupManagersListInstancesResponse],
    callback: BodyResponseCallback[Schema$RegionInstanceGroupManagersListInstancesResponse]
  ): Unit = js.native
  def listManagedInstances(
    params: ParamsDollarResourceDollarRegioninstancegroupmanagersDollarListmanagedinstances,
    options: MethodOptions
  ): GaxiosPromise[Schema$RegionInstanceGroupManagersListInstancesResponse] = js.native
  def listManagedInstances(
    params: ParamsDollarResourceDollarRegioninstancegroupmanagersDollarListmanagedinstances,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$RegionInstanceGroupManagersListInstancesResponse]
  ): Unit = js.native
  /**
    * compute.regionInstanceGroupManagers.listPerInstanceConfigs
    * @desc Lists all of the per-instance configs defined for the managed
    * instance group.
    * @alias compute.regionInstanceGroupManagers.listPerInstanceConfigs
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter A filter expression that filters resources listed in the response. The expression must specify the field name, a comparison operator, and the value that you want to use for filtering. The value must be a string, a number, or a boolean. The comparison operator must be either =, !=, >, or <.  For example, if you are filtering Compute Engine instances, you can exclude instances named example-instance by specifying name != example-instance.  You can also filter nested fields. For example, you could specify scheduling.automaticRestart = false to include instances only if they are not scheduled for automatic restarts. You can use filtering on nested fields to filter based on resource labels.  To filter on multiple expressions, provide each separate expression within parentheses. For example, (scheduling.automaticRestart = true) (cpuPlatform = "Intel Skylake"). By default, each expression is an AND expression. However, you can include AND and OR expressions explicitly. For example, (cpuPlatform = "Intel Skylake") OR (cpuPlatform = "Intel Broadwell") AND (scheduling.automaticRestart = true).
    * @param {string} params.instanceGroupManager The name of the managed instance group. It should conform to RFC1035.
    * @param {integer=} params.maxResults The maximum number of results per page that should be returned. If the number of available results is larger than maxResults, Compute Engine returns a nextPageToken that can be used to get the next page of results in subsequent list requests. Acceptable values are 0 to 500, inclusive. (Default: 500)
    * @param {string=} params.orderBy Sorts list results by a certain order. By default, results are returned in alphanumerical order based on the resource name.  You can also sort results in descending order based on the creation timestamp using orderBy="creationTimestamp desc". This sorts results based on the creationTimestamp field in reverse chronological order (newest result first). Use this to sort resources like operations so that the newest operation is returned first.  Currently, only sorting by name or creationTimestamp desc is supported.
    * @param {string=} params.pageToken Specifies a page token to use. Set pageToken to the nextPageToken returned by a previous list request to get the next page of results.
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region Name of the region scoping this request, should conform to RFC1035.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def listPerInstanceConfigs(): GaxiosPromise[Schema$RegionInstanceGroupManagersListInstanceConfigsResp] = js.native
  def listPerInstanceConfigs(callback: BodyResponseCallback[Schema$RegionInstanceGroupManagersListInstanceConfigsResp]): Unit = js.native
  def listPerInstanceConfigs(params: ParamsDollarResourceDollarRegioninstancegroupmanagersDollarListperinstanceconfigs): GaxiosPromise[Schema$RegionInstanceGroupManagersListInstanceConfigsResp] = js.native
  def listPerInstanceConfigs(
    params: ParamsDollarResourceDollarRegioninstancegroupmanagersDollarListperinstanceconfigs,
    callback: BodyResponseCallback[Schema$RegionInstanceGroupManagersListInstanceConfigsResp]
  ): Unit = js.native
  def listPerInstanceConfigs(
    params: ParamsDollarResourceDollarRegioninstancegroupmanagersDollarListperinstanceconfigs,
    options: BodyResponseCallback[Schema$RegionInstanceGroupManagersListInstanceConfigsResp],
    callback: BodyResponseCallback[Schema$RegionInstanceGroupManagersListInstanceConfigsResp]
  ): Unit = js.native
  def listPerInstanceConfigs(
    params: ParamsDollarResourceDollarRegioninstancegroupmanagersDollarListperinstanceconfigs,
    options: MethodOptions
  ): GaxiosPromise[Schema$RegionInstanceGroupManagersListInstanceConfigsResp] = js.native
  def listPerInstanceConfigs(
    params: ParamsDollarResourceDollarRegioninstancegroupmanagersDollarListperinstanceconfigs,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$RegionInstanceGroupManagersListInstanceConfigsResp]
  ): Unit = js.native
  /**
    * compute.regionInstanceGroupManagers.patch
    * @desc Updates a managed instance group using the information that you
    * specify in the request. This operation is marked as DONE when the group
    * is patched even if the instances in the group are still in the process of
    * being patched. You must separately verify the status of the individual
    * instances with the listmanagedinstances method. This method supports
    * PATCH semantics and uses the JSON merge patch format and processing
    * rules.
    * @alias compute.regionInstanceGroupManagers.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instanceGroupManager The name of the instance group manager.
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region Name of the region scoping this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {().InstanceGroupManager} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$Operation] = js.native
  def patch(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarRegioninstancegroupmanagersDollarPatch): GaxiosPromise[Schema$Operation] = js.native
  def patch(
    params: ParamsDollarResourceDollarRegioninstancegroupmanagersDollarPatch,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarRegioninstancegroupmanagersDollarPatch,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarRegioninstancegroupmanagersDollarPatch, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def patch(
    params: ParamsDollarResourceDollarRegioninstancegroupmanagersDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * compute.regionInstanceGroupManagers.patchPerInstanceConfigs
    * @desc Insert or patch (for the ones that already exist) per-instance
    * configs for the managed instance group. perInstanceConfig.instance serves
    * as a key used to distinguish whether to perform insert or patch.
    * @alias compute.regionInstanceGroupManagers.patchPerInstanceConfigs
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instanceGroupManager The name of the managed instance group. It should conform to RFC1035.
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region Name of the region scoping this request, should conform to RFC1035.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {().RegionInstanceGroupManagerPatchInstanceConfigReq} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patchPerInstanceConfigs(): GaxiosPromise[Schema$Operation] = js.native
  def patchPerInstanceConfigs(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def patchPerInstanceConfigs(params: ParamsDollarResourceDollarRegioninstancegroupmanagersDollarPatchperinstanceconfigs): GaxiosPromise[Schema$Operation] = js.native
  def patchPerInstanceConfigs(
    params: ParamsDollarResourceDollarRegioninstancegroupmanagersDollarPatchperinstanceconfigs,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def patchPerInstanceConfigs(
    params: ParamsDollarResourceDollarRegioninstancegroupmanagersDollarPatchperinstanceconfigs,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def patchPerInstanceConfigs(
    params: ParamsDollarResourceDollarRegioninstancegroupmanagersDollarPatchperinstanceconfigs,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def patchPerInstanceConfigs(
    params: ParamsDollarResourceDollarRegioninstancegroupmanagersDollarPatchperinstanceconfigs,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * compute.regionInstanceGroupManagers.recreateInstances
    * @desc Flags the specified instances in the managed instance group to be
    * immediately recreated. The instances are deleted and recreated using the
    * current instance template for the managed instance group. This operation
    * is marked as DONE when the flag is set even if the instances have not yet
    * been recreated. You must separately verify the status of the recreating
    * action with the listmanagedinstances method.  If the group is part of a
    * backend service that has enabled connection draining, it can take up to
    * 60 seconds after the connection draining duration has elapsed before the
    * VM instance is removed or deleted.  You can specify a maximum of 1000
    * instances with this method per request.
    * @alias compute.regionInstanceGroupManagers.recreateInstances
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instanceGroupManager Name of the managed instance group.
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region Name of the region scoping this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {().RegionInstanceGroupManagersRecreateRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def recreateInstances(): GaxiosPromise[Schema$Operation] = js.native
  def recreateInstances(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def recreateInstances(params: ParamsDollarResourceDollarRegioninstancegroupmanagersDollarRecreateinstances): GaxiosPromise[Schema$Operation] = js.native
  def recreateInstances(
    params: ParamsDollarResourceDollarRegioninstancegroupmanagersDollarRecreateinstances,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def recreateInstances(
    params: ParamsDollarResourceDollarRegioninstancegroupmanagersDollarRecreateinstances,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def recreateInstances(
    params: ParamsDollarResourceDollarRegioninstancegroupmanagersDollarRecreateinstances,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def recreateInstances(
    params: ParamsDollarResourceDollarRegioninstancegroupmanagersDollarRecreateinstances,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * compute.regionInstanceGroupManagers.resize
    * @desc Changes the intended size of the managed instance group. If you
    * increase the size, the group creates new instances using the current
    * instance template. If you decrease the size, the group deletes one or
    * more instances.  The resize operation is marked DONE if the resize
    * request is successful. The underlying actions take additional time. You
    * must separately verify the status of the creating or deleting actions
    * with the listmanagedinstances method.  If the group is part of a backend
    * service that has enabled connection draining, it can take up to 60
    * seconds after the connection draining duration has elapsed before the VM
    * instance is removed or deleted.
    * @alias compute.regionInstanceGroupManagers.resize
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instanceGroupManager Name of the managed instance group.
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region Name of the region scoping this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {integer} params.size Number of instances that should exist in this instance group manager.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def resize(): GaxiosPromise[Schema$Operation] = js.native
  def resize(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def resize(params: ParamsDollarResourceDollarRegioninstancegroupmanagersDollarResize): GaxiosPromise[Schema$Operation] = js.native
  def resize(
    params: ParamsDollarResourceDollarRegioninstancegroupmanagersDollarResize,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def resize(
    params: ParamsDollarResourceDollarRegioninstancegroupmanagersDollarResize,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def resize(params: ParamsDollarResourceDollarRegioninstancegroupmanagersDollarResize, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def resize(
    params: ParamsDollarResourceDollarRegioninstancegroupmanagersDollarResize,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * compute.regionInstanceGroupManagers.setAutoHealingPolicies
    * @desc Modifies the autohealing policy for the instances in this managed
    * instance group. [Deprecated] This method is deprecated. Please use Patch
    * instead.
    * @alias compute.regionInstanceGroupManagers.setAutoHealingPolicies
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instanceGroupManager Name of the managed instance group.
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region Name of the region scoping this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {().RegionInstanceGroupManagersSetAutoHealingRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setAutoHealingPolicies(): GaxiosPromise[Schema$Operation] = js.native
  def setAutoHealingPolicies(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def setAutoHealingPolicies(params: ParamsDollarResourceDollarRegioninstancegroupmanagersDollarSetautohealingpolicies): GaxiosPromise[Schema$Operation] = js.native
  def setAutoHealingPolicies(
    params: ParamsDollarResourceDollarRegioninstancegroupmanagersDollarSetautohealingpolicies,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def setAutoHealingPolicies(
    params: ParamsDollarResourceDollarRegioninstancegroupmanagersDollarSetautohealingpolicies,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def setAutoHealingPolicies(
    params: ParamsDollarResourceDollarRegioninstancegroupmanagersDollarSetautohealingpolicies,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def setAutoHealingPolicies(
    params: ParamsDollarResourceDollarRegioninstancegroupmanagersDollarSetautohealingpolicies,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * compute.regionInstanceGroupManagers.setInstanceTemplate
    * @desc Sets the instance template to use when creating new instances or
    * recreating instances in this group. Existing instances are not affected.
    * @alias compute.regionInstanceGroupManagers.setInstanceTemplate
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instanceGroupManager The name of the managed instance group.
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region Name of the region scoping this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {().RegionInstanceGroupManagersSetTemplateRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setInstanceTemplate(): GaxiosPromise[Schema$Operation] = js.native
  def setInstanceTemplate(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def setInstanceTemplate(params: ParamsDollarResourceDollarRegioninstancegroupmanagersDollarSetinstancetemplate): GaxiosPromise[Schema$Operation] = js.native
  def setInstanceTemplate(
    params: ParamsDollarResourceDollarRegioninstancegroupmanagersDollarSetinstancetemplate,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def setInstanceTemplate(
    params: ParamsDollarResourceDollarRegioninstancegroupmanagersDollarSetinstancetemplate,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def setInstanceTemplate(
    params: ParamsDollarResourceDollarRegioninstancegroupmanagersDollarSetinstancetemplate,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def setInstanceTemplate(
    params: ParamsDollarResourceDollarRegioninstancegroupmanagersDollarSetinstancetemplate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * compute.regionInstanceGroupManagers.setTargetPools
    * @desc Modifies the target pools to which all new instances in this group
    * are assigned. Existing instances in the group are not affected.
    * @alias compute.regionInstanceGroupManagers.setTargetPools
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instanceGroupManager Name of the managed instance group.
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region Name of the region scoping this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {().RegionInstanceGroupManagersSetTargetPoolsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setTargetPools(): GaxiosPromise[Schema$Operation] = js.native
  def setTargetPools(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def setTargetPools(params: ParamsDollarResourceDollarRegioninstancegroupmanagersDollarSettargetpools): GaxiosPromise[Schema$Operation] = js.native
  def setTargetPools(
    params: ParamsDollarResourceDollarRegioninstancegroupmanagersDollarSettargetpools,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def setTargetPools(
    params: ParamsDollarResourceDollarRegioninstancegroupmanagersDollarSettargetpools,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def setTargetPools(
    params: ParamsDollarResourceDollarRegioninstancegroupmanagersDollarSettargetpools,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def setTargetPools(
    params: ParamsDollarResourceDollarRegioninstancegroupmanagersDollarSettargetpools,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * compute.regionInstanceGroupManagers.testIamPermissions
    * @desc Returns permissions that a caller has on the specified resource.
    * @alias compute.regionInstanceGroupManagers.testIamPermissions
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region The name of the region for this request.
    * @param {string} params.resource_ Name or id of the resource for this request.
    * @param {().TestPermissionsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def testIamPermissions(): GaxiosPromise[Schema$TestPermissionsResponse] = js.native
  def testIamPermissions(callback: BodyResponseCallback[Schema$TestPermissionsResponse]): Unit = js.native
  def testIamPermissions(params: ParamsDollarResourceDollarRegioninstancegroupmanagersDollarTestiampermissions): GaxiosPromise[Schema$TestPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarRegioninstancegroupmanagersDollarTestiampermissions,
    callback: BodyResponseCallback[Schema$TestPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarRegioninstancegroupmanagersDollarTestiampermissions,
    options: BodyResponseCallback[Schema$TestPermissionsResponse],
    callback: BodyResponseCallback[Schema$TestPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarRegioninstancegroupmanagersDollarTestiampermissions,
    options: MethodOptions
  ): GaxiosPromise[Schema$TestPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarRegioninstancegroupmanagersDollarTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$TestPermissionsResponse]
  ): Unit = js.native
  /**
    * compute.regionInstanceGroupManagers.update
    * @desc Updates a managed instance group using the information that you
    * specify in the request. This operation is marked as DONE when the group
    * is updated even if the instances in the group have not yet been updated.
    * You must separately verify the status of the individual instances with
    * the listmanagedinstances method.
    * @alias compute.regionInstanceGroupManagers.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instanceGroupManager The name of the instance group manager.
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region Name of the region scoping this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {().InstanceGroupManager} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$Operation] = js.native
  def update(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def update(params: ParamsDollarResourceDollarRegioninstancegroupmanagersDollarUpdate): GaxiosPromise[Schema$Operation] = js.native
  def update(
    params: ParamsDollarResourceDollarRegioninstancegroupmanagersDollarUpdate,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarRegioninstancegroupmanagersDollarUpdate,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarRegioninstancegroupmanagersDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def update(
    params: ParamsDollarResourceDollarRegioninstancegroupmanagersDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * compute.regionInstanceGroupManagers.updatePerInstanceConfigs
    * @desc Insert or update (for the ones that already exist) per-instance
    * configs for the managed instance group. perInstanceConfig.instance serves
    * as a key used to distinguish whether to perform insert or patch.
    * @alias compute.regionInstanceGroupManagers.updatePerInstanceConfigs
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instanceGroupManager The name of the managed instance group. It should conform to RFC1035.
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region Name of the region scoping this request, should conform to RFC1035.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {().RegionInstanceGroupManagerUpdateInstanceConfigReq} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def updatePerInstanceConfigs(): GaxiosPromise[Schema$Operation] = js.native
  def updatePerInstanceConfigs(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def updatePerInstanceConfigs(params: ParamsDollarResourceDollarRegioninstancegroupmanagersDollarUpdateperinstanceconfigs): GaxiosPromise[Schema$Operation] = js.native
  def updatePerInstanceConfigs(
    params: ParamsDollarResourceDollarRegioninstancegroupmanagersDollarUpdateperinstanceconfigs,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def updatePerInstanceConfigs(
    params: ParamsDollarResourceDollarRegioninstancegroupmanagersDollarUpdateperinstanceconfigs,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def updatePerInstanceConfigs(
    params: ParamsDollarResourceDollarRegioninstancegroupmanagersDollarUpdateperinstanceconfigs,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def updatePerInstanceConfigs(
    params: ParamsDollarResourceDollarRegioninstancegroupmanagersDollarUpdateperinstanceconfigs,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
}

