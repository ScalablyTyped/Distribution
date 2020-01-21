package typings.googleapis.alphaMod.computeAlpha

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/compute/alpha", "compute_alpha.Resource$Nodegroups")
@js.native
class ResourceNodegroups protected () extends js.Object {
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
  def addNodes(): GaxiosPromise[SchemaOperation] = js.native
  def addNodes(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def addNodes(params: ParamsResourceNodegroupsAddnodes): GaxiosPromise[SchemaOperation] = js.native
  def addNodes(params: ParamsResourceNodegroupsAddnodes, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def addNodes(
    params: ParamsResourceNodegroupsAddnodes,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def addNodes(params: ParamsResourceNodegroupsAddnodes, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def addNodes(
    params: ParamsResourceNodegroupsAddnodes,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
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
  def aggregatedList(): GaxiosPromise[SchemaNodeGroupAggregatedList] = js.native
  def aggregatedList(callback: BodyResponseCallback[SchemaNodeGroupAggregatedList]): Unit = js.native
  def aggregatedList(params: ParamsResourceNodegroupsAggregatedlist): GaxiosPromise[SchemaNodeGroupAggregatedList] = js.native
  def aggregatedList(
    params: ParamsResourceNodegroupsAggregatedlist,
    callback: BodyResponseCallback[SchemaNodeGroupAggregatedList]
  ): Unit = js.native
  def aggregatedList(
    params: ParamsResourceNodegroupsAggregatedlist,
    options: BodyResponseCallback[SchemaNodeGroupAggregatedList],
    callback: BodyResponseCallback[SchemaNodeGroupAggregatedList]
  ): Unit = js.native
  def aggregatedList(params: ParamsResourceNodegroupsAggregatedlist, options: MethodOptions): GaxiosPromise[SchemaNodeGroupAggregatedList] = js.native
  def aggregatedList(
    params: ParamsResourceNodegroupsAggregatedlist,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaNodeGroupAggregatedList]
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
  def delete(): GaxiosPromise[SchemaOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(params: ParamsResourceNodegroupsDelete): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceNodegroupsDelete, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(
    params: ParamsResourceNodegroupsDelete,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceNodegroupsDelete, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceNodegroupsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
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
  def deleteNodes(): GaxiosPromise[SchemaOperation] = js.native
  def deleteNodes(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def deleteNodes(params: ParamsResourceNodegroupsDeletenodes): GaxiosPromise[SchemaOperation] = js.native
  def deleteNodes(params: ParamsResourceNodegroupsDeletenodes, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def deleteNodes(
    params: ParamsResourceNodegroupsDeletenodes,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def deleteNodes(params: ParamsResourceNodegroupsDeletenodes, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def deleteNodes(
    params: ParamsResourceNodegroupsDeletenodes,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
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
  def get(): GaxiosPromise[SchemaNodeGroup] = js.native
  def get(callback: BodyResponseCallback[SchemaNodeGroup]): Unit = js.native
  def get(params: ParamsResourceNodegroupsGet): GaxiosPromise[SchemaNodeGroup] = js.native
  def get(params: ParamsResourceNodegroupsGet, callback: BodyResponseCallback[SchemaNodeGroup]): Unit = js.native
  def get(
    params: ParamsResourceNodegroupsGet,
    options: BodyResponseCallback[SchemaNodeGroup],
    callback: BodyResponseCallback[SchemaNodeGroup]
  ): Unit = js.native
  def get(params: ParamsResourceNodegroupsGet, options: MethodOptions): GaxiosPromise[SchemaNodeGroup] = js.native
  def get(
    params: ParamsResourceNodegroupsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaNodeGroup]
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
  def getIamPolicy(): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def getIamPolicy(params: ParamsResourceNodegroupsGetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(params: ParamsResourceNodegroupsGetiampolicy, callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def getIamPolicy(
    params: ParamsResourceNodegroupsGetiampolicy,
    options: BodyResponseCallback[SchemaPolicy],
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def getIamPolicy(params: ParamsResourceNodegroupsGetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def getIamPolicy(
    params: ParamsResourceNodegroupsGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
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
  def insert(): GaxiosPromise[SchemaOperation] = js.native
  def insert(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def insert(params: ParamsResourceNodegroupsInsert): GaxiosPromise[SchemaOperation] = js.native
  def insert(params: ParamsResourceNodegroupsInsert, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def insert(
    params: ParamsResourceNodegroupsInsert,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def insert(params: ParamsResourceNodegroupsInsert, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def insert(
    params: ParamsResourceNodegroupsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
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
  def list(): GaxiosPromise[SchemaNodeGroupList] = js.native
  def list(callback: BodyResponseCallback[SchemaNodeGroupList]): Unit = js.native
  def list(params: ParamsResourceNodegroupsList): GaxiosPromise[SchemaNodeGroupList] = js.native
  def list(params: ParamsResourceNodegroupsList, callback: BodyResponseCallback[SchemaNodeGroupList]): Unit = js.native
  def list(
    params: ParamsResourceNodegroupsList,
    options: BodyResponseCallback[SchemaNodeGroupList],
    callback: BodyResponseCallback[SchemaNodeGroupList]
  ): Unit = js.native
  def list(params: ParamsResourceNodegroupsList, options: MethodOptions): GaxiosPromise[SchemaNodeGroupList] = js.native
  def list(
    params: ParamsResourceNodegroupsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaNodeGroupList]
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
  def listNodes(): GaxiosPromise[SchemaNodeGroupsListNodes] = js.native
  def listNodes(callback: BodyResponseCallback[SchemaNodeGroupsListNodes]): Unit = js.native
  def listNodes(params: ParamsResourceNodegroupsListnodes): GaxiosPromise[SchemaNodeGroupsListNodes] = js.native
  def listNodes(
    params: ParamsResourceNodegroupsListnodes,
    callback: BodyResponseCallback[SchemaNodeGroupsListNodes]
  ): Unit = js.native
  def listNodes(
    params: ParamsResourceNodegroupsListnodes,
    options: BodyResponseCallback[SchemaNodeGroupsListNodes],
    callback: BodyResponseCallback[SchemaNodeGroupsListNodes]
  ): Unit = js.native
  def listNodes(params: ParamsResourceNodegroupsListnodes, options: MethodOptions): GaxiosPromise[SchemaNodeGroupsListNodes] = js.native
  def listNodes(
    params: ParamsResourceNodegroupsListnodes,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaNodeGroupsListNodes]
  ): Unit = js.native
  /**
    * compute.nodeGroups.setAutoscalingPolicy
    * @desc Sets the autoscaling policy of the node group.
    * @alias compute.nodeGroups.setAutoscalingPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.nodeGroup Name of the NodeGroup resource to update.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {string} params.zone The name of the zone for this request.
    * @param {().NodeGroupsSetAutoscalingPolicyRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setAutoscalingPolicy(): GaxiosPromise[SchemaOperation] = js.native
  def setAutoscalingPolicy(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def setAutoscalingPolicy(params: ParamsResourceNodegroupsSetautoscalingpolicy): GaxiosPromise[SchemaOperation] = js.native
  def setAutoscalingPolicy(
    params: ParamsResourceNodegroupsSetautoscalingpolicy,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setAutoscalingPolicy(
    params: ParamsResourceNodegroupsSetautoscalingpolicy,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setAutoscalingPolicy(params: ParamsResourceNodegroupsSetautoscalingpolicy, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setAutoscalingPolicy(
    params: ParamsResourceNodegroupsSetautoscalingpolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
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
  def setIamPolicy(): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def setIamPolicy(params: ParamsResourceNodegroupsSetiampolicy): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(params: ParamsResourceNodegroupsSetiampolicy, callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def setIamPolicy(
    params: ParamsResourceNodegroupsSetiampolicy,
    options: BodyResponseCallback[SchemaPolicy],
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def setIamPolicy(params: ParamsResourceNodegroupsSetiampolicy, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def setIamPolicy(
    params: ParamsResourceNodegroupsSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
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
  def setNodeTemplate(): GaxiosPromise[SchemaOperation] = js.native
  def setNodeTemplate(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def setNodeTemplate(params: ParamsResourceNodegroupsSetnodetemplate): GaxiosPromise[SchemaOperation] = js.native
  def setNodeTemplate(params: ParamsResourceNodegroupsSetnodetemplate, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def setNodeTemplate(
    params: ParamsResourceNodegroupsSetnodetemplate,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setNodeTemplate(params: ParamsResourceNodegroupsSetnodetemplate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setNodeTemplate(
    params: ParamsResourceNodegroupsSetnodetemplate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
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
  def testIamPermissions(): GaxiosPromise[SchemaTestPermissionsResponse] = js.native
  def testIamPermissions(callback: BodyResponseCallback[SchemaTestPermissionsResponse]): Unit = js.native
  def testIamPermissions(params: ParamsResourceNodegroupsTestiampermissions): GaxiosPromise[SchemaTestPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceNodegroupsTestiampermissions,
    callback: BodyResponseCallback[SchemaTestPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceNodegroupsTestiampermissions,
    options: BodyResponseCallback[SchemaTestPermissionsResponse],
    callback: BodyResponseCallback[SchemaTestPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(params: ParamsResourceNodegroupsTestiampermissions, options: MethodOptions): GaxiosPromise[SchemaTestPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceNodegroupsTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTestPermissionsResponse]
  ): Unit = js.native
}

