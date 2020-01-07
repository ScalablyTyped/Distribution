package typings.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/youtube/v3", "youtube_v3.Resource$Videoabusereportreasons")
@js.native
class Resource$Videoabusereportreasons protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * youtube.videoAbuseReportReasons.list
    * @desc Returns a list of abuse reasons that can be used for reporting
    * abusive videos.
    * @alias youtube.videoAbuseReportReasons.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.hl The hl parameter specifies the language that should be used for text values in the API response.
    * @param {string} params.part The part parameter specifies the videoCategory resource parts that the API response will include. Supported values are id and snippet.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$VideoAbuseReportReasonListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$VideoAbuseReportReasonListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarVideoabusereportreasonsDollarList): GaxiosPromise[Schema$VideoAbuseReportReasonListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarVideoabusereportreasonsDollarList,
    callback: BodyResponseCallback[Schema$VideoAbuseReportReasonListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarVideoabusereportreasonsDollarList,
    options: BodyResponseCallback[Schema$VideoAbuseReportReasonListResponse],
    callback: BodyResponseCallback[Schema$VideoAbuseReportReasonListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarVideoabusereportreasonsDollarList, options: MethodOptions): GaxiosPromise[Schema$VideoAbuseReportReasonListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarVideoabusereportreasonsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$VideoAbuseReportReasonListResponse]
  ): Unit = js.native
}

