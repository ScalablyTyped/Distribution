package typings.googleapis.buildSrcApisYoutubereportingV1Mod.youtubereporting_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/youtubereporting/v1", "youtubereporting_v1.Resource$Media")
@js.native
class Resource$Media protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * youtubereporting.media.download
    * @desc Method for media download. Download is supported on the URI
    * `/v1/media/{+name}?alt=media`.
    * @alias youtubereporting.media.download
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resourceName Name of the media that is being downloaded.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def download(): GaxiosPromise[Schema$GdataMedia] = js.native
  def download(callback: BodyResponseCallback[Schema$GdataMedia]): Unit = js.native
  def download(params: ParamsDollarResourceDollarMediaDollarDownload): GaxiosPromise[Schema$GdataMedia] = js.native
  def download(
    params: ParamsDollarResourceDollarMediaDollarDownload,
    callback: BodyResponseCallback[Schema$GdataMedia]
  ): Unit = js.native
  def download(
    params: ParamsDollarResourceDollarMediaDollarDownload,
    options: BodyResponseCallback[Schema$GdataMedia],
    callback: BodyResponseCallback[Schema$GdataMedia]
  ): Unit = js.native
  def download(params: ParamsDollarResourceDollarMediaDollarDownload, options: MethodOptions): GaxiosPromise[Schema$GdataMedia] = js.native
  def download(
    params: ParamsDollarResourceDollarMediaDollarDownload,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GdataMedia]
  ): Unit = js.native
}

