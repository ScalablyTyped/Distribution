package typings.googleapis.buildSrcApisDfareportingV3Dot3Mod.dfareporting_v3_3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dfareporting/v3.3", "dfareporting_v3_3.Resource$Operatingsystems")
@js.native
class Resource$Operatingsystems protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dfareporting.operatingSystems.get
    * @desc Gets one operating system by DART ID.
    * @alias dfareporting.operatingSystems.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.dartId Operating system DART ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$OperatingSystem] = js.native
  def get(callback: BodyResponseCallback[Schema$OperatingSystem]): Unit = js.native
  def get(params: ParamsDollarResourceDollarOperatingsystemsDollarGet): GaxiosPromise[Schema$OperatingSystem] = js.native
  def get(
    params: ParamsDollarResourceDollarOperatingsystemsDollarGet,
    callback: BodyResponseCallback[Schema$OperatingSystem]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarOperatingsystemsDollarGet,
    options: BodyResponseCallback[Schema$OperatingSystem],
    callback: BodyResponseCallback[Schema$OperatingSystem]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarOperatingsystemsDollarGet, options: MethodOptions): GaxiosPromise[Schema$OperatingSystem] = js.native
  def get(
    params: ParamsDollarResourceDollarOperatingsystemsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$OperatingSystem]
  ): Unit = js.native
  /**
    * dfareporting.operatingSystems.list
    * @desc Retrieves a list of operating systems.
    * @alias dfareporting.operatingSystems.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$OperatingSystemsListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$OperatingSystemsListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarOperatingsystemsDollarList): GaxiosPromise[Schema$OperatingSystemsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarOperatingsystemsDollarList,
    callback: BodyResponseCallback[Schema$OperatingSystemsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarOperatingsystemsDollarList,
    options: BodyResponseCallback[Schema$OperatingSystemsListResponse],
    callback: BodyResponseCallback[Schema$OperatingSystemsListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarOperatingsystemsDollarList, options: MethodOptions): GaxiosPromise[Schema$OperatingSystemsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarOperatingsystemsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$OperatingSystemsListResponse]
  ): Unit = js.native
}

