package typings.googleCloudFirestore.firestoreV1beta1ProtoApiMod.google.firestore.v1beta1

import typings.googleCloudFirestore.firestoreV1beta1ProtoApiMod.google.firestore.v1beta1.Firestore.BatchGetDocumentsCallback
import typings.googleCloudFirestore.firestoreV1beta1ProtoApiMod.google.firestore.v1beta1.Firestore.BatchWriteCallback
import typings.googleCloudFirestore.firestoreV1beta1ProtoApiMod.google.firestore.v1beta1.Firestore.BeginTransactionCallback
import typings.googleCloudFirestore.firestoreV1beta1ProtoApiMod.google.firestore.v1beta1.Firestore.CommitCallback
import typings.googleCloudFirestore.firestoreV1beta1ProtoApiMod.google.firestore.v1beta1.Firestore.CreateDocumentCallback
import typings.googleCloudFirestore.firestoreV1beta1ProtoApiMod.google.firestore.v1beta1.Firestore.DeleteDocumentCallback
import typings.googleCloudFirestore.firestoreV1beta1ProtoApiMod.google.firestore.v1beta1.Firestore.GetDocumentCallback
import typings.googleCloudFirestore.firestoreV1beta1ProtoApiMod.google.firestore.v1beta1.Firestore.ListCollectionIdsCallback
import typings.googleCloudFirestore.firestoreV1beta1ProtoApiMod.google.firestore.v1beta1.Firestore.ListDocumentsCallback
import typings.googleCloudFirestore.firestoreV1beta1ProtoApiMod.google.firestore.v1beta1.Firestore.ListenCallback
import typings.googleCloudFirestore.firestoreV1beta1ProtoApiMod.google.firestore.v1beta1.Firestore.PartitionQueryCallback
import typings.googleCloudFirestore.firestoreV1beta1ProtoApiMod.google.firestore.v1beta1.Firestore.RollbackCallback
import typings.googleCloudFirestore.firestoreV1beta1ProtoApiMod.google.firestore.v1beta1.Firestore.RunQueryCallback
import typings.googleCloudFirestore.firestoreV1beta1ProtoApiMod.google.firestore.v1beta1.Firestore.UpdateDocumentCallback
import typings.googleCloudFirestore.firestoreV1beta1ProtoApiMod.google.firestore.v1beta1.Firestore.WriteCallback
import typings.googleCloudFirestore.firestoreV1beta1ProtoApiMod.google.protobuf.Empty
import typings.protobufjs.mod.RPCImpl
import typings.protobufjs.mod.rpc.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Firestore */
@JSImport("@google-cloud/firestore/types/protos/firestore_v1beta1_proto_api", "google.firestore.v1beta1.Firestore")
@js.native
open class Firestore protected () extends Service {
  /**
    * Constructs a new Firestore service.
    * @param rpcImpl RPC implementation
    * @param [requestDelimited=false] Whether requests are length-delimited
    * @param [responseDelimited=false] Whether responses are length-delimited
    */
  def this(rpcImpl: RPCImpl) = this()
  def this(rpcImpl: RPCImpl, requestDelimited: Boolean) = this()
  def this(rpcImpl: RPCImpl, requestDelimited: Boolean, responseDelimited: Boolean) = this()
  def this(rpcImpl: RPCImpl, requestDelimited: Unit, responseDelimited: Boolean) = this()
  
  /**
    * Calls BatchGetDocuments.
    * @param request BatchGetDocumentsRequest message or plain object
    * @returns Promise
    */
  def batchGetDocuments(request: IBatchGetDocumentsRequest): js.Promise[BatchGetDocumentsResponse] = js.native
  /**
    * Calls BatchGetDocuments.
    * @param request BatchGetDocumentsRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and BatchGetDocumentsResponse
    */
  def batchGetDocuments(request: IBatchGetDocumentsRequest, callback: BatchGetDocumentsCallback): Unit = js.native
  
  /**
    * Calls BatchWrite.
    * @param request BatchWriteRequest message or plain object
    * @returns Promise
    */
  def batchWrite(request: IBatchWriteRequest): js.Promise[BatchWriteResponse] = js.native
  /**
    * Calls BatchWrite.
    * @param request BatchWriteRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and BatchWriteResponse
    */
  def batchWrite(request: IBatchWriteRequest, callback: BatchWriteCallback): Unit = js.native
  
  /**
    * Calls BeginTransaction.
    * @param request BeginTransactionRequest message or plain object
    * @returns Promise
    */
  def beginTransaction(request: IBeginTransactionRequest): js.Promise[BeginTransactionResponse] = js.native
  /**
    * Calls BeginTransaction.
    * @param request BeginTransactionRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and BeginTransactionResponse
    */
  def beginTransaction(request: IBeginTransactionRequest, callback: BeginTransactionCallback): Unit = js.native
  
