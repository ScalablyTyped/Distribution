package typings.googleapis.buildSrcApisCalendarV3Mod.calendar_v3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/calendar/v3", "calendar_v3.Resource$Freebusy")
@js.native
class Resource$Freebusy protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * calendar.freebusy.query
    * @desc Returns free/busy information for a set of calendars.
    * @alias calendar.freebusy.query
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().FreeBusyRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def query(): GaxiosPromise[Schema$FreeBusyResponse] = js.native
  def query(callback: BodyResponseCallback[Schema$FreeBusyResponse]): Unit = js.native
  def query(params: ParamsDollarResourceDollarFreebusyDollarQuery): GaxiosPromise[Schema$FreeBusyResponse] = js.native
  def query(
    params: ParamsDollarResourceDollarFreebusyDollarQuery,
    callback: BodyResponseCallback[Schema$FreeBusyResponse]
  ): Unit = js.native
  def query(
    params: ParamsDollarResourceDollarFreebusyDollarQuery,
    options: BodyResponseCallback[Schema$FreeBusyResponse],
    callback: BodyResponseCallback[Schema$FreeBusyResponse]
  ): Unit = js.native
  def query(params: ParamsDollarResourceDollarFreebusyDollarQuery, options: MethodOptions): GaxiosPromise[Schema$FreeBusyResponse] = js.native
  def query(
    params: ParamsDollarResourceDollarFreebusyDollarQuery,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$FreeBusyResponse]
  ): Unit = js.native
}

