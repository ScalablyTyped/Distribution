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

@JSImport("googleapis/build/src/apis/cloudchannel/v1", "cloudchannel_v1.Resource$Accounts$Channelpartnerlinks$Customers")
@js.native
open class ResourceAccountsChannelpartnerlinksCustomers protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaGoogleCloudChannelV1Customer] = js.native
  def create(callback: BodyResponseCallback[SchemaGoogleCloudChannelV1Customer]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudChannelV1Customer] = js.native
  def create(params: ParamsResourceAccountsChannelpartnerlinksCustomersCreate): GaxiosPromise[SchemaGoogleCloudChannelV1Customer] = js.native
  def create(
    params: ParamsResourceAccountsChannelpartnerlinksCustomersCreate,
    callback: BodyResponseCallback[SchemaGoogleCloudChannelV1Customer]
  ): Unit = js.native
  def create(
    params: ParamsResourceAccountsChannelpartnerlinksCustomersCreate,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudChannelV1Customer],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudChannelV1Customer]
  ): Unit = js.native
  def create(params: ParamsResourceAccountsChannelpartnerlinksCustomersCreate, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudChannelV1Customer] = js.native
  def create(
    params: ParamsResourceAccountsChannelpartnerlinksCustomersCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudChannelV1Customer]
  ): Unit = js.native
  /**
    * Creates a new Customer resource under the reseller or distributor account. Possible error codes: * PERMISSION_DENIED: The reseller account making the request is different from the reseller account in the API request. * INVALID_ARGUMENT: * Required request parameters are missing or invalid. * Domain field value doesn't match the primary email domain. Return value: The newly created Customer resource.
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
    *   const res = await cloudchannel.accounts.channelPartnerLinks.customers.create({
    *     // Required. The resource name of reseller account in which to create the customer. Parent uses the format: accounts/{account_id\}
    *     parent: 'accounts/my-account/channelPartnerLinks/my-channelPartnerLink',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "alternateEmail": "my_alternateEmail",
    *       //   "channelPartnerId": "my_channelPartnerId",
    *       //   "cloudIdentityId": "my_cloudIdentityId",
    *       //   "cloudIdentityInfo": {},
    *       //   "createTime": "my_createTime",
    *       //   "domain": "my_domain",
    *       //   "languageCode": "my_languageCode",
    *       //   "name": "my_name",
    *       //   "orgDisplayName": "my_orgDisplayName",
    *       //   "orgPostalAddress": {},
    *       //   "primaryContactInfo": {},
    *       //   "updateTime": "my_updateTime"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "alternateEmail": "my_alternateEmail",
    *   //   "channelPartnerId": "my_channelPartnerId",
    *   //   "cloudIdentityId": "my_cloudIdentityId",
    *   //   "cloudIdentityInfo": {},
    *   //   "createTime": "my_createTime",
    *   //   "domain": "my_domain",
    *   //   "languageCode": "my_languageCode",
    *   //   "name": "my_name",
    *   //   "orgDisplayName": "my_orgDisplayName",
    *   //   "orgPostalAddress": {},
    *   //   "primaryContactInfo": {},
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
  def create(params: ParamsResourceAccountsChannelpartnerlinksCustomersCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceAccountsChannelpartnerlinksCustomersCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(params: ParamsResourceAccountsChannelpartnerlinksCustomersDelete): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceAccountsChannelpartnerlinksCustomersDelete,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceAccountsChannelpartnerlinksCustomersDelete,
    options: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty],
    callback: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceAccountsChannelpartnerlinksCustomersDelete, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceAccountsChannelpartnerlinksCustomersDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  /**
    * Deletes the given Customer permanently. Possible error codes: * PERMISSION_DENIED: The account making the request does not own this customer. * INVALID_ARGUMENT: Required request parameters are missing or invalid. * FAILED_PRECONDITION: The customer has existing entitlements. * NOT_FOUND: No Customer resource found for the name in the request.
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
    *   const res = await cloudchannel.accounts.channelPartnerLinks.customers.delete({
    *     // Required. The resource name of the customer to delete.
    *     name: 'accounts/my-account/channelPartnerLinks/my-channelPartnerLink/customers/my-customer',
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
  def delete(params: ParamsResourceAccountsChannelpartnerlinksCustomersDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceAccountsChannelpartnerlinksCustomersDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaGoogleCloudChannelV1Customer] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleCloudChannelV1Customer]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudChannelV1Customer] = js.native
  def get(params: ParamsResourceAccountsChannelpartnerlinksCustomersGet): GaxiosPromise[SchemaGoogleCloudChannelV1Customer] = js.native
  def get(
    params: ParamsResourceAccountsChannelpartnerlinksCustomersGet,
    callback: BodyResponseCallback[SchemaGoogleCloudChannelV1Customer]
  ): Unit = js.native
  def get(
    params: ParamsResourceAccountsChannelpartnerlinksCustomersGet,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudChannelV1Customer],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudChannelV1Customer]
  ): Unit = js.native
  def get(params: ParamsResourceAccountsChannelpartnerlinksCustomersGet, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudChannelV1Customer] = js.native
  def get(
    params: ParamsResourceAccountsChannelpartnerlinksCustomersGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudChannelV1Customer]
  ): Unit = js.native
  /**
    * Returns the requested Customer resource. Possible error codes: * PERMISSION_DENIED: The reseller account making the request is different from the reseller account in the API request. * INVALID_ARGUMENT: Required request parameters are missing or invalid. * NOT_FOUND: The customer resource doesn't exist. Usually the result of an invalid name parameter. Return value: The Customer resource.
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
    *   const res = await cloudchannel.accounts.channelPartnerLinks.customers.get({
    *     // Required. The resource name of the customer to retrieve. Name uses the format: accounts/{account_id\}/customers/{customer_id\}
    *     name: 'accounts/my-account/channelPartnerLinks/my-channelPartnerLink/customers/my-customer',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "alternateEmail": "my_alternateEmail",
    *   //   "channelPartnerId": "my_channelPartnerId",
    *   //   "cloudIdentityId": "my_cloudIdentityId",
    *   //   "cloudIdentityInfo": {},
    *   //   "createTime": "my_createTime",
    *   //   "domain": "my_domain",
    *   //   "languageCode": "my_languageCode",
    *   //   "name": "my_name",
    *   //   "orgDisplayName": "my_orgDisplayName",
    *   //   "orgPostalAddress": {},
    *   //   "primaryContactInfo": {},
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
  def get(params: ParamsResourceAccountsChannelpartnerlinksCustomersGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceAccountsChannelpartnerlinksCustomersGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def `import`(): GaxiosPromise[SchemaGoogleCloudChannelV1Customer] = js.native
  def `import`(callback: BodyResponseCallback[SchemaGoogleCloudChannelV1Customer]): Unit = js.native
  def `import`(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudChannelV1Customer] = js.native
  def `import`(params: ParamsResourceAccountsChannelpartnerlinksCustomersImport): GaxiosPromise[SchemaGoogleCloudChannelV1Customer] = js.native
  def `import`(
    params: ParamsResourceAccountsChannelpartnerlinksCustomersImport,
    callback: BodyResponseCallback[SchemaGoogleCloudChannelV1Customer]
  ): Unit = js.native
  def `import`(
    params: ParamsResourceAccountsChannelpartnerlinksCustomersImport,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudChannelV1Customer],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudChannelV1Customer]
  ): Unit = js.native
  def `import`(params: ParamsResourceAccountsChannelpartnerlinksCustomersImport, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudChannelV1Customer] = js.native
  def `import`(
    params: ParamsResourceAccountsChannelpartnerlinksCustomersImport,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudChannelV1Customer]
  ): Unit = js.native
  /**
    * Imports a Customer from the Cloud Identity associated with the provided Cloud Identity ID or domain before a TransferEntitlements call. If a linked Customer already exists and overwrite_if_exists is true, it will update that Customer's data. Possible error codes: * PERMISSION_DENIED: The reseller account making the request is different from the reseller account in the API request. * NOT_FOUND: Cloud Identity doesn't exist or was deleted. * INVALID_ARGUMENT: Required parameters are missing, or the auth_token is expired or invalid. * ALREADY_EXISTS: A customer already exists and has conflicting critical fields. Requires an overwrite. Return value: The Customer.
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
    *   const res = await cloudchannel.accounts.channelPartnerLinks.customers.import({
    *     // Required. The resource name of the reseller's account. Parent takes the format: accounts/{account_id\} or accounts/{account_id\}/channelPartnerLinks/{channel_partner_id\}
    *     parent: 'accounts/my-account/channelPartnerLinks/my-channelPartnerLink',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "authToken": "my_authToken",
    *       //   "channelPartnerId": "my_channelPartnerId",
    *       //   "cloudIdentityId": "my_cloudIdentityId",
    *       //   "customer": "my_customer",
    *       //   "domain": "my_domain",
    *       //   "overwriteIfExists": false
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "alternateEmail": "my_alternateEmail",
    *   //   "channelPartnerId": "my_channelPartnerId",
    *   //   "cloudIdentityId": "my_cloudIdentityId",
    *   //   "cloudIdentityInfo": {},
    *   //   "createTime": "my_createTime",
    *   //   "domain": "my_domain",
    *   //   "languageCode": "my_languageCode",
    *   //   "name": "my_name",
    *   //   "orgDisplayName": "my_orgDisplayName",
    *   //   "orgPostalAddress": {},
    *   //   "primaryContactInfo": {},
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
  def `import`(params: ParamsResourceAccountsChannelpartnerlinksCustomersImport, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def `import`(
    params: ParamsResourceAccountsChannelpartnerlinksCustomersImport,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGoogleCloudChannelV1ListCustomersResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudChannelV1ListCustomersResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudChannelV1ListCustomersResponse] = js.native
  def list(params: ParamsResourceAccountsChannelpartnerlinksCustomersList): GaxiosPromise[SchemaGoogleCloudChannelV1ListCustomersResponse] = js.native
  def list(
    params: ParamsResourceAccountsChannelpartnerlinksCustomersList,
    callback: BodyResponseCallback[SchemaGoogleCloudChannelV1ListCustomersResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAccountsChannelpartnerlinksCustomersList,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudChannelV1ListCustomersResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudChannelV1ListCustomersResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAccountsChannelpartnerlinksCustomersList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudChannelV1ListCustomersResponse] = js.native
  def list(
    params: ParamsResourceAccountsChannelpartnerlinksCustomersList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudChannelV1ListCustomersResponse]
  ): Unit = js.native
  /**
    * List Customers. Possible error codes: * PERMISSION_DENIED: The reseller account making the request is different from the reseller account in the API request. * INVALID_ARGUMENT: Required request parameters are missing or invalid. Return value: List of Customers, or an empty list if there are no customers.
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
    *   const res = await cloudchannel.accounts.channelPartnerLinks.customers.list({
    *     // Optional. Filters applied to the [CloudChannelService.ListCustomers] results. See https://cloud.google.com/channel/docs/concepts/google-cloud/filter-customers for more information.
    *     filter: 'placeholder-value',
    *     // Optional. The maximum number of customers to return. The service may return fewer than this value. If unspecified, returns at most 10 customers. The maximum value is 50.
    *     pageSize: 'placeholder-value',
    *     // Optional. A token identifying a page of results other than the first page. Obtained through ListCustomersResponse.next_page_token of the previous CloudChannelService.ListCustomers call.
    *     pageToken: 'placeholder-value',
    *     // Required. The resource name of the reseller account to list customers from. Parent uses the format: accounts/{account_id\}.
    *     parent: 'accounts/my-account/channelPartnerLinks/my-channelPartnerLink',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "customers": [],
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
  def list(params: ParamsResourceAccountsChannelpartnerlinksCustomersList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceAccountsChannelpartnerlinksCustomersList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaGoogleCloudChannelV1Customer] = js.native
  def patch(callback: BodyResponseCallback[SchemaGoogleCloudChannelV1Customer]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudChannelV1Customer] = js.native
  def patch(params: ParamsResourceAccountsChannelpartnerlinksCustomersPatch): GaxiosPromise[SchemaGoogleCloudChannelV1Customer] = js.native
  def patch(
    params: ParamsResourceAccountsChannelpartnerlinksCustomersPatch,
    callback: BodyResponseCallback[SchemaGoogleCloudChannelV1Customer]
  ): Unit = js.native
  def patch(
    params: ParamsResourceAccountsChannelpartnerlinksCustomersPatch,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudChannelV1Customer],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudChannelV1Customer]
  ): Unit = js.native
  def patch(params: ParamsResourceAccountsChannelpartnerlinksCustomersPatch, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudChannelV1Customer] = js.native
  def patch(
    params: ParamsResourceAccountsChannelpartnerlinksCustomersPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudChannelV1Customer]
  ): Unit = js.native
  /**
    * Updates an existing Customer resource for the reseller or distributor. Possible error codes: * PERMISSION_DENIED: The reseller account making the request is different from the reseller account in the API request. * INVALID_ARGUMENT: Required request parameters are missing or invalid. * NOT_FOUND: No Customer resource found for the name in the request. Return value: The updated Customer resource.
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
    *   const res = await cloudchannel.accounts.channelPartnerLinks.customers.patch({
    *     // Output only. Resource name of the customer. Format: accounts/{account_id\}/customers/{customer_id\}
    *     name: 'accounts/my-account/channelPartnerLinks/my-channelPartnerLink/customers/my-customer',
    *     // The update mask that applies to the resource. Optional.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "alternateEmail": "my_alternateEmail",
    *       //   "channelPartnerId": "my_channelPartnerId",
    *       //   "cloudIdentityId": "my_cloudIdentityId",
    *       //   "cloudIdentityInfo": {},
    *       //   "createTime": "my_createTime",
    *       //   "domain": "my_domain",
    *       //   "languageCode": "my_languageCode",
    *       //   "name": "my_name",
    *       //   "orgDisplayName": "my_orgDisplayName",
    *       //   "orgPostalAddress": {},
    *       //   "primaryContactInfo": {},
    *       //   "updateTime": "my_updateTime"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "alternateEmail": "my_alternateEmail",
    *   //   "channelPartnerId": "my_channelPartnerId",
    *   //   "cloudIdentityId": "my_cloudIdentityId",
    *   //   "cloudIdentityInfo": {},
    *   //   "createTime": "my_createTime",
    *   //   "domain": "my_domain",
    *   //   "languageCode": "my_languageCode",
    *   //   "name": "my_name",
    *   //   "orgDisplayName": "my_orgDisplayName",
    *   //   "orgPostalAddress": {},
    *   //   "primaryContactInfo": {},
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
  def patch(params: ParamsResourceAccountsChannelpartnerlinksCustomersPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceAccountsChannelpartnerlinksCustomersPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