  /**
    * Calls Commit.
    * @param request CommitRequest message or plain object
    * @returns Promise
    */
  def commit(request: ICommitRequest): js.Promise[CommitResponse] = js.native
  /**
    * Calls Commit.
    * @param request CommitRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and CommitResponse
    */
  def commit(request: ICommitRequest, callback: CommitCallback): Unit = js.native
  
  /**
    * Calls CreateDocument.
    * @param request CreateDocumentRequest message or plain object
    * @returns Promise
    */
  def createDocument(request: ICreateDocumentRequest): js.Promise[Document] = js.native
  /**
    * Calls CreateDocument.
    * @param request CreateDocumentRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and Document
    */
  def createDocument(request: ICreateDocumentRequest, callback: CreateDocumentCallback): Unit = js.native
  
  /**
    * Calls DeleteDocument.
    * @param request DeleteDocumentRequest message or plain object
    * @returns Promise
    */
  def deleteDocument(request: IDeleteDocumentRequest): js.Promise[Empty] = js.native
  /**
    * Calls DeleteDocument.
    * @param request DeleteDocumentRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and Empty
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
    * Calls ListCollectionIds.
    * @param request ListCollectionIdsRequest message or plain object
    * @returns Promise
    */
  def listCollectionIds(request: IListCollectionIdsRequest): js.Promise[ListCollectionIdsResponse] = js.native
  /**
    * Calls ListCollectionIds.
    * @param request ListCollectionIdsRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and ListCollectionIdsResponse
    */
  def listCollectionIds(request: IListCollectionIdsRequest, callback: ListCollectionIdsCallback): Unit = js.native
  
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
    * Calls Listen.
    * @param request ListenRequest message or plain object
    * @returns Promise
    */
  def listen(request: IListenRequest): js.Promise[ListenResponse] = js.native
  /**
    * Calls Listen.
    * @param request ListenRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and ListenResponse
    */
  def listen(request: IListenRequest, callback: ListenCallback): Unit = js.native
  
  /**
    * Calls PartitionQuery.
    * @param request PartitionQueryRequest message or plain object
    * @returns Promise
    */
  def partitionQuery(request: IPartitionQueryRequest): js.Promise[PartitionQueryResponse] = js.native
  /**
    * Calls PartitionQuery.
    * @param request PartitionQueryRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and PartitionQueryResponse
    */
  def partitionQuery(request: IPartitionQueryRequest, callback: PartitionQueryCallback): Unit = js.native
  
  /**
    * Calls Rollback.
    * @param request RollbackRequest message or plain object
    * @returns Promise
    */
  def rollback(request: IRollbackRequest): js.Promise[Empty] = js.native
  /**
    * Calls Rollback.
    * @param request RollbackRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and Empty
    */
  def rollback(request: IRollbackRequest, callback: RollbackCallback): Unit = js.native
  
  /**
    * Calls RunQuery.
    * @param request RunQueryRequest message or plain object
    * @returns Promise
    */
  def runQuery(request: IRunQueryRequest): js.Promise[RunQueryResponse] = js.native
  /**
    * Calls RunQuery.
    * @param request RunQueryRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and RunQueryResponse
    */
  def runQuery(request: IRunQueryRequest, callback: RunQueryCallback): Unit = js.native
  
  /**
    * Calls UpdateDocument.
    * @param request UpdateDocumentRequest message or plain object
    * @returns Promise
    */
  def updateDocument(request: IUpdateDocumentRequest): js.Promise[Document] = js.native
  /**
    * Calls UpdateDocument.
    * @param request UpdateDocumentRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and Document
    */
  def updateDocument(request: IUpdateDocumentRequest, callback: UpdateDocumentCallback): Unit = js.native
  
  /**
    * Calls Write.
    * @param request WriteRequest message or plain object
    * @returns Promise
    */
  def write(request: IWriteRequest): js.Promise[WriteResponse] = js.native
  /**
    * Calls Write.
    * @param request WriteRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and WriteResponse
    */
  def write(request: IWriteRequest, callback: WriteCallback): Unit = js.native
}
object Firestore {
  
  /**
    * Callback as used by {@link google.firestore.v1beta1.Firestore#batchGetDocuments}.
    * @param error Error, if any
    * @param [response] BatchGetDocumentsResponse
    */
  type BatchGetDocumentsCallback = js.Function2[
    /* error */ js.Error | Null, 
    /* response */ js.UndefOr[BatchGetDocumentsResponse], 
    Unit
  ]
  
