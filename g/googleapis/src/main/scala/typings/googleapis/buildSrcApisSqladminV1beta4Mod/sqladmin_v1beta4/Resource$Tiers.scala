package typings.googleapis.buildSrcApisSqladminV1beta4Mod.sqladmin_v1beta4

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/sqladmin/v1beta4", "sqladmin_v1beta4.Resource$Tiers")
@js.native
class Resource$Tiers protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * sql.tiers.list
    * @desc Lists all available machine types (tiers) for Cloud SQL, for
    * example, db-n1-standard-1. For related information, see Pricing.
    * @alias sql.tiers.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID of the project for which to list tiers.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$TiersListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$TiersListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarTiersDollarList): GaxiosPromise[Schema$TiersListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarTiersDollarList,
    callback: BodyResponseCallback[Schema$TiersListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarTiersDollarList,
    options: BodyResponseCallback[Schema$TiersListResponse],
    callback: BodyResponseCallback[Schema$TiersListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarTiersDollarList, options: MethodOptions): GaxiosPromise[Schema$TiersListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarTiersDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$TiersListResponse]
  ): Unit = js.native
}

