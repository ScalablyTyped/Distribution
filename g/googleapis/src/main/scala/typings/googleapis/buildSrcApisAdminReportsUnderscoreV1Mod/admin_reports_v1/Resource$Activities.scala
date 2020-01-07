package typings.googleapis.buildSrcApisAdminReportsUnderscoreV1Mod.admin_reports_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/admin/reports_v1", "admin_reports_v1.Resource$Activities")
@js.native
class Resource$Activities protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * reports.activities.list
    * @desc Retrieves a list of activities for a specific customer and
    * application.
    * @alias reports.activities.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.actorIpAddress IP Address of host where the event was performed. Supports both IPv4 and IPv6 addresses.
    * @param {string} params.applicationName Application name for which the events are to be retrieved.
    * @param {string=} params.customerId Represents the customer for which the data is to be fetched.
    * @param {string=} params.endTime Return events which occurred at or before this time.
    * @param {string=} params.eventName Name of the event being queried.
    * @param {string=} params.filters Event parameters in the form [parameter1 name][operator][parameter1 value],[parameter2 name][operator][parameter2 value],...
    * @param {integer=} params.maxResults Number of activity records to be shown in each page.
    * @param {string=} params.orgUnitID the organizational unit's(OU) ID to filter activities from users belonging to a specific OU or one of its sub-OU(s)
    * @param {string=} params.pageToken Token to specify next page.
    * @param {string=} params.startTime Return events which occurred at or after this time.
    * @param {string} params.userKey Represents the profile id or the user email for which the data should be filtered. When 'all' is specified as the userKey, it returns usageReports for all users.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$Activities] = js.native
  def list(callback: BodyResponseCallback[Schema$Activities]): Unit = js.native
  def list(params: ParamsDollarResourceDollarActivitiesDollarList): GaxiosPromise[Schema$Activities] = js.native
  def list(
    params: ParamsDollarResourceDollarActivitiesDollarList,
    callback: BodyResponseCallback[Schema$Activities]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarActivitiesDollarList,
    options: BodyResponseCallback[Schema$Activities],
    callback: BodyResponseCallback[Schema$Activities]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarActivitiesDollarList, options: MethodOptions): GaxiosPromise[Schema$Activities] = js.native
  def list(
    params: ParamsDollarResourceDollarActivitiesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Activities]
  ): Unit = js.native
  /**
    * reports.activities.watch
    * @desc Push changes to activities
    * @alias reports.activities.watch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.actorIpAddress IP Address of host where the event was performed. Supports both IPv4 and IPv6 addresses.
    * @param {string} params.applicationName Application name for which the events are to be retrieved.
    * @param {string=} params.customerId Represents the customer for which the data is to be fetched.
    * @param {string=} params.endTime Return events which occurred at or before this time.
    * @param {string=} params.eventName Name of the event being queried.
    * @param {string=} params.filters Event parameters in the form [parameter1 name][operator][parameter1 value],[parameter2 name][operator][parameter2 value],...
    * @param {integer=} params.maxResults Number of activity records to be shown in each page.
    * @param {string=} params.orgUnitID the organizational unit's(OU) ID to filter activities from users belonging to a specific OU or one of its sub-OU(s)
    * @param {string=} params.pageToken Token to specify next page.
    * @param {string=} params.startTime Return events which occurred at or after this time.
    * @param {string} params.userKey Represents the profile id or the user email for which the data should be filtered. When 'all' is specified as the userKey, it returns usageReports for all users.
    * @param {().Channel} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def watch(): GaxiosPromise[Schema$Channel] = js.native
  def watch(callback: BodyResponseCallback[Schema$Channel]): Unit = js.native
  def watch(params: ParamsDollarResourceDollarActivitiesDollarWatch): GaxiosPromise[Schema$Channel] = js.native
  def watch(
    params: ParamsDollarResourceDollarActivitiesDollarWatch,
    callback: BodyResponseCallback[Schema$Channel]
  ): Unit = js.native
  def watch(
    params: ParamsDollarResourceDollarActivitiesDollarWatch,
    options: BodyResponseCallback[Schema$Channel],
    callback: BodyResponseCallback[Schema$Channel]
  ): Unit = js.native
  def watch(params: ParamsDollarResourceDollarActivitiesDollarWatch, options: MethodOptions): GaxiosPromise[Schema$Channel] = js.native
  def watch(
    params: ParamsDollarResourceDollarActivitiesDollarWatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Channel]
  ): Unit = js.native
}

