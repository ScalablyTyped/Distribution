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

@JSImport("googleapis/build/src/apis/admob/v1beta", "admob_v1beta.Resource$Accounts$Networkreport")
@js.native
open class ResourceAccountsNetworkreport protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def generate(): GaxiosPromise[SchemaGenerateNetworkReportResponse] = js.native
  def generate(callback: BodyResponseCallback[SchemaGenerateNetworkReportResponse]): Unit = js.native
  def generate(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGenerateNetworkReportResponse] = js.native
  def generate(params: ParamsResourceAccountsNetworkreportGenerate): GaxiosPromise[SchemaGenerateNetworkReportResponse] = js.native
  def generate(
    params: ParamsResourceAccountsNetworkreportGenerate,
    callback: BodyResponseCallback[SchemaGenerateNetworkReportResponse]
  ): Unit = js.native
  def generate(
    params: ParamsResourceAccountsNetworkreportGenerate,
    options: BodyResponseCallback[Readable | SchemaGenerateNetworkReportResponse],
    callback: BodyResponseCallback[Readable | SchemaGenerateNetworkReportResponse]
  ): Unit = js.native
  def generate(params: ParamsResourceAccountsNetworkreportGenerate, options: MethodOptions): GaxiosPromise[SchemaGenerateNetworkReportResponse] = js.native
  def generate(
    params: ParamsResourceAccountsNetworkreportGenerate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGenerateNetworkReportResponse]
  ): Unit = js.native
  /**
    * Generates an AdMob Network report based on the provided report specification. Returns result of a server-side streaming RPC. The result is returned in a sequence of responses.
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
    *     scopes: [
    *       'https://www.googleapis.com/auth/admob.readonly',
    *       'https://www.googleapis.com/auth/admob.report',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await admob.accounts.networkReport.generate({
    *     // Resource name of the account to generate the report for. Example: accounts/pub-9876543210987654
    *     parent: 'accounts/my-account',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "reportSpec": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "footer": {},
    *   //   "header": {},
    *   //   "row": {}
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
  def generate(params: ParamsResourceAccountsNetworkreportGenerate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def generate(
    params: ParamsResourceAccountsNetworkreportGenerate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
