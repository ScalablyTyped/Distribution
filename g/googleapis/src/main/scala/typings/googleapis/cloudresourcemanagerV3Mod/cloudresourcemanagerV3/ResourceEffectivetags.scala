package typings.googleapis.cloudresourcemanagerV3Mod.cloudresourcemanagerV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/cloudresourcemanager/v3", "cloudresourcemanager_v3.Resource$Effectivetags")
@js.native
open class ResourceEffectivetags protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaListEffectiveTagsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListEffectiveTagsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListEffectiveTagsResponse] = js.native
  def list(params: ParamsResourceEffectivetagsList): GaxiosPromise[SchemaListEffectiveTagsResponse] = js.native
  def list(
    params: ParamsResourceEffectivetagsList,
    callback: BodyResponseCallback[SchemaListEffectiveTagsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceEffectivetagsList,
    options: BodyResponseCallback[Readable | SchemaListEffectiveTagsResponse],
    callback: BodyResponseCallback[Readable | SchemaListEffectiveTagsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceEffectivetagsList, options: MethodOptions): GaxiosPromise[SchemaListEffectiveTagsResponse] = js.native
  def list(
    params: ParamsResourceEffectivetagsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListEffectiveTagsResponse]
  ): Unit = js.native
  /**
    * Return a list of effective tags for the given cloud resource, as specified in `parent`.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudresourcemanager.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudresourcemanager = google.cloudresourcemanager('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloud-platform.read-only',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudresourcemanager.effectiveTags.list({
    *     // Optional. The maximum number of effective tags to return in the response. The server allows a maximum of 300 effective tags to return in a single page. If unspecified, the server will use 100 as the default.
    *     pageSize: 'placeholder-value',
    *     // Optional. A pagination token returned from a previous call to `ListEffectiveTags` that indicates from where this listing should continue.
    *     pageToken: 'placeholder-value',
    *     // Required. The full resource name of a resource for which you want to list the effective tags. E.g. "//cloudresourcemanager.googleapis.com/projects/123"
    *     parent: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "effectiveTags": [],
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
  def list(params: ParamsResourceEffectivetagsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceEffectivetagsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
