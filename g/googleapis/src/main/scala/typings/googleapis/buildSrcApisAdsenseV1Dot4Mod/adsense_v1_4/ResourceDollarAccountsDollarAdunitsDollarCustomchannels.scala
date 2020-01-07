package typings.googleapis.buildSrcApisAdsenseV1Dot4Mod.adsense_v1_4

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/adsense/v1.4", "adsense_v1_4.Resource$Accounts$Adunits$Customchannels")
@js.native
class ResourceDollarAccountsDollarAdunitsDollarCustomchannels protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * adsense.accounts.adunits.customchannels.list
    * @desc List all custom channels which the specified ad unit belongs to.
    * @alias adsense.accounts.adunits.customchannels.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account to which the ad client belongs.
    * @param {string} params.adClientId Ad client which contains the ad unit.
    * @param {string} params.adUnitId Ad unit for which to list custom channels.
    * @param {integer=} params.maxResults The maximum number of custom channels to include in the response, used for paging.
    * @param {string=} params.pageToken A continuation token, used to page through custom channels. To retrieve the next page, set this parameter to the value of "nextPageToken" from the previous response.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$CustomChannels] = js.native
  def list(callback: BodyResponseCallback[Schema$CustomChannels]): Unit = js.native
  def list(params: ParamsDollarResourceDollarAccountsDollarAdunitsDollarCustomchannelsDollarList): GaxiosPromise[Schema$CustomChannels] = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarAdunitsDollarCustomchannelsDollarList,
    callback: BodyResponseCallback[Schema$CustomChannels]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarAdunitsDollarCustomchannelsDollarList,
    options: BodyResponseCallback[Schema$CustomChannels],
    callback: BodyResponseCallback[Schema$CustomChannels]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarAdunitsDollarCustomchannelsDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$CustomChannels] = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarAdunitsDollarCustomchannelsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$CustomChannels]
  ): Unit = js.native
}

