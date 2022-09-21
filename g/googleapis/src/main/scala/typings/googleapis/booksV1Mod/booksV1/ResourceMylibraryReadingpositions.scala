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

@JSImport("googleapis/build/src/apis/books/v1", "books_v1.Resource$Mylibrary$Readingpositions")
@js.native
open class ResourceMylibraryReadingpositions protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaReadingPosition] = js.native
  def get(callback: BodyResponseCallback[SchemaReadingPosition]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaReadingPosition] = js.native
  def get(params: ParamsResourceMylibraryReadingpositionsGet): GaxiosPromise[SchemaReadingPosition] = js.native
  def get(
    params: ParamsResourceMylibraryReadingpositionsGet,
    callback: BodyResponseCallback[SchemaReadingPosition]
  ): Unit = js.native
  def get(
    params: ParamsResourceMylibraryReadingpositionsGet,
    options: BodyResponseCallback[Readable | SchemaReadingPosition],
    callback: BodyResponseCallback[Readable | SchemaReadingPosition]
  ): Unit = js.native
  def get(params: ParamsResourceMylibraryReadingpositionsGet, options: MethodOptions): GaxiosPromise[SchemaReadingPosition] = js.native
  def get(
    params: ParamsResourceMylibraryReadingpositionsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaReadingPosition]
  ): Unit = js.native
  /**
    * Retrieves my reading position information for a volume.
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
    *   const res = await books.mylibrary.readingpositions.get({
    *     // Volume content version for which this reading position is requested.
    *     contentVersion: 'placeholder-value',
    *     // String to identify the originator of this request.
    *     source: 'placeholder-value',
    *     // ID of volume for which to retrieve a reading position.
    *     volumeId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "epubCfiPosition": "my_epubCfiPosition",
    *   //   "gbImagePosition": "my_gbImagePosition",
    *   //   "gbTextPosition": "my_gbTextPosition",
    *   //   "kind": "my_kind",
    *   //   "pdfPosition": "my_pdfPosition",
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
  def get(params: ParamsResourceMylibraryReadingpositionsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceMylibraryReadingpositionsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def setPosition(): GaxiosPromise[SchemaEmpty] = js.native
  def setPosition(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def setPosition(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def setPosition(params: ParamsResourceMylibraryReadingpositionsSetposition): GaxiosPromise[SchemaEmpty] = js.native
  def setPosition(
    params: ParamsResourceMylibraryReadingpositionsSetposition,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def setPosition(
    params: ParamsResourceMylibraryReadingpositionsSetposition,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def setPosition(params: ParamsResourceMylibraryReadingpositionsSetposition, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def setPosition(
    params: ParamsResourceMylibraryReadingpositionsSetposition,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Sets my reading position information for a volume.
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
    *   const res = await books.mylibrary.readingpositions.setPosition({
    *     // Action that caused this reading position to be set.
    *     action: 'placeholder-value',
    *     // Volume content version for which this reading position applies.
    *     contentVersion: 'placeholder-value',
    *     // Random persistent device cookie optional on set position.
    *     deviceCookie: 'placeholder-value',
    *     // Position string for the new volume reading position.
    *     position: 'placeholder-value',
    *     // String to identify the originator of this request.
    *     source: 'placeholder-value',
    *     // RFC 3339 UTC format timestamp associated with this reading position.
    *     timestamp: 'placeholder-value',
    *     // ID of volume for which to update the reading position.
    *     volumeId: 'placeholder-value',
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
  def setPosition(params: ParamsResourceMylibraryReadingpositionsSetposition, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def setPosition(
    params: ParamsResourceMylibraryReadingpositionsSetposition,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
