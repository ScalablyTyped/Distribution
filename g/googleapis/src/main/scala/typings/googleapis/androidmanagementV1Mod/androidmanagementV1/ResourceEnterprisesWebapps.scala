package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/androidmanagement/v1", "androidmanagement_v1.Resource$Enterprises$Webapps")
@js.native
open class ResourceEnterprisesWebapps protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaWebApp] = js.native
  def create(callback: BodyResponseCallback[SchemaWebApp]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaWebApp] = js.native
  def create(params: ParamsResourceEnterprisesWebappsCreate): GaxiosPromise[SchemaWebApp] = js.native
  def create(params: ParamsResourceEnterprisesWebappsCreate, callback: BodyResponseCallback[SchemaWebApp]): Unit = js.native
  def create(
    params: ParamsResourceEnterprisesWebappsCreate,
    options: BodyResponseCallback[Readable | SchemaWebApp],
    callback: BodyResponseCallback[Readable | SchemaWebApp]
  ): Unit = js.native
  def create(params: ParamsResourceEnterprisesWebappsCreate, options: MethodOptions): GaxiosPromise[SchemaWebApp] = js.native
  def create(
    params: ParamsResourceEnterprisesWebappsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaWebApp]
  ): Unit = js.native
  /**
    * Creates a web app.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/androidmanagement.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const androidmanagement = google.androidmanagement('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/androidmanagement'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await androidmanagement.enterprises.webApps.create({
    *     // The name of the enterprise in the form enterprises/{enterpriseId\}.
    *     parent: 'enterprises/my-enterprise',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "displayMode": "my_displayMode",
    *       //   "icons": [],
    *       //   "name": "my_name",
    *       //   "startUrl": "my_startUrl",
    *       //   "title": "my_title",
    *       //   "versionCode": "my_versionCode"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "displayMode": "my_displayMode",
    *   //   "icons": [],
    *   //   "name": "my_name",
    *   //   "startUrl": "my_startUrl",
    *   //   "title": "my_title",
    *   //   "versionCode": "my_versionCode"
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
  def create(params: ParamsResourceEnterprisesWebappsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceEnterprisesWebappsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceEnterprisesWebappsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceEnterprisesWebappsDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceEnterprisesWebappsDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceEnterprisesWebappsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceEnterprisesWebappsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes a web app.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/androidmanagement.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const androidmanagement = google.androidmanagement('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/androidmanagement'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await androidmanagement.enterprises.webApps.delete({
    *     // The name of the web app in the form enterprises/{enterpriseId\}/webApps/{packageName\}.
    *     name: 'enterprises/my-enterprise/webApps/my-webApp',
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
  def delete(params: ParamsResourceEnterprisesWebappsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceEnterprisesWebappsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaWebApp] = js.native
  def get(callback: BodyResponseCallback[SchemaWebApp]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaWebApp] = js.native
  def get(params: ParamsResourceEnterprisesWebappsGet): GaxiosPromise[SchemaWebApp] = js.native
  def get(params: ParamsResourceEnterprisesWebappsGet, callback: BodyResponseCallback[SchemaWebApp]): Unit = js.native
  def get(
    params: ParamsResourceEnterprisesWebappsGet,
    options: BodyResponseCallback[Readable | SchemaWebApp],
    callback: BodyResponseCallback[Readable | SchemaWebApp]
  ): Unit = js.native
  def get(params: ParamsResourceEnterprisesWebappsGet, options: MethodOptions): GaxiosPromise[SchemaWebApp] = js.native
  def get(
    params: ParamsResourceEnterprisesWebappsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaWebApp]
  ): Unit = js.native
  /**
    * Gets a web app.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/androidmanagement.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const androidmanagement = google.androidmanagement('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/androidmanagement'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await androidmanagement.enterprises.webApps.get({
    *     // The name of the web app in the form enterprises/{enterpriseId\}/webApp/{packageName\}.
    *     name: 'enterprises/my-enterprise/webApps/my-webApp',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "displayMode": "my_displayMode",
    *   //   "icons": [],
    *   //   "name": "my_name",
    *   //   "startUrl": "my_startUrl",
    *   //   "title": "my_title",
    *   //   "versionCode": "my_versionCode"
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
  def get(params: ParamsResourceEnterprisesWebappsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceEnterprisesWebappsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListWebAppsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListWebAppsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListWebAppsResponse] = js.native
  def list(params: ParamsResourceEnterprisesWebappsList): GaxiosPromise[SchemaListWebAppsResponse] = js.native
  def list(
    params: ParamsResourceEnterprisesWebappsList,
    callback: BodyResponseCallback[SchemaListWebAppsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceEnterprisesWebappsList,
    options: BodyResponseCallback[Readable | SchemaListWebAppsResponse],
    callback: BodyResponseCallback[Readable | SchemaListWebAppsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceEnterprisesWebappsList, options: MethodOptions): GaxiosPromise[SchemaListWebAppsResponse] = js.native
  def list(
    params: ParamsResourceEnterprisesWebappsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListWebAppsResponse]
  ): Unit = js.native
  /**
    * Lists web apps for a given enterprise.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/androidmanagement.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const androidmanagement = google.androidmanagement('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/androidmanagement'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await androidmanagement.enterprises.webApps.list({
    *     // The requested page size. This is a hint and the actual page size in the response may be different.
    *     pageSize: 'placeholder-value',
    *     // A token identifying a page of results returned by the server.
    *     pageToken: 'placeholder-value',
    *     // The name of the enterprise in the form enterprises/{enterpriseId\}.
    *     parent: 'enterprises/my-enterprise',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "webApps": []
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
  def list(params: ParamsResourceEnterprisesWebappsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceEnterprisesWebappsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaWebApp] = js.native
  def patch(callback: BodyResponseCallback[SchemaWebApp]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaWebApp] = js.native
  def patch(params: ParamsResourceEnterprisesWebappsPatch): GaxiosPromise[SchemaWebApp] = js.native
  def patch(params: ParamsResourceEnterprisesWebappsPatch, callback: BodyResponseCallback[SchemaWebApp]): Unit = js.native
  def patch(
    params: ParamsResourceEnterprisesWebappsPatch,
    options: BodyResponseCallback[Readable | SchemaWebApp],
    callback: BodyResponseCallback[Readable | SchemaWebApp]
  ): Unit = js.native
  def patch(params: ParamsResourceEnterprisesWebappsPatch, options: MethodOptions): GaxiosPromise[SchemaWebApp] = js.native
  def patch(
    params: ParamsResourceEnterprisesWebappsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaWebApp]
  ): Unit = js.native
  /**
    * Updates a web app.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/androidmanagement.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const androidmanagement = google.androidmanagement('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/androidmanagement'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await androidmanagement.enterprises.webApps.patch({
    *     // The name of the web app in the form enterprises/{enterpriseId\}/webApps/{packageName\}.
    *     name: 'enterprises/my-enterprise/webApps/my-webApp',
    *     // The field mask indicating the fields to update. If not set, all modifiable fields will be modified.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "displayMode": "my_displayMode",
    *       //   "icons": [],
    *       //   "name": "my_name",
    *       //   "startUrl": "my_startUrl",
    *       //   "title": "my_title",
    *       //   "versionCode": "my_versionCode"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "displayMode": "my_displayMode",
    *   //   "icons": [],
    *   //   "name": "my_name",
    *   //   "startUrl": "my_startUrl",
    *   //   "title": "my_title",
    *   //   "versionCode": "my_versionCode"
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
  def patch(params: ParamsResourceEnterprisesWebappsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceEnterprisesWebappsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
