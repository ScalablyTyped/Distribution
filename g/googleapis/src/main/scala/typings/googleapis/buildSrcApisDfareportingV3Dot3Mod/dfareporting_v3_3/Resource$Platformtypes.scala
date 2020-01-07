package typings.googleapis.buildSrcApisDfareportingV3Dot3Mod.dfareporting_v3_3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dfareporting/v3.3", "dfareporting_v3_3.Resource$Platformtypes")
@js.native
class Resource$Platformtypes protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dfareporting.platformTypes.get
    * @desc Gets one platform type by ID.
    * @alias dfareporting.platformTypes.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Platform type ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$PlatformType] = js.native
  def get(callback: BodyResponseCallback[Schema$PlatformType]): Unit = js.native
  def get(params: ParamsDollarResourceDollarPlatformtypesDollarGet): GaxiosPromise[Schema$PlatformType] = js.native
  def get(
    params: ParamsDollarResourceDollarPlatformtypesDollarGet,
    callback: BodyResponseCallback[Schema$PlatformType]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarPlatformtypesDollarGet,
    options: BodyResponseCallback[Schema$PlatformType],
    callback: BodyResponseCallback[Schema$PlatformType]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarPlatformtypesDollarGet, options: MethodOptions): GaxiosPromise[Schema$PlatformType] = js.native
  def get(
    params: ParamsDollarResourceDollarPlatformtypesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$PlatformType]
  ): Unit = js.native
  /**
    * dfareporting.platformTypes.list
    * @desc Retrieves a list of platform types.
    * @alias dfareporting.platformTypes.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$PlatformTypesListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$PlatformTypesListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarPlatformtypesDollarList): GaxiosPromise[Schema$PlatformTypesListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarPlatformtypesDollarList,
    callback: BodyResponseCallback[Schema$PlatformTypesListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarPlatformtypesDollarList,
    options: BodyResponseCallback[Schema$PlatformTypesListResponse],
    callback: BodyResponseCallback[Schema$PlatformTypesListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarPlatformtypesDollarList, options: MethodOptions): GaxiosPromise[Schema$PlatformTypesListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarPlatformtypesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$PlatformTypesListResponse]
  ): Unit = js.native
}

