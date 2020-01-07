package typings.googleapis.buildSrcApisDeploymentmanagerAlphaMod.deploymentmanager_alpha

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/deploymentmanager/alpha", "deploymentmanager_alpha.Resource$Types")
@js.native
class Resource$Types protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * deploymentmanager.types.delete
    * @desc Deletes a type and all of the resources in the type.
    * @alias deploymentmanager.types.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project The project ID for this request.
    * @param {string} params.type The name of the type for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Operation] = js.native
  def delete(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarTypesDollarDelete): GaxiosPromise[Schema$Operation] = js.native
  def delete(
    params: ParamsDollarResourceDollarTypesDollarDelete,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarTypesDollarDelete,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarTypesDollarDelete, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def delete(
    params: ParamsDollarResourceDollarTypesDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * deploymentmanager.types.get
    * @desc Gets information about a specific type.
    * @alias deploymentmanager.types.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project The project ID for this request.
    * @param {string} params.type The name of the type for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Type] = js.native
  def get(callback: BodyResponseCallback[Schema$Type]): Unit = js.native
  def get(params: ParamsDollarResourceDollarTypesDollarGet): GaxiosPromise[Schema$Type] = js.native
  def get(params: ParamsDollarResourceDollarTypesDollarGet, callback: BodyResponseCallback[Schema$Type]): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarTypesDollarGet,
    options: BodyResponseCallback[Schema$Type],
    callback: BodyResponseCallback[Schema$Type]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarTypesDollarGet, options: MethodOptions): GaxiosPromise[Schema$Type] = js.native
  def get(
    params: ParamsDollarResourceDollarTypesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Type]
  ): Unit = js.native
  /**
    * deploymentmanager.types.insert
    * @desc Creates a type.
    * @alias deploymentmanager.types.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project The project ID for this request.
    * @param {().Type} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$Operation] = js.native
  def insert(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarTypesDollarInsert): GaxiosPromise[Schema$Operation] = js.native
  def insert(
    params: ParamsDollarResourceDollarTypesDollarInsert,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarTypesDollarInsert,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarTypesDollarInsert, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def insert(
    params: ParamsDollarResourceDollarTypesDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * deploymentmanager.types.list
    * @desc Lists all resource types for Deployment Manager.
    * @alias deploymentmanager.types.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter A filter expression that filters resources listed in the response. The expression must specify the field name, a comparison operator, and the value that you want to use for filtering. The value must be a string, a number, or a boolean. The comparison operator must be either =, !=, >, or <.  For example, if you are filtering Compute Engine instances, you can exclude instances named example-instance by specifying name != example-instance.  You can also filter nested fields. For example, you could specify scheduling.automaticRestart = false to include instances only if they are not scheduled for automatic restarts. You can use filtering on nested fields to filter based on resource labels.  To filter on multiple expressions, provide each separate expression within parentheses. For example, (scheduling.automaticRestart = true) (cpuPlatform = "Intel Skylake"). By default, each expression is an AND expression. However, you can include AND and OR expressions explicitly. For example, (cpuPlatform = "Intel Skylake") OR (cpuPlatform = "Intel Broadwell") AND (scheduling.automaticRestart = true).
    * @param {integer=} params.maxResults The maximum number of results per page that should be returned. If the number of available results is larger than maxResults, Compute Engine returns a nextPageToken that can be used to get the next page of results in subsequent list requests. Acceptable values are 0 to 500, inclusive. (Default: 500)
    * @param {string=} params.orderBy Sorts list results by a certain order. By default, results are returned in alphanumerical order based on the resource name.  You can also sort results in descending order based on the creation timestamp using orderBy="creationTimestamp desc". This sorts results based on the creationTimestamp field in reverse chronological order (newest result first). Use this to sort resources like operations so that the newest operation is returned first.  Currently, only sorting by name or creationTimestamp desc is supported.
    * @param {string=} params.pageToken Specifies a page token to use. Set pageToken to the nextPageToken returned by a previous list request to get the next page of results.
    * @param {string} params.project The project ID for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$TypesListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$TypesListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarTypesDollarList): GaxiosPromise[Schema$TypesListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarTypesDollarList,
    callback: BodyResponseCallback[Schema$TypesListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarTypesDollarList,
    options: BodyResponseCallback[Schema$TypesListResponse],
    callback: BodyResponseCallback[Schema$TypesListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarTypesDollarList, options: MethodOptions): GaxiosPromise[Schema$TypesListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarTypesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$TypesListResponse]
  ): Unit = js.native
  /**
    * deploymentmanager.types.patch
    * @desc Updates a type. This method supports patch semantics.
    * @alias deploymentmanager.types.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project The project ID for this request.
    * @param {string} params.type The name of the type for this request.
    * @param {().Type} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$Operation] = js.native
  def patch(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarTypesDollarPatch): GaxiosPromise[Schema$Operation] = js.native
  def patch(
    params: ParamsDollarResourceDollarTypesDollarPatch,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarTypesDollarPatch,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarTypesDollarPatch, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def patch(
    params: ParamsDollarResourceDollarTypesDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * deploymentmanager.types.update
    * @desc Updates a type.
    * @alias deploymentmanager.types.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project The project ID for this request.
    * @param {string} params.type The name of the type for this request.
    * @param {().Type} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$Operation] = js.native
  def update(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def update(params: ParamsDollarResourceDollarTypesDollarUpdate): GaxiosPromise[Schema$Operation] = js.native
  def update(
    params: ParamsDollarResourceDollarTypesDollarUpdate,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarTypesDollarUpdate,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarTypesDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def update(
    params: ParamsDollarResourceDollarTypesDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
}

