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

@JSImport("googleapis/build/src/apis/blogger/v3", "blogger_v3.Resource$Comments")
@js.native
open class ResourceComments protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def approve(): GaxiosPromise[SchemaComment] = js.native
  def approve(callback: BodyResponseCallback[SchemaComment]): Unit = js.native
  def approve(params: Unit, options: MethodOptions): GaxiosPromise[SchemaComment] = js.native
  def approve(params: ParamsResourceCommentsApprove): GaxiosPromise[SchemaComment] = js.native
  def approve(params: ParamsResourceCommentsApprove, callback: BodyResponseCallback[SchemaComment]): Unit = js.native
  def approve(
    params: ParamsResourceCommentsApprove,
    options: BodyResponseCallback[Readable | SchemaComment],
    callback: BodyResponseCallback[Readable | SchemaComment]
  ): Unit = js.native
  def approve(params: ParamsResourceCommentsApprove, options: MethodOptions): GaxiosPromise[SchemaComment] = js.native
  def approve(
    params: ParamsResourceCommentsApprove,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaComment]
  ): Unit = js.native
  /**
    * Marks a comment as not spam by blog id, post id and comment id.
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
    *   const res = await blogger.comments.approve({
    *     blogId: 'placeholder-value',
    *
    *     commentId: 'placeholder-value',
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
    *   //   "id": "my_id",
    *   //   "inReplyTo": {},
    *   //   "kind": "my_kind",
    *   //   "post": {},
    *   //   "published": "my_published",
    *   //   "selfLink": "my_selfLink",
    *   //   "status": "my_status",
    *   //   "updated": "my_updated"
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
  def approve(params: ParamsResourceCommentsApprove, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def approve(
    params: ParamsResourceCommentsApprove,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceCommentsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceCommentsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceCommentsDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceCommentsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceCommentsDelete, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
  /**
    * Deletes a comment by blog id, post id and comment id.
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
    *   const res = await blogger.comments.delete({
    *     blogId: 'placeholder-value',
    *
    *     commentId: 'placeholder-value',
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
  def delete(params: ParamsResourceCommentsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceCommentsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaComment] = js.native
  def get(callback: BodyResponseCallback[SchemaComment]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaComment] = js.native
  def get(params: ParamsResourceCommentsGet): GaxiosPromise[SchemaComment] = js.native
  def get(params: ParamsResourceCommentsGet, callback: BodyResponseCallback[SchemaComment]): Unit = js.native
  def get(
    params: ParamsResourceCommentsGet,
    options: BodyResponseCallback[Readable | SchemaComment],
    callback: BodyResponseCallback[Readable | SchemaComment]
  ): Unit = js.native
  def get(params: ParamsResourceCommentsGet, options: MethodOptions): GaxiosPromise[SchemaComment] = js.native
  def get(
    params: ParamsResourceCommentsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaComment]
  ): Unit = js.native
  /**
    * Gets a comment by id.
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
    *   const res = await blogger.comments.get({
    *     blogId: 'placeholder-value',
    *
    *     commentId: 'placeholder-value',
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
    *   //   "id": "my_id",
    *   //   "inReplyTo": {},
    *   //   "kind": "my_kind",
    *   //   "post": {},
    *   //   "published": "my_published",
    *   //   "selfLink": "my_selfLink",
    *   //   "status": "my_status",
    *   //   "updated": "my_updated"
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
  def get(params: ParamsResourceCommentsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceCommentsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaCommentList] = js.native
  def list(callback: BodyResponseCallback[SchemaCommentList]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCommentList] = js.native
  def list(params: ParamsResourceCommentsList): GaxiosPromise[SchemaCommentList] = js.native
  def list(params: ParamsResourceCommentsList, callback: BodyResponseCallback[SchemaCommentList]): Unit = js.native
  def list(
    params: ParamsResourceCommentsList,
    options: BodyResponseCallback[Readable | SchemaCommentList],
    callback: BodyResponseCallback[Readable | SchemaCommentList]
  ): Unit = js.native
  def list(params: ParamsResourceCommentsList, options: MethodOptions): GaxiosPromise[SchemaCommentList] = js.native
  def list(
    params: ParamsResourceCommentsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCommentList]
  ): Unit = js.native
  /**
    * Lists comments.
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
    *   const res = await blogger.comments.list({
    *     blogId: 'placeholder-value',
    *
    *     endDate: 'placeholder-value',
    *
    *     fetchBodies: 'placeholder-value',
    *
    *     maxResults: 'placeholder-value',
    *
    *     pageToken: 'placeholder-value',
    *
    *     postId: 'placeholder-value',
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
  def list(params: ParamsResourceCommentsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceCommentsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def listByBlog(): GaxiosPromise[SchemaCommentList] = js.native
  def listByBlog(callback: BodyResponseCallback[SchemaCommentList]): Unit = js.native
  def listByBlog(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCommentList] = js.native
  def listByBlog(params: ParamsResourceCommentsListbyblog): GaxiosPromise[SchemaCommentList] = js.native
  def listByBlog(params: ParamsResourceCommentsListbyblog, callback: BodyResponseCallback[SchemaCommentList]): Unit = js.native
  def listByBlog(
    params: ParamsResourceCommentsListbyblog,
    options: BodyResponseCallback[Readable | SchemaCommentList],
    callback: BodyResponseCallback[Readable | SchemaCommentList]
  ): Unit = js.native
  def listByBlog(params: ParamsResourceCommentsListbyblog, options: MethodOptions): GaxiosPromise[SchemaCommentList] = js.native
  def listByBlog(
    params: ParamsResourceCommentsListbyblog,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCommentList]
  ): Unit = js.native
  /**
    * Lists comments by blog.
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
    *   const res = await blogger.comments.listByBlog({
    *     blogId: 'placeholder-value',
    *
    *     endDate: 'placeholder-value',
    *
    *     fetchBodies: 'placeholder-value',
    *
    *     maxResults: 'placeholder-value',
    *
    *     pageToken: 'placeholder-value',
    *
    *     startDate: 'placeholder-value',
    *
    *     status: 'placeholder-value',
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
  def listByBlog(params: ParamsResourceCommentsListbyblog, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def listByBlog(
    params: ParamsResourceCommentsListbyblog,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def markAsSpam(): GaxiosPromise[SchemaComment] = js.native
  def markAsSpam(callback: BodyResponseCallback[SchemaComment]): Unit = js.native
  def markAsSpam(params: Unit, options: MethodOptions): GaxiosPromise[SchemaComment] = js.native
  def markAsSpam(params: ParamsResourceCommentsMarkasspam): GaxiosPromise[SchemaComment] = js.native
  def markAsSpam(params: ParamsResourceCommentsMarkasspam, callback: BodyResponseCallback[SchemaComment]): Unit = js.native
  def markAsSpam(
    params: ParamsResourceCommentsMarkasspam,
    options: BodyResponseCallback[Readable | SchemaComment],
    callback: BodyResponseCallback[Readable | SchemaComment]
  ): Unit = js.native
  def markAsSpam(params: ParamsResourceCommentsMarkasspam, options: MethodOptions): GaxiosPromise[SchemaComment] = js.native
  def markAsSpam(
    params: ParamsResourceCommentsMarkasspam,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaComment]
  ): Unit = js.native
  /**
    * Marks a comment as spam by blog id, post id and comment id.
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
    *   const res = await blogger.comments.markAsSpam({
    *     blogId: 'placeholder-value',
    *
    *     commentId: 'placeholder-value',
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
    *   //   "id": "my_id",
    *   //   "inReplyTo": {},
    *   //   "kind": "my_kind",
    *   //   "post": {},
    *   //   "published": "my_published",
    *   //   "selfLink": "my_selfLink",
    *   //   "status": "my_status",
    *   //   "updated": "my_updated"
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
  def markAsSpam(params: ParamsResourceCommentsMarkasspam, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def markAsSpam(
    params: ParamsResourceCommentsMarkasspam,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def removeContent(): GaxiosPromise[SchemaComment] = js.native
  def removeContent(callback: BodyResponseCallback[SchemaComment]): Unit = js.native
  def removeContent(params: Unit, options: MethodOptions): GaxiosPromise[SchemaComment] = js.native
  def removeContent(params: ParamsResourceCommentsRemovecontent): GaxiosPromise[SchemaComment] = js.native
  def removeContent(params: ParamsResourceCommentsRemovecontent, callback: BodyResponseCallback[SchemaComment]): Unit = js.native
  def removeContent(
    params: ParamsResourceCommentsRemovecontent,
    options: BodyResponseCallback[Readable | SchemaComment],
    callback: BodyResponseCallback[Readable | SchemaComment]
  ): Unit = js.native
  def removeContent(params: ParamsResourceCommentsRemovecontent, options: MethodOptions): GaxiosPromise[SchemaComment] = js.native
  def removeContent(
    params: ParamsResourceCommentsRemovecontent,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaComment]
  ): Unit = js.native
  /**
    * Removes the content of a comment by blog id, post id and comment id.
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
    *   const res = await blogger.comments.removeContent({
    *     blogId: 'placeholder-value',
    *
    *     commentId: 'placeholder-value',
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
    *   //   "id": "my_id",
    *   //   "inReplyTo": {},
    *   //   "kind": "my_kind",
    *   //   "post": {},
    *   //   "published": "my_published",
    *   //   "selfLink": "my_selfLink",
    *   //   "status": "my_status",
    *   //   "updated": "my_updated"
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
  def removeContent(params: ParamsResourceCommentsRemovecontent, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def removeContent(
    params: ParamsResourceCommentsRemovecontent,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
