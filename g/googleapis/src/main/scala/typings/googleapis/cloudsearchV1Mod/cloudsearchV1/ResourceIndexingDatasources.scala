package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/cloudsearch/v1", "cloudsearch_v1.Resource$Indexing$Datasources")
@js.native
class ResourceIndexingDatasources protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
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
  def deleteSchema(): GaxiosPromise[SchemaOperation] = js.native
  def deleteSchema(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def deleteSchema(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def deleteSchema(params: ParamsResourceIndexingDatasourcesDeleteschema): GaxiosPromise[SchemaOperation] = js.native
  def deleteSchema(
    params: ParamsResourceIndexingDatasourcesDeleteschema,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def deleteSchema(
    params: ParamsResourceIndexingDatasourcesDeleteschema,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def deleteSchema(params: ParamsResourceIndexingDatasourcesDeleteschema, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def deleteSchema(
    params: ParamsResourceIndexingDatasourcesDeleteschema,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
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
  def getSchema(): GaxiosPromise[SchemaSchema] = js.native
  def getSchema(callback: BodyResponseCallback[SchemaSchema]): Unit = js.native
  def getSchema(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSchema] = js.native
  def getSchema(params: ParamsResourceIndexingDatasourcesGetschema): GaxiosPromise[SchemaSchema] = js.native
  def getSchema(params: ParamsResourceIndexingDatasourcesGetschema, callback: BodyResponseCallback[SchemaSchema]): Unit = js.native
  def getSchema(
    params: ParamsResourceIndexingDatasourcesGetschema,
    options: BodyResponseCallback[SchemaSchema],
    callback: BodyResponseCallback[SchemaSchema]
  ): Unit = js.native
  def getSchema(params: ParamsResourceIndexingDatasourcesGetschema, options: MethodOptions): GaxiosPromise[SchemaSchema] = js.native
  def getSchema(
    params: ParamsResourceIndexingDatasourcesGetschema,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSchema]
  ): Unit = js.native
  
  var items: ResourceIndexingDatasourcesItems = js.native
  
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
  def updateSchema(): GaxiosPromise[SchemaOperation] = js.native
  def updateSchema(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def updateSchema(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def updateSchema(params: ParamsResourceIndexingDatasourcesUpdateschema): GaxiosPromise[SchemaOperation] = js.native
  def updateSchema(
    params: ParamsResourceIndexingDatasourcesUpdateschema,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def updateSchema(
    params: ParamsResourceIndexingDatasourcesUpdateschema,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def updateSchema(params: ParamsResourceIndexingDatasourcesUpdateschema, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def updateSchema(
    params: ParamsResourceIndexingDatasourcesUpdateschema,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
}
