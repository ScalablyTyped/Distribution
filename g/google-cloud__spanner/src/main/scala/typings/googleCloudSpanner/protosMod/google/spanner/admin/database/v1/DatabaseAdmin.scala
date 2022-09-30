package typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1

import typings.googleCloudSpanner.protosMod.google.iam.v1.IGetIamPolicyRequest
import typings.googleCloudSpanner.protosMod.google.iam.v1.ISetIamPolicyRequest
import typings.googleCloudSpanner.protosMod.google.iam.v1.ITestIamPermissionsRequest
import typings.googleCloudSpanner.protosMod.google.iam.v1.Policy
import typings.googleCloudSpanner.protosMod.google.iam.v1.TestIamPermissionsResponse
import typings.googleCloudSpanner.protosMod.google.longrunning.Operation
import typings.googleCloudSpanner.protosMod.google.protobuf.Empty
import typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.DatabaseAdmin.CopyBackupCallback
import typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.DatabaseAdmin.CreateBackupCallback
import typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.DatabaseAdmin.CreateDatabaseCallback
import typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.DatabaseAdmin.DeleteBackupCallback
import typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.DatabaseAdmin.DropDatabaseCallback
import typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.DatabaseAdmin.GetBackupCallback
import typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.DatabaseAdmin.GetDatabaseCallback
import typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.DatabaseAdmin.GetDatabaseDdlCallback
import typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.DatabaseAdmin.GetIamPolicyCallback
import typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.DatabaseAdmin.ListBackupOperationsCallback
import typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.DatabaseAdmin.ListBackupsCallback
import typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.DatabaseAdmin.ListDatabaseOperationsCallback
import typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.DatabaseAdmin.ListDatabaseRolesCallback
import typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.DatabaseAdmin.ListDatabasesCallback
import typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.DatabaseAdmin.RestoreDatabaseCallback
import typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.DatabaseAdmin.SetIamPolicyCallback
import typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.DatabaseAdmin.TestIamPermissionsCallback
import typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.DatabaseAdmin.UpdateBackupCallback
import typings.googleCloudSpanner.protosMod.google.spanner.admin.database.v1.DatabaseAdmin.UpdateDatabaseDdlCallback
import typings.googleGax.mod.protobuf.rpc.Service
import typings.protobufjs.mod.RPCImpl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a DatabaseAdmin */
@JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.admin.database.v1.DatabaseAdmin")
@js.native
open class DatabaseAdmin protected () extends Service {
  /**
    * Constructs a new DatabaseAdmin service.
    * @param rpcImpl RPC implementation
    * @param [requestDelimited=false] Whether requests are length-delimited
    * @param [responseDelimited=false] Whether responses are length-delimited
    */
  def this(rpcImpl: RPCImpl) = this()
  def this(rpcImpl: RPCImpl, requestDelimited: Boolean) = this()
  def this(rpcImpl: RPCImpl, requestDelimited: Boolean, responseDelimited: Boolean) = this()
  def this(rpcImpl: RPCImpl, requestDelimited: Unit, responseDelimited: Boolean) = this()
  
  /**
    * Calls CopyBackup.
    * @param request CopyBackupRequest message or plain object
    * @returns Promise
    */
  def copyBackup(request: ICopyBackupRequest): js.Promise[Operation] = js.native
  /**
    * Calls CopyBackup.
    * @param request CopyBackupRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and Operation
    */
  def copyBackup(request: ICopyBackupRequest, callback: CopyBackupCallback): Unit = js.native
  
  /**
    * Calls CreateBackup.
    * @param request CreateBackupRequest message or plain object
    * @returns Promise
    */
  def createBackup(request: ICreateBackupRequest): js.Promise[Operation] = js.native
  /**
    * Calls CreateBackup.
    * @param request CreateBackupRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and Operation
    */
  def createBackup(request: ICreateBackupRequest, callback: CreateBackupCallback): Unit = js.native
  
