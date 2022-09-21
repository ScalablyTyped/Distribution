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

@JSImport("googleapis/build/src/apis/chat/v1", "chat_v1.Resource$Media")
@js.native
open class ResourceMedia protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def download(): GaxiosPromise[SchemaMedia] = js.native
  def download(callback: BodyResponseCallback[SchemaMedia]): Unit = js.native
  def download(params: Unit, options: MethodOptions): GaxiosPromise[SchemaMedia] = js.native
  def download(params: ParamsResourceMediaDownload): GaxiosPromise[SchemaMedia] = js.native
  def download(params: ParamsResourceMediaDownload, callback: BodyResponseCallback[SchemaMedia]): Unit = js.native
  def download(
    params: ParamsResourceMediaDownload,
    options: BodyResponseCallback[Readable | SchemaMedia],
    callback: BodyResponseCallback[Readable | SchemaMedia]
  ): Unit = js.native
  def download(params: ParamsResourceMediaDownload, options: MethodOptions): GaxiosPromise[SchemaMedia] = js.native
  def download(
    params: ParamsResourceMediaDownload,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaMedia]
  ): Unit = js.native
  /**
    * Downloads media. Download is supported on the URI `/v1/media/{+name\}?alt=media`.
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
    *   const res = await chat.media.download({
    *     // Name of the media that is being downloaded. See ReadRequest.resource_name.
    *     resourceName: '.*',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "resourceName": "my_resourceName"
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
  def download(params: ParamsResourceMediaDownload, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def download(
    params: ParamsResourceMediaDownload,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
