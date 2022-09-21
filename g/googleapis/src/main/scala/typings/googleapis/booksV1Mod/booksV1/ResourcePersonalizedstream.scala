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

@JSImport("googleapis/build/src/apis/books/v1", "books_v1.Resource$Personalizedstream")
@js.native
open class ResourcePersonalizedstream protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaDiscoveryclusters] = js.native
  def get(callback: BodyResponseCallback[SchemaDiscoveryclusters]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDiscoveryclusters] = js.native
  def get(params: ParamsResourcePersonalizedstreamGet): GaxiosPromise[SchemaDiscoveryclusters] = js.native
  def get(
    params: ParamsResourcePersonalizedstreamGet,
    callback: BodyResponseCallback[SchemaDiscoveryclusters]
  ): Unit = js.native
  def get(
    params: ParamsResourcePersonalizedstreamGet,
    options: BodyResponseCallback[Readable | SchemaDiscoveryclusters],
    callback: BodyResponseCallback[Readable | SchemaDiscoveryclusters]
  ): Unit = js.native
  def get(params: ParamsResourcePersonalizedstreamGet, options: MethodOptions): GaxiosPromise[SchemaDiscoveryclusters] = js.native
  def get(
    params: ParamsResourcePersonalizedstreamGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDiscoveryclusters]
  ): Unit = js.native
  /**
    * Returns a stream of personalized book clusters
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
    *   const res = await books.personalizedstream.get({
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
    *   //   "clusters": [],
    *   //   "kind": "my_kind",
    *   //   "totalClusters": 0
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
  def get(params: ParamsResourcePersonalizedstreamGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourcePersonalizedstreamGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
