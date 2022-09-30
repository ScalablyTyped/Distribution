package typings.googleCloudSpanner.protosMod.google.spanner.v1

import typings.long.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a ReadRequest. */
trait IReadRequest extends StObject {
  
  /** ReadRequest columns */
  var columns: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /** ReadRequest index */
  var index: js.UndefOr[String | Null] = js.undefined
  
  /** ReadRequest keySet */
  var keySet: js.UndefOr[IKeySet | Null] = js.undefined
  
  /** ReadRequest limit */
  var limit: js.UndefOr[Double | ^ | String | Null] = js.undefined
  
  /** ReadRequest partitionToken */
  var partitionToken: js.UndefOr[js.typedarray.Uint8Array | String | Null] = js.undefined
  
  /** ReadRequest requestOptions */
  var requestOptions: js.UndefOr[IRequestOptions | Null] = js.undefined
  
  /** ReadRequest resumeToken */
  var resumeToken: js.UndefOr[js.typedarray.Uint8Array | String | Null] = js.undefined
  
  /** ReadRequest session */
  var session: js.UndefOr[String | Null] = js.undefined
  
  /** ReadRequest table */
  var table: js.UndefOr[String | Null] = js.undefined
  
  /** ReadRequest transaction */
  var transaction: js.UndefOr[ITransactionSelector | Null] = js.undefined
}
object IReadRequest {
  
  inline def apply(): IReadRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IReadRequest]
  }
  
  extension [Self <: IReadRequest](x: Self) {
    
    inline def setColumns(value: js.Array[String]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsNull: Self = StObject.set(x, "columns", null)
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setColumnsVarargs(value: String*): Self = StObject.set(x, "columns", js.Array(value*))
    
    inline def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexNull: Self = StObject.set(x, "index", null)
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setKeySet(value: IKeySet): Self = StObject.set(x, "keySet", value.asInstanceOf[js.Any])
    
    inline def setKeySetNull: Self = StObject.set(x, "keySet", null)
    
    inline def setKeySetUndefined: Self = StObject.set(x, "keySet", js.undefined)
    
    inline def setLimit(value: Double | ^ | String): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitNull: Self = StObject.set(x, "limit", null)
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setPartitionToken(value: js.typedarray.Uint8Array | String): Self = StObject.set(x, "partitionToken", value.asInstanceOf[js.Any])
    
    inline def setPartitionTokenNull: Self = StObject.set(x, "partitionToken", null)
    
    inline def setPartitionTokenUndefined: Self = StObject.set(x, "partitionToken", js.undefined)
    
    inline def setRequestOptions(value: IRequestOptions): Self = StObject.set(x, "requestOptions", value.asInstanceOf[js.Any])
    
    inline def setRequestOptionsNull: Self = StObject.set(x, "requestOptions", null)
    
    inline def setRequestOptionsUndefined: Self = StObject.set(x, "requestOptions", js.undefined)
    
    inline def setResumeToken(value: js.typedarray.Uint8Array | String): Self = StObject.set(x, "resumeToken", value.asInstanceOf[js.Any])
    
    inline def setResumeTokenNull: Self = StObject.set(x, "resumeToken", null)
    
    inline def setResumeTokenUndefined: Self = StObject.set(x, "resumeToken", js.undefined)
    
    inline def setSession(value: String): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    inline def setSessionNull: Self = StObject.set(x, "session", null)
    
    inline def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
    
    inline def setTable(value: String): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    
    inline def setTableNull: Self = StObject.set(x, "table", null)
    
    inline def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
    
    inline def setTransaction(value: ITransactionSelector): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    
    inline def setTransactionNull: Self = StObject.set(x, "transaction", null)
    
    inline def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
  }
}
