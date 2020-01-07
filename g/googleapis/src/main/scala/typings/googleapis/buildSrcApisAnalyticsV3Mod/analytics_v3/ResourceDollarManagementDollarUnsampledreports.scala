package typings.googleapis.buildSrcApisAnalyticsV3Mod.analytics_v3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/analytics/v3", "analytics_v3.Resource$Management$Unsampledreports")
@js.native
class ResourceDollarManagementDollarUnsampledreports protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * analytics.management.unsampledReports.delete
    * @desc Deletes an unsampled report.
    * @alias analytics.management.unsampledReports.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID to delete the unsampled report for.
    * @param {string} params.profileId View (Profile) ID to delete the unsampled report for.
    * @param {string} params.unsampledReportId ID of the unsampled report to be deleted.
    * @param {string} params.webPropertyId Web property ID to delete the unsampled reports for.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarManagementDollarUnsampledreportsDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarManagementDollarUnsampledreportsDollarDelete,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarManagementDollarUnsampledreportsDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarManagementDollarUnsampledreportsDollarDelete,
    options: MethodOptions
  ): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarManagementDollarUnsampledreportsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * analytics.management.unsampledReports.get
    * @desc Returns a single unsampled report.
    * @alias analytics.management.unsampledReports.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID to retrieve unsampled report for.
    * @param {string} params.profileId View (Profile) ID to retrieve unsampled report for.
    * @param {string} params.unsampledReportId ID of the unsampled report to retrieve.
    * @param {string} params.webPropertyId Web property ID to retrieve unsampled reports for.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$UnsampledReport] = js.native
  def get(callback: BodyResponseCallback[Schema$UnsampledReport]): Unit = js.native
  def get(params: ParamsDollarResourceDollarManagementDollarUnsampledreportsDollarGet): GaxiosPromise[Schema$UnsampledReport] = js.native
  def get(
    params: ParamsDollarResourceDollarManagementDollarUnsampledreportsDollarGet,
    callback: BodyResponseCallback[Schema$UnsampledReport]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarManagementDollarUnsampledreportsDollarGet,
    options: BodyResponseCallback[Schema$UnsampledReport],
    callback: BodyResponseCallback[Schema$UnsampledReport]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarManagementDollarUnsampledreportsDollarGet,
    options: MethodOptions
  ): GaxiosPromise[Schema$UnsampledReport] = js.native
  def get(
    params: ParamsDollarResourceDollarManagementDollarUnsampledreportsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$UnsampledReport]
  ): Unit = js.native
  /**
    * analytics.management.unsampledReports.insert
    * @desc Create a new unsampled report.
    * @alias analytics.management.unsampledReports.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID to create the unsampled report for.
    * @param {string} params.profileId View (Profile) ID to create the unsampled report for.
    * @param {string} params.webPropertyId Web property ID to create the unsampled report for.
    * @param {().UnsampledReport} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$UnsampledReport] = js.native
  def insert(callback: BodyResponseCallback[Schema$UnsampledReport]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarManagementDollarUnsampledreportsDollarInsert): GaxiosPromise[Schema$UnsampledReport] = js.native
  def insert(
    params: ParamsDollarResourceDollarManagementDollarUnsampledreportsDollarInsert,
    callback: BodyResponseCallback[Schema$UnsampledReport]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarManagementDollarUnsampledreportsDollarInsert,
    options: BodyResponseCallback[Schema$UnsampledReport],
    callback: BodyResponseCallback[Schema$UnsampledReport]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarManagementDollarUnsampledreportsDollarInsert,
    options: MethodOptions
  ): GaxiosPromise[Schema$UnsampledReport] = js.native
  def insert(
    params: ParamsDollarResourceDollarManagementDollarUnsampledreportsDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$UnsampledReport]
  ): Unit = js.native
  /**
    * analytics.management.unsampledReports.list
    * @desc Lists unsampled reports to which the user has access.
    * @alias analytics.management.unsampledReports.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID to retrieve unsampled reports for. Must be a specific account ID, ~all is not supported.
    * @param {integer=} params.max-results The maximum number of unsampled reports to include in this response.
    * @param {string} params.profileId View (Profile) ID to retrieve unsampled reports for. Must be a specific view (profile) ID, ~all is not supported.
    * @param {integer=} params.start-index An index of the first unsampled report to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter.
    * @param {string} params.webPropertyId Web property ID to retrieve unsampled reports for. Must be a specific web property ID, ~all is not supported.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$UnsampledReports] = js.native
  def list(callback: BodyResponseCallback[Schema$UnsampledReports]): Unit = js.native
  def list(params: ParamsDollarResourceDollarManagementDollarUnsampledreportsDollarList): GaxiosPromise[Schema$UnsampledReports] = js.native
  def list(
    params: ParamsDollarResourceDollarManagementDollarUnsampledreportsDollarList,
    callback: BodyResponseCallback[Schema$UnsampledReports]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarManagementDollarUnsampledreportsDollarList,
    options: BodyResponseCallback[Schema$UnsampledReports],
    callback: BodyResponseCallback[Schema$UnsampledReports]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarManagementDollarUnsampledreportsDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$UnsampledReports] = js.native
  def list(
    params: ParamsDollarResourceDollarManagementDollarUnsampledreportsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$UnsampledReports]
  ): Unit = js.native
}

