package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTransactionInfo extends StObject {
  
  /**
    * [Output-only] // [Alpha] Id of the transaction.
    */
  var transactionId: js.UndefOr[String | Null] = js.undefined
}
object SchemaTransactionInfo {
  
  inline def apply(): SchemaTransactionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTransactionInfo]
  }
  
  extension [Self <: SchemaTransactionInfo](x: Self) {
    
    inline def setTransactionId(value: String): Self = StObject.set(x, "transactionId", value.asInstanceOf[js.Any])
    
    inline def setTransactionIdNull: Self = StObject.set(x, "transactionId", null)
    
    inline def setTransactionIdUndefined: Self = StObject.set(x, "transactionId", js.undefined)
  }
}
