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

@JSImport("googleapis/build/src/apis/admob/v1beta", "admob_v1beta.Resource$Accounts$Apps")
@js.native
open class ResourceAccountsApps protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaListAppsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListAppsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListAppsResponse] = js.native
  def list(params: ParamsResourceAccountsAppsList): GaxiosPromise[SchemaListAppsResponse] = js.native
  def list(params: ParamsResourceAccountsAppsList, callback: BodyResponseCallback[SchemaListAppsResponse]): Unit = js.native
  def list(
    params: ParamsResourceAccountsAppsList,
    options: BodyResponseCallback[Readable | SchemaListAppsResponse],
    callback: BodyResponseCallback[Readable | SchemaListAppsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAccountsAppsList, options: MethodOptions): GaxiosPromise[SchemaListAppsResponse] = js.native
  def list(
    params: ParamsResourceAccountsAppsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListAppsResponse]
  ): Unit = js.native
  /**
    * List the apps under the specified AdMob account.
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
    *     scopes: ['https://www.googleapis.com/auth/admob.readonly'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await admob.accounts.apps.list({
    *     // The maximum number of apps to return. If unspecified or 0, at most 10,000 apps will be returned. The maximum value is 20,000; values above 20,000 will be coerced to 20,000.
    *     pageSize: 'placeholder-value',
    *     // The value returned by the last `ListAppsResponse`; indicates that this is a continuation of a prior `ListApps` call, and that the system should return the next page of data.
    *     pageToken: 'placeholder-value',
    *     // Required. Resource name of the account to list apps for. Example: accounts/pub-9876543210987654
    *     parent: 'accounts/my-account',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "apps": [],
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
  def list(params: ParamsResourceAccountsAppsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceAccountsAppsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
