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

@JSImport("googleapis/build/src/apis/books/v1", "books_v1.Resource$Layers$Annotationdata")
@js.native
open class ResourceLayersAnnotationdata protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaDictionaryAnnotationdata] = js.native
  def get(callback: BodyResponseCallback[SchemaDictionaryAnnotationdata]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDictionaryAnnotationdata] = js.native
  def get(params: ParamsResourceLayersAnnotationdataGet): GaxiosPromise[SchemaDictionaryAnnotationdata] = js.native
  def get(
    params: ParamsResourceLayersAnnotationdataGet,
    callback: BodyResponseCallback[SchemaDictionaryAnnotationdata]
  ): Unit = js.native
  def get(
    params: ParamsResourceLayersAnnotationdataGet,
    options: BodyResponseCallback[Readable | SchemaDictionaryAnnotationdata],
    callback: BodyResponseCallback[Readable | SchemaDictionaryAnnotationdata]
  ): Unit = js.native
  def get(params: ParamsResourceLayersAnnotationdataGet, options: MethodOptions): GaxiosPromise[SchemaDictionaryAnnotationdata] = js.native
  def get(
    params: ParamsResourceLayersAnnotationdataGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDictionaryAnnotationdata]
  ): Unit = js.native
  /**
    * Gets the annotation data.
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
    *   const res = await books.layers.annotationData.get({
    *     // For the dictionary layer. Whether or not to allow web definitions.
    *     allowWebDefinitions: 'placeholder-value',
    *     // The ID of the annotation data to retrieve.
    *     annotationDataId: 'placeholder-value',
    *     // The content version for the volume you are trying to retrieve.
    *     contentVersion: 'placeholder-value',
    *     // The requested pixel height for any images. If height is provided width must also be provided.
    *     h: 'placeholder-value',
    *     // The ID for the layer to get the annotations.
    *     layerId: 'placeholder-value',
    *     // The locale information for the data. ISO-639-1 language and ISO-3166-1 country code. Ex: 'en_US'.
    *     locale: 'placeholder-value',
    *     // The requested scale for the image.
    *     scale: 'placeholder-value',
    *     // String to identify the originator of this request.
    *     source: 'placeholder-value',
    *     // The volume to retrieve annotations for.
    *     volumeId: 'placeholder-value',
    *     // The requested pixel width for any images. If width is provided height must also be provided.
    *     w: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "annotationType": "my_annotationType",
    *   //   "data": {},
    *   //   "encodedData": "my_encodedData",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "layerId": "my_layerId",
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
  def get(params: ParamsResourceLayersAnnotationdataGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceLayersAnnotationdataGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaAnnotationsdata] = js.native
  def list(callback: BodyResponseCallback[SchemaAnnotationsdata]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAnnotationsdata] = js.native
  def list(params: ParamsResourceLayersAnnotationdataList): GaxiosPromise[SchemaAnnotationsdata] = js.native
  def list(
    params: ParamsResourceLayersAnnotationdataList,
    callback: BodyResponseCallback[SchemaAnnotationsdata]
  ): Unit = js.native
  def list(
    params: ParamsResourceLayersAnnotationdataList,
    options: BodyResponseCallback[Readable | SchemaAnnotationsdata],
    callback: BodyResponseCallback[Readable | SchemaAnnotationsdata]
  ): Unit = js.native
  def list(params: ParamsResourceLayersAnnotationdataList, options: MethodOptions): GaxiosPromise[SchemaAnnotationsdata] = js.native
  def list(
    params: ParamsResourceLayersAnnotationdataList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAnnotationsdata]
  ): Unit = js.native
  /**
    * Gets the annotation data for a volume and layer.
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
    *   const res = await books.layers.annotationData.list({
    *     // The list of Annotation Data Ids to retrieve. Pagination is ignored if this is set.
    *     annotationDataId: 'placeholder-value',
    *     // The content version for the requested volume.
    *     contentVersion: 'placeholder-value',
    *     // The requested pixel height for any images. If height is provided width must also be provided.
    *     h: 'placeholder-value',
    *     // The ID for the layer to get the annotation data.
    *     layerId: 'placeholder-value',
    *     // The locale information for the data. ISO-639-1 language and ISO-3166-1 country code. Ex: 'en_US'.
    *     locale: 'placeholder-value',
    *     // Maximum number of results to return
    *     maxResults: 'placeholder-value',
    *     // The value of the nextToken from the previous page.
    *     pageToken: 'placeholder-value',
    *     // The requested scale for the image.
    *     scale: 'placeholder-value',
    *     // String to identify the originator of this request.
    *     source: 'placeholder-value',
    *     // RFC 3339 timestamp to restrict to items updated prior to this timestamp (exclusive).
    *     updatedMax: 'placeholder-value',
    *     // RFC 3339 timestamp to restrict to items updated since this timestamp (inclusive).
    *     updatedMin: 'placeholder-value',
    *     // The volume to retrieve annotation data for.
    *     volumeId: 'placeholder-value',
    *     // The requested pixel width for any images. If width is provided height must also be provided.
    *     w: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "items": [],
    *   //   "kind": "my_kind",
    *   //   "nextPageToken": "my_nextPageToken",
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
  def list(params: ParamsResourceLayersAnnotationdataList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceLayersAnnotationdataList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
