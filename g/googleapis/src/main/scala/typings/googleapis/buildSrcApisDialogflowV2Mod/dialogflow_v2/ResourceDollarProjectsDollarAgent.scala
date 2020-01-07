package typings.googleapis.buildSrcApisDialogflowV2Mod.dialogflow_v2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dialogflow/v2", "dialogflow_v2.Resource$Projects$Agent")
@js.native
class ResourceDollarProjectsDollarAgent protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var entityTypes: ResourceDollarProjectsDollarAgentDollarEntitytypes = js.native
  var intents: ResourceDollarProjectsDollarAgentDollarIntents = js.native
  var sessions: ResourceDollarProjectsDollarAgentDollarSessions = js.native
  /**
    * dialogflow.projects.agent.export
    * @desc Exports the specified agent to a ZIP file.  Operation <response:
    * ExportAgentResponse>
    * @alias dialogflow.projects.agent.export
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Required. The project that the agent to export is associated with. Format: `projects/<Project ID>`.
    * @param {().GoogleCloudDialogflowV2ExportAgentRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def export(): GaxiosPromise[Schema$GoogleLongrunningOperation] = js.native
  def export(callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]): Unit = js.native
  def export(params: ParamsDollarResourceDollarProjectsDollarAgentDollarExport): GaxiosPromise[Schema$GoogleLongrunningOperation] = js.native
  def export(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarExport,
    callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]
  ): Unit = js.native
  def export(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarExport,
    options: BodyResponseCallback[Schema$GoogleLongrunningOperation],
    callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]
  ): Unit = js.native
  def export(params: ParamsDollarResourceDollarProjectsDollarAgentDollarExport, options: MethodOptions): GaxiosPromise[Schema$GoogleLongrunningOperation] = js.native
  def export(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarExport,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * dialogflow.projects.agent.import
    * @desc Imports the specified agent from a ZIP file.  Uploads new intents and
    * entity types without deleting the existing ones. Intents and entity types
    * with the same name are replaced with the new versions from
    * ImportAgentRequest.  Operation <response: google.protobuf.Empty>
    * @alias dialogflow.projects.agent.import
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Required. The project that the agent to import is associated with. Format: `projects/<Project ID>`.
    * @param {().GoogleCloudDialogflowV2ImportAgentRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def `import`(): GaxiosPromise[Schema$GoogleLongrunningOperation] = js.native
  def `import`(callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]): Unit = js.native
  def `import`(params: ParamsDollarResourceDollarProjectsDollarAgentDollarImport): GaxiosPromise[Schema$GoogleLongrunningOperation] = js.native
  def `import`(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarImport,
    callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]
  ): Unit = js.native
  def `import`(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarImport,
    options: BodyResponseCallback[Schema$GoogleLongrunningOperation],
    callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]
  ): Unit = js.native
  def `import`(params: ParamsDollarResourceDollarProjectsDollarAgentDollarImport, options: MethodOptions): GaxiosPromise[Schema$GoogleLongrunningOperation] = js.native
  def `import`(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarImport,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * dialogflow.projects.agent.restore
    * @desc Restores the specified agent from a ZIP file.  Replaces the current agent version with a new one. All the intents and entity types in the older version are deleted.  Operation <response: google.protobuf.Empty>
    * @alias dialogflow.projects.agent.restore
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Required. The project that the agent to restore is associated with. Format: `projects/<Project ID>`.
    * @param {().GoogleCloudDialogflowV2RestoreAgentRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def restore(): GaxiosPromise[Schema$GoogleLongrunningOperation] = js.native
  def restore(callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]): Unit = js.native
  def restore(params: ParamsDollarResourceDollarProjectsDollarAgentDollarRestore): GaxiosPromise[Schema$GoogleLongrunningOperation] = js.native
  def restore(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarRestore,
    callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]
  ): Unit = js.native
  def restore(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarRestore,
    options: BodyResponseCallback[Schema$GoogleLongrunningOperation],
    callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]
  ): Unit = js.native
  def restore(params: ParamsDollarResourceDollarProjectsDollarAgentDollarRestore, options: MethodOptions): GaxiosPromise[Schema$GoogleLongrunningOperation] = js.native
  def restore(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarRestore,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * dialogflow.projects.agent.search
    * @desc Returns the list of agents.  Since there is at most one
    * conversational agent per project, this method is useful primarily for
    * listing all agents across projects the caller has access to. One can
    * achieve that with a wildcard project collection id "-". Refer to [List
    * Sub-Collections](https://cloud.google.com/apis/design/design_patterns#list_sub-collections).
    * @alias dialogflow.projects.agent.search
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize Optional. The maximum number of items to return in a single page. By default 100 and at most 1000.
    * @param {string=} params.pageToken Optional. The next_page_token value returned from a previous list request.
    * @param {string} params.parent Required. The project to list agents from. Format: `projects/<Project ID or '-'>`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def search(): GaxiosPromise[Schema$GoogleCloudDialogflowV2SearchAgentsResponse] = js.native
  def search(callback: BodyResponseCallback[Schema$GoogleCloudDialogflowV2SearchAgentsResponse]): Unit = js.native
  def search(params: ParamsDollarResourceDollarProjectsDollarAgentDollarSearch): GaxiosPromise[Schema$GoogleCloudDialogflowV2SearchAgentsResponse] = js.native
  def search(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarSearch,
    callback: BodyResponseCallback[Schema$GoogleCloudDialogflowV2SearchAgentsResponse]
  ): Unit = js.native
  def search(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarSearch,
    options: BodyResponseCallback[Schema$GoogleCloudDialogflowV2SearchAgentsResponse],
    callback: BodyResponseCallback[Schema$GoogleCloudDialogflowV2SearchAgentsResponse]
  ): Unit = js.native
  def search(params: ParamsDollarResourceDollarProjectsDollarAgentDollarSearch, options: MethodOptions): GaxiosPromise[Schema$GoogleCloudDialogflowV2SearchAgentsResponse] = js.native
  def search(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarSearch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleCloudDialogflowV2SearchAgentsResponse]
  ): Unit = js.native
  /**
    * dialogflow.projects.agent.train
    * @desc Trains the specified agent.  Operation <response:
    * google.protobuf.Empty>
    * @alias dialogflow.projects.agent.train
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Required. The project that the agent to train is associated with. Format: `projects/<Project ID>`.
    * @param {().GoogleCloudDialogflowV2TrainAgentRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def train(): GaxiosPromise[Schema$GoogleLongrunningOperation] = js.native
  def train(callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]): Unit = js.native
  def train(params: ParamsDollarResourceDollarProjectsDollarAgentDollarTrain): GaxiosPromise[Schema$GoogleLongrunningOperation] = js.native
  def train(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarTrain,
    callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]
  ): Unit = js.native
  def train(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarTrain,
    options: BodyResponseCallback[Schema$GoogleLongrunningOperation],
    callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]
  ): Unit = js.native
  def train(params: ParamsDollarResourceDollarProjectsDollarAgentDollarTrain, options: MethodOptions): GaxiosPromise[Schema$GoogleLongrunningOperation] = js.native
  def train(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarTrain,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]
  ): Unit = js.native
}

