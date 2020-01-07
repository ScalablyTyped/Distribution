package typings.googleapis.buildSrcApisDeploymentmanagerAlphaMod.deploymentmanager_alpha

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/deploymentmanager/alpha", "deploymentmanager_alpha.Resource$Compositetypes")
@js.native
class Resource$Compositetypes protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * deploymentmanager.compositeTypes.delete
    * @desc Deletes a composite type.
    * @alias deploymentmanager.compositeTypes.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.compositeType The name of the type for this request.
    * @param {string} params.project The project ID for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Operation] = js.native
  def delete(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarCompositetypesDollarDelete): GaxiosPromise[Schema$Operation] = js.native
  def delete(
    params: ParamsDollarResourceDollarCompositetypesDollarDelete,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarCompositetypesDollarDelete,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarCompositetypesDollarDelete, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def delete(
    params: ParamsDollarResourceDollarCompositetypesDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * deploymentmanager.compositeTypes.get
    * @desc Gets information about a specific composite type.
    * @alias deploymentmanager.compositeTypes.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.compositeType The name of the composite type for this request.
    * @param {string} params.project The project ID for this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$CompositeType] = js.native
  def get(callback: BodyResponseCallback[Schema$CompositeType]): Unit = js.native
  def get(params: ParamsDollarResourceDollarCompositetypesDollarGet): GaxiosPromise[Schema$CompositeType] = js.native
  def get(
    params: ParamsDollarResourceDollarCompositetypesDollarGet,
    callback: BodyResponseCallback[Schema$CompositeType]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarCompositetypesDollarGet,
    options: BodyResponseCallback[Schema$CompositeType],
    callback: BodyResponseCallback[Schema$CompositeType]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarCompositetypesDollarGet, options: MethodOptions): GaxiosPromise[Schema$CompositeType] = js.native
  def get(
    params: ParamsDollarResourceDollarCompositetypesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$CompositeType]
  ): Unit = js.native
  /**
    * deploymentmanager.compositeTypes.insert
    * @desc Creates a composite type.
    * @alias deploymentmanager.compositeTypes.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project The project ID for this request.
    * @param {().CompositeType} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$Operation] = js.native
  def insert(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarCompositetypesDollarInsert): GaxiosPromise[Schema$Operation] = js.native
  def insert(
    params: ParamsDollarResourceDollarCompositetypesDollarInsert,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarCompositetypesDollarInsert,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarCompositetypesDollarInsert, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def insert(
    params: ParamsDollarResourceDollarCompositetypesDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * deploymentmanager.compositeTypes.list
    * @desc Lists all composite types for Deployment Manager.
    * @alias deploymentmanager.compositeTypes.list
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
  def list(): GaxiosPromise[Schema$CompositeTypesListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$CompositeTypesListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarCompositetypesDollarList): GaxiosPromise[Schema$CompositeTypesListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarCompositetypesDollarList,
    callback: BodyResponseCallback[Schema$CompositeTypesListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarCompositetypesDollarList,
    options: BodyResponseCallback[Schema$CompositeTypesListResponse],
    callback: BodyResponseCallback[Schema$CompositeTypesListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarCompositetypesDollarList, options: MethodOptions): GaxiosPromise[Schema$CompositeTypesListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarCompositetypesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$CompositeTypesListResponse]
  ): Unit = js.native
  /**
    * deploymentmanager.compositeTypes.patch
    * @desc Updates a composite type. This method supports patch semantics.
    * @alias deploymentmanager.compositeTypes.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.compositeType The name of the composite type for this request.
    * @param {string} params.project The project ID for this request.
    * @param {().CompositeType} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$Operation] = js.native
  def patch(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarCompositetypesDollarPatch): GaxiosPromise[Schema$Operation] = js.native
  def patch(
    params: ParamsDollarResourceDollarCompositetypesDollarPatch,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarCompositetypesDollarPatch,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarCompositetypesDollarPatch, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def patch(
    params: ParamsDollarResourceDollarCompositetypesDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * deploymentmanager.compositeTypes.update
    * @desc Updates a composite type.
    * @alias deploymentmanager.compositeTypes.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.compositeType The name of the composite type for this request.
    * @param {string} params.project The project ID for this request.
    * @param {().CompositeType} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$Operation] = js.native
  def update(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def update(params: ParamsDollarResourceDollarCompositetypesDollarUpdate): GaxiosPromise[Schema$Operation] = js.native
  def update(
    params: ParamsDollarResourceDollarCompositetypesDollarUpdate,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarCompositetypesDollarUpdate,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarCompositetypesDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def update(
    params: ParamsDollarResourceDollarCompositetypesDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
}

