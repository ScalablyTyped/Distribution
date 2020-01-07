package typings.googleapis.buildSrcApisPlusDomainsV1Mod.plusDomains_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/plusDomains/v1", "plusDomains_v1.Resource$Circles")
@js.native
class Resource$Circles protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * plusDomains.circles.list
    * @desc Shut down. See https://developers.google.com/+/api-shutdown for
    * more details.
    * @alias plusDomains.circles.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.maxResults The maximum number of circles to include in the response, which is used for paging. For any response, the actual number returned might be less than the specified maxResults.
    * @param {string=} params.pageToken The continuation token, which is used to page through large result sets. To get the next page of results, set this parameter to the value of "nextPageToken" from the previous response.
    * @param {string} params.userId The ID of the user to get circles for. The special value "me" can be used to indicate the authenticated user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$CircleFeed] = js.native
  def list(callback: BodyResponseCallback[Schema$CircleFeed]): Unit = js.native
  def list(params: ParamsDollarResourceDollarCirclesDollarList): GaxiosPromise[Schema$CircleFeed] = js.native
  def list(
    params: ParamsDollarResourceDollarCirclesDollarList,
    callback: BodyResponseCallback[Schema$CircleFeed]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarCirclesDollarList,
    options: BodyResponseCallback[Schema$CircleFeed],
    callback: BodyResponseCallback[Schema$CircleFeed]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarCirclesDollarList, options: MethodOptions): GaxiosPromise[Schema$CircleFeed] = js.native
  def list(
    params: ParamsDollarResourceDollarCirclesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$CircleFeed]
  ): Unit = js.native
}

