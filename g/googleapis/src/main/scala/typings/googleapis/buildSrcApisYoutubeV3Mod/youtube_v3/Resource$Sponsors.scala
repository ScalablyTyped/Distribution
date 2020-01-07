package typings.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/youtube/v3", "youtube_v3.Resource$Sponsors")
@js.native
class Resource$Sponsors protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * youtube.sponsors.list
    * @desc Lists sponsors for a channel.
    * @alias youtube.sponsors.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter The filter parameter specifies which channel sponsors to return.
    * @param {integer=} params.maxResults The maxResults parameter specifies the maximum number of items that should be returned in the result set.
    * @param {string=} params.pageToken The pageToken parameter identifies a specific page in the result set that should be returned. In an API response, the nextPageToken and prevPageToken properties identify other pages that could be retrieved.
    * @param {string} params.part The part parameter specifies the sponsor resource parts that the API response will include. Supported values are id and snippet.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$SponsorListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$SponsorListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarSponsorsDollarList): GaxiosPromise[Schema$SponsorListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarSponsorsDollarList,
    callback: BodyResponseCallback[Schema$SponsorListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarSponsorsDollarList,
    options: BodyResponseCallback[Schema$SponsorListResponse],
    callback: BodyResponseCallback[Schema$SponsorListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarSponsorsDollarList, options: MethodOptions): GaxiosPromise[Schema$SponsorListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarSponsorsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$SponsorListResponse]
  ): Unit = js.native
}

