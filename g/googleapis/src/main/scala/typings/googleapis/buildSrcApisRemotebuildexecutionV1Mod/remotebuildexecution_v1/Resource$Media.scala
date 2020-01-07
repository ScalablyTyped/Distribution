package typings.googleapis.buildSrcApisRemotebuildexecutionV1Mod.remotebuildexecution_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/remotebuildexecution/v1", "remotebuildexecution_v1.Resource$Media")
@js.native
class Resource$Media protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * remotebuildexecution.media.download
    * @desc Downloads media. Download is supported on the URI
    * `/v1/media/{+name}?alt=media`.
    * @alias remotebuildexecution.media.download
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resourceName Name of the media that is being downloaded.  See ReadRequest.resource_name.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def download(): GaxiosPromise[Schema$GoogleBytestreamMedia] = js.native
  def download(callback: BodyResponseCallback[Schema$GoogleBytestreamMedia]): Unit = js.native
  def download(params: ParamsDollarResourceDollarMediaDollarDownload): GaxiosPromise[Schema$GoogleBytestreamMedia] = js.native
  def download(
    params: ParamsDollarResourceDollarMediaDollarDownload,
    callback: BodyResponseCallback[Schema$GoogleBytestreamMedia]
  ): Unit = js.native
  def download(
    params: ParamsDollarResourceDollarMediaDollarDownload,
    options: BodyResponseCallback[Schema$GoogleBytestreamMedia],
    callback: BodyResponseCallback[Schema$GoogleBytestreamMedia]
  ): Unit = js.native
  def download(params: ParamsDollarResourceDollarMediaDollarDownload, options: MethodOptions): GaxiosPromise[Schema$GoogleBytestreamMedia] = js.native
  def download(
    params: ParamsDollarResourceDollarMediaDollarDownload,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleBytestreamMedia]
  ): Unit = js.native
  /**
    * remotebuildexecution.media.upload
    * @desc Uploads media. Upload is supported on the URI
    * `/upload/v1/media/{+name}`.
    * @alias remotebuildexecution.media.upload
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resourceName Name of the media that is being downloaded.  See ReadRequest.resource_name.
    * @param  {object} params.resource Media resource metadata
    * @param {object} params.media Media object
    * @param {string} params.media.mimeType Media mime-type
    * @param {string|object} params.media.body Media body contents
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def upload(): GaxiosPromise[Schema$GoogleBytestreamMedia] = js.native
  def upload(callback: BodyResponseCallback[Schema$GoogleBytestreamMedia]): Unit = js.native
  def upload(params: ParamsDollarResourceDollarMediaDollarUpload): GaxiosPromise[Schema$GoogleBytestreamMedia] = js.native
  def upload(
    params: ParamsDollarResourceDollarMediaDollarUpload,
    callback: BodyResponseCallback[Schema$GoogleBytestreamMedia]
  ): Unit = js.native
  def upload(
    params: ParamsDollarResourceDollarMediaDollarUpload,
    options: BodyResponseCallback[Schema$GoogleBytestreamMedia],
    callback: BodyResponseCallback[Schema$GoogleBytestreamMedia]
  ): Unit = js.native
  def upload(params: ParamsDollarResourceDollarMediaDollarUpload, options: MethodOptions): GaxiosPromise[Schema$GoogleBytestreamMedia] = js.native
  def upload(
    params: ParamsDollarResourceDollarMediaDollarUpload,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleBytestreamMedia]
  ): Unit = js.native
}

