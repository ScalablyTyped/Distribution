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

@JSImport("googleapis/build/src/apis/cloudchannel/v1", "cloudchannel_v1.Resource$Accounts$Offers")
@js.native
open class ResourceAccountsOffers protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaGoogleCloudChannelV1ListOffersResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudChannelV1ListOffersResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudChannelV1ListOffersResponse] = js.native
  def list(params: ParamsResourceAccountsOffersList): GaxiosPromise[SchemaGoogleCloudChannelV1ListOffersResponse] = js.native
  def list(
    params: ParamsResourceAccountsOffersList,
    callback: BodyResponseCallback[SchemaGoogleCloudChannelV1ListOffersResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAccountsOffersList,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudChannelV1ListOffersResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudChannelV1ListOffersResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAccountsOffersList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudChannelV1ListOffersResponse] = js.native
  def list(
    params: ParamsResourceAccountsOffersList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudChannelV1ListOffersResponse]
  ): Unit = js.native
  /**
    * Lists the Offers the reseller can sell. Possible error codes: * INVALID_ARGUMENT: Required request parameters are missing or invalid.
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
    *   const res = await cloudchannel.accounts.offers.list({
    *     // Optional. The expression to filter results by name (name of the Offer), sku.name (name of the SKU), or sku.product.name (name of the Product). Example 1: sku.product.name=products/p1 AND sku.name!=products/p1/skus/s1 Example 2: name=accounts/a1/offers/o1
    *     filter: 'placeholder-value',
    *     // Optional. The BCP-47 language code. For example, "en-US". The response will localize in the corresponding language code, if specified. The default value is "en-US".
    *     languageCode: 'placeholder-value',
    *     // Optional. Requested page size. Server might return fewer results than requested. If unspecified, returns at most 500 Offers. The maximum value is 1000; the server will coerce values above 1000.
    *     pageSize: 'placeholder-value',
    *     // Optional. A token for a page of results other than the first page.
    *     pageToken: 'placeholder-value',
    *     // Required. The resource name of the reseller account from which to list Offers. Parent uses the format: accounts/{account_id\}.
    *     parent: 'accounts/my-account',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "offers": []
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
  def list(params: ParamsResourceAccountsOffersList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceAccountsOffersList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
