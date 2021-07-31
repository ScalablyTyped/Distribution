package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/cloudsearch/v1", "cloudsearch_v1.Resource$Settings$Datasources")
@js.native
class ResourceSettingsDatasources protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * cloudsearch.settings.datasources.create
    * @desc Creates a datasource.
    * @alias cloudsearch.settings.datasources.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().DataSource} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaOperation] = js.native
  def create(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(params: ParamsResourceSettingsDatasourcesCreate): GaxiosPromise[SchemaOperation] = js.native
  def create(params: ParamsResourceSettingsDatasourcesCreate, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def create(
    params: ParamsResourceSettingsDatasourcesCreate,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def create(params: ParamsResourceSettingsDatasourcesCreate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceSettingsDatasourcesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * cloudsearch.settings.datasources.delete
    * @desc Deletes a datasource.
    * @alias cloudsearch.settings.datasources.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.debugOptions.enableDebugging If set, the request will enable debugging features of Cloud Search. Only turn on this field, if asked by Google to help with debugging.
    * @param {string} params.name Name of the datasource. Format: datasources/{source_id}.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceSettingsDatasourcesDelete): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceSettingsDatasourcesDelete, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(
    params: ParamsResourceSettingsDatasourcesDelete,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceSettingsDatasourcesDelete, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceSettingsDatasourcesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  
  /**
    * cloudsearch.settings.datasources.get
    * @desc Gets a datasource.
    * @alias cloudsearch.settings.datasources.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.debugOptions.enableDebugging If set, the request will enable debugging features of Cloud Search. Only turn on this field, if asked by Google to help with debugging.
    * @param {string} params.name Name of the datasource resource. Format: datasources/{source_id}.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaDataSource] = js.native
  def get(callback: BodyResponseCallback[SchemaDataSource]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDataSource] = js.native
  def get(params: ParamsResourceSettingsDatasourcesGet): GaxiosPromise[SchemaDataSource] = js.native
  def get(params: ParamsResourceSettingsDatasourcesGet, callback: BodyResponseCallback[SchemaDataSource]): Unit = js.native
  def get(
    params: ParamsResourceSettingsDatasourcesGet,
    options: BodyResponseCallback[SchemaDataSource],
    callback: BodyResponseCallback[SchemaDataSource]
  ): Unit = js.native
  def get(params: ParamsResourceSettingsDatasourcesGet, options: MethodOptions): GaxiosPromise[SchemaDataSource] = js.native
  def get(
    params: ParamsResourceSettingsDatasourcesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDataSource]
  ): Unit = js.native
  
  /**
    * cloudsearch.settings.datasources.list
    * @desc Lists datasources.
    * @alias cloudsearch.settings.datasources.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.debugOptions.enableDebugging If set, the request will enable debugging features of Cloud Search. Only turn on this field, if asked by Google to help with debugging.
    * @param {integer=} params.pageSize Maximum number of datasources to fetch in a request. The max value is 100. <br />The default value is 10
    * @param {string=} params.pageToken Starting index of the results.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListDataSourceResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListDataSourceResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListDataSourceResponse] = js.native
  def list(params: ParamsResourceSettingsDatasourcesList): GaxiosPromise[SchemaListDataSourceResponse] = js.native
  def list(
    params: ParamsResourceSettingsDatasourcesList,
    callback: BodyResponseCallback[SchemaListDataSourceResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceSettingsDatasourcesList,
    options: BodyResponseCallback[SchemaListDataSourceResponse],
    callback: BodyResponseCallback[SchemaListDataSourceResponse]
  ): Unit = js.native
  def list(params: ParamsResourceSettingsDatasourcesList, options: MethodOptions): GaxiosPromise[SchemaListDataSourceResponse] = js.native
  def list(
    params: ParamsResourceSettingsDatasourcesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListDataSourceResponse]
  ): Unit = js.native
  
  /**
    * cloudsearch.settings.datasources.update
    * @desc Updates a datasource.
    * @alias cloudsearch.settings.datasources.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Name of the datasource resource. Format: datasources/{source_id}. <br />The name is ignored when creating a datasource.
    * @param {().UpdateDataSourceRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaOperation] = js.native
  def update(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def update(params: ParamsResourceSettingsDatasourcesUpdate): GaxiosPromise[SchemaOperation] = js.native
  def update(params: ParamsResourceSettingsDatasourcesUpdate, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def update(
    params: ParamsResourceSettingsDatasourcesUpdate,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def update(params: ParamsResourceSettingsDatasourcesUpdate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def update(
    params: ParamsResourceSettingsDatasourcesUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
}
