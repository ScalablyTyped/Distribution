package typings.googleapis.calendarV3Mod.calendarV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/calendar/v3", "calendar_v3.Resource$Freebusy")
@js.native
class ResourceFreebusy protected () extends js.Object {
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
  def query(): GaxiosPromise[SchemaFreeBusyResponse] = js.native
  def query(callback: BodyResponseCallback[SchemaFreeBusyResponse]): Unit = js.native
  def query(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaFreeBusyResponse] = js.native
  def query(params: ParamsResourceFreebusyQuery): GaxiosPromise[SchemaFreeBusyResponse] = js.native
  def query(params: ParamsResourceFreebusyQuery, callback: BodyResponseCallback[SchemaFreeBusyResponse]): Unit = js.native
  def query(
    params: ParamsResourceFreebusyQuery,
    options: BodyResponseCallback[SchemaFreeBusyResponse],
    callback: BodyResponseCallback[SchemaFreeBusyResponse]
  ): Unit = js.native
  def query(params: ParamsResourceFreebusyQuery, options: MethodOptions): GaxiosPromise[SchemaFreeBusyResponse] = js.native
  def query(
    params: ParamsResourceFreebusyQuery,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFreeBusyResponse]
  ): Unit = js.native
}

