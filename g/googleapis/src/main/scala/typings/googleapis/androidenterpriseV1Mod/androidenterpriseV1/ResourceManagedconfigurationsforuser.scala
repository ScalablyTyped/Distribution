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

@JSImport("googleapis/build/src/apis/androidenterprise/v1", "androidenterprise_v1.Resource$Managedconfigurationsforuser")
@js.native
open class ResourceManagedconfigurationsforuser protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceManagedconfigurationsforuserDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceManagedconfigurationsforuserDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceManagedconfigurationsforuserDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceManagedconfigurationsforuserDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceManagedconfigurationsforuserDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Removes a per-user managed configuration for an app for the specified user.
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
    *   const res = await androidenterprise.managedconfigurationsforuser.delete({
    *     // The ID of the enterprise.
    *     enterpriseId: 'placeholder-value',
    *     // The ID of the managed configuration (a product ID), e.g. "app:com.google.android.gm".
    *     managedConfigurationForUserId: 'placeholder-value',
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
  def delete(params: ParamsResourceManagedconfigurationsforuserDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceManagedconfigurationsforuserDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaManagedConfiguration] = js.native
  def get(callback: BodyResponseCallback[SchemaManagedConfiguration]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaManagedConfiguration] = js.native
  def get(params: ParamsResourceManagedconfigurationsforuserGet): GaxiosPromise[SchemaManagedConfiguration] = js.native
  def get(
    params: ParamsResourceManagedconfigurationsforuserGet,
    callback: BodyResponseCallback[SchemaManagedConfiguration]
  ): Unit = js.native
  def get(
    params: ParamsResourceManagedconfigurationsforuserGet,
    options: BodyResponseCallback[Readable | SchemaManagedConfiguration],
    callback: BodyResponseCallback[Readable | SchemaManagedConfiguration]
  ): Unit = js.native
  def get(params: ParamsResourceManagedconfigurationsforuserGet, options: MethodOptions): GaxiosPromise[SchemaManagedConfiguration] = js.native
  def get(
    params: ParamsResourceManagedconfigurationsforuserGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaManagedConfiguration]
  ): Unit = js.native
  /**
    * Retrieves details of a per-user managed configuration for an app for the specified user.
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
    *   const res = await androidenterprise.managedconfigurationsforuser.get({
    *     // The ID of the enterprise.
    *     enterpriseId: 'placeholder-value',
    *     // The ID of the managed configuration (a product ID), e.g. "app:com.google.android.gm".
    *     managedConfigurationForUserId: 'placeholder-value',
    *     // The ID of the user.
    *     userId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "configurationVariables": {},
    *   //   "kind": "my_kind",
    *   //   "managedProperty": [],
    *   //   "productId": "my_productId"
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
  def get(params: ParamsResourceManagedconfigurationsforuserGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceManagedconfigurationsforuserGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaManagedConfigurationsForUserListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaManagedConfigurationsForUserListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaManagedConfigurationsForUserListResponse] = js.native
  def list(params: ParamsResourceManagedconfigurationsforuserList): GaxiosPromise[SchemaManagedConfigurationsForUserListResponse] = js.native
  def list(
    params: ParamsResourceManagedconfigurationsforuserList,
    callback: BodyResponseCallback[SchemaManagedConfigurationsForUserListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceManagedconfigurationsforuserList,
    options: BodyResponseCallback[Readable | SchemaManagedConfigurationsForUserListResponse],
    callback: BodyResponseCallback[Readable | SchemaManagedConfigurationsForUserListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceManagedconfigurationsforuserList, options: MethodOptions): GaxiosPromise[SchemaManagedConfigurationsForUserListResponse] = js.native
  def list(
    params: ParamsResourceManagedconfigurationsforuserList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaManagedConfigurationsForUserListResponse]
  ): Unit = js.native
  /**
    * Lists all the per-user managed configurations for the specified user. Only the ID is set.
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
    *   const res = await androidenterprise.managedconfigurationsforuser.list({
    *     // The ID of the enterprise.
    *     enterpriseId: 'placeholder-value',
    *     // The ID of the user.
    *     userId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "managedConfigurationForUser": []
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
  def list(params: ParamsResourceManagedconfigurationsforuserList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceManagedconfigurationsforuserList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaManagedConfiguration] = js.native
  def update(callback: BodyResponseCallback[SchemaManagedConfiguration]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaManagedConfiguration] = js.native
  def update(params: ParamsResourceManagedconfigurationsforuserUpdate): GaxiosPromise[SchemaManagedConfiguration] = js.native
  def update(
    params: ParamsResourceManagedconfigurationsforuserUpdate,
    callback: BodyResponseCallback[SchemaManagedConfiguration]
  ): Unit = js.native
  def update(
    params: ParamsResourceManagedconfigurationsforuserUpdate,
    options: BodyResponseCallback[Readable | SchemaManagedConfiguration],
    callback: BodyResponseCallback[Readable | SchemaManagedConfiguration]
  ): Unit = js.native
  def update(params: ParamsResourceManagedconfigurationsforuserUpdate, options: MethodOptions): GaxiosPromise[SchemaManagedConfiguration] = js.native
  def update(
    params: ParamsResourceManagedconfigurationsforuserUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaManagedConfiguration]
  ): Unit = js.native
  /**
    * Adds or updates the managed configuration settings for an app for the specified user. If you support the Managed configurations iframe, you can apply managed configurations to a user by specifying an mcmId and its associated configuration variables (if any) in the request. Alternatively, all EMMs can apply managed configurations by passing a list of managed properties.
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
    *   const res = await androidenterprise.managedconfigurationsforuser.update({
    *     // The ID of the enterprise.
    *     enterpriseId: 'placeholder-value',
    *     // The ID of the managed configuration (a product ID), e.g. "app:com.google.android.gm".
    *     managedConfigurationForUserId: 'placeholder-value',
    *     // The ID of the user.
    *     userId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "configurationVariables": {},
    *       //   "kind": "my_kind",
    *       //   "managedProperty": [],
    *       //   "productId": "my_productId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "configurationVariables": {},
    *   //   "kind": "my_kind",
    *   //   "managedProperty": [],
    *   //   "productId": "my_productId"
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
  def update(params: ParamsResourceManagedconfigurationsforuserUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceManagedconfigurationsforuserUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
