package typings.googleapis.buildSrcApisDialogflowV2beta1Mod.dialogflow_v2beta1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dialogflow/v2beta1", "dialogflow_v2beta1.Resource$Projects$Agent$Knowledgebases")
@js.native
class ResourceDollarProjectsDollarAgentDollarKnowledgebases protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var documents: ResourceDollarProjectsDollarAgentDollarKnowledgebasesDollarDocuments = js.native
  /**
    * dialogflow.projects.agent.knowledgeBases.create
    * @desc Creates a knowledge base.
    * @alias dialogflow.projects.agent.knowledgeBases.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Required. The project to create a knowledge base for. Format: `projects/<Project ID>`.
    * @param {().GoogleCloudDialogflowV2beta1KnowledgeBase} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$GoogleCloudDialogflowV2beta1KnowledgeBase] = js.native
  def create(callback: BodyResponseCallback[Schema$GoogleCloudDialogflowV2beta1KnowledgeBase]): Unit = js.native
  def create(params: ParamsDollarResourceDollarProjectsDollarAgentDollarKnowledgebasesDollarCreate): GaxiosPromise[Schema$GoogleCloudDialogflowV2beta1KnowledgeBase] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarKnowledgebasesDollarCreate,
    callback: BodyResponseCallback[Schema$GoogleCloudDialogflowV2beta1KnowledgeBase]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarKnowledgebasesDollarCreate,
    options: BodyResponseCallback[Schema$GoogleCloudDialogflowV2beta1KnowledgeBase],
    callback: BodyResponseCallback[Schema$GoogleCloudDialogflowV2beta1KnowledgeBase]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarKnowledgebasesDollarCreate,
    options: MethodOptions
  ): GaxiosPromise[Schema$GoogleCloudDialogflowV2beta1KnowledgeBase] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarKnowledgebasesDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleCloudDialogflowV2beta1KnowledgeBase]
  ): Unit = js.native
  /**
    * dialogflow.projects.agent.knowledgeBases.delete
    * @desc Deletes the specified knowledge base.
    * @alias dialogflow.projects.agent.knowledgeBases.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.force Optional. Force deletes the knowledge base. When set to true, any documents in the knowledge base are also deleted.
    * @param {string} params.name Required. The name of the knowledge base to delete. Format: `projects/<Project ID>/knowledgeBases/<Knowledge Base ID>`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$GoogleProtobufEmpty] = js.native
  def delete(callback: BodyResponseCallback[Schema$GoogleProtobufEmpty]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarProjectsDollarAgentDollarKnowledgebasesDollarDelete): GaxiosPromise[Schema$GoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarKnowledgebasesDollarDelete,
    callback: BodyResponseCallback[Schema$GoogleProtobufEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarKnowledgebasesDollarDelete,
    options: BodyResponseCallback[Schema$GoogleProtobufEmpty],
    callback: BodyResponseCallback[Schema$GoogleProtobufEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarKnowledgebasesDollarDelete,
    options: MethodOptions
  ): GaxiosPromise[Schema$GoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarKnowledgebasesDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleProtobufEmpty]
  ): Unit = js.native
  /**
    * dialogflow.projects.agent.knowledgeBases.get
    * @desc Retrieves the specified knowledge base.
    * @alias dialogflow.projects.agent.knowledgeBases.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The name of the knowledge base to retrieve. Format `projects/<Project ID>/knowledgeBases/<Knowledge Base ID>`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$GoogleCloudDialogflowV2beta1KnowledgeBase] = js.native
  def get(callback: BodyResponseCallback[Schema$GoogleCloudDialogflowV2beta1KnowledgeBase]): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarAgentDollarKnowledgebasesDollarGet): GaxiosPromise[Schema$GoogleCloudDialogflowV2beta1KnowledgeBase] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarKnowledgebasesDollarGet,
    callback: BodyResponseCallback[Schema$GoogleCloudDialogflowV2beta1KnowledgeBase]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarKnowledgebasesDollarGet,
    options: BodyResponseCallback[Schema$GoogleCloudDialogflowV2beta1KnowledgeBase],
    callback: BodyResponseCallback[Schema$GoogleCloudDialogflowV2beta1KnowledgeBase]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarKnowledgebasesDollarGet,
    options: MethodOptions
  ): GaxiosPromise[Schema$GoogleCloudDialogflowV2beta1KnowledgeBase] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarKnowledgebasesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleCloudDialogflowV2beta1KnowledgeBase]
  ): Unit = js.native
  /**
    * dialogflow.projects.agent.knowledgeBases.list
    * @desc Returns the list of all knowledge bases of the specified agent.
    * @alias dialogflow.projects.agent.knowledgeBases.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize Optional. The maximum number of items to return in a single page. By default 10 and at most 100.
    * @param {string=} params.pageToken Optional. The next_page_token value returned from a previous list request.
    * @param {string} params.parent Required. The project to list of knowledge bases for. Format: `projects/<Project ID>`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$GoogleCloudDialogflowV2beta1ListKnowledgeBasesResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$GoogleCloudDialogflowV2beta1ListKnowledgeBasesResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarAgentDollarKnowledgebasesDollarList): GaxiosPromise[Schema$GoogleCloudDialogflowV2beta1ListKnowledgeBasesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarKnowledgebasesDollarList,
    callback: BodyResponseCallback[Schema$GoogleCloudDialogflowV2beta1ListKnowledgeBasesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarKnowledgebasesDollarList,
    options: BodyResponseCallback[Schema$GoogleCloudDialogflowV2beta1ListKnowledgeBasesResponse],
    callback: BodyResponseCallback[Schema$GoogleCloudDialogflowV2beta1ListKnowledgeBasesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarKnowledgebasesDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$GoogleCloudDialogflowV2beta1ListKnowledgeBasesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarKnowledgebasesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleCloudDialogflowV2beta1ListKnowledgeBasesResponse]
  ): Unit = js.native
  /**
    * dialogflow.projects.agent.knowledgeBases.patch
    * @desc Updates the specified knowledge base.
    * @alias dialogflow.projects.agent.knowledgeBases.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The knowledge base resource name. The name must be empty when creating a knowledge base. Format: `projects/<Project ID>/knowledgeBases/<Knowledge Base ID>`.
    * @param {string=} params.updateMask Optional. Not specified means `update all`. Currently, only `display_name` can be updated, an InvalidArgument will be returned for attempting to update other fields.
    * @param {().GoogleCloudDialogflowV2beta1KnowledgeBase} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$GoogleCloudDialogflowV2beta1KnowledgeBase] = js.native
  def patch(callback: BodyResponseCallback[Schema$GoogleCloudDialogflowV2beta1KnowledgeBase]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarProjectsDollarAgentDollarKnowledgebasesDollarPatch): GaxiosPromise[Schema$GoogleCloudDialogflowV2beta1KnowledgeBase] = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarKnowledgebasesDollarPatch,
    callback: BodyResponseCallback[Schema$GoogleCloudDialogflowV2beta1KnowledgeBase]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarKnowledgebasesDollarPatch,
    options: BodyResponseCallback[Schema$GoogleCloudDialogflowV2beta1KnowledgeBase],
    callback: BodyResponseCallback[Schema$GoogleCloudDialogflowV2beta1KnowledgeBase]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarKnowledgebasesDollarPatch,
    options: MethodOptions
  ): GaxiosPromise[Schema$GoogleCloudDialogflowV2beta1KnowledgeBase] = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarKnowledgebasesDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleCloudDialogflowV2beta1KnowledgeBase]
  ): Unit = js.native
}

