package typings.googleapis.buildSrcApisAnalyticsV3Mod.analytics_v3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/analytics/v3", "analytics_v3.Resource$Management$Filters")
@js.native
class ResourceDollarManagementDollarFilters protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * analytics.management.filters.delete
    * @desc Delete a filter.
    * @alias analytics.management.filters.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID to delete the filter for.
    * @param {string} params.filterId ID of the filter to be deleted.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Filter] = js.native
  def delete(callback: BodyResponseCallback[Schema$Filter]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarManagementDollarFiltersDollarDelete): GaxiosPromise[Schema$Filter] = js.native
  def delete(
    params: ParamsDollarResourceDollarManagementDollarFiltersDollarDelete,
    callback: BodyResponseCallback[Schema$Filter]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarManagementDollarFiltersDollarDelete,
    options: BodyResponseCallback[Schema$Filter],
    callback: BodyResponseCallback[Schema$Filter]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarManagementDollarFiltersDollarDelete, options: MethodOptions): GaxiosPromise[Schema$Filter] = js.native
  def delete(
    params: ParamsDollarResourceDollarManagementDollarFiltersDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Filter]
  ): Unit = js.native
  /**
    * analytics.management.filters.get
    * @desc Returns a filters to which the user has access.
    * @alias analytics.management.filters.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID to retrieve filters for.
    * @param {string} params.filterId Filter ID to retrieve filters for.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Filter] = js.native
  def get(callback: BodyResponseCallback[Schema$Filter]): Unit = js.native
  def get(params: ParamsDollarResourceDollarManagementDollarFiltersDollarGet): GaxiosPromise[Schema$Filter] = js.native
  def get(
    params: ParamsDollarResourceDollarManagementDollarFiltersDollarGet,
    callback: BodyResponseCallback[Schema$Filter]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarManagementDollarFiltersDollarGet,
    options: BodyResponseCallback[Schema$Filter],
    callback: BodyResponseCallback[Schema$Filter]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarManagementDollarFiltersDollarGet, options: MethodOptions): GaxiosPromise[Schema$Filter] = js.native
  def get(
    params: ParamsDollarResourceDollarManagementDollarFiltersDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Filter]
  ): Unit = js.native
  /**
    * analytics.management.filters.insert
    * @desc Create a new filter.
    * @alias analytics.management.filters.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID to create filter for.
    * @param {().Filter} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$Filter] = js.native
  def insert(callback: BodyResponseCallback[Schema$Filter]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarManagementDollarFiltersDollarInsert): GaxiosPromise[Schema$Filter] = js.native
  def insert(
    params: ParamsDollarResourceDollarManagementDollarFiltersDollarInsert,
    callback: BodyResponseCallback[Schema$Filter]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarManagementDollarFiltersDollarInsert,
    options: BodyResponseCallback[Schema$Filter],
    callback: BodyResponseCallback[Schema$Filter]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarManagementDollarFiltersDollarInsert, options: MethodOptions): GaxiosPromise[Schema$Filter] = js.native
  def insert(
    params: ParamsDollarResourceDollarManagementDollarFiltersDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Filter]
  ): Unit = js.native
  /**
    * analytics.management.filters.list
    * @desc Lists all filters for an account
    * @alias analytics.management.filters.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID to retrieve filters for.
    * @param {integer=} params.max-results The maximum number of filters to include in this response.
    * @param {integer=} params.start-index An index of the first entity to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$Filters] = js.native
  def list(callback: BodyResponseCallback[Schema$Filters]): Unit = js.native
  def list(params: ParamsDollarResourceDollarManagementDollarFiltersDollarList): GaxiosPromise[Schema$Filters] = js.native
  def list(
    params: ParamsDollarResourceDollarManagementDollarFiltersDollarList,
    callback: BodyResponseCallback[Schema$Filters]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarManagementDollarFiltersDollarList,
    options: BodyResponseCallback[Schema$Filters],
    callback: BodyResponseCallback[Schema$Filters]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarManagementDollarFiltersDollarList, options: MethodOptions): GaxiosPromise[Schema$Filters] = js.native
  def list(
    params: ParamsDollarResourceDollarManagementDollarFiltersDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Filters]
  ): Unit = js.native
  /**
    * analytics.management.filters.patch
    * @desc Updates an existing filter. This method supports patch semantics.
    * @alias analytics.management.filters.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID to which the filter belongs.
    * @param {string} params.filterId ID of the filter to be updated.
    * @param {().Filter} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$Filter] = js.native
  def patch(callback: BodyResponseCallback[Schema$Filter]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarManagementDollarFiltersDollarPatch): GaxiosPromise[Schema$Filter] = js.native
  def patch(
    params: ParamsDollarResourceDollarManagementDollarFiltersDollarPatch,
    callback: BodyResponseCallback[Schema$Filter]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarManagementDollarFiltersDollarPatch,
    options: BodyResponseCallback[Schema$Filter],
    callback: BodyResponseCallback[Schema$Filter]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarManagementDollarFiltersDollarPatch, options: MethodOptions): GaxiosPromise[Schema$Filter] = js.native
  def patch(
    params: ParamsDollarResourceDollarManagementDollarFiltersDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Filter]
  ): Unit = js.native
  /**
    * analytics.management.filters.update
    * @desc Updates an existing filter.
    * @alias analytics.management.filters.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID to which the filter belongs.
    * @param {string} params.filterId ID of the filter to be updated.
    * @param {().Filter} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$Filter] = js.native
  def update(callback: BodyResponseCallback[Schema$Filter]): Unit = js.native
  def update(params: ParamsDollarResourceDollarManagementDollarFiltersDollarUpdate): GaxiosPromise[Schema$Filter] = js.native
  def update(
    params: ParamsDollarResourceDollarManagementDollarFiltersDollarUpdate,
    callback: BodyResponseCallback[Schema$Filter]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarManagementDollarFiltersDollarUpdate,
    options: BodyResponseCallback[Schema$Filter],
    callback: BodyResponseCallback[Schema$Filter]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarManagementDollarFiltersDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$Filter] = js.native
  def update(
    params: ParamsDollarResourceDollarManagementDollarFiltersDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Filter]
  ): Unit = js.native
}

