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

@JSImport("googleapis/build/src/apis/books/v1", "books_v1.Resource$Mylibrary$Bookshelves$Volumes")
@js.native
open class ResourceMylibraryBookshelvesVolumes protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaVolumes] = js.native
  def list(callback: BodyResponseCallback[SchemaVolumes]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaVolumes] = js.native
  def list(params: ParamsResourceMylibraryBookshelvesVolumesList): GaxiosPromise[SchemaVolumes] = js.native
  def list(
    params: ParamsResourceMylibraryBookshelvesVolumesList,
    callback: BodyResponseCallback[SchemaVolumes]
  ): Unit = js.native
  def list(
    params: ParamsResourceMylibraryBookshelvesVolumesList,
    options: BodyResponseCallback[Readable | SchemaVolumes],
    callback: BodyResponseCallback[Readable | SchemaVolumes]
  ): Unit = js.native
  def list(params: ParamsResourceMylibraryBookshelvesVolumesList, options: MethodOptions): GaxiosPromise[SchemaVolumes] = js.native
  def list(
    params: ParamsResourceMylibraryBookshelvesVolumesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaVolumes]
  ): Unit = js.native
  /**
    * Gets volume information for volumes on a bookshelf.
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
    *   const res = await books.mylibrary.bookshelves.volumes.list({
    *     // ISO-3166-1 code to override the IP-based location.
    *     country: 'placeholder-value',
    *     // Maximum number of results to return
    *     maxResults: 'placeholder-value',
    *     // Restrict information returned to a set of selected fields.
    *     projection: 'placeholder-value',
    *     // Full-text search query string in this bookshelf.
    *     q: 'placeholder-value',
    *     // The bookshelf ID or name retrieve volumes for.
    *     shelf: 'placeholder-value',
    *     // Set to true to show pre-ordered books. Defaults to false.
    *     showPreorders: 'placeholder-value',
    *     // String to identify the originator of this request.
    *     source: 'placeholder-value',
    *     // Index of the first element to return (starts at 0)
    *     startIndex: 'placeholder-value',
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
  def list(params: ParamsResourceMylibraryBookshelvesVolumesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceMylibraryBookshelvesVolumesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
