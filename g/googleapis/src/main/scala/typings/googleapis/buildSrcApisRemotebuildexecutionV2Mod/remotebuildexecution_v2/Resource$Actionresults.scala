package typings.googleapis.buildSrcApisRemotebuildexecutionV2Mod.remotebuildexecution_v2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/remotebuildexecution/v2", "remotebuildexecution_v2.Resource$Actionresults")
@js.native
class Resource$Actionresults protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * remotebuildexecution.actionResults.get
    * @desc Retrieve a cached execution result.  Errors:  * `NOT_FOUND`: The
    * requested `ActionResult` is not in the cache.
    * @alias remotebuildexecution.actionResults.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.hash The hash. In the case of SHA-256, it will always be a lowercase hex string exactly 64 characters long.
    * @param {string} params.instanceName The instance of the execution system to operate against. A server may support multiple instances of the execution system (with their own workers, storage, caches, etc.). The server MAY require use of this field to select between them in an implementation-defined fashion, otherwise it can be omitted.
    * @param {string} params.sizeBytes The size of the blob, in bytes.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$BuildBazelRemoteExecutionV2ActionResult] = js.native
  def get(callback: BodyResponseCallback[Schema$BuildBazelRemoteExecutionV2ActionResult]): Unit = js.native
  def get(params: ParamsDollarResourceDollarActionresultsDollarGet): GaxiosPromise[Schema$BuildBazelRemoteExecutionV2ActionResult] = js.native
  def get(
    params: ParamsDollarResourceDollarActionresultsDollarGet,
    callback: BodyResponseCallback[Schema$BuildBazelRemoteExecutionV2ActionResult]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarActionresultsDollarGet,
    options: BodyResponseCallback[Schema$BuildBazelRemoteExecutionV2ActionResult],
    callback: BodyResponseCallback[Schema$BuildBazelRemoteExecutionV2ActionResult]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarActionresultsDollarGet, options: MethodOptions): GaxiosPromise[Schema$BuildBazelRemoteExecutionV2ActionResult] = js.native
  def get(
    params: ParamsDollarResourceDollarActionresultsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$BuildBazelRemoteExecutionV2ActionResult]
  ): Unit = js.native
  /**
    * remotebuildexecution.actionResults.update
    * @desc Upload a new execution result.  In order to allow the server to
    * perform access control based on the type of action, and to assist with
    * client debugging, the client MUST first upload the Action that produced
    * the result, along with its Command, into the `ContentAddressableStorage`.
    * Errors:  * `INVALID_ARGUMENT`: One or more arguments are invalid. *
    * `FAILED_PRECONDITION`: One or more errors occurred in updating the action
    * result, such as a missing command or action. * `RESOURCE_EXHAUSTED`:
    * There is insufficient storage space to add the   entry to the cache.
    * @alias remotebuildexecution.actionResults.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.hash The hash. In the case of SHA-256, it will always be a lowercase hex string exactly 64 characters long.
    * @param {string} params.instanceName The instance of the execution system to operate against. A server may support multiple instances of the execution system (with their own workers, storage, caches, etc.). The server MAY require use of this field to select between them in an implementation-defined fashion, otherwise it can be omitted.
    * @param {integer=} params.resultsCachePolicy.priority The priority (relative importance) of this content in the overall cache. Generally, a lower value means a longer retention time or other advantage, but the interpretation of a given value is server-dependent. A priority of 0 means a *default* value, decided by the server.  The particular semantics of this field is up to the server. In particular, every server will have their own supported range of priorities, and will decide how these map into retention/eviction policy.
    * @param {string} params.sizeBytes The size of the blob, in bytes.
    * @param {().BuildBazelRemoteExecutionV2ActionResult} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$BuildBazelRemoteExecutionV2ActionResult] = js.native
  def update(callback: BodyResponseCallback[Schema$BuildBazelRemoteExecutionV2ActionResult]): Unit = js.native
  def update(params: ParamsDollarResourceDollarActionresultsDollarUpdate): GaxiosPromise[Schema$BuildBazelRemoteExecutionV2ActionResult] = js.native
  def update(
    params: ParamsDollarResourceDollarActionresultsDollarUpdate,
    callback: BodyResponseCallback[Schema$BuildBazelRemoteExecutionV2ActionResult]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarActionresultsDollarUpdate,
    options: BodyResponseCallback[Schema$BuildBazelRemoteExecutionV2ActionResult],
    callback: BodyResponseCallback[Schema$BuildBazelRemoteExecutionV2ActionResult]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarActionresultsDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$BuildBazelRemoteExecutionV2ActionResult] = js.native
  def update(
    params: ParamsDollarResourceDollarActionresultsDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$BuildBazelRemoteExecutionV2ActionResult]
  ): Unit = js.native
}

