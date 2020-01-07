package typings.googleapis.buildSrcApisCloudsearchV1Mod.cloudsearch_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/cloudsearch/v1", "cloudsearch_v1.Resource$Settings$Datasources")
@js.native
class ResourceDollarSettingsDollarDatasources protected () extends js.Object {
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
  def create(): GaxiosPromise[Schema$Operation] = js.native
  def create(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def create(params: ParamsDollarResourceDollarSettingsDollarDatasourcesDollarCreate): GaxiosPromise[Schema$Operation] = js.native
  def create(
    params: ParamsDollarResourceDollarSettingsDollarDatasourcesDollarCreate,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarSettingsDollarDatasourcesDollarCreate,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def create(params: ParamsDollarResourceDollarSettingsDollarDatasourcesDollarCreate, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def create(
    params: ParamsDollarResourceDollarSettingsDollarDatasourcesDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
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
  def delete(): GaxiosPromise[Schema$Operation] = js.native
  def delete(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarSettingsDollarDatasourcesDollarDelete): GaxiosPromise[Schema$Operation] = js.native
  def delete(
    params: ParamsDollarResourceDollarSettingsDollarDatasourcesDollarDelete,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarSettingsDollarDatasourcesDollarDelete,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarSettingsDollarDatasourcesDollarDelete, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def delete(
    params: ParamsDollarResourceDollarSettingsDollarDatasourcesDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
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
  def get(): GaxiosPromise[Schema$DataSource] = js.native
  def get(callback: BodyResponseCallback[Schema$DataSource]): Unit = js.native
  def get(params: ParamsDollarResourceDollarSettingsDollarDatasourcesDollarGet): GaxiosPromise[Schema$DataSource] = js.native
  def get(
    params: ParamsDollarResourceDollarSettingsDollarDatasourcesDollarGet,
    callback: BodyResponseCallback[Schema$DataSource]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarSettingsDollarDatasourcesDollarGet,
    options: BodyResponseCallback[Schema$DataSource],
    callback: BodyResponseCallback[Schema$DataSource]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarSettingsDollarDatasourcesDollarGet, options: MethodOptions): GaxiosPromise[Schema$DataSource] = js.native
  def get(
    params: ParamsDollarResourceDollarSettingsDollarDatasourcesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$DataSource]
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
  def list(): GaxiosPromise[Schema$ListDataSourceResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListDataSourceResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarSettingsDollarDatasourcesDollarList): GaxiosPromise[Schema$ListDataSourceResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarSettingsDollarDatasourcesDollarList,
    callback: BodyResponseCallback[Schema$ListDataSourceResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarSettingsDollarDatasourcesDollarList,
    options: BodyResponseCallback[Schema$ListDataSourceResponse],
    callback: BodyResponseCallback[Schema$ListDataSourceResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarSettingsDollarDatasourcesDollarList, options: MethodOptions): GaxiosPromise[Schema$ListDataSourceResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarSettingsDollarDatasourcesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListDataSourceResponse]
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
  def update(): GaxiosPromise[Schema$Operation] = js.native
  def update(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def update(params: ParamsDollarResourceDollarSettingsDollarDatasourcesDollarUpdate): GaxiosPromise[Schema$Operation] = js.native
  def update(
    params: ParamsDollarResourceDollarSettingsDollarDatasourcesDollarUpdate,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarSettingsDollarDatasourcesDollarUpdate,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarSettingsDollarDatasourcesDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def update(
    params: ParamsDollarResourceDollarSettingsDollarDatasourcesDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
}

