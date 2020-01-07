package typings.googleapis.buildSrcApisDfareportingV3Dot2Mod.dfareporting_v3_2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dfareporting/v3.2", "dfareporting_v3_2.Resource$Accountactiveadsummaries")
@js.native
class Resource$Accountactiveadsummaries protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dfareporting.accountActiveAdSummaries.get
    * @desc Gets the account's active ad summary by account ID.
    * @alias dfareporting.accountActiveAdSummaries.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {string} params.summaryAccountId Account ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$AccountActiveAdSummary] = js.native
  def get(callback: BodyResponseCallback[Schema$AccountActiveAdSummary]): Unit = js.native
  def get(params: ParamsDollarResourceDollarAccountactiveadsummariesDollarGet): GaxiosPromise[Schema$AccountActiveAdSummary] = js.native
  def get(
    params: ParamsDollarResourceDollarAccountactiveadsummariesDollarGet,
    callback: BodyResponseCallback[Schema$AccountActiveAdSummary]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarAccountactiveadsummariesDollarGet,
    options: BodyResponseCallback[Schema$AccountActiveAdSummary],
    callback: BodyResponseCallback[Schema$AccountActiveAdSummary]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarAccountactiveadsummariesDollarGet, options: MethodOptions): GaxiosPromise[Schema$AccountActiveAdSummary] = js.native
  def get(
    params: ParamsDollarResourceDollarAccountactiveadsummariesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AccountActiveAdSummary]
  ): Unit = js.native
}

