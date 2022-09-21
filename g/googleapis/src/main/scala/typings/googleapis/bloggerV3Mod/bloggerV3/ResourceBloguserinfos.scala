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

@JSImport("googleapis/build/src/apis/blogger/v3", "blogger_v3.Resource$Bloguserinfos")
@js.native
open class ResourceBloguserinfos protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaBlogUserInfo] = js.native
  def get(callback: BodyResponseCallback[SchemaBlogUserInfo]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBlogUserInfo] = js.native
  def get(params: ParamsResourceBloguserinfosGet): GaxiosPromise[SchemaBlogUserInfo] = js.native
  def get(params: ParamsResourceBloguserinfosGet, callback: BodyResponseCallback[SchemaBlogUserInfo]): Unit = js.native
  def get(
    params: ParamsResourceBloguserinfosGet,
    options: BodyResponseCallback[Readable | SchemaBlogUserInfo],
    callback: BodyResponseCallback[Readable | SchemaBlogUserInfo]
  ): Unit = js.native
  def get(params: ParamsResourceBloguserinfosGet, options: MethodOptions): GaxiosPromise[SchemaBlogUserInfo] = js.native
  def get(
    params: ParamsResourceBloguserinfosGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBlogUserInfo]
  ): Unit = js.native
  /**
    * Gets one blog and user info pair by blog id and user id.
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
    *   const res = await blogger.blogUserInfos.get({
    *     blogId: 'placeholder-value',
    *
    *     maxPosts: 'placeholder-value',
    *
    *     userId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "blog": {},
    *   //   "blog_user_info": {},
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
  def get(params: ParamsResourceBloguserinfosGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceBloguserinfosGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
