package typings.googleapis.bigqueryV2Mod.bigqueryV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/bigquery/v2", "bigquery_v2.Resource$Datasets")
@js.native
class ResourceDatasets protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * bigquery.datasets.delete
    * @desc Deletes the dataset specified by the datasetId value. Before you
    * can delete a dataset, you must delete all its tables, either manually or
    * by specifying deleteContents. Immediately after deletion, you can create
    * another dataset with the same name.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the BigQuery API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/bigquery
    * // 2. This sample uses Application Default Credentials for
    * authentication.
    * //    If not already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk and run
    * //    `gcloud beta auth application-default login`.
    * //    For more information, see
    * //
    * https://developers.google.com/identity/protocols/application-default-credentials
    * // 3. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * const {google} = require('googleapis');
    * var bigquery = google.bigquery('v2');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Project ID of the dataset being deleted
    *     projectId: 'my-project-id',  // TODO: Update placeholder value.
    *
    *     // Dataset ID of dataset being deleted
    *     datasetId: 'my-dataset-id',  // TODO: Update placeholder value.
    *
    *     auth: authClient,
    *   };
    *
    *   bigquery.datasets.delete(request, function(err) {
    *     if (err) {
    *       console.error(err);
    *       return;
    *     }
    *   });
    * });
    *
    * function authorize(callback) {
    *   google.auth.getApplicationDefault(function(err, authClient) {
    *     if (err) {
    *       console.error('authentication failed: ', err);
    *       return;
    *     }
    *     if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *     }
    *     callback(authClient);
    *   });
    * }
    * @alias bigquery.datasets.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.datasetId Dataset ID of dataset being deleted
    * @param {boolean=} params.deleteContents If True, delete all the tables in the dataset. If False and the dataset contains tables, the request will fail. Default is False
    * @param {string} params.projectId Project ID of the dataset being deleted
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceDatasetsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceDatasetsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceDatasetsDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceDatasetsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceDatasetsDelete, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
  
  /**
    * bigquery.datasets.get
    * @desc Returns the dataset specified by datasetID.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the BigQuery API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/bigquery
    * // 2. This sample uses Application Default Credentials for
    * authentication.
    * //    If not already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk and run
    * //    `gcloud beta auth application-default login`.
    * //    For more information, see
    * //
    * https://developers.google.com/identity/protocols/application-default-credentials
    * // 3. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * const {google} = require('googleapis');
    * var bigquery = google.bigquery('v2');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Project ID of the requested dataset
    *     projectId: 'my-project-id',  // TODO: Update placeholder value.
    *
    *     // Dataset ID of the requested dataset
    *     datasetId: 'my-dataset-id',  // TODO: Update placeholder value.
    *
    *     auth: authClient,
    *   };
    *
    *   bigquery.datasets.get(request, function(err, response) {
    *     if (err) {
    *       console.error(err);
    *       return;
    *     }
    *
    *     // TODO: Change code below to process the `response` object:
    *     console.log(JSON.stringify(response, null, 2));
    *   });
    * });
    *
    * function authorize(callback) {
    *   google.auth.getApplicationDefault(function(err, authClient) {
    *     if (err) {
    *       console.error('authentication failed: ', err);
    *       return;
    *     }
    *     if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *     }
    *     callback(authClient);
    *   });
    * }
    * @alias bigquery.datasets.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.datasetId Dataset ID of the requested dataset
    * @param {string} params.projectId Project ID of the requested dataset
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaDataset] = js.native
  def get(callback: BodyResponseCallback[SchemaDataset]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaDataset] = js.native
  def get(params: ParamsResourceDatasetsGet): GaxiosPromise[SchemaDataset] = js.native
  def get(params: ParamsResourceDatasetsGet, callback: BodyResponseCallback[SchemaDataset]): Unit = js.native
  def get(
    params: ParamsResourceDatasetsGet,
    options: BodyResponseCallback[SchemaDataset],
    callback: BodyResponseCallback[SchemaDataset]
  ): Unit = js.native
  def get(params: ParamsResourceDatasetsGet, options: MethodOptions): GaxiosPromise[SchemaDataset] = js.native
  def get(
    params: ParamsResourceDatasetsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDataset]
  ): Unit = js.native
  
  /**
    * bigquery.datasets.insert
    * @desc Creates a new empty dataset.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the BigQuery API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/bigquery
    * // 2. This sample uses Application Default Credentials for
    * authentication.
    * //    If not already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk and run
    * //    `gcloud beta auth application-default login`.
    * //    For more information, see
    * //
    * https://developers.google.com/identity/protocols/application-default-credentials
    * // 3. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * const {google} = require('googleapis');
    * var bigquery = google.bigquery('v2');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Project ID of the new dataset
    *     projectId: 'my-project-id',  // TODO: Update placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   bigquery.datasets.insert(request, function(err, response) {
    *     if (err) {
    *       console.error(err);
    *       return;
    *     }
    *
    *     // TODO: Change code below to process the `response` object:
    *     console.log(JSON.stringify(response, null, 2));
    *   });
    * });
    *
    * function authorize(callback) {
    *   google.auth.getApplicationDefault(function(err, authClient) {
    *     if (err) {
    *       console.error('authentication failed: ', err);
    *       return;
    *     }
    *     if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *     }
    *     callback(authClient);
    *   });
    * }
    * @alias bigquery.datasets.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.projectId Project ID of the new dataset
    * @param {().Dataset} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaDataset] = js.native
  def insert(callback: BodyResponseCallback[SchemaDataset]): Unit = js.native
  def insert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaDataset] = js.native
  def insert(params: ParamsResourceDatasetsInsert): GaxiosPromise[SchemaDataset] = js.native
  def insert(params: ParamsResourceDatasetsInsert, callback: BodyResponseCallback[SchemaDataset]): Unit = js.native
  def insert(
    params: ParamsResourceDatasetsInsert,
    options: BodyResponseCallback[SchemaDataset],
    callback: BodyResponseCallback[SchemaDataset]
  ): Unit = js.native
  def insert(params: ParamsResourceDatasetsInsert, options: MethodOptions): GaxiosPromise[SchemaDataset] = js.native
  def insert(
    params: ParamsResourceDatasetsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDataset]
  ): Unit = js.native
  
  /**
    * bigquery.datasets.list
    * @desc Lists all datasets in the specified project to which you have been
    * granted the READER dataset role.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the BigQuery API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/bigquery
    * // 2. This sample uses Application Default Credentials for
    * authentication.
    * //    If not already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk and run
    * //    `gcloud beta auth application-default login`.
    * //    For more information, see
    * //
    * https://developers.google.com/identity/protocols/application-default-credentials
    * // 3. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * const {google} = require('googleapis');
    * var bigquery = google.bigquery('v2');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Project ID of the datasets to be listed
    *     projectId: 'my-project-id',  // TODO: Update placeholder value.
    *
    *     auth: authClient,
    *   };
    *
    *   var handlePage = function(err, response) {
    *     if (err) {
    *       console.error(err);
    *       return;
    *     }
    *
    *     var datasetsPage = response['datasets'];
    *     if (!datasetsPage) {
    *       return;
    *     }
    *     for (var i = 0; i < datasetsPage.length; i++) {
    *       // TODO: Change code below to process each resource in
    * `datasetsPage`: console.log(JSON.stringify(datasetsPage[i], null, 2));
    *     }
    *
    *     if (response.nextPageToken) {
    *       request.pageToken = response.nextPageToken;
    *       bigquery.datasets.list(request, handlePage);
    *     }
    *   };
    *
    *   bigquery.datasets.list(request, handlePage);
    * });
    *
    * function authorize(callback) {
    *   google.auth.getApplicationDefault(function(err, authClient) {
    *     if (err) {
    *       console.error('authentication failed: ', err);
    *       return;
    *     }
    *     if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *     }
    *     callback(authClient);
    *   });
    * }
    * @alias bigquery.datasets.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.all Whether to list all datasets, including hidden ones
    * @param {string=} params.filter An expression for filtering the results of the request by label. The syntax is "labels.<name>[:<value>]". Multiple filters can be ANDed together by connecting with a space. Example: "labels.department:receiving labels.active". See Filtering datasets using labels for details.
    * @param {integer=} params.maxResults The maximum number of results to return
    * @param {string=} params.pageToken Page token, returned by a previous call, to request the next page of results
    * @param {string} params.projectId Project ID of the datasets to be listed
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaDatasetList] = js.native
  def list(callback: BodyResponseCallback[SchemaDatasetList]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaDatasetList] = js.native
  def list(params: ParamsResourceDatasetsList): GaxiosPromise[SchemaDatasetList] = js.native
  def list(params: ParamsResourceDatasetsList, callback: BodyResponseCallback[SchemaDatasetList]): Unit = js.native
  def list(
    params: ParamsResourceDatasetsList,
    options: BodyResponseCallback[SchemaDatasetList],
    callback: BodyResponseCallback[SchemaDatasetList]
  ): Unit = js.native
  def list(params: ParamsResourceDatasetsList, options: MethodOptions): GaxiosPromise[SchemaDatasetList] = js.native
  def list(
    params: ParamsResourceDatasetsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDatasetList]
  ): Unit = js.native
  
  /**
    * bigquery.datasets.patch
    * @desc Updates information in an existing dataset. The update method
    * replaces the entire dataset resource, whereas the patch method only
    * replaces fields that are provided in the submitted dataset resource. This
    * method supports patch semantics.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the BigQuery API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/bigquery
    * // 2. This sample uses Application Default Credentials for
    * authentication.
    * //    If not already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk and run
    * //    `gcloud beta auth application-default login`.
    * //    For more information, see
    * //
    * https://developers.google.com/identity/protocols/application-default-credentials
    * // 3. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * const {google} = require('googleapis');
    * var bigquery = google.bigquery('v2');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Project ID of the dataset being updated
    *     projectId: 'my-project-id',  // TODO: Update placeholder value.
    *
    *     // Dataset ID of the dataset being updated
    *     datasetId: 'my-dataset-id',  // TODO: Update placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body. Only these
    * properties
    *       // will be changed.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   bigquery.datasets.patch(request, function(err, response) {
    *     if (err) {
    *       console.error(err);
    *       return;
    *     }
    *
    *     // TODO: Change code below to process the `response` object:
    *     console.log(JSON.stringify(response, null, 2));
    *   });
    * });
    *
    * function authorize(callback) {
    *   google.auth.getApplicationDefault(function(err, authClient) {
    *     if (err) {
    *       console.error('authentication failed: ', err);
    *       return;
    *     }
    *     if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *     }
    *     callback(authClient);
    *   });
    * }
    * @alias bigquery.datasets.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.datasetId Dataset ID of the dataset being updated
    * @param {string} params.projectId Project ID of the dataset being updated
    * @param {().Dataset} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaDataset] = js.native
  def patch(callback: BodyResponseCallback[SchemaDataset]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaDataset] = js.native
  def patch(params: ParamsResourceDatasetsPatch): GaxiosPromise[SchemaDataset] = js.native
  def patch(params: ParamsResourceDatasetsPatch, callback: BodyResponseCallback[SchemaDataset]): Unit = js.native
  def patch(
    params: ParamsResourceDatasetsPatch,
    options: BodyResponseCallback[SchemaDataset],
    callback: BodyResponseCallback[SchemaDataset]
  ): Unit = js.native
  def patch(params: ParamsResourceDatasetsPatch, options: MethodOptions): GaxiosPromise[SchemaDataset] = js.native
  def patch(
    params: ParamsResourceDatasetsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDataset]
  ): Unit = js.native
  
  /**
    * bigquery.datasets.update
    * @desc Updates information in an existing dataset. The update method
    * replaces the entire dataset resource, whereas the patch method only
    * replaces fields that are provided in the submitted dataset resource.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the BigQuery API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/bigquery
    * // 2. This sample uses Application Default Credentials for
    * authentication.
    * //    If not already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk and run
    * //    `gcloud beta auth application-default login`.
    * //    For more information, see
    * //
    * https://developers.google.com/identity/protocols/application-default-credentials
    * // 3. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * const {google} = require('googleapis');
    * var bigquery = google.bigquery('v2');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Project ID of the dataset being updated
    *     projectId: 'my-project-id',  // TODO: Update placeholder value.
    *
    *     // Dataset ID of the dataset being updated
    *     datasetId: 'my-dataset-id',  // TODO: Update placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body. All existing
    * properties
    *       // will be replaced.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   bigquery.datasets.update(request, function(err, response) {
    *     if (err) {
    *       console.error(err);
    *       return;
    *     }
    *
    *     // TODO: Change code below to process the `response` object:
    *     console.log(JSON.stringify(response, null, 2));
    *   });
    * });
    *
    * function authorize(callback) {
    *   google.auth.getApplicationDefault(function(err, authClient) {
    *     if (err) {
    *       console.error('authentication failed: ', err);
    *       return;
    *     }
    *     if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *     }
    *     callback(authClient);
    *   });
    * }
    * @alias bigquery.datasets.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.datasetId Dataset ID of the dataset being updated
    * @param {string} params.projectId Project ID of the dataset being updated
    * @param {().Dataset} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaDataset] = js.native
  def update(callback: BodyResponseCallback[SchemaDataset]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaDataset] = js.native
  def update(params: ParamsResourceDatasetsUpdate): GaxiosPromise[SchemaDataset] = js.native
  def update(params: ParamsResourceDatasetsUpdate, callback: BodyResponseCallback[SchemaDataset]): Unit = js.native
  def update(
    params: ParamsResourceDatasetsUpdate,
    options: BodyResponseCallback[SchemaDataset],
    callback: BodyResponseCallback[SchemaDataset]
  ): Unit = js.native
  def update(params: ParamsResourceDatasetsUpdate, options: MethodOptions): GaxiosPromise[SchemaDataset] = js.native
  def update(
    params: ParamsResourceDatasetsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDataset]
  ): Unit = js.native
}
