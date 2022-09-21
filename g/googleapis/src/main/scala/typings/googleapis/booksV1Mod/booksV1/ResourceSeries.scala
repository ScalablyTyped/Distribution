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

@JSImport("googleapis/build/src/apis/books/v1", "books_v1.Resource$Series")
@js.native
open class ResourceSeries protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaSeries] = js.native
  def get(callback: BodyResponseCallback[SchemaSeries]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSeries] = js.native
  def get(params: ParamsResourceSeriesGet): GaxiosPromise[SchemaSeries] = js.native
  def get(params: ParamsResourceSeriesGet, callback: BodyResponseCallback[SchemaSeries]): Unit = js.native
  def get(
    params: ParamsResourceSeriesGet,
    options: BodyResponseCallback[Readable | SchemaSeries],
    callback: BodyResponseCallback[Readable | SchemaSeries]
  ): Unit = js.native
  def get(params: ParamsResourceSeriesGet, options: MethodOptions): GaxiosPromise[SchemaSeries] = js.native
  def get(
    params: ParamsResourceSeriesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSeries]
  ): Unit = js.native
  /**
    * Returns Series metadata for the given series ids.
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
    *   const res = await books.series.get({
    *     // String that identifies the series
    *     series_id: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "kind": "my_kind",
    *   //   "series": []
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
  def get(params: ParamsResourceSeriesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceSeriesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var membership: ResourceSeriesMembership = js.native
}
