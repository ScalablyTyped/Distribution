package typings.googleapis.clouddebuggerV2Mod.clouddebuggerV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/clouddebugger/v2", "clouddebugger_v2.Resource$Debugger$Debuggees$Breakpoints")
@js.native
open class ResourceDebuggerDebuggeesBreakpoints protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceDebuggerDebuggeesBreakpointsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceDebuggerDebuggeesBreakpointsDelete,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceDebuggerDebuggeesBreakpointsDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceDebuggerDebuggeesBreakpointsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceDebuggerDebuggeesBreakpointsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes the breakpoint from the debuggee.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/clouddebugger.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const clouddebugger = google.clouddebugger('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloud_debugger',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await clouddebugger.debugger.debuggees.breakpoints.delete({
    *     // Required. ID of the breakpoint to delete.
    *     breakpointId: 'placeholder-value',
    *     // Required. The client version making the call. Schema: `domain/type/version` (e.g., `google.com/intellij/v1`).
    *     clientVersion: 'placeholder-value',
    *     // Required. ID of the debuggee whose breakpoint to delete.
    *     debuggeeId: 'placeholder-value',
    *   });
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
  def delete(params: ParamsResourceDebuggerDebuggeesBreakpointsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceDebuggerDebuggeesBreakpointsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaGetBreakpointResponse] = js.native
  def get(callback: BodyResponseCallback[SchemaGetBreakpointResponse]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGetBreakpointResponse] = js.native
  def get(params: ParamsResourceDebuggerDebuggeesBreakpointsGet): GaxiosPromise[SchemaGetBreakpointResponse] = js.native
  def get(
    params: ParamsResourceDebuggerDebuggeesBreakpointsGet,
    callback: BodyResponseCallback[SchemaGetBreakpointResponse]
  ): Unit = js.native
  def get(
    params: ParamsResourceDebuggerDebuggeesBreakpointsGet,
    options: BodyResponseCallback[Readable | SchemaGetBreakpointResponse],
    callback: BodyResponseCallback[Readable | SchemaGetBreakpointResponse]
  ): Unit = js.native
  def get(params: ParamsResourceDebuggerDebuggeesBreakpointsGet, options: MethodOptions): GaxiosPromise[SchemaGetBreakpointResponse] = js.native
  def get(
    params: ParamsResourceDebuggerDebuggeesBreakpointsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGetBreakpointResponse]
  ): Unit = js.native
  /**
    * Gets breakpoint information.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/clouddebugger.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const clouddebugger = google.clouddebugger('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloud_debugger',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await clouddebugger.debugger.debuggees.breakpoints.get({
    *     // Required. ID of the breakpoint to get.
    *     breakpointId: 'placeholder-value',
    *     // Required. The client version making the call. Schema: `domain/type/version` (e.g., `google.com/intellij/v1`).
    *     clientVersion: 'placeholder-value',
    *     // Required. ID of the debuggee whose breakpoint to get.
    *     debuggeeId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "breakpoint": {}
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
  def get(params: ParamsResourceDebuggerDebuggeesBreakpointsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceDebuggerDebuggeesBreakpointsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListBreakpointsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListBreakpointsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListBreakpointsResponse] = js.native
  def list(params: ParamsResourceDebuggerDebuggeesBreakpointsList): GaxiosPromise[SchemaListBreakpointsResponse] = js.native
  def list(
    params: ParamsResourceDebuggerDebuggeesBreakpointsList,
    callback: BodyResponseCallback[SchemaListBreakpointsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceDebuggerDebuggeesBreakpointsList,
    options: BodyResponseCallback[Readable | SchemaListBreakpointsResponse],
    callback: BodyResponseCallback[Readable | SchemaListBreakpointsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceDebuggerDebuggeesBreakpointsList, options: MethodOptions): GaxiosPromise[SchemaListBreakpointsResponse] = js.native
  def list(
    params: ParamsResourceDebuggerDebuggeesBreakpointsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListBreakpointsResponse]
  ): Unit = js.native
  /**
    * Lists all breakpoints for the debuggee.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/clouddebugger.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const clouddebugger = google.clouddebugger('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloud_debugger',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await clouddebugger.debugger.debuggees.breakpoints.list({
    *     // Only breakpoints with the specified action will pass the filter.
    *     'action.value': 'placeholder-value',
    *     // Required. The client version making the call. Schema: `domain/type/version` (e.g., `google.com/intellij/v1`).
    *     clientVersion: 'placeholder-value',
    *     // Required. ID of the debuggee whose breakpoints to list.
    *     debuggeeId: 'placeholder-value',
    *     // When set to `true`, the response includes the list of breakpoints set by any user. Otherwise, it includes only breakpoints set by the caller.
    *     includeAllUsers: 'placeholder-value',
    *     // When set to `true`, the response includes active and inactive breakpoints. Otherwise, it includes only active breakpoints.
    *     includeInactive: 'placeholder-value',
    *     // This field is deprecated. The following fields are always stripped out of the result: `stack_frames`, `evaluated_expressions` and `variable_table`.
    *     stripResults: 'placeholder-value',
    *     // A wait token that, if specified, blocks the call until the breakpoints list has changed, or a server selected timeout has expired. The value should be set from the last response. The error code `google.rpc.Code.ABORTED` (RPC) is returned on wait timeout, which should be called again with the same `wait_token`.
    *     waitToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "breakpoints": [],
    *   //   "nextWaitToken": "my_nextWaitToken"
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
  def list(params: ParamsResourceDebuggerDebuggeesBreakpointsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceDebuggerDebuggeesBreakpointsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def set(): GaxiosPromise[SchemaSetBreakpointResponse] = js.native
  def set(callback: BodyResponseCallback[SchemaSetBreakpointResponse]): Unit = js.native
  def set(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSetBreakpointResponse] = js.native
  def set(params: ParamsResourceDebuggerDebuggeesBreakpointsSet): GaxiosPromise[SchemaSetBreakpointResponse] = js.native
  def set(
    params: ParamsResourceDebuggerDebuggeesBreakpointsSet,
    callback: BodyResponseCallback[SchemaSetBreakpointResponse]
  ): Unit = js.native
  def set(
    params: ParamsResourceDebuggerDebuggeesBreakpointsSet,
    options: BodyResponseCallback[Readable | SchemaSetBreakpointResponse],
    callback: BodyResponseCallback[Readable | SchemaSetBreakpointResponse]
  ): Unit = js.native
  def set(params: ParamsResourceDebuggerDebuggeesBreakpointsSet, options: MethodOptions): GaxiosPromise[SchemaSetBreakpointResponse] = js.native
  def set(
    params: ParamsResourceDebuggerDebuggeesBreakpointsSet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSetBreakpointResponse]
  ): Unit = js.native
  /**
    * Sets the breakpoint to the debuggee.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/clouddebugger.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const clouddebugger = google.clouddebugger('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloud_debugger',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await clouddebugger.debugger.debuggees.breakpoints.set({
    *     // The canary option set by the user upon setting breakpoint.
    *     canaryOption: 'placeholder-value',
    *     // Required. The client version making the call. Schema: `domain/type/version` (e.g., `google.com/intellij/v1`).
    *     clientVersion: 'placeholder-value',
    *     // Required. ID of the debuggee where the breakpoint is to be set.
    *     debuggeeId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "action": "my_action",
    *       //   "canaryExpireTime": "my_canaryExpireTime",
    *       //   "condition": "my_condition",
    *       //   "createTime": "my_createTime",
    *       //   "evaluatedExpressions": [],
    *       //   "expressions": [],
    *       //   "finalTime": "my_finalTime",
    *       //   "id": "my_id",
    *       //   "isFinalState": false,
    *       //   "labels": {},
    *       //   "location": {},
    *       //   "logLevel": "my_logLevel",
    *       //   "logMessageFormat": "my_logMessageFormat",
    *       //   "stackFrames": [],
    *       //   "state": "my_state",
    *       //   "status": {},
    *       //   "userEmail": "my_userEmail",
    *       //   "variableTable": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "breakpoint": {}
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
  def set(params: ParamsResourceDebuggerDebuggeesBreakpointsSet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def set(
    params: ParamsResourceDebuggerDebuggeesBreakpointsSet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
