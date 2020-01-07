package typings.googleapis.buildSrcApisDialogflowV2Mod.dialogflow_v2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dialogflow/v2", "dialogflow_v2.Resource$Projects$Agent$Entitytypes$Entities")
@js.native
class ResourceDollarProjectsDollarAgentDollarEntitytypesDollarEntities protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dialogflow.projects.agent.entityTypes.entities.batchCreate
    * @desc Creates multiple new entities in the specified entity type.
    * Operation <response: google.protobuf.Empty>
    * @alias dialogflow.projects.agent.entityTypes.entities.batchCreate
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Required. The name of the entity type to create entities in. Format: `projects/<Project ID>/agent/entityTypes/<Entity Type ID>`.
    * @param {().GoogleCloudDialogflowV2BatchCreateEntitiesRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def batchCreate(): GaxiosPromise[Schema$GoogleLongrunningOperation] = js.native
  def batchCreate(callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]): Unit = js.native
  def batchCreate(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarEntitytypesDollarEntitiesDollarBatchcreate
  ): GaxiosPromise[Schema$GoogleLongrunningOperation] = js.native
  def batchCreate(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarEntitytypesDollarEntitiesDollarBatchcreate,
    callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]
  ): Unit = js.native
  def batchCreate(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarEntitytypesDollarEntitiesDollarBatchcreate,
    options: BodyResponseCallback[Schema$GoogleLongrunningOperation],
    callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]
  ): Unit = js.native
  def batchCreate(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarEntitytypesDollarEntitiesDollarBatchcreate,
    options: MethodOptions
  ): GaxiosPromise[Schema$GoogleLongrunningOperation] = js.native
  def batchCreate(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarEntitytypesDollarEntitiesDollarBatchcreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * dialogflow.projects.agent.entityTypes.entities.batchDelete
    * @desc Deletes entities in the specified entity type.  Operation
    * <response: google.protobuf.Empty>
    * @alias dialogflow.projects.agent.entityTypes.entities.batchDelete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Required. The name of the entity type to delete entries for. Format: `projects/<Project ID>/agent/entityTypes/<Entity Type ID>`.
    * @param {().GoogleCloudDialogflowV2BatchDeleteEntitiesRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def batchDelete(): GaxiosPromise[Schema$GoogleLongrunningOperation] = js.native
  def batchDelete(callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]): Unit = js.native
  def batchDelete(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarEntitytypesDollarEntitiesDollarBatchdelete
  ): GaxiosPromise[Schema$GoogleLongrunningOperation] = js.native
  def batchDelete(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarEntitytypesDollarEntitiesDollarBatchdelete,
    callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]
  ): Unit = js.native
  def batchDelete(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarEntitytypesDollarEntitiesDollarBatchdelete,
    options: BodyResponseCallback[Schema$GoogleLongrunningOperation],
    callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]
  ): Unit = js.native
  def batchDelete(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarEntitytypesDollarEntitiesDollarBatchdelete,
    options: MethodOptions
  ): GaxiosPromise[Schema$GoogleLongrunningOperation] = js.native
  def batchDelete(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarEntitytypesDollarEntitiesDollarBatchdelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]
  ): Unit = js.native
  /**
    * dialogflow.projects.agent.entityTypes.entities.batchUpdate
    * @desc Updates or creates multiple entities in the specified entity type.
    * This method does not affect entities in the entity type that aren't
    * explicitly specified in the request.  Operation <response:
    * google.protobuf.Empty>
    * @alias dialogflow.projects.agent.entityTypes.entities.batchUpdate
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Required. The name of the entity type to update or create entities in. Format: `projects/<Project ID>/agent/entityTypes/<Entity Type ID>`.
    * @param {().GoogleCloudDialogflowV2BatchUpdateEntitiesRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def batchUpdate(): GaxiosPromise[Schema$GoogleLongrunningOperation] = js.native
  def batchUpdate(callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]): Unit = js.native
  def batchUpdate(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarEntitytypesDollarEntitiesDollarBatchupdate
  ): GaxiosPromise[Schema$GoogleLongrunningOperation] = js.native
  def batchUpdate(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarEntitytypesDollarEntitiesDollarBatchupdate,
    callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]
  ): Unit = js.native
  def batchUpdate(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarEntitytypesDollarEntitiesDollarBatchupdate,
    options: BodyResponseCallback[Schema$GoogleLongrunningOperation],
    callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]
  ): Unit = js.native
  def batchUpdate(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarEntitytypesDollarEntitiesDollarBatchupdate,
    options: MethodOptions
  ): GaxiosPromise[Schema$GoogleLongrunningOperation] = js.native
  def batchUpdate(
    params: ParamsDollarResourceDollarProjectsDollarAgentDollarEntitytypesDollarEntitiesDollarBatchupdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleLongrunningOperation]
  ): Unit = js.native
}

