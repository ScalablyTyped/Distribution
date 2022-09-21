package typings.firebaseFirestore.srcProtosFirestoreProtoApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore/dist/lite/packages/firestore/src/protos/firestore_proto_api", "ProjectsDatabasesDocumentsApiClient")
@js.native
/* private */ abstract class ProjectsDatabasesDocumentsApiClient () extends StObject {
  
  def batchGet(database: String, $requestBody: BatchGetDocumentsRequest): js.Promise[BatchGetDocumentsResponse] = js.native
  def batchGet(
    database: String,
    $requestBody: BatchGetDocumentsRequest,
    __namedParams__ : ProjectsDatabasesDocumentsBatchGetNamedParameters & js.Object
  ): js.Promise[BatchGetDocumentsResponse] = js.native
  
  def beginTransaction(database: String, $requestBody: BeginTransactionRequest): js.Promise[BeginTransactionResponse] = js.native
  def beginTransaction(
    database: String,
    $requestBody: BeginTransactionRequest,
    __namedParams__ : ProjectsDatabasesDocumentsBeginTransactionNamedParameters & js.Object
  ): js.Promise[BeginTransactionResponse] = js.native
  
  def commit(database: String, $requestBody: CommitRequest): js.Promise[CommitResponse] = js.native
  def commit(
    database: String,
    $requestBody: CommitRequest,
    __namedParams__ : ProjectsDatabasesDocumentsCommitNamedParameters & js.Object
  ): js.Promise[CommitResponse] = js.native
  
  def createDocument(parent: String, collectionId: String, $requestBody: Document): js.Promise[Document] = js.native
  def createDocument(
    parent: String,
    collectionId: String,
    $requestBody: Document,
    __namedParams__ : ProjectsDatabasesDocumentsCreateDocumentNamedParameters & js.Object
  ): js.Promise[Document] = js.native
  
  def delete(name: String): js.Promise[Empty] = js.native
  def delete(name: String, __namedParams__ : ProjectsDatabasesDocumentsDeleteNamedParameters & js.Object): js.Promise[Empty] = js.native
  
  def get(name: String): js.Promise[Document] = js.native
  def get(name: String, __namedParams__ : ProjectsDatabasesDocumentsGetNamedParameters & js.Object): js.Promise[Document] = js.native
  
  def list(parent: String, collectionId: String): js.Promise[ListDocumentsResponse] = js.native
  def list(
    parent: String,
    collectionId: String,
    __namedParams__ : ProjectsDatabasesDocumentsListNamedParameters & js.Object
  ): js.Promise[ListDocumentsResponse] = js.native
  
  def listCollectionIds(parent: String, $requestBody: ListCollectionIdsRequest): js.Promise[ListCollectionIdsResponse] = js.native
  def listCollectionIds(
    parent: String,
    $requestBody: ListCollectionIdsRequest,
    __namedParams__ : ProjectsDatabasesDocumentsListCollectionIdsNamedParameters & js.Object
  ): js.Promise[ListCollectionIdsResponse] = js.native
  
  def listen(database: String, $requestBody: ListenRequest): js.Promise[ListenResponse] = js.native
  def listen(
    database: String,
    $requestBody: ListenRequest,
    __namedParams__ : ProjectsDatabasesDocumentsListenNamedParameters & js.Object
  ): js.Promise[ListenResponse] = js.native
  
  def patch(name: String, $requestBody: Document): js.Promise[Document] = js.native
  def patch(
    name: String,
    $requestBody: Document,
    __namedParams__ : ProjectsDatabasesDocumentsPatchNamedParameters & js.Object
  ): js.Promise[Document] = js.native
  
  def rollback(database: String, $requestBody: RollbackRequest): js.Promise[Empty] = js.native
  def rollback(
    database: String,
    $requestBody: RollbackRequest,
    __namedParams__ : ProjectsDatabasesDocumentsRollbackNamedParameters & js.Object
  ): js.Promise[Empty] = js.native
  
  def runQuery(parent: String, $requestBody: RunQueryRequest): js.Promise[RunQueryResponse] = js.native
  def runQuery(
    parent: String,
    $requestBody: RunQueryRequest,
    __namedParams__ : ProjectsDatabasesDocumentsRunQueryNamedParameters & js.Object
  ): js.Promise[RunQueryResponse] = js.native
  
  def write(database: String, $requestBody: WriteRequest): js.Promise[WriteResponse] = js.native
  def write(
    database: String,
    $requestBody: WriteRequest,
    __namedParams__ : ProjectsDatabasesDocumentsWriteNamedParameters & js.Object
  ): js.Promise[WriteResponse] = js.native
}
