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

@JSImport("googleapis/build/src/apis/cloudsearch/v1", "cloudsearch_v1.Resource$Stats")
@js.native
open class ResourceStats protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def getIndex(): GaxiosPromise[SchemaGetCustomerIndexStatsResponse] = js.native
  def getIndex(callback: BodyResponseCallback[SchemaGetCustomerIndexStatsResponse]): Unit = js.native
  def getIndex(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGetCustomerIndexStatsResponse] = js.native
  def getIndex(params: ParamsResourceStatsGetindex): GaxiosPromise[SchemaGetCustomerIndexStatsResponse] = js.native
  def getIndex(
    params: ParamsResourceStatsGetindex,
    callback: BodyResponseCallback[SchemaGetCustomerIndexStatsResponse]
  ): Unit = js.native
  def getIndex(
    params: ParamsResourceStatsGetindex,
    options: BodyResponseCallback[Readable | SchemaGetCustomerIndexStatsResponse],
    callback: BodyResponseCallback[Readable | SchemaGetCustomerIndexStatsResponse]
  ): Unit = js.native
  def getIndex(params: ParamsResourceStatsGetindex, options: MethodOptions): GaxiosPromise[SchemaGetCustomerIndexStatsResponse] = js.native
  def getIndex(
    params: ParamsResourceStatsGetindex,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGetCustomerIndexStatsResponse]
  ): Unit = js.native
  /**
    * Gets indexed item statistics aggreggated across all data sources. This API only returns statistics for previous dates; it doesn't return statistics for the current day. **Note:** This API requires a standard end user account to execute.
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
    *       'https://www.googleapis.com/auth/cloud_search.stats',
    *       'https://www.googleapis.com/auth/cloud_search.stats.indexing',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudsearch.stats.getIndex({
    *     // Day of month. Must be from 1 to 31 and valid for the year and month.
    *     'fromDate.day': 'placeholder-value',
    *     // Month of date. Must be from 1 to 12.
    *     'fromDate.month': 'placeholder-value',
    *     // Year of date. Must be from 1 to 9999.
    *     'fromDate.year': 'placeholder-value',
    *     // Day of month. Must be from 1 to 31 and valid for the year and month.
    *     'toDate.day': 'placeholder-value',
    *     // Month of date. Must be from 1 to 12.
    *     'toDate.month': 'placeholder-value',
    *     // Year of date. Must be from 1 to 9999.
    *     'toDate.year': 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "averageIndexedItemCount": "my_averageIndexedItemCount",
    *   //   "stats": []
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
  def getIndex(params: ParamsResourceStatsGetindex, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getIndex(
    params: ParamsResourceStatsGetindex,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getQuery(): GaxiosPromise[SchemaGetCustomerQueryStatsResponse] = js.native
  def getQuery(callback: BodyResponseCallback[SchemaGetCustomerQueryStatsResponse]): Unit = js.native
  def getQuery(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGetCustomerQueryStatsResponse] = js.native
  def getQuery(params: ParamsResourceStatsGetquery): GaxiosPromise[SchemaGetCustomerQueryStatsResponse] = js.native
  def getQuery(
    params: ParamsResourceStatsGetquery,
    callback: BodyResponseCallback[SchemaGetCustomerQueryStatsResponse]
  ): Unit = js.native
  def getQuery(
    params: ParamsResourceStatsGetquery,
    options: BodyResponseCallback[Readable | SchemaGetCustomerQueryStatsResponse],
    callback: BodyResponseCallback[Readable | SchemaGetCustomerQueryStatsResponse]
  ): Unit = js.native
  def getQuery(params: ParamsResourceStatsGetquery, options: MethodOptions): GaxiosPromise[SchemaGetCustomerQueryStatsResponse] = js.native
  def getQuery(
    params: ParamsResourceStatsGetquery,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGetCustomerQueryStatsResponse]
  ): Unit = js.native
  /**
    * Get the query statistics for customer. **Note:** This API requires a standard end user account to execute.
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
    *       'https://www.googleapis.com/auth/cloud_search.stats',
    *       'https://www.googleapis.com/auth/cloud_search.stats.indexing',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudsearch.stats.getQuery({
    *     // Day of month. Must be from 1 to 31 and valid for the year and month.
    *     'fromDate.day': 'placeholder-value',
    *     // Month of date. Must be from 1 to 12.
    *     'fromDate.month': 'placeholder-value',
    *     // Year of date. Must be from 1 to 9999.
    *     'fromDate.year': 'placeholder-value',
    *     // Day of month. Must be from 1 to 31 and valid for the year and month.
    *     'toDate.day': 'placeholder-value',
    *     // Month of date. Must be from 1 to 12.
    *     'toDate.month': 'placeholder-value',
    *     // Year of date. Must be from 1 to 9999.
    *     'toDate.year': 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "stats": [],
    *   //   "totalQueryCount": "my_totalQueryCount"
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
  def getQuery(params: ParamsResourceStatsGetquery, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getQuery(
    params: ParamsResourceStatsGetquery,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getSearchapplication(): GaxiosPromise[SchemaGetCustomerSearchApplicationStatsResponse] = js.native
  def getSearchapplication(callback: BodyResponseCallback[SchemaGetCustomerSearchApplicationStatsResponse]): Unit = js.native
  def getSearchapplication(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGetCustomerSearchApplicationStatsResponse] = js.native
  def getSearchapplication(params: ParamsResourceStatsGetsearchapplication): GaxiosPromise[SchemaGetCustomerSearchApplicationStatsResponse] = js.native
  def getSearchapplication(
    params: ParamsResourceStatsGetsearchapplication,
    callback: BodyResponseCallback[SchemaGetCustomerSearchApplicationStatsResponse]
  ): Unit = js.native
  def getSearchapplication(
    params: ParamsResourceStatsGetsearchapplication,
    options: BodyResponseCallback[Readable | SchemaGetCustomerSearchApplicationStatsResponse],
    callback: BodyResponseCallback[Readable | SchemaGetCustomerSearchApplicationStatsResponse]
  ): Unit = js.native
  def getSearchapplication(params: ParamsResourceStatsGetsearchapplication, options: MethodOptions): GaxiosPromise[SchemaGetCustomerSearchApplicationStatsResponse] = js.native
  def getSearchapplication(
    params: ParamsResourceStatsGetsearchapplication,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGetCustomerSearchApplicationStatsResponse]
  ): Unit = js.native
  /**
    * Get search application stats for customer. **Note:** This API requires a standard end user account to execute.
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
    *       'https://www.googleapis.com/auth/cloud_search.stats',
    *       'https://www.googleapis.com/auth/cloud_search.stats.indexing',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudsearch.stats.getSearchapplication({
    *     // Day of month. Must be from 1 to 31 and valid for the year and month.
    *     'endDate.day': 'placeholder-value',
    *     // Month of date. Must be from 1 to 12.
    *     'endDate.month': 'placeholder-value',
    *     // Year of date. Must be from 1 to 9999.
    *     'endDate.year': 'placeholder-value',
    *     // Day of month. Must be from 1 to 31 and valid for the year and month.
    *     'startDate.day': 'placeholder-value',
    *     // Month of date. Must be from 1 to 12.
    *     'startDate.month': 'placeholder-value',
    *     // Year of date. Must be from 1 to 9999.
    *     'startDate.year': 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "averageSearchApplicationCount": "my_averageSearchApplicationCount",
    *   //   "stats": []
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
  def getSearchapplication(params: ParamsResourceStatsGetsearchapplication, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getSearchapplication(
    params: ParamsResourceStatsGetsearchapplication,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getSession(): GaxiosPromise[SchemaGetCustomerSessionStatsResponse] = js.native
  def getSession(callback: BodyResponseCallback[SchemaGetCustomerSessionStatsResponse]): Unit = js.native
  def getSession(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGetCustomerSessionStatsResponse] = js.native
  def getSession(params: ParamsResourceStatsGetsession): GaxiosPromise[SchemaGetCustomerSessionStatsResponse] = js.native
  def getSession(
    params: ParamsResourceStatsGetsession,
    callback: BodyResponseCallback[SchemaGetCustomerSessionStatsResponse]
  ): Unit = js.native
  def getSession(
    params: ParamsResourceStatsGetsession,
    options: BodyResponseCallback[Readable | SchemaGetCustomerSessionStatsResponse],
    callback: BodyResponseCallback[Readable | SchemaGetCustomerSessionStatsResponse]
  ): Unit = js.native
  def getSession(params: ParamsResourceStatsGetsession, options: MethodOptions): GaxiosPromise[SchemaGetCustomerSessionStatsResponse] = js.native
  def getSession(
    params: ParamsResourceStatsGetsession,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGetCustomerSessionStatsResponse]
  ): Unit = js.native
  /**
    * Get the # of search sessions, % of successful sessions with a click query statistics for customer. **Note:** This API requires a standard end user account to execute.
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
    *       'https://www.googleapis.com/auth/cloud_search.stats',
    *       'https://www.googleapis.com/auth/cloud_search.stats.indexing',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudsearch.stats.getSession({
    *     // Day of month. Must be from 1 to 31 and valid for the year and month.
    *     'fromDate.day': 'placeholder-value',
    *     // Month of date. Must be from 1 to 12.
    *     'fromDate.month': 'placeholder-value',
    *     // Year of date. Must be from 1 to 9999.
    *     'fromDate.year': 'placeholder-value',
    *     // Day of month. Must be from 1 to 31 and valid for the year and month.
    *     'toDate.day': 'placeholder-value',
    *     // Month of date. Must be from 1 to 12.
    *     'toDate.month': 'placeholder-value',
    *     // Year of date. Must be from 1 to 9999.
    *     'toDate.year': 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "stats": []
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
  def getSession(params: ParamsResourceStatsGetsession, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getSession(
    params: ParamsResourceStatsGetsession,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getUser(): GaxiosPromise[SchemaGetCustomerUserStatsResponse] = js.native
  def getUser(callback: BodyResponseCallback[SchemaGetCustomerUserStatsResponse]): Unit = js.native
  def getUser(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGetCustomerUserStatsResponse] = js.native
  def getUser(params: ParamsResourceStatsGetuser): GaxiosPromise[SchemaGetCustomerUserStatsResponse] = js.native
  def getUser(
    params: ParamsResourceStatsGetuser,
    callback: BodyResponseCallback[SchemaGetCustomerUserStatsResponse]
  ): Unit = js.native
  def getUser(
    params: ParamsResourceStatsGetuser,
    options: BodyResponseCallback[Readable | SchemaGetCustomerUserStatsResponse],
    callback: BodyResponseCallback[Readable | SchemaGetCustomerUserStatsResponse]
  ): Unit = js.native
  def getUser(params: ParamsResourceStatsGetuser, options: MethodOptions): GaxiosPromise[SchemaGetCustomerUserStatsResponse] = js.native
  def getUser(
    params: ParamsResourceStatsGetuser,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGetCustomerUserStatsResponse]
  ): Unit = js.native
  /**
    * Get the users statistics for customer. **Note:** This API requires a standard end user account to execute.
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
    *       'https://www.googleapis.com/auth/cloud_search.stats',
    *       'https://www.googleapis.com/auth/cloud_search.stats.indexing',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudsearch.stats.getUser({
    *     // Day of month. Must be from 1 to 31 and valid for the year and month.
    *     'fromDate.day': 'placeholder-value',
    *     // Month of date. Must be from 1 to 12.
    *     'fromDate.month': 'placeholder-value',
    *     // Year of date. Must be from 1 to 9999.
    *     'fromDate.year': 'placeholder-value',
    *     // Day of month. Must be from 1 to 31 and valid for the year and month.
    *     'toDate.day': 'placeholder-value',
    *     // Month of date. Must be from 1 to 12.
    *     'toDate.month': 'placeholder-value',
    *     // Year of date. Must be from 1 to 9999.
    *     'toDate.year': 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "stats": []
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
  def getUser(params: ParamsResourceStatsGetuser, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getUser(
    params: ParamsResourceStatsGetuser,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var index: ResourceStatsIndex = js.native
  
  var query: ResourceStatsQuery = js.native
  
  var session: ResourceStatsSession = js.native
  
  var user: ResourceStatsUser = js.native
}
