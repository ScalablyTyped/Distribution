package typings.googleapis.bigqueryV2Mod.bigqueryV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/bigquery/v2", "bigquery_v2.Resource$Models")
@js.native
open class ResourceModels protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceModelsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceModelsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceModelsDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceModelsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceModelsDelete, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
  /**
    * Deletes the model specified by modelId from the dataset.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/bigquery.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const bigquery = google.bigquery('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/bigquery',
    *       'https://www.googleapis.com/auth/cloud-platform',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await bigquery.models.delete({
    *     // Required. Dataset ID of the model to delete.
    *     datasetId: '[^/]+',
    *     // Required. Model ID of the model to delete.
    *     modelId: '[^/]+',
    *     // Required. Project ID of the model to delete.
    *     projectId: '[^/]+',
    *   });
    *   console.log(res.data);
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def delete(params: ParamsResourceModelsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceModelsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaModel] = js.native
  def get(callback: BodyResponseCallback[SchemaModel]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaModel] = js.native
  def get(params: ParamsResourceModelsGet): GaxiosPromise[SchemaModel] = js.native
  def get(params: ParamsResourceModelsGet, callback: BodyResponseCallback[SchemaModel]): Unit = js.native
  def get(
    params: ParamsResourceModelsGet,
    options: BodyResponseCallback[Readable | SchemaModel],
    callback: BodyResponseCallback[Readable | SchemaModel]
  ): Unit = js.native
  def get(params: ParamsResourceModelsGet, options: MethodOptions): GaxiosPromise[SchemaModel] = js.native
  def get(
    params: ParamsResourceModelsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaModel]
  ): Unit = js.native
  /**
    * Gets the specified model resource by model ID.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/bigquery.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const bigquery = google.bigquery('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/bigquery',
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloud-platform.read-only',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await bigquery.models.get({
    *     // Required. Dataset ID of the requested model.
    *     datasetId: '[^/]+',
    *     // Required. Model ID of the requested model.
    *     modelId: '[^/]+',
    *     // Required. Project ID of the requested model.
    *     projectId: '[^/]+',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "bestTrialId": "my_bestTrialId",
    *   //   "creationTime": "my_creationTime",
    *   //   "defaultTrialId": "my_defaultTrialId",
    *   //   "description": "my_description",
    *   //   "encryptionConfiguration": {},
    *   //   "etag": "my_etag",
    *   //   "expirationTime": "my_expirationTime",
    *   //   "featureColumns": [],
    *   //   "friendlyName": "my_friendlyName",
    *   //   "hparamSearchSpaces": {},
    *   //   "hparamTrials": [],
    *   //   "labelColumns": [],
    *   //   "labels": {},
    *   //   "lastModifiedTime": "my_lastModifiedTime",
    *   //   "location": "my_location",
    *   //   "modelReference": {},
    *   //   "modelType": "my_modelType",
    *   //   "optimalTrialIds": [],
    *   //   "trainingRuns": []
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def get(params: ParamsResourceModelsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceModelsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListModelsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListModelsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListModelsResponse] = js.native
  def list(params: ParamsResourceModelsList): GaxiosPromise[SchemaListModelsResponse] = js.native
  def list(params: ParamsResourceModelsList, callback: BodyResponseCallback[SchemaListModelsResponse]): Unit = js.native
  def list(
    params: ParamsResourceModelsList,
    options: BodyResponseCallback[Readable | SchemaListModelsResponse],
    callback: BodyResponseCallback[Readable | SchemaListModelsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceModelsList, options: MethodOptions): GaxiosPromise[SchemaListModelsResponse] = js.native
  def list(
    params: ParamsResourceModelsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListModelsResponse]
  ): Unit = js.native
  /**
    * Lists all models in the specified dataset. Requires the READER dataset role. After retrieving the list of models, you can get information about a particular model by calling the models.get method.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/bigquery.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const bigquery = google.bigquery('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/bigquery',
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloud-platform.read-only',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await bigquery.models.list({
    *     // Required. Dataset ID of the models to list.
    *     datasetId: '[^/]+',
    *     // The maximum number of results to return in a single response page. Leverage the page tokens to iterate through the entire collection.
    *     maxResults: 'placeholder-value',
    *     // Page token, returned by a previous call to request the next page of results
    *     pageToken: 'placeholder-value',
    *     // Required. Project ID of the models to list.
    *     projectId: '[^/]+',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "models": [],
    *   //   "nextPageToken": "my_nextPageToken"
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def list(params: ParamsResourceModelsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceModelsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaModel] = js.native
  def patch(callback: BodyResponseCallback[SchemaModel]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaModel] = js.native
  def patch(params: ParamsResourceModelsPatch): GaxiosPromise[SchemaModel] = js.native
  def patch(params: ParamsResourceModelsPatch, callback: BodyResponseCallback[SchemaModel]): Unit = js.native
  def patch(
    params: ParamsResourceModelsPatch,
    options: BodyResponseCallback[Readable | SchemaModel],
    callback: BodyResponseCallback[Readable | SchemaModel]
  ): Unit = js.native
  def patch(params: ParamsResourceModelsPatch, options: MethodOptions): GaxiosPromise[SchemaModel] = js.native
  def patch(
    params: ParamsResourceModelsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaModel]
  ): Unit = js.native
  /**
    * Patch specific fields in the specified model.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/bigquery.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const bigquery = google.bigquery('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/bigquery',
    *       'https://www.googleapis.com/auth/cloud-platform',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await bigquery.models.patch({
    *     // Required. Dataset ID of the model to patch.
    *     datasetId: '[^/]+',
    *     // Required. Model ID of the model to patch.
    *     modelId: '[^/]+',
    *     // Required. Project ID of the model to patch.
    *     projectId: '[^/]+',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "bestTrialId": "my_bestTrialId",
    *       //   "creationTime": "my_creationTime",
    *       //   "defaultTrialId": "my_defaultTrialId",
    *       //   "description": "my_description",
    *       //   "encryptionConfiguration": {},
    *       //   "etag": "my_etag",
    *       //   "expirationTime": "my_expirationTime",
    *       //   "featureColumns": [],
    *       //   "friendlyName": "my_friendlyName",
    *       //   "hparamSearchSpaces": {},
    *       //   "hparamTrials": [],
    *       //   "labelColumns": [],
    *       //   "labels": {},
    *       //   "lastModifiedTime": "my_lastModifiedTime",
    *       //   "location": "my_location",
    *       //   "modelReference": {},
    *       //   "modelType": "my_modelType",
    *       //   "optimalTrialIds": [],
    *       //   "trainingRuns": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "bestTrialId": "my_bestTrialId",
    *   //   "creationTime": "my_creationTime",
    *   //   "defaultTrialId": "my_defaultTrialId",
    *   //   "description": "my_description",
    *   //   "encryptionConfiguration": {},
    *   //   "etag": "my_etag",
    *   //   "expirationTime": "my_expirationTime",
    *   //   "featureColumns": [],
    *   //   "friendlyName": "my_friendlyName",
    *   //   "hparamSearchSpaces": {},
    *   //   "hparamTrials": [],
    *   //   "labelColumns": [],
    *   //   "labels": {},
    *   //   "lastModifiedTime": "my_lastModifiedTime",
    *   //   "location": "my_location",
    *   //   "modelReference": {},
    *   //   "modelType": "my_modelType",
    *   //   "optimalTrialIds": [],
    *   //   "trainingRuns": []
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def patch(params: ParamsResourceModelsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceModelsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
