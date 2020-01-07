package typings.googleapis.buildSrcApisFusiontablesV1Mod.fusiontables_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/fusiontables/v1", "fusiontables_v1.Resource$Query")
@js.native
class Resource$Query protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * fusiontables.query.sql
    * @desc Executes an SQL SELECT/INSERT/UPDATE/DELETE/SHOW/DESCRIBE/CREATE
    * statement.
    * @alias fusiontables.query.sql
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.hdrs Should column names be included (in the first row)?. Default is true.
    * @param {string} params.sql An SQL SELECT/SHOW/DESCRIBE/INSERT/UPDATE/DELETE/CREATE statement.
    * @param {boolean=} params.typed Should typed values be returned in the (JSON) response -- numbers for numeric values and parsed geometries for KML values? Default is true.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def sql(): GaxiosPromise[Schema$Sqlresponse] = js.native
  def sql(callback: BodyResponseCallback[Schema$Sqlresponse]): Unit = js.native
  def sql(params: ParamsDollarResourceDollarQueryDollarSql): GaxiosPromise[Schema$Sqlresponse] = js.native
  def sql(
    params: ParamsDollarResourceDollarQueryDollarSql,
    callback: BodyResponseCallback[Schema$Sqlresponse]
  ): Unit = js.native
  def sql(
    params: ParamsDollarResourceDollarQueryDollarSql,
    options: BodyResponseCallback[Schema$Sqlresponse],
    callback: BodyResponseCallback[Schema$Sqlresponse]
  ): Unit = js.native
  def sql(params: ParamsDollarResourceDollarQueryDollarSql, options: MethodOptions): GaxiosPromise[Schema$Sqlresponse] = js.native
  def sql(
    params: ParamsDollarResourceDollarQueryDollarSql,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Sqlresponse]
  ): Unit = js.native
  /**
    * fusiontables.query.sqlGet
    * @desc Executes an SQL SELECT/SHOW/DESCRIBE statement.
    * @alias fusiontables.query.sqlGet
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.hdrs Should column names be included (in the first row)?. Default is true.
    * @param {string} params.sql An SQL SELECT/SHOW/DESCRIBE statement.
    * @param {boolean=} params.typed Should typed values be returned in the (JSON) response -- numbers for numeric values and parsed geometries for KML values? Default is true.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def sqlGet(): GaxiosPromise[Schema$Sqlresponse] = js.native
  def sqlGet(callback: BodyResponseCallback[Schema$Sqlresponse]): Unit = js.native
  def sqlGet(params: ParamsDollarResourceDollarQueryDollarSqlget): GaxiosPromise[Schema$Sqlresponse] = js.native
  def sqlGet(
    params: ParamsDollarResourceDollarQueryDollarSqlget,
    callback: BodyResponseCallback[Schema$Sqlresponse]
  ): Unit = js.native
  def sqlGet(
    params: ParamsDollarResourceDollarQueryDollarSqlget,
    options: BodyResponseCallback[Schema$Sqlresponse],
    callback: BodyResponseCallback[Schema$Sqlresponse]
  ): Unit = js.native
  def sqlGet(params: ParamsDollarResourceDollarQueryDollarSqlget, options: MethodOptions): GaxiosPromise[Schema$Sqlresponse] = js.native
  def sqlGet(
    params: ParamsDollarResourceDollarQueryDollarSqlget,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Sqlresponse]
  ): Unit = js.native
}

