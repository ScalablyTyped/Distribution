package typings.googleapis.buildSrcApisCloudsearchV1Mod.cloudsearch_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/cloudsearch/v1", "cloudsearch_v1.Resource$Indexing$Datasources")
@js.native
class ResourceDollarIndexingDollarDatasources protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var items: ResourceDollarIndexingDollarDatasourcesDollarItems = js.native
  /**
    * cloudsearch.indexing.datasources.deleteSchema
    * @desc Deletes the schema of a data source.
    * @alias cloudsearch.indexing.datasources.deleteSchema
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.debugOptions.enableDebugging If set, the request will enable debugging features of Cloud Search. Only turn on this field, if asked by Google to help with debugging.
    * @param {string} params.name Name of the data source to delete Schema.  Format: datasources/{source_id}
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def deleteSchema(): GaxiosPromise[Schema$Operation] = js.native
  def deleteSchema(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def deleteSchema(params: ParamsDollarResourceDollarIndexingDollarDatasourcesDollarDeleteschema): GaxiosPromise[Schema$Operation] = js.native
  def deleteSchema(
    params: ParamsDollarResourceDollarIndexingDollarDatasourcesDollarDeleteschema,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def deleteSchema(
    params: ParamsDollarResourceDollarIndexingDollarDatasourcesDollarDeleteschema,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def deleteSchema(
    params: ParamsDollarResourceDollarIndexingDollarDatasourcesDollarDeleteschema,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def deleteSchema(
    params: ParamsDollarResourceDollarIndexingDollarDatasourcesDollarDeleteschema,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * cloudsearch.indexing.datasources.getSchema
    * @desc Gets the schema of a data source.
    * @alias cloudsearch.indexing.datasources.getSchema
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.debugOptions.enableDebugging If set, the request will enable debugging features of Cloud Search. Only turn on this field, if asked by Google to help with debugging.
    * @param {string} params.name Name of the data source to get Schema.  Format: datasources/{source_id}
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getSchema(): GaxiosPromise[Schema$Schema] = js.native
  def getSchema(callback: BodyResponseCallback[Schema$Schema]): Unit = js.native
  def getSchema(params: ParamsDollarResourceDollarIndexingDollarDatasourcesDollarGetschema): GaxiosPromise[Schema$Schema] = js.native
  def getSchema(
    params: ParamsDollarResourceDollarIndexingDollarDatasourcesDollarGetschema,
    callback: BodyResponseCallback[Schema$Schema]
  ): Unit = js.native
  def getSchema(
    params: ParamsDollarResourceDollarIndexingDollarDatasourcesDollarGetschema,
    options: BodyResponseCallback[Schema$Schema],
    callback: BodyResponseCallback[Schema$Schema]
  ): Unit = js.native
  def getSchema(params: ParamsDollarResourceDollarIndexingDollarDatasourcesDollarGetschema, options: MethodOptions): GaxiosPromise[Schema$Schema] = js.native
  def getSchema(
    params: ParamsDollarResourceDollarIndexingDollarDatasourcesDollarGetschema,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Schema]
  ): Unit = js.native
  /**
    * cloudsearch.indexing.datasources.updateSchema
    * @desc Updates the schema of a data source.
    * @alias cloudsearch.indexing.datasources.updateSchema
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Name of the data source to update Schema.  Format: datasources/{source_id}
    * @param {().UpdateSchemaRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def updateSchema(): GaxiosPromise[Schema$Operation] = js.native
  def updateSchema(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def updateSchema(params: ParamsDollarResourceDollarIndexingDollarDatasourcesDollarUpdateschema): GaxiosPromise[Schema$Operation] = js.native
  def updateSchema(
    params: ParamsDollarResourceDollarIndexingDollarDatasourcesDollarUpdateschema,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def updateSchema(
    params: ParamsDollarResourceDollarIndexingDollarDatasourcesDollarUpdateschema,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def updateSchema(
    params: ParamsDollarResourceDollarIndexingDollarDatasourcesDollarUpdateschema,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def updateSchema(
    params: ParamsDollarResourceDollarIndexingDollarDatasourcesDollarUpdateschema,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
}

