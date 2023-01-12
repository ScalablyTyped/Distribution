package typings.googleCloudFirestore.typesProtosFirestoreV1ProtoApiMod.google.firestore.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a RollbackRequest. */
trait IRollbackRequest extends StObject {
  
  /** RollbackRequest database */
  var database: js.UndefOr[String | Null] = js.undefined
  
  /** RollbackRequest transaction */
  var transaction: js.UndefOr[js.typedarray.Uint8Array | Null] = js.undefined
}
object IRollbackRequest {
  
  inline def apply(): IRollbackRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRollbackRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IRollbackRequest] (val x: Self) extends AnyVal {
    
    inline def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
    
    inline def setDatabaseNull: Self = StObject.set(x, "database", null)
    
    inline def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
    
    inline def setTransaction(value: js.typedarray.Uint8Array): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    
    inline def setTransactionNull: Self = StObject.set(x, "transaction", null)
    
    inline def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
  }
}
