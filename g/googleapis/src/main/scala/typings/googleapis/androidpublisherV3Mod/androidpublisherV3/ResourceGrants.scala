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

@JSImport("googleapis/build/src/apis/androidpublisher/v3", "androidpublisher_v3.Resource$Grants")
@js.native
open class ResourceGrants protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaGrant] = js.native
  def create(callback: BodyResponseCallback[SchemaGrant]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGrant] = js.native
  def create(params: ParamsResourceGrantsCreate): GaxiosPromise[SchemaGrant] = js.native
  def create(params: ParamsResourceGrantsCreate, callback: BodyResponseCallback[SchemaGrant]): Unit = js.native
  def create(
    params: ParamsResourceGrantsCreate,
    options: BodyResponseCallback[Readable | SchemaGrant],
    callback: BodyResponseCallback[Readable | SchemaGrant]
  ): Unit = js.native
  def create(params: ParamsResourceGrantsCreate, options: MethodOptions): GaxiosPromise[SchemaGrant] = js.native
  def create(
    params: ParamsResourceGrantsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGrant]
  ): Unit = js.native
  /**
    * Grant access for a user to the given package.
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
    *   const res = await androidpublisher.grants.create({
    *     // Required. The user which needs permission. Format: developers/{developer\}/users/{user\}
    *     parent: 'developers/my-developer/users/my-user',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "appLevelPermissions": [],
    *       //   "name": "my_name",
    *       //   "packageName": "my_packageName"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "appLevelPermissions": [],
    *   //   "name": "my_name",
    *   //   "packageName": "my_packageName"
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
  def create(params: ParamsResourceGrantsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceGrantsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceGrantsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceGrantsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceGrantsDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceGrantsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceGrantsDelete, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
  /**
    * Removes all access for the user to the given package or developer account.
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
    *   const res = await androidpublisher.grants.delete({
    *     // Required. The name of the grant to delete. Format: developers/{developer\}/users/{email\}/grants/{package_name\}
    *     name: 'developers/my-developer/users/my-user/grants/my-grant',
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
  def delete(params: ParamsResourceGrantsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceGrantsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaGrant] = js.native
  def patch(callback: BodyResponseCallback[SchemaGrant]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGrant] = js.native
  def patch(params: ParamsResourceGrantsPatch): GaxiosPromise[SchemaGrant] = js.native
  def patch(params: ParamsResourceGrantsPatch, callback: BodyResponseCallback[SchemaGrant]): Unit = js.native
  def patch(
    params: ParamsResourceGrantsPatch,
    options: BodyResponseCallback[Readable | SchemaGrant],
    callback: BodyResponseCallback[Readable | SchemaGrant]
  ): Unit = js.native
  def patch(params: ParamsResourceGrantsPatch, options: MethodOptions): GaxiosPromise[SchemaGrant] = js.native
  def patch(
    params: ParamsResourceGrantsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGrant]
  ): Unit = js.native
  /**
    * Updates access for the user to the given package.
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
    *   const res = await androidpublisher.grants.patch({
    *     // Required. Resource name for this grant, following the pattern "developers/{developer\}/users/{email\}/grants/{package_name\}". If this grant is for a draft app, the app ID will be used in this resource name instead of the package name.
    *     name: 'developers/my-developer/users/my-user/grants/my-grant',
    *     // Optional. The list of fields to be updated.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "appLevelPermissions": [],
    *       //   "name": "my_name",
    *       //   "packageName": "my_packageName"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "appLevelPermissions": [],
    *   //   "name": "my_name",
    *   //   "packageName": "my_packageName"
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
  def patch(params: ParamsResourceGrantsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceGrantsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
