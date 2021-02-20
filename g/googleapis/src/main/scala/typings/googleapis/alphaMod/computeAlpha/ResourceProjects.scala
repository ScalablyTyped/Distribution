package typings.googleapis.alphaMod.computeAlpha

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/compute/alpha", "compute_alpha.Resource$Projects")
@js.native
class ResourceProjects protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * compute.projects.disableXpnHost
    * @desc Disable this project as a shared VPC host project.
    * @alias compute.projects.disableXpnHost
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def disableXpnHost(): GaxiosPromise[SchemaOperation] = js.native
  def disableXpnHost(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def disableXpnHost(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def disableXpnHost(params: ParamsResourceProjectsDisablexpnhost): GaxiosPromise[SchemaOperation] = js.native
  def disableXpnHost(params: ParamsResourceProjectsDisablexpnhost, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def disableXpnHost(
    params: ParamsResourceProjectsDisablexpnhost,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def disableXpnHost(params: ParamsResourceProjectsDisablexpnhost, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def disableXpnHost(
    params: ParamsResourceProjectsDisablexpnhost,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * compute.projects.disableXpnResource
    * @desc Disable a serivce resource (a.k.a service project) associated with
    * this host project.
    * @alias compute.projects.disableXpnResource
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {().ProjectsDisableXpnResourceRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def disableXpnResource(): GaxiosPromise[SchemaOperation] = js.native
  def disableXpnResource(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def disableXpnResource(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def disableXpnResource(params: ParamsResourceProjectsDisablexpnresource): GaxiosPromise[SchemaOperation] = js.native
  def disableXpnResource(params: ParamsResourceProjectsDisablexpnresource, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def disableXpnResource(
    params: ParamsResourceProjectsDisablexpnresource,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def disableXpnResource(params: ParamsResourceProjectsDisablexpnresource, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def disableXpnResource(
    params: ParamsResourceProjectsDisablexpnresource,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * compute.projects.enableXpnHost
    * @desc Enable this project as a shared VPC host project.
    * @alias compute.projects.enableXpnHost
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def enableXpnHost(): GaxiosPromise[SchemaOperation] = js.native
  def enableXpnHost(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def enableXpnHost(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def enableXpnHost(params: ParamsResourceProjectsEnablexpnhost): GaxiosPromise[SchemaOperation] = js.native
  def enableXpnHost(params: ParamsResourceProjectsEnablexpnhost, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def enableXpnHost(
    params: ParamsResourceProjectsEnablexpnhost,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def enableXpnHost(params: ParamsResourceProjectsEnablexpnhost, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def enableXpnHost(
    params: ParamsResourceProjectsEnablexpnhost,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * compute.projects.enableXpnResource
    * @desc Enable service resource (a.k.a service project) for a host project,
    * so that subnets in the host project can be used by instances in the
    * service project.
    * @alias compute.projects.enableXpnResource
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {().ProjectsEnableXpnResourceRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def enableXpnResource(): GaxiosPromise[SchemaOperation] = js.native
  def enableXpnResource(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def enableXpnResource(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def enableXpnResource(params: ParamsResourceProjectsEnablexpnresource): GaxiosPromise[SchemaOperation] = js.native
  def enableXpnResource(params: ParamsResourceProjectsEnablexpnresource, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def enableXpnResource(
    params: ParamsResourceProjectsEnablexpnresource,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def enableXpnResource(params: ParamsResourceProjectsEnablexpnresource, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def enableXpnResource(
    params: ParamsResourceProjectsEnablexpnresource,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * compute.projects.get
    * @desc Returns the specified Project resource.
    * @alias compute.projects.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaProject] = js.native
  def get(callback: BodyResponseCallback[SchemaProject]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaProject] = js.native
  def get(params: ParamsResourceProjectsGet): GaxiosPromise[SchemaProject] = js.native
  def get(params: ParamsResourceProjectsGet, callback: BodyResponseCallback[SchemaProject]): Unit = js.native
  def get(
    params: ParamsResourceProjectsGet,
    options: BodyResponseCallback[SchemaProject],
    callback: BodyResponseCallback[SchemaProject]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsGet, options: MethodOptions): GaxiosPromise[SchemaProject] = js.native
  def get(
    params: ParamsResourceProjectsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProject]
  ): Unit = js.native
  
  /**
    * compute.projects.getXpnHost
    * @desc Gets the shared VPC host project that this project links to. May be
    * empty if no link exists.
    * @alias compute.projects.getXpnHost
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getXpnHost(): GaxiosPromise[SchemaProject] = js.native
  def getXpnHost(callback: BodyResponseCallback[SchemaProject]): Unit = js.native
  def getXpnHost(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaProject] = js.native
  def getXpnHost(params: ParamsResourceProjectsGetxpnhost): GaxiosPromise[SchemaProject] = js.native
  def getXpnHost(params: ParamsResourceProjectsGetxpnhost, callback: BodyResponseCallback[SchemaProject]): Unit = js.native
  def getXpnHost(
    params: ParamsResourceProjectsGetxpnhost,
    options: BodyResponseCallback[SchemaProject],
    callback: BodyResponseCallback[SchemaProject]
  ): Unit = js.native
  def getXpnHost(params: ParamsResourceProjectsGetxpnhost, options: MethodOptions): GaxiosPromise[SchemaProject] = js.native
  def getXpnHost(
    params: ParamsResourceProjectsGetxpnhost,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProject]
  ): Unit = js.native
  
  /**
    * compute.projects.getXpnResources
    * @desc Gets service resources (a.k.a service project) associated with this
    * host project.
    * @alias compute.projects.getXpnResources
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter A filter expression that filters resources listed in the response. The expression must specify the field name, a comparison operator, and the value that you want to use for filtering. The value must be a string, a number, or a boolean. The comparison operator must be either =, !=, >, or <.  For example, if you are filtering Compute Engine instances, you can exclude instances named example-instance by specifying name != example-instance.  You can also filter nested fields. For example, you could specify scheduling.automaticRestart = false to include instances only if they are not scheduled for automatic restarts. You can use filtering on nested fields to filter based on resource labels.  To filter on multiple expressions, provide each separate expression within parentheses. For example, (scheduling.automaticRestart = true) (cpuPlatform = "Intel Skylake"). By default, each expression is an AND expression. However, you can include AND and OR expressions explicitly. For example, (cpuPlatform = "Intel Skylake") OR (cpuPlatform = "Intel Broadwell") AND (scheduling.automaticRestart = true).
    * @param {integer=} params.maxResults The maximum number of results per page that should be returned. If the number of available results is larger than maxResults, Compute Engine returns a nextPageToken that can be used to get the next page of results in subsequent list requests. Acceptable values are 0 to 500, inclusive. (Default: 500)
    * @param {string=} params.order_by Sorts list results by a certain order. By default, results are returned in alphanumerical order based on the resource name.  You can also sort results in descending order based on the creation timestamp using orderBy="creationTimestamp desc". This sorts results based on the creationTimestamp field in reverse chronological order (newest result first). Use this to sort resources like operations so that the newest operation is returned first.  Currently, only sorting by name or creationTimestamp desc is supported.
    * @param {string=} params.pageToken Specifies a page token to use. Set pageToken to the nextPageToken returned by a previous list request to get the next page of results.
    * @param {string} params.project Project ID for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getXpnResources(): GaxiosPromise[SchemaProjectsGetXpnResources] = js.native
  def getXpnResources(callback: BodyResponseCallback[SchemaProjectsGetXpnResources]): Unit = js.native
  def getXpnResources(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaProjectsGetXpnResources] = js.native
  def getXpnResources(params: ParamsResourceProjectsGetxpnresources): GaxiosPromise[SchemaProjectsGetXpnResources] = js.native
  def getXpnResources(
    params: ParamsResourceProjectsGetxpnresources,
    callback: BodyResponseCallback[SchemaProjectsGetXpnResources]
  ): Unit = js.native
  def getXpnResources(
    params: ParamsResourceProjectsGetxpnresources,
    options: BodyResponseCallback[SchemaProjectsGetXpnResources],
    callback: BodyResponseCallback[SchemaProjectsGetXpnResources]
  ): Unit = js.native
  def getXpnResources(params: ParamsResourceProjectsGetxpnresources, options: MethodOptions): GaxiosPromise[SchemaProjectsGetXpnResources] = js.native
  def getXpnResources(
    params: ParamsResourceProjectsGetxpnresources,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProjectsGetXpnResources]
  ): Unit = js.native
  
  /**
    * compute.projects.listXpnHosts
    * @desc Lists all shared VPC host projects visible to the user in an
    * organization.
    * @alias compute.projects.listXpnHosts
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter A filter expression that filters resources listed in the response. The expression must specify the field name, a comparison operator, and the value that you want to use for filtering. The value must be a string, a number, or a boolean. The comparison operator must be either =, !=, >, or <.  For example, if you are filtering Compute Engine instances, you can exclude instances named example-instance by specifying name != example-instance.  You can also filter nested fields. For example, you could specify scheduling.automaticRestart = false to include instances only if they are not scheduled for automatic restarts. You can use filtering on nested fields to filter based on resource labels.  To filter on multiple expressions, provide each separate expression within parentheses. For example, (scheduling.automaticRestart = true) (cpuPlatform = "Intel Skylake"). By default, each expression is an AND expression. However, you can include AND and OR expressions explicitly. For example, (cpuPlatform = "Intel Skylake") OR (cpuPlatform = "Intel Broadwell") AND (scheduling.automaticRestart = true).
    * @param {integer=} params.maxResults The maximum number of results per page that should be returned. If the number of available results is larger than maxResults, Compute Engine returns a nextPageToken that can be used to get the next page of results in subsequent list requests. Acceptable values are 0 to 500, inclusive. (Default: 500)
    * @param {string=} params.order_by Sorts list results by a certain order. By default, results are returned in alphanumerical order based on the resource name.  You can also sort results in descending order based on the creation timestamp using orderBy="creationTimestamp desc". This sorts results based on the creationTimestamp field in reverse chronological order (newest result first). Use this to sort resources like operations so that the newest operation is returned first.  Currently, only sorting by name or creationTimestamp desc is supported.
    * @param {string=} params.pageToken Specifies a page token to use. Set pageToken to the nextPageToken returned by a previous list request to get the next page of results.
    * @param {string} params.project Project ID for this request.
    * @param {().ProjectsListXpnHostsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def listXpnHosts(): GaxiosPromise[SchemaXpnHostList] = js.native
  def listXpnHosts(callback: BodyResponseCallback[SchemaXpnHostList]): Unit = js.native
  def listXpnHosts(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaXpnHostList] = js.native
  def listXpnHosts(params: ParamsResourceProjectsListxpnhosts): GaxiosPromise[SchemaXpnHostList] = js.native
  def listXpnHosts(params: ParamsResourceProjectsListxpnhosts, callback: BodyResponseCallback[SchemaXpnHostList]): Unit = js.native
  def listXpnHosts(
    params: ParamsResourceProjectsListxpnhosts,
    options: BodyResponseCallback[SchemaXpnHostList],
    callback: BodyResponseCallback[SchemaXpnHostList]
  ): Unit = js.native
  def listXpnHosts(params: ParamsResourceProjectsListxpnhosts, options: MethodOptions): GaxiosPromise[SchemaXpnHostList] = js.native
  def listXpnHosts(
    params: ParamsResourceProjectsListxpnhosts,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaXpnHostList]
  ): Unit = js.native
  
  /**
    * compute.projects.moveDisk
    * @desc Moves a persistent disk from one zone to another.
    * @alias compute.projects.moveDisk
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {().DiskMoveRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def moveDisk(): GaxiosPromise[SchemaOperation] = js.native
  def moveDisk(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def moveDisk(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def moveDisk(params: ParamsResourceProjectsMovedisk): GaxiosPromise[SchemaOperation] = js.native
  def moveDisk(params: ParamsResourceProjectsMovedisk, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def moveDisk(
    params: ParamsResourceProjectsMovedisk,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def moveDisk(params: ParamsResourceProjectsMovedisk, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def moveDisk(
    params: ParamsResourceProjectsMovedisk,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * compute.projects.moveInstance
    * @desc Moves an instance and its attached persistent disks from one zone
    * to another.
    * @alias compute.projects.moveInstance
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {().InstanceMoveRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def moveInstance(): GaxiosPromise[SchemaOperation] = js.native
  def moveInstance(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def moveInstance(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def moveInstance(params: ParamsResourceProjectsMoveinstance): GaxiosPromise[SchemaOperation] = js.native
  def moveInstance(params: ParamsResourceProjectsMoveinstance, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def moveInstance(
    params: ParamsResourceProjectsMoveinstance,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def moveInstance(params: ParamsResourceProjectsMoveinstance, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def moveInstance(
    params: ParamsResourceProjectsMoveinstance,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * compute.projects.setCommonInstanceMetadata
    * @desc Sets metadata common to all instances within the specified project
    * using the data included in the request.
    * @alias compute.projects.setCommonInstanceMetadata
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {().Metadata} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setCommonInstanceMetadata(): GaxiosPromise[SchemaOperation] = js.native
  def setCommonInstanceMetadata(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def setCommonInstanceMetadata(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setCommonInstanceMetadata(params: ParamsResourceProjectsSetcommoninstancemetadata): GaxiosPromise[SchemaOperation] = js.native
  def setCommonInstanceMetadata(
    params: ParamsResourceProjectsSetcommoninstancemetadata,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setCommonInstanceMetadata(
    params: ParamsResourceProjectsSetcommoninstancemetadata,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setCommonInstanceMetadata(params: ParamsResourceProjectsSetcommoninstancemetadata, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setCommonInstanceMetadata(
    params: ParamsResourceProjectsSetcommoninstancemetadata,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * compute.projects.setDefaultNetworkTier
    * @desc Sets the default network tier of the project. The default network
    * tier is used when an address/forwardingRule/instance is created without
    * specifying the network tier field.
    * @alias compute.projects.setDefaultNetworkTier
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {().ProjectsSetDefaultNetworkTierRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setDefaultNetworkTier(): GaxiosPromise[SchemaOperation] = js.native
  def setDefaultNetworkTier(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def setDefaultNetworkTier(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setDefaultNetworkTier(params: ParamsResourceProjectsSetdefaultnetworktier): GaxiosPromise[SchemaOperation] = js.native
  def setDefaultNetworkTier(
    params: ParamsResourceProjectsSetdefaultnetworktier,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setDefaultNetworkTier(
    params: ParamsResourceProjectsSetdefaultnetworktier,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setDefaultNetworkTier(params: ParamsResourceProjectsSetdefaultnetworktier, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setDefaultNetworkTier(
    params: ParamsResourceProjectsSetdefaultnetworktier,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * compute.projects.setDefaultServiceAccount
    * @desc Sets the default service account of the project. The default
    * service account is used when a VM instance is created with the service
    * account email address set to "default".
    * @alias compute.projects.setDefaultServiceAccount
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {().ProjectsSetDefaultServiceAccountRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setDefaultServiceAccount(): GaxiosPromise[SchemaOperation] = js.native
  def setDefaultServiceAccount(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def setDefaultServiceAccount(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setDefaultServiceAccount(params: ParamsResourceProjectsSetdefaultserviceaccount): GaxiosPromise[SchemaOperation] = js.native
  def setDefaultServiceAccount(
    params: ParamsResourceProjectsSetdefaultserviceaccount,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setDefaultServiceAccount(
    params: ParamsResourceProjectsSetdefaultserviceaccount,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setDefaultServiceAccount(params: ParamsResourceProjectsSetdefaultserviceaccount, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setDefaultServiceAccount(
    params: ParamsResourceProjectsSetdefaultserviceaccount,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * compute.projects.setUsageExportBucket
    * @desc Enables the usage export feature and sets the usage export bucket
    * where reports are stored. If you provide an empty request body using this
    * method, the usage export feature will be disabled.
    * @alias compute.projects.setUsageExportBucket
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {().UsageExportLocation} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setUsageExportBucket(): GaxiosPromise[SchemaOperation] = js.native
  def setUsageExportBucket(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def setUsageExportBucket(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setUsageExportBucket(params: ParamsResourceProjectsSetusageexportbucket): GaxiosPromise[SchemaOperation] = js.native
  def setUsageExportBucket(
    params: ParamsResourceProjectsSetusageexportbucket,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setUsageExportBucket(
    params: ParamsResourceProjectsSetusageexportbucket,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setUsageExportBucket(params: ParamsResourceProjectsSetusageexportbucket, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setUsageExportBucket(
    params: ParamsResourceProjectsSetusageexportbucket,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
}
