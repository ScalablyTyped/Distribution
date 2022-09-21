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

@JSImport("googleapis/build/src/apis/blogger/v3", "blogger_v3.Resource$Postuserinfos")
@js.native
open class ResourcePostuserinfos protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaPostUserInfo] = js.native
  def get(callback: BodyResponseCallback[SchemaPostUserInfo]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPostUserInfo] = js.native
  def get(params: ParamsResourcePostuserinfosGet): GaxiosPromise[SchemaPostUserInfo] = js.native
  def get(params: ParamsResourcePostuserinfosGet, callback: BodyResponseCallback[SchemaPostUserInfo]): Unit = js.native
  def get(
    params: ParamsResourcePostuserinfosGet,
    options: BodyResponseCallback[Readable | SchemaPostUserInfo],
    callback: BodyResponseCallback[Readable | SchemaPostUserInfo]
  ): Unit = js.native
  def get(params: ParamsResourcePostuserinfosGet, options: MethodOptions): GaxiosPromise[SchemaPostUserInfo] = js.native
  def get(
    params: ParamsResourcePostuserinfosGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPostUserInfo]
  ): Unit = js.native
  /**
    * Gets one post and user info pair, by post_id and user_id.
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
    *   const res = await blogger.postUserInfos.get({
    *     blogId: 'placeholder-value',
    *
    *     maxComments: 'placeholder-value',
    *
    *     postId: 'placeholder-value',
    *
    *     userId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "kind": "my_kind",
    *   //   "post": {},
    *   //   "post_user_info": {}
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
  def get(params: ParamsResourcePostuserinfosGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourcePostuserinfosGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaPostUserInfosList] = js.native
  def list(callback: BodyResponseCallback[SchemaPostUserInfosList]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPostUserInfosList] = js.native
  def list(params: ParamsResourcePostuserinfosList): GaxiosPromise[SchemaPostUserInfosList] = js.native
  def list(params: ParamsResourcePostuserinfosList, callback: BodyResponseCallback[SchemaPostUserInfosList]): Unit = js.native
  def list(
    params: ParamsResourcePostuserinfosList,
    options: BodyResponseCallback[Readable | SchemaPostUserInfosList],
    callback: BodyResponseCallback[Readable | SchemaPostUserInfosList]
  ): Unit = js.native
  def list(params: ParamsResourcePostuserinfosList, options: MethodOptions): GaxiosPromise[SchemaPostUserInfosList] = js.native
  def list(
    params: ParamsResourcePostuserinfosList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPostUserInfosList]
  ): Unit = js.native
  /**
    * Lists post and user info pairs.
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
    *   const res = await blogger.postUserInfos.list({
    *     blogId: 'placeholder-value',
    *
    *     endDate: 'placeholder-value',
    *
    *     fetchBodies: 'placeholder-value',
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
    *     userId: 'placeholder-value',
    *
    *     view: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
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
  def list(params: ParamsResourcePostuserinfosList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourcePostuserinfosList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
