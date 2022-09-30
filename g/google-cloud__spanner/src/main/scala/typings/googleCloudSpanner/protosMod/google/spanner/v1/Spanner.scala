package typings.googleCloudSpanner.protosMod.google.spanner.v1

import typings.googleCloudSpanner.protosMod.google.protobuf.Empty
import typings.googleCloudSpanner.protosMod.google.spanner.v1.Spanner.BatchCreateSessionsCallback
import typings.googleCloudSpanner.protosMod.google.spanner.v1.Spanner.BeginTransactionCallback
import typings.googleCloudSpanner.protosMod.google.spanner.v1.Spanner.CommitCallback
import typings.googleCloudSpanner.protosMod.google.spanner.v1.Spanner.CreateSessionCallback
import typings.googleCloudSpanner.protosMod.google.spanner.v1.Spanner.DeleteSessionCallback
import typings.googleCloudSpanner.protosMod.google.spanner.v1.Spanner.ExecuteBatchDmlCallback
import typings.googleCloudSpanner.protosMod.google.spanner.v1.Spanner.ExecuteSqlCallback
import typings.googleCloudSpanner.protosMod.google.spanner.v1.Spanner.ExecuteStreamingSqlCallback
import typings.googleCloudSpanner.protosMod.google.spanner.v1.Spanner.GetSessionCallback
import typings.googleCloudSpanner.protosMod.google.spanner.v1.Spanner.ListSessionsCallback
import typings.googleCloudSpanner.protosMod.google.spanner.v1.Spanner.PartitionQueryCallback
import typings.googleCloudSpanner.protosMod.google.spanner.v1.Spanner.PartitionReadCallback
import typings.googleCloudSpanner.protosMod.google.spanner.v1.Spanner.ReadCallback
import typings.googleCloudSpanner.protosMod.google.spanner.v1.Spanner.RollbackCallback
import typings.googleCloudSpanner.protosMod.google.spanner.v1.Spanner.StreamingReadCallback
import typings.googleGax.mod.protobuf.rpc.Service
import typings.protobufjs.mod.RPCImpl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Spanner */
@JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.v1.Spanner")
@js.native
open class Spanner protected () extends Service {
  /**
    * Constructs a new Spanner service.
    * @param rpcImpl RPC implementation
    * @param [requestDelimited=false] Whether requests are length-delimited
    * @param [responseDelimited=false] Whether responses are length-delimited
    */
  def this(rpcImpl: RPCImpl) = this()
  def this(rpcImpl: RPCImpl, requestDelimited: Boolean) = this()
  def this(rpcImpl: RPCImpl, requestDelimited: Boolean, responseDelimited: Boolean) = this()
  def this(rpcImpl: RPCImpl, requestDelimited: Unit, responseDelimited: Boolean) = this()
  
  /**
    * Calls BatchCreateSessions.
    * @param request BatchCreateSessionsRequest message or plain object
    * @returns Promise
    */
  def batchCreateSessions(request: IBatchCreateSessionsRequest): js.Promise[BatchCreateSessionsResponse] = js.native
  /**
    * Calls BatchCreateSessions.
    * @param request BatchCreateSessionsRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and BatchCreateSessionsResponse
    */
  def batchCreateSessions(request: IBatchCreateSessionsRequest, callback: BatchCreateSessionsCallback): Unit = js.native
  
  /**
    * Calls BeginTransaction.
    * @param request BeginTransactionRequest message or plain object
    * @returns Promise
    */
  def beginTransaction(request: IBeginTransactionRequest): js.Promise[Transaction] = js.native
  /**
    * Calls BeginTransaction.
    * @param request BeginTransactionRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and Transaction
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
    * Calls CreateSession.
    * @param request CreateSessionRequest message or plain object
    * @returns Promise
    */
  def createSession(request: ICreateSessionRequest): js.Promise[Session] = js.native
  /**
    * Calls CreateSession.
    * @param request CreateSessionRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and Session
    */
  def createSession(request: ICreateSessionRequest, callback: CreateSessionCallback): Unit = js.native
  
  /**
    * Calls DeleteSession.
    * @param request DeleteSessionRequest message or plain object
    * @returns Promise
    */
  def deleteSession(request: IDeleteSessionRequest): js.Promise[Empty] = js.native
  /**
    * Calls DeleteSession.
    * @param request DeleteSessionRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and Empty
    */
  def deleteSession(request: IDeleteSessionRequest, callback: DeleteSessionCallback): Unit = js.native
  
  /**
    * Calls ExecuteBatchDml.
    * @param request ExecuteBatchDmlRequest message or plain object
    * @returns Promise
    */
  def executeBatchDml(request: IExecuteBatchDmlRequest): js.Promise[ExecuteBatchDmlResponse] = js.native
  /**
    * Calls ExecuteBatchDml.
    * @param request ExecuteBatchDmlRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and ExecuteBatchDmlResponse
    */
  def executeBatchDml(request: IExecuteBatchDmlRequest, callback: ExecuteBatchDmlCallback): Unit = js.native
  
