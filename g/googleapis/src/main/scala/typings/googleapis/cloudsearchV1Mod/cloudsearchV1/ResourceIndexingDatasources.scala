package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/cloudsearch/v1", "cloudsearch_v1.Resource$Indexing$Datasources")
@js.native
open class ResourceIndexingDatasources protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def deleteSchema(): GaxiosPromise[SchemaOperation] = js.native
  def deleteSchema(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def deleteSchema(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def deleteSchema(params: ParamsResourceIndexingDatasourcesDeleteschema): GaxiosPromise[SchemaOperation] = js.native
  def deleteSchema(
    params: ParamsResourceIndexingDatasourcesDeleteschema,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def deleteSchema(
    params: ParamsResourceIndexingDatasourcesDeleteschema,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def deleteSchema(params: ParamsResourceIndexingDatasourcesDeleteschema, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def deleteSchema(
    params: ParamsResourceIndexingDatasourcesDeleteschema,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Deletes the schema of a data source. **Note:** This API requires an admin or service account to execute.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudsearch.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudsearch = google.cloudsearch('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud_search',
    *       'https://www.googleapis.com/auth/cloud_search.settings',
    *       'https://www.googleapis.com/auth/cloud_search.settings.indexing',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudsearch.indexing.datasources.deleteSchema({
    *     // If you are asked by Google to help with debugging, set this field. Otherwise, ignore this field.
    *     'debugOptions.enableDebugging': 'placeholder-value',
    *     // The name of the data source to delete Schema. Format: datasources/{source_id\}
    *     name: 'datasources/my-datasource',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "done": false,
    *   //   "error": {},
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "response": {}
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
  def deleteSchema(params: ParamsResourceIndexingDatasourcesDeleteschema, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def deleteSchema(
    params: ParamsResourceIndexingDatasourcesDeleteschema,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getSchema(): GaxiosPromise[SchemaSchema] = js.native
  def getSchema(callback: BodyResponseCallback[SchemaSchema]): Unit = js.native
  def getSchema(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSchema] = js.native
  def getSchema(params: ParamsResourceIndexingDatasourcesGetschema): GaxiosPromise[SchemaSchema] = js.native
  def getSchema(params: ParamsResourceIndexingDatasourcesGetschema, callback: BodyResponseCallback[SchemaSchema]): Unit = js.native
  def getSchema(
    params: ParamsResourceIndexingDatasourcesGetschema,
    options: BodyResponseCallback[Readable | SchemaSchema],
    callback: BodyResponseCallback[Readable | SchemaSchema]
  ): Unit = js.native
  def getSchema(params: ParamsResourceIndexingDatasourcesGetschema, options: MethodOptions): GaxiosPromise[SchemaSchema] = js.native
  def getSchema(
    params: ParamsResourceIndexingDatasourcesGetschema,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSchema]
  ): Unit = js.native
  /**
    * Gets the schema of a data source. **Note:** This API requires an admin or service account to execute.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudsearch.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudsearch = google.cloudsearch('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud_search',
    *       'https://www.googleapis.com/auth/cloud_search.settings',
    *       'https://www.googleapis.com/auth/cloud_search.settings.indexing',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudsearch.indexing.datasources.getSchema({
    *     // If you are asked by Google to help with debugging, set this field. Otherwise, ignore this field.
    *     'debugOptions.enableDebugging': 'placeholder-value',
    *     // The name of the data source to get Schema. Format: datasources/{source_id\}
    *     name: 'datasources/my-datasource',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "objectDefinitions": [],
    *   //   "operationIds": []
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
  def getSchema(params: ParamsResourceIndexingDatasourcesGetschema, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getSchema(
    params: ParamsResourceIndexingDatasourcesGetschema,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var items: ResourceIndexingDatasourcesItems = js.native
  
  def updateSchema(): GaxiosPromise[SchemaOperation] = js.native
  def updateSchema(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def updateSchema(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def updateSchema(params: ParamsResourceIndexingDatasourcesUpdateschema): GaxiosPromise[SchemaOperation] = js.native
  def updateSchema(
    params: ParamsResourceIndexingDatasourcesUpdateschema,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def updateSchema(
    params: ParamsResourceIndexingDatasourcesUpdateschema,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def updateSchema(params: ParamsResourceIndexingDatasourcesUpdateschema, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def updateSchema(
    params: ParamsResourceIndexingDatasourcesUpdateschema,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Updates the schema of a data source. This method does not perform incremental updates to the schema. Instead, this method updates the schema by overwriting the entire schema. **Note:** This API requires an admin or service account to execute.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudsearch.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudsearch = google.cloudsearch('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud_search',
    *       'https://www.googleapis.com/auth/cloud_search.settings',
    *       'https://www.googleapis.com/auth/cloud_search.settings.indexing',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudsearch.indexing.datasources.updateSchema({
    *     // The name of the data source to update Schema. Format: datasources/{source_id\}
    *     name: 'datasources/my-datasource',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "debugOptions": {},
    *       //   "schema": {},
    *       //   "validateOnly": false
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "done": false,
    *   //   "error": {},
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "response": {}
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
  def updateSchema(params: ParamsResourceIndexingDatasourcesUpdateschema, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def updateSchema(
    params: ParamsResourceIndexingDatasourcesUpdateschema,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
