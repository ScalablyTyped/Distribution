package typings.googleapis.buildSrcApisRemotebuildexecutionV2Mod.remotebuildexecution_v2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/remotebuildexecution/v2", "remotebuildexecution_v2.Resource$Operations")
@js.native
class Resource$Operations protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * remotebuildexecution.operations.waitExecution
    * @desc Wait for an execution operation to complete. When the client
    * initially makes the request, the server immediately responds with the
    * current status of the execution. The server will leave the request stream
    * open until the operation completes, and then respond with the completed
    * operation. The server MAY choose to stream additional updates as
    * execution progresses, such as to provide an update as to the state of the
    * execution.
    * @alias remotebuildexecution.operations.waitExecution
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the Operation returned by Execute.
    * @param {().BuildBazelRemoteExecutionV2WaitExecutionRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def waitExecution(): GaxiosPromise[Schema$GoogleLongrunningOperation] = js.native
  def waitExecution(callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]): Unit = js.native
  def waitExecution(params: ParamsDollarResourceDollarOperationsDollarWaitexecution): GaxiosPromise[Schema$GoogleLongrunningOperation] = js.native
  def waitExecution(
    params: ParamsDollarResourceDollarOperationsDollarWaitexecution,
    callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]
  ): Unit = js.native
  def waitExecution(
    params: ParamsDollarResourceDollarOperationsDollarWaitexecution,
    options: BodyResponseCallback[Schema$GoogleLongrunningOperation],
    callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]
  ): Unit = js.native
  def waitExecution(params: ParamsDollarResourceDollarOperationsDollarWaitexecution, options: MethodOptions): GaxiosPromise[Schema$GoogleLongrunningOperation] = js.native
  def waitExecution(
    params: ParamsDollarResourceDollarOperationsDollarWaitexecution,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]
  ): Unit = js.native
}

