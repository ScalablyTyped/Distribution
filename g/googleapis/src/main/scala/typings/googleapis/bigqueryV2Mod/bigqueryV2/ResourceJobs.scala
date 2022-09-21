package typings.googleapis.bigqueryV2Mod.bigqueryV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/bigquery/v2", "bigquery_v2.Resource$Jobs")
@js.native
open class ResourceJobs protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def cancel(): GaxiosPromise[SchemaJobCancelResponse] = js.native
  def cancel(callback: BodyResponseCallback[SchemaJobCancelResponse]): Unit = js.native
  def cancel(params: Unit, options: MethodOptions): GaxiosPromise[SchemaJobCancelResponse] = js.native
  def cancel(params: ParamsResourceJobsCancel): GaxiosPromise[SchemaJobCancelResponse] = js.native
  def cancel(params: ParamsResourceJobsCancel, callback: BodyResponseCallback[SchemaJobCancelResponse]): Unit = js.native
  def cancel(
    params: ParamsResourceJobsCancel,
    options: BodyResponseCallback[Readable | SchemaJobCancelResponse],
    callback: BodyResponseCallback[Readable | SchemaJobCancelResponse]
  ): Unit = js.native
  def cancel(params: ParamsResourceJobsCancel, options: MethodOptions): GaxiosPromise[SchemaJobCancelResponse] = js.native
  def cancel(
    params: ParamsResourceJobsCancel,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaJobCancelResponse]
  ): Unit = js.native
  /**
    * Requests that a job be cancelled. This call will return immediately, and the client will need to poll for the job status to see if the cancel completed successfully. Cancelled jobs may still incur costs.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/bigquery.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const bigquery = google.bigquery('v2');
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
    *   const res = await bigquery.jobs.cancel({
    *     // [Required] Job ID of the job to cancel
    *     jobId: 'placeholder-value',
    *     // The geographic location of the job. Required except for US and EU. See details at https://cloud.google.com/bigquery/docs/locations#specifying_your_location.
    *     location: 'placeholder-value',
    *     // [Required] Project ID of the job to cancel
    *     projectId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "job": {},
    *   //   "kind": "my_kind"
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
  def cancel(params: ParamsResourceJobsCancel, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def cancel(
    params: ParamsResourceJobsCancel,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceJobsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceJobsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceJobsDelete,
    options: BodyResponseCallback[Readable | Unit],
    callback: BodyResponseCallback[Readable | Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceJobsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceJobsDelete, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
  /**
    * Requests the deletion of the metadata of a job. This call returns when the job's metadata is deleted.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/bigquery.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const bigquery = google.bigquery('v2');
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
    *   const res = await bigquery.jobs.delete({
    *     // Required. Job ID of the job for which metadata is to be deleted. If this is a parent job which has child jobs, the metadata from all child jobs will be deleted as well. Direct deletion of the metadata of child jobs is not allowed.
    *     jobId: '[^/]+',
    *     // The geographic location of the job. Required. See details at: https://cloud.google.com/bigquery/docs/locations#specifying_your_location.
    *     location: 'placeholder-value',
    *     // Required. Project ID of the job for which metadata is to be deleted.
    *     projectId: '[^/]+',
    *   });
    *   console.log(res.data);
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
  def delete(params: ParamsResourceJobsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceJobsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaJob] = js.native
  def get(callback: BodyResponseCallback[SchemaJob]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaJob] = js.native
  def get(params: ParamsResourceJobsGet): GaxiosPromise[SchemaJob] = js.native
  def get(params: ParamsResourceJobsGet, callback: BodyResponseCallback[SchemaJob]): Unit = js.native
  def get(
    params: ParamsResourceJobsGet,
    options: BodyResponseCallback[Readable | SchemaJob],
    callback: BodyResponseCallback[Readable | SchemaJob]
  ): Unit = js.native
  def get(params: ParamsResourceJobsGet, options: MethodOptions): GaxiosPromise[SchemaJob] = js.native
  def get(params: ParamsResourceJobsGet, options: MethodOptions, callback: BodyResponseCallback[SchemaJob]): Unit = js.native
  /**
    * Returns information about a specific job. Job information is available for a six month period after creation. Requires that you're the person who ran the job, or have the Is Owner project role.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/bigquery.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const bigquery = google.bigquery('v2');
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
    *   const res = await bigquery.jobs.get({
    *     // [Required] Job ID of the requested job
    *     jobId: 'placeholder-value',
    *     // The geographic location of the job. Required except for US and EU. See details at https://cloud.google.com/bigquery/docs/locations#specifying_your_location.
    *     location: 'placeholder-value',
    *     // [Required] Project ID of the requested job
    *     projectId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "configuration": {},
    *   //   "etag": "my_etag",
    *   //   "id": "my_id",
    *   //   "jobReference": {},
    *   //   "kind": "my_kind",
    *   //   "selfLink": "my_selfLink",
    *   //   "statistics": {},
    *   //   "status": {},
    *   //   "user_email": "my_user_email"
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
  def get(params: ParamsResourceJobsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceJobsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getQueryResults(): GaxiosPromise[SchemaGetQueryResultsResponse] = js.native
  def getQueryResults(callback: BodyResponseCallback[SchemaGetQueryResultsResponse]): Unit = js.native
  def getQueryResults(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGetQueryResultsResponse] = js.native
  def getQueryResults(params: ParamsResourceJobsGetqueryresults): GaxiosPromise[SchemaGetQueryResultsResponse] = js.native
  def getQueryResults(
    params: ParamsResourceJobsGetqueryresults,
    callback: BodyResponseCallback[SchemaGetQueryResultsResponse]
  ): Unit = js.native
  def getQueryResults(
    params: ParamsResourceJobsGetqueryresults,
    options: BodyResponseCallback[Readable | SchemaGetQueryResultsResponse],
    callback: BodyResponseCallback[Readable | SchemaGetQueryResultsResponse]
  ): Unit = js.native
  def getQueryResults(params: ParamsResourceJobsGetqueryresults, options: MethodOptions): GaxiosPromise[SchemaGetQueryResultsResponse] = js.native
  def getQueryResults(
    params: ParamsResourceJobsGetqueryresults,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGetQueryResultsResponse]
  ): Unit = js.native
  /**
    * Retrieves the results of a query job.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/bigquery.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const bigquery = google.bigquery('v2');
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
    *   const res = await bigquery.jobs.getQueryResults({
    *     // [Required] Job ID of the query job
    *     jobId: 'placeholder-value',
    *     // The geographic location where the job should run. Required except for US and EU. See details at https://cloud.google.com/bigquery/docs/locations#specifying_your_location.
    *     location: 'placeholder-value',
    *     // Maximum number of results to read
    *     maxResults: 'placeholder-value',
    *     // Page token, returned by a previous call, to request the next page of results
    *     pageToken: 'placeholder-value',
    *     // [Required] Project ID of the query job
    *     projectId: 'placeholder-value',
    *     // Zero-based index of the starting row
    *     startIndex: 'placeholder-value',
    *     // How long to wait for the query to complete, in milliseconds, before returning. Default is 10 seconds. If the timeout passes before the job completes, the 'jobComplete' field in the response will be false
    *     timeoutMs: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "cacheHit": false,
    *   //   "errors": [],
    *   //   "etag": "my_etag",
    *   //   "jobComplete": false,
    *   //   "jobReference": {},
    *   //   "kind": "my_kind",
    *   //   "numDmlAffectedRows": "my_numDmlAffectedRows",
    *   //   "pageToken": "my_pageToken",
    *   //   "rows": [],
    *   //   "schema": {},
    *   //   "totalBytesProcessed": "my_totalBytesProcessed",
    *   //   "totalRows": "my_totalRows"
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
  def getQueryResults(params: ParamsResourceJobsGetqueryresults, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getQueryResults(
    params: ParamsResourceJobsGetqueryresults,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def insert(): GaxiosPromise[SchemaJob] = js.native
  def insert(callback: BodyResponseCallback[SchemaJob]): Unit = js.native
  def insert(params: Unit, options: MethodOptions): GaxiosPromise[SchemaJob] = js.native
  def insert(params: ParamsResourceJobsInsert): GaxiosPromise[SchemaJob] = js.native
  def insert(params: ParamsResourceJobsInsert, callback: BodyResponseCallback[SchemaJob]): Unit = js.native
  def insert(
    params: ParamsResourceJobsInsert,
    options: BodyResponseCallback[Readable | SchemaJob],
    callback: BodyResponseCallback[Readable | SchemaJob]
  ): Unit = js.native
  def insert(params: ParamsResourceJobsInsert, options: MethodOptions): GaxiosPromise[SchemaJob] = js.native
  def insert(
    params: ParamsResourceJobsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaJob]
  ): Unit = js.native
  /**
    * Starts a new asynchronous job. Requires the Can View project role.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/bigquery.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const bigquery = google.bigquery('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/bigquery',
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/devstorage.full_control',
    *       'https://www.googleapis.com/auth/devstorage.read_only',
    *       'https://www.googleapis.com/auth/devstorage.read_write',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await bigquery.jobs.insert({
    *     // Project ID of the project that will be billed for the job
    *     projectId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "configuration": {},
    *       //   "etag": "my_etag",
    *       //   "id": "my_id",
    *       //   "jobReference": {},
    *       //   "kind": "my_kind",
    *       //   "selfLink": "my_selfLink",
    *       //   "statistics": {},
    *       //   "status": {},
    *       //   "user_email": "my_user_email"
    *       // }
    *     },
    *     media: {
    *       mimeType: 'placeholder-value',
    *       body: 'placeholder-value',
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "configuration": {},
    *   //   "etag": "my_etag",
    *   //   "id": "my_id",
    *   //   "jobReference": {},
    *   //   "kind": "my_kind",
    *   //   "selfLink": "my_selfLink",
    *   //   "statistics": {},
    *   //   "status": {},
    *   //   "user_email": "my_user_email"
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
  def insert(params: ParamsResourceJobsInsert, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def insert(
    params: ParamsResourceJobsInsert,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaJobList] = js.native
  def list(callback: BodyResponseCallback[SchemaJobList]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaJobList] = js.native
  def list(params: ParamsResourceJobsList): GaxiosPromise[SchemaJobList] = js.native
  def list(params: ParamsResourceJobsList, callback: BodyResponseCallback[SchemaJobList]): Unit = js.native
  def list(
    params: ParamsResourceJobsList,
    options: BodyResponseCallback[Readable | SchemaJobList],
    callback: BodyResponseCallback[Readable | SchemaJobList]
  ): Unit = js.native
  def list(params: ParamsResourceJobsList, options: MethodOptions): GaxiosPromise[SchemaJobList] = js.native
  def list(
    params: ParamsResourceJobsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaJobList]
  ): Unit = js.native
  /**
    * Lists all jobs that you started in the specified project. Job information is available for a six month period after creation. The job list is sorted in reverse chronological order, by job creation time. Requires the Can View project role, or the Is Owner project role if you set the allUsers property.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/bigquery.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const bigquery = google.bigquery('v2');
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
    *   const res = await bigquery.jobs.list({
    *     // Whether to display jobs owned by all users in the project. Default false
    *     allUsers: 'placeholder-value',
    *     // Max value for job creation time, in milliseconds since the POSIX epoch. If set, only jobs created before or at this timestamp are returned
    *     maxCreationTime: 'placeholder-value',
    *     // Maximum number of results to return
    *     maxResults: 'placeholder-value',
    *     // Min value for job creation time, in milliseconds since the POSIX epoch. If set, only jobs created after or at this timestamp are returned
    *     minCreationTime: 'placeholder-value',
    *     // Page token, returned by a previous call, to request the next page of results
    *     pageToken: 'placeholder-value',
    *     // If set, retrieves only jobs whose parent is this job. Otherwise, retrieves only jobs which have no parent
    *     parentJobId: 'placeholder-value',
    *     // Project ID of the jobs to list
    *     projectId: 'placeholder-value',
    *     // Restrict information returned to a set of selected fields
    *     projection: 'placeholder-value',
    *     // Filter for job state
    *     stateFilter: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "etag": "my_etag",
    *   //   "jobs": [],
    *   //   "kind": "my_kind",
    *   //   "nextPageToken": "my_nextPageToken"
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
  def list(params: ParamsResourceJobsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceJobsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def query(): GaxiosPromise[SchemaQueryResponse] = js.native
  def query(callback: BodyResponseCallback[SchemaQueryResponse]): Unit = js.native
  def query(params: Unit, options: MethodOptions): GaxiosPromise[SchemaQueryResponse] = js.native
  def query(params: ParamsResourceJobsQuery): GaxiosPromise[SchemaQueryResponse] = js.native
  def query(params: ParamsResourceJobsQuery, callback: BodyResponseCallback[SchemaQueryResponse]): Unit = js.native
  def query(
    params: ParamsResourceJobsQuery,
    options: BodyResponseCallback[Readable | SchemaQueryResponse],
    callback: BodyResponseCallback[Readable | SchemaQueryResponse]
  ): Unit = js.native
  def query(params: ParamsResourceJobsQuery, options: MethodOptions): GaxiosPromise[SchemaQueryResponse] = js.native
  def query(
    params: ParamsResourceJobsQuery,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaQueryResponse]
  ): Unit = js.native
  /**
    * Runs a BigQuery SQL query synchronously and returns query results if the query completes within a specified timeout.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/bigquery.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const bigquery = google.bigquery('v2');
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
    *   const res = await bigquery.jobs.query({
    *     // Project ID of the project billed for the query
    *     projectId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "connectionProperties": [],
    *       //   "createSession": false,
    *       //   "defaultDataset": {},
    *       //   "dryRun": false,
    *       //   "kind": "my_kind",
    *       //   "labels": {},
    *       //   "location": "my_location",
    *       //   "maxResults": 0,
    *       //   "maximumBytesBilled": "my_maximumBytesBilled",
    *       //   "parameterMode": "my_parameterMode",
    *       //   "preserveNulls": false,
    *       //   "query": "my_query",
    *       //   "queryParameters": [],
    *       //   "requestId": "my_requestId",
    *       //   "timeoutMs": 0,
    *       //   "useLegacySql": false,
    *       //   "useQueryCache": false
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "cacheHit": false,
    *   //   "dmlStats": {},
    *   //   "errors": [],
    *   //   "jobComplete": false,
    *   //   "jobReference": {},
    *   //   "kind": "my_kind",
    *   //   "numDmlAffectedRows": "my_numDmlAffectedRows",
    *   //   "pageToken": "my_pageToken",
    *   //   "rows": [],
    *   //   "schema": {},
    *   //   "sessionInfo": {},
    *   //   "totalBytesProcessed": "my_totalBytesProcessed",
    *   //   "totalRows": "my_totalRows"
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
  def query(params: ParamsResourceJobsQuery, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def query(
    params: ParamsResourceJobsQuery,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
