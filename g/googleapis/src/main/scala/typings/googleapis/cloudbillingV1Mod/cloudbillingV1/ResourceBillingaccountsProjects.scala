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

@JSImport("googleapis/build/src/apis/cloudbilling/v1", "cloudbilling_v1.Resource$Billingaccounts$Projects")
@js.native
open class ResourceBillingaccountsProjects protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaListProjectBillingInfoResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListProjectBillingInfoResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListProjectBillingInfoResponse] = js.native
  def list(params: ParamsResourceBillingaccountsProjectsList): GaxiosPromise[SchemaListProjectBillingInfoResponse] = js.native
  def list(
    params: ParamsResourceBillingaccountsProjectsList,
    callback: BodyResponseCallback[SchemaListProjectBillingInfoResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceBillingaccountsProjectsList,
    options: BodyResponseCallback[Readable | SchemaListProjectBillingInfoResponse],
    callback: BodyResponseCallback[Readable | SchemaListProjectBillingInfoResponse]
  ): Unit = js.native
  def list(params: ParamsResourceBillingaccountsProjectsList, options: MethodOptions): GaxiosPromise[SchemaListProjectBillingInfoResponse] = js.native
  def list(
    params: ParamsResourceBillingaccountsProjectsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListProjectBillingInfoResponse]
  ): Unit = js.native
  /**
    * Lists the projects associated with a billing account. The current authenticated user must have the `billing.resourceAssociations.list` IAM permission, which is often given to billing account [viewers](https://cloud.google.com/billing/docs/how-to/billing-access).
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
    *   const res = await cloudbilling.billingAccounts.projects.list({
    *     // Required. The resource name of the billing account associated with the projects that you want to list. For example, `billingAccounts/012345-567890-ABCDEF`.
    *     name: 'billingAccounts/my-billingAccount',
    *     // Requested page size. The maximum page size is 100; this is also the default.
    *     pageSize: 'placeholder-value',
    *     // A token identifying a page of results to be returned. This should be a `next_page_token` value returned from a previous `ListProjectBillingInfo` call. If unspecified, the first page of results is returned.
    *     pageToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "projectBillingInfo": []
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
  def list(params: ParamsResourceBillingaccountsProjectsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceBillingaccountsProjectsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
