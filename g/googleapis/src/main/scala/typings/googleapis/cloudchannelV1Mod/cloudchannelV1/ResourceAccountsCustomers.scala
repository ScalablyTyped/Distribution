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

@JSImport("googleapis/build/src/apis/cloudchannel/v1", "cloudchannel_v1.Resource$Accounts$Customers")
@js.native
open class ResourceAccountsCustomers protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaGoogleCloudChannelV1Customer] = js.native
  def create(callback: BodyResponseCallback[SchemaGoogleCloudChannelV1Customer]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudChannelV1Customer] = js.native
  def create(params: ParamsResourceAccountsCustomersCreate): GaxiosPromise[SchemaGoogleCloudChannelV1Customer] = js.native
  def create(
    params: ParamsResourceAccountsCustomersCreate,
    callback: BodyResponseCallback[SchemaGoogleCloudChannelV1Customer]
  ): Unit = js.native
  def create(
    params: ParamsResourceAccountsCustomersCreate,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudChannelV1Customer],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudChannelV1Customer]
  ): Unit = js.native
  def create(params: ParamsResourceAccountsCustomersCreate, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudChannelV1Customer] = js.native
  def create(
    params: ParamsResourceAccountsCustomersCreate,
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
    *   const res = await cloudchannel.accounts.customers.create({
    *     // Required. The resource name of reseller account in which to create the customer. Parent uses the format: accounts/{account_id\}
    *     parent: 'accounts/my-account',
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
  def create(params: ParamsResourceAccountsCustomersCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceAccountsCustomersCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var customerRepricingConfigs: ResourceAccountsCustomersCustomerrepricingconfigs = js.native
  
  def delete(): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(params: ParamsResourceAccountsCustomersDelete): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceAccountsCustomersDelete,
    callback: BodyResponseCallback[SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceAccountsCustomersDelete,
    options: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty],
    callback: BodyResponseCallback[Readable | SchemaGoogleProtobufEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceAccountsCustomersDelete, options: MethodOptions): GaxiosPromise[SchemaGoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsResourceAccountsCustomersDelete,
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
    *   const res = await cloudchannel.accounts.customers.delete({
    *     // Required. The resource name of the customer to delete.
    *     name: 'accounts/my-account/customers/my-customer',
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
  def delete(params: ParamsResourceAccountsCustomersDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceAccountsCustomersDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var entitlements: ResourceAccountsCustomersEntitlements = js.native
  
  def get(): GaxiosPromise[SchemaGoogleCloudChannelV1Customer] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleCloudChannelV1Customer]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudChannelV1Customer] = js.native
  def get(params: ParamsResourceAccountsCustomersGet): GaxiosPromise[SchemaGoogleCloudChannelV1Customer] = js.native
  def get(
    params: ParamsResourceAccountsCustomersGet,
    callback: BodyResponseCallback[SchemaGoogleCloudChannelV1Customer]
  ): Unit = js.native
  def get(
    params: ParamsResourceAccountsCustomersGet,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudChannelV1Customer],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudChannelV1Customer]
  ): Unit = js.native
  def get(params: ParamsResourceAccountsCustomersGet, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudChannelV1Customer] = js.native
  def get(
    params: ParamsResourceAccountsCustomersGet,
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
    *   const res = await cloudchannel.accounts.customers.get({
    *     // Required. The resource name of the customer to retrieve. Name uses the format: accounts/{account_id\}/customers/{customer_id\}
    *     name: 'accounts/my-account/customers/my-customer',
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
  def get(params: ParamsResourceAccountsCustomersGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceAccountsCustomersGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def `import`(): GaxiosPromise[SchemaGoogleCloudChannelV1Customer] = js.native
  def `import`(callback: BodyResponseCallback[SchemaGoogleCloudChannelV1Customer]): Unit = js.native
  def `import`(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudChannelV1Customer] = js.native
  def `import`(params: ParamsResourceAccountsCustomersImport): GaxiosPromise[SchemaGoogleCloudChannelV1Customer] = js.native
  def `import`(
    params: ParamsResourceAccountsCustomersImport,
    callback: BodyResponseCallback[SchemaGoogleCloudChannelV1Customer]
  ): Unit = js.native
  def `import`(
    params: ParamsResourceAccountsCustomersImport,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudChannelV1Customer],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudChannelV1Customer]
  ): Unit = js.native
  def `import`(params: ParamsResourceAccountsCustomersImport, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudChannelV1Customer] = js.native
  def `import`(
    params: ParamsResourceAccountsCustomersImport,
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
    *   const res = await cloudchannel.accounts.customers.import({
    *     // Required. The resource name of the reseller's account. Parent takes the format: accounts/{account_id\} or accounts/{account_id\}/channelPartnerLinks/{channel_partner_id\}
    *     parent: 'accounts/my-account',
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
  def `import`(params: ParamsResourceAccountsCustomersImport, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def `import`(
    params: ParamsResourceAccountsCustomersImport,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGoogleCloudChannelV1ListCustomersResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudChannelV1ListCustomersResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudChannelV1ListCustomersResponse] = js.native
  def list(params: ParamsResourceAccountsCustomersList): GaxiosPromise[SchemaGoogleCloudChannelV1ListCustomersResponse] = js.native
  def list(
    params: ParamsResourceAccountsCustomersList,
    callback: BodyResponseCallback[SchemaGoogleCloudChannelV1ListCustomersResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAccountsCustomersList,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudChannelV1ListCustomersResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudChannelV1ListCustomersResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAccountsCustomersList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudChannelV1ListCustomersResponse] = js.native
  def list(
    params: ParamsResourceAccountsCustomersList,
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
    *   const res = await cloudchannel.accounts.customers.list({
    *     // Optional. Filters applied to the [CloudChannelService.ListCustomers] results. See https://cloud.google.com/channel/docs/concepts/google-cloud/filter-customers for more information.
    *     filter: 'placeholder-value',
    *     // Optional. The maximum number of customers to return. The service may return fewer than this value. If unspecified, returns at most 10 customers. The maximum value is 50.
    *     pageSize: 'placeholder-value',
    *     // Optional. A token identifying a page of results other than the first page. Obtained through ListCustomersResponse.next_page_token of the previous CloudChannelService.ListCustomers call.
    *     pageToken: 'placeholder-value',
    *     // Required. The resource name of the reseller account to list customers from. Parent uses the format: accounts/{account_id\}.
    *     parent: 'accounts/my-account',
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
  def list(params: ParamsResourceAccountsCustomersList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceAccountsCustomersList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def listPurchasableOffers(): GaxiosPromise[SchemaGoogleCloudChannelV1ListPurchasableOffersResponse] = js.native
  def listPurchasableOffers(callback: BodyResponseCallback[SchemaGoogleCloudChannelV1ListPurchasableOffersResponse]): Unit = js.native
  def listPurchasableOffers(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudChannelV1ListPurchasableOffersResponse] = js.native
  def listPurchasableOffers(params: ParamsResourceAccountsCustomersListpurchasableoffers): GaxiosPromise[SchemaGoogleCloudChannelV1ListPurchasableOffersResponse] = js.native
  def listPurchasableOffers(
    params: ParamsResourceAccountsCustomersListpurchasableoffers,
    callback: BodyResponseCallback[SchemaGoogleCloudChannelV1ListPurchasableOffersResponse]
  ): Unit = js.native
  def listPurchasableOffers(
    params: ParamsResourceAccountsCustomersListpurchasableoffers,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudChannelV1ListPurchasableOffersResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudChannelV1ListPurchasableOffersResponse]
  ): Unit = js.native
  def listPurchasableOffers(params: ParamsResourceAccountsCustomersListpurchasableoffers, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudChannelV1ListPurchasableOffersResponse] = js.native
  def listPurchasableOffers(
    params: ParamsResourceAccountsCustomersListpurchasableoffers,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudChannelV1ListPurchasableOffersResponse]
  ): Unit = js.native
  /**
    * Lists the following: * Offers that you can purchase for a customer. * Offers that you can change for an entitlement. Possible error codes: * PERMISSION_DENIED: The customer doesn't belong to the reseller * INVALID_ARGUMENT: Required request parameters are missing or invalid.
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
    *   const res = await cloudchannel.accounts.customers.listPurchasableOffers({
    *     // Required. Resource name of the entitlement. Format: accounts/{account_id\}/customers/{customer_id\}/entitlements/{entitlement_id\}
    *     'changeOfferPurchase.entitlement': 'placeholder-value',
    *     // Optional. Resource name of the new target SKU. Provide this SKU when upgrading or downgrading an entitlement. Format: products/{product_id\}/skus/{sku_id\}
    *     'changeOfferPurchase.newSku': 'placeholder-value',
    *     // Required. SKU that the result should be restricted to. Format: products/{product_id\}/skus/{sku_id\}.
    *     'createEntitlementPurchase.sku': 'placeholder-value',
    *     // Required. The resource name of the customer to list Offers for. Format: accounts/{account_id\}/customers/{customer_id\}.
    *     customer: 'accounts/my-account/customers/my-customer',
    *     // Optional. The BCP-47 language code. For example, "en-US". The response will localize in the corresponding language code, if specified. The default value is "en-US".
    *     languageCode: 'placeholder-value',
    *     // Optional. Requested page size. Server might return fewer results than requested. If unspecified, returns at most 100 Offers. The maximum value is 1000; the server will coerce values above 1000.
    *     pageSize: 'placeholder-value',
    *     // Optional. A token for a page of results other than the first page.
    *     pageToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "purchasableOffers": []
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
  def listPurchasableOffers(params: ParamsResourceAccountsCustomersListpurchasableoffers, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def listPurchasableOffers(
    params: ParamsResourceAccountsCustomersListpurchasableoffers,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def listPurchasableSkus(): GaxiosPromise[SchemaGoogleCloudChannelV1ListPurchasableSkusResponse] = js.native
  def listPurchasableSkus(callback: BodyResponseCallback[SchemaGoogleCloudChannelV1ListPurchasableSkusResponse]): Unit = js.native
  def listPurchasableSkus(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudChannelV1ListPurchasableSkusResponse] = js.native
  def listPurchasableSkus(params: ParamsResourceAccountsCustomersListpurchasableskus): GaxiosPromise[SchemaGoogleCloudChannelV1ListPurchasableSkusResponse] = js.native
  def listPurchasableSkus(
    params: ParamsResourceAccountsCustomersListpurchasableskus,
    callback: BodyResponseCallback[SchemaGoogleCloudChannelV1ListPurchasableSkusResponse]
  ): Unit = js.native
  def listPurchasableSkus(
    params: ParamsResourceAccountsCustomersListpurchasableskus,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudChannelV1ListPurchasableSkusResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudChannelV1ListPurchasableSkusResponse]
  ): Unit = js.native
  def listPurchasableSkus(params: ParamsResourceAccountsCustomersListpurchasableskus, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudChannelV1ListPurchasableSkusResponse] = js.native
  def listPurchasableSkus(
    params: ParamsResourceAccountsCustomersListpurchasableskus,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudChannelV1ListPurchasableSkusResponse]
  ): Unit = js.native
  /**
    * Lists the following: * SKUs that you can purchase for a customer * SKUs that you can upgrade or downgrade for an entitlement. Possible error codes: * PERMISSION_DENIED: The customer doesn't belong to the reseller. * INVALID_ARGUMENT: Required request parameters are missing or invalid.
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
    *   const res = await cloudchannel.accounts.customers.listPurchasableSkus({
    *     // Required. Change Type for the entitlement.
    *     'changeOfferPurchase.changeType': 'placeholder-value',
    *     // Required. Resource name of the entitlement. Format: accounts/{account_id\}/customers/{customer_id\}/entitlements/{entitlement_id\}
    *     'changeOfferPurchase.entitlement': 'placeholder-value',
    *     // Required. List SKUs belonging to this Product. Format: products/{product_id\}. Supports products/- to retrieve SKUs for all products.
    *     'createEntitlementPurchase.product': 'placeholder-value',
    *     // Required. The resource name of the customer to list SKUs for. Format: accounts/{account_id\}/customers/{customer_id\}.
    *     customer: 'accounts/my-account/customers/my-customer',
    *     // Optional. The BCP-47 language code. For example, "en-US". The response will localize in the corresponding language code, if specified. The default value is "en-US".
    *     languageCode: 'placeholder-value',
    *     // Optional. Requested page size. Server might return fewer results than requested. If unspecified, returns at most 100 SKUs. The maximum value is 1000; the server will coerce values above 1000.
    *     pageSize: 'placeholder-value',
    *     // Optional. A token for a page of results other than the first page.
    *     pageToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "purchasableSkus": []
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
  def listPurchasableSkus(params: ParamsResourceAccountsCustomersListpurchasableskus, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def listPurchasableSkus(
    params: ParamsResourceAccountsCustomersListpurchasableskus,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaGoogleCloudChannelV1Customer] = js.native
  def patch(callback: BodyResponseCallback[SchemaGoogleCloudChannelV1Customer]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudChannelV1Customer] = js.native
  def patch(params: ParamsResourceAccountsCustomersPatch): GaxiosPromise[SchemaGoogleCloudChannelV1Customer] = js.native
  def patch(
    params: ParamsResourceAccountsCustomersPatch,
    callback: BodyResponseCallback[SchemaGoogleCloudChannelV1Customer]
  ): Unit = js.native
  def patch(
    params: ParamsResourceAccountsCustomersPatch,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudChannelV1Customer],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudChannelV1Customer]
  ): Unit = js.native
  def patch(params: ParamsResourceAccountsCustomersPatch, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudChannelV1Customer] = js.native
  def patch(
    params: ParamsResourceAccountsCustomersPatch,
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
    *   const res = await cloudchannel.accounts.customers.patch({
    *     // Output only. Resource name of the customer. Format: accounts/{account_id\}/customers/{customer_id\}
    *     name: 'accounts/my-account/customers/my-customer',
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
  def patch(params: ParamsResourceAccountsCustomersPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceAccountsCustomersPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def provisionCloudIdentity(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def provisionCloudIdentity(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def provisionCloudIdentity(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def provisionCloudIdentity(params: ParamsResourceAccountsCustomersProvisioncloudidentity): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def provisionCloudIdentity(
    params: ParamsResourceAccountsCustomersProvisioncloudidentity,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def provisionCloudIdentity(
    params: ParamsResourceAccountsCustomersProvisioncloudidentity,
    options: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def provisionCloudIdentity(params: ParamsResourceAccountsCustomersProvisioncloudidentity, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def provisionCloudIdentity(
    params: ParamsResourceAccountsCustomersProvisioncloudidentity,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * Creates a Cloud Identity for the given customer using the customer's information, or the information provided here. Possible error codes: * PERMISSION_DENIED: The customer doesn't belong to the reseller. * INVALID_ARGUMENT: Required request parameters are missing or invalid. * NOT_FOUND: The customer was not found. * ALREADY_EXISTS: The customer's primary email already exists. Retry after changing the customer's primary contact email. * INTERNAL: Any non-user error related to a technical issue in the backend. Contact Cloud Channel support. * UNKNOWN: Any non-user error related to a technical issue in the backend. Contact Cloud Channel support. Return value: The ID of a long-running operation. To get the results of the operation, call the GetOperation method of CloudChannelOperationsService. The Operation metadata contains an instance of OperationMetadata.
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
    *   const res = await cloudchannel.accounts.customers.provisionCloudIdentity({
    *     // Required. Resource name of the customer. Format: accounts/{account_id\}/customers/{customer_id\}
    *     customer: 'accounts/my-account/customers/my-customer',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "cloudIdentityInfo": {},
    *       //   "user": {},
    *       //   "validateOnly": false
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "done": false,
    *   //   "error": {},
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "response": {}
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
  def provisionCloudIdentity(params: ParamsResourceAccountsCustomersProvisioncloudidentity, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def provisionCloudIdentity(
    params: ParamsResourceAccountsCustomersProvisioncloudidentity,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def transferEntitlements(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def transferEntitlements(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def transferEntitlements(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def transferEntitlements(params: ParamsResourceAccountsCustomersTransferentitlements): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def transferEntitlements(
    params: ParamsResourceAccountsCustomersTransferentitlements,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def transferEntitlements(
    params: ParamsResourceAccountsCustomersTransferentitlements,
    options: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def transferEntitlements(params: ParamsResourceAccountsCustomersTransferentitlements, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def transferEntitlements(
    params: ParamsResourceAccountsCustomersTransferentitlements,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * Transfers customer entitlements to new reseller. Possible error codes: * PERMISSION_DENIED: The customer doesn't belong to the reseller. * INVALID_ARGUMENT: Required request parameters are missing or invalid. * NOT_FOUND: The customer or offer resource was not found. * ALREADY_EXISTS: The SKU was already transferred for the customer. * CONDITION_NOT_MET or FAILED_PRECONDITION: * The SKU requires domain verification to transfer, but the domain is not verified. * An Add-On SKU (example, Vault or Drive) is missing the pre-requisite SKU (example, G Suite Basic). * (Developer accounts only) Reseller and resold domain must meet the following naming requirements: * Domain names must start with goog-test. * Domain names must include the reseller domain. * Specify all transferring entitlements. * INTERNAL: Any non-user error related to a technical issue in the backend. Contact Cloud Channel support. * UNKNOWN: Any non-user error related to a technical issue in the backend. Contact Cloud Channel support. Return value: The ID of a long-running operation. To get the results of the operation, call the GetOperation method of CloudChannelOperationsService. The Operation metadata will contain an instance of OperationMetadata.
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
    *   const res = await cloudchannel.accounts.customers.transferEntitlements({
    *     // Required. The resource name of the reseller's customer account that will receive transferred entitlements. Parent uses the format: accounts/{account_id\}/customers/{customer_id\}
    *     parent: 'accounts/my-account/customers/my-customer',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "authToken": "my_authToken",
    *       //   "entitlements": [],
    *       //   "requestId": "my_requestId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "done": false,
    *   //   "error": {},
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "response": {}
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
  def transferEntitlements(params: ParamsResourceAccountsCustomersTransferentitlements, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def transferEntitlements(
    params: ParamsResourceAccountsCustomersTransferentitlements,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def transferEntitlementsToGoogle(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def transferEntitlementsToGoogle(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def transferEntitlementsToGoogle(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def transferEntitlementsToGoogle(params: ParamsResourceAccountsCustomersTransferentitlementstogoogle): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def transferEntitlementsToGoogle(
    params: ParamsResourceAccountsCustomersTransferentitlementstogoogle,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def transferEntitlementsToGoogle(
    params: ParamsResourceAccountsCustomersTransferentitlementstogoogle,
    options: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def transferEntitlementsToGoogle(params: ParamsResourceAccountsCustomersTransferentitlementstogoogle, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def transferEntitlementsToGoogle(
    params: ParamsResourceAccountsCustomersTransferentitlementstogoogle,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * Transfers customer entitlements from their current reseller to Google. Possible error codes: * PERMISSION_DENIED: The customer doesn't belong to the reseller. * INVALID_ARGUMENT: Required request parameters are missing or invalid. * NOT_FOUND: The customer or offer resource was not found. * ALREADY_EXISTS: The SKU was already transferred for the customer. * CONDITION_NOT_MET or FAILED_PRECONDITION: * The SKU requires domain verification to transfer, but the domain is not verified. * An Add-On SKU (example, Vault or Drive) is missing the pre-requisite SKU (example, G Suite Basic). * (Developer accounts only) Reseller and resold domain must meet the following naming requirements: * Domain names must start with goog-test. * Domain names must include the reseller domain. * INTERNAL: Any non-user error related to a technical issue in the backend. Contact Cloud Channel support. * UNKNOWN: Any non-user error related to a technical issue in the backend. Contact Cloud Channel support. Return value: The ID of a long-running operation. To get the results of the operation, call the GetOperation method of CloudChannelOperationsService. The response will contain google.protobuf.Empty on success. The Operation metadata will contain an instance of OperationMetadata.
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
    *     await cloudchannel.accounts.customers.transferEntitlementsToGoogle({
    *       // Required. The resource name of the reseller's customer account where the entitlements transfer from. Parent uses the format: accounts/{account_id\}/customers/{customer_id\}
    *       parent: 'accounts/my-account/customers/my-customer',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "entitlements": [],
    *         //   "requestId": "my_requestId"
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "done": false,
    *   //   "error": {},
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "response": {}
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
  def transferEntitlementsToGoogle(params: ParamsResourceAccountsCustomersTransferentitlementstogoogle, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def transferEntitlementsToGoogle(
    params: ParamsResourceAccountsCustomersTransferentitlementstogoogle,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
