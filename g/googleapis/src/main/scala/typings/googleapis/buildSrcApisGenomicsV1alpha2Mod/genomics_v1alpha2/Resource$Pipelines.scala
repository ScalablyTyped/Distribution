package typings.googleapis.buildSrcApisGenomicsV1alpha2Mod.genomics_v1alpha2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/genomics/v1alpha2", "genomics_v1alpha2.Resource$Pipelines")
@js.native
class Resource$Pipelines protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * genomics.pipelines.create
    * @desc Creates a pipeline that can be run later. Create takes a Pipeline
    * that has all fields other than `pipelineId` populated, and then returns
    * the same pipeline with `pipelineId` populated. This id can be used to run
    * the pipeline.  Caller must have WRITE permission to the project.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Genomics API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/genomics
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
    * var genomics = google.genomics('v1alpha2');
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
    *   genomics.pipelines.create(request, function(err, response) {
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
    * @alias genomics.pipelines.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().Pipeline} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$Pipeline] = js.native
  def create(callback: BodyResponseCallback[Schema$Pipeline]): Unit = js.native
  def create(params: ParamsDollarResourceDollarPipelinesDollarCreate): GaxiosPromise[Schema$Pipeline] = js.native
  def create(
    params: ParamsDollarResourceDollarPipelinesDollarCreate,
    callback: BodyResponseCallback[Schema$Pipeline]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarPipelinesDollarCreate,
    options: BodyResponseCallback[Schema$Pipeline],
    callback: BodyResponseCallback[Schema$Pipeline]
  ): Unit = js.native
  def create(params: ParamsDollarResourceDollarPipelinesDollarCreate, options: MethodOptions): GaxiosPromise[Schema$Pipeline] = js.native
  def create(
    params: ParamsDollarResourceDollarPipelinesDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Pipeline]
  ): Unit = js.native
  /**
    * genomics.pipelines.delete
    * @desc Deletes a pipeline based on ID.  Caller must have WRITE permission
    * to the project.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Genomics API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/genomics
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
    * var genomics = google.genomics('v1alpha2');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Caller must have WRITE access to the project in which this
    * pipeline
    *     // is defined.
    *     pipelineId: 'my-pipeline-id',  // TODO: Update placeholder value.
    *
    *     auth: authClient,
    *   };
    *
    *   genomics.pipelines.delete(request, function(err) {
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
    * @alias genomics.pipelines.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.pipelineId Caller must have WRITE access to the project in which this pipeline is defined.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Empty] = js.native
  def delete(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarPipelinesDollarDelete): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarPipelinesDollarDelete,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarPipelinesDollarDelete,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarPipelinesDollarDelete, options: MethodOptions): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarPipelinesDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * genomics.pipelines.get
    * @desc Retrieves a pipeline based on ID.  Caller must have READ permission
    * to the project.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Genomics API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/genomics
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
    * var genomics = google.genomics('v1alpha2');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Caller must have READ access to the project in which this pipeline
    *     // is defined.
    *     pipelineId: 'my-pipeline-id',  // TODO: Update placeholder value.
    *
    *     auth: authClient,
    *   };
    *
    *   genomics.pipelines.get(request, function(err, response) {
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
    * @alias genomics.pipelines.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.pipelineId Caller must have READ access to the project in which this pipeline is defined.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Pipeline] = js.native
  def get(callback: BodyResponseCallback[Schema$Pipeline]): Unit = js.native
  def get(params: ParamsDollarResourceDollarPipelinesDollarGet): GaxiosPromise[Schema$Pipeline] = js.native
  def get(
    params: ParamsDollarResourceDollarPipelinesDollarGet,
    callback: BodyResponseCallback[Schema$Pipeline]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarPipelinesDollarGet,
    options: BodyResponseCallback[Schema$Pipeline],
    callback: BodyResponseCallback[Schema$Pipeline]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarPipelinesDollarGet, options: MethodOptions): GaxiosPromise[Schema$Pipeline] = js.native
  def get(
    params: ParamsDollarResourceDollarPipelinesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Pipeline]
  ): Unit = js.native
  /**
    * genomics.pipelines.getControllerConfig
    * @desc Gets controller configuration information. Should only be called by
    * VMs created by the Pipelines Service and not by end users.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Genomics API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/genomics
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
    * var genomics = google.genomics('v1alpha2');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     auth: authClient,
    *   };
    *
    *   genomics.pipelines.getControllerConfig(request, function(err, response)
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
    * @alias genomics.pipelines.getControllerConfig
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.operationId The operation to retrieve controller configuration for.
    * @param {string=} params.validationToken
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getControllerConfig(): GaxiosPromise[Schema$ControllerConfig] = js.native
  def getControllerConfig(callback: BodyResponseCallback[Schema$ControllerConfig]): Unit = js.native
  def getControllerConfig(params: ParamsDollarResourceDollarPipelinesDollarGetcontrollerconfig): GaxiosPromise[Schema$ControllerConfig] = js.native
  def getControllerConfig(
    params: ParamsDollarResourceDollarPipelinesDollarGetcontrollerconfig,
    callback: BodyResponseCallback[Schema$ControllerConfig]
  ): Unit = js.native
  def getControllerConfig(
    params: ParamsDollarResourceDollarPipelinesDollarGetcontrollerconfig,
    options: BodyResponseCallback[Schema$ControllerConfig],
    callback: BodyResponseCallback[Schema$ControllerConfig]
  ): Unit = js.native
  def getControllerConfig(params: ParamsDollarResourceDollarPipelinesDollarGetcontrollerconfig, options: MethodOptions): GaxiosPromise[Schema$ControllerConfig] = js.native
  def getControllerConfig(
    params: ParamsDollarResourceDollarPipelinesDollarGetcontrollerconfig,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ControllerConfig]
  ): Unit = js.native
  /**
    * genomics.pipelines.list
    * @desc Lists pipelines.  Caller must have READ permission to the project.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Genomics API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/genomics
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
    * var genomics = google.genomics('v1alpha2');
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
    *     var pipelinesPage = response['pipelines'];
    *     if (!pipelinesPage) {
    *       return;
    *     }
    *     for (var i = 0; i < pipelinesPage.length; i++) {
    *       // TODO: Change code below to process each resource in
    * `pipelinesPage`: console.log(JSON.stringify(pipelinesPage[i], null, 2));
    *     }
    *
    *     if (response.nextPageToken) {
    *       request.pageToken = response.nextPageToken;
    *       genomics.pipelines.list(request, handlePage);
    *     }
    *   };
    *
    *   genomics.pipelines.list(request, handlePage);
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
    * @alias genomics.pipelines.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.namePrefix Pipelines with names that match this prefix should be returned.  If unspecified, all pipelines in the project, up to `pageSize`, will be returned.
    * @param {integer=} params.pageSize Number of pipelines to return at once. Defaults to 256, and max is 2048.
    * @param {string=} params.pageToken Token to use to indicate where to start getting results. If unspecified, returns the first page of results.
    * @param {string=} params.projectId Required. The name of the project to search for pipelines. Caller must have READ access to this project.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListPipelinesResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListPipelinesResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarPipelinesDollarList): GaxiosPromise[Schema$ListPipelinesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarPipelinesDollarList,
    callback: BodyResponseCallback[Schema$ListPipelinesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarPipelinesDollarList,
    options: BodyResponseCallback[Schema$ListPipelinesResponse],
    callback: BodyResponseCallback[Schema$ListPipelinesResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarPipelinesDollarList, options: MethodOptions): GaxiosPromise[Schema$ListPipelinesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarPipelinesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListPipelinesResponse]
  ): Unit = js.native
  /**
    * genomics.pipelines.run
    * @desc Runs a pipeline. If `pipelineId` is specified in the request, then
    * run a saved pipeline. If `ephemeralPipeline` is specified, then run that
    * pipeline once without saving a copy.  The caller must have READ
    * permission to the project where the pipeline is stored and WRITE
    * permission to the project where the pipeline will be run, as VMs will be
    * created and storage will be used.  If a pipeline operation is still
    * running after 6 days, it will be canceled.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Genomics API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/genomics
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
    * var genomics = google.genomics('v1alpha2');
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
    *   genomics.pipelines.run(request, function(err, response) {
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
    * @alias genomics.pipelines.run
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().RunPipelineRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def run(): GaxiosPromise[Schema$Operation] = js.native
  def run(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def run(params: ParamsDollarResourceDollarPipelinesDollarRun): GaxiosPromise[Schema$Operation] = js.native
  def run(
    params: ParamsDollarResourceDollarPipelinesDollarRun,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def run(
    params: ParamsDollarResourceDollarPipelinesDollarRun,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def run(params: ParamsDollarResourceDollarPipelinesDollarRun, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def run(
    params: ParamsDollarResourceDollarPipelinesDollarRun,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * genomics.pipelines.setOperationStatus
    * @desc Sets status of a given operation. Any new timestamps (as determined
    * by description) are appended to TimestampEvents. Should only be called by
    * VMs created by the Pipelines Service and not by end users.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Genomics API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/genomics
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
    * var genomics = google.genomics('v1alpha2');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     resource: {
    *       // TODO: Add desired properties to the request body. All existing
    * properties
    *       // will be replaced.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   genomics.pipelines.setOperationStatus(request, function(err) {
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
    * @alias genomics.pipelines.setOperationStatus
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().SetOperationStatusRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setOperationStatus(): GaxiosPromise[Schema$Empty] = js.native
  def setOperationStatus(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def setOperationStatus(params: ParamsDollarResourceDollarPipelinesDollarSetoperationstatus): GaxiosPromise[Schema$Empty] = js.native
  def setOperationStatus(
    params: ParamsDollarResourceDollarPipelinesDollarSetoperationstatus,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def setOperationStatus(
    params: ParamsDollarResourceDollarPipelinesDollarSetoperationstatus,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def setOperationStatus(params: ParamsDollarResourceDollarPipelinesDollarSetoperationstatus, options: MethodOptions): GaxiosPromise[Schema$Empty] = js.native
  def setOperationStatus(
    params: ParamsDollarResourceDollarPipelinesDollarSetoperationstatus,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
}

