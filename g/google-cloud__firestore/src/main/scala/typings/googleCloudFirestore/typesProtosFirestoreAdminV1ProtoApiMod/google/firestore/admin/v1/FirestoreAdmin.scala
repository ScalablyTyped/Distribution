package typings.googleCloudFirestore.typesProtosFirestoreAdminV1ProtoApiMod.google.firestore.admin.v1

import typings.googleCloudFirestore.typesProtosFirestoreAdminV1ProtoApiMod.google.firestore.admin.v1.FirestoreAdmin.CreateIndexCallback
import typings.googleCloudFirestore.typesProtosFirestoreAdminV1ProtoApiMod.google.firestore.admin.v1.FirestoreAdmin.DeleteIndexCallback
import typings.googleCloudFirestore.typesProtosFirestoreAdminV1ProtoApiMod.google.firestore.admin.v1.FirestoreAdmin.ExportDocumentsCallback
import typings.googleCloudFirestore.typesProtosFirestoreAdminV1ProtoApiMod.google.firestore.admin.v1.FirestoreAdmin.GetDatabaseCallback
import typings.googleCloudFirestore.typesProtosFirestoreAdminV1ProtoApiMod.google.firestore.admin.v1.FirestoreAdmin.GetFieldCallback
import typings.googleCloudFirestore.typesProtosFirestoreAdminV1ProtoApiMod.google.firestore.admin.v1.FirestoreAdmin.GetIndexCallback
import typings.googleCloudFirestore.typesProtosFirestoreAdminV1ProtoApiMod.google.firestore.admin.v1.FirestoreAdmin.ImportDocumentsCallback
import typings.googleCloudFirestore.typesProtosFirestoreAdminV1ProtoApiMod.google.firestore.admin.v1.FirestoreAdmin.ListDatabasesCallback
import typings.googleCloudFirestore.typesProtosFirestoreAdminV1ProtoApiMod.google.firestore.admin.v1.FirestoreAdmin.ListFieldsCallback
import typings.googleCloudFirestore.typesProtosFirestoreAdminV1ProtoApiMod.google.firestore.admin.v1.FirestoreAdmin.ListIndexesCallback
import typings.googleCloudFirestore.typesProtosFirestoreAdminV1ProtoApiMod.google.firestore.admin.v1.FirestoreAdmin.UpdateDatabaseCallback
import typings.googleCloudFirestore.typesProtosFirestoreAdminV1ProtoApiMod.google.firestore.admin.v1.FirestoreAdmin.UpdateFieldCallback
import typings.googleCloudFirestore.typesProtosFirestoreAdminV1ProtoApiMod.google.longrunning.Operation
import typings.googleCloudFirestore.typesProtosFirestoreAdminV1ProtoApiMod.google.protobuf.Empty
import typings.protobufjs.mod.RPCImpl
import typings.protobufjs.mod.rpc.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a FirestoreAdmin */
@JSImport("@google-cloud/firestore/types/protos/firestore_admin_v1_proto_api", "google.firestore.admin.v1.FirestoreAdmin")
@js.native
open class FirestoreAdmin protected () extends Service {
  /**
    * Constructs a new FirestoreAdmin service.
    * @param rpcImpl RPC implementation
    * @param [requestDelimited=false] Whether requests are length-delimited
    * @param [responseDelimited=false] Whether responses are length-delimited
    */
  def this(rpcImpl: RPCImpl) = this()
  def this(rpcImpl: RPCImpl, requestDelimited: Boolean) = this()
  def this(rpcImpl: RPCImpl, requestDelimited: Boolean, responseDelimited: Boolean) = this()
  def this(rpcImpl: RPCImpl, requestDelimited: Unit, responseDelimited: Boolean) = this()
  
  /**
    * Calls CreateIndex.
    * @param request CreateIndexRequest message or plain object
    * @returns Promise
    */
  def createIndex(request: ICreateIndexRequest): js.Promise[Operation] = js.native
  /**
    * Calls CreateIndex.
    * @param request CreateIndexRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and Operation
    */
  def createIndex(request: ICreateIndexRequest, callback: CreateIndexCallback): Unit = js.native
  
