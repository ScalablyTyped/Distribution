package typings.googleapis.buildSrcApisSqladminV1beta4Mod.sqladmin_v1beta4

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/sqladmin/v1beta4", "sqladmin_v1beta4.Resource$Flags")
@js.native
class Resource$Flags protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * sql.flags.list
    * @desc List all available database flags for Cloud SQL instances.
    * @alias sql.flags.list
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {string=} params.databaseVersion Database type and version you want to retrieve flags for. By default, this method returns flags for all database types and versions.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$FlagsListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$FlagsListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarFlagsDollarList): GaxiosPromise[Schema$FlagsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarFlagsDollarList,
    callback: BodyResponseCallback[Schema$FlagsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarFlagsDollarList,
    options: BodyResponseCallback[Schema$FlagsListResponse],
    callback: BodyResponseCallback[Schema$FlagsListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarFlagsDollarList, options: MethodOptions): GaxiosPromise[Schema$FlagsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarFlagsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$FlagsListResponse]
  ): Unit = js.native
}

