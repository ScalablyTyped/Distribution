package typings.googleapis.buildSrcApisStoragetransferV1Mod.storagetransfer_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/storagetransfer/v1", "storagetransfer_v1.Resource$Transferoperations")
@js.native
class Resource$Transferoperations protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * storagetransfer.transferOperations.cancel
    * @desc Cancels a transfer. Use the get method to check whether the
    * cancellation succeeded or whether the operation completed despite
    * cancellation.
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
    *     // The name of the operation resource to be cancelled.
    *     name: 'transferOperations/my-transfer-operation',  // TODO: Update
    * placeholder value.
    *
    *     auth: authClient,
    *   };
    *
    *   storagetransfer.transferOperations.cancel(request, function(err) {
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
    * @alias storagetransfer.transferOperations.cancel
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the operation resource to be cancelled.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def cancel(): GaxiosPromise[Schema$Empty] = js.native
  def cancel(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def cancel(params: ParamsDollarResourceDollarTransferoperationsDollarCancel): GaxiosPromise[Schema$Empty] = js.native
  def cancel(
    params: ParamsDollarResourceDollarTransferoperationsDollarCancel,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def cancel(
    params: ParamsDollarResourceDollarTransferoperationsDollarCancel,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def cancel(params: ParamsDollarResourceDollarTransferoperationsDollarCancel, options: MethodOptions): GaxiosPromise[Schema$Empty] = js.native
  def cancel(
    params: ParamsDollarResourceDollarTransferoperationsDollarCancel,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * storagetransfer.transferOperations.delete
    * @desc This method is not supported and the server returns
    * `UNIMPLEMENTED`.
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
    *     // The name of the operation resource to be deleted.
    *     name: 'transferOperations/my-transfer-operation',  // TODO: Update
    * placeholder value.
    *
    *     auth: authClient,
    *   };
    *
    *   storagetransfer.transferOperations.delete(request, function(err) {
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
    * @alias storagetransfer.transferOperations.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the operation resource to be deleted.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Empty] = js.native
  def delete(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarTransferoperationsDollarDelete): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarTransferoperationsDollarDelete,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarTransferoperationsDollarDelete,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarTransferoperationsDollarDelete, options: MethodOptions): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarTransferoperationsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * storagetransfer.transferOperations.get
    * @desc Gets the latest state of a long-running operation.  Clients can use
    * this method to poll the operation result at intervals as recommended by
    * the API service.
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
    *     // The name of the operation resource.
    *     name: 'transferOperations/my-transfer-operation',  // TODO: Update
    * placeholder value.
    *
    *     auth: authClient,
    *   };
    *
    *   storagetransfer.transferOperations.get(request, function(err, response)
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
    * @alias storagetransfer.transferOperations.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the operation resource.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Operation] = js.native
  def get(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def get(params: ParamsDollarResourceDollarTransferoperationsDollarGet): GaxiosPromise[Schema$Operation] = js.native
  def get(
    params: ParamsDollarResourceDollarTransferoperationsDollarGet,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarTransferoperationsDollarGet,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarTransferoperationsDollarGet, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def get(
    params: ParamsDollarResourceDollarTransferoperationsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * storagetransfer.transferOperations.list
    * @desc Lists operations that match the specified filter in the request. If
    * the server doesn't support this method, it returns `UNIMPLEMENTED`. NOTE:
    * the `name` binding allows API services to override the binding to use
    * different resource name schemes, such as `users/x/operations`. To
    * override the binding, API services can add a binding such as
    * `"/v1/{name=users/x}/operations"` to their service configuration. For
    * backwards compatibility, the default name includes the operations
    * collection id, however overriding users must ensure the name binding is
    * the parent resource, without the operations collection id.
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
    *     // The value `transferOperations`.
    *     name: 'transferOperations',  // TODO: Update placeholder value.
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
    *     var operationsPage = response['operations'];
    *     if (!operationsPage) {
    *       return;
    *     }
    *     for (var i = 0; i < operationsPage.length; i++) {
    *       // TODO: Change code below to process each resource in
    * `operationsPage`: console.log(JSON.stringify(operationsPage[i], null,
    * 2));
    *     }
    *
    *     if (response.nextPageToken) {
    *       request.pageToken = response.nextPageToken;
    *       storagetransfer.transferOperations.list(request, handlePage);
    *     }
    *   };
    *
    *   storagetransfer.transferOperations.list(request, handlePage);
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
    * @alias storagetransfer.transferOperations.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter A list of query parameters specified as JSON text in the form of {\"project_id\" : \"my_project_id\", \"job_names\" : [\"jobid1\", \"jobid2\",...], \"operation_names\" : [\"opid1\", \"opid2\",...], \"transfer_statuses\":[\"status1\", \"status2\",...]}. Since `job_names`, `operation_names`, and `transfer_statuses` support multiple values, they must be specified with array notation. `job_names`, `operation_names`, and `transfer_statuses` are optional.
    * @param {string} params.name The value `transferOperations`.
    * @param {integer=} params.pageSize The list page size. The max allowed value is 256.
    * @param {string=} params.pageToken The list page token.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListOperationsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListOperationsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarTransferoperationsDollarList): GaxiosPromise[Schema$ListOperationsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarTransferoperationsDollarList,
    callback: BodyResponseCallback[Schema$ListOperationsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarTransferoperationsDollarList,
    options: BodyResponseCallback[Schema$ListOperationsResponse],
    callback: BodyResponseCallback[Schema$ListOperationsResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarTransferoperationsDollarList, options: MethodOptions): GaxiosPromise[Schema$ListOperationsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarTransferoperationsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListOperationsResponse]
  ): Unit = js.native
  /**
    * storagetransfer.transferOperations.pause
    * @desc Pauses a transfer operation.
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
    *     // The name of the transfer operation.
    *     // Required.
    *     name: 'transferOperations/my-transfer-operation',  // TODO: Update
    * placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   storagetransfer.transferOperations.pause(request, function(err) {
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
    * @alias storagetransfer.transferOperations.pause
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the transfer operation. Required.
    * @param {().PauseTransferOperationRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def pause(): GaxiosPromise[Schema$Empty] = js.native
  def pause(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def pause(params: ParamsDollarResourceDollarTransferoperationsDollarPause): GaxiosPromise[Schema$Empty] = js.native
  def pause(
    params: ParamsDollarResourceDollarTransferoperationsDollarPause,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def pause(
    params: ParamsDollarResourceDollarTransferoperationsDollarPause,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def pause(params: ParamsDollarResourceDollarTransferoperationsDollarPause, options: MethodOptions): GaxiosPromise[Schema$Empty] = js.native
  def pause(
    params: ParamsDollarResourceDollarTransferoperationsDollarPause,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * storagetransfer.transferOperations.resume
    * @desc Resumes a transfer operation that is paused.
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
    *     // The name of the transfer operation.
    *     // Required.
    *     name: 'transferOperations/my-transfer-operation',  // TODO: Update
    * placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   storagetransfer.transferOperations.resume(request, function(err) {
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
    * @alias storagetransfer.transferOperations.resume
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the transfer operation. Required.
    * @param {().ResumeTransferOperationRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def resume(): GaxiosPromise[Schema$Empty] = js.native
  def resume(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def resume(params: ParamsDollarResourceDollarTransferoperationsDollarResume): GaxiosPromise[Schema$Empty] = js.native
  def resume(
    params: ParamsDollarResourceDollarTransferoperationsDollarResume,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def resume(
    params: ParamsDollarResourceDollarTransferoperationsDollarResume,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def resume(params: ParamsDollarResourceDollarTransferoperationsDollarResume, options: MethodOptions): GaxiosPromise[Schema$Empty] = js.native
  def resume(
    params: ParamsDollarResourceDollarTransferoperationsDollarResume,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
}