  /**
    * Calls DeleteIndex.
    * @param request DeleteIndexRequest message or plain object
    * @returns Promise
    */
  def deleteIndex(request: IDeleteIndexRequest): js.Promise[Empty] = js.native
  /**
    * Calls DeleteIndex.
    * @param request DeleteIndexRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and Empty
    */
  def deleteIndex(request: IDeleteIndexRequest, callback: DeleteIndexCallback): Unit = js.native
  
  /**
    * Calls ExportDocuments.
    * @param request ExportDocumentsRequest message or plain object
    * @returns Promise
    */
  def exportDocuments(request: IExportDocumentsRequest): js.Promise[Operation] = js.native
  /**
    * Calls ExportDocuments.
    * @param request ExportDocumentsRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and Operation
    */
  def exportDocuments(request: IExportDocumentsRequest, callback: ExportDocumentsCallback): Unit = js.native
  
  /**
    * Calls GetDatabase.
    * @param request GetDatabaseRequest message or plain object
    * @returns Promise
    */
  def getDatabase(request: IGetDatabaseRequest): js.Promise[Database] = js.native
  /**
    * Calls GetDatabase.
    * @param request GetDatabaseRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and Database
    */
  def getDatabase(request: IGetDatabaseRequest, callback: GetDatabaseCallback): Unit = js.native
  
  /**
    * Calls GetField.
    * @param request GetFieldRequest message or plain object
    * @returns Promise
    */
  def getField(request: IGetFieldRequest): js.Promise[Field] = js.native
  /**
    * Calls GetField.
    * @param request GetFieldRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and Field
    */
  def getField(request: IGetFieldRequest, callback: GetFieldCallback): Unit = js.native
  
  /**
    * Calls GetIndex.
    * @param request GetIndexRequest message or plain object
    * @returns Promise
    */
  def getIndex(request: IGetIndexRequest): js.Promise[Index] = js.native
  /**
    * Calls GetIndex.
    * @param request GetIndexRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and Index
    */
  def getIndex(request: IGetIndexRequest, callback: GetIndexCallback): Unit = js.native
  
  /**
    * Calls ImportDocuments.
    * @param request ImportDocumentsRequest message or plain object
    * @returns Promise
    */
  def importDocuments(request: IImportDocumentsRequest): js.Promise[Operation] = js.native
  /**
    * Calls ImportDocuments.
    * @param request ImportDocumentsRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and Operation
    */
  def importDocuments(request: IImportDocumentsRequest, callback: ImportDocumentsCallback): Unit = js.native
  
  /**
    * Calls ListDatabases.
    * @param request ListDatabasesRequest message or plain object
    * @returns Promise
    */
  def listDatabases(request: IListDatabasesRequest): js.Promise[ListDatabasesResponse] = js.native
  /**
    * Calls ListDatabases.
    * @param request ListDatabasesRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and ListDatabasesResponse
    */
  def listDatabases(request: IListDatabasesRequest, callback: ListDatabasesCallback): Unit = js.native
  
  /**
    * Calls ListFields.
    * @param request ListFieldsRequest message or plain object
    * @returns Promise
    */
  def listFields(request: IListFieldsRequest): js.Promise[ListFieldsResponse] = js.native
  /**
    * Calls ListFields.
    * @param request ListFieldsRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and ListFieldsResponse
    */
  def listFields(request: IListFieldsRequest, callback: ListFieldsCallback): Unit = js.native
  
  /**
    * Calls ListIndexes.
    * @param request ListIndexesRequest message or plain object
    * @returns Promise
    */
  def listIndexes(request: IListIndexesRequest): js.Promise[ListIndexesResponse] = js.native
  /**
    * Calls ListIndexes.
    * @param request ListIndexesRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and ListIndexesResponse
    */
  def listIndexes(request: IListIndexesRequest, callback: ListIndexesCallback): Unit = js.native
  
  /**
    * Calls UpdateDatabase.
    * @param request UpdateDatabaseRequest message or plain object
    * @returns Promise
    */
  def updateDatabase(request: IUpdateDatabaseRequest): js.Promise[Operation] = js.native
  /**
    * Calls UpdateDatabase.
    * @param request UpdateDatabaseRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and Operation
    */
  def updateDatabase(request: IUpdateDatabaseRequest, callback: UpdateDatabaseCallback): Unit = js.native
  
