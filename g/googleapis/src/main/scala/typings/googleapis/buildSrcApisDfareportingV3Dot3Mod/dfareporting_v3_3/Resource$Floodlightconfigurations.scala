package typings.googleapis.buildSrcApisDfareportingV3Dot3Mod.dfareporting_v3_3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dfareporting/v3.3", "dfareporting_v3_3.Resource$Floodlightconfigurations")
@js.native
class Resource$Floodlightconfigurations protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dfareporting.floodlightConfigurations.get
    * @desc Gets one floodlight configuration by ID.
    * @alias dfareporting.floodlightConfigurations.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Floodlight configuration ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$FloodlightConfiguration] = js.native
  def get(callback: BodyResponseCallback[Schema$FloodlightConfiguration]): Unit = js.native
  def get(params: ParamsDollarResourceDollarFloodlightconfigurationsDollarGet): GaxiosPromise[Schema$FloodlightConfiguration] = js.native
  def get(
    params: ParamsDollarResourceDollarFloodlightconfigurationsDollarGet,
    callback: BodyResponseCallback[Schema$FloodlightConfiguration]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarFloodlightconfigurationsDollarGet,
    options: BodyResponseCallback[Schema$FloodlightConfiguration],
    callback: BodyResponseCallback[Schema$FloodlightConfiguration]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarFloodlightconfigurationsDollarGet, options: MethodOptions): GaxiosPromise[Schema$FloodlightConfiguration] = js.native
  def get(
    params: ParamsDollarResourceDollarFloodlightconfigurationsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$FloodlightConfiguration]
  ): Unit = js.native
  /**
    * dfareporting.floodlightConfigurations.list
    * @desc Retrieves a list of floodlight configurations, possibly filtered.
    * @alias dfareporting.floodlightConfigurations.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.ids Set of IDs of floodlight configurations to retrieve. Required field; otherwise an empty list will be returned.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$FloodlightConfigurationsListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$FloodlightConfigurationsListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarFloodlightconfigurationsDollarList): GaxiosPromise[Schema$FloodlightConfigurationsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarFloodlightconfigurationsDollarList,
    callback: BodyResponseCallback[Schema$FloodlightConfigurationsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarFloodlightconfigurationsDollarList,
    options: BodyResponseCallback[Schema$FloodlightConfigurationsListResponse],
    callback: BodyResponseCallback[Schema$FloodlightConfigurationsListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarFloodlightconfigurationsDollarList, options: MethodOptions): GaxiosPromise[Schema$FloodlightConfigurationsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarFloodlightconfigurationsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$FloodlightConfigurationsListResponse]
  ): Unit = js.native
  /**
    * dfareporting.floodlightConfigurations.patch
    * @desc Updates an existing floodlight configuration. This method supports
    * patch semantics.
    * @alias dfareporting.floodlightConfigurations.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id Floodlight configuration ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().FloodlightConfiguration} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$FloodlightConfiguration] = js.native
  def patch(callback: BodyResponseCallback[Schema$FloodlightConfiguration]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarFloodlightconfigurationsDollarPatch): GaxiosPromise[Schema$FloodlightConfiguration] = js.native
  def patch(
    params: ParamsDollarResourceDollarFloodlightconfigurationsDollarPatch,
    callback: BodyResponseCallback[Schema$FloodlightConfiguration]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarFloodlightconfigurationsDollarPatch,
    options: BodyResponseCallback[Schema$FloodlightConfiguration],
    callback: BodyResponseCallback[Schema$FloodlightConfiguration]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarFloodlightconfigurationsDollarPatch, options: MethodOptions): GaxiosPromise[Schema$FloodlightConfiguration] = js.native
  def patch(
    params: ParamsDollarResourceDollarFloodlightconfigurationsDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$FloodlightConfiguration]
  ): Unit = js.native
  /**
    * dfareporting.floodlightConfigurations.update
    * @desc Updates an existing floodlight configuration.
    * @alias dfareporting.floodlightConfigurations.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().FloodlightConfiguration} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$FloodlightConfiguration] = js.native
  def update(callback: BodyResponseCallback[Schema$FloodlightConfiguration]): Unit = js.native
  def update(params: ParamsDollarResourceDollarFloodlightconfigurationsDollarUpdate): GaxiosPromise[Schema$FloodlightConfiguration] = js.native
  def update(
    params: ParamsDollarResourceDollarFloodlightconfigurationsDollarUpdate,
    callback: BodyResponseCallback[Schema$FloodlightConfiguration]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarFloodlightconfigurationsDollarUpdate,
    options: BodyResponseCallback[Schema$FloodlightConfiguration],
    callback: BodyResponseCallback[Schema$FloodlightConfiguration]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarFloodlightconfigurationsDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$FloodlightConfiguration] = js.native
  def update(
    params: ParamsDollarResourceDollarFloodlightconfigurationsDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$FloodlightConfiguration]
  ): Unit = js.native
}

