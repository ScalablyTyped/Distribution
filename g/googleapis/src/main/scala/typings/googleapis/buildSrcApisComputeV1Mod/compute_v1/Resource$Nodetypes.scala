package typings.googleapis.buildSrcApisComputeV1Mod.compute_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/compute/v1", "compute_v1.Resource$Nodetypes")
@js.native
class Resource$Nodetypes protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * compute.nodeTypes.aggregatedList
    * @desc Retrieves an aggregated list of node types.
    * @alias compute.nodeTypes.aggregatedList
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
  def aggregatedList(): GaxiosPromise[Schema$NodeTypeAggregatedList] = js.native
  def aggregatedList(callback: BodyResponseCallback[Schema$NodeTypeAggregatedList]): Unit = js.native
  def aggregatedList(params: ParamsDollarResourceDollarNodetypesDollarAggregatedlist): GaxiosPromise[Schema$NodeTypeAggregatedList] = js.native
  def aggregatedList(
    params: ParamsDollarResourceDollarNodetypesDollarAggregatedlist,
    callback: BodyResponseCallback[Schema$NodeTypeAggregatedList]
  ): Unit = js.native
  def aggregatedList(
    params: ParamsDollarResourceDollarNodetypesDollarAggregatedlist,
    options: BodyResponseCallback[Schema$NodeTypeAggregatedList],
    callback: BodyResponseCallback[Schema$NodeTypeAggregatedList]
  ): Unit = js.native
  def aggregatedList(params: ParamsDollarResourceDollarNodetypesDollarAggregatedlist, options: MethodOptions): GaxiosPromise[Schema$NodeTypeAggregatedList] = js.native
  def aggregatedList(
    params: ParamsDollarResourceDollarNodetypesDollarAggregatedlist,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$NodeTypeAggregatedList]
  ): Unit = js.native
  /**
    * compute.nodeTypes.get
    * @desc Returns the specified node type. Gets a list of available node
    * types by making a list() request.
    * @alias compute.nodeTypes.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.nodeType Name of the node type to return.
    * @param {string} params.project Project ID for this request.
    * @param {string} params.zone The name of the zone for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$NodeType] = js.native
  def get(callback: BodyResponseCallback[Schema$NodeType]): Unit = js.native
  def get(params: ParamsDollarResourceDollarNodetypesDollarGet): GaxiosPromise[Schema$NodeType] = js.native
  def get(
    params: ParamsDollarResourceDollarNodetypesDollarGet,
    callback: BodyResponseCallback[Schema$NodeType]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarNodetypesDollarGet,
    options: BodyResponseCallback[Schema$NodeType],
    callback: BodyResponseCallback[Schema$NodeType]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarNodetypesDollarGet, options: MethodOptions): GaxiosPromise[Schema$NodeType] = js.native
  def get(
    params: ParamsDollarResourceDollarNodetypesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$NodeType]
  ): Unit = js.native
  /**
    * compute.nodeTypes.list
    * @desc Retrieves a list of node types available to the specified project.
    * @alias compute.nodeTypes.list
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
  def list(): GaxiosPromise[Schema$NodeTypeList] = js.native
  def list(callback: BodyResponseCallback[Schema$NodeTypeList]): Unit = js.native
  def list(params: ParamsDollarResourceDollarNodetypesDollarList): GaxiosPromise[Schema$NodeTypeList] = js.native
  def list(
    params: ParamsDollarResourceDollarNodetypesDollarList,
    callback: BodyResponseCallback[Schema$NodeTypeList]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarNodetypesDollarList,
    options: BodyResponseCallback[Schema$NodeTypeList],
    callback: BodyResponseCallback[Schema$NodeTypeList]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarNodetypesDollarList, options: MethodOptions): GaxiosPromise[Schema$NodeTypeList] = js.native
  def list(
    params: ParamsDollarResourceDollarNodetypesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$NodeTypeList]
  ): Unit = js.native
}

