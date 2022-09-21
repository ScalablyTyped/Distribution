package typings.googleapis.admobV1betaMod.admobV1beta

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/admob/v1beta", "admob_v1beta.Resource$Accounts$Adsources")
@js.native
open class ResourceAccountsAdsources protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaListAdSourcesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListAdSourcesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListAdSourcesResponse] = js.native
  def list(params: ParamsResourceAccountsAdsourcesList): GaxiosPromise[SchemaListAdSourcesResponse] = js.native
  def list(
    params: ParamsResourceAccountsAdsourcesList,
    callback: BodyResponseCallback[SchemaListAdSourcesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAccountsAdsourcesList,
    options: BodyResponseCallback[Readable | SchemaListAdSourcesResponse],
    callback: BodyResponseCallback[Readable | SchemaListAdSourcesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAccountsAdsourcesList, options: MethodOptions): GaxiosPromise[SchemaListAdSourcesResponse] = js.native
  def list(
    params: ParamsResourceAccountsAdsourcesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListAdSourcesResponse]
  ): Unit = js.native
  /**
    * List the ad sources.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/admob.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const admob = google.admob('v1beta');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await admob.accounts.adSources.list({
    *     // The maximum number of ad sources to return. If unspecified or 0, at most 10,000 ad sources will be returned. The maximum value is 20,000; values above 10,000 will be coerced to 20,000.
    *     pageSize: 'placeholder-value',
    *     // A page token, received from a previous `ListAdSources` call. Provide this to retrieve the subsequent page.
    *     pageToken: 'placeholder-value',
    *     // Required. The parent which owns this collection of ad sources. Format: accounts/{publisher_id\}
    *     parent: 'accounts/my-account',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "adSources": [],
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
  def list(params: ParamsResourceAccountsAdsourcesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceAccountsAdsourcesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
