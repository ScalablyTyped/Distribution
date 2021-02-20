package typings.googleapis.alphaMod.computeAlpha

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/compute/alpha", "compute_alpha.Resource$Disktypes")
@js.native
class ResourceDisktypes protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  /**
    * compute.diskTypes.aggregatedList
    * @desc Retrieves an aggregated list of disk types.
    * @alias compute.diskTypes.aggregatedList
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
  def aggregatedList(): GaxiosPromise[SchemaDiskTypeAggregatedList] = js.native
  def aggregatedList(callback: BodyResponseCallback[SchemaDiskTypeAggregatedList]): Unit = js.native
  def aggregatedList(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaDiskTypeAggregatedList] = js.native
  def aggregatedList(params: ParamsResourceDisktypesAggregatedlist): GaxiosPromise[SchemaDiskTypeAggregatedList] = js.native
  def aggregatedList(
    params: ParamsResourceDisktypesAggregatedlist,
    callback: BodyResponseCallback[SchemaDiskTypeAggregatedList]
  ): Unit = js.native
  def aggregatedList(
    params: ParamsResourceDisktypesAggregatedlist,
    options: BodyResponseCallback[SchemaDiskTypeAggregatedList],
    callback: BodyResponseCallback[SchemaDiskTypeAggregatedList]
  ): Unit = js.native
  def aggregatedList(params: ParamsResourceDisktypesAggregatedlist, options: MethodOptions): GaxiosPromise[SchemaDiskTypeAggregatedList] = js.native
  def aggregatedList(
    params: ParamsResourceDisktypesAggregatedlist,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDiskTypeAggregatedList]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  /**
    * compute.diskTypes.get
    * @desc Returns the specified disk type. Gets a list of available disk
    * types by making a list() request.
    * @alias compute.diskTypes.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.diskType Name of the disk type to return.
    * @param {string} params.project Project ID for this request.
    * @param {string} params.zone The name of the zone for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaDiskType] = js.native
  def get(callback: BodyResponseCallback[SchemaDiskType]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaDiskType] = js.native
  def get(params: ParamsResourceDisktypesGet): GaxiosPromise[SchemaDiskType] = js.native
  def get(params: ParamsResourceDisktypesGet, callback: BodyResponseCallback[SchemaDiskType]): Unit = js.native
  def get(
    params: ParamsResourceDisktypesGet,
    options: BodyResponseCallback[SchemaDiskType],
    callback: BodyResponseCallback[SchemaDiskType]
  ): Unit = js.native
  def get(params: ParamsResourceDisktypesGet, options: MethodOptions): GaxiosPromise[SchemaDiskType] = js.native
  def get(
    params: ParamsResourceDisktypesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDiskType]
  ): Unit = js.native
  
  /**
    * compute.diskTypes.list
    * @desc Retrieves a list of disk types available to the specified project.
    * @alias compute.diskTypes.list
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
  def list(): GaxiosPromise[SchemaDiskTypeList] = js.native
  def list(callback: BodyResponseCallback[SchemaDiskTypeList]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaDiskTypeList] = js.native
  def list(params: ParamsResourceDisktypesList): GaxiosPromise[SchemaDiskTypeList] = js.native
  def list(params: ParamsResourceDisktypesList, callback: BodyResponseCallback[SchemaDiskTypeList]): Unit = js.native
  def list(
    params: ParamsResourceDisktypesList,
    options: BodyResponseCallback[SchemaDiskTypeList],
    callback: BodyResponseCallback[SchemaDiskTypeList]
  ): Unit = js.native
  def list(params: ParamsResourceDisktypesList, options: MethodOptions): GaxiosPromise[SchemaDiskTypeList] = js.native
  def list(
    params: ParamsResourceDisktypesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDiskTypeList]
  ): Unit = js.native
}
