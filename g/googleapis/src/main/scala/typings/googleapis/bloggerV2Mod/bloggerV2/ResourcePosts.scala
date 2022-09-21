package typings.googleapis.bloggerV2Mod.bloggerV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/blogger/v2", "blogger_v2.Resource$Posts")
@js.native
open class ResourcePosts protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
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
    * const blogger = google.blogger('v2');
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
    *   const res = await blogger.posts.get({
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
  def get(params: ParamsResourcePostsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourcePostsGet,
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
    * const blogger = google.blogger('v2');
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
    *   const res = await blogger.posts.list({
    *     blogId: 'placeholder-value',
    *
    *     fetchBodies: 'placeholder-value',
    *
    *     maxResults: 'placeholder-value',
    *
    *     pageToken: 'placeholder-value',
    *
    *     startDate: 'placeholder-value',
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
}
