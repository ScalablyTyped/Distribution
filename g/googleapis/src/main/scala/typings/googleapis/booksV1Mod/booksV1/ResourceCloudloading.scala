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

@JSImport("googleapis/build/src/apis/books/v1", "books_v1.Resource$Cloudloading")
@js.native
open class ResourceCloudloading protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def addBook(): GaxiosPromise[SchemaBooksCloudloadingResource] = js.native
  def addBook(callback: BodyResponseCallback[SchemaBooksCloudloadingResource]): Unit = js.native
  def addBook(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBooksCloudloadingResource] = js.native
  def addBook(params: ParamsResourceCloudloadingAddbook): GaxiosPromise[SchemaBooksCloudloadingResource] = js.native
  def addBook(
    params: ParamsResourceCloudloadingAddbook,
    callback: BodyResponseCallback[SchemaBooksCloudloadingResource]
  ): Unit = js.native
  def addBook(
    params: ParamsResourceCloudloadingAddbook,
    options: BodyResponseCallback[Readable | SchemaBooksCloudloadingResource],
    callback: BodyResponseCallback[Readable | SchemaBooksCloudloadingResource]
  ): Unit = js.native
  def addBook(params: ParamsResourceCloudloadingAddbook, options: MethodOptions): GaxiosPromise[SchemaBooksCloudloadingResource] = js.native
  def addBook(
    params: ParamsResourceCloudloadingAddbook,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBooksCloudloadingResource]
  ): Unit = js.native
  /**
    * Add a user-upload volume and triggers processing.
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
    *   const res = await books.cloudloading.addBook({
    *     // A drive document id. The upload_client_token must not be set.
    *     drive_document_id: 'placeholder-value',
    *     // The document MIME type. It can be set only if the drive_document_id is set.
    *     mime_type: 'placeholder-value',
    *     // The document name. It can be set only if the drive_document_id is set.
    *     name: 'placeholder-value',
    *     // Scotty upload token.
    *     upload_client_token: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "author": "my_author",
    *   //   "processingState": "my_processingState",
    *   //   "title": "my_title",
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
  def addBook(params: ParamsResourceCloudloadingAddbook, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def addBook(
    params: ParamsResourceCloudloadingAddbook,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def deleteBook(): GaxiosPromise[SchemaEmpty] = js.native
  def deleteBook(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def deleteBook(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def deleteBook(params: ParamsResourceCloudloadingDeletebook): GaxiosPromise[SchemaEmpty] = js.native
  def deleteBook(params: ParamsResourceCloudloadingDeletebook, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def deleteBook(
    params: ParamsResourceCloudloadingDeletebook,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def deleteBook(params: ParamsResourceCloudloadingDeletebook, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def deleteBook(
    params: ParamsResourceCloudloadingDeletebook,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Remove the book and its contents
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
    *   const res = await books.cloudloading.deleteBook({
    *     // The id of the book to be removed.
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
  def deleteBook(params: ParamsResourceCloudloadingDeletebook, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def deleteBook(
    params: ParamsResourceCloudloadingDeletebook,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def updateBook(): GaxiosPromise[SchemaBooksCloudloadingResource] = js.native
  def updateBook(callback: BodyResponseCallback[SchemaBooksCloudloadingResource]): Unit = js.native
  def updateBook(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBooksCloudloadingResource] = js.native
  def updateBook(params: ParamsResourceCloudloadingUpdatebook): GaxiosPromise[SchemaBooksCloudloadingResource] = js.native
  def updateBook(
    params: ParamsResourceCloudloadingUpdatebook,
    callback: BodyResponseCallback[SchemaBooksCloudloadingResource]
  ): Unit = js.native
  def updateBook(
    params: ParamsResourceCloudloadingUpdatebook,
    options: BodyResponseCallback[Readable | SchemaBooksCloudloadingResource],
    callback: BodyResponseCallback[Readable | SchemaBooksCloudloadingResource]
  ): Unit = js.native
  def updateBook(params: ParamsResourceCloudloadingUpdatebook, options: MethodOptions): GaxiosPromise[SchemaBooksCloudloadingResource] = js.native
  def updateBook(
    params: ParamsResourceCloudloadingUpdatebook,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBooksCloudloadingResource]
  ): Unit = js.native
  /**
    * Updates a user-upload volume.
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
    *   const res = await books.cloudloading.updateBook({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "author": "my_author",
    *       //   "processingState": "my_processingState",
    *       //   "title": "my_title",
    *       //   "volumeId": "my_volumeId"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "author": "my_author",
    *   //   "processingState": "my_processingState",
    *   //   "title": "my_title",
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
  def updateBook(params: ParamsResourceCloudloadingUpdatebook, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def updateBook(
    params: ParamsResourceCloudloadingUpdatebook,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
