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

@JSImport("googleapis/build/src/apis/androidenterprise/v1", "androidenterprise_v1.Resource$Webapps")
@js.native
open class ResourceWebapps protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceWebappsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceWebappsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceWebappsDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceWebappsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceWebappsDelete, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
  /**
    * Deletes an existing web app.
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
    *   const res = await androidenterprise.webapps.delete({
    *     // The ID of the enterprise.
    *     enterpriseId: 'placeholder-value',
    *     // The ID of the web app.
    *     webAppId: 'placeholder-value',
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
  def delete(params: ParamsResourceWebappsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceWebappsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaWebApp] = js.native
  def get(callback: BodyResponseCallback[SchemaWebApp]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaWebApp] = js.native
  def get(params: ParamsResourceWebappsGet): GaxiosPromise[SchemaWebApp] = js.native
  def get(params: ParamsResourceWebappsGet, callback: BodyResponseCallback[SchemaWebApp]): Unit = js.native
  def get(
    params: ParamsResourceWebappsGet,
    options: BodyResponseCallback[Readable | SchemaWebApp],
    callback: BodyResponseCallback[Readable | SchemaWebApp]
  ): Unit = js.native
  def get(params: ParamsResourceWebappsGet, options: MethodOptions): GaxiosPromise[SchemaWebApp] = js.native
  def get(
    params: ParamsResourceWebappsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaWebApp]
  ): Unit = js.native
  /**
    * Gets an existing web app.
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
    *   const res = await androidenterprise.webapps.get({
    *     // The ID of the enterprise.
    *     enterpriseId: 'placeholder-value',
    *     // The ID of the web app.
    *     webAppId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "displayMode": "my_displayMode",
    *   //   "icons": [],
    *   //   "isPublished": false,
    *   //   "startUrl": "my_startUrl",
    *   //   "title": "my_title",
    *   //   "versionCode": "my_versionCode",
    *   //   "webAppId": "my_webAppId"
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
  def get(params: ParamsResourceWebappsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceWebappsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaWebApp] = js.native
  def insert(callback: BodyResponseCallback[SchemaWebApp]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaWebApp] = js.native
  def insert(params: ParamsResourceWebappsInsert): GaxiosPromise[SchemaWebApp] = js.native
  def insert(params: ParamsResourceWebappsInsert, callback: BodyResponseCallback[SchemaWebApp]): Unit = js.native
  def insert(
    params: ParamsResourceWebappsInsert,
    options: BodyResponseCallback[Readable | SchemaWebApp],
    callback: BodyResponseCallback[Readable | SchemaWebApp]
  ): Unit = js.native
  def insert(params: ParamsResourceWebappsInsert, options: MethodOptions): GaxiosPromise[SchemaWebApp] = js.native
  def insert(
    params: ParamsResourceWebappsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaWebApp]
  ): Unit = js.native
  /**
    * Creates a new web app for the enterprise.
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
    *   const res = await androidenterprise.webapps.insert({
    *     // The ID of the enterprise.
    *     enterpriseId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "displayMode": "my_displayMode",
    *       //   "icons": [],
    *       //   "isPublished": false,
    *       //   "startUrl": "my_startUrl",
    *       //   "title": "my_title",
    *       //   "versionCode": "my_versionCode",
    *       //   "webAppId": "my_webAppId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "displayMode": "my_displayMode",
    *   //   "icons": [],
    *   //   "isPublished": false,
    *   //   "startUrl": "my_startUrl",
    *   //   "title": "my_title",
    *   //   "versionCode": "my_versionCode",
    *   //   "webAppId": "my_webAppId"
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
  def insert(params: ParamsResourceWebappsInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceWebappsInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaWebAppsListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaWebAppsListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaWebAppsListResponse] = js.native
  def list(params: ParamsResourceWebappsList): GaxiosPromise[SchemaWebAppsListResponse] = js.native
  def list(params: ParamsResourceWebappsList, callback: BodyResponseCallback[SchemaWebAppsListResponse]): Unit = js.native
  def list(
    params: ParamsResourceWebappsList,
    options: BodyResponseCallback[Readable | SchemaWebAppsListResponse],
    callback: BodyResponseCallback[Readable | SchemaWebAppsListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceWebappsList, options: MethodOptions): GaxiosPromise[SchemaWebAppsListResponse] = js.native
  def list(
    params: ParamsResourceWebappsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaWebAppsListResponse]
  ): Unit = js.native
  /**
    * Retrieves the details of all web apps for a given enterprise.
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
    *   const res = await androidenterprise.webapps.list({
    *     // The ID of the enterprise.
    *     enterpriseId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "webApp": []
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
  def list(params: ParamsResourceWebappsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceWebappsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaWebApp] = js.native
  def update(callback: BodyResponseCallback[SchemaWebApp]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaWebApp] = js.native
  def update(params: ParamsResourceWebappsUpdate): GaxiosPromise[SchemaWebApp] = js.native
  def update(params: ParamsResourceWebappsUpdate, callback: BodyResponseCallback[SchemaWebApp]): Unit = js.native
  def update(
    params: ParamsResourceWebappsUpdate,
    options: BodyResponseCallback[Readable | SchemaWebApp],
    callback: BodyResponseCallback[Readable | SchemaWebApp]
  ): Unit = js.native
  def update(params: ParamsResourceWebappsUpdate, options: MethodOptions): GaxiosPromise[SchemaWebApp] = js.native
  def update(
    params: ParamsResourceWebappsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaWebApp]
  ): Unit = js.native
  /**
    * Updates an existing web app.
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
    *   const res = await androidenterprise.webapps.update({
    *     // The ID of the enterprise.
    *     enterpriseId: 'placeholder-value',
    *     // The ID of the web app.
    *     webAppId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "displayMode": "my_displayMode",
    *       //   "icons": [],
    *       //   "isPublished": false,
    *       //   "startUrl": "my_startUrl",
    *       //   "title": "my_title",
    *       //   "versionCode": "my_versionCode",
    *       //   "webAppId": "my_webAppId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "displayMode": "my_displayMode",
    *   //   "icons": [],
    *   //   "isPublished": false,
    *   //   "startUrl": "my_startUrl",
    *   //   "title": "my_title",
    *   //   "versionCode": "my_versionCode",
    *   //   "webAppId": "my_webAppId"
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
  def update(params: ParamsResourceWebappsUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceWebappsUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
