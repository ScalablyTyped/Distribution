package typings.googleapis.buildSrcApisAnalyticsV3Mod.analytics_v3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/analytics/v3", "analytics_v3.Resource$Metadata$Columns")
@js.native
class ResourceDollarMetadataDollarColumns protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * analytics.metadata.columns.list
    * @desc Lists all columns for a report type
    * @alias analytics.metadata.columns.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.reportType Report type. Allowed Values: 'ga'. Where 'ga' corresponds to the Core Reporting API
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$Columns] = js.native
  def list(callback: BodyResponseCallback[Schema$Columns]): Unit = js.native
  def list(params: ParamsDollarResourceDollarMetadataDollarColumnsDollarList): GaxiosPromise[Schema$Columns] = js.native
  def list(
    params: ParamsDollarResourceDollarMetadataDollarColumnsDollarList,
    callback: BodyResponseCallback[Schema$Columns]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarMetadataDollarColumnsDollarList,
    options: BodyResponseCallback[Schema$Columns],
    callback: BodyResponseCallback[Schema$Columns]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarMetadataDollarColumnsDollarList, options: MethodOptions): GaxiosPromise[Schema$Columns] = js.native
  def list(
    params: ParamsDollarResourceDollarMetadataDollarColumnsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Columns]
  ): Unit = js.native
}

