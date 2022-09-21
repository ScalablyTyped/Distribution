package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/androidpublisher/v3", "androidpublisher_v3.Resource$Users")
@js.native
open class ResourceUsers protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaUser] = js.native
  def create(callback: BodyResponseCallback[SchemaUser]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaUser] = js.native
  def create(params: ParamsResourceUsersCreate): GaxiosPromise[SchemaUser] = js.native
  def create(params: ParamsResourceUsersCreate, callback: BodyResponseCallback[SchemaUser]): Unit = js.native
  def create(
    params: ParamsResourceUsersCreate,
    options: BodyResponseCallback[Readable | SchemaUser],
    callback: BodyResponseCallback[Readable | SchemaUser]
  ): Unit = js.native
  def create(params: ParamsResourceUsersCreate, options: MethodOptions): GaxiosPromise[SchemaUser] = js.native
  def create(
    params: ParamsResourceUsersCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUser]
  ): Unit = js.native
  /**
    * Grant access for a user to the given developer account.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/androidpublisher.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const androidpublisher = google.androidpublisher('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/androidpublisher'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await androidpublisher.users.create({
    *     // Required. The developer account to add the user to. Format: developers/{developer\}
    *     parent: 'developers/my-developer',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accessState": "my_accessState",
    *       //   "developerAccountPermissions": [],
    *       //   "email": "my_email",
    *       //   "expirationTime": "my_expirationTime",
    *       //   "grants": [],
    *       //   "name": "my_name",
    *       //   "partial": false
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accessState": "my_accessState",
    *   //   "developerAccountPermissions": [],
    *   //   "email": "my_email",
    *   //   "expirationTime": "my_expirationTime",
    *   //   "grants": [],
    *   //   "name": "my_name",
    *   //   "partial": false
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
  def create(params: ParamsResourceUsersCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceUsersCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
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
    * Removes all access for the user to the given developer account.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/androidpublisher.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const androidpublisher = google.androidpublisher('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/androidpublisher'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await androidpublisher.users.delete({
    *     // Required. The name of the user to delete. Format: developers/{developer\}/users/{email\}
    *     name: 'developers/my-developer/users/my-user',
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
  
  def list(): GaxiosPromise[SchemaListUsersResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListUsersResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListUsersResponse] = js.native
  def list(params: ParamsResourceUsersList): GaxiosPromise[SchemaListUsersResponse] = js.native
  def list(params: ParamsResourceUsersList, callback: BodyResponseCallback[SchemaListUsersResponse]): Unit = js.native
  def list(
    params: ParamsResourceUsersList,
    options: BodyResponseCallback[Readable | SchemaListUsersResponse],
    callback: BodyResponseCallback[Readable | SchemaListUsersResponse]
  ): Unit = js.native
  def list(params: ParamsResourceUsersList, options: MethodOptions): GaxiosPromise[SchemaListUsersResponse] = js.native
  def list(
    params: ParamsResourceUsersList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListUsersResponse]
  ): Unit = js.native
  /**
    * Lists all users with access to a developer account.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/androidpublisher.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const androidpublisher = google.androidpublisher('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/androidpublisher'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await androidpublisher.users.list({
    *     // The maximum number of results to return. This must be set to -1 to disable pagination.
    *     pageSize: 'placeholder-value',
    *     // A token received from a previous call to this method, in order to retrieve further results.
    *     pageToken: 'placeholder-value',
    *     // Required. The developer account to fetch users from. Format: developers/{developer\}
    *     parent: 'developers/my-developer',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "users": []
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
  
  def patch(): GaxiosPromise[SchemaUser] = js.native
  def patch(callback: BodyResponseCallback[SchemaUser]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaUser] = js.native
  def patch(params: ParamsResourceUsersPatch): GaxiosPromise[SchemaUser] = js.native
  def patch(params: ParamsResourceUsersPatch, callback: BodyResponseCallback[SchemaUser]): Unit = js.native
  def patch(
    params: ParamsResourceUsersPatch,
    options: BodyResponseCallback[Readable | SchemaUser],
    callback: BodyResponseCallback[Readable | SchemaUser]
  ): Unit = js.native
  def patch(params: ParamsResourceUsersPatch, options: MethodOptions): GaxiosPromise[SchemaUser] = js.native
  def patch(
    params: ParamsResourceUsersPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUser]
  ): Unit = js.native
  /**
    * Updates access for the user to the developer account.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/androidpublisher.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const androidpublisher = google.androidpublisher('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/androidpublisher'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await androidpublisher.users.patch({
    *     // Required. Resource name for this user, following the pattern "developers/{developer\}/users/{email\}".
    *     name: 'developers/my-developer/users/my-user',
    *     // Optional. The list of fields to be updated.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "accessState": "my_accessState",
    *       //   "developerAccountPermissions": [],
    *       //   "email": "my_email",
    *       //   "expirationTime": "my_expirationTime",
    *       //   "grants": [],
    *       //   "name": "my_name",
    *       //   "partial": false
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accessState": "my_accessState",
    *   //   "developerAccountPermissions": [],
    *   //   "email": "my_email",
    *   //   "expirationTime": "my_expirationTime",
    *   //   "grants": [],
    *   //   "name": "my_name",
    *   //   "partial": false
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
  def patch(params: ParamsResourceUsersPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceUsersPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
