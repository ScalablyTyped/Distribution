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

@JSImport("googleapis/build/src/apis/blogger/v3", "blogger_v3.Resource$Pageviews")
@js.native
open class ResourcePageviews protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaPageviews] = js.native
  def get(callback: BodyResponseCallback[SchemaPageviews]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPageviews] = js.native
  def get(params: ParamsResourcePageviewsGet): GaxiosPromise[SchemaPageviews] = js.native
  def get(params: ParamsResourcePageviewsGet, callback: BodyResponseCallback[SchemaPageviews]): Unit = js.native
  def get(
    params: ParamsResourcePageviewsGet,
    options: BodyResponseCallback[Readable | SchemaPageviews],
    callback: BodyResponseCallback[Readable | SchemaPageviews]
  ): Unit = js.native
  def get(params: ParamsResourcePageviewsGet, options: MethodOptions): GaxiosPromise[SchemaPageviews] = js.native
  def get(
    params: ParamsResourcePageviewsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPageviews]
  ): Unit = js.native
  /**
    * Gets page views by blog id.
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
    *   const res = await blogger.pageViews.get({
    *     blogId: 'placeholder-value',
    *
    *     range: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "blogId": "my_blogId",
    *   //   "counts": [],
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
  def get(params: ParamsResourcePageviewsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourcePageviewsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
