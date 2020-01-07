package typings.googleapis.buildSrcApisDfareportingV3Dot2Mod.dfareporting_v3_2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dfareporting/v3.2", "dfareporting_v3_2.Resource$Videoformats")
@js.native
class Resource$Videoformats protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dfareporting.videoFormats.get
    * @desc Gets one video format by ID.
    * @alias dfareporting.videoFormats.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer} params.id Video format ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$VideoFormat] = js.native
  def get(callback: BodyResponseCallback[Schema$VideoFormat]): Unit = js.native
  def get(params: ParamsDollarResourceDollarVideoformatsDollarGet): GaxiosPromise[Schema$VideoFormat] = js.native
  def get(
    params: ParamsDollarResourceDollarVideoformatsDollarGet,
    callback: BodyResponseCallback[Schema$VideoFormat]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarVideoformatsDollarGet,
    options: BodyResponseCallback[Schema$VideoFormat],
    callback: BodyResponseCallback[Schema$VideoFormat]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarVideoformatsDollarGet, options: MethodOptions): GaxiosPromise[Schema$VideoFormat] = js.native
  def get(
    params: ParamsDollarResourceDollarVideoformatsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$VideoFormat]
  ): Unit = js.native
  /**
    * dfareporting.videoFormats.list
    * @desc Lists available video formats.
    * @alias dfareporting.videoFormats.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$VideoFormatsListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$VideoFormatsListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarVideoformatsDollarList): GaxiosPromise[Schema$VideoFormatsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarVideoformatsDollarList,
    callback: BodyResponseCallback[Schema$VideoFormatsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarVideoformatsDollarList,
    options: BodyResponseCallback[Schema$VideoFormatsListResponse],
    callback: BodyResponseCallback[Schema$VideoFormatsListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarVideoformatsDollarList, options: MethodOptions): GaxiosPromise[Schema$VideoFormatsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarVideoformatsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$VideoFormatsListResponse]
  ): Unit = js.native
}