  /**
    * Callback as used by {@link google.firestore.v1beta1.Firestore#batchWrite}.
    * @param error Error, if any
    * @param [response] BatchWriteResponse
    */
  type BatchWriteCallback = js.Function2[/* error */ js.Error | Null, /* response */ js.UndefOr[BatchWriteResponse], Unit]
  
  /**
    * Callback as used by {@link google.firestore.v1beta1.Firestore#beginTransaction}.
    * @param error Error, if any
    * @param [response] BeginTransactionResponse
    */
  type BeginTransactionCallback = js.Function2[
    /* error */ js.Error | Null, 
    /* response */ js.UndefOr[BeginTransactionResponse], 
    Unit
  ]
  
  /**
    * Callback as used by {@link google.firestore.v1beta1.Firestore#commit}.
    * @param error Error, if any
    * @param [response] CommitResponse
    */
  type CommitCallback = js.Function2[/* error */ js.Error | Null, /* response */ js.UndefOr[CommitResponse], Unit]
  
  /**
    * Callback as used by {@link google.firestore.v1beta1.Firestore#createDocument}.
    * @param error Error, if any
    * @param [response] Document
    */
  type CreateDocumentCallback = js.Function2[/* error */ js.Error | Null, /* response */ js.UndefOr[Document], Unit]
  
  /**
    * Callback as used by {@link google.firestore.v1beta1.Firestore#deleteDocument}.
    * @param error Error, if any
    * @param [response] Empty
    */
  type DeleteDocumentCallback = js.Function2[/* error */ js.Error | Null, /* response */ js.UndefOr[Empty], Unit]
  
  /**
    * Callback as used by {@link google.firestore.v1beta1.Firestore#getDocument}.
    * @param error Error, if any
    * @param [response] Document
    */
  type GetDocumentCallback = js.Function2[/* error */ js.Error | Null, /* response */ js.UndefOr[Document], Unit]
  
  /**
    * Callback as used by {@link google.firestore.v1beta1.Firestore#listCollectionIds}.
    * @param error Error, if any
    * @param [response] ListCollectionIdsResponse
    */
  type ListCollectionIdsCallback = js.Function2[
    /* error */ js.Error | Null, 
    /* response */ js.UndefOr[ListCollectionIdsResponse], 
    Unit
  ]
  
  /**
    * Callback as used by {@link google.firestore.v1beta1.Firestore#listDocuments}.
    * @param error Error, if any
    * @param [response] ListDocumentsResponse
    */
  type ListDocumentsCallback = js.Function2[/* error */ js.Error | Null, /* response */ js.UndefOr[ListDocumentsResponse], Unit]
  
  /**
    * Callback as used by {@link google.firestore.v1beta1.Firestore#listen}.
    * @param error Error, if any
    * @param [response] ListenResponse
    */
  type ListenCallback = js.Function2[/* error */ js.Error | Null, /* response */ js.UndefOr[ListenResponse], Unit]
  
  /**
    * Callback as used by {@link google.firestore.v1beta1.Firestore#partitionQuery}.
    * @param error Error, if any
    * @param [response] PartitionQueryResponse
    */
  type PartitionQueryCallback = js.Function2[/* error */ js.Error | Null, /* response */ js.UndefOr[PartitionQueryResponse], Unit]
  
  /**
    * Callback as used by {@link google.firestore.v1beta1.Firestore#rollback}.
    * @param error Error, if any
    * @param [response] Empty
    */
  type RollbackCallback = js.Function2[/* error */ js.Error | Null, /* response */ js.UndefOr[Empty], Unit]
  
  /**
    * Callback as used by {@link google.firestore.v1beta1.Firestore#runQuery}.
    * @param error Error, if any
    * @param [response] RunQueryResponse
    */
  type RunQueryCallback = js.Function2[/* error */ js.Error | Null, /* response */ js.UndefOr[RunQueryResponse], Unit]
  
  /**
    * Callback as used by {@link google.firestore.v1beta1.Firestore#updateDocument}.
    * @param error Error, if any
    * @param [response] Document
    */
  type UpdateDocumentCallback = js.Function2[/* error */ js.Error | Null, /* response */ js.UndefOr[Document], Unit]
  
  /**
    * Callback as used by {@link google.firestore.v1beta1.Firestore#write}.
    * @param error Error, if any
    * @param [response] WriteResponse
    */
  type WriteCallback = js.Function2[/* error */ js.Error | Null, /* response */ js.UndefOr[WriteResponse], Unit]
}
