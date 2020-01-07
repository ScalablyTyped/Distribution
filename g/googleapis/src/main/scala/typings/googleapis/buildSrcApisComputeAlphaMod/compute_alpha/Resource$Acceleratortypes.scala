package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/compute/alpha", "compute_alpha.Resource$Acceleratortypes")
@js.native
class Resource$Acceleratortypes protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * compute.acceleratorTypes.aggregatedList
    * @desc Retrieves an aggregated list of accelerator types.
    * @alias compute.acceleratorTypes.aggregatedList
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
  def aggregatedList(): GaxiosPromise[Schema$AcceleratorTypeAggregatedList] = js.native
  def aggregatedList(callback: BodyResponseCallback[Schema$AcceleratorTypeAggregatedList]): Unit = js.native
  def aggregatedList(params: ParamsDollarResourceDollarAcceleratortypesDollarAggregatedlist): GaxiosPromise[Schema$AcceleratorTypeAggregatedList] = js.native
  def aggregatedList(
    params: ParamsDollarResourceDollarAcceleratortypesDollarAggregatedlist,
    callback: BodyResponseCallback[Schema$AcceleratorTypeAggregatedList]
  ): Unit = js.native
  def aggregatedList(
    params: ParamsDollarResourceDollarAcceleratortypesDollarAggregatedlist,
    options: BodyResponseCallback[Schema$AcceleratorTypeAggregatedList],
    callback: BodyResponseCallback[Schema$AcceleratorTypeAggregatedList]
  ): Unit = js.native
  def aggregatedList(params: ParamsDollarResourceDollarAcceleratortypesDollarAggregatedlist, options: MethodOptions): GaxiosPromise[Schema$AcceleratorTypeAggregatedList] = js.native
  def aggregatedList(
    params: ParamsDollarResourceDollarAcceleratortypesDollarAggregatedlist,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AcceleratorTypeAggregatedList]
  ): Unit = js.native
  /**
    * compute.acceleratorTypes.get
    * @desc Returns the specified accelerator type.
    * @alias compute.acceleratorTypes.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.acceleratorType Name of the accelerator type to return.
    * @param {string} params.project Project ID for this request.
    * @param {string} params.zone The name of the zone for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$AcceleratorType] = js.native
  def get(callback: BodyResponseCallback[Schema$AcceleratorType]): Unit = js.native
  def get(params: ParamsDollarResourceDollarAcceleratortypesDollarGet): GaxiosPromise[Schema$AcceleratorType] = js.native
  def get(
    params: ParamsDollarResourceDollarAcceleratortypesDollarGet,
    callback: BodyResponseCallback[Schema$AcceleratorType]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarAcceleratortypesDollarGet,
    options: BodyResponseCallback[Schema$AcceleratorType],
    callback: BodyResponseCallback[Schema$AcceleratorType]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarAcceleratortypesDollarGet, options: MethodOptions): GaxiosPromise[Schema$AcceleratorType] = js.native
  def get(
    params: ParamsDollarResourceDollarAcceleratortypesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AcceleratorType]
  ): Unit = js.native
  /**
    * compute.acceleratorTypes.list
    * @desc Retrieves a list of accelerator types available to the specified
    * project.
    * @alias compute.acceleratorTypes.list
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
  def list(): GaxiosPromise[Schema$AcceleratorTypeList] = js.native
  def list(callback: BodyResponseCallback[Schema$AcceleratorTypeList]): Unit = js.native
  def list(params: ParamsDollarResourceDollarAcceleratortypesDollarList): GaxiosPromise[Schema$AcceleratorTypeList] = js.native
  def list(
    params: ParamsDollarResourceDollarAcceleratortypesDollarList,
    callback: BodyResponseCallback[Schema$AcceleratorTypeList]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarAcceleratortypesDollarList,
    options: BodyResponseCallback[Schema$AcceleratorTypeList],
    callback: BodyResponseCallback[Schema$AcceleratorTypeList]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarAcceleratortypesDollarList, options: MethodOptions): GaxiosPromise[Schema$AcceleratorTypeList] = js.native
  def list(
    params: ParamsDollarResourceDollarAcceleratortypesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AcceleratorTypeList]
  ): Unit = js.native
}

