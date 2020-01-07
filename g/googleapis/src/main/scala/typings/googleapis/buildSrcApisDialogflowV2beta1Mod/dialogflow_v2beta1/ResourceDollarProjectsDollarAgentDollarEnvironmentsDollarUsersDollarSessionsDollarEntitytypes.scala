package typings.googleapis.buildSrcApisDialogflowV2beta1Mod.dialogflow_v2beta1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dialogflow/v2beta1", "dialogflow_v2beta1.Resource$Projects$Agent$Environments$Users$Sessions$Entitytypes")
@js.native
class ResourceDollarProjectsDollarAgentDollarEnvironmentsDollarUsersDollarSessionsDollarEntitytypes protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dialogflow.projects.agent.environments.users.sessions.entityTypes.create
    * @desc Creates a session entity type.  If the specified session entity
    * type already exists, overrides the session entity type.
    * @alias
    * dialogflow.projects.agent.environments.users.sessions.entityTypes.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Required. The session to create a session entity type for. Format: `projects/<Project ID>/agent/sessions/<Session ID>` or `projects/<Project ID>/agent/environments/<Environment ID>/users/<User ID>/ sessions/<Session ID>`. If `Environment ID` is not specified, we assume default 'draft' environment. If `User ID` is not specified, we assume default '-' user.
    * @param {().GoogleCloudDialogflowV2beta1SessionEntityType} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$GoogleCloudDialogflowV2beta1SessionEntityType] = js.native
  def create(callback: BodyResponseCallback[Schema$GoogleCloudDialogflowV2beta1SessionEntityType]): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarEnvironmentsDollarUsersDollarSessionsDollarEntitytypesDollarCreate
  ): GaxiosPromise[Schema$GoogleCloudDialogflowV2beta1SessionEntityType] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarEnvironmentsDollarUsersDollarSessionsDollarEntitytypesDollarCreate,
    callback: BodyResponseCallback[Schema$GoogleCloudDialogflowV2beta1SessionEntityType]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarEnvironmentsDollarUsersDollarSessionsDollarEntitytypesDollarCreate,
    options: BodyResponseCallback[Schema$GoogleCloudDialogflowV2beta1SessionEntityType],
    callback: BodyResponseCallback[Schema$GoogleCloudDialogflowV2beta1SessionEntityType]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarEnvironmentsDollarUsersDollarSessionsDollarEntitytypesDollarCreate,
    options: MethodOptions
  ): GaxiosPromise[Schema$GoogleCloudDialogflowV2beta1SessionEntityType] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarEnvironmentsDollarUsersDollarSessionsDollarEntitytypesDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleCloudDialogflowV2beta1SessionEntityType]
  ): Unit = js.native
  /**
    * dialogflow.projects.agent.environments.users.sessions.entityTypes.delete
    * @desc Deletes the specified session entity type.
    * @alias
    * dialogflow.projects.agent.environments.users.sessions.entityTypes.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The name of the entity type to delete. Format: `projects/<Project ID>/agent/sessions/<Session ID>/entityTypes/<Entity Type Display Name>` or `projects/<Project ID>/agent/environments/<Environment ID>/users/<User ID>/sessions/<Session ID>/entityTypes/<Entity Type Display Name>`. If `Environment ID` is not specified, we assume default 'draft' environment. If `User ID` is not specified, we assume default '-' user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$GoogleProtobufEmpty] = js.native
  def delete(callback: BodyResponseCallback[Schema$GoogleProtobufEmpty]): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarEnvironmentsDollarUsersDollarSessionsDollarEntitytypesDollarDelete
  ): GaxiosPromise[Schema$GoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarEnvironmentsDollarUsersDollarSessionsDollarEntitytypesDollarDelete,
    callback: BodyResponseCallback[Schema$GoogleProtobufEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarEnvironmentsDollarUsersDollarSessionsDollarEntitytypesDollarDelete,
    options: BodyResponseCallback[Schema$GoogleProtobufEmpty],
    callback: BodyResponseCallback[Schema$GoogleProtobufEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarEnvironmentsDollarUsersDollarSessionsDollarEntitytypesDollarDelete,
    options: MethodOptions
  ): GaxiosPromise[Schema$GoogleProtobufEmpty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarEnvironmentsDollarUsersDollarSessionsDollarEntitytypesDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleProtobufEmpty]
  ): Unit = js.native
  /**
    * dialogflow.projects.agent.environments.users.sessions.entityTypes.get
    * @desc Retrieves the specified session entity type.
    * @alias
    * dialogflow.projects.agent.environments.users.sessions.entityTypes.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The name of the session entity type. Format: `projects/<Project ID>/agent/sessions/<Session ID>/entityTypes/<Entity Type Display Name>` or `projects/<Project ID>/agent/environments/<Environment ID>/users/<User ID>/sessions/<Session ID>/entityTypes/<Entity Type Display Name>`. If `Environment ID` is not specified, we assume default 'draft' environment. If `User ID` is not specified, we assume default '-' user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$GoogleCloudDialogflowV2beta1SessionEntityType] = js.native
  def get(callback: BodyResponseCallback[Schema$GoogleCloudDialogflowV2beta1SessionEntityType]): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarEnvironmentsDollarUsersDollarSessionsDollarEntitytypesDollarGet
  ): GaxiosPromise[Schema$GoogleCloudDialogflowV2beta1SessionEntityType] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarEnvironmentsDollarUsersDollarSessionsDollarEntitytypesDollarGet,
    callback: BodyResponseCallback[Schema$GoogleCloudDialogflowV2beta1SessionEntityType]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarEnvironmentsDollarUsersDollarSessionsDollarEntitytypesDollarGet,
    options: BodyResponseCallback[Schema$GoogleCloudDialogflowV2beta1SessionEntityType],
    callback: BodyResponseCallback[Schema$GoogleCloudDialogflowV2beta1SessionEntityType]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarEnvironmentsDollarUsersDollarSessionsDollarEntitytypesDollarGet,
    options: MethodOptions
  ): GaxiosPromise[Schema$GoogleCloudDialogflowV2beta1SessionEntityType] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarEnvironmentsDollarUsersDollarSessionsDollarEntitytypesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleCloudDialogflowV2beta1SessionEntityType]
  ): Unit = js.native
  /**
    * dialogflow.projects.agent.environments.users.sessions.entityTypes.list
    * @desc Returns the list of all session entity types in the specified
    * session.
    * @alias
    * dialogflow.projects.agent.environments.users.sessions.entityTypes.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize Optional. The maximum number of items to return in a single page. By default 100 and at most 1000.
    * @param {string=} params.pageToken Optional. The next_page_token value returned from a previous list request.
    * @param {string} params.parent Required. The session to list all session entity types from. Format: `projects/<Project ID>/agent/sessions/<Session ID>` or `projects/<Project ID>/agent/environments/<Environment ID>/users/<User ID>/ sessions/<Session ID>`. If `Environment ID` is not specified, we assume default 'draft' environment. If `User ID` is not specified, we assume default '-' user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$GoogleCloudDialogflowV2beta1ListSessionEntityTypesResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$GoogleCloudDialogflowV2beta1ListSessionEntityTypesResponse]): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarEnvironmentsDollarUsersDollarSessionsDollarEntitytypesDollarList
  ): GaxiosPromise[Schema$GoogleCloudDialogflowV2beta1ListSessionEntityTypesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarEnvironmentsDollarUsersDollarSessionsDollarEntitytypesDollarList,
    callback: BodyResponseCallback[Schema$GoogleCloudDialogflowV2beta1ListSessionEntityTypesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarEnvironmentsDollarUsersDollarSessionsDollarEntitytypesDollarList,
    options: BodyResponseCallback[Schema$GoogleCloudDialogflowV2beta1ListSessionEntityTypesResponse],
    callback: BodyResponseCallback[Schema$GoogleCloudDialogflowV2beta1ListSessionEntityTypesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarEnvironmentsDollarUsersDollarSessionsDollarEntitytypesDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$GoogleCloudDialogflowV2beta1ListSessionEntityTypesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarEnvironmentsDollarUsersDollarSessionsDollarEntitytypesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleCloudDialogflowV2beta1ListSessionEntityTypesResponse]
  ): Unit = js.native
  /**
    * dialogflow.projects.agent.environments.users.sessions.entityTypes.patch
    * @desc Updates the specified session entity type.
    * @alias
    * dialogflow.projects.agent.environments.users.sessions.entityTypes.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The unique identifier of this session entity type. Format: `projects/<Project ID>/agent/sessions/<Session ID>/entityTypes/<Entity Type Display Name>`, or `projects/<Project ID>/agent/environments/<Environment ID>/users/<User ID>/sessions/<Session ID>/entityTypes/<Entity Type Display Name>`. If `Environment ID` is not specified, we assume default 'draft' environment. If `User ID` is not specified, we assume default '-' user.  `<Entity Type Display Name>` must be the display name of an existing entity type in the same agent that will be overridden or supplemented.
    * @param {string=} params.updateMask Optional. The mask to control which fields get updated.
    * @param {().GoogleCloudDialogflowV2beta1SessionEntityType} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$GoogleCloudDialogflowV2beta1SessionEntityType] = js.native
  def patch(callback: BodyResponseCallback[Schema$GoogleCloudDialogflowV2beta1SessionEntityType]): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarEnvironmentsDollarUsersDollarSessionsDollarEntitytypesDollarPatch
  ): GaxiosPromise[Schema$GoogleCloudDialogflowV2beta1SessionEntityType] = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarEnvironmentsDollarUsersDollarSessionsDollarEntitytypesDollarPatch,
    callback: BodyResponseCallback[Schema$GoogleCloudDialogflowV2beta1SessionEntityType]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarEnvironmentsDollarUsersDollarSessionsDollarEntitytypesDollarPatch,
    options: BodyResponseCallback[Schema$GoogleCloudDialogflowV2beta1SessionEntityType],
    callback: BodyResponseCallback[Schema$GoogleCloudDialogflowV2beta1SessionEntityType]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarEnvironmentsDollarUsersDollarSessionsDollarEntitytypesDollarPatch,
    options: MethodOptions
  ): GaxiosPromise[Schema$GoogleCloudDialogflowV2beta1SessionEntityType] = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarEnvironmentsDollarUsersDollarSessionsDollarEntitytypesDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleCloudDialogflowV2beta1SessionEntityType]
  ): Unit = js.native
}

