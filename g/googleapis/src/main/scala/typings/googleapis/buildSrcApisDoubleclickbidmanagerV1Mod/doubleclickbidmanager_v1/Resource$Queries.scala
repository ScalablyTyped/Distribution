package typings.googleapis.buildSrcApisDoubleclickbidmanagerV1Mod.doubleclickbidmanager_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/doubleclickbidmanager/v1", "doubleclickbidmanager_v1.Resource$Queries")
@js.native
class Resource$Queries protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * doubleclickbidmanager.queries.createquery
    * @desc Creates a query.
    * @alias doubleclickbidmanager.queries.createquery
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().Query} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def createquery(): GaxiosPromise[Schema$Query] = js.native
  def createquery(callback: BodyResponseCallback[Schema$Query]): Unit = js.native
  def createquery(params: ParamsDollarResourceDollarQueriesDollarCreatequery): GaxiosPromise[Schema$Query] = js.native
  def createquery(
    params: ParamsDollarResourceDollarQueriesDollarCreatequery,
    callback: BodyResponseCallback[Schema$Query]
  ): Unit = js.native
  def createquery(
    params: ParamsDollarResourceDollarQueriesDollarCreatequery,
    options: BodyResponseCallback[Schema$Query],
    callback: BodyResponseCallback[Schema$Query]
  ): Unit = js.native
  def createquery(params: ParamsDollarResourceDollarQueriesDollarCreatequery, options: MethodOptions): GaxiosPromise[Schema$Query] = js.native
  def createquery(
    params: ParamsDollarResourceDollarQueriesDollarCreatequery,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Query]
  ): Unit = js.native
  /**
    * doubleclickbidmanager.queries.deletequery
    * @desc Deletes a stored query as well as the associated stored reports.
    * @alias doubleclickbidmanager.queries.deletequery
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.queryId Query ID to delete.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def deletequery(): GaxiosPromise[Unit] = js.native
  def deletequery(callback: BodyResponseCallback[Unit]): Unit = js.native
  def deletequery(params: ParamsDollarResourceDollarQueriesDollarDeletequery): GaxiosPromise[Unit] = js.native
  def deletequery(params: ParamsDollarResourceDollarQueriesDollarDeletequery, callback: BodyResponseCallback[Unit]): Unit = js.native
  def deletequery(
    params: ParamsDollarResourceDollarQueriesDollarDeletequery,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def deletequery(params: ParamsDollarResourceDollarQueriesDollarDeletequery, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def deletequery(
    params: ParamsDollarResourceDollarQueriesDollarDeletequery,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * doubleclickbidmanager.queries.getquery
    * @desc Retrieves a stored query.
    * @alias doubleclickbidmanager.queries.getquery
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.queryId Query ID to retrieve.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getquery(): GaxiosPromise[Schema$Query] = js.native
  def getquery(callback: BodyResponseCallback[Schema$Query]): Unit = js.native
  def getquery(params: ParamsDollarResourceDollarQueriesDollarGetquery): GaxiosPromise[Schema$Query] = js.native
  def getquery(
    params: ParamsDollarResourceDollarQueriesDollarGetquery,
    callback: BodyResponseCallback[Schema$Query]
  ): Unit = js.native
  def getquery(
    params: ParamsDollarResourceDollarQueriesDollarGetquery,
    options: BodyResponseCallback[Schema$Query],
    callback: BodyResponseCallback[Schema$Query]
  ): Unit = js.native
  def getquery(params: ParamsDollarResourceDollarQueriesDollarGetquery, options: MethodOptions): GaxiosPromise[Schema$Query] = js.native
  def getquery(
    params: ParamsDollarResourceDollarQueriesDollarGetquery,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Query]
  ): Unit = js.native
  /**
    * doubleclickbidmanager.queries.listqueries
    * @desc Retrieves stored queries.
    * @alias doubleclickbidmanager.queries.listqueries
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def listqueries(): GaxiosPromise[Schema$ListQueriesResponse] = js.native
  def listqueries(callback: BodyResponseCallback[Schema$ListQueriesResponse]): Unit = js.native
  def listqueries(params: ParamsDollarResourceDollarQueriesDollarListqueries): GaxiosPromise[Schema$ListQueriesResponse] = js.native
  def listqueries(
    params: ParamsDollarResourceDollarQueriesDollarListqueries,
    callback: BodyResponseCallback[Schema$ListQueriesResponse]
  ): Unit = js.native
  def listqueries(
    params: ParamsDollarResourceDollarQueriesDollarListqueries,
    options: BodyResponseCallback[Schema$ListQueriesResponse],
    callback: BodyResponseCallback[Schema$ListQueriesResponse]
  ): Unit = js.native
  def listqueries(params: ParamsDollarResourceDollarQueriesDollarListqueries, options: MethodOptions): GaxiosPromise[Schema$ListQueriesResponse] = js.native
  def listqueries(
    params: ParamsDollarResourceDollarQueriesDollarListqueries,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListQueriesResponse]
  ): Unit = js.native
  /**
    * doubleclickbidmanager.queries.runquery
    * @desc Runs a stored query to generate a report.
    * @alias doubleclickbidmanager.queries.runquery
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.queryId Query ID to run.
    * @param {().RunQueryRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def runquery(): GaxiosPromise[Unit] = js.native
  def runquery(callback: BodyResponseCallback[Unit]): Unit = js.native
  def runquery(params: ParamsDollarResourceDollarQueriesDollarRunquery): GaxiosPromise[Unit] = js.native
  def runquery(params: ParamsDollarResourceDollarQueriesDollarRunquery, callback: BodyResponseCallback[Unit]): Unit = js.native
  def runquery(
    params: ParamsDollarResourceDollarQueriesDollarRunquery,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def runquery(params: ParamsDollarResourceDollarQueriesDollarRunquery, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def runquery(
    params: ParamsDollarResourceDollarQueriesDollarRunquery,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
}

