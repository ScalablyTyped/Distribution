package typings.flutterwaveNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VerifyTransactionVerifyRequest extends StObject {
  
  var txref: String
}
object VerifyTransactionVerifyRequest {
  
  inline def apply(txref: String): VerifyTransactionVerifyRequest = {
    val __obj = js.Dynamic.literal(txref = txref.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerifyTransactionVerifyRequest]
  }
  
  extension [Self <: VerifyTransactionVerifyRequest](x: Self) {
    
    inline def setTxref(value: String): Self = StObject.set(x, "txref", value.asInstanceOf[js.Any])
  }
}
