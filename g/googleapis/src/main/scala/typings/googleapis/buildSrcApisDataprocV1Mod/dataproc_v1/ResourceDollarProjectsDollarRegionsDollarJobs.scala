package typings.googleapis.buildSrcApisDataprocV1Mod.dataproc_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dataproc/v1", "dataproc_v1.Resource$Projects$Regions$Jobs")
@js.native
class ResourceDollarProjectsDollarRegionsDollarJobs protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dataproc.projects.regions.jobs.cancel
    * @desc Starts a job cancellation request. To access the job resource after
    * cancellation, call regions/{region}/jobs.list or
    * regions/{region}/jobs.get.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Google Cloud Dataproc API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/dataproc
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
    * var dataproc = google.dataproc('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Required. The ID of the Google Cloud Platform project that the job
    * belongs to. projectId: 'my-project-id',  // TODO: Update placeholder
    * value.
    *
    *     // Required. The Cloud Dataproc region in which to handle the
    * request. region: 'my-region',  // TODO: Update placeholder value.
    *
    *     // Required. The job ID.
    *     jobId: 'my-job-id',  // TODO: Update placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   dataproc.projects.regions.jobs.cancel(request, function(err, response)
    * { if (err) { console.error(err); return;
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
    * @alias dataproc.projects.regions.jobs.cancel
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.jobId Required. The job ID.
    * @param {string} params.projectId Required. The ID of the Google Cloud Platform project that the job belongs to.
    * @param {string} params.region Required. The Cloud Dataproc region in which to handle the request.
    * @param {().CancelJobRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def cancel(): GaxiosPromise[Schema$Job] = js.native
  def cancel(callback: BodyResponseCallback[Schema$Job]): Unit = js.native
  def cancel(params: ParamsDollarResourceDollarProjectsDollarRegionsDollarJobsDollarCancel): GaxiosPromise[Schema$Job] = js.native
  def cancel(
    params: ParamsDollarResourceDollarProjectsDollarRegionsDollarJobsDollarCancel,
    callback: BodyResponseCallback[Schema$Job]
  ): Unit = js.native
  def cancel(
    params: ParamsDollarResourceDollarProjectsDollarRegionsDollarJobsDollarCancel,
    options: BodyResponseCallback[Schema$Job],
    callback: BodyResponseCallback[Schema$Job]
  ): Unit = js.native
  def cancel(
    params: ParamsDollarResourceDollarProjectsDollarRegionsDollarJobsDollarCancel,
    options: MethodOptions
  ): GaxiosPromise[Schema$Job] = js.native
  def cancel(
    params: ParamsDollarResourceDollarProjectsDollarRegionsDollarJobsDollarCancel,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Job]
  ): Unit = js.native
  /**
    * dataproc.projects.regions.jobs.delete
    * @desc Deletes the job from the project. If the job is active, the delete
    * fails, and the response returns FAILED_PRECONDITION.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Google Cloud Dataproc API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/dataproc
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
    * var dataproc = google.dataproc('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Required. The ID of the Google Cloud Platform project that the job
    * belongs to. projectId: 'my-project-id',  // TODO: Update placeholder
    * value.
    *
    *     // Required. The Cloud Dataproc region in which to handle the
    * request. region: 'my-region',  // TODO: Update placeholder value.
    *
    *     // Required. The job ID.
    *     jobId: 'my-job-id',  // TODO: Update placeholder value.
    *
    *     auth: authClient,
    *   };
    *
    *   dataproc.projects.regions.jobs.delete(request, function(err) {
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
    * @alias dataproc.projects.regions.jobs.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.jobId Required. The job ID.
    * @param {string} params.projectId Required. The ID of the Google Cloud Platform project that the job belongs to.
    * @param {string} params.region Required. The Cloud Dataproc region in which to handle the request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Empty] = js.native
  def delete(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarProjectsDollarRegionsDollarJobsDollarDelete): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarRegionsDollarJobsDollarDelete,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarRegionsDollarJobsDollarDelete,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarRegionsDollarJobsDollarDelete,
    options: MethodOptions
  ): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarRegionsDollarJobsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * dataproc.projects.regions.jobs.get
    * @desc Gets the resource representation for a job in a project.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Google Cloud Dataproc API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/dataproc
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
    * var dataproc = google.dataproc('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Required. The ID of the Google Cloud Platform project that the job
    * belongs to. projectId: 'my-project-id',  // TODO: Update placeholder
    * value.
    *
    *     // Required. The Cloud Dataproc region in which to handle the
    * request. region: 'my-region',  // TODO: Update placeholder value.
    *
    *     // Required. The job ID.
    *     jobId: 'my-job-id',  // TODO: Update placeholder value.
    *
    *     auth: authClient,
    *   };
    *
    *   dataproc.projects.regions.jobs.get(request, function(err, response) {
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
    * @alias dataproc.projects.regions.jobs.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.jobId Required. The job ID.
    * @param {string} params.projectId Required. The ID of the Google Cloud Platform project that the job belongs to.
    * @param {string} params.region Required. The Cloud Dataproc region in which to handle the request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Job] = js.native
  def get(callback: BodyResponseCallback[Schema$Job]): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarRegionsDollarJobsDollarGet): GaxiosPromise[Schema$Job] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarRegionsDollarJobsDollarGet,
    callback: BodyResponseCallback[Schema$Job]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarRegionsDollarJobsDollarGet,
    options: BodyResponseCallback[Schema$Job],
    callback: BodyResponseCallback[Schema$Job]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarRegionsDollarJobsDollarGet, options: MethodOptions): GaxiosPromise[Schema$Job] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarRegionsDollarJobsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Job]
  ): Unit = js.native
  /**
    * dataproc.projects.regions.jobs.getIamPolicy
    * @desc Gets the access control policy for a resource. Returns an empty
    * policy if the resource exists and does not have a policy set.
    * @alias dataproc.projects.regions.jobs.getIamPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ REQUIRED: The resource for which the policy is being requested. See the operation documentation for the appropriate value for this field.
    * @param {().GetIamPolicyRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getIamPolicy(): GaxiosPromise[Schema$Policy] = js.native
  def getIamPolicy(callback: BodyResponseCallback[Schema$Policy]): Unit = js.native
  def getIamPolicy(params: ParamsDollarResourceDollarProjectsDollarRegionsDollarJobsDollarGetiampolicy): GaxiosPromise[Schema$Policy] = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarRegionsDollarJobsDollarGetiampolicy,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarRegionsDollarJobsDollarGetiampolicy,
    options: BodyResponseCallback[Schema$Policy],
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarRegionsDollarJobsDollarGetiampolicy,
    options: MethodOptions
  ): GaxiosPromise[Schema$Policy] = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarRegionsDollarJobsDollarGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  /**
    * dataproc.projects.regions.jobs.list
    * @desc Lists regions/{region}/jobs in a project.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Google Cloud Dataproc API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/dataproc
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
    * var dataproc = google.dataproc('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Required. The ID of the Google Cloud Platform project that the job
    * belongs to. projectId: 'my-project-id',  // TODO: Update placeholder
    * value.
    *
    *     // Required. The Cloud Dataproc region in which to handle the
    * request. region: 'my-region',  // TODO: Update placeholder value.
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
    *       dataproc.projects.regions.jobs.list(request, handlePage);
    *     }
    *   };
    *
    *   dataproc.projects.regions.jobs.list(request, handlePage);
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
    * @alias dataproc.projects.regions.jobs.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.clusterName Optional. If set, the returned jobs list includes only jobs that were submitted to the named cluster.
    * @param {string=} params.filter Optional. A filter constraining the jobs to list. Filters are case-sensitive and have the following syntax:field = value AND field = value ...where field is status.state or labels.[KEY], and [KEY] is a label key. value can be * to match all values. status.state can be either ACTIVE or NON_ACTIVE. Only the logical AND operator is supported; space-separated items are treated as having an implicit AND operator.Example filter:status.state = ACTIVE AND labels.env = staging AND labels.starred = *
    * @param {string=} params.jobStateMatcher Optional. Specifies enumerated categories of jobs to list. (default = match ALL jobs).If filter is provided, jobStateMatcher will be ignored.
    * @param {integer=} params.pageSize Optional. The number of results to return in each response.
    * @param {string=} params.pageToken Optional. The page token, returned by a previous call, to request the next page of results.
    * @param {string} params.projectId Required. The ID of the Google Cloud Platform project that the job belongs to.
    * @param {string} params.region Required. The Cloud Dataproc region in which to handle the request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListJobsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListJobsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarRegionsDollarJobsDollarList): GaxiosPromise[Schema$ListJobsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarRegionsDollarJobsDollarList,
    callback: BodyResponseCallback[Schema$ListJobsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarRegionsDollarJobsDollarList,
    options: BodyResponseCallback[Schema$ListJobsResponse],
    callback: BodyResponseCallback[Schema$ListJobsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarRegionsDollarJobsDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$ListJobsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarRegionsDollarJobsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListJobsResponse]
  ): Unit = js.native
  /**
    * dataproc.projects.regions.jobs.patch
    * @desc Updates a job in a project.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Google Cloud Dataproc API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/dataproc
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
    * var dataproc = google.dataproc('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Required. The ID of the Google Cloud Platform project that the job
    * belongs to. projectId: 'my-project-id',  // TODO: Update placeholder
    * value.
    *
    *     // Required. The Cloud Dataproc region in which to handle the
    * request. region: 'my-region',  // TODO: Update placeholder value.
    *
    *     // Required. The job ID.
    *     jobId: 'my-job-id',  // TODO: Update placeholder value.
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
    *   dataproc.projects.regions.jobs.patch(request, function(err, response) {
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
    * @alias dataproc.projects.regions.jobs.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.jobId Required. The job ID.
    * @param {string} params.projectId Required. The ID of the Google Cloud Platform project that the job belongs to.
    * @param {string} params.region Required. The Cloud Dataproc region in which to handle the request.
    * @param {string=} params.updateMask Required. Specifies the path, relative to <code>Job</code>, of the field to update. For example, to update the labels of a Job the <code>update_mask</code> parameter would be specified as <code>labels</code>, and the PATCH request body would specify the new value. <strong>Note:</strong> Currently, <code>labels</code> is the only field that can be updated.
    * @param {().Job} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$Job] = js.native
  def patch(callback: BodyResponseCallback[Schema$Job]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarProjectsDollarRegionsDollarJobsDollarPatch): GaxiosPromise[Schema$Job] = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarRegionsDollarJobsDollarPatch,
    callback: BodyResponseCallback[Schema$Job]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarRegionsDollarJobsDollarPatch,
    options: BodyResponseCallback[Schema$Job],
    callback: BodyResponseCallback[Schema$Job]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarRegionsDollarJobsDollarPatch,
    options: MethodOptions
  ): GaxiosPromise[Schema$Job] = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarRegionsDollarJobsDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Job]
  ): Unit = js.native
  /**
    * dataproc.projects.regions.jobs.setIamPolicy
    * @desc Sets the access control policy on the specified resource. Replaces
    * any existing policy.
    * @alias dataproc.projects.regions.jobs.setIamPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ REQUIRED: The resource for which the policy is being specified. See the operation documentation for the appropriate value for this field.
    * @param {().SetIamPolicyRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setIamPolicy(): GaxiosPromise[Schema$Policy] = js.native
  def setIamPolicy(callback: BodyResponseCallback[Schema$Policy]): Unit = js.native
  def setIamPolicy(params: ParamsDollarResourceDollarProjectsDollarRegionsDollarJobsDollarSetiampolicy): GaxiosPromise[Schema$Policy] = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarRegionsDollarJobsDollarSetiampolicy,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarRegionsDollarJobsDollarSetiampolicy,
    options: BodyResponseCallback[Schema$Policy],
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarRegionsDollarJobsDollarSetiampolicy,
    options: MethodOptions
  ): GaxiosPromise[Schema$Policy] = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarRegionsDollarJobsDollarSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  /**
    * dataproc.projects.regions.jobs.submit
    * @desc Submits a job to a cluster.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Google Cloud Dataproc API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/dataproc
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
    * var dataproc = google.dataproc('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Required. The ID of the Google Cloud Platform project that the job
    * belongs to. projectId: 'my-project-id',  // TODO: Update placeholder
    * value.
    *
    *     // Required. The Cloud Dataproc region in which to handle the
    * request. region: 'my-region',  // TODO: Update placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   dataproc.projects.regions.jobs.submit(request, function(err, response)
    * { if (err) { console.error(err); return;
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
    * @alias dataproc.projects.regions.jobs.submit
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.projectId Required. The ID of the Google Cloud Platform project that the job belongs to.
    * @param {string} params.region Required. The Cloud Dataproc region in which to handle the request.
    * @param {().SubmitJobRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def submit(): GaxiosPromise[Schema$Job] = js.native
  def submit(callback: BodyResponseCallback[Schema$Job]): Unit = js.native
  def submit(params: ParamsDollarResourceDollarProjectsDollarRegionsDollarJobsDollarSubmit): GaxiosPromise[Schema$Job] = js.native
  def submit(
    params: ParamsDollarResourceDollarProjectsDollarRegionsDollarJobsDollarSubmit,
    callback: BodyResponseCallback[Schema$Job]
  ): Unit = js.native
  def submit(
    params: ParamsDollarResourceDollarProjectsDollarRegionsDollarJobsDollarSubmit,
    options: BodyResponseCallback[Schema$Job],
    callback: BodyResponseCallback[Schema$Job]
  ): Unit = js.native
  def submit(
    params: ParamsDollarResourceDollarProjectsDollarRegionsDollarJobsDollarSubmit,
    options: MethodOptions
  ): GaxiosPromise[Schema$Job] = js.native
  def submit(
    params: ParamsDollarResourceDollarProjectsDollarRegionsDollarJobsDollarSubmit,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Job]
  ): Unit = js.native
  /**
    * dataproc.projects.regions.jobs.testIamPermissions
    * @desc Returns permissions that a caller has on the specified resource. If
    * the resource does not exist, this will return an empty set of
    * permissions, not a NOT_FOUND error.Note: This operation is designed to be
    * used for building permission-aware UIs and command-line tools, not for
    * authorization checking. This operation may "fail open" without warning.
    * @alias dataproc.projects.regions.jobs.testIamPermissions
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ REQUIRED: The resource for which the policy detail is being requested. See the operation documentation for the appropriate value for this field.
    * @param {().TestIamPermissionsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def testIamPermissions(): GaxiosPromise[Schema$TestIamPermissionsResponse] = js.native
  def testIamPermissions(callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]): Unit = js.native
  def testIamPermissions(params: ParamsDollarResourceDollarProjectsDollarRegionsDollarJobsDollarTestiampermissions): GaxiosPromise[Schema$TestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarRegionsDollarJobsDollarTestiampermissions,
    callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarRegionsDollarJobsDollarTestiampermissions,
    options: BodyResponseCallback[Schema$TestIamPermissionsResponse],
    callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarRegionsDollarJobsDollarTestiampermissions,
    options: MethodOptions
  ): GaxiosPromise[Schema$TestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarRegionsDollarJobsDollarTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]
  ): Unit = js.native
}

