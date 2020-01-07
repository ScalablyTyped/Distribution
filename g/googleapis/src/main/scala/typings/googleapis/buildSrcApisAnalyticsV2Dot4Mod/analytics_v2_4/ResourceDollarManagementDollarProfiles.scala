package typings.googleapis.buildSrcApisAnalyticsV2Dot4Mod.analytics_v2_4

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/analytics/v2.4", "analytics_v2_4.Resource$Management$Profiles")
@js.native
class ResourceDollarManagementDollarProfiles protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * analytics.management.profiles.list
    * @desc Lists views (profiles) to which the user has access.
    * @alias analytics.management.profiles.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID for the views (profiles) to retrieve. Can either be a specific account ID or '~all', which refers to all the accounts to which the user has access.
    * @param {integer=} params.max-results The maximum number of views (profiles) to include in this response.
    * @param {integer=} params.start-index An index of the first entity to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter.
    * @param {string} params.webPropertyId Web property ID for the views (profiles) to retrieve. Can either be a specific web property ID or '~all', which refers to all the web properties to which the user has access.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Unit] = js.native
  def list(callback: BodyResponseCallback[Unit]): Unit = js.native
  def list(params: ParamsDollarResourceDollarManagementDollarProfilesDollarList): GaxiosPromise[Unit] = js.native
  def list(
    params: ParamsDollarResourceDollarManagementDollarProfilesDollarList,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarManagementDollarProfilesDollarList,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarManagementDollarProfilesDollarList, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def list(
    params: ParamsDollarResourceDollarManagementDollarProfilesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
}

