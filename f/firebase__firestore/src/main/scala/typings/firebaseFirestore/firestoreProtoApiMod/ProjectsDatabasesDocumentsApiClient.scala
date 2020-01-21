package typings.firebaseFirestore.firestoreProtoApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/protos/firestore_proto_api", "ProjectsDatabasesDocumentsApiClient")
@js.native
abstract class ProjectsDatabasesDocumentsApiClient protected () extends js.Object {
  def batchGet(database: String, $requestBody: BatchGetDocumentsRequest): js.Promise[BatchGetDocumentsResponse] = js.native
  def batchGet(
    database: String,
    $requestBody: BatchGetDocumentsRequest,
    __namedParams__ : ProjectsDatabasesDocumentsBatchGetNamedParameters with js.Object
  ): js.Promise[BatchGetDocumentsResponse] = js.native
  def beginTransaction(database: String, $requestBody: BeginTransactionRequest): js.Promise[BeginTransactionResponse] = js.native
  def beginTransaction(
    database: String,
    $requestBody: BeginTransactionRequest,
    __namedParams__ : ProjectsDatabasesDocumentsBeginTransactionNamedParameters with js.Object
  ): js.Promise[BeginTransactionResponse] = js.native
  def commit(database: String, $requestBody: CommitRequest): js.Promise[CommitResponse] = js.native
  def commit(
    database: String,
    $requestBody: CommitRequest,
    __namedParams__ : ProjectsDatabasesDocumentsCommitNamedParameters with js.Object
  ): js.Promise[CommitResponse] = js.native
  def createDocument(parent: String, collectionId: String, $requestBody: Document): js.Promise[Document] = js.native
  def createDocument(
    parent: String,
    collectionId: String,
    $requestBody: Document,
    __namedParams__ : ProjectsDatabasesDocumentsCreateDocumentNamedParameters with js.Object
  ): js.Promise[Document] = js.native
  def delete(name: String): js.Promise[Empty] = js.native
  def delete(name: String, __namedParams__ : ProjectsDatabasesDocumentsDeleteNamedParameters with js.Object): js.Promise[Empty] = js.native
  def get(name: String): js.Promise[Document] = js.native
  def get(name: String, __namedParams__ : ProjectsDatabasesDocumentsGetNamedParameters with js.Object): js.Promise[Document] = js.native
  def list(parent: String, collectionId: String): js.Promise[ListDocumentsResponse] = js.native
  def list(
    parent: String,
    collectionId: String,
    __namedParams__ : ProjectsDatabasesDocumentsListNamedParameters with js.Object
  ): js.Promise[ListDocumentsResponse] = js.native
  def listCollectionIds(parent: String, $requestBody: ListCollectionIdsRequest): js.Promise[ListCollectionIdsResponse] = js.native
  def listCollectionIds(
    parent: String,
    $requestBody: ListCollectionIdsRequest,
    __namedParams__ : ProjectsDatabasesDocumentsListCollectionIdsNamedParameters with js.Object
  ): js.Promise[ListCollectionIdsResponse] = js.native
  def listen(database: String, $requestBody: ListenRequest): js.Promise[ListenResponse] = js.native
  def listen(
    database: String,
    $requestBody: ListenRequest,
    __namedParams__ : ProjectsDatabasesDocumentsListenNamedParameters with js.Object
  ): js.Promise[ListenResponse] = js.native
  def patch(name: String, $requestBody: Document): js.Promise[Document] = js.native
  def patch(
    name: String,
    $requestBody: Document,
    __namedParams__ : ProjectsDatabasesDocumentsPatchNamedParameters with js.Object
  ): js.Promise[Document] = js.native
  def rollback(database: String, $requestBody: RollbackRequest): js.Promise[Empty] = js.native
  def rollback(
    database: String,
    $requestBody: RollbackRequest,
    __namedParams__ : ProjectsDatabasesDocumentsRollbackNamedParameters with js.Object
  ): js.Promise[Empty] = js.native
  def runQuery(parent: String, $requestBody: RunQueryRequest): js.Promise[RunQueryResponse] = js.native
  def runQuery(
    parent: String,
    $requestBody: RunQueryRequest,
    __namedParams__ : ProjectsDatabasesDocumentsRunQueryNamedParameters with js.Object
  ): js.Promise[RunQueryResponse] = js.native
  def write(database: String, $requestBody: WriteRequest): js.Promise[WriteResponse] = js.native
  def write(
    database: String,
    $requestBody: WriteRequest,
    __namedParams__ : ProjectsDatabasesDocumentsWriteNamedParameters with js.Object
  ): js.Promise[WriteResponse] = js.native
}

