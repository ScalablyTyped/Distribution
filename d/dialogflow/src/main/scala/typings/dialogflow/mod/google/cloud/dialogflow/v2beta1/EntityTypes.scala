package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.EntityTypes.BatchCreateEntitiesCallback
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.EntityTypes.BatchDeleteEntitiesCallback
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.EntityTypes.BatchDeleteEntityTypesCallback
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.EntityTypes.BatchUpdateEntitiesCallback
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.EntityTypes.BatchUpdateEntityTypesCallback
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.EntityTypes.CreateEntityTypeCallback
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.EntityTypes.DeleteEntityTypeCallback
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.EntityTypes.GetEntityTypeCallback
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.EntityTypes.ListEntityTypesCallback
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.EntityTypes.UpdateEntityTypeCallback
import typings.dialogflow.mod.google.longrunning.Operation
import typings.dialogflow.mod.google.protobuf.Empty
import typings.protobufjs.mod.RPCImpl
import typings.protobufjs.mod.rpc.Service
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an EntityTypes */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.EntityTypes")
@js.native
class EntityTypes protected () extends Service {
  /**
    * Constructs a new EntityTypes service.
    * @param rpcImpl RPC implementation
    * @param [requestDelimited=false] Whether requests are length-delimited
    * @param [responseDelimited=false] Whether responses are length-delimited
    */
  def this(rpcImpl: RPCImpl) = this()
  def this(rpcImpl: RPCImpl, requestDelimited: Boolean) = this()
  def this(rpcImpl: RPCImpl, requestDelimited: Boolean, responseDelimited: Boolean) = this()
  /**
    * Calls BatchCreateEntities.
    * @param request BatchCreateEntitiesRequest message or plain object
    * @returns Promise
    */
  def batchCreateEntities(request: IBatchCreateEntitiesRequest): js.Promise[Operation] = js.native
  /**
    * Calls BatchCreateEntities.
    * @param request BatchCreateEntitiesRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and Operation
    */
  def batchCreateEntities(request: IBatchCreateEntitiesRequest, callback: BatchCreateEntitiesCallback): Unit = js.native
  /**
    * Calls BatchDeleteEntities.
    * @param request BatchDeleteEntitiesRequest message or plain object
    * @returns Promise
    */
  def batchDeleteEntities(request: IBatchDeleteEntitiesRequest): js.Promise[Operation] = js.native
  /**
    * Calls BatchDeleteEntities.
    * @param request BatchDeleteEntitiesRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and Operation
    */
  def batchDeleteEntities(request: IBatchDeleteEntitiesRequest, callback: BatchDeleteEntitiesCallback): Unit = js.native
  /**
    * Calls BatchDeleteEntityTypes.
    * @param request BatchDeleteEntityTypesRequest message or plain object
    * @returns Promise
    */
  def batchDeleteEntityTypes(request: IBatchDeleteEntityTypesRequest): js.Promise[Operation] = js.native
  /**
    * Calls BatchDeleteEntityTypes.
    * @param request BatchDeleteEntityTypesRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and Operation
    */
  def batchDeleteEntityTypes(request: IBatchDeleteEntityTypesRequest, callback: BatchDeleteEntityTypesCallback): Unit = js.native
  /**
    * Calls BatchUpdateEntities.
    * @param request BatchUpdateEntitiesRequest message or plain object
    * @returns Promise
    */
  def batchUpdateEntities(request: IBatchUpdateEntitiesRequest): js.Promise[Operation] = js.native
  /**
    * Calls BatchUpdateEntities.
    * @param request BatchUpdateEntitiesRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and Operation
    */
  def batchUpdateEntities(request: IBatchUpdateEntitiesRequest, callback: BatchUpdateEntitiesCallback): Unit = js.native
  /**
    * Calls BatchUpdateEntityTypes.
    * @param request BatchUpdateEntityTypesRequest message or plain object
    * @returns Promise
    */
  def batchUpdateEntityTypes(request: IBatchUpdateEntityTypesRequest): js.Promise[Operation] = js.native
  /**
    * Calls BatchUpdateEntityTypes.
    * @param request BatchUpdateEntityTypesRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and Operation
    */
  def batchUpdateEntityTypes(request: IBatchUpdateEntityTypesRequest, callback: BatchUpdateEntityTypesCallback): Unit = js.native
  /**
    * Calls CreateEntityType.
    * @param request CreateEntityTypeRequest message or plain object
    * @returns Promise
    */
  def createEntityType(request: ICreateEntityTypeRequest): js.Promise[EntityType] = js.native
  /**
    * Calls CreateEntityType.
    * @param request CreateEntityTypeRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and EntityType
    */
  def createEntityType(request: ICreateEntityTypeRequest, callback: CreateEntityTypeCallback): Unit = js.native
  /**
    * Calls DeleteEntityType.
    * @param request DeleteEntityTypeRequest message or plain object
    * @returns Promise
    */
  def deleteEntityType(request: IDeleteEntityTypeRequest): js.Promise[Empty] = js.native
  /**
    * Calls DeleteEntityType.
    * @param request DeleteEntityTypeRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and Empty
    */
  def deleteEntityType(request: IDeleteEntityTypeRequest, callback: DeleteEntityTypeCallback): Unit = js.native
  /**
    * Calls GetEntityType.
    * @param request GetEntityTypeRequest message or plain object
    * @returns Promise
    */
  def getEntityType(request: IGetEntityTypeRequest): js.Promise[EntityType] = js.native
  /**
    * Calls GetEntityType.
    * @param request GetEntityTypeRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and EntityType
    */
  def getEntityType(request: IGetEntityTypeRequest, callback: GetEntityTypeCallback): Unit = js.native
  /**
    * Calls ListEntityTypes.
    * @param request ListEntityTypesRequest message or plain object
    * @returns Promise
    */
  def listEntityTypes(request: IListEntityTypesRequest): js.Promise[ListEntityTypesResponse] = js.native
  /**
    * Calls ListEntityTypes.
    * @param request ListEntityTypesRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and ListEntityTypesResponse
    */
  def listEntityTypes(request: IListEntityTypesRequest, callback: ListEntityTypesCallback): Unit = js.native
  /**
    * Calls UpdateEntityType.
    * @param request UpdateEntityTypeRequest message or plain object
    * @returns Promise
    */
  def updateEntityType(request: IUpdateEntityTypeRequest): js.Promise[EntityType] = js.native
  /**
    * Calls UpdateEntityType.
    * @param request UpdateEntityTypeRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and EntityType
    */
  def updateEntityType(request: IUpdateEntityTypeRequest, callback: UpdateEntityTypeCallback): Unit = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.EntityTypes")
@js.native
object EntityTypes extends js.Object {
  /**
    * Creates new EntityTypes service using the specified rpc implementation.
    * @param rpcImpl RPC implementation
    * @param [requestDelimited=false] Whether requests are length-delimited
    * @param [responseDelimited=false] Whether responses are length-delimited
    * @returns RPC service. Useful where requests and/or responses are streamed.
    */
  def create(rpcImpl: RPCImpl): EntityTypes = js.native
  def create(rpcImpl: RPCImpl, requestDelimited: Boolean): EntityTypes = js.native
  def create(rpcImpl: RPCImpl, requestDelimited: Boolean, responseDelimited: Boolean): EntityTypes = js.native
  /**
    * Callback as used by {@link google.cloud.dialogflow.v2beta1.EntityTypes#batchCreateEntities}.
    * @param error Error, if any
    * @param [response] Operation
    */
  type BatchCreateEntitiesCallback = js.Function2[/* error */ Error | Null, /* response */ js.UndefOr[Operation], Unit]
  /**
    * Callback as used by {@link google.cloud.dialogflow.v2beta1.EntityTypes#batchDeleteEntities}.
    * @param error Error, if any
    * @param [response] Operation
    */
  type BatchDeleteEntitiesCallback = js.Function2[/* error */ Error | Null, /* response */ js.UndefOr[Operation], Unit]
  /**
    * Callback as used by {@link google.cloud.dialogflow.v2beta1.EntityTypes#batchDeleteEntityTypes}.
    * @param error Error, if any
    * @param [response] Operation
    */
  type BatchDeleteEntityTypesCallback = js.Function2[/* error */ Error | Null, /* response */ js.UndefOr[Operation], Unit]
  /**
    * Callback as used by {@link google.cloud.dialogflow.v2beta1.EntityTypes#batchUpdateEntities}.
    * @param error Error, if any
    * @param [response] Operation
    */
  type BatchUpdateEntitiesCallback = js.Function2[/* error */ Error | Null, /* response */ js.UndefOr[Operation], Unit]
  /**
    * Callback as used by {@link google.cloud.dialogflow.v2beta1.EntityTypes#batchUpdateEntityTypes}.
    * @param error Error, if any
    * @param [response] Operation
    */
  type BatchUpdateEntityTypesCallback = js.Function2[/* error */ Error | Null, /* response */ js.UndefOr[Operation], Unit]
  /**
    * Callback as used by {@link google.cloud.dialogflow.v2beta1.EntityTypes#createEntityType}.
    * @param error Error, if any
    * @param [response] EntityType
    */
  type CreateEntityTypeCallback = js.Function2[/* error */ Error | Null, /* response */ js.UndefOr[EntityType], Unit]
  /**
    * Callback as used by {@link google.cloud.dialogflow.v2beta1.EntityTypes#deleteEntityType}.
    * @param error Error, if any
    * @param [response] Empty
    */
  type DeleteEntityTypeCallback = js.Function2[/* error */ Error | Null, /* response */ js.UndefOr[Empty], Unit]
  /**
    * Callback as used by {@link google.cloud.dialogflow.v2beta1.EntityTypes#getEntityType}.
    * @param error Error, if any
    * @param [response] EntityType
    */
  type GetEntityTypeCallback = js.Function2[/* error */ Error | Null, /* response */ js.UndefOr[EntityType], Unit]
  /**
    * Callback as used by {@link google.cloud.dialogflow.v2beta1.EntityTypes#listEntityTypes}.
    * @param error Error, if any
    * @param [response] ListEntityTypesResponse
    */
  type ListEntityTypesCallback = js.Function2[/* error */ Error | Null, /* response */ js.UndefOr[ListEntityTypesResponse], Unit]
  /**
    * Callback as used by {@link google.cloud.dialogflow.v2beta1.EntityTypes#updateEntityType}.
    * @param error Error, if any
    * @param [response] EntityType
    */
  type UpdateEntityTypeCallback = js.Function2[/* error */ Error | Null, /* response */ js.UndefOr[EntityType], Unit]
}

