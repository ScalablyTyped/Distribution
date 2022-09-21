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

@JSImport("googleapis/build/src/apis/clouddebugger/v2", "clouddebugger_v2.Resource$Debugger$Debuggees")
@js.native
open class ResourceDebuggerDebuggees protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var breakpoints: ResourceDebuggerDebuggeesBreakpoints = js.native
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaListDebuggeesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListDebuggeesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListDebuggeesResponse] = js.native
  def list(params: ParamsResourceDebuggerDebuggeesList): GaxiosPromise[SchemaListDebuggeesResponse] = js.native
  def list(
    params: ParamsResourceDebuggerDebuggeesList,
    callback: BodyResponseCallback[SchemaListDebuggeesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceDebuggerDebuggeesList,
    options: BodyResponseCallback[Readable | SchemaListDebuggeesResponse],
    callback: BodyResponseCallback[Readable | SchemaListDebuggeesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceDebuggerDebuggeesList, options: MethodOptions): GaxiosPromise[SchemaListDebuggeesResponse] = js.native
  def list(
    params: ParamsResourceDebuggerDebuggeesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListDebuggeesResponse]
  ): Unit = js.native
  /**
    * Lists all the debuggees that the user has access to.
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
    *   const res = await clouddebugger.debugger.debuggees.list({
    *     // Required. The client version making the call. Schema: `domain/type/version` (e.g., `google.com/intellij/v1`).
    *     clientVersion: 'placeholder-value',
    *     // When set to `true`, the result includes all debuggees. Otherwise, the result includes only debuggees that are active.
    *     includeInactive: 'placeholder-value',
    *     // Required. Project number of a Google Cloud project whose debuggees to list.
    *     project: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "debuggees": []
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
  def list(params: ParamsResourceDebuggerDebuggeesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceDebuggerDebuggeesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
