package typings.googleapis.bigqueryV2Mod.bigqueryV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/bigquery/v2", "bigquery_v2.Resource$Models")
@js.native
class ResourceModels protected () extends StObject {
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
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceModelsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceModelsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceModelsDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceModelsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceModelsDelete, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
  
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
  def get(): GaxiosPromise[SchemaModel] = js.native
  def get(callback: BodyResponseCallback[SchemaModel]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaModel] = js.native
  def get(params: ParamsResourceModelsGet): GaxiosPromise[SchemaModel] = js.native
  def get(params: ParamsResourceModelsGet, callback: BodyResponseCallback[SchemaModel]): Unit = js.native
  def get(
    params: ParamsResourceModelsGet,
    options: BodyResponseCallback[SchemaModel],
    callback: BodyResponseCallback[SchemaModel]
  ): Unit = js.native
  def get(params: ParamsResourceModelsGet, options: MethodOptions): GaxiosPromise[SchemaModel] = js.native
  def get(
    params: ParamsResourceModelsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaModel]
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
  def list(): GaxiosPromise[SchemaListModelsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListModelsResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListModelsResponse] = js.native
  def list(params: ParamsResourceModelsList): GaxiosPromise[SchemaListModelsResponse] = js.native
  def list(params: ParamsResourceModelsList, callback: BodyResponseCallback[SchemaListModelsResponse]): Unit = js.native
  def list(
    params: ParamsResourceModelsList,
    options: BodyResponseCallback[SchemaListModelsResponse],
    callback: BodyResponseCallback[SchemaListModelsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceModelsList, options: MethodOptions): GaxiosPromise[SchemaListModelsResponse] = js.native
  def list(
    params: ParamsResourceModelsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListModelsResponse]
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
  def patch(): GaxiosPromise[SchemaModel] = js.native
  def patch(callback: BodyResponseCallback[SchemaModel]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaModel] = js.native
  def patch(params: ParamsResourceModelsPatch): GaxiosPromise[SchemaModel] = js.native
  def patch(params: ParamsResourceModelsPatch, callback: BodyResponseCallback[SchemaModel]): Unit = js.native
  def patch(
    params: ParamsResourceModelsPatch,
    options: BodyResponseCallback[SchemaModel],
    callback: BodyResponseCallback[SchemaModel]
  ): Unit = js.native
  def patch(params: ParamsResourceModelsPatch, options: MethodOptions): GaxiosPromise[SchemaModel] = js.native
  def patch(
    params: ParamsResourceModelsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaModel]
  ): Unit = js.native
}
