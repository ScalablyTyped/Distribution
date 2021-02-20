package typings.dialogflow.mod.google.cloud.dialogflow.v2beta1

import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.KnowledgeBases.CreateKnowledgeBaseCallback
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.KnowledgeBases.DeleteKnowledgeBaseCallback
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.KnowledgeBases.GetKnowledgeBaseCallback
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.KnowledgeBases.ListKnowledgeBasesCallback
import typings.dialogflow.mod.google.cloud.dialogflow.v2beta1.KnowledgeBases.UpdateKnowledgeBaseCallback
import typings.dialogflow.mod.google.protobuf.Empty
import typings.protobufjs.mod.RPCImpl
import typings.protobufjs.mod.rpc.Service
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a KnowledgeBases */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.KnowledgeBases")
@js.native
class KnowledgeBases protected () extends Service {
  /**
    * Constructs a new KnowledgeBases service.
    * @param rpcImpl RPC implementation
    * @param [requestDelimited=false] Whether requests are length-delimited
    * @param [responseDelimited=false] Whether responses are length-delimited
    */
  def this(rpcImpl: RPCImpl) = this()
  def this(rpcImpl: RPCImpl, requestDelimited: Boolean) = this()
  def this(rpcImpl: RPCImpl, requestDelimited: js.UndefOr[scala.Nothing], responseDelimited: Boolean) = this()
  def this(rpcImpl: RPCImpl, requestDelimited: Boolean, responseDelimited: Boolean) = this()
  
  /**
    * Calls CreateKnowledgeBase.
    * @param request CreateKnowledgeBaseRequest message or plain object
    * @returns Promise
    */
  def createKnowledgeBase(request: ICreateKnowledgeBaseRequest): js.Promise[KnowledgeBase] = js.native
  /**
    * Calls CreateKnowledgeBase.
    * @param request CreateKnowledgeBaseRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and KnowledgeBase
    */
  def createKnowledgeBase(request: ICreateKnowledgeBaseRequest, callback: CreateKnowledgeBaseCallback): Unit = js.native
  
  /**
    * Calls DeleteKnowledgeBase.
    * @param request DeleteKnowledgeBaseRequest message or plain object
    * @returns Promise
    */
  def deleteKnowledgeBase(request: IDeleteKnowledgeBaseRequest): js.Promise[Empty] = js.native
  /**
    * Calls DeleteKnowledgeBase.
    * @param request DeleteKnowledgeBaseRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and Empty
    */
  def deleteKnowledgeBase(request: IDeleteKnowledgeBaseRequest, callback: DeleteKnowledgeBaseCallback): Unit = js.native
  
  /**
    * Calls GetKnowledgeBase.
    * @param request GetKnowledgeBaseRequest message or plain object
    * @returns Promise
    */
  def getKnowledgeBase(request: IGetKnowledgeBaseRequest): js.Promise[KnowledgeBase] = js.native
  /**
    * Calls GetKnowledgeBase.
    * @param request GetKnowledgeBaseRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and KnowledgeBase
    */
  def getKnowledgeBase(request: IGetKnowledgeBaseRequest, callback: GetKnowledgeBaseCallback): Unit = js.native
  
  /**
    * Calls ListKnowledgeBases.
    * @param request ListKnowledgeBasesRequest message or plain object
    * @returns Promise
    */
  def listKnowledgeBases(request: IListKnowledgeBasesRequest): js.Promise[ListKnowledgeBasesResponse] = js.native
  /**
    * Calls ListKnowledgeBases.
    * @param request ListKnowledgeBasesRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and ListKnowledgeBasesResponse
    */
  def listKnowledgeBases(request: IListKnowledgeBasesRequest, callback: ListKnowledgeBasesCallback): Unit = js.native
  
  /**
    * Calls UpdateKnowledgeBase.
    * @param request UpdateKnowledgeBaseRequest message or plain object
    * @returns Promise
    */
  def updateKnowledgeBase(request: IUpdateKnowledgeBaseRequest): js.Promise[KnowledgeBase] = js.native
  /**
    * Calls UpdateKnowledgeBase.
    * @param request UpdateKnowledgeBaseRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and KnowledgeBase
    */
  def updateKnowledgeBase(request: IUpdateKnowledgeBaseRequest, callback: UpdateKnowledgeBaseCallback): Unit = js.native
}
object KnowledgeBases {
  
  /**
    * Creates new KnowledgeBases service using the specified rpc implementation.
    * @param rpcImpl RPC implementation
    * @param [requestDelimited=false] Whether requests are length-delimited
    * @param [responseDelimited=false] Whether responses are length-delimited
    * @returns RPC service. Useful where requests and/or responses are streamed.
    */
  /* static member */
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.KnowledgeBases.create")
  @js.native
  def create(rpcImpl: RPCImpl): KnowledgeBases = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.KnowledgeBases.create")
  @js.native
  def create(rpcImpl: RPCImpl, requestDelimited: js.UndefOr[scala.Nothing], responseDelimited: Boolean): KnowledgeBases = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.KnowledgeBases.create")
  @js.native
  def create(rpcImpl: RPCImpl, requestDelimited: Boolean): KnowledgeBases = js.native
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.KnowledgeBases.create")
  @js.native
  def create(rpcImpl: RPCImpl, requestDelimited: Boolean, responseDelimited: Boolean): KnowledgeBases = js.native
  
  /**
    * Callback as used by {@link google.cloud.dialogflow.v2beta1.KnowledgeBases#createKnowledgeBase}.
    * @param error Error, if any
    * @param [response] KnowledgeBase
    */
  type CreateKnowledgeBaseCallback = js.Function2[/* error */ Error | Null, /* response */ js.UndefOr[KnowledgeBase], Unit]
  
  /**
    * Callback as used by {@link google.cloud.dialogflow.v2beta1.KnowledgeBases#deleteKnowledgeBase}.
    * @param error Error, if any
    * @param [response] Empty
    */
  type DeleteKnowledgeBaseCallback = js.Function2[/* error */ Error | Null, /* response */ js.UndefOr[Empty], Unit]
  
  /**
    * Callback as used by {@link google.cloud.dialogflow.v2beta1.KnowledgeBases#getKnowledgeBase}.
    * @param error Error, if any
    * @param [response] KnowledgeBase
    */
  type GetKnowledgeBaseCallback = js.Function2[/* error */ Error | Null, /* response */ js.UndefOr[KnowledgeBase], Unit]
  
  /**
    * Callback as used by {@link google.cloud.dialogflow.v2beta1.KnowledgeBases#listKnowledgeBases}.
    * @param error Error, if any
    * @param [response] ListKnowledgeBasesResponse
    */
  type ListKnowledgeBasesCallback = js.Function2[
    /* error */ Error | Null, 
    /* response */ js.UndefOr[ListKnowledgeBasesResponse], 
    Unit
  ]
  
  /**
    * Callback as used by {@link google.cloud.dialogflow.v2beta1.KnowledgeBases#updateKnowledgeBase}.
    * @param error Error, if any
    * @param [response] KnowledgeBase
    */
  type UpdateKnowledgeBaseCallback = js.Function2[/* error */ Error | Null, /* response */ js.UndefOr[KnowledgeBase], Unit]
}
