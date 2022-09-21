package typings.googleapis.cloudchannelV1Mod.cloudchannelV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/cloudchannel/v1", "cloudchannel_v1.Resource$Products")
@js.native
open class ResourceProducts protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaGoogleCloudChannelV1ListProductsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudChannelV1ListProductsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudChannelV1ListProductsResponse] = js.native
  def list(params: ParamsResourceProductsList): GaxiosPromise[SchemaGoogleCloudChannelV1ListProductsResponse] = js.native
  def list(
    params: ParamsResourceProductsList,
    callback: BodyResponseCallback[SchemaGoogleCloudChannelV1ListProductsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProductsList,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudChannelV1ListProductsResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudChannelV1ListProductsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProductsList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudChannelV1ListProductsResponse] = js.native
  def list(
    params: ParamsResourceProductsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudChannelV1ListProductsResponse]
  ): Unit = js.native
  /**
    * Lists the Products the reseller is authorized to sell. Possible error codes: * INVALID_ARGUMENT: Required request parameters are missing or invalid.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudchannel.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudchannel = google.cloudchannel('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/apps.order'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudchannel.products.list({
    *     // Required. The resource name of the reseller account. Format: accounts/{account_id\}.
    *     account: 'placeholder-value',
    *     // Optional. The BCP-47 language code. For example, "en-US". The response will localize in the corresponding language code, if specified. The default value is "en-US".
    *     languageCode: 'placeholder-value',
    *     // Optional. Requested page size. Server might return fewer results than requested. If unspecified, returns at most 100 Products. The maximum value is 1000; the server will coerce values above 1000.
    *     pageSize: 'placeholder-value',
    *     // Optional. A token for a page of results other than the first page.
    *     pageToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "products": []
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
  def list(params: ParamsResourceProductsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProductsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var skus: ResourceProductsSkus = js.native
}
