package typings.googleapis.alphaMod.computeAlpha

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/compute/alpha", "compute_alpha.Resource$Networkendpointgroups")
@js.native
class ResourceNetworkendpointgroups protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  /**
    * compute.networkEndpointGroups.aggregatedList
    * @desc Retrieves the list of network endpoint groups and sorts them by
    * zone.
    * @alias compute.networkEndpointGroups.aggregatedList
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter A filter expression that filters resources listed in the response. The expression must specify the field name, a comparison operator, and the value that you want to use for filtering. The value must be a string, a number, or a boolean. The comparison operator must be either =, !=, >, or <.  For example, if you are filtering Compute Engine instances, you can exclude instances named example-instance by specifying name != example-instance.  You can also filter nested fields. For example, you could specify scheduling.automaticRestart = false to include instances only if they are not scheduled for automatic restarts. You can use filtering on nested fields to filter based on resource labels.  To filter on multiple expressions, provide each separate expression within parentheses. For example, (scheduling.automaticRestart = true) (cpuPlatform = "Intel Skylake"). By default, each expression is an AND expression. However, you can include AND and OR expressions explicitly. For example, (cpuPlatform = "Intel Skylake") OR (cpuPlatform = "Intel Broadwell") AND (scheduling.automaticRestart = true).
    * @param {integer=} params.maxResults The maximum number of results per page that should be returned. If the number of available results is larger than maxResults, Compute Engine returns a nextPageToken that can be used to get the next page of results in subsequent list requests. Acceptable values are 0 to 500, inclusive. (Default: 500)
    * @param {string=} params.orderBy Sorts list results by a certain order. By default, results are returned in alphanumerical order based on the resource name.  You can also sort results in descending order based on the creation timestamp using orderBy="creationTimestamp desc". This sorts results based on the creationTimestamp field in reverse chronological order (newest result first). Use this to sort resources like operations so that the newest operation is returned first.  Currently, only sorting by name or creationTimestamp desc is supported.
    * @param {string=} params.pageToken Specifies a page token to use. Set pageToken to the nextPageToken returned by a previous list request to get the next page of results.
    * @param {string} params.project Project ID for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def aggregatedList(): GaxiosPromise[SchemaNetworkEndpointGroupAggregatedList] = js.native
  def aggregatedList(callback: BodyResponseCallback[SchemaNetworkEndpointGroupAggregatedList]): Unit = js.native
  def aggregatedList(params: Unit, options: MethodOptions): GaxiosPromise[SchemaNetworkEndpointGroupAggregatedList] = js.native
  def aggregatedList(params: ParamsResourceNetworkendpointgroupsAggregatedlist): GaxiosPromise[SchemaNetworkEndpointGroupAggregatedList] = js.native
  def aggregatedList(
    params: ParamsResourceNetworkendpointgroupsAggregatedlist,
    callback: BodyResponseCallback[SchemaNetworkEndpointGroupAggregatedList]
  ): Unit = js.native
  def aggregatedList(
    params: ParamsResourceNetworkendpointgroupsAggregatedlist,
    options: BodyResponseCallback[SchemaNetworkEndpointGroupAggregatedList],
    callback: BodyResponseCallback[SchemaNetworkEndpointGroupAggregatedList]
  ): Unit = js.native
  def aggregatedList(params: ParamsResourceNetworkendpointgroupsAggregatedlist, options: MethodOptions): GaxiosPromise[SchemaNetworkEndpointGroupAggregatedList] = js.native
  def aggregatedList(
    params: ParamsResourceNetworkendpointgroupsAggregatedlist,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaNetworkEndpointGroupAggregatedList]
  ): Unit = js.native
  
  /**
    * compute.networkEndpointGroups.attachNetworkEndpoints
    * @desc Attach a list of network endpoints to the specified network
    * endpoint group.
    * @alias compute.networkEndpointGroups.attachNetworkEndpoints
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.networkEndpointGroup The name of the network endpoint group where you are attaching network endpoints to. It should comply with RFC1035.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.zone The name of the zone where the network endpoint group is located. It should comply with RFC1035.
    * @param {().NetworkEndpointGroupsAttachEndpointsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def attachNetworkEndpoints(): GaxiosPromise[SchemaOperation] = js.native
  def attachNetworkEndpoints(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def attachNetworkEndpoints(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def attachNetworkEndpoints(params: ParamsResourceNetworkendpointgroupsAttachnetworkendpoints): GaxiosPromise[SchemaOperation] = js.native
  def attachNetworkEndpoints(
    params: ParamsResourceNetworkendpointgroupsAttachnetworkendpoints,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def attachNetworkEndpoints(
    params: ParamsResourceNetworkendpointgroupsAttachnetworkendpoints,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def attachNetworkEndpoints(params: ParamsResourceNetworkendpointgroupsAttachnetworkendpoints, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def attachNetworkEndpoints(
    params: ParamsResourceNetworkendpointgroupsAttachnetworkendpoints,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  /**
    * compute.networkEndpointGroups.delete
    * @desc Deletes the specified network endpoint group. The network endpoints
    * in the NEG and the VM instances they belong to are not terminated when
    * the NEG is deleted. Note that the NEG cannot be deleted if there are
    * backend services referencing it.
    * @alias compute.networkEndpointGroups.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.networkEndpointGroup The name of the network endpoint group to delete. It should comply with RFC1035.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.zone The name of the zone where the network endpoint group is located. It should comply with RFC1035.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceNetworkendpointgroupsDelete): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceNetworkendpointgroupsDelete, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(
    params: ParamsResourceNetworkendpointgroupsDelete,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceNetworkendpointgroupsDelete, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceNetworkendpointgroupsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * compute.networkEndpointGroups.detachNetworkEndpoints
    * @desc Detach a list of network endpoints from the specified network
    * endpoint group.
    * @alias compute.networkEndpointGroups.detachNetworkEndpoints
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.networkEndpointGroup The name of the network endpoint group where you are removing network endpoints. It should comply with RFC1035.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.zone The name of the zone where the network endpoint group is located. It should comply with RFC1035.
    * @param {().NetworkEndpointGroupsDetachEndpointsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def detachNetworkEndpoints(): GaxiosPromise[SchemaOperation] = js.native
  def detachNetworkEndpoints(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def detachNetworkEndpoints(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def detachNetworkEndpoints(params: ParamsResourceNetworkendpointgroupsDetachnetworkendpoints): GaxiosPromise[SchemaOperation] = js.native
  def detachNetworkEndpoints(
    params: ParamsResourceNetworkendpointgroupsDetachnetworkendpoints,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def detachNetworkEndpoints(
    params: ParamsResourceNetworkendpointgroupsDetachnetworkendpoints,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def detachNetworkEndpoints(params: ParamsResourceNetworkendpointgroupsDetachnetworkendpoints, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def detachNetworkEndpoints(
    params: ParamsResourceNetworkendpointgroupsDetachnetworkendpoints,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * compute.networkEndpointGroups.get
    * @desc Returns the specified network endpoint group. Gets a list of
    * available network endpoint groups by making a list() request.
    * @alias compute.networkEndpointGroups.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.networkEndpointGroup The name of the network endpoint group. It should comply with RFC1035.
    * @param {string} params.project Project ID for this request.
    * @param {string} params.zone The name of the zone where the network endpoint group is located. It should comply with RFC1035.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaNetworkEndpointGroup] = js.native
  def get(callback: BodyResponseCallback[SchemaNetworkEndpointGroup]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaNetworkEndpointGroup] = js.native
  def get(params: ParamsResourceNetworkendpointgroupsGet): GaxiosPromise[SchemaNetworkEndpointGroup] = js.native
  def get(
    params: ParamsResourceNetworkendpointgroupsGet,
    callback: BodyResponseCallback[SchemaNetworkEndpointGroup]
  ): Unit = js.native
  def get(
    params: ParamsResourceNetworkendpointgroupsGet,
    options: BodyResponseCallback[SchemaNetworkEndpointGroup],
    callback: BodyResponseCallback[SchemaNetworkEndpointGroup]
  ): Unit = js.native
  def get(params: ParamsResourceNetworkendpointgroupsGet, options: MethodOptions): GaxiosPromise[SchemaNetworkEndpointGroup] = js.native
  def get(
    params: ParamsResourceNetworkendpointgroupsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaNetworkEndpointGroup]
  ): Unit = js.native
  
  /**
    * compute.networkEndpointGroups.insert
    * @desc Creates a network endpoint group in the specified project using the
    * parameters that are included in the request.
    * @alias compute.networkEndpointGroups.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.zone The name of the zone where you want to create the network endpoint group. It should comply with RFC1035.
    * @param {().NetworkEndpointGroup} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaOperation] = js.native
  def insert(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def insert(params: ParamsResourceNetworkendpointgroupsInsert): GaxiosPromise[SchemaOperation] = js.native
  def insert(params: ParamsResourceNetworkendpointgroupsInsert, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def insert(
    params: ParamsResourceNetworkendpointgroupsInsert,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def insert(params: ParamsResourceNetworkendpointgroupsInsert, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def insert(
    params: ParamsResourceNetworkendpointgroupsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * compute.networkEndpointGroups.list
    * @desc Retrieves the list of network endpoint groups that are located in
    * the specified project and zone.
    * @alias compute.networkEndpointGroups.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter A filter expression that filters resources listed in the response. The expression must specify the field name, a comparison operator, and the value that you want to use for filtering. The value must be a string, a number, or a boolean. The comparison operator must be either =, !=, >, or <.  For example, if you are filtering Compute Engine instances, you can exclude instances named example-instance by specifying name != example-instance.  You can also filter nested fields. For example, you could specify scheduling.automaticRestart = false to include instances only if they are not scheduled for automatic restarts. You can use filtering on nested fields to filter based on resource labels.  To filter on multiple expressions, provide each separate expression within parentheses. For example, (scheduling.automaticRestart = true) (cpuPlatform = "Intel Skylake"). By default, each expression is an AND expression. However, you can include AND and OR expressions explicitly. For example, (cpuPlatform = "Intel Skylake") OR (cpuPlatform = "Intel Broadwell") AND (scheduling.automaticRestart = true).
    * @param {integer=} params.maxResults The maximum number of results per page that should be returned. If the number of available results is larger than maxResults, Compute Engine returns a nextPageToken that can be used to get the next page of results in subsequent list requests. Acceptable values are 0 to 500, inclusive. (Default: 500)
    * @param {string=} params.orderBy Sorts list results by a certain order. By default, results are returned in alphanumerical order based on the resource name.  You can also sort results in descending order based on the creation timestamp using orderBy="creationTimestamp desc". This sorts results based on the creationTimestamp field in reverse chronological order (newest result first). Use this to sort resources like operations so that the newest operation is returned first.  Currently, only sorting by name or creationTimestamp desc is supported.
    * @param {string=} params.pageToken Specifies a page token to use. Set pageToken to the nextPageToken returned by a previous list request to get the next page of results.
    * @param {string} params.project Project ID for this request.
    * @param {string} params.zone The name of the zone where the network endpoint group is located. It should comply with RFC1035.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaNetworkEndpointGroupList] = js.native
  def list(callback: BodyResponseCallback[SchemaNetworkEndpointGroupList]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaNetworkEndpointGroupList] = js.native
  def list(params: ParamsResourceNetworkendpointgroupsList): GaxiosPromise[SchemaNetworkEndpointGroupList] = js.native
  def list(
    params: ParamsResourceNetworkendpointgroupsList,
    callback: BodyResponseCallback[SchemaNetworkEndpointGroupList]
  ): Unit = js.native
  def list(
    params: ParamsResourceNetworkendpointgroupsList,
    options: BodyResponseCallback[SchemaNetworkEndpointGroupList],
    callback: BodyResponseCallback[SchemaNetworkEndpointGroupList]
  ): Unit = js.native
  def list(params: ParamsResourceNetworkendpointgroupsList, options: MethodOptions): GaxiosPromise[SchemaNetworkEndpointGroupList] = js.native
  def list(
    params: ParamsResourceNetworkendpointgroupsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaNetworkEndpointGroupList]
  ): Unit = js.native
  
  /**
    * compute.networkEndpointGroups.listNetworkEndpoints
    * @desc Lists the network endpoints in the specified network endpoint
    * group.
    * @alias compute.networkEndpointGroups.listNetworkEndpoints
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter A filter expression that filters resources listed in the response. The expression must specify the field name, a comparison operator, and the value that you want to use for filtering. The value must be a string, a number, or a boolean. The comparison operator must be either =, !=, >, or <.  For example, if you are filtering Compute Engine instances, you can exclude instances named example-instance by specifying name != example-instance.  You can also filter nested fields. For example, you could specify scheduling.automaticRestart = false to include instances only if they are not scheduled for automatic restarts. You can use filtering on nested fields to filter based on resource labels.  To filter on multiple expressions, provide each separate expression within parentheses. For example, (scheduling.automaticRestart = true) (cpuPlatform = "Intel Skylake"). By default, each expression is an AND expression. However, you can include AND and OR expressions explicitly. For example, (cpuPlatform = "Intel Skylake") OR (cpuPlatform = "Intel Broadwell") AND (scheduling.automaticRestart = true).
    * @param {integer=} params.maxResults The maximum number of results per page that should be returned. If the number of available results is larger than maxResults, Compute Engine returns a nextPageToken that can be used to get the next page of results in subsequent list requests. Acceptable values are 0 to 500, inclusive. (Default: 500)
    * @param {string} params.networkEndpointGroup The name of the network endpoint group from which you want to generate a list of included network endpoints. It should comply with RFC1035.
    * @param {string=} params.orderBy Sorts list results by a certain order. By default, results are returned in alphanumerical order based on the resource name.  You can also sort results in descending order based on the creation timestamp using orderBy="creationTimestamp desc". This sorts results based on the creationTimestamp field in reverse chronological order (newest result first). Use this to sort resources like operations so that the newest operation is returned first.  Currently, only sorting by name or creationTimestamp desc is supported.
    * @param {string=} params.pageToken Specifies a page token to use. Set pageToken to the nextPageToken returned by a previous list request to get the next page of results.
    * @param {string} params.project Project ID for this request.
    * @param {string} params.zone The name of the zone where the network endpoint group is located. It should comply with RFC1035.
    * @param {().NetworkEndpointGroupsListEndpointsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def listNetworkEndpoints(): GaxiosPromise[SchemaNetworkEndpointGroupsListNetworkEndpoints] = js.native
  def listNetworkEndpoints(callback: BodyResponseCallback[SchemaNetworkEndpointGroupsListNetworkEndpoints]): Unit = js.native
  def listNetworkEndpoints(params: Unit, options: MethodOptions): GaxiosPromise[SchemaNetworkEndpointGroupsListNetworkEndpoints] = js.native
  def listNetworkEndpoints(params: ParamsResourceNetworkendpointgroupsListnetworkendpoints): GaxiosPromise[SchemaNetworkEndpointGroupsListNetworkEndpoints] = js.native
  def listNetworkEndpoints(
    params: ParamsResourceNetworkendpointgroupsListnetworkendpoints,
    callback: BodyResponseCallback[SchemaNetworkEndpointGroupsListNetworkEndpoints]
  ): Unit = js.native
  def listNetworkEndpoints(
    params: ParamsResourceNetworkendpointgroupsListnetworkendpoints,
    options: BodyResponseCallback[SchemaNetworkEndpointGroupsListNetworkEndpoints],
    callback: BodyResponseCallback[SchemaNetworkEndpointGroupsListNetworkEndpoints]
  ): Unit = js.native
  def listNetworkEndpoints(params: ParamsResourceNetworkendpointgroupsListnetworkendpoints, options: MethodOptions): GaxiosPromise[SchemaNetworkEndpointGroupsListNetworkEndpoints] = js.native
  def listNetworkEndpoints(
    params: ParamsResourceNetworkendpointgroupsListnetworkendpoints,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaNetworkEndpointGroupsListNetworkEndpoints]
  ): Unit = js.native
  
  /**
    * compute.networkEndpointGroups.testIamPermissions
    * @desc Returns permissions that a caller has on the specified resource.
    * @alias compute.networkEndpointGroups.testIamPermissions
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string} params.resource_ Name or id of the resource for this request.
    * @param {string} params.zone The name of the zone for this request.
    * @param {().TestPermissionsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def testIamPermissions(): GaxiosPromise[SchemaTestPermissionsResponse] = js.native
  def testIamPermissions(callback: BodyResponseCallback[SchemaTestPermissionsResponse]): Unit = js.native
  def testIamPermissions(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTestPermissionsResponse] = js.native
  def testIamPermissions(params: ParamsResourceNetworkendpointgroupsTestiampermissions): GaxiosPromise[SchemaTestPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceNetworkendpointgroupsTestiampermissions,
    callback: BodyResponseCallback[SchemaTestPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceNetworkendpointgroupsTestiampermissions,
    options: BodyResponseCallback[SchemaTestPermissionsResponse],
    callback: BodyResponseCallback[SchemaTestPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(params: ParamsResourceNetworkendpointgroupsTestiampermissions, options: MethodOptions): GaxiosPromise[SchemaTestPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceNetworkendpointgroupsTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTestPermissionsResponse]
  ): Unit = js.native
}
