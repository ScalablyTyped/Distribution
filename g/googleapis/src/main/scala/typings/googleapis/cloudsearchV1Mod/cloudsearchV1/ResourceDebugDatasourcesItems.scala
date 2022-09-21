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

@JSImport("googleapis/build/src/apis/cloudsearch/v1", "cloudsearch_v1.Resource$Debug$Datasources$Items")
@js.native
open class ResourceDebugDatasourcesItems protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def checkAccess(): GaxiosPromise[SchemaCheckAccessResponse] = js.native
  def checkAccess(callback: BodyResponseCallback[SchemaCheckAccessResponse]): Unit = js.native
  def checkAccess(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCheckAccessResponse] = js.native
  def checkAccess(params: ParamsResourceDebugDatasourcesItemsCheckaccess): GaxiosPromise[SchemaCheckAccessResponse] = js.native
  def checkAccess(
    params: ParamsResourceDebugDatasourcesItemsCheckaccess,
    callback: BodyResponseCallback[SchemaCheckAccessResponse]
  ): Unit = js.native
  def checkAccess(
    params: ParamsResourceDebugDatasourcesItemsCheckaccess,
    options: BodyResponseCallback[Readable | SchemaCheckAccessResponse],
    callback: BodyResponseCallback[Readable | SchemaCheckAccessResponse]
  ): Unit = js.native
  def checkAccess(params: ParamsResourceDebugDatasourcesItemsCheckaccess, options: MethodOptions): GaxiosPromise[SchemaCheckAccessResponse] = js.native
  def checkAccess(
    params: ParamsResourceDebugDatasourcesItemsCheckaccess,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCheckAccessResponse]
  ): Unit = js.native
  /**
    * Checks whether an item is accessible by specified principal. Principal must be a user; groups and domain values aren't supported. **Note:** This API requires an admin account to execute.
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
    *       'https://www.googleapis.com/auth/cloud_search.debug',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudsearch.debug.datasources.items.checkAccess({
    *     // If you are asked by Google to help with debugging, set this field. Otherwise, ignore this field.
    *     'debugOptions.enableDebugging': 'placeholder-value',
    *     // Item name, format: datasources/{source_id\}/items/{item_id\}
    *     name: 'datasources/my-datasource/items/my-item',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "groupResourceName": "my_groupResourceName",
    *       //   "gsuitePrincipal": {},
    *       //   "userResourceName": "my_userResourceName"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "hasAccess": false
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
  def checkAccess(params: ParamsResourceDebugDatasourcesItemsCheckaccess, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def checkAccess(
    params: ParamsResourceDebugDatasourcesItemsCheckaccess,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def searchByViewUrl(): GaxiosPromise[SchemaSearchItemsByViewUrlResponse] = js.native
  def searchByViewUrl(callback: BodyResponseCallback[SchemaSearchItemsByViewUrlResponse]): Unit = js.native
  def searchByViewUrl(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSearchItemsByViewUrlResponse] = js.native
  def searchByViewUrl(params: ParamsResourceDebugDatasourcesItemsSearchbyviewurl): GaxiosPromise[SchemaSearchItemsByViewUrlResponse] = js.native
  def searchByViewUrl(
    params: ParamsResourceDebugDatasourcesItemsSearchbyviewurl,
    callback: BodyResponseCallback[SchemaSearchItemsByViewUrlResponse]
  ): Unit = js.native
  def searchByViewUrl(
    params: ParamsResourceDebugDatasourcesItemsSearchbyviewurl,
    options: BodyResponseCallback[Readable | SchemaSearchItemsByViewUrlResponse],
    callback: BodyResponseCallback[Readable | SchemaSearchItemsByViewUrlResponse]
  ): Unit = js.native
  def searchByViewUrl(params: ParamsResourceDebugDatasourcesItemsSearchbyviewurl, options: MethodOptions): GaxiosPromise[SchemaSearchItemsByViewUrlResponse] = js.native
  def searchByViewUrl(
    params: ParamsResourceDebugDatasourcesItemsSearchbyviewurl,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSearchItemsByViewUrlResponse]
  ): Unit = js.native
  /**
    * Fetches the item whose viewUrl exactly matches that of the URL provided in the request. **Note:** This API requires an admin account to execute.
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
    *       'https://www.googleapis.com/auth/cloud_search.debug',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudsearch.debug.datasources.items.searchByViewUrl({
    *     // Source name, format: datasources/{source_id\}
    *     name: 'datasources/my-datasource',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "debugOptions": {},
    *       //   "pageToken": "my_pageToken",
    *       //   "viewUrl": "my_viewUrl"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "items": [],
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
  def searchByViewUrl(params: ParamsResourceDebugDatasourcesItemsSearchbyviewurl, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def searchByViewUrl(
    params: ParamsResourceDebugDatasourcesItemsSearchbyviewurl,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var unmappedids: ResourceDebugDatasourcesItemsUnmappedids = js.native
}
