package typings.googleapis.buildSrcApisClouddebuggerV2Mod.clouddebugger_v2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/clouddebugger/v2", "clouddebugger_v2.Resource$Debugger$Debuggees")
@js.native
class ResourceDollarDebuggerDollarDebuggees protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var breakpoints: ResourceDollarDebuggerDollarDebuggeesDollarBreakpoints = js.native
  var context: APIRequestContext = js.native
  /**
    * clouddebugger.debugger.debuggees.list
    * @desc Lists all the debuggees that the user has access to.
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
    *     auth: authClient,
    *   };
    *
    *   cloudDebugger.debugger.debuggees.list(request, function(err, response)
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
    * @alias clouddebugger.debugger.debuggees.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.clientVersion The client version making the call. Schema: `domain/type/version` (e.g., `google.com/intellij/v1`).
    * @param {boolean=} params.includeInactive When set to `true`, the result includes all debuggees. Otherwise, the result includes only debuggees that are active.
    * @param {string=} params.project Project number of a Google Cloud project whose debuggees to list.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListDebuggeesResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListDebuggeesResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarDebuggerDollarDebuggeesDollarList): GaxiosPromise[Schema$ListDebuggeesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarDebuggerDollarDebuggeesDollarList,
    callback: BodyResponseCallback[Schema$ListDebuggeesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarDebuggerDollarDebuggeesDollarList,
    options: BodyResponseCallback[Schema$ListDebuggeesResponse],
    callback: BodyResponseCallback[Schema$ListDebuggeesResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarDebuggerDollarDebuggeesDollarList, options: MethodOptions): GaxiosPromise[Schema$ListDebuggeesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarDebuggerDollarDebuggeesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListDebuggeesResponse]
  ): Unit = js.native
}

