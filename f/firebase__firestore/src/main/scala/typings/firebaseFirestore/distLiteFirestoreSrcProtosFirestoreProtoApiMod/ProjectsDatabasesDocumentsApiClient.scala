package typings.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("@firebase/firestore/dist/lite/firestore/src/protos/firestore_proto_api", "ProjectsDatabasesDocumentsApiClient")
@js.native
/* private */ open class ProjectsDatabasesDocumentsApiClient () extends StObject {
  
  def batchGet(database: String, $requestBody: BatchGetDocumentsRequest): js.Promise[BatchGetDocumentsResponse] = js.native
  def batchGet(
    database: String,
    $requestBody: BatchGetDocumentsRequest,
    __namedParams__ : ProjectsDatabasesDocumentsBatchGetNamedParameters
  ): js.Promise[BatchGetDocumentsResponse] = js.native
  
  def beginTransaction(database: String, $requestBody: BeginTransactionRequest): js.Promise[BeginTransactionResponse] = js.native
  def beginTransaction(
    database: String,
    $requestBody: BeginTransactionRequest,
    __namedParams__ : ProjectsDatabasesDocumentsBeginTransactionNamedParameters
  ): js.Promise[BeginTransactionResponse] = js.native
  
  def commit(database: String, $requestBody: CommitRequest): js.Promise[CommitResponse] = js.native
  def commit(
    database: String,
    $requestBody: CommitRequest,
    __namedParams__ : ProjectsDatabasesDocumentsCommitNamedParameters
  ): js.Promise[CommitResponse] = js.native
  
  def createDocument(parent: String, collectionId: String, $requestBody: Document): js.Promise[Document] = js.native
  def createDocument(
    parent: String,
    collectionId: String,
    $requestBody: Document,
    __namedParams__ : ProjectsDatabasesDocumentsCreateDocumentNamedParameters
  ): js.Promise[Document] = js.native
  
  def delete(name: String): js.Promise[Empty] = js.native
  def delete(name: String, __namedParams__ : ProjectsDatabasesDocumentsDeleteNamedParameters): js.Promise[Empty] = js.native
  
  def get(name: String): js.Promise[Document] = js.native
  def get(name: String, __namedParams__ : ProjectsDatabasesDocumentsGetNamedParameters): js.Promise[Document] = js.native
  
  def list(parent: String, collectionId: String): js.Promise[ListDocumentsResponse] = js.native
  def list(
    parent: String,
    collectionId: String,
    __namedParams__ : ProjectsDatabasesDocumentsListNamedParameters
  ): js.Promise[ListDocumentsResponse] = js.native
  
  def listCollectionIds(parent: String, $requestBody: ListCollectionIdsRequest): js.Promise[ListCollectionIdsResponse] = js.native
  def listCollectionIds(
    parent: String,
    $requestBody: ListCollectionIdsRequest,
    __namedParams__ : ProjectsDatabasesDocumentsListCollectionIdsNamedParameters
  ): js.Promise[ListCollectionIdsResponse] = js.native
  
  def listen(database: String, $requestBody: ListenRequest): js.Promise[ListenResponse] = js.native
  def listen(
    database: String,
    $requestBody: ListenRequest,
    __namedParams__ : ProjectsDatabasesDocumentsListenNamedParameters
  ): js.Promise[ListenResponse] = js.native
  
  def patch(name: String, $requestBody: Document): js.Promise[Document] = js.native
  def patch(
    name: String,
    $requestBody: Document,
    __namedParams__ : ProjectsDatabasesDocumentsPatchNamedParameters
  ): js.Promise[Document] = js.native
  
  def rollback(database: String, $requestBody: RollbackRequest): js.Promise[Empty] = js.native
  def rollback(
    database: String,
    $requestBody: RollbackRequest,
    __namedParams__ : ProjectsDatabasesDocumentsRollbackNamedParameters
  ): js.Promise[Empty] = js.native
  
  def runQuery(parent: String, $requestBody: RunQueryRequest): js.Promise[RunQueryResponse] = js.native
  def runQuery(
    parent: String,
    $requestBody: RunQueryRequest,
    __namedParams__ : ProjectsDatabasesDocumentsRunQueryNamedParameters
  ): js.Promise[RunQueryResponse] = js.native
  
  def write(database: String, $requestBody: WriteRequest): js.Promise[WriteResponse] = js.native
  def write(
    database: String,
    $requestBody: WriteRequest,
    __namedParams__ : ProjectsDatabasesDocumentsWriteNamedParameters
  ): js.Promise[WriteResponse] = js.native
}
