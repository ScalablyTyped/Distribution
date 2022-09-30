package typings.googleCloudSpanner.protosMod.google.spanner.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a CommitRequest. */
trait ICommitRequest extends StObject {
  
  /** CommitRequest mutations */
  var mutations: js.UndefOr[js.Array[IMutation] | Null] = js.undefined
  
  /** CommitRequest requestOptions */
  var requestOptions: js.UndefOr[IRequestOptions | Null] = js.undefined
  
  /** CommitRequest returnCommitStats */
  var returnCommitStats: js.UndefOr[Boolean | Null] = js.undefined
  
  /** CommitRequest session */
  var session: js.UndefOr[String | Null] = js.undefined
  
  /** CommitRequest singleUseTransaction */
  var singleUseTransaction: js.UndefOr[ITransactionOptions | Null] = js.undefined
  
  /** CommitRequest transactionId */
  var transactionId: js.UndefOr[js.typedarray.Uint8Array | String | Null] = js.undefined
}
object ICommitRequest {
  
  inline def apply(): ICommitRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICommitRequest]
  }
  
  extension [Self <: ICommitRequest](x: Self) {
    
    inline def setMutations(value: js.Array[IMutation]): Self = StObject.set(x, "mutations", value.asInstanceOf[js.Any])
    
    inline def setMutationsNull: Self = StObject.set(x, "mutations", null)
    
    inline def setMutationsUndefined: Self = StObject.set(x, "mutations", js.undefined)
    
    inline def setMutationsVarargs(value: IMutation*): Self = StObject.set(x, "mutations", js.Array(value*))
    
    inline def setRequestOptions(value: IRequestOptions): Self = StObject.set(x, "requestOptions", value.asInstanceOf[js.Any])
    
    inline def setRequestOptionsNull: Self = StObject.set(x, "requestOptions", null)
    
    inline def setRequestOptionsUndefined: Self = StObject.set(x, "requestOptions", js.undefined)
    
    inline def setReturnCommitStats(value: Boolean): Self = StObject.set(x, "returnCommitStats", value.asInstanceOf[js.Any])
    
    inline def setReturnCommitStatsNull: Self = StObject.set(x, "returnCommitStats", null)
    
    inline def setReturnCommitStatsUndefined: Self = StObject.set(x, "returnCommitStats", js.undefined)
    
    inline def setSession(value: String): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    inline def setSessionNull: Self = StObject.set(x, "session", null)
    
    inline def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
    
    inline def setSingleUseTransaction(value: ITransactionOptions): Self = StObject.set(x, "singleUseTransaction", value.asInstanceOf[js.Any])
    
    inline def setSingleUseTransactionNull: Self = StObject.set(x, "singleUseTransaction", null)
    
    inline def setSingleUseTransactionUndefined: Self = StObject.set(x, "singleUseTransaction", js.undefined)
    
    inline def setTransactionId(value: js.typedarray.Uint8Array | String): Self = StObject.set(x, "transactionId", value.asInstanceOf[js.Any])
    
    inline def setTransactionIdNull: Self = StObject.set(x, "transactionId", null)
    
    inline def setTransactionIdUndefined: Self = StObject.set(x, "transactionId", js.undefined)
  }
}
