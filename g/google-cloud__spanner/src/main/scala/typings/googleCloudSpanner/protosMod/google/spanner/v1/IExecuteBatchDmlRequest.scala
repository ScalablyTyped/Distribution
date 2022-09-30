package typings.googleCloudSpanner.protosMod.google.spanner.v1

import typings.googleCloudSpanner.protosMod.google.spanner.v1.ExecuteBatchDmlRequest.IStatement
import typings.long.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of an ExecuteBatchDmlRequest. */
trait IExecuteBatchDmlRequest extends StObject {
  
  /** ExecuteBatchDmlRequest requestOptions */
  var requestOptions: js.UndefOr[IRequestOptions | Null] = js.undefined
  
  /** ExecuteBatchDmlRequest seqno */
  var seqno: js.UndefOr[Double | ^ | String | Null] = js.undefined
  
  /** ExecuteBatchDmlRequest session */
  var session: js.UndefOr[String | Null] = js.undefined
  
  /** ExecuteBatchDmlRequest statements */
  var statements: js.UndefOr[js.Array[IStatement] | Null] = js.undefined
  
  /** ExecuteBatchDmlRequest transaction */
  var transaction: js.UndefOr[ITransactionSelector | Null] = js.undefined
}
object IExecuteBatchDmlRequest {
  
  inline def apply(): IExecuteBatchDmlRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IExecuteBatchDmlRequest]
  }
  
  extension [Self <: IExecuteBatchDmlRequest](x: Self) {
    
    inline def setRequestOptions(value: IRequestOptions): Self = StObject.set(x, "requestOptions", value.asInstanceOf[js.Any])
    
    inline def setRequestOptionsNull: Self = StObject.set(x, "requestOptions", null)
    
    inline def setRequestOptionsUndefined: Self = StObject.set(x, "requestOptions", js.undefined)
    
    inline def setSeqno(value: Double | ^ | String): Self = StObject.set(x, "seqno", value.asInstanceOf[js.Any])
    
    inline def setSeqnoNull: Self = StObject.set(x, "seqno", null)
    
    inline def setSeqnoUndefined: Self = StObject.set(x, "seqno", js.undefined)
    
    inline def setSession(value: String): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    inline def setSessionNull: Self = StObject.set(x, "session", null)
    
    inline def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
    
    inline def setStatements(value: js.Array[IStatement]): Self = StObject.set(x, "statements", value.asInstanceOf[js.Any])
    
    inline def setStatementsNull: Self = StObject.set(x, "statements", null)
    
    inline def setStatementsUndefined: Self = StObject.set(x, "statements", js.undefined)
    
    inline def setStatementsVarargs(value: IStatement*): Self = StObject.set(x, "statements", js.Array(value*))
    
    inline def setTransaction(value: ITransactionSelector): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    
    inline def setTransactionNull: Self = StObject.set(x, "transaction", null)
    
    inline def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
  }
}
