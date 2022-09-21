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

@JSImport("googleapis/build/src/apis/books/v1", "books_v1.Resource$Onboarding")
@js.native
open class ResourceOnboarding protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def listCategories(): GaxiosPromise[SchemaCategory] = js.native
  def listCategories(callback: BodyResponseCallback[SchemaCategory]): Unit = js.native
  def listCategories(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCategory] = js.native
  def listCategories(params: ParamsResourceOnboardingListcategories): GaxiosPromise[SchemaCategory] = js.native
  def listCategories(params: ParamsResourceOnboardingListcategories, callback: BodyResponseCallback[SchemaCategory]): Unit = js.native
  def listCategories(
    params: ParamsResourceOnboardingListcategories,
    options: BodyResponseCallback[Readable | SchemaCategory],
    callback: BodyResponseCallback[Readable | SchemaCategory]
  ): Unit = js.native
  def listCategories(params: ParamsResourceOnboardingListcategories, options: MethodOptions): GaxiosPromise[SchemaCategory] = js.native
  def listCategories(
    params: ParamsResourceOnboardingListcategories,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCategory]
  ): Unit = js.native
  /**
    * List categories for onboarding experience.
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
    *   const res = await books.onboarding.listCategories({
    *     // ISO-639-1 language and ISO-3166-1 country code. Default is en-US if unset.
    *     locale: 'placeholder-value',
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
  def listCategories(params: ParamsResourceOnboardingListcategories, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def listCategories(
    params: ParamsResourceOnboardingListcategories,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def listCategoryVolumes(): GaxiosPromise[SchemaVolume2] = js.native
  def listCategoryVolumes(callback: BodyResponseCallback[SchemaVolume2]): Unit = js.native
  def listCategoryVolumes(params: Unit, options: MethodOptions): GaxiosPromise[SchemaVolume2] = js.native
  def listCategoryVolumes(params: ParamsResourceOnboardingListcategoryvolumes): GaxiosPromise[SchemaVolume2] = js.native
  def listCategoryVolumes(params: ParamsResourceOnboardingListcategoryvolumes, callback: BodyResponseCallback[SchemaVolume2]): Unit = js.native
  def listCategoryVolumes(
    params: ParamsResourceOnboardingListcategoryvolumes,
    options: BodyResponseCallback[Readable | SchemaVolume2],
    callback: BodyResponseCallback[Readable | SchemaVolume2]
  ): Unit = js.native
  def listCategoryVolumes(params: ParamsResourceOnboardingListcategoryvolumes, options: MethodOptions): GaxiosPromise[SchemaVolume2] = js.native
  def listCategoryVolumes(
    params: ParamsResourceOnboardingListcategoryvolumes,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaVolume2]
  ): Unit = js.native
  /**
    * List available volumes under categories for onboarding experience.
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
    *   const res = await books.onboarding.listCategoryVolumes({
    *     // List of category ids requested.
    *     categoryId: 'placeholder-value',
    *     // ISO-639-1 language and ISO-3166-1 country code. Default is en-US if unset.
    *     locale: 'placeholder-value',
    *     // The maximum allowed maturity rating of returned volumes. Books with a higher maturity rating are filtered out.
    *     maxAllowedMaturityRating: 'placeholder-value',
    *     // Number of maximum results per page to be included in the response.
    *     pageSize: 'placeholder-value',
    *     // The value of the nextToken from the previous page.
    *     pageToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "items": [],
    *   //   "kind": "my_kind",
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
  def listCategoryVolumes(params: ParamsResourceOnboardingListcategoryvolumes, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def listCategoryVolumes(
    params: ParamsResourceOnboardingListcategoryvolumes,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
