package typings.googleapis.buildSrcApisRunV1Mod.run_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/run/v1", "run_v1.Resource$Projects$Locations")
@js.native
class ResourceDollarProjectsDollarLocations protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * run.projects.locations.get
    * @desc Gets information about a location.
    * @alias run.projects.locations.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Resource name for the location.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Location] = js.native
  def get(callback: BodyResponseCallback[Schema$Location]): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarGet): GaxiosPromise[Schema$Location] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarGet,
    callback: BodyResponseCallback[Schema$Location]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarGet,
    options: BodyResponseCallback[Schema$Location],
    callback: BodyResponseCallback[Schema$Location]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarGet, options: MethodOptions): GaxiosPromise[Schema$Location] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Location]
  ): Unit = js.native
}

