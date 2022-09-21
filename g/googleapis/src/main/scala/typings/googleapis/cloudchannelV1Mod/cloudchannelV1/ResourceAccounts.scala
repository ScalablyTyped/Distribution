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

@JSImport("googleapis/build/src/apis/cloudchannel/v1", "cloudchannel_v1.Resource$Accounts")
@js.native
open class ResourceAccounts protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var channelPartnerLinks: ResourceAccountsChannelpartnerlinks = js.native
  
  def checkCloudIdentityAccountsExist(): GaxiosPromise[SchemaGoogleCloudChannelV1CheckCloudIdentityAccountsExistResponse] = js.native
  def checkCloudIdentityAccountsExist(callback: BodyResponseCallback[SchemaGoogleCloudChannelV1CheckCloudIdentityAccountsExistResponse]): Unit = js.native
  def checkCloudIdentityAccountsExist(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudChannelV1CheckCloudIdentityAccountsExistResponse] = js.native
  def checkCloudIdentityAccountsExist(params: ParamsResourceAccountsCheckcloudidentityaccountsexist): GaxiosPromise[SchemaGoogleCloudChannelV1CheckCloudIdentityAccountsExistResponse] = js.native
  def checkCloudIdentityAccountsExist(
    params: ParamsResourceAccountsCheckcloudidentityaccountsexist,
    callback: BodyResponseCallback[SchemaGoogleCloudChannelV1CheckCloudIdentityAccountsExistResponse]
  ): Unit = js.native
  def checkCloudIdentityAccountsExist(
    params: ParamsResourceAccountsCheckcloudidentityaccountsexist,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudChannelV1CheckCloudIdentityAccountsExistResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudChannelV1CheckCloudIdentityAccountsExistResponse]
  ): Unit = js.native
  def checkCloudIdentityAccountsExist(params: ParamsResourceAccountsCheckcloudidentityaccountsexist, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudChannelV1CheckCloudIdentityAccountsExistResponse] = js.native
  def checkCloudIdentityAccountsExist(
    params: ParamsResourceAccountsCheckcloudidentityaccountsexist,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudChannelV1CheckCloudIdentityAccountsExistResponse]
  ): Unit = js.native
  /**
    * Confirms the existence of Cloud Identity accounts based on the domain and if the Cloud Identity accounts are owned by the reseller. Possible error codes: * PERMISSION_DENIED: The reseller account making the request is different from the reseller account in the API request. * INVALID_ARGUMENT: Required request parameters are missing or invalid. * INVALID_VALUE: Invalid domain value in the request. Return value: A list of CloudIdentityCustomerAccount resources for the domain (may be empty) Note: in the v1alpha1 version of the API, a NOT_FOUND error returns if no CloudIdentityCustomerAccount resources match the domain.
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
    *   const res = await cloudchannel.accounts.checkCloudIdentityAccountsExist({
    *     // Required. The reseller account's resource name. Parent uses the format: accounts/{account_id\}
    *     parent: 'accounts/my-account',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "domain": "my_domain"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "cloudIdentityAccounts": []
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
  def checkCloudIdentityAccountsExist(params: ParamsResourceAccountsCheckcloudidentityaccountsexist, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def checkCloudIdentityAccountsExist(
    params: ParamsResourceAccountsCheckcloudidentityaccountsexist,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  var customers: ResourceAccountsCustomers = js.native
  
  def listSubscribers(): GaxiosPromise[SchemaGoogleCloudChannelV1ListSubscribersResponse] = js.native
  def listSubscribers(callback: BodyResponseCallback[SchemaGoogleCloudChannelV1ListSubscribersResponse]): Unit = js.native
  def listSubscribers(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudChannelV1ListSubscribersResponse] = js.native
  def listSubscribers(params: ParamsResourceAccountsListsubscribers): GaxiosPromise[SchemaGoogleCloudChannelV1ListSubscribersResponse] = js.native
  def listSubscribers(
    params: ParamsResourceAccountsListsubscribers,
    callback: BodyResponseCallback[SchemaGoogleCloudChannelV1ListSubscribersResponse]
  ): Unit = js.native
  def listSubscribers(
    params: ParamsResourceAccountsListsubscribers,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudChannelV1ListSubscribersResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudChannelV1ListSubscribersResponse]
  ): Unit = js.native
  def listSubscribers(params: ParamsResourceAccountsListsubscribers, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudChannelV1ListSubscribersResponse] = js.native
  def listSubscribers(
    params: ParamsResourceAccountsListsubscribers,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudChannelV1ListSubscribersResponse]
  ): Unit = js.native
  /**
    * Lists service accounts with subscriber privileges on the Cloud Pub/Sub topic created for this Channel Services account. Possible error codes: * PERMISSION_DENIED: The reseller account making the request and the provided reseller account are different, or the impersonated user is not a super admin. * INVALID_ARGUMENT: Required request parameters are missing or invalid. * NOT_FOUND: The topic resource doesn't exist. * INTERNAL: Any non-user error related to a technical issue in the backend. Contact Cloud Channel support. * UNKNOWN: Any non-user error related to a technical issue in the backend. Contact Cloud Channel support. Return value: A list of service email addresses.
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
    *   const res = await cloudchannel.accounts.listSubscribers({
    *     // Required. Resource name of the account.
    *     account: 'accounts/my-account',
    *     // Optional. The maximum number of service accounts to return. The service may return fewer than this value. If unspecified, returns at most 100 service accounts. The maximum value is 1000; the server will coerce values above 1000.
    *     pageSize: 'placeholder-value',
    *     // Optional. A page token, received from a previous `ListSubscribers` call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to `ListSubscribers` must match the call that provided the page token.
    *     pageToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "serviceAccounts": [],
    *   //   "topic": "my_topic"
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
  def listSubscribers(params: ParamsResourceAccountsListsubscribers, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def listSubscribers(
    params: ParamsResourceAccountsListsubscribers,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def listTransferableOffers(): GaxiosPromise[SchemaGoogleCloudChannelV1ListTransferableOffersResponse] = js.native
  def listTransferableOffers(callback: BodyResponseCallback[SchemaGoogleCloudChannelV1ListTransferableOffersResponse]): Unit = js.native
  def listTransferableOffers(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudChannelV1ListTransferableOffersResponse] = js.native
  def listTransferableOffers(params: ParamsResourceAccountsListtransferableoffers): GaxiosPromise[SchemaGoogleCloudChannelV1ListTransferableOffersResponse] = js.native
  def listTransferableOffers(
    params: ParamsResourceAccountsListtransferableoffers,
    callback: BodyResponseCallback[SchemaGoogleCloudChannelV1ListTransferableOffersResponse]
  ): Unit = js.native
  def listTransferableOffers(
    params: ParamsResourceAccountsListtransferableoffers,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudChannelV1ListTransferableOffersResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudChannelV1ListTransferableOffersResponse]
  ): Unit = js.native
  def listTransferableOffers(params: ParamsResourceAccountsListtransferableoffers, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudChannelV1ListTransferableOffersResponse] = js.native
  def listTransferableOffers(
    params: ParamsResourceAccountsListtransferableoffers,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudChannelV1ListTransferableOffersResponse]
  ): Unit = js.native
  /**
    * List TransferableOffers of a customer based on Cloud Identity ID or Customer Name in the request. Use this method when a reseller gets the entitlement information of an unowned customer. The reseller should provide the customer's Cloud Identity ID or Customer Name. Possible error codes: * PERMISSION_DENIED: * The customer doesn't belong to the reseller and has no auth token. * The supplied auth token is invalid. * The reseller account making the request is different from the reseller account in the query. * INVALID_ARGUMENT: Required request parameters are missing or invalid. Return value: List of TransferableOffer for the given customer and SKU.
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
    *   const res = await cloudchannel.accounts.listTransferableOffers({
    *     // Required. The resource name of the reseller's account.
    *     parent: 'accounts/my-account',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "cloudIdentityId": "my_cloudIdentityId",
    *       //   "customerName": "my_customerName",
    *       //   "languageCode": "my_languageCode",
    *       //   "pageSize": 0,
    *       //   "pageToken": "my_pageToken",
    *       //   "sku": "my_sku"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "transferableOffers": []
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
  def listTransferableOffers(params: ParamsResourceAccountsListtransferableoffers, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def listTransferableOffers(
    params: ParamsResourceAccountsListtransferableoffers,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def listTransferableSkus(): GaxiosPromise[SchemaGoogleCloudChannelV1ListTransferableSkusResponse] = js.native
  def listTransferableSkus(callback: BodyResponseCallback[SchemaGoogleCloudChannelV1ListTransferableSkusResponse]): Unit = js.native
  def listTransferableSkus(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudChannelV1ListTransferableSkusResponse] = js.native
  def listTransferableSkus(params: ParamsResourceAccountsListtransferableskus): GaxiosPromise[SchemaGoogleCloudChannelV1ListTransferableSkusResponse] = js.native
  def listTransferableSkus(
    params: ParamsResourceAccountsListtransferableskus,
    callback: BodyResponseCallback[SchemaGoogleCloudChannelV1ListTransferableSkusResponse]
  ): Unit = js.native
  def listTransferableSkus(
    params: ParamsResourceAccountsListtransferableskus,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudChannelV1ListTransferableSkusResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudChannelV1ListTransferableSkusResponse]
  ): Unit = js.native
  def listTransferableSkus(params: ParamsResourceAccountsListtransferableskus, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudChannelV1ListTransferableSkusResponse] = js.native
  def listTransferableSkus(
    params: ParamsResourceAccountsListtransferableskus,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudChannelV1ListTransferableSkusResponse]
  ): Unit = js.native
  /**
    * List TransferableSkus of a customer based on the Cloud Identity ID or Customer Name in the request. Use this method to list the entitlements information of an unowned customer. You should provide the customer's Cloud Identity ID or Customer Name. Possible error codes: * PERMISSION_DENIED: * The customer doesn't belong to the reseller and has no auth token. * The supplied auth token is invalid. * The reseller account making the request is different from the reseller account in the query. * INVALID_ARGUMENT: Required request parameters are missing or invalid. Return value: A list of the customer's TransferableSku.
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
    *   const res = await cloudchannel.accounts.listTransferableSkus({
    *     // Required. The reseller account's resource name. Parent uses the format: accounts/{account_id\}
    *     parent: 'accounts/my-account',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "authToken": "my_authToken",
    *       //   "cloudIdentityId": "my_cloudIdentityId",
    *       //   "customerName": "my_customerName",
    *       //   "languageCode": "my_languageCode",
    *       //   "pageSize": 0,
    *       //   "pageToken": "my_pageToken"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "transferableSkus": []
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
  def listTransferableSkus(params: ParamsResourceAccountsListtransferableskus, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def listTransferableSkus(
    params: ParamsResourceAccountsListtransferableskus,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var offers: ResourceAccountsOffers = js.native
  
  def register(): GaxiosPromise[SchemaGoogleCloudChannelV1RegisterSubscriberResponse] = js.native
  def register(callback: BodyResponseCallback[SchemaGoogleCloudChannelV1RegisterSubscriberResponse]): Unit = js.native
  def register(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudChannelV1RegisterSubscriberResponse] = js.native
  def register(params: ParamsResourceAccountsRegister): GaxiosPromise[SchemaGoogleCloudChannelV1RegisterSubscriberResponse] = js.native
  def register(
    params: ParamsResourceAccountsRegister,
    callback: BodyResponseCallback[SchemaGoogleCloudChannelV1RegisterSubscriberResponse]
  ): Unit = js.native
  def register(
    params: ParamsResourceAccountsRegister,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudChannelV1RegisterSubscriberResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudChannelV1RegisterSubscriberResponse]
  ): Unit = js.native
  def register(params: ParamsResourceAccountsRegister, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudChannelV1RegisterSubscriberResponse] = js.native
  def register(
    params: ParamsResourceAccountsRegister,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudChannelV1RegisterSubscriberResponse]
  ): Unit = js.native
  /**
    * Registers a service account with subscriber privileges on the Cloud Pub/Sub topic for this Channel Services account. After you create a subscriber, you get the events through SubscriberEvent Possible error codes: * PERMISSION_DENIED: The reseller account making the request and the provided reseller account are different, or the impersonated user is not a super admin. * INVALID_ARGUMENT: Required request parameters are missing or invalid. * INTERNAL: Any non-user error related to a technical issue in the backend. Contact Cloud Channel support. * UNKNOWN: Any non-user error related to a technical issue in the backend. Contact Cloud Channel support. Return value: The topic name with the registered service email address.
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
    *   const res = await cloudchannel.accounts.register({
    *     // Required. Resource name of the account.
    *     account: 'accounts/my-account',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "serviceAccount": "my_serviceAccount"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "topic": "my_topic"
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
  def register(params: ParamsResourceAccountsRegister, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def register(
    params: ParamsResourceAccountsRegister,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def unregister(): GaxiosPromise[SchemaGoogleCloudChannelV1UnregisterSubscriberResponse] = js.native
  def unregister(callback: BodyResponseCallback[SchemaGoogleCloudChannelV1UnregisterSubscriberResponse]): Unit = js.native
  def unregister(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudChannelV1UnregisterSubscriberResponse] = js.native
  def unregister(params: ParamsResourceAccountsUnregister): GaxiosPromise[SchemaGoogleCloudChannelV1UnregisterSubscriberResponse] = js.native
  def unregister(
    params: ParamsResourceAccountsUnregister,
    callback: BodyResponseCallback[SchemaGoogleCloudChannelV1UnregisterSubscriberResponse]
  ): Unit = js.native
  def unregister(
    params: ParamsResourceAccountsUnregister,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudChannelV1UnregisterSubscriberResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudChannelV1UnregisterSubscriberResponse]
  ): Unit = js.native
  def unregister(params: ParamsResourceAccountsUnregister, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudChannelV1UnregisterSubscriberResponse] = js.native
  def unregister(
    params: ParamsResourceAccountsUnregister,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudChannelV1UnregisterSubscriberResponse]
  ): Unit = js.native
  /**
    * Unregisters a service account with subscriber privileges on the Cloud Pub/Sub topic created for this Channel Services account. If there are no service accounts left with subscriber privileges, this deletes the topic. You can call ListSubscribers to check for these accounts. Possible error codes: * PERMISSION_DENIED: The reseller account making the request and the provided reseller account are different, or the impersonated user is not a super admin. * INVALID_ARGUMENT: Required request parameters are missing or invalid. * NOT_FOUND: The topic resource doesn't exist. * INTERNAL: Any non-user error related to a technical issue in the backend. Contact Cloud Channel support. * UNKNOWN: Any non-user error related to a technical issue in the backend. Contact Cloud Channel support. Return value: The topic name that unregistered the service email address. Returns a success response if the service email address wasn't registered with the topic.
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
    *   const res = await cloudchannel.accounts.unregister({
    *     // Required. Resource name of the account.
    *     account: 'accounts/my-account',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "serviceAccount": "my_serviceAccount"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "topic": "my_topic"
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
  def unregister(params: ParamsResourceAccountsUnregister, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def unregister(
    params: ParamsResourceAccountsUnregister,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
