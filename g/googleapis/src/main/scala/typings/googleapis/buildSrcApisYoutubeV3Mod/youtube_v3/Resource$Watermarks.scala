package typings.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/youtube/v3", "youtube_v3.Resource$Watermarks")
@js.native
class Resource$Watermarks protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * youtube.watermarks.set
    * @desc Uploads a watermark image to YouTube and sets it for a channel.
    * @alias youtube.watermarks.set
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.channelId The channelId parameter specifies the YouTube channel ID for which the watermark is being provided.
    * @param {string=} params.onBehalfOfContentOwner Note: This parameter is intended exclusively for YouTube content partners.  The onBehalfOfContentOwner parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner.
    * @param  {object} params.resource Media resource metadata
    * @param {object} params.media Media object
    * @param {string} params.media.mimeType Media mime-type
    * @param {string|object} params.media.body Media body contents
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def set(): GaxiosPromise[Unit] = js.native
  def set(callback: BodyResponseCallback[Unit]): Unit = js.native
  def set(params: ParamsDollarResourceDollarWatermarksDollarSet): GaxiosPromise[Unit] = js.native
  def set(params: ParamsDollarResourceDollarWatermarksDollarSet, callback: BodyResponseCallback[Unit]): Unit = js.native
  def set(
    params: ParamsDollarResourceDollarWatermarksDollarSet,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def set(params: ParamsDollarResourceDollarWatermarksDollarSet, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def set(
    params: ParamsDollarResourceDollarWatermarksDollarSet,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * youtube.watermarks.unset
    * @desc Deletes a channel's watermark image.
    * @alias youtube.watermarks.unset
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.channelId The channelId parameter specifies the YouTube channel ID for which the watermark is being unset.
    * @param {string=} params.onBehalfOfContentOwner Note: This parameter is intended exclusively for YouTube content partners.  The onBehalfOfContentOwner parameter indicates that the request's authorization credentials identify a YouTube CMS user who is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The CMS account that the user authenticates with must be linked to the specified YouTube content owner.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def unset(): GaxiosPromise[Unit] = js.native
  def unset(callback: BodyResponseCallback[Unit]): Unit = js.native
  def unset(params: ParamsDollarResourceDollarWatermarksDollarUnset): GaxiosPromise[Unit] = js.native
  def unset(params: ParamsDollarResourceDollarWatermarksDollarUnset, callback: BodyResponseCallback[Unit]): Unit = js.native
  def unset(
    params: ParamsDollarResourceDollarWatermarksDollarUnset,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def unset(params: ParamsDollarResourceDollarWatermarksDollarUnset, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def unset(
    params: ParamsDollarResourceDollarWatermarksDollarUnset,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
}

