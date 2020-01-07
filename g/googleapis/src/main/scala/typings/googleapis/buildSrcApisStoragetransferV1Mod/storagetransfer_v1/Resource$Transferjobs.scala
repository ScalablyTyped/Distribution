package typings.googleapis.buildSrcApisStoragetransferV1Mod.storagetransfer_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/storagetransfer/v1", "storagetransfer_v1.Resource$Transferjobs")
@js.native
class Resource$Transferjobs protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * storagetransfer.transferJobs.create
    * @desc Creates a transfer job that runs periodically.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Google Storage Transfer API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/storagetransfer
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
    * var google = require('googleapis');
    * var storagetransfer = google.storagetransfer('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   storagetransfer.transferJobs.create(request, function(err, response) {
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
    * @alias storagetransfer.transferJobs.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().TransferJob} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$TransferJob] = js.native
  def create(callback: BodyResponseCallback[Schema$TransferJob]): Unit = js.native
  def create(params: ParamsDollarResourceDollarTransferjobsDollarCreate): GaxiosPromise[Schema$TransferJob] = js.native
  def create(
    params: ParamsDollarResourceDollarTransferjobsDollarCreate,
    callback: BodyResponseCallback[Schema$TransferJob]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarTransferjobsDollarCreate,
    options: BodyResponseCallback[Schema$TransferJob],
    callback: BodyResponseCallback[Schema$TransferJob]
  ): Unit = js.native
  def create(params: ParamsDollarResourceDollarTransferjobsDollarCreate, options: MethodOptions): GaxiosPromise[Schema$TransferJob] = js.native
  def create(
    params: ParamsDollarResourceDollarTransferjobsDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$TransferJob]
  ): Unit = js.native
  /**
    * storagetransfer.transferJobs.get
    * @desc Gets a transfer job.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Google Storage Transfer API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/storagetransfer
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
    * var google = require('googleapis');
    * var storagetransfer = google.storagetransfer('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // The job to get.
    *     // Required.
    *     jobName: 'transferJobs/my-transfer-job',  // TODO: Update placeholder
    * value.
    *
    *     auth: authClient,
    *   };
    *
    *   storagetransfer.transferJobs.get(request, function(err, response) {
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
    * @alias storagetransfer.transferJobs.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.jobName The job to get. Required.
    * @param {string=} params.projectId The ID of the Google Cloud Platform Console project that owns the job. Required.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$TransferJob] = js.native
  def get(callback: BodyResponseCallback[Schema$TransferJob]): Unit = js.native
  def get(params: ParamsDollarResourceDollarTransferjobsDollarGet): GaxiosPromise[Schema$TransferJob] = js.native
  def get(
    params: ParamsDollarResourceDollarTransferjobsDollarGet,
    callback: BodyResponseCallback[Schema$TransferJob]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarTransferjobsDollarGet,
    options: BodyResponseCallback[Schema$TransferJob],
    callback: BodyResponseCallback[Schema$TransferJob]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarTransferjobsDollarGet, options: MethodOptions): GaxiosPromise[Schema$TransferJob] = js.native
  def get(
    params: ParamsDollarResourceDollarTransferjobsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$TransferJob]
  ): Unit = js.native
  /**
    * storagetransfer.transferJobs.list
    * @desc Lists transfer jobs.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Google Storage Transfer API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/storagetransfer
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
    * var google = require('googleapis');
    * var storagetransfer = google.storagetransfer('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     auth: authClient,
    *   };
    *
    *   var handlePage = function(err, response) {
    *     if (err) {
    *       console.error(err);
    *       return;
    *     }
    *
    *     var transferJobsPage = response['transferJobs'];
    *     if (!transferJobsPage) {
    *       return;
    *     }
    *     for (var i = 0; i < transferJobsPage.length; i++) {
    *       // TODO: Change code below to process each resource in
    * `transferJobsPage`: console.log(JSON.stringify(transferJobsPage[i], null,
    * 2));
    *     }
    *
    *     if (response.nextPageToken) {
    *       request.pageToken = response.nextPageToken;
    *       storagetransfer.transferJobs.list(request, handlePage);
    *     }
    *   };
    *
    *   storagetransfer.transferJobs.list(request, handlePage);
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
    * @alias storagetransfer.transferJobs.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter A list of query parameters specified as JSON text in the form of {"project_id":"my_project_id", "job_names":["jobid1","jobid2",...], "job_statuses":["status1","status2",...]}. Since `job_names` and `job_statuses` support multiple values, their values must be specified with array notation. `project_id` is required. `job_names` and `job_statuses` are optional.  The valid values for `job_statuses` are case-insensitive: `ENABLED`, `DISABLED`, and `DELETED`.
    * @param {integer=} params.pageSize The list page size. The max allowed value is 256.
    * @param {string=} params.pageToken The list page token.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListTransferJobsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListTransferJobsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarTransferjobsDollarList): GaxiosPromise[Schema$ListTransferJobsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarTransferjobsDollarList,
    callback: BodyResponseCallback[Schema$ListTransferJobsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarTransferjobsDollarList,
    options: BodyResponseCallback[Schema$ListTransferJobsResponse],
    callback: BodyResponseCallback[Schema$ListTransferJobsResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarTransferjobsDollarList, options: MethodOptions): GaxiosPromise[Schema$ListTransferJobsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarTransferjobsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListTransferJobsResponse]
  ): Unit = js.native
  /**
    * storagetransfer.transferJobs.patch
    * @desc Updates a transfer job. Updating a job's transfer spec does not
    * affect transfer operations that are running already. Updating the
    * scheduling of a job is not allowed.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Google Storage Transfer API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/storagetransfer
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
    * var google = require('googleapis');
    * var storagetransfer = google.storagetransfer('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // The name of job to update.
    *     // Required.
    *     jobName: 'transferJobs/my-transfer-job',  // TODO: Update placeholder
    * value.
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
    *   storagetransfer.transferJobs.patch(request, function(err, response) {
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
    * @alias storagetransfer.transferJobs.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.jobName The name of job to update. Required.
    * @param {().UpdateTransferJobRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$TransferJob] = js.native
  def patch(callback: BodyResponseCallback[Schema$TransferJob]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarTransferjobsDollarPatch): GaxiosPromise[Schema$TransferJob] = js.native
  def patch(
    params: ParamsDollarResourceDollarTransferjobsDollarPatch,
    callback: BodyResponseCallback[Schema$TransferJob]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarTransferjobsDollarPatch,
    options: BodyResponseCallback[Schema$TransferJob],
    callback: BodyResponseCallback[Schema$TransferJob]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarTransferjobsDollarPatch, options: MethodOptions): GaxiosPromise[Schema$TransferJob] = js.native
  def patch(
    params: ParamsDollarResourceDollarTransferjobsDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$TransferJob]
  ): Unit = js.native
}

