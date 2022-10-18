package typings.googleCloudFirestore.typesProtosFirestoreV1beta1ProtoApiMod.google.firestore.v1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a BeginTransactionRequest. */
trait IBeginTransactionRequest extends StObject {
  
  /** BeginTransactionRequest database */
  var database: js.UndefOr[String | Null] = js.undefined
  
  /** BeginTransactionRequest options */
  var options: js.UndefOr[ITransactionOptions | Null] = js.undefined
}
object IBeginTransactionRequest {
  
  inline def apply(): IBeginTransactionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBeginTransactionRequest]
  }
  
  extension [Self <: IBeginTransactionRequest](x: Self) {
    
    inline def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
    
    inline def setDatabaseNull: Self = StObject.set(x, "database", null)
    
    inline def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
    
    inline def setOptions(value: ITransactionOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsNull: Self = StObject.set(x, "options", null)
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
