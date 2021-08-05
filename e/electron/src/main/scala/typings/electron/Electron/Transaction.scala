package typings.electron.Electron

import typings.electron.electronStrings.deferred
import typings.electron.electronStrings.failed
import typings.electron.electronStrings.purchased
import typings.electron.electronStrings.purchasing
import typings.electron.electronStrings.restored
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Transaction extends StObject {
  
  // Docs: https://electronjs.org/docs/api/structures/transaction
  /**
    * The error code if an error occurred while processing the transaction.
    */
  var errorCode: Double
  
  /**
    * The error message if an error occurred while processing the transaction.
    */
  var errorMessage: String
  
  /**
    * The identifier of the restored transaction by the App Store.
    */
  var originalTransactionIdentifier: String
  
  var payment: Payment
  
  /**
    * The date the transaction was added to the App Store’s payment queue.
    */
  var transactionDate: String
  
  /**
    * A string that uniquely identifies a successful payment transaction.
    */
  var transactionIdentifier: String
  
  /**
    * The transaction state, can be `purchasing`, `purchased`, `failed`, `restored` or
    * `deferred`.
    */
  var transactionState: purchasing | purchased | failed | restored | deferred
}
object Transaction {
  
  inline def apply(
    errorCode: Double,
    errorMessage: String,
    originalTransactionIdentifier: String,
    payment: Payment,
    transactionDate: String,
    transactionIdentifier: String,
    transactionState: purchasing | purchased | failed | restored | deferred
  ): Transaction = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], originalTransactionIdentifier = originalTransactionIdentifier.asInstanceOf[js.Any], payment = payment.asInstanceOf[js.Any], transactionDate = transactionDate.asInstanceOf[js.Any], transactionIdentifier = transactionIdentifier.asInstanceOf[js.Any], transactionState = transactionState.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transaction]
  }
  
  extension [Self <: Transaction](x: Self) {
    
    inline def setErrorCode(value: Double): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setOriginalTransactionIdentifier(value: String): Self = StObject.set(x, "originalTransactionIdentifier", value.asInstanceOf[js.Any])
    
    inline def setPayment(value: Payment): Self = StObject.set(x, "payment", value.asInstanceOf[js.Any])
    
    inline def setTransactionDate(value: String): Self = StObject.set(x, "transactionDate", value.asInstanceOf[js.Any])
    
    inline def setTransactionIdentifier(value: String): Self = StObject.set(x, "transactionIdentifier", value.asInstanceOf[js.Any])
    
    inline def setTransactionState(value: purchasing | purchased | failed | restored | deferred): Self = StObject.set(x, "transactionState", value.asInstanceOf[js.Any])
  }
}
