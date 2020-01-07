package typings.googleapis.buildSrcApisAnalyticsreportingV4Mod.analyticsreporting_v4

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/analyticsreporting/v4", "analyticsreporting_v4.Resource$Useractivity")
@js.native
class Resource$Useractivity protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * analyticsreporting.userActivity.search
    * @desc Returns User Activity data.
    * @alias analyticsreporting.userActivity.search
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().SearchUserActivityRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def search(): GaxiosPromise[Schema$SearchUserActivityResponse] = js.native
  def search(callback: BodyResponseCallback[Schema$SearchUserActivityResponse]): Unit = js.native
  def search(params: ParamsDollarResourceDollarUseractivityDollarSearch): GaxiosPromise[Schema$SearchUserActivityResponse] = js.native
  def search(
    params: ParamsDollarResourceDollarUseractivityDollarSearch,
    callback: BodyResponseCallback[Schema$SearchUserActivityResponse]
  ): Unit = js.native
  def search(
    params: ParamsDollarResourceDollarUseractivityDollarSearch,
    options: BodyResponseCallback[Schema$SearchUserActivityResponse],
    callback: BodyResponseCallback[Schema$SearchUserActivityResponse]
  ): Unit = js.native
  def search(params: ParamsDollarResourceDollarUseractivityDollarSearch, options: MethodOptions): GaxiosPromise[Schema$SearchUserActivityResponse] = js.native
  def search(
    params: ParamsDollarResourceDollarUseractivityDollarSearch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$SearchUserActivityResponse]
  ): Unit = js.native
}

