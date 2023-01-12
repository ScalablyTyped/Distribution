package typings.flutterwaveNode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cardlocale extends StObject {
  
  var RRN: String
  
  var appfee: Double
  
  var card_locale: String
  
  var charged_amount: Double
  
  var currency: String
  
  var customer_email: String
  
  var flw_ref: String
  
  var merchantfee: Any
  
  var payment_entity: String
  
  var settlement_amount: Double
  
  var status: String
  
  var transaction_date: String
  
  var transaction_id: Double
  
  var txId: Double
  
  var tx_ref: String
}
object Cardlocale {
  
  inline def apply(
    RRN: String,
    appfee: Double,
    card_locale: String,
    charged_amount: Double,
    currency: String,
    customer_email: String,
    flw_ref: String,
    merchantfee: Any,
    payment_entity: String,
    settlement_amount: Double,
    status: String,
    transaction_date: String,
    transaction_id: Double,
    txId: Double,
    tx_ref: String
  ): Cardlocale = {
    val __obj = js.Dynamic.literal(RRN = RRN.asInstanceOf[js.Any], appfee = appfee.asInstanceOf[js.Any], card_locale = card_locale.asInstanceOf[js.Any], charged_amount = charged_amount.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], customer_email = customer_email.asInstanceOf[js.Any], flw_ref = flw_ref.asInstanceOf[js.Any], merchantfee = merchantfee.asInstanceOf[js.Any], payment_entity = payment_entity.asInstanceOf[js.Any], settlement_amount = settlement_amount.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], transaction_date = transaction_date.asInstanceOf[js.Any], transaction_id = transaction_id.asInstanceOf[js.Any], txId = txId.asInstanceOf[js.Any], tx_ref = tx_ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cardlocale]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Cardlocale] (val x: Self) extends AnyVal {
    
    inline def setAppfee(value: Double): Self = StObject.set(x, "appfee", value.asInstanceOf[js.Any])
    
    inline def setCard_locale(value: String): Self = StObject.set(x, "card_locale", value.asInstanceOf[js.Any])
    
    inline def setCharged_amount(value: Double): Self = StObject.set(x, "charged_amount", value.asInstanceOf[js.Any])
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setCustomer_email(value: String): Self = StObject.set(x, "customer_email", value.asInstanceOf[js.Any])
    
    inline def setFlw_ref(value: String): Self = StObject.set(x, "flw_ref", value.asInstanceOf[js.Any])
    
    inline def setMerchantfee(value: Any): Self = StObject.set(x, "merchantfee", value.asInstanceOf[js.Any])
    
    inline def setPayment_entity(value: String): Self = StObject.set(x, "payment_entity", value.asInstanceOf[js.Any])
    
    inline def setRRN(value: String): Self = StObject.set(x, "RRN", value.asInstanceOf[js.Any])
    
    inline def setSettlement_amount(value: Double): Self = StObject.set(x, "settlement_amount", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTransaction_date(value: String): Self = StObject.set(x, "transaction_date", value.asInstanceOf[js.Any])
    
    inline def setTransaction_id(value: Double): Self = StObject.set(x, "transaction_id", value.asInstanceOf[js.Any])
    
    inline def setTxId(value: Double): Self = StObject.set(x, "txId", value.asInstanceOf[js.Any])
    
    inline def setTx_ref(value: String): Self = StObject.set(x, "tx_ref", value.asInstanceOf[js.Any])
  }
}
