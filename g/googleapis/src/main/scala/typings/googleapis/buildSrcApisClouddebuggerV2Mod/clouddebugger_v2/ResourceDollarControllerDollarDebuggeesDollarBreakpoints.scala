package typings.googleapis.buildSrcApisClouddebuggerV2Mod.clouddebugger_v2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/clouddebugger/v2", "clouddebugger_v2.Resource$Controller$Debuggees$Breakpoints")
@js.native
class ResourceDollarControllerDollarDebuggeesDollarBreakpoints protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * clouddebugger.controller.debuggees.breakpoints.list
    * @desc Returns the list of all active breakpoints for the debuggee.  The
    * breakpoint specification (`location`, `condition`, and `expressions`
    * fields) is semantically immutable, although the field values may change.
    * For example, an agent may update the location line number to reflect the
    * actual line where the breakpoint was set, but this doesn't change the
    * breakpoint semantics.  This means that an agent does not need to check if
    * a breakpoint has changed when it encounters the same breakpoint on a
    * successive call. Moreover, an agent should remember the breakpoints that
    * are completed until the controller removes them from the active list to
    * avoid setting those breakpoints again.
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
    *     // Identifies the debuggee.
    *     debuggeeId: 'my-debuggee-id',  // TODO: Update placeholder value.
    *
    *     auth: authClient,
    *   };
    *
    *   cloudDebugger.controller.debuggees.breakpoints.list(request,
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
    * @alias clouddebugger.controller.debuggees.breakpoints.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.debuggeeId Identifies the debuggee.
    * @param {boolean=} params.successOnTimeout If set to `true` (recommended), returns `google.rpc.Code.OK` status and sets the `wait_expired` response field to `true` when the server-selected timeout has expired.  If set to `false` (deprecated), returns `google.rpc.Code.ABORTED` status when the server-selected timeout has expired.
    * @param {string=} params.waitToken A token that, if specified, blocks the method call until the list of active breakpoints has changed, or a server-selected timeout has expired. The value should be set from the `next_wait_token` field in the last response. The initial value should be set to `"init"`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListActiveBreakpointsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListActiveBreakpointsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarControllerDollarDebuggeesDollarBreakpointsDollarList): GaxiosPromise[Schema$ListActiveBreakpointsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarControllerDollarDebuggeesDollarBreakpointsDollarList,
    callback: BodyResponseCallback[Schema$ListActiveBreakpointsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarControllerDollarDebuggeesDollarBreakpointsDollarList,
    options: BodyResponseCallback[Schema$ListActiveBreakpointsResponse],
    callback: BodyResponseCallback[Schema$ListActiveBreakpointsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarControllerDollarDebuggeesDollarBreakpointsDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$ListActiveBreakpointsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarControllerDollarDebuggeesDollarBreakpointsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListActiveBreakpointsResponse]
  ): Unit = js.native
  /**
    * clouddebugger.controller.debuggees.breakpoints.update
    * @desc Updates the breakpoint state or mutable fields. The entire
    * Breakpoint message must be sent back to the controller service.  Updates
    * to active breakpoint fields are only allowed if the new value does not
    * change the breakpoint specification. Updates to the `location`,
    * `condition` and `expressions` fields should not alter the breakpoint
    * semantics. These may only make changes such as canonicalizing a value or
    * snapping the location to the correct line of code.
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
    *     // Identifies the debuggee being debugged.
    *     debuggeeId: 'my-debuggee-id',  // TODO: Update placeholder value.
    *
    *     // Breakpoint identifier, unique in the scope of the debuggee.
    *     id: 'my-id',  // TODO: Update placeholder value.
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
    *   cloudDebugger.controller.debuggees.breakpoints.update(request,
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
    * @alias clouddebugger.controller.debuggees.breakpoints.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.debuggeeId Identifies the debuggee being debugged.
    * @param {string} params.id Breakpoint identifier, unique in the scope of the debuggee.
    * @param {().UpdateActiveBreakpointRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$UpdateActiveBreakpointResponse] = js.native
  def update(callback: BodyResponseCallback[Schema$UpdateActiveBreakpointResponse]): Unit = js.native
  def update(params: ParamsDollarResourceDollarControllerDollarDebuggeesDollarBreakpointsDollarUpdate): GaxiosPromise[Schema$UpdateActiveBreakpointResponse] = js.native
  def update(
    params: ParamsDollarResourceDollarControllerDollarDebuggeesDollarBreakpointsDollarUpdate,
    callback: BodyResponseCallback[Schema$UpdateActiveBreakpointResponse]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarControllerDollarDebuggeesDollarBreakpointsDollarUpdate,
    options: BodyResponseCallback[Schema$UpdateActiveBreakpointResponse],
    callback: BodyResponseCallback[Schema$UpdateActiveBreakpointResponse]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarControllerDollarDebuggeesDollarBreakpointsDollarUpdate,
    options: MethodOptions
  ): GaxiosPromise[Schema$UpdateActiveBreakpointResponse] = js.native
  def update(
    params: ParamsDollarResourceDollarControllerDollarDebuggeesDollarBreakpointsDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$UpdateActiveBreakpointResponse]
  ): Unit = js.native
}

