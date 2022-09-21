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

@JSImport("googleapis/build/src/apis/blogger/v3", "blogger_v3.Resource$Blogs")
@js.native
open class ResourceBlogs protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaBlog] = js.native
  def get(callback: BodyResponseCallback[SchemaBlog]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBlog] = js.native
  def get(params: ParamsResourceBlogsGet): GaxiosPromise[SchemaBlog] = js.native
  def get(params: ParamsResourceBlogsGet, callback: BodyResponseCallback[SchemaBlog]): Unit = js.native
  def get(
    params: ParamsResourceBlogsGet,
    options: BodyResponseCallback[Readable | SchemaBlog],
    callback: BodyResponseCallback[Readable | SchemaBlog]
  ): Unit = js.native
  def get(params: ParamsResourceBlogsGet, options: MethodOptions): GaxiosPromise[SchemaBlog] = js.native
  def get(params: ParamsResourceBlogsGet, options: MethodOptions, callback: BodyResponseCallback[SchemaBlog]): Unit = js.native
  /**
    * Gets a blog by id.
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
    *   const res = await blogger.blogs.get({
    *     blogId: 'placeholder-value',
    *
    *     maxPosts: 'placeholder-value',
    *
    *     view: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "customMetaData": "my_customMetaData",
    *   //   "description": "my_description",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "locale": {},
    *   //   "name": "my_name",
    *   //   "pages": {},
    *   //   "posts": {},
    *   //   "published": "my_published",
    *   //   "selfLink": "my_selfLink",
    *   //   "status": "my_status",
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
  def get(params: ParamsResourceBlogsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceBlogsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getByUrl(): GaxiosPromise[SchemaBlog] = js.native
  def getByUrl(callback: BodyResponseCallback[SchemaBlog]): Unit = js.native
  def getByUrl(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBlog] = js.native
  def getByUrl(params: ParamsResourceBlogsGetbyurl): GaxiosPromise[SchemaBlog] = js.native
  def getByUrl(params: ParamsResourceBlogsGetbyurl, callback: BodyResponseCallback[SchemaBlog]): Unit = js.native
  def getByUrl(
    params: ParamsResourceBlogsGetbyurl,
    options: BodyResponseCallback[Readable | SchemaBlog],
    callback: BodyResponseCallback[Readable | SchemaBlog]
  ): Unit = js.native
  def getByUrl(params: ParamsResourceBlogsGetbyurl, options: MethodOptions): GaxiosPromise[SchemaBlog] = js.native
  def getByUrl(
    params: ParamsResourceBlogsGetbyurl,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBlog]
  ): Unit = js.native
  /**
    * Gets a blog by url.
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
    *   const res = await blogger.blogs.getByUrl({
    *     url: 'placeholder-value',
    *
    *     view: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "customMetaData": "my_customMetaData",
    *   //   "description": "my_description",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "locale": {},
    *   //   "name": "my_name",
    *   //   "pages": {},
    *   //   "posts": {},
    *   //   "published": "my_published",
    *   //   "selfLink": "my_selfLink",
    *   //   "status": "my_status",
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
  def getByUrl(params: ParamsResourceBlogsGetbyurl, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getByUrl(
    params: ParamsResourceBlogsGetbyurl,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def listByUser(): GaxiosPromise[SchemaBlogList] = js.native
  def listByUser(callback: BodyResponseCallback[SchemaBlogList]): Unit = js.native
  def listByUser(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBlogList] = js.native
  def listByUser(params: ParamsResourceBlogsListbyuser): GaxiosPromise[SchemaBlogList] = js.native
  def listByUser(params: ParamsResourceBlogsListbyuser, callback: BodyResponseCallback[SchemaBlogList]): Unit = js.native
  def listByUser(
    params: ParamsResourceBlogsListbyuser,
    options: BodyResponseCallback[Readable | SchemaBlogList],
    callback: BodyResponseCallback[Readable | SchemaBlogList]
  ): Unit = js.native
  def listByUser(params: ParamsResourceBlogsListbyuser, options: MethodOptions): GaxiosPromise[SchemaBlogList] = js.native
  def listByUser(
    params: ParamsResourceBlogsListbyuser,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBlogList]
  ): Unit = js.native
  /**
    * Lists blogs by user.
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
    *   const res = await blogger.blogs.listByUser({
    *     fetchUserInfo: 'placeholder-value',
    *
    *     role: 'placeholder-value',
    *     // Default value of status is LIVE.
    *     status: 'placeholder-value',
    *
    *     userId: 'placeholder-value',
    *
    *     view: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "blogUserInfos": [],
    *   //   "items": [],
    *   //   "kind": "my_kind"
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
  def listByUser(params: ParamsResourceBlogsListbyuser, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def listByUser(
    params: ParamsResourceBlogsListbyuser,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
