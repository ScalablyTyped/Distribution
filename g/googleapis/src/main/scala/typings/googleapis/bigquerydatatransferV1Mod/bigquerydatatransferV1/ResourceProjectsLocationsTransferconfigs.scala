package typings.googleapis.bigquerydatatransferV1Mod.bigquerydatatransferV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/bigquerydatatransfer/v1", "bigquerydatatransfer_v1.Resource$Projects$Locations$Transferconfigs")
@js.native
open class ResourceProjectsLocationsTransferconfigs protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaTransferConfig] = js.native
  def create(callback: BodyResponseCallback[SchemaTransferConfig]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTransferConfig] = js.native
  def create(params: ParamsResourceProjectsLocationsTransferconfigsCreate): GaxiosPromise[SchemaTransferConfig] = js.native
  def create(
    params: ParamsResourceProjectsLocationsTransferconfigsCreate,
    callback: BodyResponseCallback[SchemaTransferConfig]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsTransferconfigsCreate,
    options: BodyResponseCallback[Readable | SchemaTransferConfig],
    callback: BodyResponseCallback[Readable | SchemaTransferConfig]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsTransferconfigsCreate, options: MethodOptions): GaxiosPromise[SchemaTransferConfig] = js.native
  def create(
    params: ParamsResourceProjectsLocationsTransferconfigsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTransferConfig]
  ): Unit = js.native
  /**
    * Creates a new data transfer configuration.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/bigquerydatatransfer.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const bigquerydatatransfer = google.bigquerydatatransfer('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await bigquerydatatransfer.projects.locations.transferConfigs.create({
    *       // Optional OAuth2 authorization code to use with this transfer configuration. This is required only if `transferConfig.dataSourceId` is 'youtube_channel' and new credentials are needed, as indicated by `CheckValidCreds`. In order to obtain authorization_code, make a request to the following URL: https://www.gstatic.com/bigquerydatatransfer/oauthz/auth? client_id=client_id&scope=data_source_scopes &redirect_uri=urn:ietf:wg:oauth:2.0:oob&response_type=authorization_code * The client_id is the OAuth client_id of the a data source as returned by ListDataSources method. * data_source_scopes are the scopes returned by ListDataSources method. Note that this should not be set when `service_account_name` is used to create the transfer config.
    *       authorizationCode: 'placeholder-value',
    *       // Required. The BigQuery project id where the transfer configuration should be created. Must be in the format projects/{project_id\}/locations/{location_id\} or projects/{project_id\}. If specified location and location of the destination bigquery dataset do not match - the request will fail.
    *       parent: 'projects/my-project/locations/my-location',
    *       // Optional service account name. If this field is set, the transfer config will be created with this service account's credentials. It requires that the requesting user calling this API has permissions to act as this service account. Note that not all data sources support service account credentials when creating a transfer config. For the latest list of data sources, read about [using service accounts](https://cloud.google.com/bigquery-transfer/docs/use-service-accounts).
    *       serviceAccountName: 'placeholder-value',
    *       // Optional version info. This is required only if `transferConfig.dataSourceId` is not 'youtube_channel' and new credentials are needed, as indicated by `CheckValidCreds`. In order to obtain version info, make a request to the following URL: https://www.gstatic.com/bigquerydatatransfer/oauthz/auth? client_id=client_id&scope=data_source_scopes &redirect_uri=urn:ietf:wg:oauth:2.0:oob&response_type=version_info * The client_id is the OAuth client_id of the a data source as returned by ListDataSources method. * data_source_scopes are the scopes returned by ListDataSources method. Note that this should not be set when `service_account_name` is used to create the transfer config.
    *       versionInfo: 'placeholder-value',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "dataRefreshWindowDays": 0,
    *         //   "dataSourceId": "my_dataSourceId",
    *         //   "datasetRegion": "my_datasetRegion",
    *         //   "destinationDatasetId": "my_destinationDatasetId",
    *         //   "disabled": false,
    *         //   "displayName": "my_displayName",
    *         //   "emailPreferences": {},
    *         //   "name": "my_name",
    *         //   "nextRunTime": "my_nextRunTime",
    *         //   "notificationPubsubTopic": "my_notificationPubsubTopic",
    *         //   "ownerInfo": {},
    *         //   "params": {},
    *         //   "schedule": "my_schedule",
    *         //   "scheduleOptions": {},
    *         //   "state": "my_state",
    *         //   "updateTime": "my_updateTime",
    *         //   "userId": "my_userId"
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "dataRefreshWindowDays": 0,
    *   //   "dataSourceId": "my_dataSourceId",
    *   //   "datasetRegion": "my_datasetRegion",
    *   //   "destinationDatasetId": "my_destinationDatasetId",
    *   //   "disabled": false,
    *   //   "displayName": "my_displayName",
    *   //   "emailPreferences": {},
    *   //   "name": "my_name",
    *   //   "nextRunTime": "my_nextRunTime",
    *   //   "notificationPubsubTopic": "my_notificationPubsubTopic",
    *   //   "ownerInfo": {},
    *   //   "params": {},
    *   //   "schedule": "my_schedule",
    *   //   "scheduleOptions": {},
    *   //   "state": "my_state",
    *   //   "updateTime": "my_updateTime",
    *   //   "userId": "my_userId"
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def create(params: ParamsResourceProjectsLocationsTransferconfigsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsTransferconfigsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsLocationsTransferconfigsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsTransferconfigsDelete,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsTransferconfigsDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsTransferconfigsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsTransferconfigsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes a data transfer configuration, including any associated transfer runs and logs.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/bigquerydatatransfer.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const bigquerydatatransfer = google.bigquerydatatransfer('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/bigquery',
    *       'https://www.googleapis.com/auth/cloud-platform',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await bigquerydatatransfer.projects.locations.transferConfigs.delete({
    *       // Required. The field will contain name of the resource requested, for example: `projects/{project_id\}/transferConfigs/{config_id\}` or `projects/{project_id\}/locations/{location_id\}/transferConfigs/{config_id\}`
    *       name: 'projects/my-project/locations/my-location/transferConfigs/my-transferConfig',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {}
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def delete(params: ParamsResourceProjectsLocationsTransferconfigsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsTransferconfigsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaTransferConfig] = js.native
  def get(callback: BodyResponseCallback[SchemaTransferConfig]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTransferConfig] = js.native
  def get(params: ParamsResourceProjectsLocationsTransferconfigsGet): GaxiosPromise[SchemaTransferConfig] = js.native
  def get(
    params: ParamsResourceProjectsLocationsTransferconfigsGet,
    callback: BodyResponseCallback[SchemaTransferConfig]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsTransferconfigsGet,
    options: BodyResponseCallback[Readable | SchemaTransferConfig],
    callback: BodyResponseCallback[Readable | SchemaTransferConfig]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsTransferconfigsGet, options: MethodOptions): GaxiosPromise[SchemaTransferConfig] = js.native
  def get(
    params: ParamsResourceProjectsLocationsTransferconfigsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTransferConfig]
  ): Unit = js.native
  /**
    * Returns information about a data transfer config.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/bigquerydatatransfer.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const bigquerydatatransfer = google.bigquerydatatransfer('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/bigquery',
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloud-platform.read-only',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await bigquerydatatransfer.projects.locations.transferConfigs.get(
    *     {
    *       // Required. The field will contain name of the resource requested, for example: `projects/{project_id\}/transferConfigs/{config_id\}` or `projects/{project_id\}/locations/{location_id\}/transferConfigs/{config_id\}`
    *       name: 'projects/my-project/locations/my-location/transferConfigs/my-transferConfig',
    *     }
    *   );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "dataRefreshWindowDays": 0,
    *   //   "dataSourceId": "my_dataSourceId",
    *   //   "datasetRegion": "my_datasetRegion",
    *   //   "destinationDatasetId": "my_destinationDatasetId",
    *   //   "disabled": false,
    *   //   "displayName": "my_displayName",
    *   //   "emailPreferences": {},
    *   //   "name": "my_name",
    *   //   "nextRunTime": "my_nextRunTime",
    *   //   "notificationPubsubTopic": "my_notificationPubsubTopic",
    *   //   "ownerInfo": {},
    *   //   "params": {},
    *   //   "schedule": "my_schedule",
    *   //   "scheduleOptions": {},
    *   //   "state": "my_state",
    *   //   "updateTime": "my_updateTime",
    *   //   "userId": "my_userId"
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def get(params: ParamsResourceProjectsLocationsTransferconfigsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsTransferconfigsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListTransferConfigsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListTransferConfigsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListTransferConfigsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsTransferconfigsList): GaxiosPromise[SchemaListTransferConfigsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsTransferconfigsList,
    callback: BodyResponseCallback[SchemaListTransferConfigsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsTransferconfigsList,
    options: BodyResponseCallback[Readable | SchemaListTransferConfigsResponse],
    callback: BodyResponseCallback[Readable | SchemaListTransferConfigsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsTransferconfigsList, options: MethodOptions): GaxiosPromise[SchemaListTransferConfigsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsTransferconfigsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListTransferConfigsResponse]
  ): Unit = js.native
  /**
    * Returns information about all transfer configs owned by a project in the specified location.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/bigquerydatatransfer.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const bigquerydatatransfer = google.bigquerydatatransfer('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/bigquery',
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloud-platform.read-only',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await bigquerydatatransfer.projects.locations.transferConfigs.list({
    *       // When specified, only configurations of requested data sources are returned.
    *       dataSourceIds: 'placeholder-value',
    *       // Page size. The default page size is the maximum value of 1000 results.
    *       pageSize: 'placeholder-value',
    *       // Pagination token, which can be used to request a specific page of `ListTransfersRequest` list results. For multiple-page results, `ListTransfersResponse` outputs a `next_page` token, which can be used as the `page_token` value to request the next page of list results.
    *       pageToken: 'placeholder-value',
    *       // Required. The BigQuery project id for which transfer configs should be returned: `projects/{project_id\}` or `projects/{project_id\}/locations/{location_id\}`
    *       parent: 'projects/my-project/locations/my-location',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "transferConfigs": []
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def list(params: ParamsResourceProjectsLocationsTransferconfigsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsTransferconfigsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaTransferConfig] = js.native
  def patch(callback: BodyResponseCallback[SchemaTransferConfig]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTransferConfig] = js.native
  def patch(params: ParamsResourceProjectsLocationsTransferconfigsPatch): GaxiosPromise[SchemaTransferConfig] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsTransferconfigsPatch,
    callback: BodyResponseCallback[SchemaTransferConfig]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsTransferconfigsPatch,
    options: BodyResponseCallback[Readable | SchemaTransferConfig],
    callback: BodyResponseCallback[Readable | SchemaTransferConfig]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsLocationsTransferconfigsPatch, options: MethodOptions): GaxiosPromise[SchemaTransferConfig] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsTransferconfigsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTransferConfig]
  ): Unit = js.native
  /**
    * Updates a data transfer configuration. All fields must be set, even if they are not updated.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/bigquerydatatransfer.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const bigquerydatatransfer = google.bigquerydatatransfer('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await bigquerydatatransfer.projects.locations.transferConfigs.patch({
    *       // Optional OAuth2 authorization code to use with this transfer configuration. This is required only if `transferConfig.dataSourceId` is 'youtube_channel' and new credentials are needed, as indicated by `CheckValidCreds`. In order to obtain authorization_code, make a request to the following URL: https://www.gstatic.com/bigquerydatatransfer/oauthz/auth? client_id=client_id&scope=data_source_scopes &redirect_uri=urn:ietf:wg:oauth:2.0:oob&response_type=authorization_code * The client_id is the OAuth client_id of the a data source as returned by ListDataSources method. * data_source_scopes are the scopes returned by ListDataSources method. Note that this should not be set when `service_account_name` is used to update the transfer config.
    *       authorizationCode: 'placeholder-value',
    *       // The resource name of the transfer config. Transfer config names have the form `projects/{project_id\}/locations/{region\}/transferConfigs/{config_id\}`. Where `config_id` is usually a uuid, even though it is not guaranteed or required. The name is ignored when creating a transfer config.
    *       name: 'projects/my-project/locations/my-location/transferConfigs/my-transferConfig',
    *       // Optional service account name. If this field is set, the transfer config will be created with this service account's credentials. It requires that the requesting user calling this API has permissions to act as this service account. Note that not all data sources support service account credentials when creating a transfer config. For the latest list of data sources, read about [using service accounts](https://cloud.google.com/bigquery-transfer/docs/use-service-accounts).
    *       serviceAccountName: 'placeholder-value',
    *       // Required. Required list of fields to be updated in this request.
    *       updateMask: 'placeholder-value',
    *       // Optional version info. This is required only if `transferConfig.dataSourceId` is not 'youtube_channel' and new credentials are needed, as indicated by `CheckValidCreds`. In order to obtain version info, make a request to the following URL: https://www.gstatic.com/bigquerydatatransfer/oauthz/auth? client_id=client_id&scope=data_source_scopes &redirect_uri=urn:ietf:wg:oauth:2.0:oob&response_type=version_info * The client_id is the OAuth client_id of the a data source as returned by ListDataSources method. * data_source_scopes are the scopes returned by ListDataSources method. Note that this should not be set when `service_account_name` is used to update the transfer config.
    *       versionInfo: 'placeholder-value',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "dataRefreshWindowDays": 0,
    *         //   "dataSourceId": "my_dataSourceId",
    *         //   "datasetRegion": "my_datasetRegion",
    *         //   "destinationDatasetId": "my_destinationDatasetId",
    *         //   "disabled": false,
    *         //   "displayName": "my_displayName",
    *         //   "emailPreferences": {},
    *         //   "name": "my_name",
    *         //   "nextRunTime": "my_nextRunTime",
    *         //   "notificationPubsubTopic": "my_notificationPubsubTopic",
    *         //   "ownerInfo": {},
    *         //   "params": {},
    *         //   "schedule": "my_schedule",
    *         //   "scheduleOptions": {},
    *         //   "state": "my_state",
    *         //   "updateTime": "my_updateTime",
    *         //   "userId": "my_userId"
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "dataRefreshWindowDays": 0,
    *   //   "dataSourceId": "my_dataSourceId",
    *   //   "datasetRegion": "my_datasetRegion",
    *   //   "destinationDatasetId": "my_destinationDatasetId",
    *   //   "disabled": false,
    *   //   "displayName": "my_displayName",
    *   //   "emailPreferences": {},
    *   //   "name": "my_name",
    *   //   "nextRunTime": "my_nextRunTime",
    *   //   "notificationPubsubTopic": "my_notificationPubsubTopic",
    *   //   "ownerInfo": {},
    *   //   "params": {},
    *   //   "schedule": "my_schedule",
    *   //   "scheduleOptions": {},
    *   //   "state": "my_state",
    *   //   "updateTime": "my_updateTime",
    *   //   "userId": "my_userId"
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def patch(params: ParamsResourceProjectsLocationsTransferconfigsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsTransferconfigsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var runs: ResourceProjectsLocationsTransferconfigsRuns = js.native
  
  def scheduleRuns(): GaxiosPromise[SchemaScheduleTransferRunsResponse] = js.native
  def scheduleRuns(callback: BodyResponseCallback[SchemaScheduleTransferRunsResponse]): Unit = js.native
  def scheduleRuns(params: Unit, options: MethodOptions): GaxiosPromise[SchemaScheduleTransferRunsResponse] = js.native
  def scheduleRuns(params: ParamsResourceProjectsLocationsTransferconfigsScheduleruns): GaxiosPromise[SchemaScheduleTransferRunsResponse] = js.native
  def scheduleRuns(
    params: ParamsResourceProjectsLocationsTransferconfigsScheduleruns,
    callback: BodyResponseCallback[SchemaScheduleTransferRunsResponse]
  ): Unit = js.native
  def scheduleRuns(
    params: ParamsResourceProjectsLocationsTransferconfigsScheduleruns,
    options: BodyResponseCallback[Readable | SchemaScheduleTransferRunsResponse],
    callback: BodyResponseCallback[Readable | SchemaScheduleTransferRunsResponse]
  ): Unit = js.native
  def scheduleRuns(params: ParamsResourceProjectsLocationsTransferconfigsScheduleruns, options: MethodOptions): GaxiosPromise[SchemaScheduleTransferRunsResponse] = js.native
  def scheduleRuns(
    params: ParamsResourceProjectsLocationsTransferconfigsScheduleruns,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaScheduleTransferRunsResponse]
  ): Unit = js.native
  /**
    * Creates transfer runs for a time range [start_time, end_time]. For each date - or whatever granularity the data source supports - in the range, one transfer run is created. Note that runs are created per UTC time in the time range. DEPRECATED: use StartManualTransferRuns instead.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/bigquerydatatransfer.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const bigquerydatatransfer = google.bigquerydatatransfer('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/bigquery',
    *       'https://www.googleapis.com/auth/cloud-platform',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await bigquerydatatransfer.projects.locations.transferConfigs.scheduleRuns({
    *       // Required. Transfer configuration name in the form: `projects/{project_id\}/transferConfigs/{config_id\}` or `projects/{project_id\}/locations/{location_id\}/transferConfigs/{config_id\}`.
    *       parent:
    *         'projects/my-project/locations/my-location/transferConfigs/my-transferConfig',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "endTime": "my_endTime",
    *         //   "startTime": "my_startTime"
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "runs": []
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def scheduleRuns(params: ParamsResourceProjectsLocationsTransferconfigsScheduleruns, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def scheduleRuns(
    params: ParamsResourceProjectsLocationsTransferconfigsScheduleruns,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def startManualRuns(): GaxiosPromise[SchemaStartManualTransferRunsResponse] = js.native
  def startManualRuns(callback: BodyResponseCallback[SchemaStartManualTransferRunsResponse]): Unit = js.native
  def startManualRuns(params: Unit, options: MethodOptions): GaxiosPromise[SchemaStartManualTransferRunsResponse] = js.native
  def startManualRuns(params: ParamsResourceProjectsLocationsTransferconfigsStartmanualruns): GaxiosPromise[SchemaStartManualTransferRunsResponse] = js.native
  def startManualRuns(
    params: ParamsResourceProjectsLocationsTransferconfigsStartmanualruns,
    callback: BodyResponseCallback[SchemaStartManualTransferRunsResponse]
  ): Unit = js.native
  def startManualRuns(
    params: ParamsResourceProjectsLocationsTransferconfigsStartmanualruns,
    options: BodyResponseCallback[Readable | SchemaStartManualTransferRunsResponse],
    callback: BodyResponseCallback[Readable | SchemaStartManualTransferRunsResponse]
  ): Unit = js.native
  def startManualRuns(params: ParamsResourceProjectsLocationsTransferconfigsStartmanualruns, options: MethodOptions): GaxiosPromise[SchemaStartManualTransferRunsResponse] = js.native
  def startManualRuns(
    params: ParamsResourceProjectsLocationsTransferconfigsStartmanualruns,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaStartManualTransferRunsResponse]
  ): Unit = js.native
  /**
    * Start manual transfer runs to be executed now with schedule_time equal to current time. The transfer runs can be created for a time range where the run_time is between start_time (inclusive) and end_time (exclusive), or for a specific run_time.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/bigquerydatatransfer.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const bigquerydatatransfer = google.bigquerydatatransfer('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/bigquery',
    *       'https://www.googleapis.com/auth/cloud-platform',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await bigquerydatatransfer.projects.locations.transferConfigs.startManualRuns(
    *       {
    *         // Transfer configuration name in the form: `projects/{project_id\}/transferConfigs/{config_id\}` or `projects/{project_id\}/locations/{location_id\}/transferConfigs/{config_id\}`.
    *         parent:
    *           'projects/my-project/locations/my-location/transferConfigs/my-transferConfig',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {
    *           //   "requestedRunTime": "my_requestedRunTime",
    *           //   "requestedTimeRange": {}
    *           // }
    *         },
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "runs": []
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def startManualRuns(
    params: ParamsResourceProjectsLocationsTransferconfigsStartmanualruns,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def startManualRuns(
    params: ParamsResourceProjectsLocationsTransferconfigsStartmanualruns,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
