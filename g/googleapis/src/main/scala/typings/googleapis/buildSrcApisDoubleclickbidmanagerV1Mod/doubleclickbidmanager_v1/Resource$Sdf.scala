package typings.googleapis.buildSrcApisDoubleclickbidmanagerV1Mod.doubleclickbidmanager_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/doubleclickbidmanager/v1", "doubleclickbidmanager_v1.Resource$Sdf")
@js.native
class Resource$Sdf protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * doubleclickbidmanager.sdf.download
    * @desc Retrieves entities in SDF format.
    * @alias doubleclickbidmanager.sdf.download
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().DownloadRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def download(): GaxiosPromise[Schema$DownloadResponse] = js.native
  def download(callback: BodyResponseCallback[Schema$DownloadResponse]): Unit = js.native
  def download(params: ParamsDollarResourceDollarSdfDollarDownload): GaxiosPromise[Schema$DownloadResponse] = js.native
  def download(
    params: ParamsDollarResourceDollarSdfDollarDownload,
    callback: BodyResponseCallback[Schema$DownloadResponse]
  ): Unit = js.native
  def download(
    params: ParamsDollarResourceDollarSdfDollarDownload,
    options: BodyResponseCallback[Schema$DownloadResponse],
    callback: BodyResponseCallback[Schema$DownloadResponse]
  ): Unit = js.native
  def download(params: ParamsDollarResourceDollarSdfDollarDownload, options: MethodOptions): GaxiosPromise[Schema$DownloadResponse] = js.native
  def download(
    params: ParamsDollarResourceDollarSdfDollarDownload,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$DownloadResponse]
  ): Unit = js.native
}