  /**
    * Calls CreateDatabase.
    * @param request CreateDatabaseRequest message or plain object
    * @returns Promise
    */
  def createDatabase(request: ICreateDatabaseRequest): js.Promise[Operation] = js.native
  /**
    * Calls CreateDatabase.
    * @param request CreateDatabaseRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and Operation
    */
  def createDatabase(request: ICreateDatabaseRequest, callback: CreateDatabaseCallback): Unit = js.native
  
  /**
    * Calls DeleteBackup.
    * @param request DeleteBackupRequest message or plain object
    * @returns Promise
    */
  def deleteBackup(request: IDeleteBackupRequest): js.Promise[Empty] = js.native
  /**
    * Calls DeleteBackup.
    * @param request DeleteBackupRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and Empty
    */
  def deleteBackup(request: IDeleteBackupRequest, callback: DeleteBackupCallback): Unit = js.native
  
  /**
    * Calls DropDatabase.
    * @param request DropDatabaseRequest message or plain object
    * @returns Promise
    */
  def dropDatabase(request: IDropDatabaseRequest): js.Promise[Empty] = js.native
  /**
    * Calls DropDatabase.
    * @param request DropDatabaseRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and Empty
    */
  def dropDatabase(request: IDropDatabaseRequest, callback: DropDatabaseCallback): Unit = js.native
  
  /**
    * Calls GetBackup.
    * @param request GetBackupRequest message or plain object
    * @returns Promise
    */
  def getBackup(request: IGetBackupRequest): js.Promise[Backup] = js.native
  /**
    * Calls GetBackup.
    * @param request GetBackupRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and Backup
    */
  def getBackup(request: IGetBackupRequest, callback: GetBackupCallback): Unit = js.native
  
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
    * Calls GetDatabaseDdl.
    * @param request GetDatabaseDdlRequest message or plain object
    * @returns Promise
    */
  def getDatabaseDdl(request: IGetDatabaseDdlRequest): js.Promise[GetDatabaseDdlResponse] = js.native
  /**
    * Calls GetDatabaseDdl.
    * @param request GetDatabaseDdlRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and GetDatabaseDdlResponse
    */
  def getDatabaseDdl(request: IGetDatabaseDdlRequest, callback: GetDatabaseDdlCallback): Unit = js.native
  
  /**
    * Calls GetIamPolicy.
    * @param request GetIamPolicyRequest message or plain object
    * @returns Promise
    */
  def getIamPolicy(request: IGetIamPolicyRequest): js.Promise[Policy] = js.native
  /**
    * Calls GetIamPolicy.
    * @param request GetIamPolicyRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and Policy
    */
  def getIamPolicy(request: IGetIamPolicyRequest, callback: GetIamPolicyCallback): Unit = js.native
  
  /**
    * Calls ListBackupOperations.
    * @param request ListBackupOperationsRequest message or plain object
    * @returns Promise
    */
  def listBackupOperations(request: IListBackupOperationsRequest): js.Promise[ListBackupOperationsResponse] = js.native
  /**
    * Calls ListBackupOperations.
    * @param request ListBackupOperationsRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and ListBackupOperationsResponse
    */
  def listBackupOperations(request: IListBackupOperationsRequest, callback: ListBackupOperationsCallback): Unit = js.native
  
  /**
    * Calls ListBackups.
    * @param request ListBackupsRequest message or plain object
    * @returns Promise
    */
  def listBackups(request: IListBackupsRequest): js.Promise[ListBackupsResponse] = js.native
  /**
    * Calls ListBackups.
    * @param request ListBackupsRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and ListBackupsResponse
    */
  def listBackups(request: IListBackupsRequest, callback: ListBackupsCallback): Unit = js.native
  
