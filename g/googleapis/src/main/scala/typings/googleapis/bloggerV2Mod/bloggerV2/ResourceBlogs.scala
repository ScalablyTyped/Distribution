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

@JSImport("googleapis/build/src/apis/blogger/v2", "blogger_v2.Resource$Blogs")
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
    *   const res = await blogger.blogs.get({
    *     blogId: 'placeholder-value',
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
  
  def list(): GaxiosPromise[SchemaBlogList] = js.native
  def list(callback: BodyResponseCallback[SchemaBlogList]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBlogList] = js.native
  def list(params: ParamsResourceBlogsList): GaxiosPromise[SchemaBlogList] = js.native
  def list(params: ParamsResourceBlogsList, callback: BodyResponseCallback[SchemaBlogList]): Unit = js.native
  def list(
    params: ParamsResourceBlogsList,
    options: BodyResponseCallback[Readable | SchemaBlogList],
    callback: BodyResponseCallback[Readable | SchemaBlogList]
  ): Unit = js.native
  def list(params: ParamsResourceBlogsList, options: MethodOptions): GaxiosPromise[SchemaBlogList] = js.native
  def list(
    params: ParamsResourceBlogsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBlogList]
  ): Unit = js.native
  /**
    * Lists blogs by user id, possibly filtered.
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
    *   const res = await blogger.blogs.list({
    *     userId: 'placeholder-value',
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
  def list(params: ParamsResourceBlogsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceBlogsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
