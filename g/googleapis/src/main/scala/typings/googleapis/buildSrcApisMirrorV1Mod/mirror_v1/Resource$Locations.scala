package typings.googleapis.buildSrcApisMirrorV1Mod.mirror_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/mirror/v1", "mirror_v1.Resource$Locations")
@js.native
class Resource$Locations protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * mirror.locations.get
    * @desc Gets a single location by ID.
    * @alias mirror.locations.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id The ID of the location or latest for the last known location.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Location] = js.native
  def get(callback: BodyResponseCallback[Schema$Location]): Unit = js.native
  def get(params: ParamsDollarResourceDollarLocationsDollarGet): GaxiosPromise[Schema$Location] = js.native
  def get(
    params: ParamsDollarResourceDollarLocationsDollarGet,
    callback: BodyResponseCallback[Schema$Location]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarLocationsDollarGet,
    options: BodyResponseCallback[Schema$Location],
    callback: BodyResponseCallback[Schema$Location]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarLocationsDollarGet, options: MethodOptions): GaxiosPromise[Schema$Location] = js.native
  def get(
    params: ParamsDollarResourceDollarLocationsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Location]
  ): Unit = js.native
  /**
    * mirror.locations.list
    * @desc Retrieves a list of locations for the user.
    * @alias mirror.locations.list
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$LocationsListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$LocationsListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarLocationsDollarList): GaxiosPromise[Schema$LocationsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarLocationsDollarList,
    callback: BodyResponseCallback[Schema$LocationsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarLocationsDollarList,
    options: BodyResponseCallback[Schema$LocationsListResponse],
    callback: BodyResponseCallback[Schema$LocationsListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarLocationsDollarList, options: MethodOptions): GaxiosPromise[Schema$LocationsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarLocationsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$LocationsListResponse]
  ): Unit = js.native
}

