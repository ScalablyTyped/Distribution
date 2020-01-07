package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/compute/alpha", "compute_alpha.Resource$Networks")
@js.native
class Resource$Networks protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * compute.networks.addPeering
    * @desc Adds a peering to the specified network.
    * @alias compute.networks.addPeering
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.network Name of the network resource to add peering to.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {().NetworksAddPeeringRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def addPeering(): GaxiosPromise[Schema$Operation] = js.native
  def addPeering(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def addPeering(params: ParamsDollarResourceDollarNetworksDollarAddpeering): GaxiosPromise[Schema$Operation] = js.native
  def addPeering(
    params: ParamsDollarResourceDollarNetworksDollarAddpeering,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def addPeering(
    params: ParamsDollarResourceDollarNetworksDollarAddpeering,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def addPeering(params: ParamsDollarResourceDollarNetworksDollarAddpeering, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def addPeering(
    params: ParamsDollarResourceDollarNetworksDollarAddpeering,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * compute.networks.delete
    * @desc Deletes the specified network.
    * @alias compute.networks.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.network Name of the network to delete.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Operation] = js.native
  def delete(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarNetworksDollarDelete): GaxiosPromise[Schema$Operation] = js.native
  def delete(
    params: ParamsDollarResourceDollarNetworksDollarDelete,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarNetworksDollarDelete,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarNetworksDollarDelete, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def delete(
    params: ParamsDollarResourceDollarNetworksDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * compute.networks.get
    * @desc Returns the specified network. Gets a list of available networks by
    * making a list() request.
    * @alias compute.networks.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.network Name of the network to return.
    * @param {string} params.project Project ID for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Network] = js.native
  def get(callback: BodyResponseCallback[Schema$Network]): Unit = js.native
  def get(params: ParamsDollarResourceDollarNetworksDollarGet): GaxiosPromise[Schema$Network] = js.native
  def get(
    params: ParamsDollarResourceDollarNetworksDollarGet,
    callback: BodyResponseCallback[Schema$Network]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarNetworksDollarGet,
    options: BodyResponseCallback[Schema$Network],
    callback: BodyResponseCallback[Schema$Network]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarNetworksDollarGet, options: MethodOptions): GaxiosPromise[Schema$Network] = js.native
  def get(
    params: ParamsDollarResourceDollarNetworksDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Network]
  ): Unit = js.native
  /**
    * compute.networks.insert
    * @desc Creates a network in the specified project using the data included
    * in the request.
    * @alias compute.networks.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {().Network} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$Operation] = js.native
  def insert(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarNetworksDollarInsert): GaxiosPromise[Schema$Operation] = js.native
  def insert(
    params: ParamsDollarResourceDollarNetworksDollarInsert,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarNetworksDollarInsert,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarNetworksDollarInsert, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def insert(
    params: ParamsDollarResourceDollarNetworksDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * compute.networks.list
    * @desc Retrieves the list of networks available to the specified project.
    * @alias compute.networks.list
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
  def list(): GaxiosPromise[Schema$NetworkList] = js.native
  def list(callback: BodyResponseCallback[Schema$NetworkList]): Unit = js.native
  def list(params: ParamsDollarResourceDollarNetworksDollarList): GaxiosPromise[Schema$NetworkList] = js.native
  def list(
    params: ParamsDollarResourceDollarNetworksDollarList,
    callback: BodyResponseCallback[Schema$NetworkList]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarNetworksDollarList,
    options: BodyResponseCallback[Schema$NetworkList],
    callback: BodyResponseCallback[Schema$NetworkList]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarNetworksDollarList, options: MethodOptions): GaxiosPromise[Schema$NetworkList] = js.native
  def list(
    params: ParamsDollarResourceDollarNetworksDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$NetworkList]
  ): Unit = js.native
  /**
    * compute.networks.listIpAddresses
    * @desc Lists the internal IP addresses in the specified network.
    * @alias compute.networks.listIpAddresses
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter A filter expression that filters resources listed in the response. The expression must specify the field name, a comparison operator, and the value that you want to use for filtering. The value must be a string, a number, or a boolean. The comparison operator must be either =, !=, >, or <.  For example, if you are filtering Compute Engine instances, you can exclude instances named example-instance by specifying name != example-instance.  You can also filter nested fields. For example, you could specify scheduling.automaticRestart = false to include instances only if they are not scheduled for automatic restarts. You can use filtering on nested fields to filter based on resource labels.  To filter on multiple expressions, provide each separate expression within parentheses. For example, (scheduling.automaticRestart = true) (cpuPlatform = "Intel Skylake"). By default, each expression is an AND expression. However, you can include AND and OR expressions explicitly. For example, (cpuPlatform = "Intel Skylake") OR (cpuPlatform = "Intel Broadwell") AND (scheduling.automaticRestart = true).
    * @param {integer=} params.maxResults The maximum number of results per page that should be returned. If the number of available results is larger than maxResults, Compute Engine returns a nextPageToken that can be used to get the next page of results in subsequent list requests. Acceptable values are 0 to 500, inclusive. (Default: 500)
    * @param {string} params.network Name of the network for this request.
    * @param {string=} params.orderBy Sorts list results by a certain order. By default, results are returned in alphanumerical order based on the resource name.  You can also sort results in descending order based on the creation timestamp using orderBy="creationTimestamp desc". This sorts results based on the creationTimestamp field in reverse chronological order (newest result first). Use this to sort resources like operations so that the newest operation is returned first.  Currently, only sorting by name or creationTimestamp desc is supported.
    * @param {string=} params.pageToken Specifies a page token to use. Set pageToken to the nextPageToken returned by a previous list request to get the next page of results.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.types (Optional) types filter separate by comma, valid values are: SUBNETWORK, RESERVED, PEER_USED, PEER_RESERVED, REMOTE_USED, REMOTE_RESERVED.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def listIpAddresses(): GaxiosPromise[Schema$IpAddressesList] = js.native
  def listIpAddresses(callback: BodyResponseCallback[Schema$IpAddressesList]): Unit = js.native
  def listIpAddresses(params: ParamsDollarResourceDollarNetworksDollarListipaddresses): GaxiosPromise[Schema$IpAddressesList] = js.native
  def listIpAddresses(
    params: ParamsDollarResourceDollarNetworksDollarListipaddresses,
    callback: BodyResponseCallback[Schema$IpAddressesList]
  ): Unit = js.native
  def listIpAddresses(
    params: ParamsDollarResourceDollarNetworksDollarListipaddresses,
    options: BodyResponseCallback[Schema$IpAddressesList],
    callback: BodyResponseCallback[Schema$IpAddressesList]
  ): Unit = js.native
  def listIpAddresses(params: ParamsDollarResourceDollarNetworksDollarListipaddresses, options: MethodOptions): GaxiosPromise[Schema$IpAddressesList] = js.native
  def listIpAddresses(
    params: ParamsDollarResourceDollarNetworksDollarListipaddresses,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$IpAddressesList]
  ): Unit = js.native
  /**
    * compute.networks.listIpOwners
    * @desc Lists the internal IP owners in the specified network.
    * @alias compute.networks.listIpOwners
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter A filter expression that filters resources listed in the response. The expression must specify the field name, a comparison operator, and the value that you want to use for filtering. The value must be a string, a number, or a boolean. The comparison operator must be either =, !=, >, or <.  For example, if you are filtering Compute Engine instances, you can exclude instances named example-instance by specifying name != example-instance.  You can also filter nested fields. For example, you could specify scheduling.automaticRestart = false to include instances only if they are not scheduled for automatic restarts. You can use filtering on nested fields to filter based on resource labels.  To filter on multiple expressions, provide each separate expression within parentheses. For example, (scheduling.automaticRestart = true) (cpuPlatform = "Intel Skylake"). By default, each expression is an AND expression. However, you can include AND and OR expressions explicitly. For example, (cpuPlatform = "Intel Skylake") OR (cpuPlatform = "Intel Broadwell") AND (scheduling.automaticRestart = true).
    * @param {string=} params.ipCidrRange (Optional) IP CIDR range filter, example: "10.128.10.0/30".
    * @param {integer=} params.maxResults The maximum number of results per page that should be returned. If the number of available results is larger than maxResults, Compute Engine returns a nextPageToken that can be used to get the next page of results in subsequent list requests. Acceptable values are 0 to 500, inclusive. (Default: 500)
    * @param {string} params.network Name of the network to return.
    * @param {string=} params.orderBy Sorts list results by a certain order. By default, results are returned in alphanumerical order based on the resource name.  You can also sort results in descending order based on the creation timestamp using orderBy="creationTimestamp desc". This sorts results based on the creationTimestamp field in reverse chronological order (newest result first). Use this to sort resources like operations so that the newest operation is returned first.  Currently, only sorting by name or creationTimestamp desc is supported.
    * @param {string=} params.ownerProjects (Optional) Project IDs filter, example: "project-1,project-2".
    * @param {string=} params.ownerTypes (Optional) Owner types filter, example: "instance,forwardingRule".
    * @param {string=} params.pageToken Specifies a page token to use. Set pageToken to the nextPageToken returned by a previous list request to get the next page of results.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.subnetName (Optional) Subnetwork name filter.
    * @param {string=} params.subnetRegion (Optional) Subnetwork region filter.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def listIpOwners(): GaxiosPromise[Schema$IpOwnerList] = js.native
  def listIpOwners(callback: BodyResponseCallback[Schema$IpOwnerList]): Unit = js.native
  def listIpOwners(params: ParamsDollarResourceDollarNetworksDollarListipowners): GaxiosPromise[Schema$IpOwnerList] = js.native
  def listIpOwners(
    params: ParamsDollarResourceDollarNetworksDollarListipowners,
    callback: BodyResponseCallback[Schema$IpOwnerList]
  ): Unit = js.native
  def listIpOwners(
    params: ParamsDollarResourceDollarNetworksDollarListipowners,
    options: BodyResponseCallback[Schema$IpOwnerList],
    callback: BodyResponseCallback[Schema$IpOwnerList]
  ): Unit = js.native
  def listIpOwners(params: ParamsDollarResourceDollarNetworksDollarListipowners, options: MethodOptions): GaxiosPromise[Schema$IpOwnerList] = js.native
  def listIpOwners(
    params: ParamsDollarResourceDollarNetworksDollarListipowners,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$IpOwnerList]
  ): Unit = js.native
  /**
    * compute.networks.listPeeringRoutes
    * @desc Lists the peering routes exchanged over peering connection.
    * @alias compute.networks.listPeeringRoutes
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.direction The direction of the exchanged routes.
    * @param {string=} params.filter A filter expression that filters resources listed in the response. The expression must specify the field name, a comparison operator, and the value that you want to use for filtering. The value must be a string, a number, or a boolean. The comparison operator must be either =, !=, >, or <.  For example, if you are filtering Compute Engine instances, you can exclude instances named example-instance by specifying name != example-instance.  You can also filter nested fields. For example, you could specify scheduling.automaticRestart = false to include instances only if they are not scheduled for automatic restarts. You can use filtering on nested fields to filter based on resource labels.  To filter on multiple expressions, provide each separate expression within parentheses. For example, (scheduling.automaticRestart = true) (cpuPlatform = "Intel Skylake"). By default, each expression is an AND expression. However, you can include AND and OR expressions explicitly. For example, (cpuPlatform = "Intel Skylake") OR (cpuPlatform = "Intel Broadwell") AND (scheduling.automaticRestart = true).
    * @param {integer=} params.maxResults The maximum number of results per page that should be returned. If the number of available results is larger than maxResults, Compute Engine returns a nextPageToken that can be used to get the next page of results in subsequent list requests. Acceptable values are 0 to 500, inclusive. (Default: 500)
    * @param {string} params.network Name of the network for this request.
    * @param {string=} params.orderBy Sorts list results by a certain order. By default, results are returned in alphanumerical order based on the resource name.  You can also sort results in descending order based on the creation timestamp using orderBy="creationTimestamp desc". This sorts results based on the creationTimestamp field in reverse chronological order (newest result first). Use this to sort resources like operations so that the newest operation is returned first.  Currently, only sorting by name or creationTimestamp desc is supported.
    * @param {string=} params.pageToken Specifies a page token to use. Set pageToken to the nextPageToken returned by a previous list request to get the next page of results.
    * @param {string=} params.peeringName The response will show routes exchanged over the given peering connection.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.region The region of the request. The response will include all subnet routes, static routes and dynamic routes in the region.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def listPeeringRoutes(): GaxiosPromise[Schema$ExchangedPeeringRoutesList] = js.native
  def listPeeringRoutes(callback: BodyResponseCallback[Schema$ExchangedPeeringRoutesList]): Unit = js.native
  def listPeeringRoutes(params: ParamsDollarResourceDollarNetworksDollarListpeeringroutes): GaxiosPromise[Schema$ExchangedPeeringRoutesList] = js.native
  def listPeeringRoutes(
    params: ParamsDollarResourceDollarNetworksDollarListpeeringroutes,
    callback: BodyResponseCallback[Schema$ExchangedPeeringRoutesList]
  ): Unit = js.native
  def listPeeringRoutes(
    params: ParamsDollarResourceDollarNetworksDollarListpeeringroutes,
    options: BodyResponseCallback[Schema$ExchangedPeeringRoutesList],
    callback: BodyResponseCallback[Schema$ExchangedPeeringRoutesList]
  ): Unit = js.native
  def listPeeringRoutes(params: ParamsDollarResourceDollarNetworksDollarListpeeringroutes, options: MethodOptions): GaxiosPromise[Schema$ExchangedPeeringRoutesList] = js.native
  def listPeeringRoutes(
    params: ParamsDollarResourceDollarNetworksDollarListpeeringroutes,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ExchangedPeeringRoutesList]
  ): Unit = js.native
  /**
    * compute.networks.patch
    * @desc Patches the specified network with the data included in the
    * request. Only the following fields can be modified:
    * routingConfig.routingMode.
    * @alias compute.networks.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.network Name of the network to update.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {().Network} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$Operation] = js.native
  def patch(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarNetworksDollarPatch): GaxiosPromise[Schema$Operation] = js.native
  def patch(
    params: ParamsDollarResourceDollarNetworksDollarPatch,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarNetworksDollarPatch,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarNetworksDollarPatch, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def patch(
    params: ParamsDollarResourceDollarNetworksDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * compute.networks.removePeering
    * @desc Removes a peering from the specified network.
    * @alias compute.networks.removePeering
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.network Name of the network resource to remove peering from.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {().NetworksRemovePeeringRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def removePeering(): GaxiosPromise[Schema$Operation] = js.native
  def removePeering(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def removePeering(params: ParamsDollarResourceDollarNetworksDollarRemovepeering): GaxiosPromise[Schema$Operation] = js.native
  def removePeering(
    params: ParamsDollarResourceDollarNetworksDollarRemovepeering,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def removePeering(
    params: ParamsDollarResourceDollarNetworksDollarRemovepeering,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def removePeering(params: ParamsDollarResourceDollarNetworksDollarRemovepeering, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def removePeering(
    params: ParamsDollarResourceDollarNetworksDollarRemovepeering,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * compute.networks.switchToCustomMode
    * @desc Switches the network mode from auto subnet mode to custom subnet
    * mode.
    * @alias compute.networks.switchToCustomMode
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.network Name of the network to be updated.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def switchToCustomMode(): GaxiosPromise[Schema$Operation] = js.native
  def switchToCustomMode(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def switchToCustomMode(params: ParamsDollarResourceDollarNetworksDollarSwitchtocustommode): GaxiosPromise[Schema$Operation] = js.native
  def switchToCustomMode(
    params: ParamsDollarResourceDollarNetworksDollarSwitchtocustommode,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def switchToCustomMode(
    params: ParamsDollarResourceDollarNetworksDollarSwitchtocustommode,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def switchToCustomMode(params: ParamsDollarResourceDollarNetworksDollarSwitchtocustommode, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def switchToCustomMode(
    params: ParamsDollarResourceDollarNetworksDollarSwitchtocustommode,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * compute.networks.testIamPermissions
    * @desc Returns permissions that a caller has on the specified resource.
    * @alias compute.networks.testIamPermissions
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string} params.resource_ Name or id of the resource for this request.
    * @param {().TestPermissionsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def testIamPermissions(): GaxiosPromise[Schema$TestPermissionsResponse] = js.native
  def testIamPermissions(callback: BodyResponseCallback[Schema$TestPermissionsResponse]): Unit = js.native
  def testIamPermissions(params: ParamsDollarResourceDollarNetworksDollarTestiampermissions): GaxiosPromise[Schema$TestPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarNetworksDollarTestiampermissions,
    callback: BodyResponseCallback[Schema$TestPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarNetworksDollarTestiampermissions,
    options: BodyResponseCallback[Schema$TestPermissionsResponse],
    callback: BodyResponseCallback[Schema$TestPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(params: ParamsDollarResourceDollarNetworksDollarTestiampermissions, options: MethodOptions): GaxiosPromise[Schema$TestPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarNetworksDollarTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$TestPermissionsResponse]
  ): Unit = js.native
  /**
    * compute.networks.updatePeering
    * @desc Updates the specified network peering with the data included in the
    * request Only the following fields can be modified:
    * NetworkPeering.export_custom_routes, and
    * NetworkPeering.import_custom_routes
    * @alias compute.networks.updatePeering
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.network Name of the network resource which the updated peering is belonging to.
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {().NetworksUpdatePeeringRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def updatePeering(): GaxiosPromise[Schema$Operation] = js.native
  def updatePeering(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def updatePeering(params: ParamsDollarResourceDollarNetworksDollarUpdatepeering): GaxiosPromise[Schema$Operation] = js.native
  def updatePeering(
    params: ParamsDollarResourceDollarNetworksDollarUpdatepeering,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def updatePeering(
    params: ParamsDollarResourceDollarNetworksDollarUpdatepeering,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def updatePeering(params: ParamsDollarResourceDollarNetworksDollarUpdatepeering, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def updatePeering(
    params: ParamsDollarResourceDollarNetworksDollarUpdatepeering,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
}

