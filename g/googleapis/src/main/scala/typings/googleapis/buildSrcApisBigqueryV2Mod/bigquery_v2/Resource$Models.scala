package typings.googleapis.buildSrcApisBigqueryV2Mod.bigquery_v2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/bigquery/v2", "bigquery_v2.Resource$Models")
@js.native
class Resource$Models protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * bigquery.models.delete
    * @desc Deletes the model specified by modelId from the dataset.
    * @alias bigquery.models.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.datasetId Dataset ID of the model to delete.
    * @param {string} params.modelId Model ID of the model to delete.
    * @param {string} params.projectId Project ID of the model to delete.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarModelsDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsDollarResourceDollarModelsDollarDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarModelsDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarModelsDollarDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarModelsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * bigquery.models.get
    * @desc Gets the specified model resource by model ID.
    * @alias bigquery.models.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.datasetId Dataset ID of the requested model.
    * @param {string} params.modelId Model ID of the requested model.
    * @param {string} params.projectId Project ID of the requested model.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Model] = js.native
  def get(callback: BodyResponseCallback[Schema$Model]): Unit = js.native
  def get(params: ParamsDollarResourceDollarModelsDollarGet): GaxiosPromise[Schema$Model] = js.native
  def get(params: ParamsDollarResourceDollarModelsDollarGet, callback: BodyResponseCallback[Schema$Model]): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarModelsDollarGet,
    options: BodyResponseCallback[Schema$Model],
    callback: BodyResponseCallback[Schema$Model]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarModelsDollarGet, options: MethodOptions): GaxiosPromise[Schema$Model] = js.native
  def get(
    params: ParamsDollarResourceDollarModelsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Model]
  ): Unit = js.native
  /**
    * bigquery.models.list
    * @desc Lists all models in the specified dataset. Requires the READER
    * dataset role.
    * @alias bigquery.models.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.datasetId Dataset ID of the models to list.
    * @param {integer=} params.maxResults The maximum number of results per page.
    * @param {string=} params.pageToken Page token, returned by a previous call to request the next page of results
    * @param {string} params.projectId Project ID of the models to list.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListModelsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListModelsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarModelsDollarList): GaxiosPromise[Schema$ListModelsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarModelsDollarList,
    callback: BodyResponseCallback[Schema$ListModelsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarModelsDollarList,
    options: BodyResponseCallback[Schema$ListModelsResponse],
    callback: BodyResponseCallback[Schema$ListModelsResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarModelsDollarList, options: MethodOptions): GaxiosPromise[Schema$ListModelsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarModelsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListModelsResponse]
  ): Unit = js.native
  /**
    * bigquery.models.patch
    * @desc Patch specific fields in the specified model.
    * @alias bigquery.models.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.datasetId Dataset ID of the model to patch.
    * @param {string} params.modelId Model ID of the model to patch.
    * @param {string} params.projectId Project ID of the model to patch.
    * @param {().Model} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$Model] = js.native
  def patch(callback: BodyResponseCallback[Schema$Model]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarModelsDollarPatch): GaxiosPromise[Schema$Model] = js.native
  def patch(params: ParamsDollarResourceDollarModelsDollarPatch, callback: BodyResponseCallback[Schema$Model]): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarModelsDollarPatch,
    options: BodyResponseCallback[Schema$Model],
    callback: BodyResponseCallback[Schema$Model]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarModelsDollarPatch, options: MethodOptions): GaxiosPromise[Schema$Model] = js.native
  def patch(
    params: ParamsDollarResourceDollarModelsDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Model]
  ): Unit = js.native
}

