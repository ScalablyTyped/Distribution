package typings.googleapis.buildSrcApisClouddebuggerV2Mod.clouddebugger_v2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/clouddebugger/v2", "clouddebugger_v2.Resource$Debugger$Debuggees$Breakpoints")
@js.native
class ResourceDollarDebuggerDollarDebuggeesDollarBreakpoints protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * clouddebugger.debugger.debuggees.breakpoints.delete
    * @desc Deletes the breakpoint from the debuggee.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Stackdriver Debugger API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/clouddebugger
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
    * var cloudDebugger = google.clouddebugger('v2');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // ID of the debuggee whose breakpoint to delete.
    *     debuggeeId: 'my-debuggee-id',  // TODO: Update placeholder value.
    *
    *     // ID of the breakpoint to delete.
    *     breakpointId: 'my-breakpoint-id',  // TODO: Update placeholder value.
    *
    *     auth: authClient,
    *   };
    *
    *   cloudDebugger.debugger.debuggees.breakpoints.delete(request,
    * function(err) { if (err) { console.error(err); return;
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
    * @alias clouddebugger.debugger.debuggees.breakpoints.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.breakpointId ID of the breakpoint to delete.
    * @param {string=} params.clientVersion The client version making the call. Schema: `domain/type/version` (e.g., `google.com/intellij/v1`).
    * @param {string} params.debuggeeId ID of the debuggee whose breakpoint to delete.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Empty] = js.native
  def delete(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarDebuggerDollarDebuggeesDollarBreakpointsDollarDelete): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarDebuggerDollarDebuggeesDollarBreakpointsDollarDelete,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarDebuggerDollarDebuggeesDollarBreakpointsDollarDelete,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarDebuggerDollarDebuggeesDollarBreakpointsDollarDelete,
    options: MethodOptions
  ): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarDebuggerDollarDebuggeesDollarBreakpointsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * clouddebugger.debugger.debuggees.breakpoints.get
    * @desc Gets breakpoint information.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Stackdriver Debugger API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/clouddebugger
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
    * var cloudDebugger = google.clouddebugger('v2');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // ID of the debuggee whose breakpoint to get.
    *     debuggeeId: 'my-debuggee-id',  // TODO: Update placeholder value.
    *
    *     // ID of the breakpoint to get.
    *     breakpointId: 'my-breakpoint-id',  // TODO: Update placeholder value.
    *
    *     auth: authClient,
    *   };
    *
    *   cloudDebugger.debugger.debuggees.breakpoints.get(request, function(err,
    * response) { if (err) { console.error(err); return;
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
    * @alias clouddebugger.debugger.debuggees.breakpoints.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.breakpointId ID of the breakpoint to get.
    * @param {string=} params.clientVersion The client version making the call. Schema: `domain/type/version` (e.g., `google.com/intellij/v1`).
    * @param {string} params.debuggeeId ID of the debuggee whose breakpoint to get.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$GetBreakpointResponse] = js.native
  def get(callback: BodyResponseCallback[Schema$GetBreakpointResponse]): Unit = js.native
  def get(params: ParamsDollarResourceDollarDebuggerDollarDebuggeesDollarBreakpointsDollarGet): GaxiosPromise[Schema$GetBreakpointResponse] = js.native
  def get(
    params: ParamsDollarResourceDollarDebuggerDollarDebuggeesDollarBreakpointsDollarGet,
    callback: BodyResponseCallback[Schema$GetBreakpointResponse]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarDebuggerDollarDebuggeesDollarBreakpointsDollarGet,
    options: BodyResponseCallback[Schema$GetBreakpointResponse],
    callback: BodyResponseCallback[Schema$GetBreakpointResponse]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarDebuggerDollarDebuggeesDollarBreakpointsDollarGet,
    options: MethodOptions
  ): GaxiosPromise[Schema$GetBreakpointResponse] = js.native
  def get(
    params: ParamsDollarResourceDollarDebuggerDollarDebuggeesDollarBreakpointsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GetBreakpointResponse]
  ): Unit = js.native
  /**
    * clouddebugger.debugger.debuggees.breakpoints.list
    * @desc Lists all breakpoints for the debuggee.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Stackdriver Debugger API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/clouddebugger
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
    * var cloudDebugger = google.clouddebugger('v2');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // ID of the debuggee whose breakpoints to list.
    *     debuggeeId: 'my-debuggee-id',  // TODO: Update placeholder value.
    *
    *     auth: authClient,
    *   };
    *
    *   cloudDebugger.debugger.debuggees.breakpoints.list(request,
    * function(err, response) { if (err) { console.error(err); return;
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
    * @alias clouddebugger.debugger.debuggees.breakpoints.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.action.value Only breakpoints with the specified action will pass the filter.
    * @param {string=} params.clientVersion The client version making the call. Schema: `domain/type/version` (e.g., `google.com/intellij/v1`).
    * @param {string} params.debuggeeId ID of the debuggee whose breakpoints to list.
    * @param {boolean=} params.includeAllUsers When set to `true`, the response includes the list of breakpoints set by any user. Otherwise, it includes only breakpoints set by the caller.
    * @param {boolean=} params.includeInactive When set to `true`, the response includes active and inactive breakpoints. Otherwise, it includes only active breakpoints.
    * @param {boolean=} params.stripResults This field is deprecated. The following fields are always stripped out of the result: `stack_frames`, `evaluated_expressions` and `variable_table`.
    * @param {string=} params.waitToken A wait token that, if specified, blocks the call until the breakpoints list has changed, or a server selected timeout has expired.  The value should be set from the last response. The error code `google.rpc.Code.ABORTED` (RPC) is returned on wait timeout, which should be called again with the same `wait_token`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListBreakpointsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListBreakpointsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarDebuggerDollarDebuggeesDollarBreakpointsDollarList): GaxiosPromise[Schema$ListBreakpointsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarDebuggerDollarDebuggeesDollarBreakpointsDollarList,
    callback: BodyResponseCallback[Schema$ListBreakpointsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarDebuggerDollarDebuggeesDollarBreakpointsDollarList,
    options: BodyResponseCallback[Schema$ListBreakpointsResponse],
    callback: BodyResponseCallback[Schema$ListBreakpointsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarDebuggerDollarDebuggeesDollarBreakpointsDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$ListBreakpointsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarDebuggerDollarDebuggeesDollarBreakpointsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListBreakpointsResponse]
  ): Unit = js.native
  /**
    * clouddebugger.debugger.debuggees.breakpoints.set
    * @desc Sets the breakpoint to the debuggee.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Stackdriver Debugger API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/clouddebugger
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
    * var cloudDebugger = google.clouddebugger('v2');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // ID of the debuggee where the breakpoint is to be set.
    *     debuggeeId: 'my-debuggee-id',  // TODO: Update placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   cloudDebugger.debugger.debuggees.breakpoints.set(request, function(err,
    * response) { if (err) { console.error(err); return;
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
    * @alias clouddebugger.debugger.debuggees.breakpoints.set
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.clientVersion The client version making the call. Schema: `domain/type/version` (e.g., `google.com/intellij/v1`).
    * @param {string} params.debuggeeId ID of the debuggee where the breakpoint is to be set.
    * @param {().Breakpoint} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def set(): GaxiosPromise[Schema$SetBreakpointResponse] = js.native
  def set(callback: BodyResponseCallback[Schema$SetBreakpointResponse]): Unit = js.native
  def set(params: ParamsDollarResourceDollarDebuggerDollarDebuggeesDollarBreakpointsDollarSet): GaxiosPromise[Schema$SetBreakpointResponse] = js.native
  def set(
    params: ParamsDollarResourceDollarDebuggerDollarDebuggeesDollarBreakpointsDollarSet,
    callback: BodyResponseCallback[Schema$SetBreakpointResponse]
  ): Unit = js.native
  def set(
    params: ParamsDollarResourceDollarDebuggerDollarDebuggeesDollarBreakpointsDollarSet,
    options: BodyResponseCallback[Schema$SetBreakpointResponse],
    callback: BodyResponseCallback[Schema$SetBreakpointResponse]
  ): Unit = js.native
  def set(
    params: ParamsDollarResourceDollarDebuggerDollarDebuggeesDollarBreakpointsDollarSet,
    options: MethodOptions
  ): GaxiosPromise[Schema$SetBreakpointResponse] = js.native
  def set(
    params: ParamsDollarResourceDollarDebuggerDollarDebuggeesDollarBreakpointsDollarSet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$SetBreakpointResponse]
  ): Unit = js.native
}

