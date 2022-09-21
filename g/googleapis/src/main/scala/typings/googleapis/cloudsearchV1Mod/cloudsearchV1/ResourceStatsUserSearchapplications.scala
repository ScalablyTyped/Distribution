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

@JSImport("googleapis/build/src/apis/cloudsearch/v1", "cloudsearch_v1.Resource$Stats$User$Searchapplications")
@js.native
open class ResourceStatsUserSearchapplications protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaGetSearchApplicationUserStatsResponse] = js.native
  def get(callback: BodyResponseCallback[SchemaGetSearchApplicationUserStatsResponse]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGetSearchApplicationUserStatsResponse] = js.native
  def get(params: ParamsResourceStatsUserSearchapplicationsGet): GaxiosPromise[SchemaGetSearchApplicationUserStatsResponse] = js.native
  def get(
    params: ParamsResourceStatsUserSearchapplicationsGet,
    callback: BodyResponseCallback[SchemaGetSearchApplicationUserStatsResponse]
  ): Unit = js.native
  def get(
    params: ParamsResourceStatsUserSearchapplicationsGet,
    options: BodyResponseCallback[Readable | SchemaGetSearchApplicationUserStatsResponse],
    callback: BodyResponseCallback[Readable | SchemaGetSearchApplicationUserStatsResponse]
  ): Unit = js.native
  def get(params: ParamsResourceStatsUserSearchapplicationsGet, options: MethodOptions): GaxiosPromise[SchemaGetSearchApplicationUserStatsResponse] = js.native
  def get(
    params: ParamsResourceStatsUserSearchapplicationsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGetSearchApplicationUserStatsResponse]
  ): Unit = js.native
  /**
    * Get the users statistics for search application. **Note:** This API requires a standard end user account to execute.
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
    *   const res = await cloudsearch.stats.user.searchapplications.get({
    *     // Day of month. Must be from 1 to 31 and valid for the year and month.
    *     'fromDate.day': 'placeholder-value',
    *     // Month of date. Must be from 1 to 12.
    *     'fromDate.month': 'placeholder-value',
    *     // Year of date. Must be from 1 to 9999.
    *     'fromDate.year': 'placeholder-value',
    *     // The resource id of the search application session stats, in the following format: searchapplications/{application_id\}
    *     name: 'searchapplications/my-searchapplication',
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
  def get(params: ParamsResourceStatsUserSearchapplicationsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceStatsUserSearchapplicationsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
