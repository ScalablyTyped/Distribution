package typings.googleapis.buildSrcApisComputeBetaMod.compute_beta

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/compute/beta", "compute_beta.Resource$Nodegroups")
@js.native
class Resource$Nodegroups protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * compute.nodeGroups.addNodes
    * @desc Adds specified number of nodes to the node group.
    * @alias compute.nodeGroups.addNodes
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.nodeGroup Name of the NodeGroup resource.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.zone The name of the zone for this request.
    * @param {().NodeGroupsAddNodesRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def addNodes(): GaxiosPromise[Schema$Operation] = js.native
  def addNodes(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def addNodes(params: ParamsDollarResourceDollarNodegroupsDollarAddnodes): GaxiosPromise[Schema$Operation] = js.native
  def addNodes(
    params: ParamsDollarResourceDollarNodegroupsDollarAddnodes,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def addNodes(
    params: ParamsDollarResourceDollarNodegroupsDollarAddnodes,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def addNodes(params: ParamsDollarResourceDollarNodegroupsDollarAddnodes, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def addNodes(
    params: ParamsDollarResourceDollarNodegroupsDollarAddnodes,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * compute.nodeGroups.aggregatedList
    * @desc Retrieves an aggregated list of node groups. Note: use
    * nodeGroups.listNodes for more details about each group.
    * @alias compute.nodeGroups.aggregatedList
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
  def aggregatedList(): GaxiosPromise[Schema$NodeGroupAggregatedList] = js.native
  def aggregatedList(callback: BodyResponseCallback[Schema$NodeGroupAggregatedList]): Unit = js.native
  def aggregatedList(params: ParamsDollarResourceDollarNodegroupsDollarAggregatedlist): GaxiosPromise[Schema$NodeGroupAggregatedList] = js.native
  def aggregatedList(
    params: ParamsDollarResourceDollarNodegroupsDollarAggregatedlist,
    callback: BodyResponseCallback[Schema$NodeGroupAggregatedList]
  ): Unit = js.native
  def aggregatedList(
    params: ParamsDollarResourceDollarNodegroupsDollarAggregatedlist,
    options: BodyResponseCallback[Schema$NodeGroupAggregatedList],
    callback: BodyResponseCallback[Schema$NodeGroupAggregatedList]
  ): Unit = js.native
  def aggregatedList(params: ParamsDollarResourceDollarNodegroupsDollarAggregatedlist, options: MethodOptions): GaxiosPromise[Schema$NodeGroupAggregatedList] = js.native
  def aggregatedList(
    params: ParamsDollarResourceDollarNodegroupsDollarAggregatedlist,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$NodeGroupAggregatedList]
  ): Unit = js.native
  /**
    * compute.nodeGroups.delete
    * @desc Deletes the specified NodeGroup resource.
    * @alias compute.nodeGroups.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.nodeGroup Name of the NodeGroup resource to delete.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.zone The name of the zone for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Operation] = js.native
  def delete(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarNodegroupsDollarDelete): GaxiosPromise[Schema$Operation] = js.native
  def delete(
    params: ParamsDollarResourceDollarNodegroupsDollarDelete,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarNodegroupsDollarDelete,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarNodegroupsDollarDelete, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def delete(
    params: ParamsDollarResourceDollarNodegroupsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * compute.nodeGroups.deleteNodes
    * @desc Deletes specified nodes from the node group.
    * @alias compute.nodeGroups.deleteNodes
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.nodeGroup Name of the NodeGroup resource to delete.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.zone The name of the zone for this request.
    * @param {().NodeGroupsDeleteNodesRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def deleteNodes(): GaxiosPromise[Schema$Operation] = js.native
  def deleteNodes(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def deleteNodes(params: ParamsDollarResourceDollarNodegroupsDollarDeletenodes): GaxiosPromise[Schema$Operation] = js.native
  def deleteNodes(
    params: ParamsDollarResourceDollarNodegroupsDollarDeletenodes,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def deleteNodes(
    params: ParamsDollarResourceDollarNodegroupsDollarDeletenodes,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def deleteNodes(params: ParamsDollarResourceDollarNodegroupsDollarDeletenodes, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def deleteNodes(
    params: ParamsDollarResourceDollarNodegroupsDollarDeletenodes,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * compute.nodeGroups.get
    * @desc Returns the specified NodeGroup. Get a list of available NodeGroups
    * by making a list() request. Note: the "nodes" field should not be used.
    * Use nodeGroups.listNodes instead.
    * @alias compute.nodeGroups.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.nodeGroup Name of the node group to return.
    * @param {string} params.project Project ID for this request.
    * @param {string} params.zone The name of the zone for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$NodeGroup] = js.native
  def get(callback: BodyResponseCallback[Schema$NodeGroup]): Unit = js.native
  def get(params: ParamsDollarResourceDollarNodegroupsDollarGet): GaxiosPromise[Schema$NodeGroup] = js.native
  def get(
    params: ParamsDollarResourceDollarNodegroupsDollarGet,
    callback: BodyResponseCallback[Schema$NodeGroup]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarNodegroupsDollarGet,
    options: BodyResponseCallback[Schema$NodeGroup],
    callback: BodyResponseCallback[Schema$NodeGroup]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarNodegroupsDollarGet, options: MethodOptions): GaxiosPromise[Schema$NodeGroup] = js.native
  def get(
    params: ParamsDollarResourceDollarNodegroupsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$NodeGroup]
  ): Unit = js.native
  /**
    * compute.nodeGroups.getIamPolicy
    * @desc Gets the access control policy for a resource. May be empty if no
    * such policy or resource exists.
    * @alias compute.nodeGroups.getIamPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string} params.resource_ Name or id of the resource for this request.
    * @param {string} params.zone The name of the zone for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getIamPolicy(): GaxiosPromise[Schema$Policy] = js.native
  def getIamPolicy(callback: BodyResponseCallback[Schema$Policy]): Unit = js.native
  def getIamPolicy(params: ParamsDollarResourceDollarNodegroupsDollarGetiampolicy): GaxiosPromise[Schema$Policy] = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarNodegroupsDollarGetiampolicy,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarNodegroupsDollarGetiampolicy,
    options: BodyResponseCallback[Schema$Policy],
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def getIamPolicy(params: ParamsDollarResourceDollarNodegroupsDollarGetiampolicy, options: MethodOptions): GaxiosPromise[Schema$Policy] = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarNodegroupsDollarGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  /**
    * compute.nodeGroups.insert
    * @desc Creates a NodeGroup resource in the specified project using the
    * data included in the request.
    * @alias compute.nodeGroups.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer} params.initialNodeCount Initial count of nodes in the node group.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.zone The name of the zone for this request.
    * @param {().NodeGroup} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$Operation] = js.native
  def insert(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarNodegroupsDollarInsert): GaxiosPromise[Schema$Operation] = js.native
  def insert(
    params: ParamsDollarResourceDollarNodegroupsDollarInsert,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarNodegroupsDollarInsert,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarNodegroupsDollarInsert, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def insert(
    params: ParamsDollarResourceDollarNodegroupsDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * compute.nodeGroups.list
    * @desc Retrieves a list of node groups available to the specified project.
    * Note: use nodeGroups.listNodes for more details about each group.
    * @alias compute.nodeGroups.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter A filter expression that filters resources listed in the response. The expression must specify the field name, a comparison operator, and the value that you want to use for filtering. The value must be a string, a number, or a boolean. The comparison operator must be either =, !=, >, or <.  For example, if you are filtering Compute Engine instances, you can exclude instances named example-instance by specifying name != example-instance.  You can also filter nested fields. For example, you could specify scheduling.automaticRestart = false to include instances only if they are not scheduled for automatic restarts. You can use filtering on nested fields to filter based on resource labels.  To filter on multiple expressions, provide each separate expression within parentheses. For example, (scheduling.automaticRestart = true) (cpuPlatform = "Intel Skylake"). By default, each expression is an AND expression. However, you can include AND and OR expressions explicitly. For example, (cpuPlatform = "Intel Skylake") OR (cpuPlatform = "Intel Broadwell") AND (scheduling.automaticRestart = true).
    * @param {integer=} params.maxResults The maximum number of results per page that should be returned. If the number of available results is larger than maxResults, Compute Engine returns a nextPageToken that can be used to get the next page of results in subsequent list requests. Acceptable values are 0 to 500, inclusive. (Default: 500)
    * @param {string=} params.orderBy Sorts list results by a certain order. By default, results are returned in alphanumerical order based on the resource name.  You can also sort results in descending order based on the creation timestamp using orderBy="creationTimestamp desc". This sorts results based on the creationTimestamp field in reverse chronological order (newest result first). Use this to sort resources like operations so that the newest operation is returned first.  Currently, only sorting by name or creationTimestamp desc is supported.
    * @param {string=} params.pageToken Specifies a page token to use. Set pageToken to the nextPageToken returned by a previous list request to get the next page of results.
    * @param {string} params.project Project ID for this request.
    * @param {string} params.zone The name of the zone for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$NodeGroupList] = js.native
  def list(callback: BodyResponseCallback[Schema$NodeGroupList]): Unit = js.native
  def list(params: ParamsDollarResourceDollarNodegroupsDollarList): GaxiosPromise[Schema$NodeGroupList] = js.native
  def list(
    params: ParamsDollarResourceDollarNodegroupsDollarList,
    callback: BodyResponseCallback[Schema$NodeGroupList]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarNodegroupsDollarList,
    options: BodyResponseCallback[Schema$NodeGroupList],
    callback: BodyResponseCallback[Schema$NodeGroupList]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarNodegroupsDollarList, options: MethodOptions): GaxiosPromise[Schema$NodeGroupList] = js.native
  def list(
    params: ParamsDollarResourceDollarNodegroupsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$NodeGroupList]
  ): Unit = js.native
  /**
    * compute.nodeGroups.listNodes
    * @desc Lists nodes in the node group.
    * @alias compute.nodeGroups.listNodes
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter A filter expression that filters resources listed in the response. The expression must specify the field name, a comparison operator, and the value that you want to use for filtering. The value must be a string, a number, or a boolean. The comparison operator must be either =, !=, >, or <.  For example, if you are filtering Compute Engine instances, you can exclude instances named example-instance by specifying name != example-instance.  You can also filter nested fields. For example, you could specify scheduling.automaticRestart = false to include instances only if they are not scheduled for automatic restarts. You can use filtering on nested fields to filter based on resource labels.  To filter on multiple expressions, provide each separate expression within parentheses. For example, (scheduling.automaticRestart = true) (cpuPlatform = "Intel Skylake"). By default, each expression is an AND expression. However, you can include AND and OR expressions explicitly. For example, (cpuPlatform = "Intel Skylake") OR (cpuPlatform = "Intel Broadwell") AND (scheduling.automaticRestart = true).
    * @param {integer=} params.maxResults The maximum number of results per page that should be returned. If the number of available results is larger than maxResults, Compute Engine returns a nextPageToken that can be used to get the next page of results in subsequent list requests. Acceptable values are 0 to 500, inclusive. (Default: 500)
    * @param {string} params.nodeGroup Name of the NodeGroup resource whose nodes you want to list.
    * @param {string=} params.orderBy Sorts list results by a certain order. By default, results are returned in alphanumerical order based on the resource name.  You can also sort results in descending order based on the creation timestamp using orderBy="creationTimestamp desc". This sorts results based on the creationTimestamp field in reverse chronological order (newest result first). Use this to sort resources like operations so that the newest operation is returned first.  Currently, only sorting by name or creationTimestamp desc is supported.
    * @param {string=} params.pageToken Specifies a page token to use. Set pageToken to the nextPageToken returned by a previous list request to get the next page of results.
    * @param {string} params.project Project ID for this request.
    * @param {string} params.zone The name of the zone for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def listNodes(): GaxiosPromise[Schema$NodeGroupsListNodes] = js.native
  def listNodes(callback: BodyResponseCallback[Schema$NodeGroupsListNodes]): Unit = js.native
  def listNodes(params: ParamsDollarResourceDollarNodegroupsDollarListnodes): GaxiosPromise[Schema$NodeGroupsListNodes] = js.native
  def listNodes(
    params: ParamsDollarResourceDollarNodegroupsDollarListnodes,
    callback: BodyResponseCallback[Schema$NodeGroupsListNodes]
  ): Unit = js.native
  def listNodes(
    params: ParamsDollarResourceDollarNodegroupsDollarListnodes,
    options: BodyResponseCallback[Schema$NodeGroupsListNodes],
    callback: BodyResponseCallback[Schema$NodeGroupsListNodes]
  ): Unit = js.native
  def listNodes(params: ParamsDollarResourceDollarNodegroupsDollarListnodes, options: MethodOptions): GaxiosPromise[Schema$NodeGroupsListNodes] = js.native
  def listNodes(
    params: ParamsDollarResourceDollarNodegroupsDollarListnodes,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$NodeGroupsListNodes]
  ): Unit = js.native
  /**
    * compute.nodeGroups.setIamPolicy
    * @desc Sets the access control policy on the specified resource. Replaces
    * any existing policy.
    * @alias compute.nodeGroups.setIamPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string} params.resource_ Name or id of the resource for this request.
    * @param {string} params.zone The name of the zone for this request.
    * @param {().ZoneSetPolicyRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setIamPolicy(): GaxiosPromise[Schema$Policy] = js.native
  def setIamPolicy(callback: BodyResponseCallback[Schema$Policy]): Unit = js.native
  def setIamPolicy(params: ParamsDollarResourceDollarNodegroupsDollarSetiampolicy): GaxiosPromise[Schema$Policy] = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarNodegroupsDollarSetiampolicy,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarNodegroupsDollarSetiampolicy,
    options: BodyResponseCallback[Schema$Policy],
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def setIamPolicy(params: ParamsDollarResourceDollarNodegroupsDollarSetiampolicy, options: MethodOptions): GaxiosPromise[Schema$Policy] = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarNodegroupsDollarSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  /**
    * compute.nodeGroups.setNodeTemplate
    * @desc Updates the node template of the node group.
    * @alias compute.nodeGroups.setNodeTemplate
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.nodeGroup Name of the NodeGroup resource to update.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.zone The name of the zone for this request.
    * @param {().NodeGroupsSetNodeTemplateRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setNodeTemplate(): GaxiosPromise[Schema$Operation] = js.native
  def setNodeTemplate(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def setNodeTemplate(params: ParamsDollarResourceDollarNodegroupsDollarSetnodetemplate): GaxiosPromise[Schema$Operation] = js.native
  def setNodeTemplate(
    params: ParamsDollarResourceDollarNodegroupsDollarSetnodetemplate,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def setNodeTemplate(
    params: ParamsDollarResourceDollarNodegroupsDollarSetnodetemplate,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def setNodeTemplate(params: ParamsDollarResourceDollarNodegroupsDollarSetnodetemplate, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def setNodeTemplate(
    params: ParamsDollarResourceDollarNodegroupsDollarSetnodetemplate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * compute.nodeGroups.testIamPermissions
    * @desc Returns permissions that a caller has on the specified resource.
    * @alias compute.nodeGroups.testIamPermissions
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
  def testIamPermissions(): GaxiosPromise[Schema$TestPermissionsResponse] = js.native
  def testIamPermissions(callback: BodyResponseCallback[Schema$TestPermissionsResponse]): Unit = js.native
  def testIamPermissions(params: ParamsDollarResourceDollarNodegroupsDollarTestiampermissions): GaxiosPromise[Schema$TestPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarNodegroupsDollarTestiampermissions,
    callback: BodyResponseCallback[Schema$TestPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarNodegroupsDollarTestiampermissions,
    options: BodyResponseCallback[Schema$TestPermissionsResponse],
    callback: BodyResponseCallback[Schema$TestPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(params: ParamsDollarResourceDollarNodegroupsDollarTestiampermissions, options: MethodOptions): GaxiosPromise[Schema$TestPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarNodegroupsDollarTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$TestPermissionsResponse]
  ): Unit = js.native
}

