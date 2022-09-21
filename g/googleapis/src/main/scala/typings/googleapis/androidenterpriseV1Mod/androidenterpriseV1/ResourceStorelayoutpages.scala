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

@JSImport("googleapis/build/src/apis/androidenterprise/v1", "androidenterprise_v1.Resource$Storelayoutpages")
@js.native
open class ResourceStorelayoutpages protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceStorelayoutpagesDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceStorelayoutpagesDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceStorelayoutpagesDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceStorelayoutpagesDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsResourceStorelayoutpagesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * Deletes a store page.
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
    *   const res = await androidenterprise.storelayoutpages.delete({
    *     // The ID of the enterprise.
    *     enterpriseId: 'placeholder-value',
    *     // The ID of the page.
    *     pageId: 'placeholder-value',
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
  def delete(params: ParamsResourceStorelayoutpagesDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceStorelayoutpagesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaStorePage] = js.native
  def get(callback: BodyResponseCallback[SchemaStorePage]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaStorePage] = js.native
  def get(params: ParamsResourceStorelayoutpagesGet): GaxiosPromise[SchemaStorePage] = js.native
  def get(params: ParamsResourceStorelayoutpagesGet, callback: BodyResponseCallback[SchemaStorePage]): Unit = js.native
  def get(
    params: ParamsResourceStorelayoutpagesGet,
    options: BodyResponseCallback[Readable | SchemaStorePage],
    callback: BodyResponseCallback[Readable | SchemaStorePage]
  ): Unit = js.native
  def get(params: ParamsResourceStorelayoutpagesGet, options: MethodOptions): GaxiosPromise[SchemaStorePage] = js.native
  def get(
    params: ParamsResourceStorelayoutpagesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaStorePage]
  ): Unit = js.native
  /**
    * Retrieves details of a store page.
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
    *   const res = await androidenterprise.storelayoutpages.get({
    *     // The ID of the enterprise.
    *     enterpriseId: 'placeholder-value',
    *     // The ID of the page.
    *     pageId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "id": "my_id",
    *   //   "link": [],
    *   //   "name": []
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
  def get(params: ParamsResourceStorelayoutpagesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceStorelayoutpagesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaStorePage] = js.native
  def insert(callback: BodyResponseCallback[SchemaStorePage]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaStorePage] = js.native
  def insert(params: ParamsResourceStorelayoutpagesInsert): GaxiosPromise[SchemaStorePage] = js.native
  def insert(params: ParamsResourceStorelayoutpagesInsert, callback: BodyResponseCallback[SchemaStorePage]): Unit = js.native
  def insert(
    params: ParamsResourceStorelayoutpagesInsert,
    options: BodyResponseCallback[Readable | SchemaStorePage],
    callback: BodyResponseCallback[Readable | SchemaStorePage]
  ): Unit = js.native
  def insert(params: ParamsResourceStorelayoutpagesInsert, options: MethodOptions): GaxiosPromise[SchemaStorePage] = js.native
  def insert(
    params: ParamsResourceStorelayoutpagesInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaStorePage]
  ): Unit = js.native
  /**
    * Inserts a new store page.
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
    *   const res = await androidenterprise.storelayoutpages.insert({
    *     // The ID of the enterprise.
    *     enterpriseId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "id": "my_id",
    *       //   "link": [],
    *       //   "name": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "id": "my_id",
    *   //   "link": [],
    *   //   "name": []
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
  def insert(params: ParamsResourceStorelayoutpagesInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceStorelayoutpagesInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaStoreLayoutPagesListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaStoreLayoutPagesListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaStoreLayoutPagesListResponse] = js.native
  def list(params: ParamsResourceStorelayoutpagesList): GaxiosPromise[SchemaStoreLayoutPagesListResponse] = js.native
  def list(
    params: ParamsResourceStorelayoutpagesList,
    callback: BodyResponseCallback[SchemaStoreLayoutPagesListResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceStorelayoutpagesList,
    options: BodyResponseCallback[Readable | SchemaStoreLayoutPagesListResponse],
    callback: BodyResponseCallback[Readable | SchemaStoreLayoutPagesListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceStorelayoutpagesList, options: MethodOptions): GaxiosPromise[SchemaStoreLayoutPagesListResponse] = js.native
  def list(
    params: ParamsResourceStorelayoutpagesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaStoreLayoutPagesListResponse]
  ): Unit = js.native
  /**
    * Retrieves the details of all pages in the store.
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
    *   const res = await androidenterprise.storelayoutpages.list({
    *     // The ID of the enterprise.
    *     enterpriseId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "page": []
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
  def list(params: ParamsResourceStorelayoutpagesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceStorelayoutpagesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaStorePage] = js.native
  def update(callback: BodyResponseCallback[SchemaStorePage]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaStorePage] = js.native
  def update(params: ParamsResourceStorelayoutpagesUpdate): GaxiosPromise[SchemaStorePage] = js.native
  def update(params: ParamsResourceStorelayoutpagesUpdate, callback: BodyResponseCallback[SchemaStorePage]): Unit = js.native
  def update(
    params: ParamsResourceStorelayoutpagesUpdate,
    options: BodyResponseCallback[Readable | SchemaStorePage],
    callback: BodyResponseCallback[Readable | SchemaStorePage]
  ): Unit = js.native
  def update(params: ParamsResourceStorelayoutpagesUpdate, options: MethodOptions): GaxiosPromise[SchemaStorePage] = js.native
  def update(
    params: ParamsResourceStorelayoutpagesUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaStorePage]
  ): Unit = js.native
  /**
    * Updates the content of a store page.
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
    *   const res = await androidenterprise.storelayoutpages.update({
    *     // The ID of the enterprise.
    *     enterpriseId: 'placeholder-value',
    *     // The ID of the page.
    *     pageId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "id": "my_id",
    *       //   "link": [],
    *       //   "name": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "id": "my_id",
    *   //   "link": [],
    *   //   "name": []
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
  def update(params: ParamsResourceStorelayoutpagesUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceStorelayoutpagesUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
