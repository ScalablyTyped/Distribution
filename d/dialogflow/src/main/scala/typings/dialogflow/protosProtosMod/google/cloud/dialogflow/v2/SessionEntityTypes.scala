package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2

import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.SessionEntityTypes.CreateSessionEntityTypeCallback
import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.SessionEntityTypes.DeleteSessionEntityTypeCallback
import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.SessionEntityTypes.GetSessionEntityTypeCallback
import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.SessionEntityTypes.ListSessionEntityTypesCallback
import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2.SessionEntityTypes.UpdateSessionEntityTypeCallback
import typings.dialogflow.protosProtosMod.google.protobuf.Empty
import typings.protobufjs.protobufjsMod.RPCImpl
import typings.protobufjs.protobufjsMod.rpc.Service
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a SessionEntityTypes */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.SessionEntityTypes")
@js.native
class SessionEntityTypes protected () extends Service {
  /**
    * Constructs a new SessionEntityTypes service.
    * @param rpcImpl RPC implementation
    * @param [requestDelimited=false] Whether requests are length-delimited
    * @param [responseDelimited=false] Whether responses are length-delimited
    */
  def this(rpcImpl: RPCImpl) = this()
  def this(rpcImpl: RPCImpl, requestDelimited: Boolean) = this()
  def this(rpcImpl: RPCImpl, requestDelimited: Boolean, responseDelimited: Boolean) = this()
  /**
    * Calls CreateSessionEntityType.
    * @param request CreateSessionEntityTypeRequest message or plain object
    * @returns Promise
    */
  def createSessionEntityType(request: ICreateSessionEntityTypeRequest): js.Promise[SessionEntityType] = js.native
  /**
    * Calls CreateSessionEntityType.
    * @param request CreateSessionEntityTypeRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and SessionEntityType
    */
  def createSessionEntityType(request: ICreateSessionEntityTypeRequest, callback: CreateSessionEntityTypeCallback): Unit = js.native
  /**
    * Calls DeleteSessionEntityType.
    * @param request DeleteSessionEntityTypeRequest message or plain object
    * @returns Promise
    */
  def deleteSessionEntityType(request: IDeleteSessionEntityTypeRequest): js.Promise[Empty] = js.native
  /**
    * Calls DeleteSessionEntityType.
    * @param request DeleteSessionEntityTypeRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and Empty
    */
  def deleteSessionEntityType(request: IDeleteSessionEntityTypeRequest, callback: DeleteSessionEntityTypeCallback): Unit = js.native
  /**
    * Calls GetSessionEntityType.
    * @param request GetSessionEntityTypeRequest message or plain object
    * @returns Promise
    */
  def getSessionEntityType(request: IGetSessionEntityTypeRequest): js.Promise[SessionEntityType] = js.native
  /**
    * Calls GetSessionEntityType.
    * @param request GetSessionEntityTypeRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and SessionEntityType
    */
  def getSessionEntityType(request: IGetSessionEntityTypeRequest, callback: GetSessionEntityTypeCallback): Unit = js.native
  /**
    * Calls ListSessionEntityTypes.
    * @param request ListSessionEntityTypesRequest message or plain object
    * @returns Promise
    */
  def listSessionEntityTypes(request: IListSessionEntityTypesRequest): js.Promise[ListSessionEntityTypesResponse] = js.native
  /**
    * Calls ListSessionEntityTypes.
    * @param request ListSessionEntityTypesRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and ListSessionEntityTypesResponse
    */
  def listSessionEntityTypes(request: IListSessionEntityTypesRequest, callback: ListSessionEntityTypesCallback): Unit = js.native
  /**
    * Calls UpdateSessionEntityType.
    * @param request UpdateSessionEntityTypeRequest message or plain object
    * @returns Promise
    */
  def updateSessionEntityType(request: IUpdateSessionEntityTypeRequest): js.Promise[SessionEntityType] = js.native
  /**
    * Calls UpdateSessionEntityType.
    * @param request UpdateSessionEntityTypeRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and SessionEntityType
    */
  def updateSessionEntityType(request: IUpdateSessionEntityTypeRequest, callback: UpdateSessionEntityTypeCallback): Unit = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.SessionEntityTypes")
@js.native
object SessionEntityTypes extends js.Object {
  /**
    * Creates new SessionEntityTypes service using the specified rpc implementation.
    * @param rpcImpl RPC implementation
    * @param [requestDelimited=false] Whether requests are length-delimited
    * @param [responseDelimited=false] Whether responses are length-delimited
    * @returns RPC service. Useful where requests and/or responses are streamed.
    */
  def create(rpcImpl: RPCImpl): SessionEntityTypes = js.native
  def create(rpcImpl: RPCImpl, requestDelimited: Boolean): SessionEntityTypes = js.native
  def create(rpcImpl: RPCImpl, requestDelimited: Boolean, responseDelimited: Boolean): SessionEntityTypes = js.native
  /**
    * Callback as used by {@link google.cloud.dialogflow.v2.SessionEntityTypes#createSessionEntityType}.
    * @param error Error, if any
    * @param [response] SessionEntityType
    */
  type CreateSessionEntityTypeCallback = js.Function2[/* error */ Error | Null, /* response */ js.UndefOr[SessionEntityType], Unit]
  /**
    * Callback as used by {@link google.cloud.dialogflow.v2.SessionEntityTypes#deleteSessionEntityType}.
    * @param error Error, if any
    * @param [response] Empty
    */
  type DeleteSessionEntityTypeCallback = js.Function2[/* error */ Error | Null, /* response */ js.UndefOr[Empty], Unit]
  /**
    * Callback as used by {@link google.cloud.dialogflow.v2.SessionEntityTypes#getSessionEntityType}.
    * @param error Error, if any
    * @param [response] SessionEntityType
    */
  type GetSessionEntityTypeCallback = js.Function2[/* error */ Error | Null, /* response */ js.UndefOr[SessionEntityType], Unit]
  /**
    * Callback as used by {@link google.cloud.dialogflow.v2.SessionEntityTypes#listSessionEntityTypes}.
    * @param error Error, if any
    * @param [response] ListSessionEntityTypesResponse
    */
  type ListSessionEntityTypesCallback = js.Function2[
    /* error */ Error | Null, 
    /* response */ js.UndefOr[ListSessionEntityTypesResponse], 
    Unit
  ]
  /**
    * Callback as used by {@link google.cloud.dialogflow.v2.SessionEntityTypes#updateSessionEntityType}.
    * @param error Error, if any
    * @param [response] SessionEntityType
    */
  type UpdateSessionEntityTypeCallback = js.Function2[/* error */ Error | Null, /* response */ js.UndefOr[SessionEntityType], Unit]
}

