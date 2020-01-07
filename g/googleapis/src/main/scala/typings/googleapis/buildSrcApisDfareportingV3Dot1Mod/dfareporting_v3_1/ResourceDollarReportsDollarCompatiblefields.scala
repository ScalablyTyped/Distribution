package typings.googleapis.buildSrcApisDfareportingV3Dot1Mod.dfareporting_v3_1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dfareporting/v3.1", "dfareporting_v3_1.Resource$Reports$Compatiblefields")
@js.native
class ResourceDollarReportsDollarCompatiblefields protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dfareporting.reports.compatibleFields.query
    * @desc Returns the fields that are compatible to be selected in the
    * respective sections of a report criteria, given the fields already
    * selected in the input report and user permissions.
    * @alias dfareporting.reports.compatibleFields.query
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId The DFA user profile ID.
    * @param {().Report} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def query(): GaxiosPromise[Schema$CompatibleFields] = js.native
  def query(callback: BodyResponseCallback[Schema$CompatibleFields]): Unit = js.native
  def query(params: ParamsDollarResourceDollarReportsDollarCompatiblefieldsDollarQuery): GaxiosPromise[Schema$CompatibleFields] = js.native
  def query(
    params: ParamsDollarResourceDollarReportsDollarCompatiblefieldsDollarQuery,
    callback: BodyResponseCallback[Schema$CompatibleFields]
  ): Unit = js.native
  def query(
    params: ParamsDollarResourceDollarReportsDollarCompatiblefieldsDollarQuery,
    options: BodyResponseCallback[Schema$CompatibleFields],
    callback: BodyResponseCallback[Schema$CompatibleFields]
  ): Unit = js.native
  def query(params: ParamsDollarResourceDollarReportsDollarCompatiblefieldsDollarQuery, options: MethodOptions): GaxiosPromise[Schema$CompatibleFields] = js.native
  def query(
    params: ParamsDollarResourceDollarReportsDollarCompatiblefieldsDollarQuery,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$CompatibleFields]
  ): Unit = js.native
}

