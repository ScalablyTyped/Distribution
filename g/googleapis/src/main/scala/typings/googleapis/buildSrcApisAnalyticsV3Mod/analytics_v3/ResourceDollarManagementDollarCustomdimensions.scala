package typings.googleapis.buildSrcApisAnalyticsV3Mod.analytics_v3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/analytics/v3", "analytics_v3.Resource$Management$Customdimensions")
@js.native
class ResourceDollarManagementDollarCustomdimensions protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * analytics.management.customDimensions.get
    * @desc Get a custom dimension to which the user has access.
    * @alias analytics.management.customDimensions.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID for the custom dimension to retrieve.
    * @param {string} params.customDimensionId The ID of the custom dimension to retrieve.
    * @param {string} params.webPropertyId Web property ID for the custom dimension to retrieve.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$CustomDimension] = js.native
  def get(callback: BodyResponseCallback[Schema$CustomDimension]): Unit = js.native
  def get(params: ParamsDollarResourceDollarManagementDollarCustomdimensionsDollarGet): GaxiosPromise[Schema$CustomDimension] = js.native
  def get(
    params: ParamsDollarResourceDollarManagementDollarCustomdimensionsDollarGet,
    callback: BodyResponseCallback[Schema$CustomDimension]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarManagementDollarCustomdimensionsDollarGet,
    options: BodyResponseCallback[Schema$CustomDimension],
    callback: BodyResponseCallback[Schema$CustomDimension]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarManagementDollarCustomdimensionsDollarGet,
    options: MethodOptions
  ): GaxiosPromise[Schema$CustomDimension] = js.native
  def get(
    params: ParamsDollarResourceDollarManagementDollarCustomdimensionsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$CustomDimension]
  ): Unit = js.native
  /**
    * analytics.management.customDimensions.insert
    * @desc Create a new custom dimension.
    * @alias analytics.management.customDimensions.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID for the custom dimension to create.
    * @param {string} params.webPropertyId Web property ID for the custom dimension to create.
    * @param {().CustomDimension} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$CustomDimension] = js.native
  def insert(callback: BodyResponseCallback[Schema$CustomDimension]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarManagementDollarCustomdimensionsDollarInsert): GaxiosPromise[Schema$CustomDimension] = js.native
  def insert(
    params: ParamsDollarResourceDollarManagementDollarCustomdimensionsDollarInsert,
    callback: BodyResponseCallback[Schema$CustomDimension]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarManagementDollarCustomdimensionsDollarInsert,
    options: BodyResponseCallback[Schema$CustomDimension],
    callback: BodyResponseCallback[Schema$CustomDimension]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarManagementDollarCustomdimensionsDollarInsert,
    options: MethodOptions
  ): GaxiosPromise[Schema$CustomDimension] = js.native
  def insert(
    params: ParamsDollarResourceDollarManagementDollarCustomdimensionsDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$CustomDimension]
  ): Unit = js.native
  /**
    * analytics.management.customDimensions.list
    * @desc Lists custom dimensions to which the user has access.
    * @alias analytics.management.customDimensions.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID for the custom dimensions to retrieve.
    * @param {integer=} params.max-results The maximum number of custom dimensions to include in this response.
    * @param {integer=} params.start-index An index of the first entity to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter.
    * @param {string} params.webPropertyId Web property ID for the custom dimensions to retrieve.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$CustomDimensions] = js.native
  def list(callback: BodyResponseCallback[Schema$CustomDimensions]): Unit = js.native
  def list(params: ParamsDollarResourceDollarManagementDollarCustomdimensionsDollarList): GaxiosPromise[Schema$CustomDimensions] = js.native
  def list(
    params: ParamsDollarResourceDollarManagementDollarCustomdimensionsDollarList,
    callback: BodyResponseCallback[Schema$CustomDimensions]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarManagementDollarCustomdimensionsDollarList,
    options: BodyResponseCallback[Schema$CustomDimensions],
    callback: BodyResponseCallback[Schema$CustomDimensions]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarManagementDollarCustomdimensionsDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$CustomDimensions] = js.native
  def list(
    params: ParamsDollarResourceDollarManagementDollarCustomdimensionsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$CustomDimensions]
  ): Unit = js.native
  /**
    * analytics.management.customDimensions.patch
    * @desc Updates an existing custom dimension. This method supports patch
    * semantics.
    * @alias analytics.management.customDimensions.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID for the custom dimension to update.
    * @param {string} params.customDimensionId Custom dimension ID for the custom dimension to update.
    * @param {boolean=} params.ignoreCustomDataSourceLinks Force the update and ignore any warnings related to the custom dimension being linked to a custom data source / data set.
    * @param {string} params.webPropertyId Web property ID for the custom dimension to update.
    * @param {().CustomDimension} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$CustomDimension] = js.native
  def patch(callback: BodyResponseCallback[Schema$CustomDimension]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarManagementDollarCustomdimensionsDollarPatch): GaxiosPromise[Schema$CustomDimension] = js.native
  def patch(
    params: ParamsDollarResourceDollarManagementDollarCustomdimensionsDollarPatch,
    callback: BodyResponseCallback[Schema$CustomDimension]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarManagementDollarCustomdimensionsDollarPatch,
    options: BodyResponseCallback[Schema$CustomDimension],
    callback: BodyResponseCallback[Schema$CustomDimension]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarManagementDollarCustomdimensionsDollarPatch,
    options: MethodOptions
  ): GaxiosPromise[Schema$CustomDimension] = js.native
  def patch(
    params: ParamsDollarResourceDollarManagementDollarCustomdimensionsDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$CustomDimension]
  ): Unit = js.native
  /**
    * analytics.management.customDimensions.update
    * @desc Updates an existing custom dimension.
    * @alias analytics.management.customDimensions.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID for the custom dimension to update.
    * @param {string} params.customDimensionId Custom dimension ID for the custom dimension to update.
    * @param {boolean=} params.ignoreCustomDataSourceLinks Force the update and ignore any warnings related to the custom dimension being linked to a custom data source / data set.
    * @param {string} params.webPropertyId Web property ID for the custom dimension to update.
    * @param {().CustomDimension} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$CustomDimension] = js.native
  def update(callback: BodyResponseCallback[Schema$CustomDimension]): Unit = js.native
  def update(params: ParamsDollarResourceDollarManagementDollarCustomdimensionsDollarUpdate): GaxiosPromise[Schema$CustomDimension] = js.native
  def update(
    params: ParamsDollarResourceDollarManagementDollarCustomdimensionsDollarUpdate,
    callback: BodyResponseCallback[Schema$CustomDimension]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarManagementDollarCustomdimensionsDollarUpdate,
    options: BodyResponseCallback[Schema$CustomDimension],
    callback: BodyResponseCallback[Schema$CustomDimension]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarManagementDollarCustomdimensionsDollarUpdate,
    options: MethodOptions
  ): GaxiosPromise[Schema$CustomDimension] = js.native
  def update(
    params: ParamsDollarResourceDollarManagementDollarCustomdimensionsDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$CustomDimension]
  ): Unit = js.native
}

