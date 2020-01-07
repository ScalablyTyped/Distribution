package typings.googleapis.buildSrcApisDfareportingV3Dot3Mod.dfareporting_v3_3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dfareporting/v3.3", "dfareporting_v3_3.Resource$Operatingsystemversions")
@js.native
class Resource$Operatingsystemversions protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dfareporting.operatingSystemVersions.get
    * @desc Gets one operating system version by ID.
    * @alias dfareporting.operatingSystemVersions.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Operating system version ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$OperatingSystemVersion] = js.native
  def get(callback: BodyResponseCallback[Schema$OperatingSystemVersion]): Unit = js.native
  def get(params: ParamsDollarResourceDollarOperatingsystemversionsDollarGet): GaxiosPromise[Schema$OperatingSystemVersion] = js.native
  def get(
    params: ParamsDollarResourceDollarOperatingsystemversionsDollarGet,
    callback: BodyResponseCallback[Schema$OperatingSystemVersion]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarOperatingsystemversionsDollarGet,
    options: BodyResponseCallback[Schema$OperatingSystemVersion],
    callback: BodyResponseCallback[Schema$OperatingSystemVersion]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarOperatingsystemversionsDollarGet, options: MethodOptions): GaxiosPromise[Schema$OperatingSystemVersion] = js.native
  def get(
    params: ParamsDollarResourceDollarOperatingsystemversionsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$OperatingSystemVersion]
  ): Unit = js.native
  /**
    * dfareporting.operatingSystemVersions.list
    * @desc Retrieves a list of operating system versions.
    * @alias dfareporting.operatingSystemVersions.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$OperatingSystemVersionsListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$OperatingSystemVersionsListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarOperatingsystemversionsDollarList): GaxiosPromise[Schema$OperatingSystemVersionsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarOperatingsystemversionsDollarList,
    callback: BodyResponseCallback[Schema$OperatingSystemVersionsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarOperatingsystemversionsDollarList,
    options: BodyResponseCallback[Schema$OperatingSystemVersionsListResponse],
    callback: BodyResponseCallback[Schema$OperatingSystemVersionsListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarOperatingsystemversionsDollarList, options: MethodOptions): GaxiosPromise[Schema$OperatingSystemVersionsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarOperatingsystemversionsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$OperatingSystemVersionsListResponse]
  ): Unit = js.native
}

