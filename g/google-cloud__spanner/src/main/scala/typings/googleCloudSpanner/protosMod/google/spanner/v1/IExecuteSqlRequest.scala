package typings.googleCloudSpanner.protosMod.google.spanner.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudSpanner.protosMod.google.protobuf.IStruct
import typings.googleCloudSpanner.protosMod.google.spanner.v1.ExecuteSqlRequest.IQueryOptions
import typings.googleCloudSpanner.protosMod.google.spanner.v1.ExecuteSqlRequest.QueryMode
import typings.long.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of an ExecuteSqlRequest. */
trait IExecuteSqlRequest extends StObject {
  
  /** ExecuteSqlRequest paramTypes */
  var paramTypes: js.UndefOr[StringDictionary[IType] | Null] = js.undefined
  
  /** ExecuteSqlRequest params */
  var params: js.UndefOr[IStruct | Null] = js.undefined
  
  /** ExecuteSqlRequest partitionToken */
  var partitionToken: js.UndefOr[js.typedarray.Uint8Array | String | Null] = js.undefined
  
  /** ExecuteSqlRequest queryMode */
  var queryMode: js.UndefOr[
    QueryMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.spanner.v1.ExecuteSqlRequest.QueryMode * / any */ String) | Null
  ] = js.undefined
  
  /** ExecuteSqlRequest queryOptions */
  var queryOptions: js.UndefOr[IQueryOptions | Null] = js.undefined
  
  /** ExecuteSqlRequest requestOptions */
  var requestOptions: js.UndefOr[IRequestOptions | Null] = js.undefined
  
  /** ExecuteSqlRequest resumeToken */
  var resumeToken: js.UndefOr[js.typedarray.Uint8Array | String | Null] = js.undefined
  
  /** ExecuteSqlRequest seqno */
  var seqno: js.UndefOr[Double | ^ | String | Null] = js.undefined
  
  /** ExecuteSqlRequest session */
  var session: js.UndefOr[String | Null] = js.undefined
  
  /** ExecuteSqlRequest sql */
  var sql: js.UndefOr[String | Null] = js.undefined
  
  /** ExecuteSqlRequest transaction */
  var transaction: js.UndefOr[ITransactionSelector | Null] = js.undefined
}
object IExecuteSqlRequest {
  
  inline def apply(): IExecuteSqlRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IExecuteSqlRequest]
  }
  
  extension [Self <: IExecuteSqlRequest](x: Self) {
    
    inline def setParamTypes(value: StringDictionary[IType]): Self = StObject.set(x, "paramTypes", value.asInstanceOf[js.Any])
    
    inline def setParamTypesNull: Self = StObject.set(x, "paramTypes", null)
    
    inline def setParamTypesUndefined: Self = StObject.set(x, "paramTypes", js.undefined)
    
    inline def setParams(value: IStruct): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsNull: Self = StObject.set(x, "params", null)
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    inline def setPartitionToken(value: js.typedarray.Uint8Array | String): Self = StObject.set(x, "partitionToken", value.asInstanceOf[js.Any])
    
    inline def setPartitionTokenNull: Self = StObject.set(x, "partitionToken", null)
    
    inline def setPartitionTokenUndefined: Self = StObject.set(x, "partitionToken", js.undefined)
    
    inline def setQueryMode(
      value: QueryMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.spanner.v1.ExecuteSqlRequest.QueryMode * / any */ String)
    ): Self = StObject.set(x, "queryMode", value.asInstanceOf[js.Any])
    
    inline def setQueryModeNull: Self = StObject.set(x, "queryMode", null)
    
    inline def setQueryModeUndefined: Self = StObject.set(x, "queryMode", js.undefined)
    
    inline def setQueryOptions(value: IQueryOptions): Self = StObject.set(x, "queryOptions", value.asInstanceOf[js.Any])
    
    inline def setQueryOptionsNull: Self = StObject.set(x, "queryOptions", null)
    
    inline def setQueryOptionsUndefined: Self = StObject.set(x, "queryOptions", js.undefined)
    
    inline def setRequestOptions(value: IRequestOptions): Self = StObject.set(x, "requestOptions", value.asInstanceOf[js.Any])
    
    inline def setRequestOptionsNull: Self = StObject.set(x, "requestOptions", null)
    
    inline def setRequestOptionsUndefined: Self = StObject.set(x, "requestOptions", js.undefined)
    
    inline def setResumeToken(value: js.typedarray.Uint8Array | String): Self = StObject.set(x, "resumeToken", value.asInstanceOf[js.Any])
    
    inline def setResumeTokenNull: Self = StObject.set(x, "resumeToken", null)
    
    inline def setResumeTokenUndefined: Self = StObject.set(x, "resumeToken", js.undefined)
    
    inline def setSeqno(value: Double | ^ | String): Self = StObject.set(x, "seqno", value.asInstanceOf[js.Any])
    
    inline def setSeqnoNull: Self = StObject.set(x, "seqno", null)
    
    inline def setSeqnoUndefined: Self = StObject.set(x, "seqno", js.undefined)
    
    inline def setSession(value: String): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    inline def setSessionNull: Self = StObject.set(x, "session", null)
    
    inline def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
    
    inline def setSql(value: String): Self = StObject.set(x, "sql", value.asInstanceOf[js.Any])
    
    inline def setSqlNull: Self = StObject.set(x, "sql", null)
    
    inline def setSqlUndefined: Self = StObject.set(x, "sql", js.undefined)
    
    inline def setTransaction(value: ITransactionSelector): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    
    inline def setTransactionNull: Self = StObject.set(x, "transaction", null)
    
    inline def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
  }
}
