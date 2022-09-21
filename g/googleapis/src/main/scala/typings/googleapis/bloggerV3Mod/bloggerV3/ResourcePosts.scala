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

@JSImport("googleapis/build/src/apis/blogger/v3", "blogger_v3.Resource$Posts")
@js.native
open class ResourcePosts protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourcePostsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourcePostsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourcePostsDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourcePostsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourcePostsDelete, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
  /**
    * Deletes a post by blog id and post id.
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
    *   const res = await blogger.posts.delete({
    *     blogId: 'placeholder-value',
    *
    *     postId: 'placeholder-value',
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
  def delete(params: ParamsResourcePostsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourcePostsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaPost] = js.native
  def get(callback: BodyResponseCallback[SchemaPost]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPost] = js.native
  def get(params: ParamsResourcePostsGet): GaxiosPromise[SchemaPost] = js.native
  def get(params: ParamsResourcePostsGet, callback: BodyResponseCallback[SchemaPost]): Unit = js.native
  def get(
    params: ParamsResourcePostsGet,
    options: BodyResponseCallback[Readable | SchemaPost],
    callback: BodyResponseCallback[Readable | SchemaPost]
  ): Unit = js.native
  def get(params: ParamsResourcePostsGet, options: MethodOptions): GaxiosPromise[SchemaPost] = js.native
  def get(params: ParamsResourcePostsGet, options: MethodOptions, callback: BodyResponseCallback[SchemaPost]): Unit = js.native
  /**
    * Gets a post by blog id and post id
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
    *   const res = await blogger.posts.get({
    *     blogId: 'placeholder-value',
    *
    *     fetchBody: 'placeholder-value',
    *
    *     fetchImages: 'placeholder-value',
    *
    *     maxComments: 'placeholder-value',
    *
    *     postId: 'placeholder-value',
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
    *   //   "customMetaData": "my_customMetaData",
    *   //   "etag": "my_etag",
    *   //   "id": "my_id",
    *   //   "images": [],
    *   //   "kind": "my_kind",
    *   //   "labels": [],
    *   //   "location": {},
    *   //   "published": "my_published",
    *   //   "readerComments": "my_readerComments",
    *   //   "replies": {},
    *   //   "selfLink": "my_selfLink",
    *   //   "status": "my_status",
    *   //   "title": "my_title",
    *   //   "titleLink": "my_titleLink",
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
  def get(params: ParamsResourcePostsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourcePostsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getByPath(): GaxiosPromise[SchemaPost] = js.native
  def getByPath(callback: BodyResponseCallback[SchemaPost]): Unit = js.native
  def getByPath(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPost] = js.native
  def getByPath(params: ParamsResourcePostsGetbypath): GaxiosPromise[SchemaPost] = js.native
  def getByPath(params: ParamsResourcePostsGetbypath, callback: BodyResponseCallback[SchemaPost]): Unit = js.native
  def getByPath(
    params: ParamsResourcePostsGetbypath,
    options: BodyResponseCallback[Readable | SchemaPost],
    callback: BodyResponseCallback[Readable | SchemaPost]
  ): Unit = js.native
  def getByPath(params: ParamsResourcePostsGetbypath, options: MethodOptions): GaxiosPromise[SchemaPost] = js.native
  def getByPath(
    params: ParamsResourcePostsGetbypath,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPost]
  ): Unit = js.native
  /**
    * Gets a post by path.
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
    *   const res = await blogger.posts.getByPath({
    *     blogId: 'placeholder-value',
    *
    *     maxComments: 'placeholder-value',
    *
    *     path: 'placeholder-value',
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
    *   //   "customMetaData": "my_customMetaData",
    *   //   "etag": "my_etag",
    *   //   "id": "my_id",
    *   //   "images": [],
    *   //   "kind": "my_kind",
    *   //   "labels": [],
    *   //   "location": {},
    *   //   "published": "my_published",
    *   //   "readerComments": "my_readerComments",
    *   //   "replies": {},
    *   //   "selfLink": "my_selfLink",
    *   //   "status": "my_status",
    *   //   "title": "my_title",
    *   //   "titleLink": "my_titleLink",
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
  def getByPath(params: ParamsResourcePostsGetbypath, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getByPath(
    params: ParamsResourcePostsGetbypath,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaPost] = js.native
  def insert(callback: BodyResponseCallback[SchemaPost]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPost] = js.native
  def insert(params: ParamsResourcePostsInsert): GaxiosPromise[SchemaPost] = js.native
  def insert(params: ParamsResourcePostsInsert, callback: BodyResponseCallback[SchemaPost]): Unit = js.native
  def insert(
    params: ParamsResourcePostsInsert,
    options: BodyResponseCallback[Readable | SchemaPost],
    callback: BodyResponseCallback[Readable | SchemaPost]
  ): Unit = js.native
  def insert(params: ParamsResourcePostsInsert, options: MethodOptions): GaxiosPromise[SchemaPost] = js.native
  def insert(
    params: ParamsResourcePostsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPost]
  ): Unit = js.native
  /**
    * Inserts a post.
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
    *   const res = await blogger.posts.insert({
    *     blogId: 'placeholder-value',
    *
    *     fetchBody: 'placeholder-value',
    *
    *     fetchImages: 'placeholder-value',
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
    *       //   "customMetaData": "my_customMetaData",
    *       //   "etag": "my_etag",
    *       //   "id": "my_id",
    *       //   "images": [],
    *       //   "kind": "my_kind",
    *       //   "labels": [],
    *       //   "location": {},
    *       //   "published": "my_published",
    *       //   "readerComments": "my_readerComments",
    *       //   "replies": {},
    *       //   "selfLink": "my_selfLink",
    *       //   "status": "my_status",
    *       //   "title": "my_title",
    *       //   "titleLink": "my_titleLink",
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
    *   //   "customMetaData": "my_customMetaData",
    *   //   "etag": "my_etag",
    *   //   "id": "my_id",
    *   //   "images": [],
    *   //   "kind": "my_kind",
    *   //   "labels": [],
    *   //   "location": {},
    *   //   "published": "my_published",
    *   //   "readerComments": "my_readerComments",
    *   //   "replies": {},
    *   //   "selfLink": "my_selfLink",
    *   //   "status": "my_status",
    *   //   "title": "my_title",
    *   //   "titleLink": "my_titleLink",
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
  def insert(params: ParamsResourcePostsInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourcePostsInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaPostList] = js.native
  def list(callback: BodyResponseCallback[SchemaPostList]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPostList] = js.native
  def list(params: ParamsResourcePostsList): GaxiosPromise[SchemaPostList] = js.native
  def list(params: ParamsResourcePostsList, callback: BodyResponseCallback[SchemaPostList]): Unit = js.native
  def list(
    params: ParamsResourcePostsList,
    options: BodyResponseCallback[Readable | SchemaPostList],
    callback: BodyResponseCallback[Readable | SchemaPostList]
  ): Unit = js.native
  def list(params: ParamsResourcePostsList, options: MethodOptions): GaxiosPromise[SchemaPostList] = js.native
  def list(
    params: ParamsResourcePostsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPostList]
  ): Unit = js.native
  /**
    * Lists posts.
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
    *   const res = await blogger.posts.list({
    *     blogId: 'placeholder-value',
    *
    *     endDate: 'placeholder-value',
    *
    *     fetchBodies: 'placeholder-value',
    *
    *     fetchImages: 'placeholder-value',
    *
    *     labels: 'placeholder-value',
    *
    *     maxResults: 'placeholder-value',
    *
    *     orderBy: 'placeholder-value',
    *
    *     pageToken: 'placeholder-value',
    *
    *     startDate: 'placeholder-value',
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
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "prevPageToken": "my_prevPageToken"
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
  def list(params: ParamsResourcePostsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourcePostsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaPost] = js.native
  def patch(callback: BodyResponseCallback[SchemaPost]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPost] = js.native
  def patch(params: ParamsResourcePostsPatch): GaxiosPromise[SchemaPost] = js.native
  def patch(params: ParamsResourcePostsPatch, callback: BodyResponseCallback[SchemaPost]): Unit = js.native
  def patch(
    params: ParamsResourcePostsPatch,
    options: BodyResponseCallback[Readable | SchemaPost],
    callback: BodyResponseCallback[Readable | SchemaPost]
  ): Unit = js.native
  def patch(params: ParamsResourcePostsPatch, options: MethodOptions): GaxiosPromise[SchemaPost] = js.native
  def patch(
    params: ParamsResourcePostsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPost]
  ): Unit = js.native
  /**
    * Patches a post.
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
    *   const res = await blogger.posts.patch({
    *     blogId: 'placeholder-value',
    *
    *     fetchBody: 'placeholder-value',
    *
    *     fetchImages: 'placeholder-value',
    *
    *     maxComments: 'placeholder-value',
    *
    *     postId: 'placeholder-value',
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
    *       //   "customMetaData": "my_customMetaData",
    *       //   "etag": "my_etag",
    *       //   "id": "my_id",
    *       //   "images": [],
    *       //   "kind": "my_kind",
    *       //   "labels": [],
    *       //   "location": {},
    *       //   "published": "my_published",
    *       //   "readerComments": "my_readerComments",
    *       //   "replies": {},
    *       //   "selfLink": "my_selfLink",
    *       //   "status": "my_status",
    *       //   "title": "my_title",
    *       //   "titleLink": "my_titleLink",
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
    *   //   "customMetaData": "my_customMetaData",
    *   //   "etag": "my_etag",
    *   //   "id": "my_id",
    *   //   "images": [],
    *   //   "kind": "my_kind",
    *   //   "labels": [],
    *   //   "location": {},
    *   //   "published": "my_published",
    *   //   "readerComments": "my_readerComments",
    *   //   "replies": {},
    *   //   "selfLink": "my_selfLink",
    *   //   "status": "my_status",
    *   //   "title": "my_title",
    *   //   "titleLink": "my_titleLink",
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
  def patch(params: ParamsResourcePostsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourcePostsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def publish(): GaxiosPromise[SchemaPost] = js.native
  def publish(callback: BodyResponseCallback[SchemaPost]): Unit = js.native
  def publish(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPost] = js.native
  def publish(params: ParamsResourcePostsPublish): GaxiosPromise[SchemaPost] = js.native
  def publish(params: ParamsResourcePostsPublish, callback: BodyResponseCallback[SchemaPost]): Unit = js.native
  def publish(
    params: ParamsResourcePostsPublish,
    options: BodyResponseCallback[Readable | SchemaPost],
    callback: BodyResponseCallback[Readable | SchemaPost]
  ): Unit = js.native
  def publish(params: ParamsResourcePostsPublish, options: MethodOptions): GaxiosPromise[SchemaPost] = js.native
  def publish(
    params: ParamsResourcePostsPublish,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPost]
  ): Unit = js.native
  /**
    * Publishes a post.
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
    *   const res = await blogger.posts.publish({
    *     blogId: 'placeholder-value',
    *
    *     postId: 'placeholder-value',
    *
    *     publishDate: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "author": {},
    *   //   "blog": {},
    *   //   "content": "my_content",
    *   //   "customMetaData": "my_customMetaData",
    *   //   "etag": "my_etag",
    *   //   "id": "my_id",
    *   //   "images": [],
    *   //   "kind": "my_kind",
    *   //   "labels": [],
    *   //   "location": {},
    *   //   "published": "my_published",
    *   //   "readerComments": "my_readerComments",
    *   //   "replies": {},
    *   //   "selfLink": "my_selfLink",
    *   //   "status": "my_status",
    *   //   "title": "my_title",
    *   //   "titleLink": "my_titleLink",
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
  def publish(params: ParamsResourcePostsPublish, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def publish(
    params: ParamsResourcePostsPublish,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def revert(): GaxiosPromise[SchemaPost] = js.native
  def revert(callback: BodyResponseCallback[SchemaPost]): Unit = js.native
  def revert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPost] = js.native
  def revert(params: ParamsResourcePostsRevert): GaxiosPromise[SchemaPost] = js.native
  def revert(params: ParamsResourcePostsRevert, callback: BodyResponseCallback[SchemaPost]): Unit = js.native
  def revert(
    params: ParamsResourcePostsRevert,
    options: BodyResponseCallback[Readable | SchemaPost],
    callback: BodyResponseCallback[Readable | SchemaPost]
  ): Unit = js.native
  def revert(params: ParamsResourcePostsRevert, options: MethodOptions): GaxiosPromise[SchemaPost] = js.native
  def revert(
    params: ParamsResourcePostsRevert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPost]
  ): Unit = js.native
  /**
    * Reverts a published or scheduled post to draft state.
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
    *   const res = await blogger.posts.revert({
    *     blogId: 'placeholder-value',
    *
    *     postId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "author": {},
    *   //   "blog": {},
    *   //   "content": "my_content",
    *   //   "customMetaData": "my_customMetaData",
    *   //   "etag": "my_etag",
    *   //   "id": "my_id",
    *   //   "images": [],
    *   //   "kind": "my_kind",
    *   //   "labels": [],
    *   //   "location": {},
    *   //   "published": "my_published",
    *   //   "readerComments": "my_readerComments",
    *   //   "replies": {},
    *   //   "selfLink": "my_selfLink",
    *   //   "status": "my_status",
    *   //   "title": "my_title",
    *   //   "titleLink": "my_titleLink",
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
  def revert(params: ParamsResourcePostsRevert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def revert(
    params: ParamsResourcePostsRevert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def search(): GaxiosPromise[SchemaPostList] = js.native
  def search(callback: BodyResponseCallback[SchemaPostList]): Unit = js.native
  def search(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPostList] = js.native
  def search(params: ParamsResourcePostsSearch): GaxiosPromise[SchemaPostList] = js.native
  def search(params: ParamsResourcePostsSearch, callback: BodyResponseCallback[SchemaPostList]): Unit = js.native
  def search(
    params: ParamsResourcePostsSearch,
    options: BodyResponseCallback[Readable | SchemaPostList],
    callback: BodyResponseCallback[Readable | SchemaPostList]
  ): Unit = js.native
  def search(params: ParamsResourcePostsSearch, options: MethodOptions): GaxiosPromise[SchemaPostList] = js.native
  def search(
    params: ParamsResourcePostsSearch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPostList]
  ): Unit = js.native
  /**
    * Searches for posts matching given query terms in the specified blog.
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
    *   const res = await blogger.posts.search({
    *     blogId: 'placeholder-value',
    *
    *     fetchBodies: 'placeholder-value',
    *
    *     orderBy: 'placeholder-value',
    *
    *     q: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "etag": "my_etag",
    *   //   "items": [],
    *   //   "kind": "my_kind",
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "prevPageToken": "my_prevPageToken"
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
  def search(params: ParamsResourcePostsSearch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def search(
    params: ParamsResourcePostsSearch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaPost] = js.native
  def update(callback: BodyResponseCallback[SchemaPost]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPost] = js.native
  def update(params: ParamsResourcePostsUpdate): GaxiosPromise[SchemaPost] = js.native
  def update(params: ParamsResourcePostsUpdate, callback: BodyResponseCallback[SchemaPost]): Unit = js.native
  def update(
    params: ParamsResourcePostsUpdate,
    options: BodyResponseCallback[Readable | SchemaPost],
    callback: BodyResponseCallback[Readable | SchemaPost]
  ): Unit = js.native
  def update(params: ParamsResourcePostsUpdate, options: MethodOptions): GaxiosPromise[SchemaPost] = js.native
  def update(
    params: ParamsResourcePostsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPost]
  ): Unit = js.native
  /**
    * Updates a post by blog id and post id.
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
    *   const res = await blogger.posts.update({
    *     blogId: 'placeholder-value',
    *
    *     fetchBody: 'placeholder-value',
    *
    *     fetchImages: 'placeholder-value',
    *
    *     maxComments: 'placeholder-value',
    *
    *     postId: 'placeholder-value',
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
    *       //   "customMetaData": "my_customMetaData",
    *       //   "etag": "my_etag",
    *       //   "id": "my_id",
    *       //   "images": [],
    *       //   "kind": "my_kind",
    *       //   "labels": [],
    *       //   "location": {},
    *       //   "published": "my_published",
    *       //   "readerComments": "my_readerComments",
    *       //   "replies": {},
    *       //   "selfLink": "my_selfLink",
    *       //   "status": "my_status",
    *       //   "title": "my_title",
    *       //   "titleLink": "my_titleLink",
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
    *   //   "customMetaData": "my_customMetaData",
    *   //   "etag": "my_etag",
    *   //   "id": "my_id",
    *   //   "images": [],
    *   //   "kind": "my_kind",
    *   //   "labels": [],
    *   //   "location": {},
    *   //   "published": "my_published",
    *   //   "readerComments": "my_readerComments",
    *   //   "replies": {},
    *   //   "selfLink": "my_selfLink",
    *   //   "status": "my_status",
    *   //   "title": "my_title",
    *   //   "titleLink": "my_titleLink",
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
  def update(params: ParamsResourcePostsUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourcePostsUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
