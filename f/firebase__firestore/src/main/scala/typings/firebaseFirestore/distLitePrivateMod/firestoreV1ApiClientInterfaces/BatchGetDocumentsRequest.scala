package typings.firebaseFirestore.distLitePrivateMod.firestoreV1ApiClientInterfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetDocumentsRequest extends StObject {
  
  var database: js.UndefOr[String] = js.undefined
  
  var documents: js.UndefOr[js.Array[String]] = js.undefined
  
  var mask: js.UndefOr[DocumentMask] = js.undefined
  
  var newTransaction: js.UndefOr[TransactionOptions] = js.undefined
  
  var readTime: js.UndefOr[String] = js.undefined
  
  var transaction: js.UndefOr[String] = js.undefined
}
object BatchGetDocumentsRequest {
  
  inline def apply(): BatchGetDocumentsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetDocumentsRequest]
  }
  
  extension [Self <: BatchGetDocumentsRequest](x: Self) {
    
    inline def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
    
    inline def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
    
    inline def setDocuments(value: js.Array[String]): Self = StObject.set(x, "documents", value.asInstanceOf[js.Any])
    
    inline def setDocumentsUndefined: Self = StObject.set(x, "documents", js.undefined)
    
    inline def setDocumentsVarargs(value: String*): Self = StObject.set(x, "documents", js.Array(value*))
    
    inline def setMask(value: DocumentMask): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
    
    inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
    
    inline def setNewTransaction(value: TransactionOptions): Self = StObject.set(x, "newTransaction", value.asInstanceOf[js.Any])
    
    inline def setNewTransactionUndefined: Self = StObject.set(x, "newTransaction", js.undefined)
    
    inline def setReadTime(value: String): Self = StObject.set(x, "readTime", value.asInstanceOf[js.Any])
    
    inline def setReadTimeUndefined: Self = StObject.set(x, "readTime", js.undefined)
    
    inline def setTransaction(value: String): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    
    inline def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
  }
}
