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

@JSImport("googleapis/build/src/apis/books/v1", "books_v1.Resource$Mylibrary$Annotations")
@js.native
open class ResourceMylibraryAnnotations protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceMylibraryAnnotationsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceMylibraryAnnotationsDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceMylibraryAnnotationsDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceMylibraryAnnotationsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceMylibraryAnnotationsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes an annotation.
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
    *   const res = await books.mylibrary.annotations.delete({
    *     // The ID for the annotation to delete.
    *     annotationId: 'placeholder-value',
    *     // String to identify the originator of this request.
    *     source: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {}
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
  def delete(params: ParamsResourceMylibraryAnnotationsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceMylibraryAnnotationsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaAnnotation] = js.native
  def insert(callback: BodyResponseCallback[SchemaAnnotation]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAnnotation] = js.native
  def insert(params: ParamsResourceMylibraryAnnotationsInsert): GaxiosPromise[SchemaAnnotation] = js.native
  def insert(params: ParamsResourceMylibraryAnnotationsInsert, callback: BodyResponseCallback[SchemaAnnotation]): Unit = js.native
  def insert(
    params: ParamsResourceMylibraryAnnotationsInsert,
    options: BodyResponseCallback[Readable | SchemaAnnotation],
    callback: BodyResponseCallback[Readable | SchemaAnnotation]
  ): Unit = js.native
  def insert(params: ParamsResourceMylibraryAnnotationsInsert, options: MethodOptions): GaxiosPromise[SchemaAnnotation] = js.native
  def insert(
    params: ParamsResourceMylibraryAnnotationsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAnnotation]
  ): Unit = js.native
  /**
    * Inserts a new annotation.
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
    *   const res = await books.mylibrary.annotations.insert({
    *     // The ID for the annotation to insert.
    *     annotationId: 'placeholder-value',
    *     // ISO-3166-1 code to override the IP-based location.
    *     country: 'placeholder-value',
    *     // Requests that only the summary of the specified layer be provided in the response.
    *     showOnlySummaryInResponse: 'placeholder-value',
    *     // String to identify the originator of this request.
    *     source: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "afterSelectedText": "my_afterSelectedText",
    *       //   "beforeSelectedText": "my_beforeSelectedText",
    *       //   "clientVersionRanges": {},
    *       //   "created": "my_created",
    *       //   "currentVersionRanges": {},
    *       //   "data": "my_data",
    *       //   "deleted": false,
    *       //   "highlightStyle": "my_highlightStyle",
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "layerId": "my_layerId",
    *       //   "layerSummary": {},
    *       //   "pageIds": [],
    *       //   "selectedText": "my_selectedText",
    *       //   "selfLink": "my_selfLink",
    *       //   "updated": "my_updated",
    *       //   "volumeId": "my_volumeId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "afterSelectedText": "my_afterSelectedText",
    *   //   "beforeSelectedText": "my_beforeSelectedText",
    *   //   "clientVersionRanges": {},
    *   //   "created": "my_created",
    *   //   "currentVersionRanges": {},
    *   //   "data": "my_data",
    *   //   "deleted": false,
    *   //   "highlightStyle": "my_highlightStyle",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "layerId": "my_layerId",
    *   //   "layerSummary": {},
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
  def insert(params: ParamsResourceMylibraryAnnotationsInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceMylibraryAnnotationsInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaAnnotations] = js.native
  def list(callback: BodyResponseCallback[SchemaAnnotations]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAnnotations] = js.native
  def list(params: ParamsResourceMylibraryAnnotationsList): GaxiosPromise[SchemaAnnotations] = js.native
  def list(params: ParamsResourceMylibraryAnnotationsList, callback: BodyResponseCallback[SchemaAnnotations]): Unit = js.native
  def list(
    params: ParamsResourceMylibraryAnnotationsList,
    options: BodyResponseCallback[Readable | SchemaAnnotations],
    callback: BodyResponseCallback[Readable | SchemaAnnotations]
  ): Unit = js.native
  def list(params: ParamsResourceMylibraryAnnotationsList, options: MethodOptions): GaxiosPromise[SchemaAnnotations] = js.native
  def list(
    params: ParamsResourceMylibraryAnnotationsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAnnotations]
  ): Unit = js.native
  /**
    * Retrieves a list of annotations, possibly filtered.
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
    *   const res = await books.mylibrary.annotations.list({
    *     // The content version for the requested volume.
    *     contentVersion: 'placeholder-value',
    *     // The layer ID to limit annotation by.
    *     layerId: 'placeholder-value',
    *     // The layer ID(s) to limit annotation by.
    *     layerIds: 'placeholder-value',
    *     // Maximum number of results to return
    *     maxResults: 'placeholder-value',
    *     // The value of the nextToken from the previous page.
    *     pageToken: 'placeholder-value',
    *     // Set to true to return deleted annotations. updatedMin must be in the request to use this. Defaults to false.
    *     showDeleted: 'placeholder-value',
    *     // String to identify the originator of this request.
    *     source: 'placeholder-value',
    *     // RFC 3339 timestamp to restrict to items updated prior to this timestamp (exclusive).
    *     updatedMax: 'placeholder-value',
    *     // RFC 3339 timestamp to restrict to items updated since this timestamp (inclusive).
    *     updatedMin: 'placeholder-value',
    *     // The volume to restrict annotations to.
    *     volumeId: 'placeholder-value',
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
  def list(params: ParamsResourceMylibraryAnnotationsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceMylibraryAnnotationsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def summary(): GaxiosPromise[SchemaAnnotationsSummary] = js.native
  def summary(callback: BodyResponseCallback[SchemaAnnotationsSummary]): Unit = js.native
  def summary(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAnnotationsSummary] = js.native
  def summary(params: ParamsResourceMylibraryAnnotationsSummary): GaxiosPromise[SchemaAnnotationsSummary] = js.native
  def summary(
    params: ParamsResourceMylibraryAnnotationsSummary,
    callback: BodyResponseCallback[SchemaAnnotationsSummary]
  ): Unit = js.native
  def summary(
    params: ParamsResourceMylibraryAnnotationsSummary,
    options: BodyResponseCallback[Readable | SchemaAnnotationsSummary],
    callback: BodyResponseCallback[Readable | SchemaAnnotationsSummary]
  ): Unit = js.native
  def summary(params: ParamsResourceMylibraryAnnotationsSummary, options: MethodOptions): GaxiosPromise[SchemaAnnotationsSummary] = js.native
  def summary(
    params: ParamsResourceMylibraryAnnotationsSummary,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAnnotationsSummary]
  ): Unit = js.native
  /**
    * Gets the summary of specified layers.
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
    *   const res = await books.mylibrary.annotations.summary({
    *     // Array of layer IDs to get the summary for.
    *     layerIds: 'placeholder-value',
    *     // Volume id to get the summary for.
    *     volumeId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "kind": "my_kind",
    *   //   "layers": []
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
  def summary(params: ParamsResourceMylibraryAnnotationsSummary, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def summary(
    params: ParamsResourceMylibraryAnnotationsSummary,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaAnnotation] = js.native
  def update(callback: BodyResponseCallback[SchemaAnnotation]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAnnotation] = js.native
  def update(params: ParamsResourceMylibraryAnnotationsUpdate): GaxiosPromise[SchemaAnnotation] = js.native
  def update(params: ParamsResourceMylibraryAnnotationsUpdate, callback: BodyResponseCallback[SchemaAnnotation]): Unit = js.native
  def update(
    params: ParamsResourceMylibraryAnnotationsUpdate,
    options: BodyResponseCallback[Readable | SchemaAnnotation],
    callback: BodyResponseCallback[Readable | SchemaAnnotation]
  ): Unit = js.native
  def update(params: ParamsResourceMylibraryAnnotationsUpdate, options: MethodOptions): GaxiosPromise[SchemaAnnotation] = js.native
  def update(
    params: ParamsResourceMylibraryAnnotationsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAnnotation]
  ): Unit = js.native
  /**
    * Updates an existing annotation.
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
    *   const res = await books.mylibrary.annotations.update({
    *     // The ID for the annotation to update.
    *     annotationId: 'placeholder-value',
    *     // String to identify the originator of this request.
    *     source: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "afterSelectedText": "my_afterSelectedText",
    *       //   "beforeSelectedText": "my_beforeSelectedText",
    *       //   "clientVersionRanges": {},
    *       //   "created": "my_created",
    *       //   "currentVersionRanges": {},
    *       //   "data": "my_data",
    *       //   "deleted": false,
    *       //   "highlightStyle": "my_highlightStyle",
    *       //   "id": "my_id",
    *       //   "kind": "my_kind",
    *       //   "layerId": "my_layerId",
    *       //   "layerSummary": {},
    *       //   "pageIds": [],
    *       //   "selectedText": "my_selectedText",
    *       //   "selfLink": "my_selfLink",
    *       //   "updated": "my_updated",
    *       //   "volumeId": "my_volumeId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "afterSelectedText": "my_afterSelectedText",
    *   //   "beforeSelectedText": "my_beforeSelectedText",
    *   //   "clientVersionRanges": {},
    *   //   "created": "my_created",
    *   //   "currentVersionRanges": {},
    *   //   "data": "my_data",
    *   //   "deleted": false,
    *   //   "highlightStyle": "my_highlightStyle",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "layerId": "my_layerId",
    *   //   "layerSummary": {},
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
  def update(params: ParamsResourceMylibraryAnnotationsUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceMylibraryAnnotationsUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
