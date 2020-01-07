package typings.googleapis.buildSrcApisDialogflowV2Mod.dialogflow_v2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dialogflow/v2", "dialogflow_v2.Resource$Projects$Agent$Sessions$Entitytypes")
@js.native
class ResourceDollarProjectsDollarAgentDollarSessionsDollarEntitytypes protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dialogflow.projects.agent.sessions.entityTypes.create
    * @desc Creates a session entity type.  If the specified session entity
    * type already exists, overrides the session entity type.
    * @alias dialogflow.projects.agent.sessions.entityTypes.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Required. The session to create a session entity type for. Format: `projects/<Project ID>/agent/sessions/<Session ID>`.
    * @param {().GoogleCloudDialogflowV2SessionEntityType} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$GoogleCloudDialogflowV2SessionEntityType] = js.native
  def create(callback: BodyResponseCallback[Schema$GoogleCloudDialogflowV2SessionEntityType]): Unit = js.native
  def create(params: ParamsDollarResourceDollarProjectsDollarAgentDollarSessionsDollarEntitytypesDollarCreate): GaxiosPromise[Schema$GoogleCloudDialogflowV2SessionEntityType] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarSessionsDollarEntitytypesDollarCreate,
    callback: BodyResponseCallback[Schema$GoogleCloudDialogflowV2SessionEntityType]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarSessionsDollarEntitytypesDollarCreate,
    options: BodyResponseCallback[Schema$GoogleCloudDialogflowV2SessionEntityType],
    callback: BodyResponseCallback[Schema$GoogleCloudDialogflowV2SessionEntityType]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarSessionsDollarEntitytypesDollarCreate,
    options: MethodOptions
  ): GaxiosPromise[Schema$GoogleCloudDialogflowV2SessionEntityType] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarSessionsDollarEntitytypesDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleCloudDialogflowV2SessionEntityType]
  ): Unit = js.native
  /**
    * dialogflow.projects.agent.sessions.entityTypes.delete
    * @desc Deletes the specified session entity type.
    * @alias dialogflow.projects.agent.sessions.entityTypes.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The name of the entity type to delete. Format: `projects/<Project ID>/agent/sessions/<Session ID>/entityTypes/<Entity Type Display Name>`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$GoogleProtobufEmpty] = js.native
  def delete(callback: BodyResponseCallback[Schema$GoogleProtobufEmpty]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarProjectsDollarAgentDollarSessionsDollarEntitytypesDollarDelete): GaxiosPromise[Schema$GoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarSessionsDollarEntitytypesDollarDelete,
    callback: BodyResponseCallback[Schema$GoogleProtobufEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarSessionsDollarEntitytypesDollarDelete,
    options: BodyResponseCallback[Schema$GoogleProtobufEmpty],
    callback: BodyResponseCallback[Schema$GoogleProtobufEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarSessionsDollarEntitytypesDollarDelete,
    options: MethodOptions
  ): GaxiosPromise[Schema$GoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarSessionsDollarEntitytypesDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleProtobufEmpty]
  ): Unit = js.native
  /**
    * dialogflow.projects.agent.sessions.entityTypes.get
    * @desc Retrieves the specified session entity type.
    * @alias dialogflow.projects.agent.sessions.entityTypes.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The name of the session entity type. Format: `projects/<Project ID>/agent/sessions/<Session ID>/entityTypes/<Entity Type Display Name>`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$GoogleCloudDialogflowV2SessionEntityType] = js.native
  def get(callback: BodyResponseCallback[Schema$GoogleCloudDialogflowV2SessionEntityType]): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarAgentDollarSessionsDollarEntitytypesDollarGet): GaxiosPromise[Schema$GoogleCloudDialogflowV2SessionEntityType] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarSessionsDollarEntitytypesDollarGet,
    callback: BodyResponseCallback[Schema$GoogleCloudDialogflowV2SessionEntityType]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarSessionsDollarEntitytypesDollarGet,
    options: BodyResponseCallback[Schema$GoogleCloudDialogflowV2SessionEntityType],
    callback: BodyResponseCallback[Schema$GoogleCloudDialogflowV2SessionEntityType]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarSessionsDollarEntitytypesDollarGet,
    options: MethodOptions
  ): GaxiosPromise[Schema$GoogleCloudDialogflowV2SessionEntityType] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarSessionsDollarEntitytypesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleCloudDialogflowV2SessionEntityType]
  ): Unit = js.native
  /**
    * dialogflow.projects.agent.sessions.entityTypes.list
    * @desc Returns the list of all session entity types in the specified
    * session.
    * @alias dialogflow.projects.agent.sessions.entityTypes.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize Optional. The maximum number of items to return in a single page. By default 100 and at most 1000.
    * @param {string=} params.pageToken Optional. The next_page_token value returned from a previous list request.
    * @param {string} params.parent Required. The session to list all session entity types from. Format: `projects/<Project ID>/agent/sessions/<Session ID>`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$GoogleCloudDialogflowV2ListSessionEntityTypesResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$GoogleCloudDialogflowV2ListSessionEntityTypesResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarAgentDollarSessionsDollarEntitytypesDollarList): GaxiosPromise[Schema$GoogleCloudDialogflowV2ListSessionEntityTypesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarSessionsDollarEntitytypesDollarList,
    callback: BodyResponseCallback[Schema$GoogleCloudDialogflowV2ListSessionEntityTypesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarSessionsDollarEntitytypesDollarList,
    options: BodyResponseCallback[Schema$GoogleCloudDialogflowV2ListSessionEntityTypesResponse],
    callback: BodyResponseCallback[Schema$GoogleCloudDialogflowV2ListSessionEntityTypesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarSessionsDollarEntitytypesDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$GoogleCloudDialogflowV2ListSessionEntityTypesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarSessionsDollarEntitytypesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleCloudDialogflowV2ListSessionEntityTypesResponse]
  ): Unit = js.native
  /**
    * dialogflow.projects.agent.sessions.entityTypes.patch
    * @desc Updates the specified session entity type.
    * @alias dialogflow.projects.agent.sessions.entityTypes.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The unique identifier of this session entity type. Format: `projects/<Project ID>/agent/sessions/<Session ID>/entityTypes/<Entity Type Display Name>`.  `<Entity Type Display Name>` must be the display name of an existing entity type in the same agent that will be overridden or supplemented.
    * @param {string=} params.updateMask Optional. The mask to control which fields get updated.
    * @param {().GoogleCloudDialogflowV2SessionEntityType} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$GoogleCloudDialogflowV2SessionEntityType] = js.native
  def patch(callback: BodyResponseCallback[Schema$GoogleCloudDialogflowV2SessionEntityType]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarProjectsDollarAgentDollarSessionsDollarEntitytypesDollarPatch): GaxiosPromise[Schema$GoogleCloudDialogflowV2SessionEntityType] = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarSessionsDollarEntitytypesDollarPatch,
    callback: BodyResponseCallback[Schema$GoogleCloudDialogflowV2SessionEntityType]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarSessionsDollarEntitytypesDollarPatch,
    options: BodyResponseCallback[Schema$GoogleCloudDialogflowV2SessionEntityType],
    callback: BodyResponseCallback[Schema$GoogleCloudDialogflowV2SessionEntityType]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarSessionsDollarEntitytypesDollarPatch,
    options: MethodOptions
  ): GaxiosPromise[Schema$GoogleCloudDialogflowV2SessionEntityType] = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarSessionsDollarEntitytypesDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleCloudDialogflowV2SessionEntityType]
  ): Unit = js.native
}

