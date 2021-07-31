package typings.googleapis.appengineV1betaMod.appengineV1beta

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/appengine/v1beta", "appengine_v1beta.Resource$Apps$Locations")
@js.native
class ResourceAppsLocations protected () extends StObject {
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
  def get(): GaxiosPromise[SchemaLocation] = js.native
  def get(callback: BodyResponseCallback[SchemaLocation]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaLocation] = js.native
  def get(params: ParamsResourceAppsLocationsGet): GaxiosPromise[SchemaLocation] = js.native
  def get(params: ParamsResourceAppsLocationsGet, callback: BodyResponseCallback[SchemaLocation]): Unit = js.native
  def get(
    params: ParamsResourceAppsLocationsGet,
    options: BodyResponseCallback[SchemaLocation],
    callback: BodyResponseCallback[SchemaLocation]
  ): Unit = js.native
  def get(params: ParamsResourceAppsLocationsGet, options: MethodOptions): GaxiosPromise[SchemaLocation] = js.native
  def get(
    params: ParamsResourceAppsLocationsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaLocation]
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
  def list(): GaxiosPromise[SchemaListLocationsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListLocationsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListLocationsResponse] = js.native
  def list(params: ParamsResourceAppsLocationsList): GaxiosPromise[SchemaListLocationsResponse] = js.native
  def list(
    params: ParamsResourceAppsLocationsList,
    callback: BodyResponseCallback[SchemaListLocationsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAppsLocationsList,
    options: BodyResponseCallback[SchemaListLocationsResponse],
    callback: BodyResponseCallback[SchemaListLocationsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAppsLocationsList, options: MethodOptions): GaxiosPromise[SchemaListLocationsResponse] = js.native
  def list(
    params: ParamsResourceAppsLocationsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListLocationsResponse]
  ): Unit = js.native
}
