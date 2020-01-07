package typings.googleapis.buildSrcApisDfareportingV3Dot3Mod.dfareporting_v3_3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dfareporting/v3.3", "dfareporting_v3_3.Resource$Metros")
@js.native
class Resource$Metros protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dfareporting.metros.list
    * @desc Retrieves a list of metros.
    * @alias dfareporting.metros.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$MetrosListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$MetrosListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarMetrosDollarList): GaxiosPromise[Schema$MetrosListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarMetrosDollarList,
    callback: BodyResponseCallback[Schema$MetrosListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarMetrosDollarList,
    options: BodyResponseCallback[Schema$MetrosListResponse],
    callback: BodyResponseCallback[Schema$MetrosListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarMetrosDollarList, options: MethodOptions): GaxiosPromise[Schema$MetrosListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarMetrosDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$MetrosListResponse]
  ): Unit = js.native
}

