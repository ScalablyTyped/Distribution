package typings.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.firestoreV1ApiClientInterfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RunAggregationQueryRequest extends StObject {
  
  var newTransaction: js.UndefOr[TransactionOptions] = js.undefined
  
  var parent: js.UndefOr[String] = js.undefined
  
  var readTime: js.UndefOr[String] = js.undefined
  
  var structuredAggregationQuery: js.UndefOr[StructuredAggregationQuery] = js.undefined
  
  var transaction: js.UndefOr[String] = js.undefined
}
object RunAggregationQueryRequest {
  
  inline def apply(): RunAggregationQueryRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RunAggregationQueryRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RunAggregationQueryRequest] (val x: Self) extends AnyVal {
    
    inline def setNewTransaction(value: TransactionOptions): Self = StObject.set(x, "newTransaction", value.asInstanceOf[js.Any])
    
    inline def setNewTransactionUndefined: Self = StObject.set(x, "newTransaction", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setReadTime(value: String): Self = StObject.set(x, "readTime", value.asInstanceOf[js.Any])
    
    inline def setReadTimeUndefined: Self = StObject.set(x, "readTime", js.undefined)
    
    inline def setStructuredAggregationQuery(value: StructuredAggregationQuery): Self = StObject.set(x, "structuredAggregationQuery", value.asInstanceOf[js.Any])
    
    inline def setStructuredAggregationQueryUndefined: Self = StObject.set(x, "structuredAggregationQuery", js.undefined)
    
    inline def setTransaction(value: String): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    
    inline def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
  }
}
