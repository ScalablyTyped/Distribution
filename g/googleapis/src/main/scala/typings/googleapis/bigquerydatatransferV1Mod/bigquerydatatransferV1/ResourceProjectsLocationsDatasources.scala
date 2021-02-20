package typings.googleapis.bigquerydatatransferV1Mod.bigquerydatatransferV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/bigquerydatatransfer/v1", "bigquerydatatransfer_v1.Resource$Projects$Locations$Datasources")
@js.native
class ResourceProjectsLocationsDatasources protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  /**
    * bigquerydatatransfer.projects.locations.dataSources.checkValidCreds
    * @desc Returns true if valid credentials exist for the given data source
    * and requesting user. Some data sources doesn't support service account,
    * so we need to talk to them on behalf of the end user. This API just
    * checks whether we have OAuth token for the particular user, which is a
    * pre-requisite before user can create a transfer config.
    * @alias
    * bigquerydatatransfer.projects.locations.dataSources.checkValidCreds
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
  def checkValidCreds(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaCheckValidCredsResponse] = js.native
  def checkValidCreds(params: ParamsResourceProjectsLocationsDatasourcesCheckvalidcreds): GaxiosPromise[SchemaCheckValidCredsResponse] = js.native
  def checkValidCreds(
    params: ParamsResourceProjectsLocationsDatasourcesCheckvalidcreds,
    callback: BodyResponseCallback[SchemaCheckValidCredsResponse]
  ): Unit = js.native
  def checkValidCreds(
    params: ParamsResourceProjectsLocationsDatasourcesCheckvalidcreds,
    options: BodyResponseCallback[SchemaCheckValidCredsResponse],
    callback: BodyResponseCallback[SchemaCheckValidCredsResponse]
  ): Unit = js.native
  def checkValidCreds(params: ParamsResourceProjectsLocationsDatasourcesCheckvalidcreds, options: MethodOptions): GaxiosPromise[SchemaCheckValidCredsResponse] = js.native
  def checkValidCreds(
    params: ParamsResourceProjectsLocationsDatasourcesCheckvalidcreds,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCheckValidCredsResponse]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  /**
    * bigquerydatatransfer.projects.locations.dataSources.get
    * @desc Retrieves a supported data source and returns its settings, which
    * can be used for UI rendering.
    * @alias bigquerydatatransfer.projects.locations.dataSources.get
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
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaDataSource] = js.native
  def get(params: ParamsResourceProjectsLocationsDatasourcesGet): GaxiosPromise[SchemaDataSource] = js.native
  def get(
    params: ParamsResourceProjectsLocationsDatasourcesGet,
    callback: BodyResponseCallback[SchemaDataSource]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsDatasourcesGet,
    options: BodyResponseCallback[SchemaDataSource],
    callback: BodyResponseCallback[SchemaDataSource]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsDatasourcesGet, options: MethodOptions): GaxiosPromise[SchemaDataSource] = js.native
  def get(
    params: ParamsResourceProjectsLocationsDatasourcesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDataSource]
  ): Unit = js.native
  
  /**
    * bigquerydatatransfer.projects.locations.dataSources.list
    * @desc Lists supported data sources and returns their settings, which can
    * be used for UI rendering.
    * @alias bigquerydatatransfer.projects.locations.dataSources.list
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
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListDataSourcesResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsDatasourcesList): GaxiosPromise[SchemaListDataSourcesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsDatasourcesList,
    callback: BodyResponseCallback[SchemaListDataSourcesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsDatasourcesList,
    options: BodyResponseCallback[SchemaListDataSourcesResponse],
    callback: BodyResponseCallback[SchemaListDataSourcesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsDatasourcesList, options: MethodOptions): GaxiosPromise[SchemaListDataSourcesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsDatasourcesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListDataSourcesResponse]
  ): Unit = js.native
}
