package typings.googleapis.cloudbillingV1Mod.cloudbillingV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/cloudbilling/v1", "cloudbilling_v1.Resource$Services$Skus")
@js.native
open class ResourceServicesSkus protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaListSkusResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListSkusResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListSkusResponse] = js.native
  def list(params: ParamsResourceServicesSkusList): GaxiosPromise[SchemaListSkusResponse] = js.native
  def list(params: ParamsResourceServicesSkusList, callback: BodyResponseCallback[SchemaListSkusResponse]): Unit = js.native
  def list(
    params: ParamsResourceServicesSkusList,
    options: BodyResponseCallback[Readable | SchemaListSkusResponse],
    callback: BodyResponseCallback[Readable | SchemaListSkusResponse]
  ): Unit = js.native
  def list(params: ParamsResourceServicesSkusList, options: MethodOptions): GaxiosPromise[SchemaListSkusResponse] = js.native
  def list(
    params: ParamsResourceServicesSkusList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListSkusResponse]
  ): Unit = js.native
  /**
    * Lists all publicly available SKUs for a given cloud service.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudbilling.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudbilling = google.cloudbilling('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-billing',
    *       'https://www.googleapis.com/auth/cloud-billing.readonly',
    *       'https://www.googleapis.com/auth/cloud-platform',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudbilling.services.skus.list({
    *     // The ISO 4217 currency code for the pricing info in the response proto. Will use the conversion rate as of start_time. Optional. If not specified USD will be used.
    *     currencyCode: 'placeholder-value',
    *     // Optional exclusive end time of the time range for which the pricing versions will be returned. Timestamps in the future are not allowed. The time range has to be within a single calendar month in America/Los_Angeles timezone. Time range as a whole is optional. If not specified, the latest pricing will be returned (up to 12 hours old at most).
    *     endTime: 'placeholder-value',
    *     // Requested page size. Defaults to 5000.
    *     pageSize: 'placeholder-value',
    *     // A token identifying a page of results to return. This should be a `next_page_token` value returned from a previous `ListSkus` call. If unspecified, the first page of results is returned.
    *     pageToken: 'placeholder-value',
    *     // Required. The name of the service. Example: "services/DA34-426B-A397"
    *     parent: 'services/my-service',
    *     // Optional inclusive start time of the time range for which the pricing versions will be returned. Timestamps in the future are not allowed. The time range has to be within a single calendar month in America/Los_Angeles timezone. Time range as a whole is optional. If not specified, the latest pricing will be returned (up to 12 hours old at most).
    *     startTime: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "skus": []
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
  def list(params: ParamsResourceServicesSkusList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceServicesSkusList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
