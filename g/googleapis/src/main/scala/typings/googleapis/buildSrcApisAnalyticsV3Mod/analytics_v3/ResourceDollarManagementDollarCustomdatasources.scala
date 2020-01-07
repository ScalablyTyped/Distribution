package typings.googleapis.buildSrcApisAnalyticsV3Mod.analytics_v3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/analytics/v3", "analytics_v3.Resource$Management$Customdatasources")
@js.native
class ResourceDollarManagementDollarCustomdatasources protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * analytics.management.customDataSources.list
    * @desc List custom data sources to which the user has access.
    * @alias analytics.management.customDataSources.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account Id for the custom data sources to retrieve.
    * @param {integer=} params.max-results The maximum number of custom data sources to include in this response.
    * @param {integer=} params.start-index A 1-based index of the first custom data source to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter.
    * @param {string} params.webPropertyId Web property Id for the custom data sources to retrieve.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$CustomDataSources] = js.native
  def list(callback: BodyResponseCallback[Schema$CustomDataSources]): Unit = js.native
  def list(params: ParamsDollarResourceDollarManagementDollarCustomdatasourcesDollarList): GaxiosPromise[Schema$CustomDataSources] = js.native
  def list(
    params: ParamsDollarResourceDollarManagementDollarCustomdatasourcesDollarList,
    callback: BodyResponseCallback[Schema$CustomDataSources]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarManagementDollarCustomdatasourcesDollarList,
    options: BodyResponseCallback[Schema$CustomDataSources],
    callback: BodyResponseCallback[Schema$CustomDataSources]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarManagementDollarCustomdatasourcesDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$CustomDataSources] = js.native
  def list(
    params: ParamsDollarResourceDollarManagementDollarCustomdatasourcesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$CustomDataSources]
  ): Unit = js.native
}

