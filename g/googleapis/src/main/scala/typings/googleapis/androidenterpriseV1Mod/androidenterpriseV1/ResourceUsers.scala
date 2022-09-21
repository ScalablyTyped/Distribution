package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/androidenterprise/v1", "androidenterprise_v1.Resource$Users")
@js.native
open class ResourceUsers protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceUsersDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceUsersDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceUsersDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceUsersDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceUsersDelete, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
  /**
    * Deleted an EMM-managed user.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/androidenterprise.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const androidenterprise = google.androidenterprise('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/androidenterprise'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await androidenterprise.users.delete({
    *     // The ID of the enterprise.
    *     enterpriseId: 'placeholder-value',
    *     // The ID of the user.
    *     userId: 'placeholder-value',
    *   });
    *   console.log(res.data);
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
  def delete(params: ParamsResourceUsersDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceUsersDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def generateAuthenticationToken(): GaxiosPromise[SchemaAuthenticationToken] = js.native
  def generateAuthenticationToken(callback: BodyResponseCallback[SchemaAuthenticationToken]): Unit = js.native
  def generateAuthenticationToken(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAuthenticationToken] = js.native
  def generateAuthenticationToken(params: ParamsResourceUsersGenerateauthenticationtoken): GaxiosPromise[SchemaAuthenticationToken] = js.native
  def generateAuthenticationToken(
    params: ParamsResourceUsersGenerateauthenticationtoken,
    callback: BodyResponseCallback[SchemaAuthenticationToken]
  ): Unit = js.native
  def generateAuthenticationToken(
    params: ParamsResourceUsersGenerateauthenticationtoken,
    options: BodyResponseCallback[Readable | SchemaAuthenticationToken],
    callback: BodyResponseCallback[Readable | SchemaAuthenticationToken]
  ): Unit = js.native
  def generateAuthenticationToken(params: ParamsResourceUsersGenerateauthenticationtoken, options: MethodOptions): GaxiosPromise[SchemaAuthenticationToken] = js.native
  def generateAuthenticationToken(
    params: ParamsResourceUsersGenerateauthenticationtoken,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAuthenticationToken]
  ): Unit = js.native
  /**
    * Generates an authentication token which the device policy client can use to provision the given EMM-managed user account on a device. The generated token is single-use and expires after a few minutes. You can provision a maximum of 10 devices per user. This call only works with EMM-managed accounts.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/androidenterprise.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const androidenterprise = google.androidenterprise('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/androidenterprise'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await androidenterprise.users.generateAuthenticationToken({
    *     // The ID of the enterprise.
    *     enterpriseId: 'placeholder-value',
    *     // The ID of the user.
    *     userId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "token": "my_token"
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
  def generateAuthenticationToken(params: ParamsResourceUsersGenerateauthenticationtoken, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def generateAuthenticationToken(
    params: ParamsResourceUsersGenerateauthenticationtoken,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaUser] = js.native
  def get(callback: BodyResponseCallback[SchemaUser]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaUser] = js.native
  def get(params: ParamsResourceUsersGet): GaxiosPromise[SchemaUser] = js.native
  def get(params: ParamsResourceUsersGet, callback: BodyResponseCallback[SchemaUser]): Unit = js.native
  def get(
    params: ParamsResourceUsersGet,
    options: BodyResponseCallback[Readable | SchemaUser],
    callback: BodyResponseCallback[Readable | SchemaUser]
  ): Unit = js.native
  def get(params: ParamsResourceUsersGet, options: MethodOptions): GaxiosPromise[SchemaUser] = js.native
  def get(params: ParamsResourceUsersGet, options: MethodOptions, callback: BodyResponseCallback[SchemaUser]): Unit = js.native
  /**
    * Retrieves a user's details.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/androidenterprise.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const androidenterprise = google.androidenterprise('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/androidenterprise'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await androidenterprise.users.get({
    *     // The ID of the enterprise.
    *     enterpriseId: 'placeholder-value',
    *     // The ID of the user.
    *     userId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountIdentifier": "my_accountIdentifier",
    *   //   "accountType": "my_accountType",
    *   //   "displayName": "my_displayName",
    *   //   "id": "my_id",
    *   //   "managementType": "my_managementType",
    *   //   "primaryEmail": "my_primaryEmail"
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
  def get(params: ParamsResourceUsersGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceUsersGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getAvailableProductSet(): GaxiosPromise[SchemaProductSet] = js.native
  def getAvailableProductSet(callback: BodyResponseCallback[SchemaProductSet]): Unit = js.native
  def getAvailableProductSet(params: Unit, options: MethodOptions): GaxiosPromise[SchemaProductSet] = js.native
  def getAvailableProductSet(params: ParamsResourceUsersGetavailableproductset): GaxiosPromise[SchemaProductSet] = js.native
  def getAvailableProductSet(
    params: ParamsResourceUsersGetavailableproductset,
    callback: BodyResponseCallback[SchemaProductSet]
  ): Unit = js.native
  def getAvailableProductSet(
    params: ParamsResourceUsersGetavailableproductset,
    options: BodyResponseCallback[Readable | SchemaProductSet],
    callback: BodyResponseCallback[Readable | SchemaProductSet]
  ): Unit = js.native
  def getAvailableProductSet(params: ParamsResourceUsersGetavailableproductset, options: MethodOptions): GaxiosPromise[SchemaProductSet] = js.native
  def getAvailableProductSet(
    params: ParamsResourceUsersGetavailableproductset,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProductSet]
  ): Unit = js.native
  /**
    * Retrieves the set of products a user is entitled to access.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/androidenterprise.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const androidenterprise = google.androidenterprise('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/androidenterprise'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await androidenterprise.users.getAvailableProductSet({
    *     // The ID of the enterprise.
    *     enterpriseId: 'placeholder-value',
    *     // The ID of the user.
    *     userId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "productId": [],
    *   //   "productSetBehavior": "my_productSetBehavior",
    *   //   "productVisibility": []
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
  def getAvailableProductSet(params: ParamsResourceUsersGetavailableproductset, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getAvailableProductSet(
    params: ParamsResourceUsersGetavailableproductset,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaUser] = js.native
  def insert(callback: BodyResponseCallback[SchemaUser]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaUser] = js.native
  def insert(params: ParamsResourceUsersInsert): GaxiosPromise[SchemaUser] = js.native
  def insert(params: ParamsResourceUsersInsert, callback: BodyResponseCallback[SchemaUser]): Unit = js.native
  def insert(
    params: ParamsResourceUsersInsert,
    options: BodyResponseCallback[Readable | SchemaUser],
    callback: BodyResponseCallback[Readable | SchemaUser]
  ): Unit = js.native
  def insert(params: ParamsResourceUsersInsert, options: MethodOptions): GaxiosPromise[SchemaUser] = js.native
  def insert(
    params: ParamsResourceUsersInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUser]
  ): Unit = js.native
  /**
    * Creates a new EMM-managed user. The Users resource passed in the body of the request should include an accountIdentifier and an accountType. If a corresponding user already exists with the same account identifier, the user will be updated with the resource. In this case only the displayName field can be changed.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/androidenterprise.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const androidenterprise = google.androidenterprise('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/androidenterprise'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await androidenterprise.users.insert({
    *     // The ID of the enterprise.
    *     enterpriseId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountIdentifier": "my_accountIdentifier",
    *       //   "accountType": "my_accountType",
    *       //   "displayName": "my_displayName",
    *       //   "id": "my_id",
    *       //   "managementType": "my_managementType",
    *       //   "primaryEmail": "my_primaryEmail"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountIdentifier": "my_accountIdentifier",
    *   //   "accountType": "my_accountType",
    *   //   "displayName": "my_displayName",
    *   //   "id": "my_id",
    *   //   "managementType": "my_managementType",
    *   //   "primaryEmail": "my_primaryEmail"
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
  def insert(params: ParamsResourceUsersInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceUsersInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaUsersListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaUsersListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaUsersListResponse] = js.native
  def list(params: ParamsResourceUsersList): GaxiosPromise[SchemaUsersListResponse] = js.native
  def list(params: ParamsResourceUsersList, callback: BodyResponseCallback[SchemaUsersListResponse]): Unit = js.native
  def list(
    params: ParamsResourceUsersList,
    options: BodyResponseCallback[Readable | SchemaUsersListResponse],
    callback: BodyResponseCallback[Readable | SchemaUsersListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceUsersList, options: MethodOptions): GaxiosPromise[SchemaUsersListResponse] = js.native
  def list(
    params: ParamsResourceUsersList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUsersListResponse]
  ): Unit = js.native
  /**
    * Looks up a user by primary email address. This is only supported for Google-managed users. Lookup of the id is not needed for EMM-managed users because the id is already returned in the result of the Users.insert call.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/androidenterprise.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const androidenterprise = google.androidenterprise('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/androidenterprise'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await androidenterprise.users.list({
    *     // Required. The exact primary email address of the user to look up.
    *     email: 'placeholder-value',
    *     // The ID of the enterprise.
    *     enterpriseId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "user": []
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
  def list(params: ParamsResourceUsersList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceUsersList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def revokeDeviceAccess(): GaxiosPromise[Unit] = js.native
  def revokeDeviceAccess(callback: BodyResponseCallback[Unit]): Unit = js.native
  def revokeDeviceAccess(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def revokeDeviceAccess(params: ParamsResourceUsersRevokedeviceaccess): GaxiosPromise[Unit] = js.native
  def revokeDeviceAccess(params: ParamsResourceUsersRevokedeviceaccess, callback: BodyResponseCallback[Unit]): Unit = js.native
  def revokeDeviceAccess(
    params: ParamsResourceUsersRevokedeviceaccess,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def revokeDeviceAccess(params: ParamsResourceUsersRevokedeviceaccess, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def revokeDeviceAccess(
    params: ParamsResourceUsersRevokedeviceaccess,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Revokes access to all devices currently provisioned to the user. The user will no longer be able to use the managed Play store on any of their managed devices. This call only works with EMM-managed accounts.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/androidenterprise.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const androidenterprise = google.androidenterprise('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/androidenterprise'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await androidenterprise.users.revokeDeviceAccess({
    *     // The ID of the enterprise.
    *     enterpriseId: 'placeholder-value',
    *     // The ID of the user.
    *     userId: 'placeholder-value',
    *   });
    *   console.log(res.data);
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
  def revokeDeviceAccess(params: ParamsResourceUsersRevokedeviceaccess, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def revokeDeviceAccess(
    params: ParamsResourceUsersRevokedeviceaccess,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def setAvailableProductSet(): GaxiosPromise[SchemaProductSet] = js.native
  def setAvailableProductSet(callback: BodyResponseCallback[SchemaProductSet]): Unit = js.native
  def setAvailableProductSet(params: Unit, options: MethodOptions): GaxiosPromise[SchemaProductSet] = js.native
  def setAvailableProductSet(params: ParamsResourceUsersSetavailableproductset): GaxiosPromise[SchemaProductSet] = js.native
  def setAvailableProductSet(
    params: ParamsResourceUsersSetavailableproductset,
    callback: BodyResponseCallback[SchemaProductSet]
  ): Unit = js.native
  def setAvailableProductSet(
    params: ParamsResourceUsersSetavailableproductset,
    options: BodyResponseCallback[Readable | SchemaProductSet],
    callback: BodyResponseCallback[Readable | SchemaProductSet]
  ): Unit = js.native
  def setAvailableProductSet(params: ParamsResourceUsersSetavailableproductset, options: MethodOptions): GaxiosPromise[SchemaProductSet] = js.native
  def setAvailableProductSet(
    params: ParamsResourceUsersSetavailableproductset,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProductSet]
  ): Unit = js.native
  /**
    * Modifies the set of products that a user is entitled to access (referred to as *whitelisted* products). Only products that are approved or products that were previously approved (products with revoked approval) can be whitelisted.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/androidenterprise.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const androidenterprise = google.androidenterprise('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/androidenterprise'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await androidenterprise.users.setAvailableProductSet({
    *     // The ID of the enterprise.
    *     enterpriseId: 'placeholder-value',
    *     // The ID of the user.
    *     userId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "productId": [],
    *       //   "productSetBehavior": "my_productSetBehavior",
    *       //   "productVisibility": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "productId": [],
    *   //   "productSetBehavior": "my_productSetBehavior",
    *   //   "productVisibility": []
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
  def setAvailableProductSet(params: ParamsResourceUsersSetavailableproductset, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def setAvailableProductSet(
    params: ParamsResourceUsersSetavailableproductset,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaUser] = js.native
  def update(callback: BodyResponseCallback[SchemaUser]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaUser] = js.native
  def update(params: ParamsResourceUsersUpdate): GaxiosPromise[SchemaUser] = js.native
  def update(params: ParamsResourceUsersUpdate, callback: BodyResponseCallback[SchemaUser]): Unit = js.native
  def update(
    params: ParamsResourceUsersUpdate,
    options: BodyResponseCallback[Readable | SchemaUser],
    callback: BodyResponseCallback[Readable | SchemaUser]
  ): Unit = js.native
  def update(params: ParamsResourceUsersUpdate, options: MethodOptions): GaxiosPromise[SchemaUser] = js.native
  def update(
    params: ParamsResourceUsersUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUser]
  ): Unit = js.native
  /**
    * Updates the details of an EMM-managed user. Can be used with EMM-managed users only (not Google managed users). Pass the new details in the Users resource in the request body. Only the displayName field can be changed. Other fields must either be unset or have the currently active value.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/androidenterprise.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const androidenterprise = google.androidenterprise('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/androidenterprise'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await androidenterprise.users.update({
    *     // The ID of the enterprise.
    *     enterpriseId: 'placeholder-value',
    *     // The ID of the user.
    *     userId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accountIdentifier": "my_accountIdentifier",
    *       //   "accountType": "my_accountType",
    *       //   "displayName": "my_displayName",
    *       //   "id": "my_id",
    *       //   "managementType": "my_managementType",
    *       //   "primaryEmail": "my_primaryEmail"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accountIdentifier": "my_accountIdentifier",
    *   //   "accountType": "my_accountType",
    *   //   "displayName": "my_displayName",
    *   //   "id": "my_id",
    *   //   "managementType": "my_managementType",
    *   //   "primaryEmail": "my_primaryEmail"
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
  def update(params: ParamsResourceUsersUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceUsersUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
