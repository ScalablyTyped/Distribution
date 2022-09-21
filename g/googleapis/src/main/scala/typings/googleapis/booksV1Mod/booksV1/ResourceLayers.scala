package typings.googleapis.booksV1Mod.booksV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/books/v1", "books_v1.Resource$Layers")
@js.native
open class ResourceLayers protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var annotationData: ResourceLayersAnnotationdata = js.native
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaLayersummary] = js.native
  def get(callback: BodyResponseCallback[SchemaLayersummary]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaLayersummary] = js.native
  def get(params: ParamsResourceLayersGet): GaxiosPromise[SchemaLayersummary] = js.native
  def get(params: ParamsResourceLayersGet, callback: BodyResponseCallback[SchemaLayersummary]): Unit = js.native
  def get(
    params: ParamsResourceLayersGet,
    options: BodyResponseCallback[Readable | SchemaLayersummary],
    callback: BodyResponseCallback[Readable | SchemaLayersummary]
  ): Unit = js.native
  def get(params: ParamsResourceLayersGet, options: MethodOptions): GaxiosPromise[SchemaLayersummary] = js.native
  def get(
    params: ParamsResourceLayersGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLayersummary]
  ): Unit = js.native
  /**
    * Gets the layer summary for a volume.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/books.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const books = google.books('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/books'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await books.layers.get({
    *     // The content version for the requested volume.
    *     contentVersion: 'placeholder-value',
    *     // String to identify the originator of this request.
    *     source: 'placeholder-value',
    *     // The ID for the layer to get the summary for.
    *     summaryId: 'placeholder-value',
    *     // The volume to retrieve layers for.
    *     volumeId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "annotationCount": 0,
    *   //   "annotationTypes": [],
    *   //   "annotationsDataLink": "my_annotationsDataLink",
    *   //   "annotationsLink": "my_annotationsLink",
    *   //   "contentVersion": "my_contentVersion",
    *   //   "dataCount": 0,
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "layerId": "my_layerId",
    *   //   "selfLink": "my_selfLink",
    *   //   "updated": "my_updated",
    *   //   "volumeAnnotationsVersion": "my_volumeAnnotationsVersion",
    *   //   "volumeId": "my_volumeId"
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
  def get(params: ParamsResourceLayersGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceLayersGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaLayersummaries] = js.native
  def list(callback: BodyResponseCallback[SchemaLayersummaries]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaLayersummaries] = js.native
  def list(params: ParamsResourceLayersList): GaxiosPromise[SchemaLayersummaries] = js.native
  def list(params: ParamsResourceLayersList, callback: BodyResponseCallback[SchemaLayersummaries]): Unit = js.native
  def list(
    params: ParamsResourceLayersList,
    options: BodyResponseCallback[Readable | SchemaLayersummaries],
    callback: BodyResponseCallback[Readable | SchemaLayersummaries]
  ): Unit = js.native
  def list(params: ParamsResourceLayersList, options: MethodOptions): GaxiosPromise[SchemaLayersummaries] = js.native
  def list(
    params: ParamsResourceLayersList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLayersummaries]
  ): Unit = js.native
  /**
    * List the layer summaries for a volume.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/books.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const books = google.books('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/books'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await books.layers.list({
    *     // The content version for the requested volume.
    *     contentVersion: 'placeholder-value',
    *     // Maximum number of results to return
    *     maxResults: 'placeholder-value',
    *     // The value of the nextToken from the previous page.
    *     pageToken: 'placeholder-value',
    *     // String to identify the originator of this request.
    *     source: 'placeholder-value',
    *     // The volume to retrieve layers for.
    *     volumeId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "items": [],
    *   //   "kind": "my_kind",
    *   //   "totalItems": 0
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
  def list(params: ParamsResourceLayersList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceLayersList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var volumeAnnotations: ResourceLayersVolumeannotations = js.native
}
