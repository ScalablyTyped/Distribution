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

@JSImport("googleapis/build/src/apis/cloudchannel/v1", "cloudchannel_v1.Resource$Accounts$Customers$Customerrepricingconfigs")
@js.native
open class ResourceAccountsCustomersCustomerrepricingconfigs protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaGoogleCloudChannelV1CustomerRepricingConfig] = js.native
  def create(callback: BodyResponseCallback[SchemaGoogleCloudChannelV1CustomerRepricingConfig]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudChannelV1CustomerRepricingConfig] = js.native
  def create(params: ParamsResourceAccountsCustomersCustomerrepricingconfigsCreate): GaxiosPromise[SchemaGoogleCloudChannelV1CustomerRepricingConfig] = js.native
  def create(
    params: ParamsResourceAccountsCustomersCustomerrepricingconfigsCreate,
    callback: BodyResponseCallback[SchemaGoogleCloudChannelV1CustomerRepricingConfig]
  ): Unit = js.native
  def create(
    params: ParamsResourceAccountsCustomersCustomerrepricingconfigsCreate,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudChannelV1CustomerRepricingConfig],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudChannelV1CustomerRepricingConfig]
  ): Unit = js.native
  def create(params: ParamsResourceAccountsCustomersCustomerrepricingconfigsCreate, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudChannelV1CustomerRepricingConfig] = js.native
  def create(
    params: ParamsResourceAccountsCustomersCustomerrepricingconfigsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudChannelV1CustomerRepricingConfig]
  ): Unit = js.native
  /**
    * Creates a CustomerRepricingConfig. Call this method to set modifications for a specific customer's bill. You can only create configs if the RepricingConfig.effective_invoice_month is a future month. If needed, you can create a config for the current month, with some restrictions. When creating a config for a future month, make sure there are no existing configs for that RepricingConfig.effective_invoice_month. The following restrictions are for creating configs in the current month. * This functionality is reserved for recovering from an erroneous config, and should not be used for regular business cases. * The new config will not modify exports used with other configs. Changes to the config may be immediate, but may take up to 24 hours. * There is a limit of ten configs for any RepricingConfig.EntitlementGranularity.entitlement or RepricingConfig.effective_invoice_month. * The contained CustomerRepricingConfig.repricing_config vaule must be different from the value used in the current config for a RepricingConfig.EntitlementGranularity.entitlement. Possible Error Codes: * PERMISSION_DENIED: If the account making the request and the account being queried are different. * INVALID_ARGUMENT: Missing or invalid required parameters in the request. Also displays if the updated config is for the current month or past months. * NOT_FOUND: The CustomerRepricingConfig specified does not exist or is not associated with the given account. * INTERNAL: Any non-user error related to technical issues in the backend. In this case, contact Cloud Channel support. Return Value: If successful, the updated CustomerRepricingConfig resource, otherwise returns an error.
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
    *   const res =
    *     await cloudchannel.accounts.customers.customerRepricingConfigs.create({
    *       // Required. The resource name of the customer that will receive this repricing config. Parent uses the format: accounts/{account_id\}/customers/{customer_id\}
    *       parent: 'accounts/my-account/customers/my-customer',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "name": "my_name",
    *         //   "repricingConfig": {},
    *         //   "updateTime": "my_updateTime"
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "name": "my_name",
    *   //   "repricingConfig": {},
    *   //   "updateTime": "my_updateTime"
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
  def create(
    params: ParamsResourceAccountsCustomersCustomerrepricingconfigsCreate,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceAccountsCustomersCustomerrepricingconfigsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(params: ParamsResourceAccountsCustomersCustomerrepricingconfigsDelete): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceAccountsCustomersCustomerrepricingconfigsDelete,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceAccountsCustomersCustomerrepricingconfigsDelete,
    options: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty],
    callback: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceAccountsCustomersCustomerrepricingconfigsDelete, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceAccountsCustomersCustomerrepricingconfigsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  /**
    * Deletes the given CustomerRepricingConfig permanently. You can only delete configs if their RepricingConfig.effective_invoice_month is set to a date after the current month. Possible error codes: * PERMISSION_DENIED: The account making the request does not own this customer. * INVALID_ARGUMENT: Required request parameters are missing or invalid. * FAILED_PRECONDITION: The CustomerRepricingConfig is active or in the past. * NOT_FOUND: No CustomerRepricingConfig found for the name in the request.
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
    *   const res =
    *     await cloudchannel.accounts.customers.customerRepricingConfigs.delete({
    *       // Required. The resource name of the customer repricing config rule to delete. Format: accounts/{account_id\}/customers/{customer_id\}/customerRepricingConfigs/{id\}.
    *       name: 'accounts/my-account/customers/my-customer/customerRepricingConfigs/my-customerRepricingConfig',
    *     });
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
  def delete(
    params: ParamsResourceAccountsCustomersCustomerrepricingconfigsDelete,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceAccountsCustomersCustomerrepricingconfigsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaGoogleCloudChannelV1CustomerRepricingConfig] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleCloudChannelV1CustomerRepricingConfig]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudChannelV1CustomerRepricingConfig] = js.native
  def get(params: ParamsResourceAccountsCustomersCustomerrepricingconfigsGet): GaxiosPromise[SchemaGoogleCloudChannelV1CustomerRepricingConfig] = js.native
  def get(
    params: ParamsResourceAccountsCustomersCustomerrepricingconfigsGet,
    callback: BodyResponseCallback[SchemaGoogleCloudChannelV1CustomerRepricingConfig]
  ): Unit = js.native
  def get(
    params: ParamsResourceAccountsCustomersCustomerrepricingconfigsGet,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudChannelV1CustomerRepricingConfig],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudChannelV1CustomerRepricingConfig]
  ): Unit = js.native
  def get(params: ParamsResourceAccountsCustomersCustomerrepricingconfigsGet, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudChannelV1CustomerRepricingConfig] = js.native
  def get(
    params: ParamsResourceAccountsCustomersCustomerrepricingconfigsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudChannelV1CustomerRepricingConfig]
  ): Unit = js.native
  /**
    * Gets information about how a Reseller modifies their bill before sending it to a Customer. Possible Error Codes: * PERMISSION_DENIED: If the account making the request and the account being queried are different. * NOT_FOUND: The CustomerRepricingConfig was not found. * INTERNAL: Any non-user error related to technical issues in the backend. In this case, contact Cloud Channel support. Return Value: If successful, the CustomerRepricingConfig resource, otherwise returns an error.
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
    *   const res =
    *     await cloudchannel.accounts.customers.customerRepricingConfigs.get({
    *       // Required. The resource name of the CustomerRepricingConfig. Format: accounts/{account_id\}/customers/{customer_id\}/customerRepricingConfigs/{id\}.
    *       name: 'accounts/my-account/customers/my-customer/customerRepricingConfigs/my-customerRepricingConfig',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "name": "my_name",
    *   //   "repricingConfig": {},
    *   //   "updateTime": "my_updateTime"
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
  def get(params: ParamsResourceAccountsCustomersCustomerrepricingconfigsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceAccountsCustomersCustomerrepricingconfigsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGoogleCloudChannelV1ListCustomerRepricingConfigsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudChannelV1ListCustomerRepricingConfigsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudChannelV1ListCustomerRepricingConfigsResponse] = js.native
  def list(params: ParamsResourceAccountsCustomersCustomerrepricingconfigsList): GaxiosPromise[SchemaGoogleCloudChannelV1ListCustomerRepricingConfigsResponse] = js.native
  def list(
    params: ParamsResourceAccountsCustomersCustomerrepricingconfigsList,
    callback: BodyResponseCallback[SchemaGoogleCloudChannelV1ListCustomerRepricingConfigsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAccountsCustomersCustomerrepricingconfigsList,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudChannelV1ListCustomerRepricingConfigsResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudChannelV1ListCustomerRepricingConfigsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAccountsCustomersCustomerrepricingconfigsList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudChannelV1ListCustomerRepricingConfigsResponse] = js.native
  def list(
    params: ParamsResourceAccountsCustomersCustomerrepricingconfigsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudChannelV1ListCustomerRepricingConfigsResponse]
  ): Unit = js.native
  /**
    * Lists information about how a Reseller modifies their bill before sending it to a Customer. Possible Error Codes: * PERMISSION_DENIED: If the account making the request and the account being queried are different. * NOT_FOUND: The CustomerRepricingConfig specified does not exist or is not associated with the given account. * INTERNAL: Any non-user error related to technical issues in the backend. In this case, contact Cloud Channel support. Return Value: If successful, the CustomerRepricingConfig resources. The data for each resource is displayed in the ascending order of: * customer ID * RepricingConfig.EntitlementGranularity.entitlement * RepricingConfig.effective_invoice_month * CustomerRepricingConfig.update_time If unsuccessful, returns an error.
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
    *   const res =
    *     await cloudchannel.accounts.customers.customerRepricingConfigs.list({
    *       // Optional. A filter for [CloudChannelService.ListCustomerRepricingConfigs] results (customer only). You can use this filter when you support a BatchGet-like query. To use the filter, you must set `parent=accounts/{account_id\}/customers/-`. Example: customer = accounts/account_id/customers/c1 OR customer = accounts/account_id/customers/c2.
    *       filter: 'placeholder-value',
    *       // Optional. The maximum number of repricing configs to return. The service may return fewer than this value. If unspecified, returns a maximum of 50 rules. The maximum value is 100; values above 100 will be coerced to 100.
    *       pageSize: 'placeholder-value',
    *       // Optional. A token identifying a page of results beyond the first page. Obtained through ListCustomerRepricingConfigsResponse.next_page_token of the previous CloudChannelService.ListCustomerRepricingConfigs call.
    *       pageToken: 'placeholder-value',
    *       // Required. The resource name of the customer. Parent uses the format: accounts/{account_id\}/customers/{customer_id\}. Supports accounts/{account_id\}/customers/- to retrieve configs for all customers.
    *       parent: 'accounts/my-account/customers/my-customer',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "customerRepricingConfigs": [],
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
  def list(params: ParamsResourceAccountsCustomersCustomerrepricingconfigsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceAccountsCustomersCustomerrepricingconfigsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaGoogleCloudChannelV1CustomerRepricingConfig] = js.native
  def patch(callback: BodyResponseCallback[SchemaGoogleCloudChannelV1CustomerRepricingConfig]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudChannelV1CustomerRepricingConfig] = js.native
  def patch(params: ParamsResourceAccountsCustomersCustomerrepricingconfigsPatch): GaxiosPromise[SchemaGoogleCloudChannelV1CustomerRepricingConfig] = js.native
  def patch(
    params: ParamsResourceAccountsCustomersCustomerrepricingconfigsPatch,
    callback: BodyResponseCallback[SchemaGoogleCloudChannelV1CustomerRepricingConfig]
  ): Unit = js.native
  def patch(
    params: ParamsResourceAccountsCustomersCustomerrepricingconfigsPatch,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudChannelV1CustomerRepricingConfig],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudChannelV1CustomerRepricingConfig]
  ): Unit = js.native
  def patch(params: ParamsResourceAccountsCustomersCustomerrepricingconfigsPatch, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudChannelV1CustomerRepricingConfig] = js.native
  def patch(
    params: ParamsResourceAccountsCustomersCustomerrepricingconfigsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudChannelV1CustomerRepricingConfig]
  ): Unit = js.native
  /**
    * Updates a CustomerRepricingConfig. Call this method to set modifications for a specific customer's bill. This method overwrites the existing CustomerRepricingConfig. You can only update configs if the RepricingConfig.effective_invoice_month is a future month. To make changes to configs for the current month, use CreateCustomerRepricingConfig, taking note of its restrictions. You cannot update the RepricingConfig.effective_invoice_month. When updating a config in the future: * This config must already exist. Possible Error Codes: * PERMISSION_DENIED: If the account making the request and the account being queried are different. * INVALID_ARGUMENT: Missing or invalid required parameters in the request. Also displays if the updated config is for the current month or past months. * NOT_FOUND: The CustomerRepricingConfig specified does not exist or is not associated with the given account. * INTERNAL: Any non-user error related to technical issues in the backend. In this case, contact Cloud Channel support. Return Value: If successful, the updated CustomerRepricingConfig resource, otherwise returns an error.
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
    *   const res =
    *     await cloudchannel.accounts.customers.customerRepricingConfigs.patch({
    *       // Output only. Resource name of the CustomerRepricingConfig. Format: accounts/{account_id\}/customers/{customer_id\}/customerRepricingConfigs/{id\}.
    *       name: 'accounts/my-account/customers/my-customer/customerRepricingConfigs/my-customerRepricingConfig',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "name": "my_name",
    *         //   "repricingConfig": {},
    *         //   "updateTime": "my_updateTime"
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "name": "my_name",
    *   //   "repricingConfig": {},
    *   //   "updateTime": "my_updateTime"
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
  def patch(params: ParamsResourceAccountsCustomersCustomerrepricingconfigsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceAccountsCustomersCustomerrepricingconfigsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
