package typings.firebaseFirestore.srcProtosFirestoreProtoApiMod.firestoreV1ApiClientInterfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RunQueryRequest extends StObject {
  
  var newTransaction: js.UndefOr[TransactionOptions] = js.undefined
  
  var parent: js.UndefOr[String] = js.undefined
  
  var readTime: js.UndefOr[String] = js.undefined
  
  var structuredQuery: js.UndefOr[StructuredQuery] = js.undefined
  
  var transaction: js.UndefOr[String] = js.undefined
}
object RunQueryRequest {
  
  inline def apply(): RunQueryRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RunQueryRequest]
  }
  
  extension [Self <: RunQueryRequest](x: Self) {
    
    inline def setNewTransaction(value: TransactionOptions): Self = StObject.set(x, "newTransaction", value.asInstanceOf[js.Any])
    
    inline def setNewTransactionUndefined: Self = StObject.set(x, "newTransaction", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setReadTime(value: String): Self = StObject.set(x, "readTime", value.asInstanceOf[js.Any])
    
    inline def setReadTimeUndefined: Self = StObject.set(x, "readTime", js.undefined)
    
    inline def setStructuredQuery(value: StructuredQuery): Self = StObject.set(x, "structuredQuery", value.asInstanceOf[js.Any])
    
    inline def setStructuredQueryUndefined: Self = StObject.set(x, "structuredQuery", js.undefined)
    
    inline def setTransaction(value: String): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    
    inline def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
  }
}
