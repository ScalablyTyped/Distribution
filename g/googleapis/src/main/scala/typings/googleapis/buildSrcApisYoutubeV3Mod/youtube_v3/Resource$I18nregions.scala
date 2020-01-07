package typings.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/youtube/v3", "youtube_v3.Resource$I18nregions")
@js.native
class Resource$I18nregions protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * youtube.i18nRegions.list
    * @desc Returns a list of content regions that the YouTube website
    * supports.
    * @alias youtube.i18nRegions.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.hl The hl parameter specifies the language that should be used for text values in the API response.
    * @param {string} params.part The part parameter specifies the i18nRegion resource properties that the API response will include. Set the parameter value to snippet.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$I18nRegionListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$I18nRegionListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarI18nregionsDollarList): GaxiosPromise[Schema$I18nRegionListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarI18nregionsDollarList,
    callback: BodyResponseCallback[Schema$I18nRegionListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarI18nregionsDollarList,
    options: BodyResponseCallback[Schema$I18nRegionListResponse],
    callback: BodyResponseCallback[Schema$I18nRegionListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarI18nregionsDollarList, options: MethodOptions): GaxiosPromise[Schema$I18nRegionListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarI18nregionsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$I18nRegionListResponse]
  ): Unit = js.native
}

