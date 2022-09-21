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

@JSImport("googleapis/build/src/apis/books/v1", "books_v1.Resource$Promooffer")
@js.native
open class ResourcePromooffer protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def accept(): GaxiosPromise[SchemaEmpty] = js.native
  def accept(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def accept(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def accept(params: ParamsResourcePromoofferAccept): GaxiosPromise[SchemaEmpty] = js.native
  def accept(params: ParamsResourcePromoofferAccept, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def accept(
    params: ParamsResourcePromoofferAccept,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def accept(params: ParamsResourcePromoofferAccept, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def accept(
    params: ParamsResourcePromoofferAccept,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Accepts the promo offer.
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
    *   const res = await books.promooffer.accept({
    *     // device android_id
    *     androidId: 'placeholder-value',
    *     // device device
    *     device: 'placeholder-value',
    *     // device manufacturer
    *     manufacturer: 'placeholder-value',
    *     // device model
    *     model: 'placeholder-value',
    *
    *     offerId: 'placeholder-value',
    *     // device product
    *     product: 'placeholder-value',
    *     // device serial
    *     serial: 'placeholder-value',
    *     // Volume id to exercise the offer
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
  def accept(params: ParamsResourcePromoofferAccept, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def accept(
    params: ParamsResourcePromoofferAccept,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def dismiss(): GaxiosPromise[SchemaEmpty] = js.native
  def dismiss(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def dismiss(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def dismiss(params: ParamsResourcePromoofferDismiss): GaxiosPromise[SchemaEmpty] = js.native
  def dismiss(params: ParamsResourcePromoofferDismiss, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def dismiss(
    params: ParamsResourcePromoofferDismiss,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def dismiss(params: ParamsResourcePromoofferDismiss, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def dismiss(
    params: ParamsResourcePromoofferDismiss,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Marks the promo offer as dismissed.
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
    *   const res = await books.promooffer.dismiss({
    *     // device android_id
    *     androidId: 'placeholder-value',
    *     // device device
    *     device: 'placeholder-value',
    *     // device manufacturer
    *     manufacturer: 'placeholder-value',
    *     // device model
    *     model: 'placeholder-value',
    *     // Offer to dimiss
    *     offerId: 'placeholder-value',
    *     // device product
    *     product: 'placeholder-value',
    *     // device serial
    *     serial: 'placeholder-value',
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
  def dismiss(params: ParamsResourcePromoofferDismiss, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def dismiss(
    params: ParamsResourcePromoofferDismiss,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaOffers] = js.native
  def get(callback: BodyResponseCallback[SchemaOffers]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOffers] = js.native
  def get(params: ParamsResourcePromoofferGet): GaxiosPromise[SchemaOffers] = js.native
  def get(params: ParamsResourcePromoofferGet, callback: BodyResponseCallback[SchemaOffers]): Unit = js.native
  def get(
    params: ParamsResourcePromoofferGet,
    options: BodyResponseCallback[Readable | SchemaOffers],
    callback: BodyResponseCallback[Readable | SchemaOffers]
  ): Unit = js.native
  def get(params: ParamsResourcePromoofferGet, options: MethodOptions): GaxiosPromise[SchemaOffers] = js.native
  def get(
    params: ParamsResourcePromoofferGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOffers]
  ): Unit = js.native
  /**
    * Returns a list of promo offers available to the user
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
    *   const res = await books.promooffer.get({
    *     // device android_id
    *     androidId: 'placeholder-value',
    *     // device device
    *     device: 'placeholder-value',
    *     // device manufacturer
    *     manufacturer: 'placeholder-value',
    *     // device model
    *     model: 'placeholder-value',
    *     // device product
    *     product: 'placeholder-value',
    *     // device serial
    *     serial: 'placeholder-value',
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
  def get(params: ParamsResourcePromoofferGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourcePromoofferGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
