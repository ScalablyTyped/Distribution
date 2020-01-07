package typings.googleapis.buildSrcApisAnalyticsV3Mod.analytics_v3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/analytics/v3", "analytics_v3.Resource$Management$Webproperties")
@js.native
class ResourceDollarManagementDollarWebproperties protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * analytics.management.webproperties.get
    * @desc Gets a web property to which the user has access.
    * @alias analytics.management.webproperties.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID to retrieve the web property for.
    * @param {string} params.webPropertyId ID to retrieve the web property for.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Webproperty] = js.native
  def get(callback: BodyResponseCallback[Schema$Webproperty]): Unit = js.native
  def get(params: ParamsDollarResourceDollarManagementDollarWebpropertiesDollarGet): GaxiosPromise[Schema$Webproperty] = js.native
  def get(
    params: ParamsDollarResourceDollarManagementDollarWebpropertiesDollarGet,
    callback: BodyResponseCallback[Schema$Webproperty]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarManagementDollarWebpropertiesDollarGet,
    options: BodyResponseCallback[Schema$Webproperty],
    callback: BodyResponseCallback[Schema$Webproperty]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarManagementDollarWebpropertiesDollarGet, options: MethodOptions): GaxiosPromise[Schema$Webproperty] = js.native
  def get(
    params: ParamsDollarResourceDollarManagementDollarWebpropertiesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Webproperty]
  ): Unit = js.native
  /**
    * analytics.management.webproperties.insert
    * @desc Create a new property if the account has fewer than 20 properties.
    * Web properties are visible in the Google Analytics interface only if they
    * have at least one profile.
    * @alias analytics.management.webproperties.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID to create the web property for.
    * @param {().Webproperty} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$Webproperty] = js.native
  def insert(callback: BodyResponseCallback[Schema$Webproperty]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarManagementDollarWebpropertiesDollarInsert): GaxiosPromise[Schema$Webproperty] = js.native
  def insert(
    params: ParamsDollarResourceDollarManagementDollarWebpropertiesDollarInsert,
    callback: BodyResponseCallback[Schema$Webproperty]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarManagementDollarWebpropertiesDollarInsert,
    options: BodyResponseCallback[Schema$Webproperty],
    callback: BodyResponseCallback[Schema$Webproperty]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarManagementDollarWebpropertiesDollarInsert,
    options: MethodOptions
  ): GaxiosPromise[Schema$Webproperty] = js.native
  def insert(
    params: ParamsDollarResourceDollarManagementDollarWebpropertiesDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Webproperty]
  ): Unit = js.native
  /**
    * analytics.management.webproperties.list
    * @desc Lists web properties to which the user has access.
    * @alias analytics.management.webproperties.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID to retrieve web properties for. Can either be a specific account ID or '~all', which refers to all the accounts that user has access to.
    * @param {integer=} params.max-results The maximum number of web properties to include in this response.
    * @param {integer=} params.start-index An index of the first entity to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$Webproperties] = js.native
  def list(callback: BodyResponseCallback[Schema$Webproperties]): Unit = js.native
  def list(params: ParamsDollarResourceDollarManagementDollarWebpropertiesDollarList): GaxiosPromise[Schema$Webproperties] = js.native
  def list(
    params: ParamsDollarResourceDollarManagementDollarWebpropertiesDollarList,
    callback: BodyResponseCallback[Schema$Webproperties]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarManagementDollarWebpropertiesDollarList,
    options: BodyResponseCallback[Schema$Webproperties],
    callback: BodyResponseCallback[Schema$Webproperties]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarManagementDollarWebpropertiesDollarList, options: MethodOptions): GaxiosPromise[Schema$Webproperties] = js.native
  def list(
    params: ParamsDollarResourceDollarManagementDollarWebpropertiesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Webproperties]
  ): Unit = js.native
  /**
    * analytics.management.webproperties.patch
    * @desc Updates an existing web property. This method supports patch
    * semantics.
    * @alias analytics.management.webproperties.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID to which the web property belongs
    * @param {string} params.webPropertyId Web property ID
    * @param {().Webproperty} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$Webproperty] = js.native
  def patch(callback: BodyResponseCallback[Schema$Webproperty]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarManagementDollarWebpropertiesDollarPatch): GaxiosPromise[Schema$Webproperty] = js.native
  def patch(
    params: ParamsDollarResourceDollarManagementDollarWebpropertiesDollarPatch,
    callback: BodyResponseCallback[Schema$Webproperty]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarManagementDollarWebpropertiesDollarPatch,
    options: BodyResponseCallback[Schema$Webproperty],
    callback: BodyResponseCallback[Schema$Webproperty]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarManagementDollarWebpropertiesDollarPatch, options: MethodOptions): GaxiosPromise[Schema$Webproperty] = js.native
  def patch(
    params: ParamsDollarResourceDollarManagementDollarWebpropertiesDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Webproperty]
  ): Unit = js.native
  /**
    * analytics.management.webproperties.update
    * @desc Updates an existing web property.
    * @alias analytics.management.webproperties.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID to which the web property belongs
    * @param {string} params.webPropertyId Web property ID
    * @param {().Webproperty} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$Webproperty] = js.native
  def update(callback: BodyResponseCallback[Schema$Webproperty]): Unit = js.native
  def update(params: ParamsDollarResourceDollarManagementDollarWebpropertiesDollarUpdate): GaxiosPromise[Schema$Webproperty] = js.native
  def update(
    params: ParamsDollarResourceDollarManagementDollarWebpropertiesDollarUpdate,
    callback: BodyResponseCallback[Schema$Webproperty]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarManagementDollarWebpropertiesDollarUpdate,
    options: BodyResponseCallback[Schema$Webproperty],
    callback: BodyResponseCallback[Schema$Webproperty]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarManagementDollarWebpropertiesDollarUpdate,
    options: MethodOptions
  ): GaxiosPromise[Schema$Webproperty] = js.native
  def update(
    params: ParamsDollarResourceDollarManagementDollarWebpropertiesDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Webproperty]
  ): Unit = js.native
}

