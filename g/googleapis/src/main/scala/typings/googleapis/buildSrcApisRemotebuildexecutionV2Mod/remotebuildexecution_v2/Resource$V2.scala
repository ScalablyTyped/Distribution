package typings.googleapis.buildSrcApisRemotebuildexecutionV2Mod.remotebuildexecution_v2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/remotebuildexecution/v2", "remotebuildexecution_v2.Resource$V2")
@js.native
class Resource$V2 protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * remotebuildexecution.getCapabilities
    * @desc GetCapabilities returns the server capabilities configuration.
    * @alias remotebuildexecution.getCapabilities
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instanceName The instance of the execution system to operate against. A server may support multiple instances of the execution system (with their own workers, storage, caches, etc.). The server MAY require use of this field to select between them in an implementation-defined fashion, otherwise it can be omitted.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getCapabilities(): GaxiosPromise[Schema$BuildBazelRemoteExecutionV2ServerCapabilities] = js.native
  def getCapabilities(callback: BodyResponseCallback[Schema$BuildBazelRemoteExecutionV2ServerCapabilities]): Unit = js.native
  def getCapabilities(params: ParamsDollarResourceDollarV2DollarGetcapabilities): GaxiosPromise[Schema$BuildBazelRemoteExecutionV2ServerCapabilities] = js.native
  def getCapabilities(
    params: ParamsDollarResourceDollarV2DollarGetcapabilities,
    callback: BodyResponseCallback[Schema$BuildBazelRemoteExecutionV2ServerCapabilities]
  ): Unit = js.native
  def getCapabilities(
    params: ParamsDollarResourceDollarV2DollarGetcapabilities,
    options: BodyResponseCallback[Schema$BuildBazelRemoteExecutionV2ServerCapabilities],
    callback: BodyResponseCallback[Schema$BuildBazelRemoteExecutionV2ServerCapabilities]
  ): Unit = js.native
  def getCapabilities(params: ParamsDollarResourceDollarV2DollarGetcapabilities, options: MethodOptions): GaxiosPromise[Schema$BuildBazelRemoteExecutionV2ServerCapabilities] = js.native
  def getCapabilities(
    params: ParamsDollarResourceDollarV2DollarGetcapabilities,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$BuildBazelRemoteExecutionV2ServerCapabilities]
  ): Unit = js.native
}

