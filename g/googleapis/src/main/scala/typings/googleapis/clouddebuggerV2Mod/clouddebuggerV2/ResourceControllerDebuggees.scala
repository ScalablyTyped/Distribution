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

@JSImport("googleapis/build/src/apis/clouddebugger/v2", "clouddebugger_v2.Resource$Controller$Debuggees")
@js.native
open class ResourceControllerDebuggees protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var breakpoints: ResourceControllerDebuggeesBreakpoints = js.native
  
  var context: APIRequestContext = js.native
  
  def register(): GaxiosPromise[SchemaRegisterDebuggeeResponse] = js.native
  def register(callback: BodyResponseCallback[SchemaRegisterDebuggeeResponse]): Unit = js.native
  def register(params: Unit, options: MethodOptions): GaxiosPromise[SchemaRegisterDebuggeeResponse] = js.native
  def register(params: ParamsResourceControllerDebuggeesRegister): GaxiosPromise[SchemaRegisterDebuggeeResponse] = js.native
  def register(
    params: ParamsResourceControllerDebuggeesRegister,
    callback: BodyResponseCallback[SchemaRegisterDebuggeeResponse]
  ): Unit = js.native
  def register(
    params: ParamsResourceControllerDebuggeesRegister,
    options: BodyResponseCallback[Readable | SchemaRegisterDebuggeeResponse],
    callback: BodyResponseCallback[Readable | SchemaRegisterDebuggeeResponse]
  ): Unit = js.native
  def register(params: ParamsResourceControllerDebuggeesRegister, options: MethodOptions): GaxiosPromise[SchemaRegisterDebuggeeResponse] = js.native
  def register(
    params: ParamsResourceControllerDebuggeesRegister,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRegisterDebuggeeResponse]
  ): Unit = js.native
  /**
    * Registers the debuggee with the controller service. All agents attached to the same application must call this method with exactly the same request content to get back the same stable `debuggee_id`. Agents should call this method again whenever `google.rpc.Code.NOT_FOUND` is returned from any controller method. This protocol allows the controller service to disable debuggees, recover from data loss, or change the `debuggee_id` format. Agents must handle `debuggee_id` value changing upon re-registration.
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
    *   const res = await clouddebugger.controller.debuggees.register({
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "debuggee": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "agentId": "my_agentId",
    *   //   "debuggee": {}
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
  def register(params: ParamsResourceControllerDebuggeesRegister, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def register(
    params: ParamsResourceControllerDebuggeesRegister,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
