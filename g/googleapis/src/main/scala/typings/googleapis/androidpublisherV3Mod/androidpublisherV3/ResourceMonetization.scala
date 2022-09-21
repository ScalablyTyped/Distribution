package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/androidpublisher/v3", "androidpublisher_v3.Resource$Monetization")
@js.native
open class ResourceMonetization protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def convertRegionPrices(): GaxiosPromise[SchemaConvertRegionPricesResponse] = js.native
  def convertRegionPrices(callback: BodyResponseCallback[SchemaConvertRegionPricesResponse]): Unit = js.native
  def convertRegionPrices(params: Unit, options: MethodOptions): GaxiosPromise[SchemaConvertRegionPricesResponse] = js.native
  def convertRegionPrices(params: ParamsResourceMonetizationConvertregionprices): GaxiosPromise[SchemaConvertRegionPricesResponse] = js.native
  def convertRegionPrices(
    params: ParamsResourceMonetizationConvertregionprices,
    callback: BodyResponseCallback[SchemaConvertRegionPricesResponse]
  ): Unit = js.native
  def convertRegionPrices(
    params: ParamsResourceMonetizationConvertregionprices,
    options: BodyResponseCallback[Readable | SchemaConvertRegionPricesResponse],
    callback: BodyResponseCallback[Readable | SchemaConvertRegionPricesResponse]
  ): Unit = js.native
  def convertRegionPrices(params: ParamsResourceMonetizationConvertregionprices, options: MethodOptions): GaxiosPromise[SchemaConvertRegionPricesResponse] = js.native
  def convertRegionPrices(
    params: ParamsResourceMonetizationConvertregionprices,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaConvertRegionPricesResponse]
  ): Unit = js.native
  /**
    * Calculates the region prices, using today's exchange rate and country-specific pricing patterns, based on the price in the request for a set of regions.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/androidpublisher.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const androidpublisher = google.androidpublisher('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/androidpublisher'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await androidpublisher.monetization.convertRegionPrices({
    *     // Required. The app package name.
    *     packageName: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "price": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "convertedOtherRegionsPrice": {},
    *   //   "convertedRegionPrices": {}
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
  def convertRegionPrices(params: ParamsResourceMonetizationConvertregionprices, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def convertRegionPrices(
    params: ParamsResourceMonetizationConvertregionprices,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var subscriptions: ResourceMonetizationSubscriptions = js.native
}
