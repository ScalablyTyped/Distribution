package typings.googleapis.buildSrcApisBigquerydatatransferV1Mod.bigquerydatatransfer_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/bigquerydatatransfer/v1", "bigquerydatatransfer_v1.Resource$Projects$Locations$Datasources")
@js.native
class ResourceDollarProjectsDollarLocationsDollarDatasources protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
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
  def checkValidCreds(): GaxiosPromise[Schema$CheckValidCredsResponse] = js.native
  def checkValidCreds(callback: BodyResponseCallback[Schema$CheckValidCredsResponse]): Unit = js.native
  def checkValidCreds(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasourcesDollarCheckvalidcreds): GaxiosPromise[Schema$CheckValidCredsResponse] = js.native
  def checkValidCreds(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasourcesDollarCheckvalidcreds,
    callback: BodyResponseCallback[Schema$CheckValidCredsResponse]
  ): Unit = js.native
  def checkValidCreds(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasourcesDollarCheckvalidcreds,
    options: BodyResponseCallback[Schema$CheckValidCredsResponse],
    callback: BodyResponseCallback[Schema$CheckValidCredsResponse]
  ): Unit = js.native
  def checkValidCreds(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasourcesDollarCheckvalidcreds,
    options: MethodOptions
  ): GaxiosPromise[Schema$CheckValidCredsResponse] = js.native
  def checkValidCreds(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasourcesDollarCheckvalidcreds,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$CheckValidCredsResponse]
  ): Unit = js.native
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
  def get(): GaxiosPromise[Schema$DataSource] = js.native
  def get(callback: BodyResponseCallback[Schema$DataSource]): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasourcesDollarGet): GaxiosPromise[Schema$DataSource] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasourcesDollarGet,
    callback: BodyResponseCallback[Schema$DataSource]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasourcesDollarGet,
    options: BodyResponseCallback[Schema$DataSource],
    callback: BodyResponseCallback[Schema$DataSource]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasourcesDollarGet,
    options: MethodOptions
  ): GaxiosPromise[Schema$DataSource] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasourcesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$DataSource]
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
  def list(): GaxiosPromise[Schema$ListDataSourcesResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListDataSourcesResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasourcesDollarList): GaxiosPromise[Schema$ListDataSourcesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasourcesDollarList,
    callback: BodyResponseCallback[Schema$ListDataSourcesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasourcesDollarList,
    options: BodyResponseCallback[Schema$ListDataSourcesResponse],
    callback: BodyResponseCallback[Schema$ListDataSourcesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasourcesDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$ListDataSourcesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarDatasourcesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListDataSourcesResponse]
  ): Unit = js.native
}

