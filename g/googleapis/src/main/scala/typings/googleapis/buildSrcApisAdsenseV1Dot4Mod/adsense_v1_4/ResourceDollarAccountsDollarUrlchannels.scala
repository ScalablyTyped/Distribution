package typings.googleapis.buildSrcApisAdsenseV1Dot4Mod.adsense_v1_4

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/adsense/v1.4", "adsense_v1_4.Resource$Accounts$Urlchannels")
@js.native
class ResourceDollarAccountsDollarUrlchannels protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * adsense.accounts.urlchannels.list
    * @desc List all URL channels in the specified ad client for the specified
    * account.
    * @alias adsense.accounts.urlchannels.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account to which the ad client belongs.
    * @param {string} params.adClientId Ad client for which to list URL channels.
    * @param {integer=} params.maxResults The maximum number of URL channels to include in the response, used for paging.
    * @param {string=} params.pageToken A continuation token, used to page through URL channels. To retrieve the next page, set this parameter to the value of "nextPageToken" from the previous response.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$UrlChannels] = js.native
  def list(callback: BodyResponseCallback[Schema$UrlChannels]): Unit = js.native
  def list(params: ParamsDollarResourceDollarAccountsDollarUrlchannelsDollarList): GaxiosPromise[Schema$UrlChannels] = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarUrlchannelsDollarList,
    callback: BodyResponseCallback[Schema$UrlChannels]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarUrlchannelsDollarList,
    options: BodyResponseCallback[Schema$UrlChannels],
    callback: BodyResponseCallback[Schema$UrlChannels]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarAccountsDollarUrlchannelsDollarList, options: MethodOptions): GaxiosPromise[Schema$UrlChannels] = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarUrlchannelsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$UrlChannels]
  ): Unit = js.native
}

