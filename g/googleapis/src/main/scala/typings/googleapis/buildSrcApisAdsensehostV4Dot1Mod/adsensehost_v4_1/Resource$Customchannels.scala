package typings.googleapis.buildSrcApisAdsensehostV4Dot1Mod.adsensehost_v4_1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/adsensehost/v4.1", "adsensehost_v4_1.Resource$Customchannels")
@js.native
class Resource$Customchannels protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * adsensehost.customchannels.delete
    * @desc Delete a specific custom channel from the host AdSense account.
    * @alias adsensehost.customchannels.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.adClientId Ad client from which to delete the custom channel.
    * @param {string} params.customChannelId Custom channel to delete.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$CustomChannel] = js.native
  def delete(callback: BodyResponseCallback[Schema$CustomChannel]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarCustomchannelsDollarDelete): GaxiosPromise[Schema$CustomChannel] = js.native
  def delete(
    params: ParamsDollarResourceDollarCustomchannelsDollarDelete,
    callback: BodyResponseCallback[Schema$CustomChannel]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarCustomchannelsDollarDelete,
    options: BodyResponseCallback[Schema$CustomChannel],
    callback: BodyResponseCallback[Schema$CustomChannel]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarCustomchannelsDollarDelete, options: MethodOptions): GaxiosPromise[Schema$CustomChannel] = js.native
  def delete(
    params: ParamsDollarResourceDollarCustomchannelsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$CustomChannel]
  ): Unit = js.native
  /**
    * adsensehost.customchannels.get
    * @desc Get a specific custom channel from the host AdSense account.
    * @alias adsensehost.customchannels.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.adClientId Ad client from which to get the custom channel.
    * @param {string} params.customChannelId Custom channel to get.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$CustomChannel] = js.native
  def get(callback: BodyResponseCallback[Schema$CustomChannel]): Unit = js.native
  def get(params: ParamsDollarResourceDollarCustomchannelsDollarGet): GaxiosPromise[Schema$CustomChannel] = js.native
  def get(
    params: ParamsDollarResourceDollarCustomchannelsDollarGet,
    callback: BodyResponseCallback[Schema$CustomChannel]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarCustomchannelsDollarGet,
    options: BodyResponseCallback[Schema$CustomChannel],
    callback: BodyResponseCallback[Schema$CustomChannel]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarCustomchannelsDollarGet, options: MethodOptions): GaxiosPromise[Schema$CustomChannel] = js.native
  def get(
    params: ParamsDollarResourceDollarCustomchannelsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$CustomChannel]
  ): Unit = js.native
  /**
    * adsensehost.customchannels.insert
    * @desc Add a new custom channel to the host AdSense account.
    * @alias adsensehost.customchannels.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.adClientId Ad client to which the new custom channel will be added.
    * @param {().CustomChannel} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$CustomChannel] = js.native
  def insert(callback: BodyResponseCallback[Schema$CustomChannel]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarCustomchannelsDollarInsert): GaxiosPromise[Schema$CustomChannel] = js.native
  def insert(
    params: ParamsDollarResourceDollarCustomchannelsDollarInsert,
    callback: BodyResponseCallback[Schema$CustomChannel]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarCustomchannelsDollarInsert,
    options: BodyResponseCallback[Schema$CustomChannel],
    callback: BodyResponseCallback[Schema$CustomChannel]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarCustomchannelsDollarInsert, options: MethodOptions): GaxiosPromise[Schema$CustomChannel] = js.native
  def insert(
    params: ParamsDollarResourceDollarCustomchannelsDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$CustomChannel]
  ): Unit = js.native
  /**
    * adsensehost.customchannels.list
    * @desc List all host custom channels in this AdSense account.
    * @alias adsensehost.customchannels.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.adClientId Ad client for which to list custom channels.
    * @param {integer=} params.maxResults The maximum number of custom channels to include in the response, used for paging.
    * @param {string=} params.pageToken A continuation token, used to page through custom channels. To retrieve the next page, set this parameter to the value of "nextPageToken" from the previous response.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$CustomChannels] = js.native
  def list(callback: BodyResponseCallback[Schema$CustomChannels]): Unit = js.native
  def list(params: ParamsDollarResourceDollarCustomchannelsDollarList): GaxiosPromise[Schema$CustomChannels] = js.native
  def list(
    params: ParamsDollarResourceDollarCustomchannelsDollarList,
    callback: BodyResponseCallback[Schema$CustomChannels]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarCustomchannelsDollarList,
    options: BodyResponseCallback[Schema$CustomChannels],
    callback: BodyResponseCallback[Schema$CustomChannels]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarCustomchannelsDollarList, options: MethodOptions): GaxiosPromise[Schema$CustomChannels] = js.native
  def list(
    params: ParamsDollarResourceDollarCustomchannelsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$CustomChannels]
  ): Unit = js.native
  /**
    * adsensehost.customchannels.patch
    * @desc Update a custom channel in the host AdSense account. This method
    * supports patch semantics.
    * @alias adsensehost.customchannels.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.adClientId Ad client in which the custom channel will be updated.
    * @param {string} params.customChannelId Custom channel to get.
    * @param {().CustomChannel} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$CustomChannel] = js.native
  def patch(callback: BodyResponseCallback[Schema$CustomChannel]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarCustomchannelsDollarPatch): GaxiosPromise[Schema$CustomChannel] = js.native
  def patch(
    params: ParamsDollarResourceDollarCustomchannelsDollarPatch,
    callback: BodyResponseCallback[Schema$CustomChannel]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarCustomchannelsDollarPatch,
    options: BodyResponseCallback[Schema$CustomChannel],
    callback: BodyResponseCallback[Schema$CustomChannel]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarCustomchannelsDollarPatch, options: MethodOptions): GaxiosPromise[Schema$CustomChannel] = js.native
  def patch(
    params: ParamsDollarResourceDollarCustomchannelsDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$CustomChannel]
  ): Unit = js.native
  /**
    * adsensehost.customchannels.update
    * @desc Update a custom channel in the host AdSense account.
    * @alias adsensehost.customchannels.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.adClientId Ad client in which the custom channel will be updated.
    * @param {().CustomChannel} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$CustomChannel] = js.native
  def update(callback: BodyResponseCallback[Schema$CustomChannel]): Unit = js.native
  def update(params: ParamsDollarResourceDollarCustomchannelsDollarUpdate): GaxiosPromise[Schema$CustomChannel] = js.native
  def update(
    params: ParamsDollarResourceDollarCustomchannelsDollarUpdate,
    callback: BodyResponseCallback[Schema$CustomChannel]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarCustomchannelsDollarUpdate,
    options: BodyResponseCallback[Schema$CustomChannel],
    callback: BodyResponseCallback[Schema$CustomChannel]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarCustomchannelsDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$CustomChannel] = js.native
  def update(
    params: ParamsDollarResourceDollarCustomchannelsDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$CustomChannel]
  ): Unit = js.native
}

