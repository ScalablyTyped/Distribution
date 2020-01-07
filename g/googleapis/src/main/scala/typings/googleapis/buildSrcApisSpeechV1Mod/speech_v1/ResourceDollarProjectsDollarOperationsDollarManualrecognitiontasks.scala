package typings.googleapis.buildSrcApisSpeechV1Mod.speech_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/speech/v1", "speech_v1.Resource$Projects$Operations$Manualrecognitiontasks")
@js.native
class ResourceDollarProjectsDollarOperationsDollarManualrecognitiontasks protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * speech.projects.operations.manualRecognitionTasks.get
    * @desc Gets the latest state of a long-running operation.  Clients can use
    * this method to poll the operation result at intervals as recommended by
    * the API service.
    * @alias speech.projects.operations.manualRecognitionTasks.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the operation resource.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Operation] = js.native
  def get(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarOperationsDollarManualrecognitiontasksDollarGet): GaxiosPromise[Schema$Operation] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarOperationsDollarManualrecognitiontasksDollarGet,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarOperationsDollarManualrecognitiontasksDollarGet,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarOperationsDollarManualrecognitiontasksDollarGet,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarOperationsDollarManualrecognitiontasksDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
}

