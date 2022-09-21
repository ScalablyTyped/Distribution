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

@JSImport("googleapis/build/src/apis/books/v1", "books_v1.Resource$Volumes")
@js.native
open class ResourceVolumes protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var associated: ResourceVolumesAssociated = js.native
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaVolume] = js.native
  def get(callback: BodyResponseCallback[SchemaVolume]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaVolume] = js.native
  def get(params: ParamsResourceVolumesGet): GaxiosPromise[SchemaVolume] = js.native
  def get(params: ParamsResourceVolumesGet, callback: BodyResponseCallback[SchemaVolume]): Unit = js.native
  def get(
    params: ParamsResourceVolumesGet,
    options: BodyResponseCallback[Readable | SchemaVolume],
    callback: BodyResponseCallback[Readable | SchemaVolume]
  ): Unit = js.native
  def get(params: ParamsResourceVolumesGet, options: MethodOptions): GaxiosPromise[SchemaVolume] = js.native
  def get(
    params: ParamsResourceVolumesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaVolume]
  ): Unit = js.native
  /**
    * Gets volume information for a single volume.
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
    *   const res = await books.volumes.get({
    *     // ISO-3166-1 code to override the IP-based location.
    *     country: 'placeholder-value',
    *     // Set to true to include non-comics series. Defaults to false.
    *     includeNonComicsSeries: 'placeholder-value',
    *     // Brand results for partner ID.
    *     partner: 'placeholder-value',
    *     // Restrict information returned to a set of selected fields.
    *     projection: 'placeholder-value',
    *     // string to identify the originator of this request.
    *     source: 'placeholder-value',
    *
    *     user_library_consistent_read: 'placeholder-value',
    *     // ID of volume to retrieve.
    *     volumeId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "accessInfo": {},
    *   //   "etag": "my_etag",
    *   //   "id": "my_id",
    *   //   "kind": "my_kind",
    *   //   "layerInfo": {},
    *   //   "recommendedInfo": {},
    *   //   "saleInfo": {},
    *   //   "searchInfo": {},
    *   //   "selfLink": "my_selfLink",
    *   //   "userInfo": {},
    *   //   "volumeInfo": {}
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
  def get(params: ParamsResourceVolumesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceVolumesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaVolumes] = js.native
  def list(callback: BodyResponseCallback[SchemaVolumes]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaVolumes] = js.native
  def list(params: ParamsResourceVolumesList): GaxiosPromise[SchemaVolumes] = js.native
  def list(params: ParamsResourceVolumesList, callback: BodyResponseCallback[SchemaVolumes]): Unit = js.native
  def list(
    params: ParamsResourceVolumesList,
    options: BodyResponseCallback[Readable | SchemaVolumes],
    callback: BodyResponseCallback[Readable | SchemaVolumes]
  ): Unit = js.native
  def list(params: ParamsResourceVolumesList, options: MethodOptions): GaxiosPromise[SchemaVolumes] = js.native
  def list(
    params: ParamsResourceVolumesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaVolumes]
  ): Unit = js.native
  /**
    * Performs a book search.
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
    *   const res = await books.volumes.list({
    *     // Restrict to volumes by download availability.
    *     download: 'placeholder-value',
    *     // Filter search results.
    *     filter: 'placeholder-value',
    *     // Restrict results to books with this language code.
    *     langRestrict: 'placeholder-value',
    *     // Restrict search to this user's library.
    *     libraryRestrict: 'placeholder-value',
    *     // The maximum allowed maturity rating of returned recommendations. Books with a higher maturity rating are filtered out.
    *     maxAllowedMaturityRating: 'placeholder-value',
    *     // Maximum number of results to return.
    *     maxResults: 'placeholder-value',
    *     // Sort search results.
    *     orderBy: 'placeholder-value',
    *     // Restrict and brand results for partner ID.
    *     partner: 'placeholder-value',
    *     // Restrict to books or magazines.
    *     printType: 'placeholder-value',
    *     // Restrict information returned to a set of selected fields.
    *     projection: 'placeholder-value',
    *     // Full-text search query string.
    *     q: 'placeholder-value',
    *     // Set to true to show books available for preorder. Defaults to false.
    *     showPreorders: 'placeholder-value',
    *     // String to identify the originator of this request.
    *     source: 'placeholder-value',
    *     // Index of the first result to return (starts at 0)
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
  def list(params: ParamsResourceVolumesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceVolumesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var mybooks: ResourceVolumesMybooks = js.native
  
  var recommended: ResourceVolumesRecommended = js.native
  
  var useruploaded: ResourceVolumesUseruploaded = js.native
}
