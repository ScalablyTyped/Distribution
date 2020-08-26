package typings.googleapis.bigquerydatatransferV1Mod.bigquerydatatransferV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/bigquerydatatransfer/v1", "bigquerydatatransfer_v1.Resource$Projects$Locations$Transferconfigs")
@js.native
class ResourceProjectsLocationsTransferconfigs protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var runs: ResourceProjectsLocationsTransferconfigsRuns = js.native
  /**
    * bigquerydatatransfer.projects.locations.transferConfigs.create
    * @desc Creates a new data transfer configuration.
    * @alias bigquerydatatransfer.projects.locations.transferConfigs.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.authorizationCode Optional OAuth2 authorization code to use with this transfer configuration. This is required if new credentials are needed, as indicated by `CheckValidCreds`. In order to obtain authorization_code, please make a request to https://www.gstatic.com/bigquerydatatransfer/oauthz/auth?client_id=<datatransferapiclientid>&scope=<data_source_scopes>&redirect_uri=<redirect_uri>  * client_id should be OAuth client_id of BigQuery DTS API for the given   data source returned by ListDataSources method. * data_source_scopes are the scopes returned by ListDataSources method. * redirect_uri is an optional parameter. If not specified, then   authorization code is posted to the opener of authorization flow window.   Otherwise it will be sent to the redirect uri. A special value of   urn:ietf:wg:oauth:2.0:oob means that authorization code should be   returned in the title bar of the browser, with the page text prompting   the user to copy the code and paste it in the application.
    * @param {string} params.parent The BigQuery project id where the transfer configuration should be created. Must be in the format projects/{project_id}/locations/{location_id} If specified location and location of the destination bigquery dataset do not match - the request will fail.
    * @param {string=} params.versionInfo Optional version info. If users want to find a very recent access token, that is, immediately after approving access, users have to set the version_info claim in the token request. To obtain the version_info, users must use the “none+gsession” response type. which be return a version_info back in the authorization response which be be put in a JWT claim in the token request.
    * @param {().TransferConfig} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaTransferConfig] = js.native
  def create(callback: BodyResponseCallback[SchemaTransferConfig]): Unit = js.native
  def create(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaTransferConfig] = js.native
  def create(params: ParamsResourceProjectsLocationsTransferconfigsCreate): GaxiosPromise[SchemaTransferConfig] = js.native
  def create(
    params: ParamsResourceProjectsLocationsTransferconfigsCreate,
    callback: BodyResponseCallback[SchemaTransferConfig]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsTransferconfigsCreate,
    options: BodyResponseCallback[SchemaTransferConfig],
    callback: BodyResponseCallback[SchemaTransferConfig]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsTransferconfigsCreate, options: MethodOptions): GaxiosPromise[SchemaTransferConfig] = js.native
  def create(
    params: ParamsResourceProjectsLocationsTransferconfigsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTransferConfig]
  ): Unit = js.native
  /**
    * bigquerydatatransfer.projects.locations.transferConfigs.delete
    * @desc Deletes a data transfer configuration, including any associated
    * transfer runs and logs.
    * @alias bigquerydatatransfer.projects.locations.transferConfigs.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The field will contain name of the resource requested, for example: `projects/{project_id}/transferConfigs/{config_id}`
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsLocationsTransferconfigsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsTransferconfigsDelete,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsTransferconfigsDelete,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsTransferconfigsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsTransferconfigsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * bigquerydatatransfer.projects.locations.transferConfigs.get
    * @desc Returns information about a data transfer config.
    * @alias bigquerydatatransfer.projects.locations.transferConfigs.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The field will contain name of the resource requested, for example: `projects/{project_id}/transferConfigs/{config_id}`
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaTransferConfig] = js.native
  def get(callback: BodyResponseCallback[SchemaTransferConfig]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaTransferConfig] = js.native
  def get(params: ParamsResourceProjectsLocationsTransferconfigsGet): GaxiosPromise[SchemaTransferConfig] = js.native
  def get(
    params: ParamsResourceProjectsLocationsTransferconfigsGet,
    callback: BodyResponseCallback[SchemaTransferConfig]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsTransferconfigsGet,
    options: BodyResponseCallback[SchemaTransferConfig],
    callback: BodyResponseCallback[SchemaTransferConfig]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsTransferconfigsGet, options: MethodOptions): GaxiosPromise[SchemaTransferConfig] = js.native
  def get(
    params: ParamsResourceProjectsLocationsTransferconfigsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTransferConfig]
  ): Unit = js.native
  /**
    * bigquerydatatransfer.projects.locations.transferConfigs.list
    * @desc Returns information about all data transfers in the project.
    * @alias bigquerydatatransfer.projects.locations.transferConfigs.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.dataSourceIds When specified, only configurations of requested data sources are returned.
    * @param {integer=} params.pageSize Page size. The default page size is the maximum value of 1000 results.
    * @param {string=} params.pageToken Pagination token, which can be used to request a specific page of `ListTransfersRequest` list results. For multiple-page results, `ListTransfersResponse` outputs a `next_page` token, which can be used as the `page_token` value to request the next page of list results.
    * @param {string} params.parent The BigQuery project id for which data sources should be returned: `projects/{project_id}`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListTransferConfigsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListTransferConfigsResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListTransferConfigsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsTransferconfigsList): GaxiosPromise[SchemaListTransferConfigsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsTransferconfigsList,
    callback: BodyResponseCallback[SchemaListTransferConfigsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsTransferconfigsList,
    options: BodyResponseCallback[SchemaListTransferConfigsResponse],
    callback: BodyResponseCallback[SchemaListTransferConfigsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsTransferconfigsList, options: MethodOptions): GaxiosPromise[SchemaListTransferConfigsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsTransferconfigsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListTransferConfigsResponse]
  ): Unit = js.native
  /**
    * bigquerydatatransfer.projects.locations.transferConfigs.patch
    * @desc Updates a data transfer configuration. All fields must be set, even
    * if they are not updated.
    * @alias bigquerydatatransfer.projects.locations.transferConfigs.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.authorizationCode Optional OAuth2 authorization code to use with this transfer configuration. If it is provided, the transfer configuration will be associated with the authorizing user. In order to obtain authorization_code, please make a request to https://www.gstatic.com/bigquerydatatransfer/oauthz/auth?client_id=<datatransferapiclientid>&scope=<data_source_scopes>&redirect_uri=<redirect_uri>  * client_id should be OAuth client_id of BigQuery DTS API for the given   data source returned by ListDataSources method. * data_source_scopes are the scopes returned by ListDataSources method. * redirect_uri is an optional parameter. If not specified, then   authorization code is posted to the opener of authorization flow window.   Otherwise it will be sent to the redirect uri. A special value of   urn:ietf:wg:oauth:2.0:oob means that authorization code should be   returned in the title bar of the browser, with the page text prompting   the user to copy the code and paste it in the application.
    * @param {string} params.name The resource name of the transfer config. Transfer config names have the form of `projects/{project_id}/locations/{region}/transferConfigs/{config_id}`. The name is automatically generated based on the config_id specified in CreateTransferConfigRequest along with project_id and region. If config_id is not provided, usually a uuid, even though it is not guaranteed or required, will be generated for config_id.
    * @param {string=} params.updateMask Required list of fields to be updated in this request.
    * @param {string=} params.versionInfo Optional version info. If users want to find a very recent access token, that is, immediately after approving access, users have to set the version_info claim in the token request. To obtain the version_info, users must use the “none+gsession” response type. which be return a version_info back in the authorization response which be be put in a JWT claim in the token request.
    * @param {().TransferConfig} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaTransferConfig] = js.native
  def patch(callback: BodyResponseCallback[SchemaTransferConfig]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaTransferConfig] = js.native
  def patch(params: ParamsResourceProjectsLocationsTransferconfigsPatch): GaxiosPromise[SchemaTransferConfig] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsTransferconfigsPatch,
    callback: BodyResponseCallback[SchemaTransferConfig]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsTransferconfigsPatch,
    options: BodyResponseCallback[SchemaTransferConfig],
    callback: BodyResponseCallback[SchemaTransferConfig]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsLocationsTransferconfigsPatch, options: MethodOptions): GaxiosPromise[SchemaTransferConfig] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsTransferconfigsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTransferConfig]
  ): Unit = js.native
  /**
    * bigquerydatatransfer.projects.locations.transferConfigs.scheduleRuns
    * @desc Creates transfer runs for a time range [start_time, end_time]. For
    * each date - or whatever granularity the data source supports - in the
    * range, one transfer run is created. Note that runs are created per UTC
    * time in the time range. DEPRECATED: use StartManualTransferRuns instead.
    * @alias
    * bigquerydatatransfer.projects.locations.transferConfigs.scheduleRuns
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Transfer configuration name in the form: `projects/{project_id}/transferConfigs/{config_id}`.
    * @param {().ScheduleTransferRunsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def scheduleRuns(): GaxiosPromise[SchemaScheduleTransferRunsResponse] = js.native
  def scheduleRuns(callback: BodyResponseCallback[SchemaScheduleTransferRunsResponse]): Unit = js.native
  def scheduleRuns(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaScheduleTransferRunsResponse] = js.native
  def scheduleRuns(params: ParamsResourceProjectsLocationsTransferconfigsScheduleruns): GaxiosPromise[SchemaScheduleTransferRunsResponse] = js.native
  def scheduleRuns(
    params: ParamsResourceProjectsLocationsTransferconfigsScheduleruns,
    callback: BodyResponseCallback[SchemaScheduleTransferRunsResponse]
  ): Unit = js.native
  def scheduleRuns(
    params: ParamsResourceProjectsLocationsTransferconfigsScheduleruns,
    options: BodyResponseCallback[SchemaScheduleTransferRunsResponse],
    callback: BodyResponseCallback[SchemaScheduleTransferRunsResponse]
  ): Unit = js.native
  def scheduleRuns(params: ParamsResourceProjectsLocationsTransferconfigsScheduleruns, options: MethodOptions): GaxiosPromise[SchemaScheduleTransferRunsResponse] = js.native
  def scheduleRuns(
    params: ParamsResourceProjectsLocationsTransferconfigsScheduleruns,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaScheduleTransferRunsResponse]
  ): Unit = js.native
  /**
    * bigquerydatatransfer.projects.locations.transferConfigs.startManualRuns
    * @desc Start manual transfer runs to be executed now with schedule_time
    * equal to current time. The transfer runs can be created for a time range
    * where the run_time is between start_time (inclusive) and end_time
    * (exclusive), or for a specific run_time.
    * @alias
    * bigquerydatatransfer.projects.locations.transferConfigs.startManualRuns
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Transfer configuration name in the form: `projects/{project_id}/transferConfigs/{config_id}`.
    * @param {().StartManualTransferRunsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def startManualRuns(): GaxiosPromise[SchemaStartManualTransferRunsResponse] = js.native
  def startManualRuns(callback: BodyResponseCallback[SchemaStartManualTransferRunsResponse]): Unit = js.native
  def startManualRuns(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaStartManualTransferRunsResponse] = js.native
  def startManualRuns(params: ParamsResourceProjectsLocationsTransferconfigsStartmanualruns): GaxiosPromise[SchemaStartManualTransferRunsResponse] = js.native
  def startManualRuns(
    params: ParamsResourceProjectsLocationsTransferconfigsStartmanualruns,
    callback: BodyResponseCallback[SchemaStartManualTransferRunsResponse]
  ): Unit = js.native
  def startManualRuns(
    params: ParamsResourceProjectsLocationsTransferconfigsStartmanualruns,
    options: BodyResponseCallback[SchemaStartManualTransferRunsResponse],
    callback: BodyResponseCallback[SchemaStartManualTransferRunsResponse]
  ): Unit = js.native
  def startManualRuns(params: ParamsResourceProjectsLocationsTransferconfigsStartmanualruns, options: MethodOptions): GaxiosPromise[SchemaStartManualTransferRunsResponse] = js.native
  def startManualRuns(
    params: ParamsResourceProjectsLocationsTransferconfigsStartmanualruns,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaStartManualTransferRunsResponse]
  ): Unit = js.native
}

