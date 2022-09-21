package typings.googleapis.chatV1Mod.chatV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/chat/v1", "chat_v1.Resource$Spaces$Members")
@js.native
open class ResourceSpacesMembers protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaMembership] = js.native
  def get(callback: BodyResponseCallback[SchemaMembership]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaMembership] = js.native
  def get(params: ParamsResourceSpacesMembersGet): GaxiosPromise[SchemaMembership] = js.native
  def get(params: ParamsResourceSpacesMembersGet, callback: BodyResponseCallback[SchemaMembership]): Unit = js.native
  def get(
    params: ParamsResourceSpacesMembersGet,
    options: BodyResponseCallback[Readable | SchemaMembership],
    callback: BodyResponseCallback[Readable | SchemaMembership]
  ): Unit = js.native
  def get(params: ParamsResourceSpacesMembersGet, options: MethodOptions): GaxiosPromise[SchemaMembership] = js.native
  def get(
    params: ParamsResourceSpacesMembersGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaMembership]
  ): Unit = js.native
  /**
    * Returns a membership. Requires [service account authentication](https://developers.google.com/chat/api/guides/auth/service-accounts).
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/chat.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const chat = google.chat('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await chat.spaces.members.get({
    *     // Required. Resource name of the membership to retrieve. Format: spaces/{space\}/members/{member\}
    *     name: 'spaces/my-space/members/my-member',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "member": {},
    *   //   "name": "my_name",
    *   //   "role": "my_role",
    *   //   "state": "my_state"
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
  def get(params: ParamsResourceSpacesMembersGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceSpacesMembersGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListMembershipsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListMembershipsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListMembershipsResponse] = js.native
  def list(params: ParamsResourceSpacesMembersList): GaxiosPromise[SchemaListMembershipsResponse] = js.native
  def list(
    params: ParamsResourceSpacesMembersList,
    callback: BodyResponseCallback[SchemaListMembershipsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceSpacesMembersList,
    options: BodyResponseCallback[Readable | SchemaListMembershipsResponse],
    callback: BodyResponseCallback[Readable | SchemaListMembershipsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceSpacesMembersList, options: MethodOptions): GaxiosPromise[SchemaListMembershipsResponse] = js.native
  def list(
    params: ParamsResourceSpacesMembersList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListMembershipsResponse]
  ): Unit = js.native
  /**
    * Lists human memberships in a space. Requires [service account authentication](https://developers.google.com/chat/api/guides/auth/service-accounts).
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/chat.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const chat = google.chat('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await chat.spaces.members.list({
    *     // Requested page size. The value is capped at 1000. Server may return fewer results than requested. If unspecified, server will default to 100.
    *     pageSize: 'placeholder-value',
    *     // A token identifying a page of results the server should return.
    *     pageToken: 'placeholder-value',
    *     // Required. The resource name of the space for which to fetch a membership list. Format: spaces/{space\}
    *     parent: 'spaces/my-space',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "memberships": [],
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
  def list(params: ParamsResourceSpacesMembersList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceSpacesMembersList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
