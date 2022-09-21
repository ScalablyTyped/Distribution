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

@JSImport("googleapis/build/src/apis/books/v1", "books_v1.Resource$Series$Membership")
@js.native
open class ResourceSeriesMembership protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaSeriesmembership] = js.native
  def get(callback: BodyResponseCallback[SchemaSeriesmembership]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSeriesmembership] = js.native
  def get(params: ParamsResourceSeriesMembershipGet): GaxiosPromise[SchemaSeriesmembership] = js.native
  def get(params: ParamsResourceSeriesMembershipGet, callback: BodyResponseCallback[SchemaSeriesmembership]): Unit = js.native
  def get(
    params: ParamsResourceSeriesMembershipGet,
    options: BodyResponseCallback[Readable | SchemaSeriesmembership],
    callback: BodyResponseCallback[Readable | SchemaSeriesmembership]
  ): Unit = js.native
  def get(params: ParamsResourceSeriesMembershipGet, options: MethodOptions): GaxiosPromise[SchemaSeriesmembership] = js.native
  def get(
    params: ParamsResourceSeriesMembershipGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSeriesmembership]
  ): Unit = js.native
  /**
    * Returns Series membership data given the series id.
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
    *   const res = await books.series.membership.get({
    *     // Number of maximum results per page to be included in the response.
    *     page_size: 'placeholder-value',
    *     // The value of the nextToken from the previous page.
    *     page_token: 'placeholder-value',
    *     // String that identifies the series
    *     series_id: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "kind": "my_kind",
    *   //   "member": [],
    *   //   "nextPageToken": "my_nextPageToken"
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
  def get(params: ParamsResourceSeriesMembershipGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceSeriesMembershipGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
