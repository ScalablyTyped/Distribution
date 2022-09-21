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

@JSImport("googleapis/build/src/apis/books/v1", "books_v1.Resource$Layers$Volumeannotations")
@js.native
open class ResourceLayersVolumeannotations protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaVolumeannotation] = js.native
  def get(callback: BodyResponseCallback[SchemaVolumeannotation]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaVolumeannotation] = js.native
  def get(params: ParamsResourceLayersVolumeannotationsGet): GaxiosPromise[SchemaVolumeannotation] = js.native
  def get(
    params: ParamsResourceLayersVolumeannotationsGet,
    callback: BodyResponseCallback[SchemaVolumeannotation]
  ): Unit = js.native
  def get(
    params: ParamsResourceLayersVolumeannotationsGet,
    options: BodyResponseCallback[Readable | SchemaVolumeannotation],
    callback: BodyResponseCallback[Readable | SchemaVolumeannotation]
  ): Unit = js.native
  def get(params: ParamsResourceLayersVolumeannotationsGet, options: MethodOptions): GaxiosPromise[SchemaVolumeannotation] = js.native
  def get(
    params: ParamsResourceLayersVolumeannotationsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaVolumeannotation]
  ): Unit = js.native
  /**
    * Gets the volume annotation.
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
    *   const res = await books.layers.volumeAnnotations.get({
    *     // The ID of the volume annotation to retrieve.
    *     annotationId: 'placeholder-value',
    *     // The ID for the layer to get the annotations.
    *     layerId: 'placeholder-value',
    *     // The locale information for the data. ISO-639-1 language and ISO-3166-1 country code. Ex: 'en_US'.
    *     locale: 'placeholder-value',
    *     // String to identify the originator of this request.
    *     source: 'placeholder-value',
    *     // The volume to retrieve annotations for.
    *     volumeId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "annotationDataId": "my_annotationDataId",
    *   //   "annotationDataLink": "my_annotationDataLink",
    *   //   "annotationType": "my_annotationType",
    *   //   "contentRanges": {},
    *   //   "data": "my_data",
    *   //   "deleted": false,
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "layerId": "my_layerId",
    *   //   "pageIds": [],
    *   //   "selectedText": "my_selectedText",
    *   //   "selfLink": "my_selfLink",
    *   //   "updated": "my_updated",
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
  def get(params: ParamsResourceLayersVolumeannotationsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceLayersVolumeannotationsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaVolumeannotations] = js.native
  def list(callback: BodyResponseCallback[SchemaVolumeannotations]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaVolumeannotations] = js.native
  def list(params: ParamsResourceLayersVolumeannotationsList): GaxiosPromise[SchemaVolumeannotations] = js.native
  def list(
    params: ParamsResourceLayersVolumeannotationsList,
    callback: BodyResponseCallback[SchemaVolumeannotations]
  ): Unit = js.native
  def list(
    params: ParamsResourceLayersVolumeannotationsList,
    options: BodyResponseCallback[Readable | SchemaVolumeannotations],
    callback: BodyResponseCallback[Readable | SchemaVolumeannotations]
  ): Unit = js.native
  def list(params: ParamsResourceLayersVolumeannotationsList, options: MethodOptions): GaxiosPromise[SchemaVolumeannotations] = js.native
  def list(
    params: ParamsResourceLayersVolumeannotationsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaVolumeannotations]
  ): Unit = js.native
  /**
    * Gets the volume annotations for a volume and layer.
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
    *   const res = await books.layers.volumeAnnotations.list({
    *     // The content version for the requested volume.
    *     contentVersion: 'placeholder-value',
    *     // The end offset to end retrieving data from.
    *     endOffset: 'placeholder-value',
    *     // The end position to end retrieving data from.
    *     endPosition: 'placeholder-value',
    *     // The ID for the layer to get the annotations.
    *     layerId: 'placeholder-value',
    *     // The locale information for the data. ISO-639-1 language and ISO-3166-1 country code. Ex: 'en_US'.
    *     locale: 'placeholder-value',
    *     // Maximum number of results to return
    *     maxResults: 'placeholder-value',
    *     // The value of the nextToken from the previous page.
    *     pageToken: 'placeholder-value',
    *     // Set to true to return deleted annotations. updatedMin must be in the request to use this. Defaults to false.
    *     showDeleted: 'placeholder-value',
    *     // String to identify the originator of this request.
    *     source: 'placeholder-value',
    *     // The start offset to start retrieving data from.
    *     startOffset: 'placeholder-value',
    *     // The start position to start retrieving data from.
    *     startPosition: 'placeholder-value',
    *     // RFC 3339 timestamp to restrict to items updated prior to this timestamp (exclusive).
    *     updatedMax: 'placeholder-value',
    *     // RFC 3339 timestamp to restrict to items updated since this timestamp (inclusive).
    *     updatedMin: 'placeholder-value',
    *     // The version of the volume annotations that you are requesting.
    *     volumeAnnotationsVersion: 'placeholder-value',
    *     // The volume to retrieve annotations for.
    *     volumeId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "items": [],
    *   //   "kind": "my_kind",
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "totalItems": 0,
    *   //   "version": "my_version"
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
  def list(params: ParamsResourceLayersVolumeannotationsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceLayersVolumeannotationsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
