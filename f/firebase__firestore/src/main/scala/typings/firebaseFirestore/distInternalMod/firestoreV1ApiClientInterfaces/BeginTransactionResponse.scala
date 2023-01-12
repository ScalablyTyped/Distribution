package typings.firebaseFirestore.distInternalMod.firestoreV1ApiClientInterfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BeginTransactionResponse extends StObject {
  
  var transaction: js.UndefOr[String] = js.undefined
}
object BeginTransactionResponse {
  
  inline def apply(): BeginTransactionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BeginTransactionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BeginTransactionResponse] (val x: Self) extends AnyVal {
    
    inline def setTransaction(value: String): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    
    inline def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
  }
}
