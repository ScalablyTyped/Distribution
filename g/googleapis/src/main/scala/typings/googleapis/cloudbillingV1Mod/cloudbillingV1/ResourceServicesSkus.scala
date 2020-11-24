package typings.googleapis.cloudbillingV1Mod.cloudbillingV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/cloudbilling/v1", "cloudbilling_v1.Resource$Services$Skus")
@js.native
class ResourceServicesSkus protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * cloudbilling.services.skus.list
    * @desc Lists all publicly available SKUs for a given cloud service.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Google Cloud Billing API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/cloudbilling
    * // 2. This sample uses Application Default Credentials for
    * authentication.
    * //    If not already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk and run
    * //    `gcloud beta auth application-default login`.
    * //    For more information, see
    * //
    * https://developers.google.com/identity/protocols/application-default-credentials
    * // 3. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var cloudbilling = google.cloudbilling('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // The name of the service.
    *     // Example: "services/DA34-426B-A397"
    *     parent: 'services/my-service',  // TODO: Update placeholder value.
    *
    *     auth: authClient,
    *   };
    *
    *   var handlePage = function(err, response) {
    *     if (err) {
    *       console.error(err);
    *       return;
    *     }
    *
    *     var skusPage = response['skus'];
    *     if (!skusPage) {
    *       return;
    *     }
    *     for (var i = 0; i < skusPage.length; i++) {
    *       // TODO: Change code below to process each resource in `skusPage`:
    *       console.log(JSON.stringify(skusPage[i], null, 2));
    *     }
    *
    *     if (response.nextPageToken) {
    *       request.pageToken = response.nextPageToken;
    *       cloudbilling.services.skus.list(request, handlePage);
    *     }
    *   };
    *
    *   cloudbilling.services.skus.list(request, handlePage);
    * });
    *
    * function authorize(callback) {
    *   google.auth.getApplicationDefault(function(err, authClient) {
    *     if (err) {
    *       console.error('authentication failed: ', err);
    *       return;
    *     }
    *     if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *     }
    *     callback(authClient);
    *   });
    * }
    * @alias cloudbilling.services.skus.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.currencyCode The ISO 4217 currency code for the pricing info in the response proto. Will use the conversion rate as of start_time. Optional. If not specified USD will be used.
    * @param {string=} params.endTime Optional exclusive end time of the time range for which the pricing versions will be returned. Timestamps in the future are not allowed. The time range has to be within a single calendar month in America/Los_Angeles timezone. Time range as a whole is optional. If not specified, the latest pricing will be returned (up to 12 hours old at most).
    * @param {integer=} params.pageSize Requested page size. Defaults to 5000.
    * @param {string=} params.pageToken A token identifying a page of results to return. This should be a `next_page_token` value returned from a previous `ListSkus` call. If unspecified, the first page of results is returned.
    * @param {string} params.parent The name of the service. Example: "services/DA34-426B-A397"
    * @param {string=} params.startTime Optional inclusive start time of the time range for which the pricing versions will be returned. Timestamps in the future are not allowed. The time range has to be within a single calendar month in America/Los_Angeles timezone. Time range as a whole is optional. If not specified, the latest pricing will be returned (up to 12 hours old at most).
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListSkusResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListSkusResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListSkusResponse] = js.native
  def list(params: ParamsResourceServicesSkusList): GaxiosPromise[SchemaListSkusResponse] = js.native
  def list(params: ParamsResourceServicesSkusList, callback: BodyResponseCallback[SchemaListSkusResponse]): Unit = js.native
  def list(
    params: ParamsResourceServicesSkusList,
    options: BodyResponseCallback[SchemaListSkusResponse],
    callback: BodyResponseCallback[SchemaListSkusResponse]
  ): Unit = js.native
  def list(params: ParamsResourceServicesSkusList, options: MethodOptions): GaxiosPromise[SchemaListSkusResponse] = js.native
  def list(
    params: ParamsResourceServicesSkusList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListSkusResponse]
  ): Unit = js.native
}
