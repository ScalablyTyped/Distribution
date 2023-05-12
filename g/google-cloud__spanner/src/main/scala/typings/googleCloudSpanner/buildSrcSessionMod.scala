package typings.googleCloudSpanner

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudSpanner.anon.PickanytransactionTag
import typings.googleCloudSpanner.buildSrcCommonMod.NormalCallback
import typings.googleCloudSpanner.buildSrcDatabaseMod.Database
import typings.googleCloudSpanner.buildSrcTransactionMod.PartitionedDml
import typings.googleCloudSpanner.buildSrcTransactionMod.Snapshot
import typings.googleCloudSpanner.buildSrcTransactionMod.TimestampBounds
import typings.googleCloudSpanner.buildSrcTransactionMod.Transaction
import typings.googleCloudSpanner.googleCloudSpannerStrings.readonly
import typings.googleCloudSpanner.googleCloudSpannerStrings.readwrite
import typings.googleGax.buildSrcGaxMod.CallOptions
import typings.grpcGrpcJs.buildSrcCallMod.ServiceError
import typings.teenyRequest.mod.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcSessionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify common.GrpcServiceObject * / any */ @JSImport("@google-cloud/spanner/build/src/session", "Session")
  @js.native
  open class Session protected () extends StObject {
    def this(database: Database) = this()
    def this(database: Database, name: String) = this()
    
    /**
      * Gets the Spanner object
      *
      * @private
      *
      * @returns {Spanner}
      */
    /* private */ var _getSpanner: Any = js.native
    
    /**
      * Delete a session.
      *
      * Wrapper around {@link v1.SpannerClient#deleteSession}.
      *
      * @see {@link v1.SpannerClient#deleteSession}
      * @see [DeleteSession API Documentation](https://cloud.google.com/spanner/docs/reference/rpc/google.spanner.v1#google.spanner.v1.Spanner.DeleteSession)
      *
      * @param {object} [gaxOptions] Request configuration options,
      *     See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions}
      *     for more details.
      * @param {DeleteSessionCallback} [callback] Callback function.
      * @returns {Promise<DeleteSessionResponse>}
      *
      * @example
      * ```
      * session.delete(function(err, apiResponse) {
      *   if (err) {
      *     // Error handling omitted.
      *   }
      *
      *   // Session deleted successfully.
      * });
      *
      * //-
      * //Returns a Promise if the callback is omitted.
      * //-
      * session.delete().then(function(data) {
      *   const apiResponse = data[0];
      * });
      * ```
      */
    def delete(): js.Promise[DeleteSessionResponse] = js.native
    def delete(callback: DeleteSessionCallback): Unit = js.native
    def delete(gaxOptions: CallOptions): js.Promise[DeleteSessionResponse] = js.native
    def delete(gaxOptions: CallOptions, callback: DeleteSessionCallback): Unit = js.native
    
    var formattedName_ : js.UndefOr[String] = js.native
    
    /**
      * @typedef {array} GetSessionMetadataResponse
      * @property {object} 0 The session's metadata.
      * @property {object} 1 The full API response.
      */
    /**
      * @callback GetSessionMetadataCallback
      * @param {?Error} err Request error, if any.
      * @param {object} metadata The session's metadata.
      * @param {object} apiResponse The full API response.
      */
    /**
      * Get the session's metadata.
      *
      * Wrapper around {@link v1.SpannerClient#getSession}.
      *
      * @see {@link v1.SpannerClient#getSession}
      * @see [GetSession API Documentation](https://cloud.google.com/spanner/docs/reference/rpc/google.spanner.v1#google.spanner.v1.Spanner.GetSession)
      *
      * @param {object} [gaxOptions] Request configuration options,
      *     See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions}
      *     for more details.
      * @param {GetSessionMetadataCallback} [callback] Callback function.
      * @returns {Promise<GetSessionMetadataResponse>}
      *
      * @example
      * ```
      * session.getMetadata(function(err, metadata, apiResponse) {});
      *
      * //-
      * //Returns a Promise if the callback is omitted.
      * //-
      * session.getMetadata().then(function(data) {
      *   const metadata = data[0];
      *   const apiResponse = data[1];
      * });
      * ```
      */
    def getMetadata(): js.Promise[GetSessionMetadataResponse] = js.native
    def getMetadata(callback: GetSessionMetadataCallback): Unit = js.native
    def getMetadata(gaxOptions: CallOptions): js.Promise[GetSessionMetadataResponse] = js.native
    def getMetadata(gaxOptions: CallOptions, callback: GetSessionMetadataCallback): Unit = js.native
    
    var id: String = js.native
    
    /**
      * Ping the session with `SELECT 1` to prevent it from expiring.
      *
      * @param {object} [gaxOptions] Request configuration options,
      *     See {@link https://googleapis.dev/nodejs/google-gax/latest/interfaces/CallOptions.html|CallOptions}
      *     for more details.
      * @param {BasicCallback} [callback] Callback function.
      * @returns {Promise<BasicResponse>}
      *
      * @example
      * ```
      * session.keepAlive(function(err) {
      *   if (err) {
      *     // An error occurred while trying to keep this session alive.
      *   }
      * });
      * ```
      */
    def keepAlive(): js.Promise[KeepAliveResponse] = js.native
    def keepAlive(callback: KeepAliveCallback): Unit = js.native
    def keepAlive(gaxOptions: CallOptions): js.Promise[KeepAliveResponse] = js.native
    def keepAlive(gaxOptions: CallOptions, callback: KeepAliveCallback): Unit = js.native
    
    var lastError: js.UndefOr[ServiceError] = js.native
    
    var lastUsed: js.UndefOr[Double] = js.native
    
    /**
      * Create a PartitionedDml transaction.
      *
      * @returns {PartitionedDml}
      *
      * @example
      * ```
      * const transaction = session.partitionedDml();
      * ```
      */
    def partitionedDml(): PartitionedDml = js.native
    
    var resourceHeader_ : StringDictionary[String] = js.native
    
    /**
      * Create a Snapshot transaction.
      *
      * @param {TimestampBounds} [options] The timestamp bounds.
      * @param {google.spanner.v1.ExecuteSqlRequest.IQueryOptions} [queryOptions] The default query options to use.
      * @returns {Snapshot}
      *
      * @example
      * ```
      * const snapshot = session.snapshot({strong: false});
      * ```
      */
    def snapshot(): Snapshot = js.native
    def snapshot(
      options: Unit,
      queryOptions: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.spanner.v1.ExecuteSqlRequest.IQueryOptions */ Any
    ): Snapshot = js.native
    def snapshot(options: TimestampBounds): Snapshot = js.native
    def snapshot(
      options: TimestampBounds,
      queryOptions: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.spanner.v1.ExecuteSqlRequest.IQueryOptions */ Any
    ): Snapshot = js.native
    
    /**
      * Create a read write Transaction.
      *
      * @param {google.spanner.v1.ExecuteSqlRequest.IQueryOptions} [queryOptions] The default query options to use.
      * @return {Transaction}
      *
      * @example
      * ```
      * const transaction = session.transaction();
      * ```
      */
    def transaction(): Transaction = js.native
    def transaction(
      queryOptions: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.spanner.v1.ExecuteSqlRequest.IQueryOptions */ Any
    ): Transaction = js.native
    def transaction(
      queryOptions: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.spanner.v1.ExecuteSqlRequest.IQueryOptions */ Any,
      requestOptions: PickanytransactionTag
    ): Transaction = js.native
    def transaction(queryOptions: Unit, requestOptions: PickanytransactionTag): Transaction = js.native
    
    var txn: js.UndefOr[Transaction] = js.native
  }
  /* static members */
  object Session {
    
    @JSImport("@google-cloud/spanner/build/src/session", "Session")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Format the session name to include the parent database's name.
      *
      * @private
      *
      * @param {string} databaseName The parent database's name.
      * @param {string} name The instance name.
      * @returns {string}
      *
      * @example
      * ```
      * Session.formatName_('my-database', 'my-session');
      * // 'projects/grape-spaceship-123/instances/my-instance/' +
      * // 'databases/my-database/sessions/my-session'
      * ```
      */
    inline def formatName_(databaseName: String, name: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatName_")(databaseName.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[String]
  }
  
  type DeleteSessionCallback = NormalCallback[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.protobuf.IEmpty */ Any
  ]
  
  type DeleteSessionResponse = js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.protobuf.IEmpty */ Any
  ]
  
  type GetSessionMetadataCallback = NormalCallback[GetSessionMetadataResponse]
  
  trait GetSessionMetadataResponse extends StObject {
    
    var approximateLastUseTime: js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.protobuf.ITimestamp */ Any) | Null
      ] = js.undefined
    
    var createTime: js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.protobuf.ITimestamp */ Any) | Null
      ] = js.undefined
    
    var databaseRole: js.UndefOr[String | Null] = js.undefined
    
    var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
    
    var name: js.UndefOr[String | Null] = js.undefined
  }
  object GetSessionMetadataResponse {
    
    inline def apply(): GetSessionMetadataResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetSessionMetadataResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetSessionMetadataResponse] (val x: Self) extends AnyVal {
      
      inline def setApproximateLastUseTime(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.protobuf.ITimestamp */ Any
      ): Self = StObject.set(x, "approximateLastUseTime", value.asInstanceOf[js.Any])
      
      inline def setApproximateLastUseTimeNull: Self = StObject.set(x, "approximateLastUseTime", null)
      
      inline def setApproximateLastUseTimeUndefined: Self = StObject.set(x, "approximateLastUseTime", js.undefined)
      
      inline def setCreateTime(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.protobuf.ITimestamp */ Any
      ): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
      
      inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
      
      inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
      
      inline def setDatabaseRole(value: String): Self = StObject.set(x, "databaseRole", value.asInstanceOf[js.Any])
      
      inline def setDatabaseRoleNull: Self = StObject.set(x, "databaseRole", null)
      
      inline def setDatabaseRoleUndefined: Self = StObject.set(x, "databaseRole", js.undefined)
      
      inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      inline def setLabelsNull: Self = StObject.set(x, "labels", null)
      
      inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameNull: Self = StObject.set(x, "name", null)
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  type GetSessionResponse = js.Tuple2[Session, Response[Any]]
  
  type KeepAliveCallback = NormalCallback[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.spanner.v1.IResultSet */ Any
  ]
  
  type KeepAliveResponse = js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.spanner.v1.IResultSet */ Any
  ]
  
  /* Rewritten from type alias, can be one of: 
    - typings.googleCloudSpanner.googleCloudSpannerStrings.readonly
    - typings.googleCloudSpanner.googleCloudSpannerStrings.readwrite
  */
  trait types extends StObject
  object types {
    
    inline def ReadOnly: readonly = "readonly".asInstanceOf[readonly]
    
    inline def ReadWrite: readwrite = "readwrite".asInstanceOf[readwrite]
  }
}
