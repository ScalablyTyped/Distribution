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

@JSImport("googleapis/build/src/apis/books/v1", "books_v1.Resource$Mylibrary$Bookshelves")
@js.native
open class ResourceMylibraryBookshelves protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def addVolume(): GaxiosPromise[SchemaEmpty] = js.native
  def addVolume(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def addVolume(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def addVolume(params: ParamsResourceMylibraryBookshelvesAddvolume): GaxiosPromise[SchemaEmpty] = js.native
  def addVolume(params: ParamsResourceMylibraryBookshelvesAddvolume, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def addVolume(
    params: ParamsResourceMylibraryBookshelvesAddvolume,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def addVolume(params: ParamsResourceMylibraryBookshelvesAddvolume, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def addVolume(
    params: ParamsResourceMylibraryBookshelvesAddvolume,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Adds a volume to a bookshelf.
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
    *   const res = await books.mylibrary.bookshelves.addVolume({
    *     // The reason for which the book is added to the library.
    *     reason: 'placeholder-value',
    *     // ID of bookshelf to which to add a volume.
    *     shelf: 'placeholder-value',
    *     // String to identify the originator of this request.
    *     source: 'placeholder-value',
    *     // ID of volume to add.
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
  def addVolume(params: ParamsResourceMylibraryBookshelvesAddvolume, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def addVolume(
    params: ParamsResourceMylibraryBookshelvesAddvolume,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def clearVolumes(): GaxiosPromise[SchemaEmpty] = js.native
  def clearVolumes(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def clearVolumes(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def clearVolumes(params: ParamsResourceMylibraryBookshelvesClearvolumes): GaxiosPromise[SchemaEmpty] = js.native
  def clearVolumes(
    params: ParamsResourceMylibraryBookshelvesClearvolumes,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def clearVolumes(
    params: ParamsResourceMylibraryBookshelvesClearvolumes,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def clearVolumes(params: ParamsResourceMylibraryBookshelvesClearvolumes, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def clearVolumes(
    params: ParamsResourceMylibraryBookshelvesClearvolumes,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Clears all volumes from a bookshelf.
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
    *   const res = await books.mylibrary.bookshelves.clearVolumes({
    *     // ID of bookshelf from which to remove a volume.
    *     shelf: 'placeholder-value',
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
  def clearVolumes(params: ParamsResourceMylibraryBookshelvesClearvolumes, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def clearVolumes(
    params: ParamsResourceMylibraryBookshelvesClearvolumes,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaBookshelf] = js.native
  def get(callback: BodyResponseCallback[SchemaBookshelf]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBookshelf] = js.native
  def get(params: ParamsResourceMylibraryBookshelvesGet): GaxiosPromise[SchemaBookshelf] = js.native
  def get(params: ParamsResourceMylibraryBookshelvesGet, callback: BodyResponseCallback[SchemaBookshelf]): Unit = js.native
  def get(
    params: ParamsResourceMylibraryBookshelvesGet,
    options: BodyResponseCallback[Readable | SchemaBookshelf],
    callback: BodyResponseCallback[Readable | SchemaBookshelf]
  ): Unit = js.native
  def get(params: ParamsResourceMylibraryBookshelvesGet, options: MethodOptions): GaxiosPromise[SchemaBookshelf] = js.native
  def get(
    params: ParamsResourceMylibraryBookshelvesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBookshelf]
  ): Unit = js.native
  /**
    * Retrieves metadata for a specific bookshelf belonging to the authenticated user.
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
    *   const res = await books.mylibrary.bookshelves.get({
    *     // ID of bookshelf to retrieve.
    *     shelf: 'placeholder-value',
    *     // String to identify the originator of this request.
    *     source: 'placeholder-value',
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
  def get(params: ParamsResourceMylibraryBookshelvesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceMylibraryBookshelvesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaBookshelves] = js.native
  def list(callback: BodyResponseCallback[SchemaBookshelves]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBookshelves] = js.native
  def list(params: ParamsResourceMylibraryBookshelvesList): GaxiosPromise[SchemaBookshelves] = js.native
  def list(params: ParamsResourceMylibraryBookshelvesList, callback: BodyResponseCallback[SchemaBookshelves]): Unit = js.native
  def list(
    params: ParamsResourceMylibraryBookshelvesList,
    options: BodyResponseCallback[Readable | SchemaBookshelves],
    callback: BodyResponseCallback[Readable | SchemaBookshelves]
  ): Unit = js.native
  def list(params: ParamsResourceMylibraryBookshelvesList, options: MethodOptions): GaxiosPromise[SchemaBookshelves] = js.native
  def list(
    params: ParamsResourceMylibraryBookshelvesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBookshelves]
  ): Unit = js.native
  /**
    * Retrieves a list of bookshelves belonging to the authenticated user.
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
    *   const res = await books.mylibrary.bookshelves.list({
    *     // String to identify the originator of this request.
    *     source: 'placeholder-value',
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
  def list(params: ParamsResourceMylibraryBookshelvesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceMylibraryBookshelvesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def moveVolume(): GaxiosPromise[SchemaEmpty] = js.native
  def moveVolume(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def moveVolume(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def moveVolume(params: ParamsResourceMylibraryBookshelvesMovevolume): GaxiosPromise[SchemaEmpty] = js.native
  def moveVolume(params: ParamsResourceMylibraryBookshelvesMovevolume, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def moveVolume(
    params: ParamsResourceMylibraryBookshelvesMovevolume,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def moveVolume(params: ParamsResourceMylibraryBookshelvesMovevolume, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def moveVolume(
    params: ParamsResourceMylibraryBookshelvesMovevolume,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Moves a volume within a bookshelf.
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
    *   const res = await books.mylibrary.bookshelves.moveVolume({
    *     // ID of bookshelf with the volume.
    *     shelf: 'placeholder-value',
    *     // String to identify the originator of this request.
    *     source: 'placeholder-value',
    *     // ID of volume to move.
    *     volumeId: 'placeholder-value',
    *     // Position on shelf to move the item (0 puts the item before the current first item, 1 puts it between the first and the second and so on.)
    *     volumePosition: 'placeholder-value',
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
  def moveVolume(params: ParamsResourceMylibraryBookshelvesMovevolume, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def moveVolume(
    params: ParamsResourceMylibraryBookshelvesMovevolume,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def removeVolume(): GaxiosPromise[SchemaEmpty] = js.native
  def removeVolume(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def removeVolume(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def removeVolume(params: ParamsResourceMylibraryBookshelvesRemovevolume): GaxiosPromise[SchemaEmpty] = js.native
  def removeVolume(
    params: ParamsResourceMylibraryBookshelvesRemovevolume,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def removeVolume(
    params: ParamsResourceMylibraryBookshelvesRemovevolume,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def removeVolume(params: ParamsResourceMylibraryBookshelvesRemovevolume, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def removeVolume(
    params: ParamsResourceMylibraryBookshelvesRemovevolume,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Removes a volume from a bookshelf.
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
    *   const res = await books.mylibrary.bookshelves.removeVolume({
    *     // The reason for which the book is removed from the library.
    *     reason: 'placeholder-value',
    *     // ID of bookshelf from which to remove a volume.
    *     shelf: 'placeholder-value',
    *     // String to identify the originator of this request.
    *     source: 'placeholder-value',
    *     // ID of volume to remove.
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
  def removeVolume(params: ParamsResourceMylibraryBookshelvesRemovevolume, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def removeVolume(
    params: ParamsResourceMylibraryBookshelvesRemovevolume,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var volumes: ResourceMylibraryBookshelvesVolumes = js.native
}
