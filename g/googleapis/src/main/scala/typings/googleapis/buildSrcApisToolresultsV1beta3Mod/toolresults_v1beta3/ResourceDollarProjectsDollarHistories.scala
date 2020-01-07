package typings.googleapis.buildSrcApisToolresultsV1beta3Mod.toolresults_v1beta3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/toolresults/v1beta3", "toolresults_v1beta3.Resource$Projects$Histories")
@js.native
class ResourceDollarProjectsDollarHistories protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var executions: ResourceDollarProjectsDollarHistoriesDollarExecutions = js.native
  /**
    * toolresults.projects.histories.create
    * @desc Creates a History.  The returned History will have the id set.  May
    * return any of the following canonical error codes:  - PERMISSION_DENIED -
    * if the user is not authorized to write to project - INVALID_ARGUMENT - if
    * the request is malformed - NOT_FOUND - if the containing project does not
    * exist
    * @alias toolresults.projects.histories.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.projectId A Project id.  Required.
    * @param {string=} params.requestId A unique request ID for server to detect duplicated requests. For example, a UUID.  Optional, but strongly recommended.
    * @param {().History} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$History] = js.native
  def create(callback: BodyResponseCallback[Schema$History]): Unit = js.native
  def create(params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarCreate): GaxiosPromise[Schema$History] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarCreate,
    callback: BodyResponseCallback[Schema$History]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarCreate,
    options: BodyResponseCallback[Schema$History],
    callback: BodyResponseCallback[Schema$History]
  ): Unit = js.native
  def create(params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarCreate, options: MethodOptions): GaxiosPromise[Schema$History] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$History]
  ): Unit = js.native
  /**
    * toolresults.projects.histories.get
    * @desc Gets a History.  May return any of the following canonical error
    * codes:  - PERMISSION_DENIED - if the user is not authorized to read
    * project - INVALID_ARGUMENT - if the request is malformed - NOT_FOUND - if
    * the History does not exist
    * @alias toolresults.projects.histories.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.historyId A History id.  Required.
    * @param {string} params.projectId A Project id.  Required.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$History] = js.native
  def get(callback: BodyResponseCallback[Schema$History]): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarGet): GaxiosPromise[Schema$History] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarGet,
    callback: BodyResponseCallback[Schema$History]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarGet,
    options: BodyResponseCallback[Schema$History],
    callback: BodyResponseCallback[Schema$History]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarGet, options: MethodOptions): GaxiosPromise[Schema$History] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$History]
  ): Unit = js.native
  /**
    * toolresults.projects.histories.list
    * @desc Lists Histories for a given Project.  The histories are sorted by
    * modification time in descending order. The history_id key will be used to
    * order the history with the same modification time.  May return any of the
    * following canonical error codes:  - PERMISSION_DENIED - if the user is
    * not authorized to read project - INVALID_ARGUMENT - if the request is
    * malformed - NOT_FOUND - if the History does not exist
    * @alias toolresults.projects.histories.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filterByName If set, only return histories with the given name.  Optional.
    * @param {integer=} params.pageSize The maximum number of Histories to fetch.  Default value: 20. The server will use this default if the field is not set or has a value of 0. Any value greater than 100 will be treated as 100.  Optional.
    * @param {string=} params.pageToken A continuation token to resume the query at the next item.  Optional.
    * @param {string} params.projectId A Project id.  Required.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListHistoriesResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListHistoriesResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarList): GaxiosPromise[Schema$ListHistoriesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarList,
    callback: BodyResponseCallback[Schema$ListHistoriesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarList,
    options: BodyResponseCallback[Schema$ListHistoriesResponse],
    callback: BodyResponseCallback[Schema$ListHistoriesResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarList, options: MethodOptions): GaxiosPromise[Schema$ListHistoriesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarHistoriesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListHistoriesResponse]
  ): Unit = js.native
}

