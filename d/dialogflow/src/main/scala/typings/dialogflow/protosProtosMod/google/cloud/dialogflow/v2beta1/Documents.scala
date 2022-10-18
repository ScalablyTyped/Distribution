package typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1

import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Documents.CreateDocumentCallback
import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Documents.DeleteDocumentCallback
import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Documents.GetDocumentCallback
import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Documents.ListDocumentsCallback
import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Documents.ReloadDocumentCallback
import typings.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1.Documents.UpdateDocumentCallback
import typings.dialogflow.protosProtosMod.google.longrunning.Operation
import typings.protobufjs.mod.RPCImpl
import typings.protobufjs.mod.rpc.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Documents */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Documents")
@js.native
open class Documents protected () extends Service {
  /**
    * Constructs a new Documents service.
    * @param rpcImpl RPC implementation
    * @param [requestDelimited=false] Whether requests are length-delimited
    * @param [responseDelimited=false] Whether responses are length-delimited
    */
  def this(rpcImpl: RPCImpl) = this()
  def this(rpcImpl: RPCImpl, requestDelimited: Boolean) = this()
  def this(rpcImpl: RPCImpl, requestDelimited: Boolean, responseDelimited: Boolean) = this()
  def this(rpcImpl: RPCImpl, requestDelimited: Unit, responseDelimited: Boolean) = this()
  
  /**
    * Calls CreateDocument.
    * @param request CreateDocumentRequest message or plain object
    * @returns Promise
    */
  def createDocument(request: ICreateDocumentRequest): js.Promise[Operation] = js.native
  /**
    * Calls CreateDocument.
    * @param request CreateDocumentRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and Operation
    */
  def createDocument(request: ICreateDocumentRequest, callback: CreateDocumentCallback): Unit = js.native
  
  /**
    * Calls DeleteDocument.
    * @param request DeleteDocumentRequest message or plain object
    * @returns Promise
    */
  def deleteDocument(request: IDeleteDocumentRequest): js.Promise[Operation] = js.native
  /**
    * Calls DeleteDocument.
    * @param request DeleteDocumentRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and Operation
    */
  def deleteDocument(request: IDeleteDocumentRequest, callback: DeleteDocumentCallback): Unit = js.native
  
  /**
    * Calls GetDocument.
    * @param request GetDocumentRequest message or plain object
    * @returns Promise
    */
  def getDocument(request: IGetDocumentRequest): js.Promise[Document] = js.native
  /**
    * Calls GetDocument.
    * @param request GetDocumentRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and Document
    */
  def getDocument(request: IGetDocumentRequest, callback: GetDocumentCallback): Unit = js.native
  
  /**
    * Calls ListDocuments.
    * @param request ListDocumentsRequest message or plain object
    * @returns Promise
    */
  def listDocuments(request: IListDocumentsRequest): js.Promise[ListDocumentsResponse] = js.native
  /**
    * Calls ListDocuments.
    * @param request ListDocumentsRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and ListDocumentsResponse
    */
  def listDocuments(request: IListDocumentsRequest, callback: ListDocumentsCallback): Unit = js.native
  
  /**
    * Calls ReloadDocument.
    * @param request ReloadDocumentRequest message or plain object
    * @returns Promise
    */
  def reloadDocument(request: IReloadDocumentRequest): js.Promise[Operation] = js.native
  /**
    * Calls ReloadDocument.
    * @param request ReloadDocumentRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and Operation
    */
  def reloadDocument(request: IReloadDocumentRequest, callback: ReloadDocumentCallback): Unit = js.native
  
  /**
    * Calls UpdateDocument.
    * @param request UpdateDocumentRequest message or plain object
    * @returns Promise
    */
  def updateDocument(request: IUpdateDocumentRequest): js.Promise[Operation] = js.native
  /**
    * Calls UpdateDocument.
    * @param request UpdateDocumentRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and Operation
    */
  def updateDocument(request: IUpdateDocumentRequest, callback: UpdateDocumentCallback): Unit = js.native
}
object Documents {
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Documents")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates new Documents service using the specified rpc implementation.
    * @param rpcImpl RPC implementation
    * @param [requestDelimited=false] Whether requests are length-delimited
    * @param [responseDelimited=false] Whether responses are length-delimited
    * @returns RPC service. Useful where requests and/or responses are streamed.
    */
  /* static member */
  inline def create(rpcImpl: RPCImpl): Documents = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(rpcImpl.asInstanceOf[js.Any]).asInstanceOf[Documents]
  inline def create(rpcImpl: RPCImpl, requestDelimited: Boolean): Documents = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(rpcImpl.asInstanceOf[js.Any], requestDelimited.asInstanceOf[js.Any])).asInstanceOf[Documents]
  inline def create(rpcImpl: RPCImpl, requestDelimited: Boolean, responseDelimited: Boolean): Documents = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(rpcImpl.asInstanceOf[js.Any], requestDelimited.asInstanceOf[js.Any], responseDelimited.asInstanceOf[js.Any])).asInstanceOf[Documents]
  inline def create(rpcImpl: RPCImpl, requestDelimited: Unit, responseDelimited: Boolean): Documents = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(rpcImpl.asInstanceOf[js.Any], requestDelimited.asInstanceOf[js.Any], responseDelimited.asInstanceOf[js.Any])).asInstanceOf[Documents]
  
  /**
    * Callback as used by {@link google.cloud.dialogflow.v2beta1.Documents#createDocument}.
    * @param error Error, if any
    * @param [response] Operation
    */
  type CreateDocumentCallback = js.Function2[/* error */ js.Error | Null, /* response */ js.UndefOr[Operation], Unit]
  
  /**
    * Callback as used by {@link google.cloud.dialogflow.v2beta1.Documents#deleteDocument}.
    * @param error Error, if any
    * @param [response] Operation
    */
  type DeleteDocumentCallback = js.Function2[/* error */ js.Error | Null, /* response */ js.UndefOr[Operation], Unit]
  
  /**
    * Callback as used by {@link google.cloud.dialogflow.v2beta1.Documents#getDocument}.
    * @param error Error, if any
    * @param [response] Document
    */
  type GetDocumentCallback = js.Function2[/* error */ js.Error | Null, /* response */ js.UndefOr[Document], Unit]
  
  /**
    * Callback as used by {@link google.cloud.dialogflow.v2beta1.Documents#listDocuments}.
    * @param error Error, if any
    * @param [response] ListDocumentsResponse
    */
  type ListDocumentsCallback = js.Function2[/* error */ js.Error | Null, /* response */ js.UndefOr[ListDocumentsResponse], Unit]
  
  /**
    * Callback as used by {@link google.cloud.dialogflow.v2beta1.Documents#reloadDocument}.
    * @param error Error, if any
    * @param [response] Operation
    */
  type ReloadDocumentCallback = js.Function2[/* error */ js.Error | Null, /* response */ js.UndefOr[Operation], Unit]
  
  /**
    * Callback as used by {@link google.cloud.dialogflow.v2beta1.Documents#updateDocument}.
    * @param error Error, if any
    * @param [response] Operation
    */
  type UpdateDocumentCallback = js.Function2[/* error */ js.Error | Null, /* response */ js.UndefOr[Operation], Unit]
}