  /**
    * Calls ExecuteSql.
    * @param request ExecuteSqlRequest message or plain object
    * @returns Promise
    */
  def executeSql(request: IExecuteSqlRequest): js.Promise[ResultSet] = js.native
  /**
    * Calls ExecuteSql.
    * @param request ExecuteSqlRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and ResultSet
    */
  def executeSql(request: IExecuteSqlRequest, callback: ExecuteSqlCallback): Unit = js.native
  
  /**
    * Calls ExecuteStreamingSql.
    * @param request ExecuteSqlRequest message or plain object
    * @returns Promise
    */
  def executeStreamingSql(request: IExecuteSqlRequest): js.Promise[PartialResultSet] = js.native
  /**
    * Calls ExecuteStreamingSql.
    * @param request ExecuteSqlRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and PartialResultSet
    */
  def executeStreamingSql(request: IExecuteSqlRequest, callback: ExecuteStreamingSqlCallback): Unit = js.native
  
  /**
    * Calls GetSession.
    * @param request GetSessionRequest message or plain object
    * @returns Promise
    */
  def getSession(request: IGetSessionRequest): js.Promise[Session] = js.native
  /**
    * Calls GetSession.
    * @param request GetSessionRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and Session
    */
  def getSession(request: IGetSessionRequest, callback: GetSessionCallback): Unit = js.native
  
  /**
    * Calls ListSessions.
    * @param request ListSessionsRequest message or plain object
    * @returns Promise
    */
  def listSessions(request: IListSessionsRequest): js.Promise[ListSessionsResponse] = js.native
  /**
    * Calls ListSessions.
    * @param request ListSessionsRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and ListSessionsResponse
    */
  def listSessions(request: IListSessionsRequest, callback: ListSessionsCallback): Unit = js.native
  
  /**
    * Calls PartitionQuery.
    * @param request PartitionQueryRequest message or plain object
    * @returns Promise
    */
  def partitionQuery(request: IPartitionQueryRequest): js.Promise[PartitionResponse] = js.native
  /**
    * Calls PartitionQuery.
    * @param request PartitionQueryRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and PartitionResponse
    */
  def partitionQuery(request: IPartitionQueryRequest, callback: PartitionQueryCallback): Unit = js.native
  
  /**
    * Calls PartitionRead.
    * @param request PartitionReadRequest message or plain object
    * @returns Promise
    */
  def partitionRead(request: IPartitionReadRequest): js.Promise[PartitionResponse] = js.native
  /**
    * Calls PartitionRead.
    * @param request PartitionReadRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and PartitionResponse
    */
  def partitionRead(request: IPartitionReadRequest, callback: PartitionReadCallback): Unit = js.native
  
  /**
    * Calls Read.
    * @param request ReadRequest message or plain object
    * @returns Promise
    */
  def read(request: IReadRequest): js.Promise[ResultSet] = js.native
  /**
    * Calls Read.
    * @param request ReadRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and ResultSet
    */
  def read(request: IReadRequest, callback: ReadCallback): Unit = js.native
  
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
    * Calls StreamingRead.
    * @param request ReadRequest message or plain object
    * @returns Promise
    */
  def streamingRead(request: IReadRequest): js.Promise[PartialResultSet] = js.native
  /**
    * Calls StreamingRead.
    * @param request ReadRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and PartialResultSet
    */
  def streamingRead(request: IReadRequest, callback: StreamingReadCallback): Unit = js.native
}
object Spanner {
  
