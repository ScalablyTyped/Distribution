package typings.googleapis.buildSrcApisDfareportingV3Dot3Mod.dfareporting_v3_3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dfareporting/v3.3", "dfareporting_v3_3.Resource$Regions")
@js.native
class Resource$Regions protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dfareporting.regions.list
    * @desc Retrieves a list of regions.
    * @alias dfareporting.regions.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$RegionsListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$RegionsListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarRegionsDollarList): GaxiosPromise[Schema$RegionsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarRegionsDollarList,
    callback: BodyResponseCallback[Schema$RegionsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarRegionsDollarList,
    options: BodyResponseCallback[Schema$RegionsListResponse],
    callback: BodyResponseCallback[Schema$RegionsListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarRegionsDollarList, options: MethodOptions): GaxiosPromise[Schema$RegionsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarRegionsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$RegionsListResponse]
  ): Unit = js.native
}

