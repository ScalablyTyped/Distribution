package typings.googleapis.buildSrcApisDataflowV1b3Mod.dataflow_v1b3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dataflow/v1b3", "dataflow_v1b3.Resource$Projects$Locations$Jobs$Debug")
@js.native
class ResourceDollarProjectsDollarLocationsDollarJobsDollarDebug protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dataflow.projects.locations.jobs.debug.getConfig
    * @desc Get encoded debug configuration for component. Not cacheable.
    * @alias dataflow.projects.locations.jobs.debug.getConfig
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.jobId The job id.
    * @param {string} params.location The [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that contains the job specified by job_id.
    * @param {string} params.projectId The project id.
    * @param {().GetDebugConfigRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getConfig(): GaxiosPromise[Schema$GetDebugConfigResponse] = js.native
  def getConfig(callback: BodyResponseCallback[Schema$GetDebugConfigResponse]): Unit = js.native
  def getConfig(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarJobsDollarDebugDollarGetconfig): GaxiosPromise[Schema$GetDebugConfigResponse] = js.native
  def getConfig(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarJobsDollarDebugDollarGetconfig,
    callback: BodyResponseCallback[Schema$GetDebugConfigResponse]
  ): Unit = js.native
  def getConfig(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarJobsDollarDebugDollarGetconfig,
    options: BodyResponseCallback[Schema$GetDebugConfigResponse],
    callback: BodyResponseCallback[Schema$GetDebugConfigResponse]
  ): Unit = js.native
  def getConfig(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarJobsDollarDebugDollarGetconfig,
    options: MethodOptions
  ): GaxiosPromise[Schema$GetDebugConfigResponse] = js.native
  def getConfig(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarJobsDollarDebugDollarGetconfig,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GetDebugConfigResponse]
  ): Unit = js.native
  /**
    * dataflow.projects.locations.jobs.debug.sendCapture
    * @desc Send encoded debug capture data for component.
    * @alias dataflow.projects.locations.jobs.debug.sendCapture
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.jobId The job id.
    * @param {string} params.location The [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that contains the job specified by job_id.
    * @param {string} params.projectId The project id.
    * @param {().SendDebugCaptureRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def sendCapture(): GaxiosPromise[Schema$SendDebugCaptureResponse] = js.native
  def sendCapture(callback: BodyResponseCallback[Schema$SendDebugCaptureResponse]): Unit = js.native
  def sendCapture(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarJobsDollarDebugDollarSendcapture): GaxiosPromise[Schema$SendDebugCaptureResponse] = js.native
  def sendCapture(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarJobsDollarDebugDollarSendcapture,
    callback: BodyResponseCallback[Schema$SendDebugCaptureResponse]
  ): Unit = js.native
  def sendCapture(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarJobsDollarDebugDollarSendcapture,
    options: BodyResponseCallback[Schema$SendDebugCaptureResponse],
    callback: BodyResponseCallback[Schema$SendDebugCaptureResponse]
  ): Unit = js.native
  def sendCapture(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarJobsDollarDebugDollarSendcapture,
    options: MethodOptions
  ): GaxiosPromise[Schema$SendDebugCaptureResponse] = js.native
  def sendCapture(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarJobsDollarDebugDollarSendcapture,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$SendDebugCaptureResponse]
  ): Unit = js.native
}

