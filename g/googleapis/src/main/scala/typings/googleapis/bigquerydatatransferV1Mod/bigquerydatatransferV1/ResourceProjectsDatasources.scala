package typings.googleapis.bigquerydatatransferV1Mod.bigquerydatatransferV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/bigquerydatatransfer/v1", "bigquerydatatransfer_v1.Resource$Projects$Datasources")
@js.native
class ResourceProjectsDatasources protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * bigquerydatatransfer.projects.dataSources.checkValidCreds
    * @desc Returns true if valid credentials exist for the given data source
    * and requesting user. Some data sources doesn't support service account,
    * so we need to talk to them on behalf of the end user. This API just
    * checks whether we have OAuth token for the particular user, which is a
    * pre-requisite before user can create a transfer config.
    * @alias bigquerydatatransfer.projects.dataSources.checkValidCreds
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The data source in the form: `projects/{project_id}/dataSources/{data_source_id}`
    * @param {().CheckValidCredsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def checkValidCreds(): GaxiosPromise[SchemaCheckValidCredsResponse] = js.native
  def checkValidCreds(callback: BodyResponseCallback[SchemaCheckValidCredsResponse]): Unit = js.native
  def checkValidCreds(params: ParamsResourceProjectsDatasourcesCheckvalidcreds): GaxiosPromise[SchemaCheckValidCredsResponse] = js.native
  def checkValidCreds(
    params: ParamsResourceProjectsDatasourcesCheckvalidcreds,
    callback: BodyResponseCallback[SchemaCheckValidCredsResponse]
  ): Unit = js.native
  def checkValidCreds(
    params: ParamsResourceProjectsDatasourcesCheckvalidcreds,
    options: BodyResponseCallback[SchemaCheckValidCredsResponse],
    callback: BodyResponseCallback[SchemaCheckValidCredsResponse]
  ): Unit = js.native
  def checkValidCreds(params: ParamsResourceProjectsDatasourcesCheckvalidcreds, options: MethodOptions): GaxiosPromise[SchemaCheckValidCredsResponse] = js.native
  def checkValidCreds(
    params: ParamsResourceProjectsDatasourcesCheckvalidcreds,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCheckValidCredsResponse]
  ): Unit = js.native
  /**
    * bigquerydatatransfer.projects.dataSources.get
    * @desc Retrieves a supported data source and returns its settings, which
    * can be used for UI rendering.
    * @alias bigquerydatatransfer.projects.dataSources.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The field will contain name of the resource requested, for example: `projects/{project_id}/dataSources/{data_source_id}`
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaDataSource] = js.native
  def get(callback: BodyResponseCallback[SchemaDataSource]): Unit = js.native
  def get(params: ParamsResourceProjectsDatasourcesGet): GaxiosPromise[SchemaDataSource] = js.native
  def get(params: ParamsResourceProjectsDatasourcesGet, callback: BodyResponseCallback[SchemaDataSource]): Unit = js.native
  def get(
    params: ParamsResourceProjectsDatasourcesGet,
    options: BodyResponseCallback[SchemaDataSource],
    callback: BodyResponseCallback[SchemaDataSource]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsDatasourcesGet, options: MethodOptions): GaxiosPromise[SchemaDataSource] = js.native
  def get(
    params: ParamsResourceProjectsDatasourcesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDataSource]
  ): Unit = js.native
  /**
    * bigquerydatatransfer.projects.dataSources.list
    * @desc Lists supported data sources and returns their settings, which can
    * be used for UI rendering.
    * @alias bigquerydatatransfer.projects.dataSources.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize Page size. The default page size is the maximum value of 1000 results.
    * @param {string=} params.pageToken Pagination token, which can be used to request a specific page of `ListDataSourcesRequest` list results. For multiple-page results, `ListDataSourcesResponse` outputs a `next_page` token, which can be used as the `page_token` value to request the next page of list results.
    * @param {string} params.parent The BigQuery project id for which data sources should be returned. Must be in the form: `projects/{project_id}`
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListDataSourcesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListDataSourcesResponse]): Unit = js.native
  def list(params: ParamsResourceProjectsDatasourcesList): GaxiosPromise[SchemaListDataSourcesResponse] = js.native
  def list(
    params: ParamsResourceProjectsDatasourcesList,
    callback: BodyResponseCallback[SchemaListDataSourcesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsDatasourcesList,
    options: BodyResponseCallback[SchemaListDataSourcesResponse],
    callback: BodyResponseCallback[SchemaListDataSourcesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsDatasourcesList, options: MethodOptions): GaxiosPromise[SchemaListDataSourcesResponse] = js.native
  def list(
    params: ParamsResourceProjectsDatasourcesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListDataSourcesResponse]
  ): Unit = js.native
}

