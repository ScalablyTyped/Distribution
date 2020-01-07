package typings.googleapis.buildSrcApisDialogflowV2beta1Mod.dialogflow_v2beta1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dialogflow/v2beta1", "dialogflow_v2beta1.Resource$Projects$Agent$Entitytypes")
@js.native
class ResourceDollarProjectsDollarAgentDollarEntitytypes protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var entities: ResourceDollarProjectsDollarAgentDollarEntitytypesDollarEntities = js.native
  /**
    * dialogflow.projects.agent.entityTypes.batchDelete
    * @desc Deletes entity types in the specified agent.  Operation <response:
    * google.protobuf.Empty>
    * @alias dialogflow.projects.agent.entityTypes.batchDelete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Required. The name of the agent to delete all entities types for. Format: `projects/<Project ID>/agent`.
    * @param {().GoogleCloudDialogflowV2beta1BatchDeleteEntityTypesRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def batchDelete(): GaxiosPromise[Schema$GoogleLongrunningOperation] = js.native
  def batchDelete(callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]): Unit = js.native
  def batchDelete(params: ParamsDollarResourceDollarProjectsDollarAgentDollarEntitytypesDollarBatchdelete): GaxiosPromise[Schema$GoogleLongrunningOperation] = js.native
  def batchDelete(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarEntitytypesDollarBatchdelete,
    callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]
  ): Unit = js.native
  def batchDelete(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarEntitytypesDollarBatchdelete,
    options: BodyResponseCallback[Schema$GoogleLongrunningOperation],
    callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]
  ): Unit = js.native
  def batchDelete(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarEntitytypesDollarBatchdelete,
    options: MethodOptions
  ): GaxiosPromise[Schema$GoogleLongrunningOperation] = js.native
  def batchDelete(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarEntitytypesDollarBatchdelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * dialogflow.projects.agent.entityTypes.batchUpdate
    * @desc Updates/Creates multiple entity types in the specified agent.
    * Operation <response: BatchUpdateEntityTypesResponse>
    * @alias dialogflow.projects.agent.entityTypes.batchUpdate
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Required. The name of the agent to update or create entity types in. Format: `projects/<Project ID>/agent`.
    * @param {().GoogleCloudDialogflowV2beta1BatchUpdateEntityTypesRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def batchUpdate(): GaxiosPromise[Schema$GoogleLongrunningOperation] = js.native
  def batchUpdate(callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]): Unit = js.native
  def batchUpdate(params: ParamsDollarResourceDollarProjectsDollarAgentDollarEntitytypesDollarBatchupdate): GaxiosPromise[Schema$GoogleLongrunningOperation] = js.native
  def batchUpdate(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarEntitytypesDollarBatchupdate,
    callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]
  ): Unit = js.native
  def batchUpdate(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarEntitytypesDollarBatchupdate,
    options: BodyResponseCallback[Schema$GoogleLongrunningOperation],
    callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]
  ): Unit = js.native
  def batchUpdate(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarEntitytypesDollarBatchupdate,
    options: MethodOptions
  ): GaxiosPromise[Schema$GoogleLongrunningOperation] = js.native
  def batchUpdate(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarEntitytypesDollarBatchupdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * dialogflow.projects.agent.entityTypes.create
    * @desc Creates an entity type in the specified agent.
    * @alias dialogflow.projects.agent.entityTypes.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.languageCode Optional. The language of entity synonyms defined in `entity_type`. If not specified, the agent's default language is used. [Many languages](https://cloud.google.com/dialogflow-enterprise/docs/reference/language) are supported. Note: languages must be enabled in the agent before they can be used.
    * @param {string} params.parent Required. The agent to create a entity type for. Format: `projects/<Project ID>/agent`.
    * @param {().GoogleCloudDialogflowV2beta1EntityType} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$GoogleCloudDialogflowV2beta1EntityType] = js.native
  def create(callback: BodyResponseCallback[Schema$GoogleCloudDialogflowV2beta1EntityType]): Unit = js.native
  def create(params: ParamsDollarResourceDollarProjectsDollarAgentDollarEntitytypesDollarCreate): GaxiosPromise[Schema$GoogleCloudDialogflowV2beta1EntityType] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarEntitytypesDollarCreate,
    callback: BodyResponseCallback[Schema$GoogleCloudDialogflowV2beta1EntityType]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarEntitytypesDollarCreate,
    options: BodyResponseCallback[Schema$GoogleCloudDialogflowV2beta1EntityType],
    callback: BodyResponseCallback[Schema$GoogleCloudDialogflowV2beta1EntityType]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarEntitytypesDollarCreate,
    options: MethodOptions
  ): GaxiosPromise[Schema$GoogleCloudDialogflowV2beta1EntityType] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarEntitytypesDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleCloudDialogflowV2beta1EntityType]
  ): Unit = js.native
  /**
    * dialogflow.projects.agent.entityTypes.delete
    * @desc Deletes the specified entity type.
    * @alias dialogflow.projects.agent.entityTypes.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The name of the entity type to delete. Format: `projects/<Project ID>/agent/entityTypes/<EntityType ID>`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$GoogleProtobufEmpty] = js.native
  def delete(callback: BodyResponseCallback[Schema$GoogleProtobufEmpty]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarProjectsDollarAgentDollarEntitytypesDollarDelete): GaxiosPromise[Schema$GoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarEntitytypesDollarDelete,
    callback: BodyResponseCallback[Schema$GoogleProtobufEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarEntitytypesDollarDelete,
    options: BodyResponseCallback[Schema$GoogleProtobufEmpty],
    callback: BodyResponseCallback[Schema$GoogleProtobufEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarEntitytypesDollarDelete,
    options: MethodOptions
  ): GaxiosPromise[Schema$GoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarEntitytypesDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleProtobufEmpty]
  ): Unit = js.native
  /**
    * dialogflow.projects.agent.entityTypes.get
    * @desc Retrieves the specified entity type.
    * @alias dialogflow.projects.agent.entityTypes.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.languageCode Optional. The language to retrieve entity synonyms for. If not specified, the agent's default language is used. [Many languages](https://cloud.google.com/dialogflow-enterprise/docs/reference/language) are supported. Note: languages must be enabled in the agent before they can be used.
    * @param {string} params.name Required. The name of the entity type. Format: `projects/<Project ID>/agent/entityTypes/<EntityType ID>`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$GoogleCloudDialogflowV2beta1EntityType] = js.native
  def get(callback: BodyResponseCallback[Schema$GoogleCloudDialogflowV2beta1EntityType]): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarAgentDollarEntitytypesDollarGet): GaxiosPromise[Schema$GoogleCloudDialogflowV2beta1EntityType] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarEntitytypesDollarGet,
    callback: BodyResponseCallback[Schema$GoogleCloudDialogflowV2beta1EntityType]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarEntitytypesDollarGet,
    options: BodyResponseCallback[Schema$GoogleCloudDialogflowV2beta1EntityType],
    callback: BodyResponseCallback[Schema$GoogleCloudDialogflowV2beta1EntityType]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarEntitytypesDollarGet,
    options: MethodOptions
  ): GaxiosPromise[Schema$GoogleCloudDialogflowV2beta1EntityType] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarEntitytypesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleCloudDialogflowV2beta1EntityType]
  ): Unit = js.native
  /**
    * dialogflow.projects.agent.entityTypes.list
    * @desc Returns the list of all entity types in the specified agent.
    * @alias dialogflow.projects.agent.entityTypes.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.languageCode Optional. The language to list entity synonyms for. If not specified, the agent's default language is used. [Many languages](https://cloud.google.com/dialogflow-enterprise/docs/reference/language) are supported. Note: languages must be enabled in the agent before they can be used.
    * @param {integer=} params.pageSize Optional. The maximum number of items to return in a single page. By default 100 and at most 1000.
    * @param {string=} params.pageToken Optional. The next_page_token value returned from a previous list request.
    * @param {string} params.parent Required. The agent to list all entity types from. Format: `projects/<Project ID>/agent`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$GoogleCloudDialogflowV2beta1ListEntityTypesResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$GoogleCloudDialogflowV2beta1ListEntityTypesResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarAgentDollarEntitytypesDollarList): GaxiosPromise[Schema$GoogleCloudDialogflowV2beta1ListEntityTypesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarEntitytypesDollarList,
    callback: BodyResponseCallback[Schema$GoogleCloudDialogflowV2beta1ListEntityTypesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarEntitytypesDollarList,
    options: BodyResponseCallback[Schema$GoogleCloudDialogflowV2beta1ListEntityTypesResponse],
    callback: BodyResponseCallback[Schema$GoogleCloudDialogflowV2beta1ListEntityTypesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarEntitytypesDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$GoogleCloudDialogflowV2beta1ListEntityTypesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarEntitytypesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleCloudDialogflowV2beta1ListEntityTypesResponse]
  ): Unit = js.native
  /**
    * dialogflow.projects.agent.entityTypes.patch
    * @desc Updates the specified entity type.
    * @alias dialogflow.projects.agent.entityTypes.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.languageCode Optional. The language of entity synonyms defined in `entity_type`. If not specified, the agent's default language is used. [Many languages](https://cloud.google.com/dialogflow-enterprise/docs/reference/language) are supported. Note: languages must be enabled in the agent before they can be used.
    * @param {string} params.name The unique identifier of the entity type. Required for EntityTypes.UpdateEntityType and EntityTypes.BatchUpdateEntityTypes methods. Format: `projects/<Project ID>/agent/entityTypes/<Entity Type ID>`.
    * @param {string=} params.updateMask Optional. The mask to control which fields get updated.
    * @param {().GoogleCloudDialogflowV2beta1EntityType} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$GoogleCloudDialogflowV2beta1EntityType] = js.native
  def patch(callback: BodyResponseCallback[Schema$GoogleCloudDialogflowV2beta1EntityType]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarProjectsDollarAgentDollarEntitytypesDollarPatch): GaxiosPromise[Schema$GoogleCloudDialogflowV2beta1EntityType] = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarEntitytypesDollarPatch,
    callback: BodyResponseCallback[Schema$GoogleCloudDialogflowV2beta1EntityType]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarEntitytypesDollarPatch,
    options: BodyResponseCallback[Schema$GoogleCloudDialogflowV2beta1EntityType],
    callback: BodyResponseCallback[Schema$GoogleCloudDialogflowV2beta1EntityType]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarEntitytypesDollarPatch,
    options: MethodOptions
  ): GaxiosPromise[Schema$GoogleCloudDialogflowV2beta1EntityType] = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarEntitytypesDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleCloudDialogflowV2beta1EntityType]
  ): Unit = js.native
}

