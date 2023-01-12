package typings.googleCloudFirestore.typesProtosFirestoreV1ProtoApiMod.google.firestore.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a CommitRequest. */
trait ICommitRequest extends StObject {
  
  /** CommitRequest database */
  var database: js.UndefOr[String | Null] = js.undefined
  
  /** CommitRequest transaction */
  var transaction: js.UndefOr[js.typedarray.Uint8Array | Null] = js.undefined
  
  /** CommitRequest writes */
  var writes: js.UndefOr[js.Array[IWrite] | Null] = js.undefined
}
object ICommitRequest {
  
  inline def apply(): ICommitRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICommitRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ICommitRequest] (val x: Self) extends AnyVal {
    
    inline def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
    
    inline def setDatabaseNull: Self = StObject.set(x, "database", null)
    
    inline def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
    
    inline def setTransaction(value: js.typedarray.Uint8Array): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    
    inline def setTransactionNull: Self = StObject.set(x, "transaction", null)
    
    inline def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
    
    inline def setWrites(value: js.Array[IWrite]): Self = StObject.set(x, "writes", value.asInstanceOf[js.Any])
    
    inline def setWritesNull: Self = StObject.set(x, "writes", null)
    
    inline def setWritesUndefined: Self = StObject.set(x, "writes", js.undefined)
    
    inline def setWritesVarargs(value: IWrite*): Self = StObject.set(x, "writes", js.Array(value*))
  }
}
