package typings.googleapis.buildSrcApisAdsensehostV4Dot1Mod.adsensehost_v4_1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/adsensehost/v4.1", "adsensehost_v4_1.Resource$Urlchannels")
@js.native
class Resource$Urlchannels protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * adsensehost.urlchannels.delete
    * @desc Delete a URL channel from the host AdSense account.
    * @alias adsensehost.urlchannels.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.adClientId Ad client from which to delete the URL channel.
    * @param {string} params.urlChannelId URL channel to delete.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$UrlChannel] = js.native
  def delete(callback: BodyResponseCallback[Schema$UrlChannel]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarUrlchannelsDollarDelete): GaxiosPromise[Schema$UrlChannel] = js.native
  def delete(
    params: ParamsDollarResourceDollarUrlchannelsDollarDelete,
    callback: BodyResponseCallback[Schema$UrlChannel]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarUrlchannelsDollarDelete,
    options: BodyResponseCallback[Schema$UrlChannel],
    callback: BodyResponseCallback[Schema$UrlChannel]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarUrlchannelsDollarDelete, options: MethodOptions): GaxiosPromise[Schema$UrlChannel] = js.native
  def delete(
    params: ParamsDollarResourceDollarUrlchannelsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$UrlChannel]
  ): Unit = js.native
  /**
    * adsensehost.urlchannels.insert
    * @desc Add a new URL channel to the host AdSense account.
    * @alias adsensehost.urlchannels.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.adClientId Ad client to which the new URL channel will be added.
    * @param {().UrlChannel} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$UrlChannel] = js.native
  def insert(callback: BodyResponseCallback[Schema$UrlChannel]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarUrlchannelsDollarInsert): GaxiosPromise[Schema$UrlChannel] = js.native
  def insert(
    params: ParamsDollarResourceDollarUrlchannelsDollarInsert,
    callback: BodyResponseCallback[Schema$UrlChannel]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarUrlchannelsDollarInsert,
    options: BodyResponseCallback[Schema$UrlChannel],
    callback: BodyResponseCallback[Schema$UrlChannel]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarUrlchannelsDollarInsert, options: MethodOptions): GaxiosPromise[Schema$UrlChannel] = js.native
  def insert(
    params: ParamsDollarResourceDollarUrlchannelsDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$UrlChannel]
  ): Unit = js.native
  /**
    * adsensehost.urlchannels.list
    * @desc List all host URL channels in the host AdSense account.
    * @alias adsensehost.urlchannels.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.adClientId Ad client for which to list URL channels.
    * @param {integer=} params.maxResults The maximum number of URL channels to include in the response, used for paging.
    * @param {string=} params.pageToken A continuation token, used to page through URL channels. To retrieve the next page, set this parameter to the value of "nextPageToken" from the previous response.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$UrlChannels] = js.native
  def list(callback: BodyResponseCallback[Schema$UrlChannels]): Unit = js.native
  def list(params: ParamsDollarResourceDollarUrlchannelsDollarList): GaxiosPromise[Schema$UrlChannels] = js.native
  def list(
    params: ParamsDollarResourceDollarUrlchannelsDollarList,
    callback: BodyResponseCallback[Schema$UrlChannels]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarUrlchannelsDollarList,
    options: BodyResponseCallback[Schema$UrlChannels],
    callback: BodyResponseCallback[Schema$UrlChannels]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarUrlchannelsDollarList, options: MethodOptions): GaxiosPromise[Schema$UrlChannels] = js.native
  def list(
    params: ParamsDollarResourceDollarUrlchannelsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$UrlChannels]
  ): Unit = js.native
}

