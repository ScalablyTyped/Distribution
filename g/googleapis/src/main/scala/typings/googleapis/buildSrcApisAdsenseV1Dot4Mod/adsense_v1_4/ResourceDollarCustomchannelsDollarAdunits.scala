package typings.googleapis.buildSrcApisAdsenseV1Dot4Mod.adsense_v1_4

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/adsense/v1.4", "adsense_v1_4.Resource$Customchannels$Adunits")
@js.native
class ResourceDollarCustomchannelsDollarAdunits protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * adsense.customchannels.adunits.list
    * @desc List all ad units in the specified custom channel.
    * @alias adsense.customchannels.adunits.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.adClientId Ad client which contains the custom channel.
    * @param {string} params.customChannelId Custom channel for which to list ad units.
    * @param {boolean=} params.includeInactive Whether to include inactive ad units. Default: true.
    * @param {integer=} params.maxResults The maximum number of ad units to include in the response, used for paging.
    * @param {string=} params.pageToken A continuation token, used to page through ad units. To retrieve the next page, set this parameter to the value of "nextPageToken" from the previous response.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$AdUnits] = js.native
  def list(callback: BodyResponseCallback[Schema$AdUnits]): Unit = js.native
  def list(params: ParamsDollarResourceDollarCustomchannelsDollarAdunitsDollarList): GaxiosPromise[Schema$AdUnits] = js.native
  def list(
    params: ParamsDollarResourceDollarCustomchannelsDollarAdunitsDollarList,
    callback: BodyResponseCallback[Schema$AdUnits]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarCustomchannelsDollarAdunitsDollarList,
    options: BodyResponseCallback[Schema$AdUnits],
    callback: BodyResponseCallback[Schema$AdUnits]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarCustomchannelsDollarAdunitsDollarList, options: MethodOptions): GaxiosPromise[Schema$AdUnits] = js.native
  def list(
    params: ParamsDollarResourceDollarCustomchannelsDollarAdunitsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AdUnits]
  ): Unit = js.native
}

