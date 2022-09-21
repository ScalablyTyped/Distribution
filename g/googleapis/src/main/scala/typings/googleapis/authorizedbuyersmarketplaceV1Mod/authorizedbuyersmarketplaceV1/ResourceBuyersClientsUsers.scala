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

@JSImport("googleapis/build/src/apis/authorizedbuyersmarketplace/v1", "authorizedbuyersmarketplace_v1.Resource$Buyers$Clients$Users")
@js.native
open class ResourceBuyersClientsUsers protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def activate(): GaxiosPromise[SchemaClientUser] = js.native
  def activate(callback: BodyResponseCallback[SchemaClientUser]): Unit = js.native
  def activate(params: Unit, options: MethodOptions): GaxiosPromise[SchemaClientUser] = js.native
  def activate(params: ParamsResourceBuyersClientsUsersActivate): GaxiosPromise[SchemaClientUser] = js.native
  def activate(params: ParamsResourceBuyersClientsUsersActivate, callback: BodyResponseCallback[SchemaClientUser]): Unit = js.native
  def activate(
    params: ParamsResourceBuyersClientsUsersActivate,
    options: BodyResponseCallback[Readable | SchemaClientUser],
    callback: BodyResponseCallback[Readable | SchemaClientUser]
  ): Unit = js.native
  def activate(params: ParamsResourceBuyersClientsUsersActivate, options: MethodOptions): GaxiosPromise[SchemaClientUser] = js.native
  def activate(
    params: ParamsResourceBuyersClientsUsersActivate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaClientUser]
  ): Unit = js.native
  /**
    * Activates an existing client user. The state of the client user will be updated from "INACTIVE" to "ACTIVE". This method has no effect if the client user is already in "ACTIVE" state. An error will be returned if the client user to activate is still in "INVITED" state.
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
    *   const res = await authorizedbuyersmarketplace.buyers.clients.users.activate({
    *     // Required. Format: `buyers/{buyerAccountId\}/clients/{clientAccountId\}/clientUsers/{userId\}`
    *     name: 'buyers/my-buyer/clients/my-client/users/my-user',
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
    *   //   "email": "my_email",
    *   //   "name": "my_name",
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
  def activate(params: ParamsResourceBuyersClientsUsersActivate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def activate(
    params: ParamsResourceBuyersClientsUsersActivate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaClientUser] = js.native
  def create(callback: BodyResponseCallback[SchemaClientUser]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaClientUser] = js.native
  def create(params: ParamsResourceBuyersClientsUsersCreate): GaxiosPromise[SchemaClientUser] = js.native
  def create(params: ParamsResourceBuyersClientsUsersCreate, callback: BodyResponseCallback[SchemaClientUser]): Unit = js.native
  def create(
    params: ParamsResourceBuyersClientsUsersCreate,
    options: BodyResponseCallback[Readable | SchemaClientUser],
    callback: BodyResponseCallback[Readable | SchemaClientUser]
  ): Unit = js.native
  def create(params: ParamsResourceBuyersClientsUsersCreate, options: MethodOptions): GaxiosPromise[SchemaClientUser] = js.native
  def create(
    params: ParamsResourceBuyersClientsUsersCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaClientUser]
  ): Unit = js.native
  /**
    * Creates a new client user in "INVITED" state. An email invitation will be sent to the new user, once accepted the user will become active.
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
    *   const res = await authorizedbuyersmarketplace.buyers.clients.users.create({
    *     // Required. The name of the client. Format: `buyers/{accountId\}/clients/{clientAccountId\}`
    *     parent: 'buyers/my-buyer/clients/my-client',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "email": "my_email",
    *       //   "name": "my_name",
    *       //   "state": "my_state"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "email": "my_email",
    *   //   "name": "my_name",
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
  def create(params: ParamsResourceBuyersClientsUsersCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceBuyersClientsUsersCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def deactivate(): GaxiosPromise[SchemaClientUser] = js.native
  def deactivate(callback: BodyResponseCallback[SchemaClientUser]): Unit = js.native
  def deactivate(params: Unit, options: MethodOptions): GaxiosPromise[SchemaClientUser] = js.native
  def deactivate(params: ParamsResourceBuyersClientsUsersDeactivate): GaxiosPromise[SchemaClientUser] = js.native
  def deactivate(
    params: ParamsResourceBuyersClientsUsersDeactivate,
    callback: BodyResponseCallback[SchemaClientUser]
  ): Unit = js.native
  def deactivate(
    params: ParamsResourceBuyersClientsUsersDeactivate,
    options: BodyResponseCallback[Readable | SchemaClientUser],
    callback: BodyResponseCallback[Readable | SchemaClientUser]
  ): Unit = js.native
  def deactivate(params: ParamsResourceBuyersClientsUsersDeactivate, options: MethodOptions): GaxiosPromise[SchemaClientUser] = js.native
  def deactivate(
    params: ParamsResourceBuyersClientsUsersDeactivate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaClientUser]
  ): Unit = js.native
  /**
    * Deactivates an existing client user. The state of the client user will be updated from "ACTIVE" to "INACTIVE". This method has no effect if the client user is already in "INACTIVE" state. An error will be returned if the client user to deactivate is still in "INVITED" state.
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
    *   const res = await authorizedbuyersmarketplace.buyers.clients.users.deactivate(
    *     {
    *       // Required. Format: `buyers/{buyerAccountId\}/clients/{clientAccountId\}/clientUsers/{userId\}`
    *       name: 'buyers/my-buyer/clients/my-client/users/my-user',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {}
    *       },
    *     }
    *   );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "email": "my_email",
    *   //   "name": "my_name",
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
  def deactivate(params: ParamsResourceBuyersClientsUsersDeactivate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def deactivate(
    params: ParamsResourceBuyersClientsUsersDeactivate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceBuyersClientsUsersDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceBuyersClientsUsersDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceBuyersClientsUsersDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceBuyersClientsUsersDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceBuyersClientsUsersDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes an existing client user. The client user will lose access to the Authorized Buyers UI. Note that if a client user is deleted, the user's access to the UI can't be restored unless a new client user is created and activated.
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
    *   const res = await authorizedbuyersmarketplace.buyers.clients.users.delete({
    *     // Required. Format: `buyers/{buyerAccountId\}/clients/{clientAccountId\}/clientUsers/{userId\}`
    *     name: 'buyers/my-buyer/clients/my-client/users/my-user',
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
  def delete(params: ParamsResourceBuyersClientsUsersDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceBuyersClientsUsersDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaClientUser] = js.native
  def get(callback: BodyResponseCallback[SchemaClientUser]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaClientUser] = js.native
  def get(params: ParamsResourceBuyersClientsUsersGet): GaxiosPromise[SchemaClientUser] = js.native
  def get(params: ParamsResourceBuyersClientsUsersGet, callback: BodyResponseCallback[SchemaClientUser]): Unit = js.native
  def get(
    params: ParamsResourceBuyersClientsUsersGet,
    options: BodyResponseCallback[Readable | SchemaClientUser],
    callback: BodyResponseCallback[Readable | SchemaClientUser]
  ): Unit = js.native
  def get(params: ParamsResourceBuyersClientsUsersGet, options: MethodOptions): GaxiosPromise[SchemaClientUser] = js.native
  def get(
    params: ParamsResourceBuyersClientsUsersGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaClientUser]
  ): Unit = js.native
  /**
    * Retrieves an existing client user.
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
    *   const res = await authorizedbuyersmarketplace.buyers.clients.users.get({
    *     // Required. Format: `buyers/{buyerAccountId\}/clients/{clientAccountId\}/clientUsers/{userId\}`
    *     name: 'buyers/my-buyer/clients/my-client/users/my-user',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "email": "my_email",
    *   //   "name": "my_name",
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
  def get(params: ParamsResourceBuyersClientsUsersGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceBuyersClientsUsersGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListClientUsersResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListClientUsersResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListClientUsersResponse] = js.native
  def list(params: ParamsResourceBuyersClientsUsersList): GaxiosPromise[SchemaListClientUsersResponse] = js.native
  def list(
    params: ParamsResourceBuyersClientsUsersList,
    callback: BodyResponseCallback[SchemaListClientUsersResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceBuyersClientsUsersList,
    options: BodyResponseCallback[Readable | SchemaListClientUsersResponse],
    callback: BodyResponseCallback[Readable | SchemaListClientUsersResponse]
  ): Unit = js.native
  def list(params: ParamsResourceBuyersClientsUsersList, options: MethodOptions): GaxiosPromise[SchemaListClientUsersResponse] = js.native
  def list(
    params: ParamsResourceBuyersClientsUsersList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListClientUsersResponse]
  ): Unit = js.native
  /**
    * Lists all client users for a specified client.
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
    *   const res = await authorizedbuyersmarketplace.buyers.clients.users.list({
    *     // Requested page size. If left blank, a default page size of 500 will be applied.
    *     pageSize: 'placeholder-value',
    *     // A token identifying a page of results the server should return. Typically, this is the value of ListClientUsersResponse.nextPageToken returned from the previous call to the list method.
    *     pageToken: 'placeholder-value',
    *     // Required. The name of the client. Format: `buyers/{buyerAccountId\}/clients/{clientAccountId\}`
    *     parent: 'buyers/my-buyer/clients/my-client',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "clientUsers": [],
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
  def list(params: ParamsResourceBuyersClientsUsersList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceBuyersClientsUsersList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