  /**
    * Calls ListDatabaseOperations.
    * @param request ListDatabaseOperationsRequest message or plain object
    * @returns Promise
    */
  def listDatabaseOperations(request: IListDatabaseOperationsRequest): js.Promise[ListDatabaseOperationsResponse] = js.native
  /**
    * Calls ListDatabaseOperations.
    * @param request ListDatabaseOperationsRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and ListDatabaseOperationsResponse
    */
  def listDatabaseOperations(request: IListDatabaseOperationsRequest, callback: ListDatabaseOperationsCallback): Unit = js.native
  
  /**
    * Calls ListDatabaseRoles.
    * @param request ListDatabaseRolesRequest message or plain object
    * @returns Promise
    */
  def listDatabaseRoles(request: IListDatabaseRolesRequest): js.Promise[ListDatabaseRolesResponse] = js.native
  /**
    * Calls ListDatabaseRoles.
    * @param request ListDatabaseRolesRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and ListDatabaseRolesResponse
    */
  def listDatabaseRoles(request: IListDatabaseRolesRequest, callback: ListDatabaseRolesCallback): Unit = js.native
  
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
    * Calls RestoreDatabase.
    * @param request RestoreDatabaseRequest message or plain object
    * @returns Promise
    */
  def restoreDatabase(request: IRestoreDatabaseRequest): js.Promise[Operation] = js.native
  /**
    * Calls RestoreDatabase.
    * @param request RestoreDatabaseRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and Operation
    */
  def restoreDatabase(request: IRestoreDatabaseRequest, callback: RestoreDatabaseCallback): Unit = js.native
  
  /**
    * Calls SetIamPolicy.
    * @param request SetIamPolicyRequest message or plain object
    * @returns Promise
    */
  def setIamPolicy(request: ISetIamPolicyRequest): js.Promise[Policy] = js.native
  /**
    * Calls SetIamPolicy.
    * @param request SetIamPolicyRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and Policy
    */
  def setIamPolicy(request: ISetIamPolicyRequest, callback: SetIamPolicyCallback): Unit = js.native
  
  /**
    * Calls TestIamPermissions.
    * @param request TestIamPermissionsRequest message or plain object
    * @returns Promise
    */
  def testIamPermissions(request: ITestIamPermissionsRequest): js.Promise[TestIamPermissionsResponse] = js.native
  /**
    * Calls TestIamPermissions.
    * @param request TestIamPermissionsRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and TestIamPermissionsResponse
    */
  def testIamPermissions(request: ITestIamPermissionsRequest, callback: TestIamPermissionsCallback): Unit = js.native
  
  /**
    * Calls UpdateBackup.
    * @param request UpdateBackupRequest message or plain object
    * @returns Promise
    */
  def updateBackup(request: IUpdateBackupRequest): js.Promise[Backup] = js.native
  /**
    * Calls UpdateBackup.
    * @param request UpdateBackupRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and Backup
    */
  def updateBackup(request: IUpdateBackupRequest, callback: UpdateBackupCallback): Unit = js.native
  
  /**
    * Calls UpdateDatabaseDdl.
    * @param request UpdateDatabaseDdlRequest message or plain object
    * @returns Promise
    */
  def updateDatabaseDdl(request: IUpdateDatabaseDdlRequest): js.Promise[Operation] = js.native
  /**
    * Calls UpdateDatabaseDdl.
    * @param request UpdateDatabaseDdlRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and Operation
    */
  def updateDatabaseDdl(request: IUpdateDatabaseDdlRequest, callback: UpdateDatabaseDdlCallback): Unit = js.native
}
object DatabaseAdmin {
  
