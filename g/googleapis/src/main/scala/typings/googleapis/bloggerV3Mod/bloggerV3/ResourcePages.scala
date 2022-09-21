package typings.googleapis.bloggerV3Mod.bloggerV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/blogger/v3", "blogger_v3.Resource$Pages")
@js.native
open class ResourcePages protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourcePagesDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourcePagesDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourcePagesDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourcePagesDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourcePagesDelete, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
  /**
    * Deletes a page by blog id and page id.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/blogger.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const blogger = google.blogger('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/blogger'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await blogger.pages.delete({
    *     blogId: 'placeholder-value',
    *
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
  def delete(params: ParamsResourcePagesDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourcePagesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaPage] = js.native
  def get(callback: BodyResponseCallback[SchemaPage]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPage] = js.native
  def get(params: ParamsResourcePagesGet): GaxiosPromise[SchemaPage] = js.native
  def get(params: ParamsResourcePagesGet, callback: BodyResponseCallback[SchemaPage]): Unit = js.native
  def get(
    params: ParamsResourcePagesGet,
    options: BodyResponseCallback[Readable | SchemaPage],
    callback: BodyResponseCallback[Readable | SchemaPage]
  ): Unit = js.native
  def get(params: ParamsResourcePagesGet, options: MethodOptions): GaxiosPromise[SchemaPage] = js.native
  def get(params: ParamsResourcePagesGet, options: MethodOptions, callback: BodyResponseCallback[SchemaPage]): Unit = js.native
  /**
    * Gets a page by blog id and page id.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/blogger.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const blogger = google.blogger('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/blogger',
    *       'https://www.googleapis.com/auth/blogger.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await blogger.pages.get({
    *     blogId: 'placeholder-value',
    *
    *     pageId: 'placeholder-value',
    *
    *     view: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "author": {},
    *   //   "blog": {},
    *   //   "content": "my_content",
    *   //   "etag": "my_etag",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "published": "my_published",
    *   //   "selfLink": "my_selfLink",
    *   //   "status": "my_status",
    *   //   "title": "my_title",
    *   //   "trashed": "my_trashed",
    *   //   "updated": "my_updated",
    *   //   "url": "my_url"
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
  def get(params: ParamsResourcePagesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourcePagesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaPage] = js.native
  def insert(callback: BodyResponseCallback[SchemaPage]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPage] = js.native
  def insert(params: ParamsResourcePagesInsert): GaxiosPromise[SchemaPage] = js.native
  def insert(params: ParamsResourcePagesInsert, callback: BodyResponseCallback[SchemaPage]): Unit = js.native
  def insert(
    params: ParamsResourcePagesInsert,
    options: BodyResponseCallback[Readable | SchemaPage],
    callback: BodyResponseCallback[Readable | SchemaPage]
  ): Unit = js.native
  def insert(params: ParamsResourcePagesInsert, options: MethodOptions): GaxiosPromise[SchemaPage] = js.native
  def insert(
    params: ParamsResourcePagesInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPage]
  ): Unit = js.native
  /**
    * Inserts a page.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/blogger.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const blogger = google.blogger('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/blogger'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await blogger.pages.insert({
    *     blogId: 'placeholder-value',
    *
    *     isDraft: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "author": {},
    *       //   "blog": {},
    *       //   "content": "my_content",
    *       //   "etag": "my_etag",
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "published": "my_published",
    *       //   "selfLink": "my_selfLink",
    *       //   "status": "my_status",
    *       //   "title": "my_title",
    *       //   "trashed": "my_trashed",
    *       //   "updated": "my_updated",
    *       //   "url": "my_url"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "author": {},
    *   //   "blog": {},
    *   //   "content": "my_content",
    *   //   "etag": "my_etag",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "published": "my_published",
    *   //   "selfLink": "my_selfLink",
    *   //   "status": "my_status",
    *   //   "title": "my_title",
    *   //   "trashed": "my_trashed",
    *   //   "updated": "my_updated",
    *   //   "url": "my_url"
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
  def insert(params: ParamsResourcePagesInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourcePagesInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaPageList] = js.native
  def list(callback: BodyResponseCallback[SchemaPageList]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPageList] = js.native
  def list(params: ParamsResourcePagesList): GaxiosPromise[SchemaPageList] = js.native
  def list(params: ParamsResourcePagesList, callback: BodyResponseCallback[SchemaPageList]): Unit = js.native
  def list(
    params: ParamsResourcePagesList,
    options: BodyResponseCallback[Readable | SchemaPageList],
    callback: BodyResponseCallback[Readable | SchemaPageList]
  ): Unit = js.native
  def list(params: ParamsResourcePagesList, options: MethodOptions): GaxiosPromise[SchemaPageList] = js.native
  def list(
    params: ParamsResourcePagesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPageList]
  ): Unit = js.native
  /**
    * Lists pages.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/blogger.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const blogger = google.blogger('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/blogger',
    *       'https://www.googleapis.com/auth/blogger.readonly',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await blogger.pages.list({
    *     blogId: 'placeholder-value',
    *
    *     fetchBodies: 'placeholder-value',
    *
    *     maxResults: 'placeholder-value',
    *
    *     pageToken: 'placeholder-value',
    *
    *     status: 'placeholder-value',
    *
    *     view: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "etag": "my_etag",
    *   //   "items": [],
    *   //   "kind": "my_kind",
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
  def list(params: ParamsResourcePagesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourcePagesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaPage] = js.native
  def patch(callback: BodyResponseCallback[SchemaPage]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPage] = js.native
  def patch(params: ParamsResourcePagesPatch): GaxiosPromise[SchemaPage] = js.native
  def patch(params: ParamsResourcePagesPatch, callback: BodyResponseCallback[SchemaPage]): Unit = js.native
  def patch(
    params: ParamsResourcePagesPatch,
    options: BodyResponseCallback[Readable | SchemaPage],
    callback: BodyResponseCallback[Readable | SchemaPage]
  ): Unit = js.native
  def patch(params: ParamsResourcePagesPatch, options: MethodOptions): GaxiosPromise[SchemaPage] = js.native
  def patch(
    params: ParamsResourcePagesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPage]
  ): Unit = js.native
  /**
    * Patches a page.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/blogger.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const blogger = google.blogger('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/blogger'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await blogger.pages.patch({
    *     blogId: 'placeholder-value',
    *
    *     pageId: 'placeholder-value',
    *
    *     publish: 'placeholder-value',
    *
    *     revert: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "author": {},
    *       //   "blog": {},
    *       //   "content": "my_content",
    *       //   "etag": "my_etag",
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "published": "my_published",
    *       //   "selfLink": "my_selfLink",
    *       //   "status": "my_status",
    *       //   "title": "my_title",
    *       //   "trashed": "my_trashed",
    *       //   "updated": "my_updated",
    *       //   "url": "my_url"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "author": {},
    *   //   "blog": {},
    *   //   "content": "my_content",
    *   //   "etag": "my_etag",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "published": "my_published",
    *   //   "selfLink": "my_selfLink",
    *   //   "status": "my_status",
    *   //   "title": "my_title",
    *   //   "trashed": "my_trashed",
    *   //   "updated": "my_updated",
    *   //   "url": "my_url"
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
  def patch(params: ParamsResourcePagesPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourcePagesPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def publish(): GaxiosPromise[SchemaPage] = js.native
  def publish(callback: BodyResponseCallback[SchemaPage]): Unit = js.native
  def publish(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPage] = js.native
  def publish(params: ParamsResourcePagesPublish): GaxiosPromise[SchemaPage] = js.native
  def publish(params: ParamsResourcePagesPublish, callback: BodyResponseCallback[SchemaPage]): Unit = js.native
  def publish(
    params: ParamsResourcePagesPublish,
    options: BodyResponseCallback[Readable | SchemaPage],
    callback: BodyResponseCallback[Readable | SchemaPage]
  ): Unit = js.native
  def publish(params: ParamsResourcePagesPublish, options: MethodOptions): GaxiosPromise[SchemaPage] = js.native
  def publish(
    params: ParamsResourcePagesPublish,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPage]
  ): Unit = js.native
  /**
    * Publishes a page.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/blogger.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const blogger = google.blogger('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/blogger'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await blogger.pages.publish({
    *     blogId: 'placeholder-value',
    *
    *     pageId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "author": {},
    *   //   "blog": {},
    *   //   "content": "my_content",
    *   //   "etag": "my_etag",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "published": "my_published",
    *   //   "selfLink": "my_selfLink",
    *   //   "status": "my_status",
    *   //   "title": "my_title",
    *   //   "trashed": "my_trashed",
    *   //   "updated": "my_updated",
    *   //   "url": "my_url"
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
  def publish(params: ParamsResourcePagesPublish, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def publish(
    params: ParamsResourcePagesPublish,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def revert(): GaxiosPromise[SchemaPage] = js.native
  def revert(callback: BodyResponseCallback[SchemaPage]): Unit = js.native
  def revert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPage] = js.native
  def revert(params: ParamsResourcePagesRevert): GaxiosPromise[SchemaPage] = js.native
  def revert(params: ParamsResourcePagesRevert, callback: BodyResponseCallback[SchemaPage]): Unit = js.native
  def revert(
    params: ParamsResourcePagesRevert,
    options: BodyResponseCallback[Readable | SchemaPage],
    callback: BodyResponseCallback[Readable | SchemaPage]
  ): Unit = js.native
  def revert(params: ParamsResourcePagesRevert, options: MethodOptions): GaxiosPromise[SchemaPage] = js.native
  def revert(
    params: ParamsResourcePagesRevert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPage]
  ): Unit = js.native
  /**
    * Reverts a published or scheduled page to draft state.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/blogger.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const blogger = google.blogger('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/blogger'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await blogger.pages.revert({
    *     blogId: 'placeholder-value',
    *
    *     pageId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "author": {},
    *   //   "blog": {},
    *   //   "content": "my_content",
    *   //   "etag": "my_etag",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "published": "my_published",
    *   //   "selfLink": "my_selfLink",
    *   //   "status": "my_status",
    *   //   "title": "my_title",
    *   //   "trashed": "my_trashed",
    *   //   "updated": "my_updated",
    *   //   "url": "my_url"
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
  def revert(params: ParamsResourcePagesRevert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def revert(
    params: ParamsResourcePagesRevert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaPage] = js.native
  def update(callback: BodyResponseCallback[SchemaPage]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPage] = js.native
  def update(params: ParamsResourcePagesUpdate): GaxiosPromise[SchemaPage] = js.native
  def update(params: ParamsResourcePagesUpdate, callback: BodyResponseCallback[SchemaPage]): Unit = js.native
  def update(
    params: ParamsResourcePagesUpdate,
    options: BodyResponseCallback[Readable | SchemaPage],
    callback: BodyResponseCallback[Readable | SchemaPage]
  ): Unit = js.native
  def update(params: ParamsResourcePagesUpdate, options: MethodOptions): GaxiosPromise[SchemaPage] = js.native
  def update(
    params: ParamsResourcePagesUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPage]
  ): Unit = js.native
  /**
    * Updates a page by blog id and page id.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/blogger.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const blogger = google.blogger('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/blogger'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await blogger.pages.update({
    *     blogId: 'placeholder-value',
    *
    *     pageId: 'placeholder-value',
    *
    *     publish: 'placeholder-value',
    *
    *     revert: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "author": {},
    *       //   "blog": {},
    *       //   "content": "my_content",
    *       //   "etag": "my_etag",
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "published": "my_published",
    *       //   "selfLink": "my_selfLink",
    *       //   "status": "my_status",
    *       //   "title": "my_title",
    *       //   "trashed": "my_trashed",
    *       //   "updated": "my_updated",
    *       //   "url": "my_url"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "author": {},
    *   //   "blog": {},
    *   //   "content": "my_content",
    *   //   "etag": "my_etag",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "published": "my_published",
    *   //   "selfLink": "my_selfLink",
    *   //   "status": "my_status",
    *   //   "title": "my_title",
    *   //   "trashed": "my_trashed",
    *   //   "updated": "my_updated",
    *   //   "url": "my_url"
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
  def update(params: ParamsResourcePagesUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourcePagesUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
