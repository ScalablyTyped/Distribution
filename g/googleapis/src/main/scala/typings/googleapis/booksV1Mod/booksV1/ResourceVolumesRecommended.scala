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

@JSImport("googleapis/build/src/apis/books/v1", "books_v1.Resource$Volumes$Recommended")
@js.native
open class ResourceVolumesRecommended protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaVolumes] = js.native
  def list(callback: BodyResponseCallback[SchemaVolumes]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaVolumes] = js.native
  def list(params: ParamsResourceVolumesRecommendedList): GaxiosPromise[SchemaVolumes] = js.native
  def list(params: ParamsResourceVolumesRecommendedList, callback: BodyResponseCallback[SchemaVolumes]): Unit = js.native
  def list(
    params: ParamsResourceVolumesRecommendedList,
    options: BodyResponseCallback[Readable | SchemaVolumes],
    callback: BodyResponseCallback[Readable | SchemaVolumes]
  ): Unit = js.native
  def list(params: ParamsResourceVolumesRecommendedList, options: MethodOptions): GaxiosPromise[SchemaVolumes] = js.native
  def list(
    params: ParamsResourceVolumesRecommendedList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaVolumes]
  ): Unit = js.native
  /**
    * Return a list of recommended books for the current user.
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
    *   const res = await books.volumes.recommended.list({
    *     // ISO-639-1 language and ISO-3166-1 country code. Ex: 'en_US'. Used for generating recommendations.
    *     locale: 'placeholder-value',
    *     // The maximum allowed maturity rating of returned recommendations. Books with a higher maturity rating are filtered out.
    *     maxAllowedMaturityRating: 'placeholder-value',
    *     // String to identify the originator of this request.
    *     source: 'placeholder-value',
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
  def list(params: ParamsResourceVolumesRecommendedList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceVolumesRecommendedList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def rate(): GaxiosPromise[SchemaBooksVolumesRecommendedRateResponse] = js.native
  def rate(callback: BodyResponseCallback[SchemaBooksVolumesRecommendedRateResponse]): Unit = js.native
  def rate(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBooksVolumesRecommendedRateResponse] = js.native
  def rate(params: ParamsResourceVolumesRecommendedRate): GaxiosPromise[SchemaBooksVolumesRecommendedRateResponse] = js.native
  def rate(
    params: ParamsResourceVolumesRecommendedRate,
    callback: BodyResponseCallback[SchemaBooksVolumesRecommendedRateResponse]
  ): Unit = js.native
  def rate(
    params: ParamsResourceVolumesRecommendedRate,
    options: BodyResponseCallback[Readable | SchemaBooksVolumesRecommendedRateResponse],
    callback: BodyResponseCallback[Readable | SchemaBooksVolumesRecommendedRateResponse]
  ): Unit = js.native
  def rate(params: ParamsResourceVolumesRecommendedRate, options: MethodOptions): GaxiosPromise[SchemaBooksVolumesRecommendedRateResponse] = js.native
  def rate(
    params: ParamsResourceVolumesRecommendedRate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBooksVolumesRecommendedRateResponse]
  ): Unit = js.native
  /**
    * Rate a recommended book for the current user.
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
    *   const res = await books.volumes.recommended.rate({
    *     // ISO-639-1 language and ISO-3166-1 country code. Ex: 'en_US'. Used for generating recommendations.
    *     locale: 'placeholder-value',
    *     // Rating to be given to the volume.
    *     rating: 'placeholder-value',
    *     // String to identify the originator of this request.
    *     source: 'placeholder-value',
    *     // ID of the source volume.
    *     volumeId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "consistency_token": "my_consistency_token"
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
  def rate(params: ParamsResourceVolumesRecommendedRate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def rate(
    params: ParamsResourceVolumesRecommendedRate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
