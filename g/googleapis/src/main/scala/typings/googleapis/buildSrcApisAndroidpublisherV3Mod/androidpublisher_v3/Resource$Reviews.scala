package typings.googleapis.buildSrcApisAndroidpublisherV3Mod.androidpublisher_v3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/androidpublisher/v3", "androidpublisher_v3.Resource$Reviews")
@js.native
class Resource$Reviews protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * androidpublisher.reviews.get
    * @desc Returns a single review.
    * @alias androidpublisher.reviews.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.packageName Unique identifier for the Android app for which we want reviews; for example, "com.spiffygame".
    * @param {string} params.reviewId
    * @param {string=} params.translationLanguage
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Review] = js.native
  def get(callback: BodyResponseCallback[Schema$Review]): Unit = js.native
  def get(params: ParamsDollarResourceDollarReviewsDollarGet): GaxiosPromise[Schema$Review] = js.native
  def get(params: ParamsDollarResourceDollarReviewsDollarGet, callback: BodyResponseCallback[Schema$Review]): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarReviewsDollarGet,
    options: BodyResponseCallback[Schema$Review],
    callback: BodyResponseCallback[Schema$Review]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarReviewsDollarGet, options: MethodOptions): GaxiosPromise[Schema$Review] = js.native
  def get(
    params: ParamsDollarResourceDollarReviewsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Review]
  ): Unit = js.native
  /**
    * androidpublisher.reviews.list
    * @desc Returns a list of reviews. Only reviews from last week will be
    * returned.
    * @alias androidpublisher.reviews.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.maxResults
    * @param {string} params.packageName Unique identifier for the Android app for which we want reviews; for example, "com.spiffygame".
    * @param {integer=} params.startIndex
    * @param {string=} params.token
    * @param {string=} params.translationLanguage
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ReviewsListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ReviewsListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarReviewsDollarList): GaxiosPromise[Schema$ReviewsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarReviewsDollarList,
    callback: BodyResponseCallback[Schema$ReviewsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarReviewsDollarList,
    options: BodyResponseCallback[Schema$ReviewsListResponse],
    callback: BodyResponseCallback[Schema$ReviewsListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarReviewsDollarList, options: MethodOptions): GaxiosPromise[Schema$ReviewsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarReviewsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ReviewsListResponse]
  ): Unit = js.native
  /**
    * androidpublisher.reviews.reply
    * @desc Reply to a single review, or update an existing reply.
    * @alias androidpublisher.reviews.reply
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.packageName Unique identifier for the Android app for which we want reviews; for example, "com.spiffygame".
    * @param {string} params.reviewId
    * @param {().ReviewsReplyRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def reply(): GaxiosPromise[Schema$ReviewsReplyResponse] = js.native
  def reply(callback: BodyResponseCallback[Schema$ReviewsReplyResponse]): Unit = js.native
  def reply(params: ParamsDollarResourceDollarReviewsDollarReply): GaxiosPromise[Schema$ReviewsReplyResponse] = js.native
  def reply(
    params: ParamsDollarResourceDollarReviewsDollarReply,
    callback: BodyResponseCallback[Schema$ReviewsReplyResponse]
  ): Unit = js.native
  def reply(
    params: ParamsDollarResourceDollarReviewsDollarReply,
    options: BodyResponseCallback[Schema$ReviewsReplyResponse],
    callback: BodyResponseCallback[Schema$ReviewsReplyResponse]
  ): Unit = js.native
  def reply(params: ParamsDollarResourceDollarReviewsDollarReply, options: MethodOptions): GaxiosPromise[Schema$ReviewsReplyResponse] = js.native
  def reply(
    params: ParamsDollarResourceDollarReviewsDollarReply,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ReviewsReplyResponse]
  ): Unit = js.native
}

