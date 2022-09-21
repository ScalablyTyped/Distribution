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

@JSImport("googleapis/build/src/apis/cloudchannel/v1", "cloudchannel_v1.Resource$Accounts$Customers$Entitlements")
@js.native
open class ResourceAccountsCustomersEntitlements protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def activate(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def activate(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def activate(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def activate(params: ParamsResourceAccountsCustomersEntitlementsActivate): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def activate(
    params: ParamsResourceAccountsCustomersEntitlementsActivate,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def activate(
    params: ParamsResourceAccountsCustomersEntitlementsActivate,
    options: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def activate(params: ParamsResourceAccountsCustomersEntitlementsActivate, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def activate(
    params: ParamsResourceAccountsCustomersEntitlementsActivate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * Activates a previously suspended entitlement. Entitlements suspended for pending ToS acceptance can't be activated using this method. An entitlement activation is a long-running operation and it updates the state of the customer entitlement. Possible error codes: * PERMISSION_DENIED: The reseller account making the request is different from the reseller account in the API request. * INVALID_ARGUMENT: Required request parameters are missing or invalid. * NOT_FOUND: Entitlement resource not found. * SUSPENSION_NOT_RESELLER_INITIATED: Can only activate reseller-initiated suspensions and entitlements that have accepted the TOS. * NOT_SUSPENDED: Can only activate suspended entitlements not in an ACTIVE state. * INTERNAL: Any non-user error related to a technical issue in the backend. Contact Cloud Channel support. * UNKNOWN: Any non-user error related to a technical issue in the backend. Contact Cloud Channel support. Return value: The ID of a long-running operation. To get the results of the operation, call the GetOperation method of CloudChannelOperationsService. The Operation metadata will contain an instance of OperationMetadata.
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
    *   const res = await cloudchannel.accounts.customers.entitlements.activate({
    *     // Required. The resource name of the entitlement to activate. Name uses the format: accounts/{account_id\}/customers/{customer_id\}/entitlements/{entitlement_id\}
    *     name: 'accounts/my-account/customers/my-customer/entitlements/my-entitlement',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
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
  def activate(params: ParamsResourceAccountsCustomersEntitlementsActivate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def activate(
    params: ParamsResourceAccountsCustomersEntitlementsActivate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def cancel(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def cancel(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def cancel(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def cancel(params: ParamsResourceAccountsCustomersEntitlementsCancel): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def cancel(
    params: ParamsResourceAccountsCustomersEntitlementsCancel,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def cancel(
    params: ParamsResourceAccountsCustomersEntitlementsCancel,
    options: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def cancel(params: ParamsResourceAccountsCustomersEntitlementsCancel, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def cancel(
    params: ParamsResourceAccountsCustomersEntitlementsCancel,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * Cancels a previously fulfilled entitlement. An entitlement cancellation is a long-running operation. Possible error codes: * PERMISSION_DENIED: The reseller account making the request is different from the reseller account in the API request. * FAILED_PRECONDITION: There are Google Cloud projects linked to the Google Cloud entitlement's Cloud Billing subaccount. * INVALID_ARGUMENT: Required request parameters are missing or invalid. * NOT_FOUND: Entitlement resource not found. * DELETION_TYPE_NOT_ALLOWED: Cancel is only allowed for Google Workspace add-ons, or entitlements for Google Cloud's development platform. * INTERNAL: Any non-user error related to a technical issue in the backend. Contact Cloud Channel support. * UNKNOWN: Any non-user error related to a technical issue in the backend. Contact Cloud Channel support. Return value: The ID of a long-running operation. To get the results of the operation, call the GetOperation method of CloudChannelOperationsService. The response will contain google.protobuf.Empty on success. The Operation metadata will contain an instance of OperationMetadata.
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
    *   const res = await cloudchannel.accounts.customers.entitlements.cancel({
    *     // Required. The resource name of the entitlement to cancel. Name uses the format: accounts/{account_id\}/customers/{customer_id\}/entitlements/{entitlement_id\}
    *     name: 'accounts/my-account/customers/my-customer/entitlements/my-entitlement',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
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
  def cancel(params: ParamsResourceAccountsCustomersEntitlementsCancel, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def cancel(
    params: ParamsResourceAccountsCustomersEntitlementsCancel,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def changeOffer(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def changeOffer(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def changeOffer(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def changeOffer(params: ParamsResourceAccountsCustomersEntitlementsChangeoffer): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def changeOffer(
    params: ParamsResourceAccountsCustomersEntitlementsChangeoffer,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def changeOffer(
    params: ParamsResourceAccountsCustomersEntitlementsChangeoffer,
    options: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def changeOffer(params: ParamsResourceAccountsCustomersEntitlementsChangeoffer, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def changeOffer(
    params: ParamsResourceAccountsCustomersEntitlementsChangeoffer,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * Updates the Offer for an existing customer entitlement. An entitlement update is a long-running operation and it updates the entitlement as a result of fulfillment. Possible error codes: * PERMISSION_DENIED: The customer doesn't belong to the reseller. * INVALID_ARGUMENT: Required request parameters are missing or invalid. * NOT_FOUND: Offer or Entitlement resource not found. * INTERNAL: Any non-user error related to a technical issue in the backend. Contact Cloud Channel support. * UNKNOWN: Any non-user error related to a technical issue in the backend. Contact Cloud Channel support. Return value: The ID of a long-running operation. To get the results of the operation, call the GetOperation method of CloudChannelOperationsService. The Operation metadata will contain an instance of OperationMetadata.
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
    *   const res = await cloudchannel.accounts.customers.entitlements.changeOffer({
    *     // Required. The resource name of the entitlement to update. Name uses the format: accounts/{account_id\}/customers/{customer_id\}/entitlements/{entitlement_id\}
    *     name: 'accounts/my-account/customers/my-customer/entitlements/my-entitlement',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "offer": "my_offer",
    *       //   "parameters": [],
    *       //   "purchaseOrderId": "my_purchaseOrderId",
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
  def changeOffer(params: ParamsResourceAccountsCustomersEntitlementsChangeoffer, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def changeOffer(
    params: ParamsResourceAccountsCustomersEntitlementsChangeoffer,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def changeParameters(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def changeParameters(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def changeParameters(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def changeParameters(params: ParamsResourceAccountsCustomersEntitlementsChangeparameters): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def changeParameters(
    params: ParamsResourceAccountsCustomersEntitlementsChangeparameters,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def changeParameters(
    params: ParamsResourceAccountsCustomersEntitlementsChangeparameters,
    options: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def changeParameters(params: ParamsResourceAccountsCustomersEntitlementsChangeparameters, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def changeParameters(
    params: ParamsResourceAccountsCustomersEntitlementsChangeparameters,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * Change parameters of the entitlement. An entitlement update is a long-running operation and it updates the entitlement as a result of fulfillment. Possible error codes: * PERMISSION_DENIED: The customer doesn't belong to the reseller. * INVALID_ARGUMENT: Required request parameters are missing or invalid. For example, the number of seats being changed is greater than the allowed number of max seats, or decreasing seats for a commitment based plan. * NOT_FOUND: Entitlement resource not found. * INTERNAL: Any non-user error related to a technical issue in the backend. Contact Cloud Channel support. * UNKNOWN: Any non-user error related to a technical issue in the backend. Contact Cloud Channel support. Return value: The ID of a long-running operation. To get the results of the operation, call the GetOperation method of CloudChannelOperationsService. The Operation metadata will contain an instance of OperationMetadata.
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
    *     await cloudchannel.accounts.customers.entitlements.changeParameters({
    *       // Required. The name of the entitlement to update. Name uses the format: accounts/{account_id\}/customers/{customer_id\}/entitlements/{entitlement_id\}
    *       name: 'accounts/my-account/customers/my-customer/entitlements/my-entitlement',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "parameters": [],
    *         //   "purchaseOrderId": "my_purchaseOrderId",
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
  def changeParameters(params: ParamsResourceAccountsCustomersEntitlementsChangeparameters, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def changeParameters(
    params: ParamsResourceAccountsCustomersEntitlementsChangeparameters,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def changeRenewalSettings(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def changeRenewalSettings(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def changeRenewalSettings(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def changeRenewalSettings(params: ParamsResourceAccountsCustomersEntitlementsChangerenewalsettings): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def changeRenewalSettings(
    params: ParamsResourceAccountsCustomersEntitlementsChangerenewalsettings,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def changeRenewalSettings(
    params: ParamsResourceAccountsCustomersEntitlementsChangerenewalsettings,
    options: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def changeRenewalSettings(params: ParamsResourceAccountsCustomersEntitlementsChangerenewalsettings, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def changeRenewalSettings(
    params: ParamsResourceAccountsCustomersEntitlementsChangerenewalsettings,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * Updates the renewal settings for an existing customer entitlement. An entitlement update is a long-running operation and it updates the entitlement as a result of fulfillment. Possible error codes: * PERMISSION_DENIED: The customer doesn't belong to the reseller. * INVALID_ARGUMENT: Required request parameters are missing or invalid. * NOT_FOUND: Entitlement resource not found. * NOT_COMMITMENT_PLAN: Renewal Settings are only applicable for a commitment plan. Can't enable or disable renewals for non-commitment plans. * INTERNAL: Any non-user error related to a technical issue in the backend. Contact Cloud Channel support. * UNKNOWN: Any non-user error related to a technical issue in the backend. Contact Cloud Channel support. Return value: The ID of a long-running operation. To get the results of the operation, call the GetOperation method of CloudChannelOperationsService. The Operation metadata will contain an instance of OperationMetadata.
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
    *     await cloudchannel.accounts.customers.entitlements.changeRenewalSettings({
    *       // Required. The name of the entitlement to update. Name uses the format: accounts/{account_id\}/customers/{customer_id\}/entitlements/{entitlement_id\}
    *       name: 'accounts/my-account/customers/my-customer/entitlements/my-entitlement',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "renewalSettings": {},
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
  def changeRenewalSettings(
    params: ParamsResourceAccountsCustomersEntitlementsChangerenewalsettings,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def changeRenewalSettings(
    params: ParamsResourceAccountsCustomersEntitlementsChangerenewalsettings,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def create(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def create(params: ParamsResourceAccountsCustomersEntitlementsCreate): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def create(
    params: ParamsResourceAccountsCustomersEntitlementsCreate,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def create(
    params: ParamsResourceAccountsCustomersEntitlementsCreate,
    options: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def create(params: ParamsResourceAccountsCustomersEntitlementsCreate, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def create(
    params: ParamsResourceAccountsCustomersEntitlementsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * Creates an entitlement for a customer. Possible error codes: * PERMISSION_DENIED: The customer doesn't belong to the reseller. * INVALID_ARGUMENT: * Required request parameters are missing or invalid. * There is already a customer entitlement for a SKU from the same product family. * INVALID_VALUE: Make sure the OfferId is valid. If it is, contact Google Channel support for further troubleshooting. * NOT_FOUND: The customer or offer resource was not found. * ALREADY_EXISTS: * The SKU was already purchased for the customer. * The customer's primary email already exists. Retry after changing the customer's primary contact email. * CONDITION_NOT_MET or FAILED_PRECONDITION: * The domain required for purchasing a SKU has not been verified. * A pre-requisite SKU required to purchase an Add-On SKU is missing. For example, Google Workspace Business Starter is required to purchase Vault or Drive. * (Developer accounts only) Reseller and resold domain must meet the following naming requirements: * Domain names must start with goog-test. * Domain names must include the reseller domain. * INTERNAL: Any non-user error related to a technical issue in the backend. Contact Cloud Channel support. * UNKNOWN: Any non-user error related to a technical issue in the backend. Contact Cloud Channel support. Return value: The ID of a long-running operation. To get the results of the operation, call the GetOperation method of CloudChannelOperationsService. The Operation metadata will contain an instance of OperationMetadata.
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
    *   const res = await cloudchannel.accounts.customers.entitlements.create({
    *     // Required. The resource name of the reseller's customer account in which to create the entitlement. Parent uses the format: accounts/{account_id\}/customers/{customer_id\}
    *     parent: 'accounts/my-account/customers/my-customer',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "entitlement": {},
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
  def create(params: ParamsResourceAccountsCustomersEntitlementsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceAccountsCustomersEntitlementsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaGoogleCloudChannelV1Entitlement] = js.native
  def get(callback: BodyResponseCallback[SchemaGoogleCloudChannelV1Entitlement]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudChannelV1Entitlement] = js.native
  def get(params: ParamsResourceAccountsCustomersEntitlementsGet): GaxiosPromise[SchemaGoogleCloudChannelV1Entitlement] = js.native
  def get(
    params: ParamsResourceAccountsCustomersEntitlementsGet,
    callback: BodyResponseCallback[SchemaGoogleCloudChannelV1Entitlement]
  ): Unit = js.native
  def get(
    params: ParamsResourceAccountsCustomersEntitlementsGet,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudChannelV1Entitlement],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudChannelV1Entitlement]
  ): Unit = js.native
  def get(params: ParamsResourceAccountsCustomersEntitlementsGet, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudChannelV1Entitlement] = js.native
  def get(
    params: ParamsResourceAccountsCustomersEntitlementsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudChannelV1Entitlement]
  ): Unit = js.native
  /**
    * Returns the requested Entitlement resource. Possible error codes: * PERMISSION_DENIED: The customer doesn't belong to the reseller. * INVALID_ARGUMENT: Required request parameters are missing or invalid. * NOT_FOUND: The customer entitlement was not found. Return value: The requested Entitlement resource.
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
    *   const res = await cloudchannel.accounts.customers.entitlements.get({
    *     // Required. The resource name of the entitlement to retrieve. Name uses the format: accounts/{account_id\}/customers/{customer_id\}/entitlements/{entitlement_id\}
    *     name: 'accounts/my-account/customers/my-customer/entitlements/my-entitlement',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "associationInfo": {},
    *   //   "commitmentSettings": {},
    *   //   "createTime": "my_createTime",
    *   //   "name": "my_name",
    *   //   "offer": "my_offer",
    *   //   "parameters": [],
    *   //   "provisionedService": {},
    *   //   "provisioningState": "my_provisioningState",
    *   //   "purchaseOrderId": "my_purchaseOrderId",
    *   //   "suspensionReasons": [],
    *   //   "trialSettings": {},
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
  def get(params: ParamsResourceAccountsCustomersEntitlementsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceAccountsCustomersEntitlementsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaGoogleCloudChannelV1ListEntitlementsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaGoogleCloudChannelV1ListEntitlementsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudChannelV1ListEntitlementsResponse] = js.native
  def list(params: ParamsResourceAccountsCustomersEntitlementsList): GaxiosPromise[SchemaGoogleCloudChannelV1ListEntitlementsResponse] = js.native
  def list(
    params: ParamsResourceAccountsCustomersEntitlementsList,
    callback: BodyResponseCallback[SchemaGoogleCloudChannelV1ListEntitlementsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAccountsCustomersEntitlementsList,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudChannelV1ListEntitlementsResponse],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudChannelV1ListEntitlementsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAccountsCustomersEntitlementsList, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudChannelV1ListEntitlementsResponse] = js.native
  def list(
    params: ParamsResourceAccountsCustomersEntitlementsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudChannelV1ListEntitlementsResponse]
  ): Unit = js.native
  /**
    * Lists Entitlements belonging to a customer. Possible error codes: * PERMISSION_DENIED: The customer doesn't belong to the reseller. * INVALID_ARGUMENT: Required request parameters are missing or invalid. Return value: A list of the customer's Entitlements.
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
    *   const res = await cloudchannel.accounts.customers.entitlements.list({
    *     // Optional. Requested page size. Server might return fewer results than requested. If unspecified, return at most 50 entitlements. The maximum value is 100; the server will coerce values above 100.
    *     pageSize: 'placeholder-value',
    *     // Optional. A token for a page of results other than the first page. Obtained using ListEntitlementsResponse.next_page_token of the previous CloudChannelService.ListEntitlements call.
    *     pageToken: 'placeholder-value',
    *     // Required. The resource name of the reseller's customer account to list entitlements for. Parent uses the format: accounts/{account_id\}/customers/{customer_id\}
    *     parent: 'accounts/my-account/customers/my-customer',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "entitlements": [],
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
  def list(params: ParamsResourceAccountsCustomersEntitlementsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceAccountsCustomersEntitlementsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def lookupOffer(): GaxiosPromise[SchemaGoogleCloudChannelV1Offer] = js.native
  def lookupOffer(callback: BodyResponseCallback[SchemaGoogleCloudChannelV1Offer]): Unit = js.native
  def lookupOffer(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudChannelV1Offer] = js.native
  def lookupOffer(params: ParamsResourceAccountsCustomersEntitlementsLookupoffer): GaxiosPromise[SchemaGoogleCloudChannelV1Offer] = js.native
  def lookupOffer(
    params: ParamsResourceAccountsCustomersEntitlementsLookupoffer,
    callback: BodyResponseCallback[SchemaGoogleCloudChannelV1Offer]
  ): Unit = js.native
  def lookupOffer(
    params: ParamsResourceAccountsCustomersEntitlementsLookupoffer,
    options: BodyResponseCallback[Readable | SchemaGoogleCloudChannelV1Offer],
    callback: BodyResponseCallback[Readable | SchemaGoogleCloudChannelV1Offer]
  ): Unit = js.native
  def lookupOffer(params: ParamsResourceAccountsCustomersEntitlementsLookupoffer, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudChannelV1Offer] = js.native
  def lookupOffer(
    params: ParamsResourceAccountsCustomersEntitlementsLookupoffer,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudChannelV1Offer]
  ): Unit = js.native
  /**
    * Returns the requested Offer resource. Possible error codes: * PERMISSION_DENIED: The entitlement doesn't belong to the reseller. * INVALID_ARGUMENT: Required request parameters are missing or invalid. * NOT_FOUND: Entitlement or offer was not found. Return value: The Offer resource.
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
    *   const res = await cloudchannel.accounts.customers.entitlements.lookupOffer({
    *     // Required. The resource name of the entitlement to retrieve the Offer. Entitlement uses the format: accounts/{account_id\}/customers/{customer_id\}/entitlements/{entitlement_id\}
    *     entitlement:
    *       'accounts/my-account/customers/my-customer/entitlements/my-entitlement',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "constraints": {},
    *   //   "endTime": "my_endTime",
    *   //   "marketingInfo": {},
    *   //   "name": "my_name",
    *   //   "parameterDefinitions": [],
    *   //   "plan": {},
    *   //   "priceByResources": [],
    *   //   "sku": {},
    *   //   "startTime": "my_startTime"
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
  def lookupOffer(params: ParamsResourceAccountsCustomersEntitlementsLookupoffer, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def lookupOffer(
    params: ParamsResourceAccountsCustomersEntitlementsLookupoffer,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def startPaidService(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def startPaidService(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def startPaidService(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def startPaidService(params: ParamsResourceAccountsCustomersEntitlementsStartpaidservice): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def startPaidService(
    params: ParamsResourceAccountsCustomersEntitlementsStartpaidservice,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def startPaidService(
    params: ParamsResourceAccountsCustomersEntitlementsStartpaidservice,
    options: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def startPaidService(params: ParamsResourceAccountsCustomersEntitlementsStartpaidservice, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def startPaidService(
    params: ParamsResourceAccountsCustomersEntitlementsStartpaidservice,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * Starts paid service for a trial entitlement. Starts paid service for a trial entitlement immediately. This method is only applicable if a plan is set up for a trial entitlement but has some trial days remaining. Possible error codes: * PERMISSION_DENIED: The customer doesn't belong to the reseller. * INVALID_ARGUMENT: Required request parameters are missing or invalid. * NOT_FOUND: Entitlement resource not found. * FAILED_PRECONDITION/NOT_IN_TRIAL: This method only works for entitlement on trial plans. * INTERNAL: Any non-user error related to a technical issue in the backend. Contact Cloud Channel support. * UNKNOWN: Any non-user error related to a technical issue in the backend. Contact Cloud Channel support. Return value: The ID of a long-running operation. To get the results of the operation, call the GetOperation method of CloudChannelOperationsService. The Operation metadata will contain an instance of OperationMetadata.
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
    *     await cloudchannel.accounts.customers.entitlements.startPaidService({
    *       // Required. The name of the entitlement to start a paid service for. Name uses the format: accounts/{account_id\}/customers/{customer_id\}/entitlements/{entitlement_id\}
    *       name: 'accounts/my-account/customers/my-customer/entitlements/my-entitlement',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
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
  def startPaidService(params: ParamsResourceAccountsCustomersEntitlementsStartpaidservice, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def startPaidService(
    params: ParamsResourceAccountsCustomersEntitlementsStartpaidservice,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def suspend(): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def suspend(callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]): Unit = js.native
  def suspend(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def suspend(params: ParamsResourceAccountsCustomersEntitlementsSuspend): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def suspend(
    params: ParamsResourceAccountsCustomersEntitlementsSuspend,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def suspend(
    params: ParamsResourceAccountsCustomersEntitlementsSuspend,
    options: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation],
    callback: BodyResponseCallback[Readable | SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  def suspend(params: ParamsResourceAccountsCustomersEntitlementsSuspend, options: MethodOptions): GaxiosPromise[SchemaGoogleLongrunningOperation] = js.native
  def suspend(
    params: ParamsResourceAccountsCustomersEntitlementsSuspend,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * Suspends a previously fulfilled entitlement. An entitlement suspension is a long-running operation. Possible error codes: * PERMISSION_DENIED: The customer doesn't belong to the reseller. * INVALID_ARGUMENT: Required request parameters are missing or invalid. * NOT_FOUND: Entitlement resource not found. * NOT_ACTIVE: Entitlement is not active. * INTERNAL: Any non-user error related to a technical issue in the backend. Contact Cloud Channel support. * UNKNOWN: Any non-user error related to a technical issue in the backend. Contact Cloud Channel support. Return value: The ID of a long-running operation. To get the results of the operation, call the GetOperation method of CloudChannelOperationsService. The Operation metadata will contain an instance of OperationMetadata.
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
    *   const res = await cloudchannel.accounts.customers.entitlements.suspend({
    *     // Required. The resource name of the entitlement to suspend. Name uses the format: accounts/{account_id\}/customers/{customer_id\}/entitlements/{entitlement_id\}
    *     name: 'accounts/my-account/customers/my-customer/entitlements/my-entitlement',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
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
  def suspend(params: ParamsResourceAccountsCustomersEntitlementsSuspend, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def suspend(
    params: ParamsResourceAccountsCustomersEntitlementsSuspend,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
