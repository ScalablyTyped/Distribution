package typings.firebaseFirestore.internalMod.firestoreV1ApiClientInterfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommitRequest extends StObject {
  
  var database: js.UndefOr[String] = js.undefined
  
  var transaction: js.UndefOr[String] = js.undefined
  
  var writes: js.UndefOr[js.Array[Write]] = js.undefined
}
object CommitRequest {
  
  inline def apply(): CommitRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommitRequest]
  }
  
  extension [Self <: CommitRequest](x: Self) {
    
    inline def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
    
    inline def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
    
    inline def setTransaction(value: String): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    
    inline def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
    
    inline def setWrites(value: js.Array[Write]): Self = StObject.set(x, "writes", value.asInstanceOf[js.Any])
    
    inline def setWritesUndefined: Self = StObject.set(x, "writes", js.undefined)
    
    inline def setWritesVarargs(value: Write*): Self = StObject.set(x, "writes", js.Array(value*))
  }
}
