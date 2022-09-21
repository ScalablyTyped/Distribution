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

@JSImport("googleapis/build/src/apis/cloudsearch/v1", "cloudsearch_v1.Resource$Debug$Identitysources$Items")
@js.native
open class ResourceDebugIdentitysourcesItems protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def listForunmappedidentity(): GaxiosPromise[SchemaListItemNamesForUnmappedIdentityResponse] = js.native
  def listForunmappedidentity(callback: BodyResponseCallback[SchemaListItemNamesForUnmappedIdentityResponse]): Unit = js.native
  def listForunmappedidentity(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListItemNamesForUnmappedIdentityResponse] = js.native
  def listForunmappedidentity(params: ParamsResourceDebugIdentitysourcesItemsListforunmappedidentity): GaxiosPromise[SchemaListItemNamesForUnmappedIdentityResponse] = js.native
  def listForunmappedidentity(
    params: ParamsResourceDebugIdentitysourcesItemsListforunmappedidentity,
    callback: BodyResponseCallback[SchemaListItemNamesForUnmappedIdentityResponse]
  ): Unit = js.native
  def listForunmappedidentity(
    params: ParamsResourceDebugIdentitysourcesItemsListforunmappedidentity,
    options: BodyResponseCallback[Readable | SchemaListItemNamesForUnmappedIdentityResponse],
    callback: BodyResponseCallback[Readable | SchemaListItemNamesForUnmappedIdentityResponse]
  ): Unit = js.native
  def listForunmappedidentity(params: ParamsResourceDebugIdentitysourcesItemsListforunmappedidentity, options: MethodOptions): GaxiosPromise[SchemaListItemNamesForUnmappedIdentityResponse] = js.native
  def listForunmappedidentity(
    params: ParamsResourceDebugIdentitysourcesItemsListforunmappedidentity,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListItemNamesForUnmappedIdentityResponse]
  ): Unit = js.native
  /**
    * Lists names of items associated with an unmapped identity. **Note:** This API requires an admin account to execute.
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
    *   const res =
    *     await cloudsearch.debug.identitysources.items.listForunmappedidentity({
    *       // If you are asked by Google to help with debugging, set this field. Otherwise, ignore this field.
    *       'debugOptions.enableDebugging': 'placeholder-value',
    *
    *       groupResourceName: 'placeholder-value',
    *       // Maximum number of items to fetch in a request. Defaults to 100.
    *       pageSize: 'placeholder-value',
    *       // The next_page_token value returned from a previous List request, if any.
    *       pageToken: 'placeholder-value',
    *       // The name of the identity source, in the following format: identitysources/{source_id\}\}
    *       parent: 'identitysources/my-identitysource',
    *
    *       userResourceName: 'placeholder-value',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "itemNames": [],
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
  def listForunmappedidentity(
    params: ParamsResourceDebugIdentitysourcesItemsListforunmappedidentity,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def listForunmappedidentity(
    params: ParamsResourceDebugIdentitysourcesItemsListforunmappedidentity,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
