package typings.googleapis.buildSrcApisPlusDomainsV1Mod.plusDomains_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/plusDomains/v1", "plusDomains_v1.Resource$Comments")
@js.native
class Resource$Comments protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * plusDomains.comments.get
    * @desc Shut down. See https://developers.google.com/+/api-shutdown for
    * more details.
    * @alias plusDomains.comments.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.commentId The ID of the comment to get.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Comment] = js.native
  def get(callback: BodyResponseCallback[Schema$Comment]): Unit = js.native
  def get(params: ParamsDollarResourceDollarCommentsDollarGet): GaxiosPromise[Schema$Comment] = js.native
  def get(
    params: ParamsDollarResourceDollarCommentsDollarGet,
    callback: BodyResponseCallback[Schema$Comment]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarCommentsDollarGet,
    options: BodyResponseCallback[Schema$Comment],
    callback: BodyResponseCallback[Schema$Comment]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarCommentsDollarGet, options: MethodOptions): GaxiosPromise[Schema$Comment] = js.native
  def get(
    params: ParamsDollarResourceDollarCommentsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Comment]
  ): Unit = js.native
  /**
    * plusDomains.comments.list
    * @desc Shut down. See https://developers.google.com/+/api-shutdown for
    * more details.
    * @alias plusDomains.comments.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.activityId The ID of the activity to get comments for.
    * @param {integer=} params.maxResults The maximum number of comments to include in the response, which is used for paging. For any response, the actual number returned might be less than the specified maxResults.
    * @param {string=} params.pageToken The continuation token, which is used to page through large result sets. To get the next page of results, set this parameter to the value of "nextPageToken" from the previous response.
    * @param {string=} params.sortOrder The order in which to sort the list of comments.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$CommentFeed] = js.native
  def list(callback: BodyResponseCallback[Schema$CommentFeed]): Unit = js.native
  def list(params: ParamsDollarResourceDollarCommentsDollarList): GaxiosPromise[Schema$CommentFeed] = js.native
  def list(
    params: ParamsDollarResourceDollarCommentsDollarList,
    callback: BodyResponseCallback[Schema$CommentFeed]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarCommentsDollarList,
    options: BodyResponseCallback[Schema$CommentFeed],
    callback: BodyResponseCallback[Schema$CommentFeed]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarCommentsDollarList, options: MethodOptions): GaxiosPromise[Schema$CommentFeed] = js.native
  def list(
    params: ParamsDollarResourceDollarCommentsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$CommentFeed]
  ): Unit = js.native
}

