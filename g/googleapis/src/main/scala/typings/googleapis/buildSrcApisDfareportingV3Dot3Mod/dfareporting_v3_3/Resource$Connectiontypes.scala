package typings.googleapis.buildSrcApisDfareportingV3Dot3Mod.dfareporting_v3_3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dfareporting/v3.3", "dfareporting_v3_3.Resource$Connectiontypes")
@js.native
class Resource$Connectiontypes protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dfareporting.connectionTypes.get
    * @desc Gets one connection type by ID.
    * @alias dfareporting.connectionTypes.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Connection type ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$ConnectionType] = js.native
  def get(callback: BodyResponseCallback[Schema$ConnectionType]): Unit = js.native
  def get(params: ParamsDollarResourceDollarConnectiontypesDollarGet): GaxiosPromise[Schema$ConnectionType] = js.native
  def get(
    params: ParamsDollarResourceDollarConnectiontypesDollarGet,
    callback: BodyResponseCallback[Schema$ConnectionType]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarConnectiontypesDollarGet,
    options: BodyResponseCallback[Schema$ConnectionType],
    callback: BodyResponseCallback[Schema$ConnectionType]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarConnectiontypesDollarGet, options: MethodOptions): GaxiosPromise[Schema$ConnectionType] = js.native
  def get(
    params: ParamsDollarResourceDollarConnectiontypesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ConnectionType]
  ): Unit = js.native
  /**
    * dfareporting.connectionTypes.list
    * @desc Retrieves a list of connection types.
    * @alias dfareporting.connectionTypes.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ConnectionTypesListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ConnectionTypesListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarConnectiontypesDollarList): GaxiosPromise[Schema$ConnectionTypesListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarConnectiontypesDollarList,
    callback: BodyResponseCallback[Schema$ConnectionTypesListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarConnectiontypesDollarList,
    options: BodyResponseCallback[Schema$ConnectionTypesListResponse],
    callback: BodyResponseCallback[Schema$ConnectionTypesListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarConnectiontypesDollarList, options: MethodOptions): GaxiosPromise[Schema$ConnectionTypesListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarConnectiontypesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ConnectionTypesListResponse]
  ): Unit = js.native
}

