package typings.flutterwaveNode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AmountRefunded extends StObject {
  
  var AccountId: Double
  
  var AmountRefunded: Double
  
  var FlwRef: String
  
  var TransactionId: Double
  
  var createdAt: String
  
  var id: Double
  
  var status: String
  
  var updatedAt: String
  
  var walletId: Double
}
object AmountRefunded {
  
  inline def apply(
    AccountId: Double,
    AmountRefunded: Double,
    FlwRef: String,
    TransactionId: Double,
    createdAt: String,
    id: Double,
    status: String,
    updatedAt: String,
    walletId: Double
  ): AmountRefunded = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], AmountRefunded = AmountRefunded.asInstanceOf[js.Any], FlwRef = FlwRef.asInstanceOf[js.Any], TransactionId = TransactionId.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any], walletId = walletId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AmountRefunded]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AmountRefunded] (val x: Self) extends AnyVal {
    
    inline def setAccountId(value: Double): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setAmountRefunded(value: Double): Self = StObject.set(x, "AmountRefunded", value.asInstanceOf[js.Any])
    
    inline def setCreatedAt(value: String): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setFlwRef(value: String): Self = StObject.set(x, "FlwRef", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTransactionId(value: Double): Self = StObject.set(x, "TransactionId", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAt(value: String): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
    
    inline def setWalletId(value: Double): Self = StObject.set(x, "walletId", value.asInstanceOf[js.Any])
  }
}
