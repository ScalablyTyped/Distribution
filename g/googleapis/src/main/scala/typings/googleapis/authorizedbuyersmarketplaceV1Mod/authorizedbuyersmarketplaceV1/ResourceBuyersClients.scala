package typings.googleapis.authorizedbuyersmarketplaceV1Mod.authorizedbuyersmarketplaceV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/authorizedbuyersmarketplace/v1", "authorizedbuyersmarketplace_v1.Resource$Buyers$Clients")
@js.native
open class ResourceBuyersClients protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def activate(): GaxiosPromise[SchemaClient] = js.native
  def activate(callback: BodyResponseCallback[SchemaClient]): Unit = js.native
  def activate(params: Unit, options: MethodOptions): GaxiosPromise[SchemaClient] = js.native
  def activate(params: ParamsResourceBuyersClientsActivate): GaxiosPromise[SchemaClient] = js.native
  def activate(params: ParamsResourceBuyersClientsActivate, callback: BodyResponseCallback[SchemaClient]): Unit = js.native
  def activate(
    params: ParamsResourceBuyersClientsActivate,
    options: BodyResponseCallback[Readable | SchemaClient],
    callback: BodyResponseCallback[Readable | SchemaClient]
  ): Unit = js.native
  def activate(params: ParamsResourceBuyersClientsActivate, options: MethodOptions): GaxiosPromise[SchemaClient] = js.native
  def activate(
    params: ParamsResourceBuyersClientsActivate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaClient]
  ): Unit = js.native
  /**
    * Activates an existing client. The state of the client will be updated to "ACTIVE". This method has no effect if the client is already in "ACTIVE" state.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/authorizedbuyersmarketplace.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const authorizedbuyersmarketplace = google.authorizedbuyersmarketplace('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/authorized-buyers-marketplace'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await authorizedbuyersmarketplace.buyers.clients.activate({
    *     // Required. Format: `buyers/{buyerAccountId\}/clients/{clientAccountId\}`
    *     name: 'buyers/my-buyer/clients/my-client',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {}
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "displayName": "my_displayName",
    *   //   "name": "my_name",
    *   //   "partnerClientId": "my_partnerClientId",
    *   //   "role": "my_role",
    *   //   "sellerVisible": false,
    *   //   "state": "my_state"
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
  def activate(params: ParamsResourceBuyersClientsActivate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def activate(
    params: ParamsResourceBuyersClientsActivate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaClient] = js.native
  def create(callback: BodyResponseCallback[SchemaClient]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaClient] = js.native
  def create(params: ParamsResourceBuyersClientsCreate): GaxiosPromise[SchemaClient] = js.native
  def create(params: ParamsResourceBuyersClientsCreate, callback: BodyResponseCallback[SchemaClient]): Unit = js.native
  def create(
    params: ParamsResourceBuyersClientsCreate,
    options: BodyResponseCallback[Readable | SchemaClient],
    callback: BodyResponseCallback[Readable | SchemaClient]
  ): Unit = js.native
  def create(params: ParamsResourceBuyersClientsCreate, options: MethodOptions): GaxiosPromise[SchemaClient] = js.native
  def create(
    params: ParamsResourceBuyersClientsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaClient]
  ): Unit = js.native
  /**
    * Creates a new client.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/authorizedbuyersmarketplace.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const authorizedbuyersmarketplace = google.authorizedbuyersmarketplace('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/authorized-buyers-marketplace'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await authorizedbuyersmarketplace.buyers.clients.create({
    *     // Required. The name of the buyer. Format: `buyers/{accountId\}`
    *     parent: 'buyers/my-buyer',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "displayName": "my_displayName",
    *       //   "name": "my_name",
    *       //   "partnerClientId": "my_partnerClientId",
    *       //   "role": "my_role",
    *       //   "sellerVisible": false,
    *       //   "state": "my_state"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "displayName": "my_displayName",
    *   //   "name": "my_name",
    *   //   "partnerClientId": "my_partnerClientId",
    *   //   "role": "my_role",
    *   //   "sellerVisible": false,
    *   //   "state": "my_state"
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
  def create(params: ParamsResourceBuyersClientsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceBuyersClientsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def deactivate(): GaxiosPromise[SchemaClient] = js.native
  def deactivate(callback: BodyResponseCallback[SchemaClient]): Unit = js.native
  def deactivate(params: Unit, options: MethodOptions): GaxiosPromise[SchemaClient] = js.native
  def deactivate(params: ParamsResourceBuyersClientsDeactivate): GaxiosPromise[SchemaClient] = js.native
  def deactivate(params: ParamsResourceBuyersClientsDeactivate, callback: BodyResponseCallback[SchemaClient]): Unit = js.native
  def deactivate(
    params: ParamsResourceBuyersClientsDeactivate,
    options: BodyResponseCallback[Readable | SchemaClient],
    callback: BodyResponseCallback[Readable | SchemaClient]
  ): Unit = js.native
  def deactivate(params: ParamsResourceBuyersClientsDeactivate, options: MethodOptions): GaxiosPromise[SchemaClient] = js.native
  def deactivate(
    params: ParamsResourceBuyersClientsDeactivate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaClient]
  ): Unit = js.native
  /**
    * Deactivates an existing client. The state of the client will be updated to "INACTIVE". This method has no effect if the client is already in "INACTIVE" state.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/authorizedbuyersmarketplace.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const authorizedbuyersmarketplace = google.authorizedbuyersmarketplace('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/authorized-buyers-marketplace'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await authorizedbuyersmarketplace.buyers.clients.deactivate({
    *     // Required. Format: `buyers/{buyerAccountId\}/clients/{clientAccountId\}`
    *     name: 'buyers/my-buyer/clients/my-client',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {}
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "displayName": "my_displayName",
    *   //   "name": "my_name",
    *   //   "partnerClientId": "my_partnerClientId",
    *   //   "role": "my_role",
    *   //   "sellerVisible": false,
    *   //   "state": "my_state"
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
  def deactivate(params: ParamsResourceBuyersClientsDeactivate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def deactivate(
    params: ParamsResourceBuyersClientsDeactivate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaClient] = js.native
  def get(callback: BodyResponseCallback[SchemaClient]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaClient] = js.native
  def get(params: ParamsResourceBuyersClientsGet): GaxiosPromise[SchemaClient] = js.native
  def get(params: ParamsResourceBuyersClientsGet, callback: BodyResponseCallback[SchemaClient]): Unit = js.native
  def get(
    params: ParamsResourceBuyersClientsGet,
    options: BodyResponseCallback[Readable | SchemaClient],
    callback: BodyResponseCallback[Readable | SchemaClient]
  ): Unit = js.native
  def get(params: ParamsResourceBuyersClientsGet, options: MethodOptions): GaxiosPromise[SchemaClient] = js.native
  def get(
    params: ParamsResourceBuyersClientsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaClient]
  ): Unit = js.native
  /**
    * Gets a client with a given resource name.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/authorizedbuyersmarketplace.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const authorizedbuyersmarketplace = google.authorizedbuyersmarketplace('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/authorized-buyers-marketplace'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await authorizedbuyersmarketplace.buyers.clients.get({
    *     // Required. Format: `buyers/{accountId\}/clients/{clientAccountId\}`
    *     name: 'buyers/my-buyer/clients/my-client',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "displayName": "my_displayName",
    *   //   "name": "my_name",
    *   //   "partnerClientId": "my_partnerClientId",
    *   //   "role": "my_role",
    *   //   "sellerVisible": false,
    *   //   "state": "my_state"
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
  def get(params: ParamsResourceBuyersClientsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceBuyersClientsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListClientsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListClientsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListClientsResponse] = js.native
  def list(params: ParamsResourceBuyersClientsList): GaxiosPromise[SchemaListClientsResponse] = js.native
  def list(params: ParamsResourceBuyersClientsList, callback: BodyResponseCallback[SchemaListClientsResponse]): Unit = js.native
  def list(
    params: ParamsResourceBuyersClientsList,
    options: BodyResponseCallback[Readable | SchemaListClientsResponse],
    callback: BodyResponseCallback[Readable | SchemaListClientsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceBuyersClientsList, options: MethodOptions): GaxiosPromise[SchemaListClientsResponse] = js.native
  def list(
    params: ParamsResourceBuyersClientsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListClientsResponse]
  ): Unit = js.native
  /**
    * Lists all the clients for the current buyer.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/authorizedbuyersmarketplace.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const authorizedbuyersmarketplace = google.authorizedbuyersmarketplace('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/authorized-buyers-marketplace'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await authorizedbuyersmarketplace.buyers.clients.list({
    *     // Query string using the [Filtering Syntax](https://developers.google.com/authorized-buyers/apis/guides/v2/list-filters) Supported fields for filtering are: * partnerClientId Use this field to filter the clients by the partnerClientId. For example, if the partnerClientId of the client is "1234", the value of this field should be `partnerClientId = "1234"`, in order to get only the client whose partnerClientId is "1234" in the response.
    *     filter: 'placeholder-value',
    *     // Requested page size. If left blank, a default page size of 500 will be applied.
    *     pageSize: 'placeholder-value',
    *     // A token identifying a page of results the server should return. Typically, this is the value of ListClientsResponse.nextPageToken returned from the previous call to the list method.
    *     pageToken: 'placeholder-value',
    *     // Required. The name of the buyer. Format: `buyers/{accountId\}`
    *     parent: 'buyers/my-buyer',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "clients": [],
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
  def list(params: ParamsResourceBuyersClientsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceBuyersClientsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaClient] = js.native
  def patch(callback: BodyResponseCallback[SchemaClient]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaClient] = js.native
  def patch(params: ParamsResourceBuyersClientsPatch): GaxiosPromise[SchemaClient] = js.native
  def patch(params: ParamsResourceBuyersClientsPatch, callback: BodyResponseCallback[SchemaClient]): Unit = js.native
  def patch(
    params: ParamsResourceBuyersClientsPatch,
    options: BodyResponseCallback[Readable | SchemaClient],
    callback: BodyResponseCallback[Readable | SchemaClient]
  ): Unit = js.native
  def patch(params: ParamsResourceBuyersClientsPatch, options: MethodOptions): GaxiosPromise[SchemaClient] = js.native
  def patch(
    params: ParamsResourceBuyersClientsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaClient]
  ): Unit = js.native
  /**
    * Updates an existing client.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/authorizedbuyersmarketplace.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const authorizedbuyersmarketplace = google.authorizedbuyersmarketplace('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/authorized-buyers-marketplace'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await authorizedbuyersmarketplace.buyers.clients.patch({
    *     // Output only. The resource name of the client. Format: `buyers/{accountId\}/clients/{clientAccountId\}`
    *     name: 'buyers/my-buyer/clients/my-client',
    *     // List of fields to be updated. If empty or unspecified, the service will update all fields populated in the update request excluding the output only fields and primitive fields with default value. Note that explicit field mask is required in order to reset a primitive field back to its default value, for example, false for boolean fields, 0 for integer fields. A special field mask consisting of a single path "*" can be used to indicate full replacement(the equivalent of PUT method), updatable fields unset or unspecified in the input will be cleared or set to default value. Output only fields will be ignored regardless of the value of updateMask.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "displayName": "my_displayName",
    *       //   "name": "my_name",
    *       //   "partnerClientId": "my_partnerClientId",
    *       //   "role": "my_role",
    *       //   "sellerVisible": false,
    *       //   "state": "my_state"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "displayName": "my_displayName",
    *   //   "name": "my_name",
    *   //   "partnerClientId": "my_partnerClientId",
    *   //   "role": "my_role",
    *   //   "sellerVisible": false,
    *   //   "state": "my_state"
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
  def patch(params: ParamsResourceBuyersClientsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceBuyersClientsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var users: ResourceBuyersClientsUsers = js.native
}
