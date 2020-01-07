package typings.googleapis.buildSrcApisCalendarV3Mod.calendar_v3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/calendar/v3", "calendar_v3.Resource$Colors")
@js.native
class Resource$Colors protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * calendar.colors.get
    * @desc Returns the color definitions for calendars and events.
    * @alias calendar.colors.get
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Colors] = js.native
  def get(callback: BodyResponseCallback[Schema$Colors]): Unit = js.native
  def get(params: ParamsDollarResourceDollarColorsDollarGet): GaxiosPromise[Schema$Colors] = js.native
  def get(params: ParamsDollarResourceDollarColorsDollarGet, callback: BodyResponseCallback[Schema$Colors]): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarColorsDollarGet,
    options: BodyResponseCallback[Schema$Colors],
    callback: BodyResponseCallback[Schema$Colors]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarColorsDollarGet, options: MethodOptions): GaxiosPromise[Schema$Colors] = js.native
  def get(
    params: ParamsDollarResourceDollarColorsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Colors]
  ): Unit = js.native
}

