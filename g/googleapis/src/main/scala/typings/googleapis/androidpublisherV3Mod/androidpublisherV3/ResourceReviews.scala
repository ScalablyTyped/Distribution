package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/androidpublisher/v3", "androidpublisher_v3.Resource$Reviews")
@js.native
open class ResourceReviews protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaReview] = js.native
  def get(callback: BodyResponseCallback[SchemaReview]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaReview] = js.native
  def get(params: ParamsResourceReviewsGet): GaxiosPromise[SchemaReview] = js.native
  def get(params: ParamsResourceReviewsGet, callback: BodyResponseCallback[SchemaReview]): Unit = js.native
  def get(
    params: ParamsResourceReviewsGet,
    options: BodyResponseCallback[Readable | SchemaReview],
    callback: BodyResponseCallback[Readable | SchemaReview]
  ): Unit = js.native
  def get(params: ParamsResourceReviewsGet, options: MethodOptions): GaxiosPromise[SchemaReview] = js.native
  def get(
    params: ParamsResourceReviewsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaReview]
  ): Unit = js.native
  /**
    * Gets a single review.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/androidpublisher.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const androidpublisher = google.androidpublisher('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/androidpublisher'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await androidpublisher.reviews.get({
    *     // Package name of the app.
    *     packageName: 'placeholder-value',
    *     // Unique identifier for a review.
    *     reviewId: 'placeholder-value',
    *     // Language localization code.
    *     translationLanguage: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "authorName": "my_authorName",
    *   //   "comments": [],
    *   //   "reviewId": "my_reviewId"
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
  def get(params: ParamsResourceReviewsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceReviewsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaReviewsListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaReviewsListResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaReviewsListResponse] = js.native
  def list(params: ParamsResourceReviewsList): GaxiosPromise[SchemaReviewsListResponse] = js.native
  def list(params: ParamsResourceReviewsList, callback: BodyResponseCallback[SchemaReviewsListResponse]): Unit = js.native
  def list(
    params: ParamsResourceReviewsList,
    options: BodyResponseCallback[Readable | SchemaReviewsListResponse],
    callback: BodyResponseCallback[Readable | SchemaReviewsListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceReviewsList, options: MethodOptions): GaxiosPromise[SchemaReviewsListResponse] = js.native
  def list(
    params: ParamsResourceReviewsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaReviewsListResponse]
  ): Unit = js.native
  /**
    * Lists all reviews.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/androidpublisher.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const androidpublisher = google.androidpublisher('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/androidpublisher'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await androidpublisher.reviews.list({
    *     // How many results the list operation should return.
    *     maxResults: 'placeholder-value',
    *     // Package name of the app.
    *     packageName: 'placeholder-value',
    *     // The index of the first element to return.
    *     startIndex: 'placeholder-value',
    *     // Pagination token. If empty, list starts at the first review.
    *     token: 'placeholder-value',
    *     // Language localization code.
    *     translationLanguage: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "pageInfo": {},
    *   //   "reviews": [],
    *   //   "tokenPagination": {}
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
  def list(params: ParamsResourceReviewsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceReviewsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def reply(): GaxiosPromise[SchemaReviewsReplyResponse] = js.native
  def reply(callback: BodyResponseCallback[SchemaReviewsReplyResponse]): Unit = js.native
  def reply(params: Unit, options: MethodOptions): GaxiosPromise[SchemaReviewsReplyResponse] = js.native
  def reply(params: ParamsResourceReviewsReply): GaxiosPromise[SchemaReviewsReplyResponse] = js.native
  def reply(params: ParamsResourceReviewsReply, callback: BodyResponseCallback[SchemaReviewsReplyResponse]): Unit = js.native
  def reply(
    params: ParamsResourceReviewsReply,
    options: BodyResponseCallback[Readable | SchemaReviewsReplyResponse],
    callback: BodyResponseCallback[Readable | SchemaReviewsReplyResponse]
  ): Unit = js.native
  def reply(params: ParamsResourceReviewsReply, options: MethodOptions): GaxiosPromise[SchemaReviewsReplyResponse] = js.native
  def reply(
    params: ParamsResourceReviewsReply,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaReviewsReplyResponse]
  ): Unit = js.native
  /**
    * Replies to a single review, or updates an existing reply.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/androidpublisher.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const androidpublisher = google.androidpublisher('v3');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/androidpublisher'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await androidpublisher.reviews.reply({
    *     // Package name of the app.
    *     packageName: 'placeholder-value',
    *     // Unique identifier for a review.
    *     reviewId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "replyText": "my_replyText"
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "result": {}
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
  def reply(params: ParamsResourceReviewsReply, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def reply(
    params: ParamsResourceReviewsReply,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
