package typings.googleapis.billingbudgetsV1beta1Mod.billingbudgetsV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/billingbudgets/v1beta1", "billingbudgets_v1beta1.Resource$Billingaccounts$Budgets")
@js.native
open class ResourceBillingaccountsBudgets protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaGoogleCloudBillingBudgetsV1beta1Budget] = js.native
  def create(callback: BodyResponseCallback[SchemaGoogleCloudBillingBudgetsV1beta1Budget]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudBillingBudgetsV1beta1Budget] = js.native
  def create(params: ParamsResourceBillingaccountsBudgetsCreate): GaxiosPromise[SchemaGoogleCloudBillingBudgetsV1beta1Budget] = js.native
  def create(
    params: ParamsResourceBillingaccountsBudgetsCreate,
    callback: BodyResponseCallback[SchemaGoogleCloudBillingBudgetsV1beta1Budget]
  ): Unit = js.native
  def create(
    params: ParamsResourceBillingaccountsBudgetsCreate,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudBillingBudgetsV1beta1Budget],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudBillingBudgetsV1beta1Budget]
  ): Unit = js.native
  def create(params: ParamsResourceBillingaccountsBudgetsCreate, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudBillingBudgetsV1beta1Budget] = js.native
  def create(
    params: ParamsResourceBillingaccountsBudgetsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudBillingBudgetsV1beta1Budget]
  ): Unit = js.native
  /**
    * Creates a new budget. See [Quotas and limits](https://cloud.google.com/billing/quotas) for more information on the limits of the number of budgets you can create.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/billingbudgets.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const billingbudgets = google.billingbudgets('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-billing',
    *       'https://www.googleapis.com/auth/cloud-platform',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await billingbudgets.billingAccounts.budgets.create({
    *     // Required. The name of the billing account to create the budget in. Values are of the form `billingAccounts/{billingAccountId\}`.
    *     parent: 'billingAccounts/my-billingAccount',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "budget": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "allUpdatesRule": {},
    *   //   "amount": {},
    *   //   "budgetFilter": {},
    *   //   "displayName": "my_displayName",
    *   //   "etag": "my_etag",
    *   //   "name": "my_name",
    *   //   "thresholdRules": []
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
  def create(params: ParamsResourceBillingaccountsBudgetsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceBillingaccountsBudgetsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(params: ParamsResourceBillingaccountsBudgetsDelete): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceBillingaccountsBudgetsDelete,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceBillingaccountsBudgetsDelete,
    options: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty],
    callback: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceBillingaccountsBudgetsDelete, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceBillingaccountsBudgetsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  /**
    * Deletes a budget. Returns successfully if already deleted.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/billingbudgets.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const billingbudgets = google.billingbudgets('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-billing',
    *       'https://www.googleapis.com/auth/cloud-platform',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await billingbudgets.billingAccounts.budgets.delete({
    *     // Required. Name of the budget to delete. Values are of the form `billingAccounts/{billingAccountId\}/budgets/{budgetId\}`.
    *     name: 'billingAccounts/my-billingAccount/budgets/my-budget',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {}
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
  def delete(params: ParamsResourceBillingaccountsBudgetsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceBillingaccountsBudgetsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaGoogleCloudBillingBudgetsV1beta1Budget] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleCloudBillingBudgetsV1beta1Budget]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudBillingBudgetsV1beta1Budget] = js.native
  def get(params: ParamsResourceBillingaccountsBudgetsGet): GaxiosPromise[SchemaGoogleCloudBillingBudgetsV1beta1Budget] = js.native
  def get(
    params: ParamsResourceBillingaccountsBudgetsGet,
    callback: BodyResponseCallback[SchemaGoogleCloudBillingBudgetsV1beta1Budget]
  ): Unit = js.native
  def get(
    params: ParamsResourceBillingaccountsBudgetsGet,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudBillingBudgetsV1beta1Budget],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudBillingBudgetsV1beta1Budget]
  ): Unit = js.native
  def get(params: ParamsResourceBillingaccountsBudgetsGet, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudBillingBudgetsV1beta1Budget] = js.native
  def get(
    params: ParamsResourceBillingaccountsBudgetsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudBillingBudgetsV1beta1Budget]
  ): Unit = js.native
  /**
    * Returns a budget. WARNING: There are some fields exposed on the Google Cloud Console that aren't available on this API. When reading from the API, you will not see these fields in the return value, though they may have been set in the Cloud Console.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/billingbudgets.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const billingbudgets = google.billingbudgets('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-billing',
    *       'https://www.googleapis.com/auth/cloud-platform',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await billingbudgets.billingAccounts.budgets.get({
    *     // Required. Name of budget to get. Values are of the form `billingAccounts/{billingAccountId\}/budgets/{budgetId\}`.
    *     name: 'billingAccounts/my-billingAccount/budgets/my-budget',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "allUpdatesRule": {},
    *   //   "amount": {},
    *   //   "budgetFilter": {},
    *   //   "displayName": "my_displayName",
    *   //   "etag": "my_etag",
    *   //   "name": "my_name",
    *   //   "thresholdRules": []
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
  def get(params: ParamsResourceBillingaccountsBudgetsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceBillingaccountsBudgetsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGoogleCloudBillingBudgetsV1beta1ListBudgetsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudBillingBudgetsV1beta1ListBudgetsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudBillingBudgetsV1beta1ListBudgetsResponse] = js.native
  def list(params: ParamsResourceBillingaccountsBudgetsList): GaxiosPromise[SchemaGoogleCloudBillingBudgetsV1beta1ListBudgetsResponse] = js.native
  def list(
    params: ParamsResourceBillingaccountsBudgetsList,
    callback: BodyResponseCallback[SchemaGoogleCloudBillingBudgetsV1beta1ListBudgetsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceBillingaccountsBudgetsList,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudBillingBudgetsV1beta1ListBudgetsResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudBillingBudgetsV1beta1ListBudgetsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceBillingaccountsBudgetsList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudBillingBudgetsV1beta1ListBudgetsResponse] = js.native
  def list(
    params: ParamsResourceBillingaccountsBudgetsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudBillingBudgetsV1beta1ListBudgetsResponse]
  ): Unit = js.native
  /**
    * Returns a list of budgets for a billing account. WARNING: There are some fields exposed on the Google Cloud Console that aren't available on this API. When reading from the API, you will not see these fields in the return value, though they may have been set in the Cloud Console.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/billingbudgets.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const billingbudgets = google.billingbudgets('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-billing',
    *       'https://www.googleapis.com/auth/cloud-platform',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await billingbudgets.billingAccounts.budgets.list({
    *     // Optional. The maximum number of budgets to return per page. The default and maximum value are 100.
    *     pageSize: 'placeholder-value',
    *     // Optional. The value returned by the last `ListBudgetsResponse` which indicates that this is a continuation of a prior `ListBudgets` call, and that the system should return the next page of data.
    *     pageToken: 'placeholder-value',
    *     // Required. Name of billing account to list budgets under. Values are of the form `billingAccounts/{billingAccountId\}`.
    *     parent: 'billingAccounts/my-billingAccount',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "budgets": [],
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
  def list(params: ParamsResourceBillingaccountsBudgetsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceBillingaccountsBudgetsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaGoogleCloudBillingBudgetsV1beta1Budget] = js.native
  def patch(callback: BodyResponseCallback[SchemaGoogleCloudBillingBudgetsV1beta1Budget]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudBillingBudgetsV1beta1Budget] = js.native
  def patch(params: ParamsResourceBillingaccountsBudgetsPatch): GaxiosPromise[SchemaGoogleCloudBillingBudgetsV1beta1Budget] = js.native
  def patch(
    params: ParamsResourceBillingaccountsBudgetsPatch,
    callback: BodyResponseCallback[SchemaGoogleCloudBillingBudgetsV1beta1Budget]
  ): Unit = js.native
  def patch(
    params: ParamsResourceBillingaccountsBudgetsPatch,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudBillingBudgetsV1beta1Budget],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudBillingBudgetsV1beta1Budget]
  ): Unit = js.native
  def patch(params: ParamsResourceBillingaccountsBudgetsPatch, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudBillingBudgetsV1beta1Budget] = js.native
  def patch(
    params: ParamsResourceBillingaccountsBudgetsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudBillingBudgetsV1beta1Budget]
  ): Unit = js.native
  /**
    * Updates a budget and returns the updated budget. WARNING: There are some fields exposed on the Google Cloud Console that aren't available on this API. Budget fields that are not exposed in this API will not be changed by this method.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/billingbudgets.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const billingbudgets = google.billingbudgets('v1beta1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-billing',
    *       'https://www.googleapis.com/auth/cloud-platform',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await billingbudgets.billingAccounts.budgets.patch({
    *     // Output only. Resource name of the budget. The resource name implies the scope of a budget. Values are of the form `billingAccounts/{billingAccountId\}/budgets/{budgetId\}`.
    *     name: 'billingAccounts/my-billingAccount/budgets/my-budget',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "budget": {},
    *       //   "updateMask": "my_updateMask"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "allUpdatesRule": {},
    *   //   "amount": {},
    *   //   "budgetFilter": {},
    *   //   "displayName": "my_displayName",
    *   //   "etag": "my_etag",
    *   //   "name": "my_name",
    *   //   "thresholdRules": []
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
  def patch(params: ParamsResourceBillingaccountsBudgetsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceBillingaccountsBudgetsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
