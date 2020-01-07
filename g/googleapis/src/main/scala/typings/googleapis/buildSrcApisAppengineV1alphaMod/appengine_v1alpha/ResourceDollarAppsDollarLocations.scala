package typings.googleapis.buildSrcApisAppengineV1alphaMod.appengine_v1alpha

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/appengine/v1alpha", "appengine_v1alpha.Resource$Apps$Locations")
@js.native
class ResourceDollarAppsDollarLocations protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * appengine.apps.locations.get
    * @desc Gets information about a location.
    * @alias appengine.apps.locations.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.appsId Part of `name`. Resource name for the location.
    * @param {string} params.locationsId Part of `name`. See documentation of `appsId`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Location] = js.native
  def get(callback: BodyResponseCallback[Schema$Location]): Unit = js.native
  def get(params: ParamsDollarResourceDollarAppsDollarLocationsDollarGet): GaxiosPromise[Schema$Location] = js.native
  def get(
    params: ParamsDollarResourceDollarAppsDollarLocationsDollarGet,
    callback: BodyResponseCallback[Schema$Location]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarAppsDollarLocationsDollarGet,
    options: BodyResponseCallback[Schema$Location],
    callback: BodyResponseCallback[Schema$Location]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarAppsDollarLocationsDollarGet, options: MethodOptions): GaxiosPromise[Schema$Location] = js.native
  def get(
    params: ParamsDollarResourceDollarAppsDollarLocationsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Location]
  ): Unit = js.native
  /**
    * appengine.apps.locations.list
    * @desc Lists information about the supported locations for this service.
    * @alias appengine.apps.locations.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.appsId Part of `name`. The resource that owns the locations collection, if applicable.
    * @param {string=} params.filter The standard list filter.
    * @param {integer=} params.pageSize The standard list page size.
    * @param {string=} params.pageToken The standard list page token.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListLocationsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListLocationsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarAppsDollarLocationsDollarList): GaxiosPromise[Schema$ListLocationsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarAppsDollarLocationsDollarList,
    callback: BodyResponseCallback[Schema$ListLocationsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarAppsDollarLocationsDollarList,
    options: BodyResponseCallback[Schema$ListLocationsResponse],
    callback: BodyResponseCallback[Schema$ListLocationsResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarAppsDollarLocationsDollarList, options: MethodOptions): GaxiosPromise[Schema$ListLocationsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarAppsDollarLocationsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListLocationsResponse]
  ): Unit = js.native
}