  /**
    * Calls UpdateField.
    * @param request UpdateFieldRequest message or plain object
    * @returns Promise
    */
  def updateField(request: IUpdateFieldRequest): js.Promise[Operation] = js.native
  /**
    * Calls UpdateField.
    * @param request UpdateFieldRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and Operation
    */
  def updateField(request: IUpdateFieldRequest, callback: UpdateFieldCallback): Unit = js.native
}
object FirestoreAdmin {
  
  /**
    * Callback as used by {@link google.firestore.admin.v1.FirestoreAdmin#createIndex}.
    * @param error Error, if any
    * @param [response] Operation
    */
  type CreateIndexCallback = js.Function2[/* error */ js.Error | Null, /* response */ js.UndefOr[Operation], Unit]
  
  /**
    * Callback as used by {@link google.firestore.admin.v1.FirestoreAdmin#deleteIndex}.
    * @param error Error, if any
    * @param [response] Empty
    */
  type DeleteIndexCallback = js.Function2[/* error */ js.Error | Null, /* response */ js.UndefOr[Empty], Unit]
  
  /**
    * Callback as used by {@link google.firestore.admin.v1.FirestoreAdmin#exportDocuments}.
    * @param error Error, if any
    * @param [response] Operation
    */
  type ExportDocumentsCallback = js.Function2[/* error */ js.Error | Null, /* response */ js.UndefOr[Operation], Unit]
  
  /**
    * Callback as used by {@link google.firestore.admin.v1.FirestoreAdmin#getDatabase}.
    * @param error Error, if any
    * @param [response] Database
    */
  type GetDatabaseCallback = js.Function2[/* error */ js.Error | Null, /* response */ js.UndefOr[Database], Unit]
  
  /**
    * Callback as used by {@link google.firestore.admin.v1.FirestoreAdmin#getField}.
    * @param error Error, if any
    * @param [response] Field
    */
  type GetFieldCallback = js.Function2[/* error */ js.Error | Null, /* response */ js.UndefOr[Field], Unit]
  
  /**
    * Callback as used by {@link google.firestore.admin.v1.FirestoreAdmin#getIndex}.
    * @param error Error, if any
    * @param [response] Index
    */
  type GetIndexCallback = js.Function2[/* error */ js.Error | Null, /* response */ js.UndefOr[Index], Unit]
  
  /**
    * Callback as used by {@link google.firestore.admin.v1.FirestoreAdmin#importDocuments}.
    * @param error Error, if any
    * @param [response] Operation
    */
  type ImportDocumentsCallback = js.Function2[/* error */ js.Error | Null, /* response */ js.UndefOr[Operation], Unit]
  
  /**
    * Callback as used by {@link google.firestore.admin.v1.FirestoreAdmin#listDatabases}.
    * @param error Error, if any
    * @param [response] ListDatabasesResponse
    */
  type ListDatabasesCallback = js.Function2[/* error */ js.Error | Null, /* response */ js.UndefOr[ListDatabasesResponse], Unit]
  
  /**
    * Callback as used by {@link google.firestore.admin.v1.FirestoreAdmin#listFields}.
    * @param error Error, if any
    * @param [response] ListFieldsResponse
    */
  type ListFieldsCallback = js.Function2[/* error */ js.Error | Null, /* response */ js.UndefOr[ListFieldsResponse], Unit]
  
  /**
    * Callback as used by {@link google.firestore.admin.v1.FirestoreAdmin#listIndexes}.
    * @param error Error, if any
    * @param [response] ListIndexesResponse
    */
  type ListIndexesCallback = js.Function2[/* error */ js.Error | Null, /* response */ js.UndefOr[ListIndexesResponse], Unit]
  
  /**
    * Callback as used by {@link google.firestore.admin.v1.FirestoreAdmin#updateDatabase}.
    * @param error Error, if any
    * @param [response] Operation
    */
  type UpdateDatabaseCallback = js.Function2[/* error */ js.Error | Null, /* response */ js.UndefOr[Operation], Unit]
  
  /**
    * Callback as used by {@link google.firestore.admin.v1.FirestoreAdmin#updateField}.
    * @param error Error, if any
    * @param [response] Operation
    */
  type UpdateFieldCallback = js.Function2[/* error */ js.Error | Null, /* response */ js.UndefOr[Operation], Unit]
}
