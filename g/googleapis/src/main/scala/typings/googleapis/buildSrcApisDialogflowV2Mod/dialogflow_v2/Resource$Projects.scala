package typings.googleapis.buildSrcApisDialogflowV2Mod.dialogflow_v2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dialogflow/v2", "dialogflow_v2.Resource$Projects")
@js.native
class Resource$Projects protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var agent: ResourceDollarProjectsDollarAgent = js.native
  var context: APIRequestContext = js.native
  var operations: ResourceDollarProjectsDollarOperations = js.native
  /**
    * dialogflow.projects.getAgent
    * @desc Retrieves the specified agent.
    * @alias dialogflow.projects.getAgent
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Required. The project that the agent to fetch is associated with. Format: `projects/<Project ID>`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getAgent(): GaxiosPromise[Schema$GoogleCloudDialogflowV2Agent] = js.native
  def getAgent(callback: BodyResponseCallback[Schema$GoogleCloudDialogflowV2Agent]): Unit = js.native
  def getAgent(params: ParamsDollarResourceDollarProjectsDollarGetagent): GaxiosPromise[Schema$GoogleCloudDialogflowV2Agent] = js.native
  def getAgent(
    params: ParamsDollarResourceDollarProjectsDollarGetagent,
    callback: BodyResponseCallback[Schema$GoogleCloudDialogflowV2Agent]
  ): Unit = js.native
  def getAgent(
    params: ParamsDollarResourceDollarProjectsDollarGetagent,
    options: BodyResponseCallback[Schema$GoogleCloudDialogflowV2Agent],
    callback: BodyResponseCallback[Schema$GoogleCloudDialogflowV2Agent]
  ): Unit = js.native
  def getAgent(params: ParamsDollarResourceDollarProjectsDollarGetagent, options: MethodOptions): GaxiosPromise[Schema$GoogleCloudDialogflowV2Agent] = js.native
  def getAgent(
    params: ParamsDollarResourceDollarProjectsDollarGetagent,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleCloudDialogflowV2Agent]
  ): Unit = js.native
}

