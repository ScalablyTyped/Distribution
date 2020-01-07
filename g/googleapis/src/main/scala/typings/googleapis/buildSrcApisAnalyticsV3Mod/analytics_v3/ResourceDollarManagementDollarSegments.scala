package typings.googleapis.buildSrcApisAnalyticsV3Mod.analytics_v3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/analytics/v3", "analytics_v3.Resource$Management$Segments")
@js.native
class ResourceDollarManagementDollarSegments protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * analytics.management.segments.list
    * @desc Lists segments to which the user has access.
    * @alias analytics.management.segments.list
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {integer=} params.max-results The maximum number of segments to include in this response.
    * @param {integer=} params.start-index An index of the first segment to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$Segments] = js.native
  def list(callback: BodyResponseCallback[Schema$Segments]): Unit = js.native
  def list(params: ParamsDollarResourceDollarManagementDollarSegmentsDollarList): GaxiosPromise[Schema$Segments] = js.native
  def list(
    params: ParamsDollarResourceDollarManagementDollarSegmentsDollarList,
    callback: BodyResponseCallback[Schema$Segments]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarManagementDollarSegmentsDollarList,
    options: BodyResponseCallback[Schema$Segments],
    callback: BodyResponseCallback[Schema$Segments]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarManagementDollarSegmentsDollarList, options: MethodOptions): GaxiosPromise[Schema$Segments] = js.native
  def list(
    params: ParamsDollarResourceDollarManagementDollarSegmentsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Segments]
  ): Unit = js.native
}

