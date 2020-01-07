package typings.googleapis.buildSrcApisMonitoringV3Mod.monitoring_v3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/monitoring/v3", "monitoring_v3.Resource$Uptimecheckips")
@js.native
class Resource$Uptimecheckips protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * monitoring.uptimeCheckIps.list
    * @desc Returns the list of IPs that checkers run from
    * @alias monitoring.uptimeCheckIps.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize The maximum number of results to return in a single response. The server may further constrain the maximum number of results returned in a single page. If the page_size is <=0, the server will decide the number of results to be returned. NOTE: this field is not yet implemented
    * @param {string=} params.pageToken If this field is not empty then it must contain the nextPageToken value returned by a previous call to this method. Using this field causes the method to return more results from the previous method call. NOTE: this field is not yet implemented
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListUptimeCheckIpsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListUptimeCheckIpsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarUptimecheckipsDollarList): GaxiosPromise[Schema$ListUptimeCheckIpsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarUptimecheckipsDollarList,
    callback: BodyResponseCallback[Schema$ListUptimeCheckIpsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarUptimecheckipsDollarList,
    options: BodyResponseCallback[Schema$ListUptimeCheckIpsResponse],
    callback: BodyResponseCallback[Schema$ListUptimeCheckIpsResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarUptimecheckipsDollarList, options: MethodOptions): GaxiosPromise[Schema$ListUptimeCheckIpsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarUptimecheckipsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListUptimeCheckIpsResponse]
  ): Unit = js.native
}

