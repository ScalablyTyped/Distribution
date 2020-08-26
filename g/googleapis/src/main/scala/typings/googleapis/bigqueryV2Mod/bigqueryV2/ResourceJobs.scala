package typings.googleapis.bigqueryV2Mod.bigqueryV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/bigquery/v2", "bigquery_v2.Resource$Jobs")
@js.native
class ResourceJobs protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * bigquery.jobs.cancel
    * @desc Requests that a job be cancelled. This call will return
    * immediately, and the client will need to poll for the job status to see
    * if the cancel completed successfully. Cancelled jobs may still incur
    * costs.
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
    *     // [Required] Project ID of the job to cancel
    *     projectId: 'my-project-id',  // TODO: Update placeholder value.
    *
    *     // [Required] Job ID of the job to cancel
    *     jobId: 'my-job-id',  // TODO: Update placeholder value.
    *
    *     auth: authClient,
    *   };
    *
    *   bigquery.jobs.cancel(request, function(err, response) {
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
    * @alias bigquery.jobs.cancel
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.jobId [Required] Job ID of the job to cancel
    * @param {string=} params.location The geographic location of the job. Required except for US and EU. See details at https://cloud.google.com/bigquery/docs/locations#specifying_your_location.
    * @param {string} params.projectId [Required] Project ID of the job to cancel
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def cancel(): GaxiosPromise[SchemaJobCancelResponse] = js.native
  def cancel(callback: BodyResponseCallback[SchemaJobCancelResponse]): Unit = js.native
  def cancel(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaJobCancelResponse] = js.native
  def cancel(params: ParamsResourceJobsCancel): GaxiosPromise[SchemaJobCancelResponse] = js.native
  def cancel(params: ParamsResourceJobsCancel, callback: BodyResponseCallback[SchemaJobCancelResponse]): Unit = js.native
  def cancel(
    params: ParamsResourceJobsCancel,
    options: BodyResponseCallback[SchemaJobCancelResponse],
    callback: BodyResponseCallback[SchemaJobCancelResponse]
  ): Unit = js.native
  def cancel(params: ParamsResourceJobsCancel, options: MethodOptions): GaxiosPromise[SchemaJobCancelResponse] = js.native
  def cancel(
    params: ParamsResourceJobsCancel,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaJobCancelResponse]
  ): Unit = js.native
  /**
    * bigquery.jobs.get
    * @desc Returns information about a specific job. Job information is
    * available for a six month period after creation. Requires that you're the
    * person who ran the job, or have the Is Owner project role.
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
    *     // [Required] Project ID of the requested job
    *     projectId: 'my-project-id',  // TODO: Update placeholder value.
    *
    *     // [Required] Job ID of the requested job
    *     jobId: 'my-job-id',  // TODO: Update placeholder value.
    *
    *     auth: authClient,
    *   };
    *
    *   bigquery.jobs.get(request, function(err, response) {
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
    * @alias bigquery.jobs.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.jobId [Required] Job ID of the requested job
    * @param {string=} params.location The geographic location of the job. Required except for US and EU. See details at https://cloud.google.com/bigquery/docs/locations#specifying_your_location.
    * @param {string} params.projectId [Required] Project ID of the requested job
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaJob] = js.native
  def get(callback: BodyResponseCallback[SchemaJob]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaJob] = js.native
  def get(params: ParamsResourceJobsGet): GaxiosPromise[SchemaJob] = js.native
  def get(params: ParamsResourceJobsGet, callback: BodyResponseCallback[SchemaJob]): Unit = js.native
  def get(
    params: ParamsResourceJobsGet,
    options: BodyResponseCallback[SchemaJob],
    callback: BodyResponseCallback[SchemaJob]
  ): Unit = js.native
  def get(params: ParamsResourceJobsGet, options: MethodOptions): GaxiosPromise[SchemaJob] = js.native
  def get(params: ParamsResourceJobsGet, options: MethodOptions, callback: BodyResponseCallback[SchemaJob]): Unit = js.native
  /**
    * bigquery.jobs.getQueryResults
    * @desc Retrieves the results of a query job.
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
    *     // [Required] Project ID of the query job
    *     projectId: 'my-project-id',  // TODO: Update placeholder value.
    *
    *     // [Required] Job ID of the query job
    *     jobId: 'my-job-id',  // TODO: Update placeholder value.
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
    *     var errorsPage = response['errors'];
    *     if (!errorsPage) {
    *       return;
    *     }
    *     for (var i = 0; i < errorsPage.length; i++) {
    *       // TODO: Change code below to process each resource in
    * `errorsPage`: console.log(JSON.stringify(errorsPage[i], null, 2));
    *     }
    *
    *     if (response.pageToken) {
    *       request.pageToken = response.pageToken;
    *       bigquery.jobs.getQueryResults(request, handlePage);
    *     }
    *   };
    *
    *   bigquery.jobs.getQueryResults(request, handlePage);
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
    * @alias bigquery.jobs.getQueryResults
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.jobId [Required] Job ID of the query job
    * @param {string=} params.location The geographic location where the job should run. Required except for US and EU. See details at https://cloud.google.com/bigquery/docs/locations#specifying_your_location.
    * @param {integer=} params.maxResults Maximum number of results to read
    * @param {string=} params.pageToken Page token, returned by a previous call, to request the next page of results
    * @param {string} params.projectId [Required] Project ID of the query job
    * @param {string=} params.startIndex Zero-based index of the starting row
    * @param {integer=} params.timeoutMs How long to wait for the query to complete, in milliseconds, before returning. Default is 10 seconds. If the timeout passes before the job completes, the 'jobComplete' field in the response will be false
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getQueryResults(): GaxiosPromise[SchemaGetQueryResultsResponse] = js.native
  def getQueryResults(callback: BodyResponseCallback[SchemaGetQueryResultsResponse]): Unit = js.native
  def getQueryResults(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGetQueryResultsResponse] = js.native
  def getQueryResults(params: ParamsResourceJobsGetqueryresults): GaxiosPromise[SchemaGetQueryResultsResponse] = js.native
  def getQueryResults(
    params: ParamsResourceJobsGetqueryresults,
    callback: BodyResponseCallback[SchemaGetQueryResultsResponse]
  ): Unit = js.native
  def getQueryResults(
    params: ParamsResourceJobsGetqueryresults,
    options: BodyResponseCallback[SchemaGetQueryResultsResponse],
    callback: BodyResponseCallback[SchemaGetQueryResultsResponse]
  ): Unit = js.native
  def getQueryResults(params: ParamsResourceJobsGetqueryresults, options: MethodOptions): GaxiosPromise[SchemaGetQueryResultsResponse] = js.native
  def getQueryResults(
    params: ParamsResourceJobsGetqueryresults,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGetQueryResultsResponse]
  ): Unit = js.native
  /**
    * bigquery.jobs.insert
    * @desc Starts a new asynchronous job. Requires the Can View project role.
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
    *     // Project ID of the project that will be billed for the job
    *     projectId: 'my-project-id',  // TODO: Update placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     media: {
    *       // TODO: Add desired media content for upload. See
    *       // https://github.com/google/google-api-nodejs-client#media-uploads
    *       mimeType: '',  // See
    * https://www.w3.org/Protocols/rfc1341/4_Content-Type.html body: '',
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   bigquery.jobs.insert(request, function(err, response) {
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
    * @alias bigquery.jobs.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.projectId Project ID of the project that will be billed for the job
    * @param  {object} params.resource Media resource metadata
    * @param {object} params.media Media object
    * @param {string} params.media.mimeType Media mime-type
    * @param {string|object} params.media.body Media body contents
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaJob] = js.native
  def insert(callback: BodyResponseCallback[SchemaJob]): Unit = js.native
  def insert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaJob] = js.native
  def insert(params: ParamsResourceJobsInsert): GaxiosPromise[SchemaJob] = js.native
  def insert(params: ParamsResourceJobsInsert, callback: BodyResponseCallback[SchemaJob]): Unit = js.native
  def insert(
    params: ParamsResourceJobsInsert,
    options: BodyResponseCallback[SchemaJob],
    callback: BodyResponseCallback[SchemaJob]
  ): Unit = js.native
  def insert(params: ParamsResourceJobsInsert, options: MethodOptions): GaxiosPromise[SchemaJob] = js.native
  def insert(
    params: ParamsResourceJobsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaJob]
  ): Unit = js.native
  /**
    * bigquery.jobs.list
    * @desc Lists all jobs that you started in the specified project. Job
    * information is available for a six month period after creation. The job
    * list is sorted in reverse chronological order, by job creation time.
    * Requires the Can View project role, or the Is Owner project role if you
    * set the allUsers property.
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
    *     // Project ID of the jobs to list
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
    *     var jobsPage = response['jobs'];
    *     if (!jobsPage) {
    *       return;
    *     }
    *     for (var i = 0; i < jobsPage.length; i++) {
    *       // TODO: Change code below to process each resource in `jobsPage`:
    *       console.log(JSON.stringify(jobsPage[i], null, 2));
    *     }
    *
    *     if (response.nextPageToken) {
    *       request.pageToken = response.nextPageToken;
    *       bigquery.jobs.list(request, handlePage);
    *     }
    *   };
    *
    *   bigquery.jobs.list(request, handlePage);
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
    * @alias bigquery.jobs.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.allUsers Whether to display jobs owned by all users in the project. Default false
    * @param {string=} params.maxCreationTime Max value for job creation time, in milliseconds since the POSIX epoch. If set, only jobs created before or at this timestamp are returned
    * @param {integer=} params.maxResults Maximum number of results to return
    * @param {string=} params.minCreationTime Min value for job creation time, in milliseconds since the POSIX epoch. If set, only jobs created after or at this timestamp are returned
    * @param {string=} params.pageToken Page token, returned by a previous call, to request the next page of results
    * @param {string} params.projectId Project ID of the jobs to list
    * @param {string=} params.projection Restrict information returned to a set of selected fields
    * @param {string=} params.stateFilter Filter for job state
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaJobList] = js.native
  def list(callback: BodyResponseCallback[SchemaJobList]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaJobList] = js.native
  def list(params: ParamsResourceJobsList): GaxiosPromise[SchemaJobList] = js.native
  def list(params: ParamsResourceJobsList, callback: BodyResponseCallback[SchemaJobList]): Unit = js.native
  def list(
    params: ParamsResourceJobsList,
    options: BodyResponseCallback[SchemaJobList],
    callback: BodyResponseCallback[SchemaJobList]
  ): Unit = js.native
  def list(params: ParamsResourceJobsList, options: MethodOptions): GaxiosPromise[SchemaJobList] = js.native
  def list(
    params: ParamsResourceJobsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaJobList]
  ): Unit = js.native
  /**
    * bigquery.jobs.query
    * @desc Runs a BigQuery SQL query synchronously and returns query results
    * if the query completes within a specified timeout.
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
    *     // Project ID of the project billed for the query
    *     projectId: 'my-project-id',  // TODO: Update placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   bigquery.jobs.query(request, function(err, response) {
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
    * @alias bigquery.jobs.query
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.projectId Project ID of the project billed for the query
    * @param {().QueryRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def query(): GaxiosPromise[SchemaQueryResponse] = js.native
  def query(callback: BodyResponseCallback[SchemaQueryResponse]): Unit = js.native
  def query(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaQueryResponse] = js.native
  def query(params: ParamsResourceJobsQuery): GaxiosPromise[SchemaQueryResponse] = js.native
  def query(params: ParamsResourceJobsQuery, callback: BodyResponseCallback[SchemaQueryResponse]): Unit = js.native
  def query(
    params: ParamsResourceJobsQuery,
    options: BodyResponseCallback[SchemaQueryResponse],
    callback: BodyResponseCallback[SchemaQueryResponse]
  ): Unit = js.native
  def query(params: ParamsResourceJobsQuery, options: MethodOptions): GaxiosPromise[SchemaQueryResponse] = js.native
  def query(
    params: ParamsResourceJobsQuery,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaQueryResponse]
  ): Unit = js.native
}

