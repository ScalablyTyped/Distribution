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

@JSImport("googleapis/build/src/apis/cloudsearch/v1", "cloudsearch_v1.Resource$Query")
@js.native
open class ResourceQuery protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def search(): GaxiosPromise[SchemaSearchResponse] = js.native
  def search(callback: BodyResponseCallback[SchemaSearchResponse]): Unit = js.native
  def search(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSearchResponse] = js.native
  def search(params: ParamsResourceQuerySearch): GaxiosPromise[SchemaSearchResponse] = js.native
  def search(params: ParamsResourceQuerySearch, callback: BodyResponseCallback[SchemaSearchResponse]): Unit = js.native
  def search(
    params: ParamsResourceQuerySearch,
    options: BodyResponseCallback[Readable | SchemaSearchResponse],
    callback: BodyResponseCallback[Readable | SchemaSearchResponse]
  ): Unit = js.native
  def search(params: ParamsResourceQuerySearch, options: MethodOptions): GaxiosPromise[SchemaSearchResponse] = js.native
  def search(
    params: ParamsResourceQuerySearch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSearchResponse]
  ): Unit = js.native
  /**
    * The Cloud Search Query API provides the search method, which returns the most relevant results from a user query. The results can come from Google Workspace apps, such as Gmail or Google Drive, or they can come from data that you have indexed from a third party. **Note:** This API requires a standard end user account to execute. A service account can't perform Query API requests directly; to use a service account to perform queries, set up [Google Workspace domain-wide delegation of authority](https://developers.google.com/cloud-search/docs/guides/delegation/).
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
    *       'https://www.googleapis.com/auth/cloud_search.query',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudsearch.query.search({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "contextAttributes": [],
    *       //   "dataSourceRestrictions": [],
    *       //   "facetOptions": [],
    *       //   "pageSize": 0,
    *       //   "query": "my_query",
    *       //   "queryInterpretationOptions": {},
    *       //   "requestOptions": {},
    *       //   "sortOptions": {},
    *       //   "start": 0
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "debugInfo": {},
    *   //   "errorInfo": {},
    *   //   "facetResults": [],
    *   //   "hasMoreResults": false,
    *   //   "queryInterpretation": {},
    *   //   "resultCountEstimate": "my_resultCountEstimate",
    *   //   "resultCountExact": "my_resultCountExact",
    *   //   "resultCounts": {},
    *   //   "results": [],
    *   //   "spellResults": [],
    *   //   "structuredResults": []
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
  def search(params: ParamsResourceQuerySearch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def search(
    params: ParamsResourceQuerySearch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var sources: ResourceQuerySources = js.native
  
  def suggest(): GaxiosPromise[SchemaSuggestResponse] = js.native
  def suggest(callback: BodyResponseCallback[SchemaSuggestResponse]): Unit = js.native
  def suggest(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSuggestResponse] = js.native
  def suggest(params: ParamsResourceQuerySuggest): GaxiosPromise[SchemaSuggestResponse] = js.native
  def suggest(params: ParamsResourceQuerySuggest, callback: BodyResponseCallback[SchemaSuggestResponse]): Unit = js.native
  def suggest(
    params: ParamsResourceQuerySuggest,
    options: BodyResponseCallback[Readable | SchemaSuggestResponse],
    callback: BodyResponseCallback[Readable | SchemaSuggestResponse]
  ): Unit = js.native
  def suggest(params: ParamsResourceQuerySuggest, options: MethodOptions): GaxiosPromise[SchemaSuggestResponse] = js.native
  def suggest(
    params: ParamsResourceQuerySuggest,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSuggestResponse]
  ): Unit = js.native
  /**
    * Provides suggestions for autocompleting the query. **Note:** This API requires a standard end user account to execute. A service account can't perform Query API requests directly; to use a service account to perform queries, set up [Google Workspace domain-wide delegation of authority](https://developers.google.com/cloud-search/docs/guides/delegation/).
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
    *       'https://www.googleapis.com/auth/cloud_search.query',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudsearch.query.suggest({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "dataSourceRestrictions": [],
    *       //   "query": "my_query",
    *       //   "requestOptions": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "suggestResults": []
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
  def suggest(params: ParamsResourceQuerySuggest, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def suggest(
    params: ParamsResourceQuerySuggest,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
