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

@JSImport("googleapis/build/src/apis/clouddebugger/v2", "clouddebugger_v2.Resource$Controller$Debuggees$Breakpoints")
@js.native
open class ResourceControllerDebuggeesBreakpoints protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaListActiveBreakpointsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListActiveBreakpointsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListActiveBreakpointsResponse] = js.native
  def list(params: ParamsResourceControllerDebuggeesBreakpointsList): GaxiosPromise[SchemaListActiveBreakpointsResponse] = js.native
  def list(
    params: ParamsResourceControllerDebuggeesBreakpointsList,
    callback: BodyResponseCallback[SchemaListActiveBreakpointsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceControllerDebuggeesBreakpointsList,
    options: BodyResponseCallback[Readable | SchemaListActiveBreakpointsResponse],
    callback: BodyResponseCallback[Readable | SchemaListActiveBreakpointsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceControllerDebuggeesBreakpointsList, options: MethodOptions): GaxiosPromise[SchemaListActiveBreakpointsResponse] = js.native
  def list(
    params: ParamsResourceControllerDebuggeesBreakpointsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListActiveBreakpointsResponse]
  ): Unit = js.native
  /**
    * Returns the list of all active breakpoints for the debuggee. The breakpoint specification (`location`, `condition`, and `expressions` fields) is semantically immutable, although the field values may change. For example, an agent may update the location line number to reflect the actual line where the breakpoint was set, but this doesn't change the breakpoint semantics. This means that an agent does not need to check if a breakpoint has changed when it encounters the same breakpoint on a successive call. Moreover, an agent should remember the breakpoints that are completed until the controller removes them from the active list to avoid setting those breakpoints again.
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
    *   const res = await clouddebugger.controller.debuggees.breakpoints.list({
    *     // Identifies the agent. This is the ID returned in the RegisterDebuggee response.
    *     agentId: 'placeholder-value',
    *     // Required. Identifies the debuggee.
    *     debuggeeId: 'placeholder-value',
    *     // If set to `true` (recommended), returns `google.rpc.Code.OK` status and sets the `wait_expired` response field to `true` when the server-selected timeout has expired. If set to `false` (deprecated), returns `google.rpc.Code.ABORTED` status when the server-selected timeout has expired.
    *     successOnTimeout: 'placeholder-value',
    *     // A token that, if specified, blocks the method call until the list of active breakpoints has changed, or a server-selected timeout has expired. The value should be set from the `next_wait_token` field in the last response. The initial value should be set to `"init"`.
    *     waitToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "breakpoints": [],
    *   //   "nextWaitToken": "my_nextWaitToken",
    *   //   "waitExpired": false
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
  def list(params: ParamsResourceControllerDebuggeesBreakpointsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceControllerDebuggeesBreakpointsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaUpdateActiveBreakpointResponse] = js.native
  def update(callback: BodyResponseCallback[SchemaUpdateActiveBreakpointResponse]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaUpdateActiveBreakpointResponse] = js.native
  def update(params: ParamsResourceControllerDebuggeesBreakpointsUpdate): GaxiosPromise[SchemaUpdateActiveBreakpointResponse] = js.native
  def update(
    params: ParamsResourceControllerDebuggeesBreakpointsUpdate,
    callback: BodyResponseCallback[SchemaUpdateActiveBreakpointResponse]
  ): Unit = js.native
  def update(
    params: ParamsResourceControllerDebuggeesBreakpointsUpdate,
    options: BodyResponseCallback[Readable | SchemaUpdateActiveBreakpointResponse],
    callback: BodyResponseCallback[Readable | SchemaUpdateActiveBreakpointResponse]
  ): Unit = js.native
  def update(params: ParamsResourceControllerDebuggeesBreakpointsUpdate, options: MethodOptions): GaxiosPromise[SchemaUpdateActiveBreakpointResponse] = js.native
  def update(
    params: ParamsResourceControllerDebuggeesBreakpointsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUpdateActiveBreakpointResponse]
  ): Unit = js.native
  /**
    * Updates the breakpoint state or mutable fields. The entire Breakpoint message must be sent back to the controller service. Updates to active breakpoint fields are only allowed if the new value does not change the breakpoint specification. Updates to the `location`, `condition` and `expressions` fields should not alter the breakpoint semantics. These may only make changes such as canonicalizing a value or snapping the location to the correct line of code.
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
    *   const res = await clouddebugger.controller.debuggees.breakpoints.update({
    *     // Required. Identifies the debuggee being debugged.
    *     debuggeeId: 'placeholder-value',
    *     // Breakpoint identifier, unique in the scope of the debuggee.
    *     id: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "breakpoint": {}
    *       // }
    *     },
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
  def update(params: ParamsResourceControllerDebuggeesBreakpointsUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceControllerDebuggeesBreakpointsUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