  @JSImport("@google-cloud/spanner/build/protos/protos", "google.spanner.v1.Spanner")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates new Spanner service using the specified rpc implementation.
    * @param rpcImpl RPC implementation
    * @param [requestDelimited=false] Whether requests are length-delimited
    * @param [responseDelimited=false] Whether responses are length-delimited
    * @returns RPC service. Useful where requests and/or responses are streamed.
    */
  /* static member */
  inline def create(rpcImpl: RPCImpl): Spanner = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(rpcImpl.asInstanceOf[js.Any]).asInstanceOf[Spanner]
  inline def create(rpcImpl: RPCImpl, requestDelimited: Boolean): Spanner = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(rpcImpl.asInstanceOf[js.Any], requestDelimited.asInstanceOf[js.Any])).asInstanceOf[Spanner]
  inline def create(rpcImpl: RPCImpl, requestDelimited: Boolean, responseDelimited: Boolean): Spanner = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(rpcImpl.asInstanceOf[js.Any], requestDelimited.asInstanceOf[js.Any], responseDelimited.asInstanceOf[js.Any])).asInstanceOf[Spanner]
  inline def create(rpcImpl: RPCImpl, requestDelimited: Unit, responseDelimited: Boolean): Spanner = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(rpcImpl.asInstanceOf[js.Any], requestDelimited.asInstanceOf[js.Any], responseDelimited.asInstanceOf[js.Any])).asInstanceOf[Spanner]
  
  /**
    * Callback as used by {@link google.spanner.v1.Spanner|batchCreateSessions}.
    * @param error Error, if any
    * @param [response] BatchCreateSessionsResponse
    */
  type BatchCreateSessionsCallback = js.Function2[
    /* error */ js.Error | Null, 
    /* response */ js.UndefOr[BatchCreateSessionsResponse], 
    Unit
  ]
  
  /**
    * Callback as used by {@link google.spanner.v1.Spanner|beginTransaction}.
    * @param error Error, if any
    * @param [response] Transaction
    */
  type BeginTransactionCallback = js.Function2[/* error */ js.Error | Null, /* response */ js.UndefOr[Transaction], Unit]
  
  /**
    * Callback as used by {@link google.spanner.v1.Spanner|commit}.
    * @param error Error, if any
    * @param [response] CommitResponse
    */
  type CommitCallback = js.Function2[/* error */ js.Error | Null, /* response */ js.UndefOr[CommitResponse], Unit]
  
  /**
    * Callback as used by {@link google.spanner.v1.Spanner|createSession}.
    * @param error Error, if any
    * @param [response] Session
    */
  type CreateSessionCallback = js.Function2[/* error */ js.Error | Null, /* response */ js.UndefOr[Session], Unit]
  
  /**
    * Callback as used by {@link google.spanner.v1.Spanner|deleteSession}.
    * @param error Error, if any
    * @param [response] Empty
    */
  type DeleteSessionCallback = js.Function2[/* error */ js.Error | Null, /* response */ js.UndefOr[Empty], Unit]
  
  /**
    * Callback as used by {@link google.spanner.v1.Spanner|executeBatchDml}.
    * @param error Error, if any
    * @param [response] ExecuteBatchDmlResponse
    */
  type ExecuteBatchDmlCallback = js.Function2[
    /* error */ js.Error | Null, 
    /* response */ js.UndefOr[ExecuteBatchDmlResponse], 
    Unit
  ]
  
  /**
    * Callback as used by {@link google.spanner.v1.Spanner|executeSql}.
    * @param error Error, if any
    * @param [response] ResultSet
    */
  type ExecuteSqlCallback = js.Function2[/* error */ js.Error | Null, /* response */ js.UndefOr[ResultSet], Unit]
  
  /**
    * Callback as used by {@link google.spanner.v1.Spanner|executeStreamingSql}.
    * @param error Error, if any
    * @param [response] PartialResultSet
    */
  type ExecuteStreamingSqlCallback = js.Function2[/* error */ js.Error | Null, /* response */ js.UndefOr[PartialResultSet], Unit]
  
  /**
    * Callback as used by {@link google.spanner.v1.Spanner|getSession}.
    * @param error Error, if any
    * @param [response] Session
    */
  type GetSessionCallback = js.Function2[/* error */ js.Error | Null, /* response */ js.UndefOr[Session], Unit]
  
  /**
    * Callback as used by {@link google.spanner.v1.Spanner|listSessions}.
    * @param error Error, if any
    * @param [response] ListSessionsResponse
    */
  type ListSessionsCallback = js.Function2[/* error */ js.Error | Null, /* response */ js.UndefOr[ListSessionsResponse], Unit]
  
  /**
    * Callback as used by {@link google.spanner.v1.Spanner|partitionQuery}.
    * @param error Error, if any
    * @param [response] PartitionResponse
    */
  type PartitionQueryCallback = js.Function2[/* error */ js.Error | Null, /* response */ js.UndefOr[PartitionResponse], Unit]
  
  /**
    * Callback as used by {@link google.spanner.v1.Spanner|partitionRead}.
    * @param error Error, if any
    * @param [response] PartitionResponse
    */
  type PartitionReadCallback = js.Function2[/* error */ js.Error | Null, /* response */ js.UndefOr[PartitionResponse], Unit]
  
  /**
    * Callback as used by {@link google.spanner.v1.Spanner|read}.
    * @param error Error, if any
    * @param [response] ResultSet
    */
  type ReadCallback = js.Function2[/* error */ js.Error | Null, /* response */ js.UndefOr[ResultSet], Unit]
  
  /**
    * Callback as used by {@link google.spanner.v1.Spanner|rollback}.
    * @param error Error, if any
    * @param [response] Empty
    */
  type RollbackCallback = js.Function2[/* error */ js.Error | Null, /* response */ js.UndefOr[Empty], Unit]
  
  /**
    * Callback as used by {@link google.spanner.v1.Spanner|streamingRead}.
    * @param error Error, if any
    * @param [response] PartialResultSet
    */
  type StreamingReadCallback = js.Function2[/* error */ js.Error | Null, /* response */ js.UndefOr[PartialResultSet], Unit]
}
