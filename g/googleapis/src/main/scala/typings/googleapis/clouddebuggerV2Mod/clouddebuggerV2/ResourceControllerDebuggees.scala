package typings.googleapis.clouddebuggerV2Mod.clouddebuggerV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/clouddebugger/v2", "clouddebugger_v2.Resource$Controller$Debuggees")
@js.native
class ResourceControllerDebuggees protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var breakpoints: ResourceControllerDebuggeesBreakpoints = js.native
  var context: APIRequestContext = js.native
  /**
    * clouddebugger.controller.debuggees.register
    * @desc Registers the debuggee with the controller service.  All agents
    * attached to the same application must call this method with exactly the
    * same request content to get back the same stable `debuggee_id`. Agents
    * should call this method again whenever `google.rpc.Code.NOT_FOUND` is
    * returned from any controller method.  This protocol allows the controller
    * service to disable debuggees, recover from data loss, or change the
    * `debuggee_id` format. Agents must handle `debuggee_id` value changing
    * upon re-registration.
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
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   cloudDebugger.controller.debuggees.register(request, function(err,
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
    * @alias clouddebugger.controller.debuggees.register
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().RegisterDebuggeeRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def register(): GaxiosPromise[SchemaRegisterDebuggeeResponse] = js.native
  def register(callback: BodyResponseCallback[SchemaRegisterDebuggeeResponse]): Unit = js.native
  def register(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaRegisterDebuggeeResponse] = js.native
  def register(params: ParamsResourceControllerDebuggeesRegister): GaxiosPromise[SchemaRegisterDebuggeeResponse] = js.native
  def register(
    params: ParamsResourceControllerDebuggeesRegister,
    callback: BodyResponseCallback[SchemaRegisterDebuggeeResponse]
  ): Unit = js.native
  def register(
    params: ParamsResourceControllerDebuggeesRegister,
    options: BodyResponseCallback[SchemaRegisterDebuggeeResponse],
    callback: BodyResponseCallback[SchemaRegisterDebuggeeResponse]
  ): Unit = js.native
  def register(params: ParamsResourceControllerDebuggeesRegister, options: MethodOptions): GaxiosPromise[SchemaRegisterDebuggeeResponse] = js.native
  def register(
    params: ParamsResourceControllerDebuggeesRegister,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRegisterDebuggeeResponse]
  ): Unit = js.native
}