  @JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.admin.database.v1.DatabaseAdmin")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates new DatabaseAdmin service using the specified rpc implementation.
    * @param rpcImpl RPC implementation
    * @param [requestDelimited=false] Whether requests are length-delimited
    * @param [responseDelimited=false] Whether responses are length-delimited
    * @returns RPC service. Useful where requests and/or responses are streamed.
    */
  /* static member */
  inline def create(rpcImpl: RPCImpl): DatabaseAdmin = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(rpcImpl.asInstanceOf[js.Any]).asInstanceOf[DatabaseAdmin]
  inline def create(rpcImpl: RPCImpl, requestDelimited: Boolean): DatabaseAdmin = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(rpcImpl.asInstanceOf[js.Any], requestDelimited.asInstanceOf[js.Any])).asInstanceOf[DatabaseAdmin]
  inline def create(rpcImpl: RPCImpl, requestDelimited: Boolean, responseDelimited: Boolean): DatabaseAdmin = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(rpcImpl.asInstanceOf[js.Any], requestDelimited.asInstanceOf[js.Any], responseDelimited.asInstanceOf[js.Any])).asInstanceOf[DatabaseAdmin]
  inline def create(rpcImpl: RPCImpl, requestDelimited: Unit, responseDelimited: Boolean): DatabaseAdmin = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(rpcImpl.asInstanceOf[js.Any], requestDelimited.asInstanceOf[js.Any], responseDelimited.asInstanceOf[js.Any])).asInstanceOf[DatabaseAdmin]
  
  /**
    * Callback as used by {@link google.spanner.admin.database.v1.DatabaseAdmin|copyBackup}.
    * @param error Error, if any
    * @param [response] Operation
    */
  type CopyBackupCallback = js.Function2[/* error */ js.Error | Null, /* response */ js.UndefOr[Operation], Unit]
  
  /**
    * Callback as used by {@link google.spanner.admin.database.v1.DatabaseAdmin|createBackup}.
    * @param error Error, if any
    * @param [response] Operation
    */
  type CreateBackupCallback = js.Function2[/* error */ js.Error | Null, /* response */ js.UndefOr[Operation], Unit]
  
  /**
    * Callback as used by {@link google.spanner.admin.database.v1.DatabaseAdmin|createDatabase}.
    * @param error Error, if any
    * @param [response] Operation
    */
  type CreateDatabaseCallback = js.Function2[/* error */ js.Error | Null, /* response */ js.UndefOr[Operation], Unit]
  
  /**
    * Callback as used by {@link google.spanner.admin.database.v1.DatabaseAdmin|deleteBackup}.
    * @param error Error, if any
    * @param [response] Empty
    */
  type DeleteBackupCallback = js.Function2[/* error */ js.Error | Null, /* response */ js.UndefOr[Empty], Unit]
  
  /**
    * Callback as used by {@link google.spanner.admin.database.v1.DatabaseAdmin|dropDatabase}.
    * @param error Error, if any
    * @param [response] Empty
    */
  type DropDatabaseCallback = js.Function2[/* error */ js.Error | Null, /* response */ js.UndefOr[Empty], Unit]
  
  /**
    * Callback as used by {@link google.spanner.admin.database.v1.DatabaseAdmin|getBackup}.
    * @param error Error, if any
    * @param [response] Backup
    */
  type GetBackupCallback = js.Function2[/* error */ js.Error | Null, /* response */ js.UndefOr[Backup], Unit]
  
  /**
    * Callback as used by {@link google.spanner.admin.database.v1.DatabaseAdmin|getDatabase}.
    * @param error Error, if any
    * @param [response] Database
    */
  type GetDatabaseCallback = js.Function2[/* error */ js.Error | Null, /* response */ js.UndefOr[Database], Unit]
  
  /**
    * Callback as used by {@link google.spanner.admin.database.v1.DatabaseAdmin|getDatabaseDdl}.
    * @param error Error, if any
    * @param [response] GetDatabaseDdlResponse
    */
  type GetDatabaseDdlCallback = js.Function2[/* error */ js.Error | Null, /* response */ js.UndefOr[GetDatabaseDdlResponse], Unit]
  
  /**
    * Callback as used by {@link google.spanner.admin.database.v1.DatabaseAdmin|getIamPolicy}.
    * @param error Error, if any
    * @param [response] Policy
    */
  type GetIamPolicyCallback = js.Function2[/* error */ js.Error | Null, /* response */ js.UndefOr[Policy], Unit]
  
  /**
    * Callback as used by {@link google.spanner.admin.database.v1.DatabaseAdmin|listBackupOperations}.
    * @param error Error, if any
    * @param [response] ListBackupOperationsResponse
    */
  type ListBackupOperationsCallback = js.Function2[
    /* error */ js.Error | Null, 
    /* response */ js.UndefOr[ListBackupOperationsResponse], 
    Unit
  ]
  
  /**
    * Callback as used by {@link google.spanner.admin.database.v1.DatabaseAdmin|listBackups}.
    * @param error Error, if any
    * @param [response] ListBackupsResponse
    */
  type ListBackupsCallback = js.Function2[/* error */ js.Error | Null, /* response */ js.UndefOr[ListBackupsResponse], Unit]
  
  /**
    * Callback as used by {@link google.spanner.admin.database.v1.DatabaseAdmin|listDatabaseOperations}.
    * @param error Error, if any
    * @param [response] ListDatabaseOperationsResponse
    */
  type ListDatabaseOperationsCallback = js.Function2[
    /* error */ js.Error | Null, 
    /* response */ js.UndefOr[ListDatabaseOperationsResponse], 
    Unit
  ]
  
  /**
    * Callback as used by {@link google.spanner.admin.database.v1.DatabaseAdmin|listDatabaseRoles}.
    * @param error Error, if any
    * @param [response] ListDatabaseRolesResponse
    */
  type ListDatabaseRolesCallback = js.Function2[
    /* error */ js.Error | Null, 
    /* response */ js.UndefOr[ListDatabaseRolesResponse], 
    Unit
  ]
  
  /**
    * Callback as used by {@link google.spanner.admin.database.v1.DatabaseAdmin|listDatabases}.
    * @param error Error, if any
    * @param [response] ListDatabasesResponse
    */
  type ListDatabasesCallback = js.Function2[/* error */ js.Error | Null, /* response */ js.UndefOr[ListDatabasesResponse], Unit]
  
  /**
    * Callback as used by {@link google.spanner.admin.database.v1.DatabaseAdmin|restoreDatabase}.
    * @param error Error, if any
    * @param [response] Operation
    */
  type RestoreDatabaseCallback = js.Function2[/* error */ js.Error | Null, /* response */ js.UndefOr[Operation], Unit]
  
  /**
    * Callback as used by {@link google.spanner.admin.database.v1.DatabaseAdmin|setIamPolicy}.
    * @param error Error, if any
    * @param [response] Policy
    */
  type SetIamPolicyCallback = js.Function2[/* error */ js.Error | Null, /* response */ js.UndefOr[Policy], Unit]
  
  /**
    * Callback as used by {@link google.spanner.admin.database.v1.DatabaseAdmin|testIamPermissions}.
    * @param error Error, if any
    * @param [response] TestIamPermissionsResponse
    */
  type TestIamPermissionsCallback = js.Function2[
    /* error */ js.Error | Null, 
    /* response */ js.UndefOr[TestIamPermissionsResponse], 
    Unit
  ]
  
  /**
    * Callback as used by {@link google.spanner.admin.database.v1.DatabaseAdmin|updateBackup}.
    * @param error Error, if any
    * @param [response] Backup
    */
  type UpdateBackupCallback = js.Function2[/* error */ js.Error | Null, /* response */ js.UndefOr[Backup], Unit]
  
  /**
    * Callback as used by {@link google.spanner.admin.database.v1.DatabaseAdmin|updateDatabaseDdl}.
    * @param error Error, if any
    * @param [response] Operation
    */
  type UpdateDatabaseDdlCallback = js.Function2[/* error */ js.Error | Null, /* response */ js.UndefOr[Operation], Unit]
}
