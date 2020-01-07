package typings.googleapis.buildSrcApisDialogflowV2beta1Mod.dialogflow_v2beta1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dialogflow/v2beta1", "dialogflow_v2beta1.Resource$Projects$Agent$Environments$Users$Sessions")
@js.native
class ResourceDollarProjectsDollarAgentDollarEnvironmentsDollarUsersDollarSessions protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var contexts: ResourceDollarProjectsDollarAgentDollarEnvironmentsDollarUsersDollarSessionsDollarContexts = js.native
  var entityTypes: ResourceDollarProjectsDollarAgentDollarEnvironmentsDollarUsersDollarSessionsDollarEntitytypes = js.native
  /**
    * dialogflow.projects.agent.environments.users.sessions.deleteContexts
    * @desc Deletes all active contexts in the specified session.
    * @alias
    * dialogflow.projects.agent.environments.users.sessions.deleteContexts
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Required. The name of the session to delete all contexts from. Format: `projects/<Project ID>/agent/sessions/<Session ID>` or `projects/<Project ID>/agent/environments/<Environment ID>/users/<User ID>/sessions/<Session ID>`. If `Environment ID` is not specified we assume default 'draft' environment. If `User ID` is not specified, we assume default '-' user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def deleteContexts(): GaxiosPromise[Schema$GoogleProtobufEmpty] = js.native
  def deleteContexts(callback: BodyResponseCallback[Schema$GoogleProtobufEmpty]): Unit = js.native
  def deleteContexts(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarEnvironmentsDollarUsersDollarSessionsDollarDeletecontexts
  ): GaxiosPromise[Schema$GoogleProtobufEmpty] = js.native
  def deleteContexts(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarEnvironmentsDollarUsersDollarSessionsDollarDeletecontexts,
    callback: BodyResponseCallback[Schema$GoogleProtobufEmpty]
  ): Unit = js.native
  def deleteContexts(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarEnvironmentsDollarUsersDollarSessionsDollarDeletecontexts,
    options: BodyResponseCallback[Schema$GoogleProtobufEmpty],
    callback: BodyResponseCallback[Schema$GoogleProtobufEmpty]
  ): Unit = js.native
  def deleteContexts(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarEnvironmentsDollarUsersDollarSessionsDollarDeletecontexts,
    options: MethodOptions
  ): GaxiosPromise[Schema$GoogleProtobufEmpty] = js.native
  def deleteContexts(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarEnvironmentsDollarUsersDollarSessionsDollarDeletecontexts,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleProtobufEmpty]
  ): Unit = js.native
  /**
    * dialogflow.projects.agent.environments.users.sessions.detectIntent
    * @desc Processes a natural language query and returns structured,
    * actionable data as a result. This method is not idempotent, because it
    * may cause contexts and session entity types to be updated, which in turn
    * might affect results of future queries.
    * @alias dialogflow.projects.agent.environments.users.sessions.detectIntent
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.session Required. The name of the session this query is sent to. Format: `projects/<Project ID>/agent/sessions/<Session ID>`, or `projects/<Project ID>/agent/environments/<Environment ID>/users/<User ID>/sessions/<Session ID>`. If `Environment ID` is not specified, we assume default 'draft' environment. If `User ID` is not specified, we are using "-". It’s up to the API caller to choose an appropriate `Session ID` and `User Id`. They can be a random numbers or some type of user and session identifiers (preferably hashed). The length of the `Session ID` and `User ID` must not exceed 36 characters.
    * @param {().GoogleCloudDialogflowV2beta1DetectIntentRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def detectIntent(): GaxiosPromise[Schema$GoogleCloudDialogflowV2beta1DetectIntentResponse] = js.native
  def detectIntent(callback: BodyResponseCallback[Schema$GoogleCloudDialogflowV2beta1DetectIntentResponse]): Unit = js.native
  def detectIntent(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarEnvironmentsDollarUsersDollarSessionsDollarDetectintent
  ): GaxiosPromise[Schema$GoogleCloudDialogflowV2beta1DetectIntentResponse] = js.native
  def detectIntent(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarEnvironmentsDollarUsersDollarSessionsDollarDetectintent,
    callback: BodyResponseCallback[Schema$GoogleCloudDialogflowV2beta1DetectIntentResponse]
  ): Unit = js.native
  def detectIntent(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarEnvironmentsDollarUsersDollarSessionsDollarDetectintent,
    options: BodyResponseCallback[Schema$GoogleCloudDialogflowV2beta1DetectIntentResponse],
    callback: BodyResponseCallback[Schema$GoogleCloudDialogflowV2beta1DetectIntentResponse]
  ): Unit = js.native
  def detectIntent(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarEnvironmentsDollarUsersDollarSessionsDollarDetectintent,
    options: MethodOptions
  ): GaxiosPromise[Schema$GoogleCloudDialogflowV2beta1DetectIntentResponse] = js.native
  def detectIntent(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarEnvironmentsDollarUsersDollarSessionsDollarDetectintent,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleCloudDialogflowV2beta1DetectIntentResponse]
  ): Unit = js.native
}

