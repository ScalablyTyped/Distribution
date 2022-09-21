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

@JSImport("googleapis/build/src/apis/books/v1", "books_v1.Resource$Bookshelves")
@js.native
open class ResourceBookshelves protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaBookshelf] = js.native
  def get(callback: BodyResponseCallback[SchemaBookshelf]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBookshelf] = js.native
  def get(params: ParamsResourceBookshelvesGet): GaxiosPromise[SchemaBookshelf] = js.native
  def get(params: ParamsResourceBookshelvesGet, callback: BodyResponseCallback[SchemaBookshelf]): Unit = js.native
  def get(
    params: ParamsResourceBookshelvesGet,
    options: BodyResponseCallback[Readable | SchemaBookshelf],
    callback: BodyResponseCallback[Readable | SchemaBookshelf]
  ): Unit = js.native
  def get(params: ParamsResourceBookshelvesGet, options: MethodOptions): GaxiosPromise[SchemaBookshelf] = js.native
  def get(
    params: ParamsResourceBookshelvesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBookshelf]
  ): Unit = js.native
  /**
    * Retrieves metadata for a specific bookshelf for the specified user.
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
    *   const res = await books.bookshelves.get({
    *     // ID of bookshelf to retrieve.
    *     shelf: 'placeholder-value',
    *     // String to identify the originator of this request.
    *     source: 'placeholder-value',
    *     // ID of user for whom to retrieve bookshelves.
    *     userId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "access": "my_access",
    *   //   "created": "my_created",
    *   //   "description": "my_description",
    *   //   "id": 0,
    *   //   "kind": "my_kind",
    *   //   "selfLink": "my_selfLink",
    *   //   "title": "my_title",
    *   //   "updated": "my_updated",
    *   //   "volumeCount": 0,
    *   //   "volumesLastUpdated": "my_volumesLastUpdated"
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
  def get(params: ParamsResourceBookshelvesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceBookshelvesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaBookshelves] = js.native
  def list(callback: BodyResponseCallback[SchemaBookshelves]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBookshelves] = js.native
  def list(params: ParamsResourceBookshelvesList): GaxiosPromise[SchemaBookshelves] = js.native
  def list(params: ParamsResourceBookshelvesList, callback: BodyResponseCallback[SchemaBookshelves]): Unit = js.native
  def list(
    params: ParamsResourceBookshelvesList,
    options: BodyResponseCallback[Readable | SchemaBookshelves],
    callback: BodyResponseCallback[Readable | SchemaBookshelves]
  ): Unit = js.native
  def list(params: ParamsResourceBookshelvesList, options: MethodOptions): GaxiosPromise[SchemaBookshelves] = js.native
  def list(
    params: ParamsResourceBookshelvesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBookshelves]
  ): Unit = js.native
  /**
    * Retrieves a list of public bookshelves for the specified user.
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
    *   const res = await books.bookshelves.list({
    *     // String to identify the originator of this request.
    *     source: 'placeholder-value',
    *     // ID of user for whom to retrieve bookshelves.
    *     userId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "items": [],
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
  def list(params: ParamsResourceBookshelvesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceBookshelvesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var volumes: ResourceBookshelvesVolumes = js.native
}
