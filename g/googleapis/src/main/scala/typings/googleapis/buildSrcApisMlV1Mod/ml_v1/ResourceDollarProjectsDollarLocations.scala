package typings.googleapis.buildSrcApisMlV1Mod.ml_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/ml/v1", "ml_v1.Resource$Projects$Locations")
@js.native
class ResourceDollarProjectsDollarLocations protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * ml.projects.locations.get
    * @desc Get the complete list of CMLE capabilities in a location, along
    * with their location-specific properties.
    * @alias ml.projects.locations.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The name of the location.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$GoogleCloudMlV1__Location] = js.native
  def get(callback: BodyResponseCallback[Schema$GoogleCloudMlV1__Location]): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarGet): GaxiosPromise[Schema$GoogleCloudMlV1__Location] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarGet,
    callback: BodyResponseCallback[Schema$GoogleCloudMlV1__Location]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarGet,
    options: BodyResponseCallback[Schema$GoogleCloudMlV1__Location],
    callback: BodyResponseCallback[Schema$GoogleCloudMlV1__Location]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarGet, options: MethodOptions): GaxiosPromise[Schema$GoogleCloudMlV1__Location] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleCloudMlV1__Location]
  ): Unit = js.native
  /**
    * ml.projects.locations.list
    * @desc List all locations that provides at least one type of CMLE
    * capability.
    * @alias ml.projects.locations.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize Optional. The number of locations to retrieve per "page" of results. If there are more remaining results than this number, the response message will contain a valid value in the `next_page_token` field.  The default value is 20, and the maximum page size is 100.
    * @param {string=} params.pageToken Optional. A page token to request the next page of results.  You get the token from the `next_page_token` field of the response from the previous call.
    * @param {string} params.parent Required. The name of the project for which available locations are to be listed (since some locations might be whitelisted for specific projects).
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$GoogleCloudMlV1__ListLocationsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$GoogleCloudMlV1__ListLocationsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarList): GaxiosPromise[Schema$GoogleCloudMlV1__ListLocationsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarList,
    callback: BodyResponseCallback[Schema$GoogleCloudMlV1__ListLocationsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarList,
    options: BodyResponseCallback[Schema$GoogleCloudMlV1__ListLocationsResponse],
    callback: BodyResponseCallback[Schema$GoogleCloudMlV1__ListLocationsResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarList, options: MethodOptions): GaxiosPromise[Schema$GoogleCloudMlV1__ListLocationsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleCloudMlV1__ListLocationsResponse]
  ): Unit = js.native
}

