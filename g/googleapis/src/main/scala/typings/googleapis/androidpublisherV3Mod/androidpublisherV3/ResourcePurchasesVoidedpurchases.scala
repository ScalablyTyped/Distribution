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

@JSImport("googleapis/build/src/apis/androidpublisher/v3", "androidpublisher_v3.Resource$Purchases$Voidedpurchases")
@js.native
open class ResourcePurchasesVoidedpurchases protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaVoidedPurchasesListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaVoidedPurchasesListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaVoidedPurchasesListResponse] = js.native
  def list(params: ParamsResourcePurchasesVoidedpurchasesList): GaxiosPromise[SchemaVoidedPurchasesListResponse] = js.native
  def list(
    params: ParamsResourcePurchasesVoidedpurchasesList,
    callback: BodyResponseCallback[SchemaVoidedPurchasesListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourcePurchasesVoidedpurchasesList,
    options: BodyResponseCallback[Readable | SchemaVoidedPurchasesListResponse],
    callback: BodyResponseCallback[Readable | SchemaVoidedPurchasesListResponse]
  ): Unit = js.native
  def list(params: ParamsResourcePurchasesVoidedpurchasesList, options: MethodOptions): GaxiosPromise[SchemaVoidedPurchasesListResponse] = js.native
  def list(
    params: ParamsResourcePurchasesVoidedpurchasesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaVoidedPurchasesListResponse]
  ): Unit = js.native
  /**
    * Lists the purchases that were canceled, refunded or charged-back.
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
    *   const res = await androidpublisher.purchases.voidedpurchases.list({
    *     // The time, in milliseconds since the Epoch, of the newest voided purchase that you want to see in the response. The value of this parameter cannot be greater than the current time and is ignored if a pagination token is set. Default value is current time. Note: This filter is applied on the time at which the record is seen as voided by our systems and not the actual voided time returned in the response.
    *     endTime: 'placeholder-value',
    *     // Defines how many results the list operation should return. The default number depends on the resource collection.
    *     maxResults: 'placeholder-value',
    *     // The package name of the application for which voided purchases need to be returned (for example, 'com.some.thing').
    *     packageName: 'placeholder-value',
    *     // Defines the index of the first element to return. This can only be used if indexed paging is enabled.
    *     startIndex: 'placeholder-value',
    *     // The time, in milliseconds since the Epoch, of the oldest voided purchase that you want to see in the response. The value of this parameter cannot be older than 30 days and is ignored if a pagination token is set. Default value is current time minus 30 days. Note: This filter is applied on the time at which the record is seen as voided by our systems and not the actual voided time returned in the response.
    *     startTime: 'placeholder-value',
    *     // Defines the token of the page to return, usually taken from TokenPagination. This can only be used if token paging is enabled.
    *     token: 'placeholder-value',
    *     // The type of voided purchases that you want to see in the response. Possible values are: 0. Only voided in-app product purchases will be returned in the response. This is the default value. 1. Both voided in-app purchases and voided subscription purchases will be returned in the response. Note: Before requesting to receive voided subscription purchases, you must switch to use orderId in the response which uniquely identifies one-time purchases and subscriptions. Otherwise, you will receive multiple subscription orders with the same PurchaseToken, because subscription renewal orders share the same PurchaseToken.
    *     type: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "pageInfo": {},
    *   //   "tokenPagination": {},
    *   //   "voidedPurchases": []
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
  def list(params: ParamsResourcePurchasesVoidedpurchasesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourcePurchasesVoidedpurchasesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
