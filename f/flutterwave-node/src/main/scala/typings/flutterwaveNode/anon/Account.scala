package typings.flutterwaveNode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Account extends StObject {
  
  var Account: Compliancestatus
  
  var appfees: Double
  
  var bankcode: String
  
  var chargeback: Double
  
  var chargeback_meta: Any
  
  var created_at: String
  
  var cron_status: String
  
  var currency: String
  
  var destination: String
  
  var disburse_message: Any
  
  var disburse_ref: Any
  
  var due_date: String
  
  var flagmessage: Any
  
  var fxdata: Any
  
  var gross_amount: Double
  
  var id: Double
  
  var is_batch: Boolean
  
  var is_local: Boolean
  
  var merchant_email: String
  
  var merchant_id: Double
  
  var merchant_name: String
  
  var merchantfees: Double
  
  var meta: Any
  
  var net_amount: Double
  
  var parent_id: Double
  
  var processed_date: Any
  
  var processor_ref: Any
  
  var refund: Double
  
  var refund_meta: String
  
  var settlement_account: String
  
  var source_bankcode: Any
  
  var status: String
  
  var transaction_count: Double
  
  var transaction_date: String
  
  var updated_at: String
}
object Account {
  
  inline def apply(
    Account: Compliancestatus,
    appfees: Double,
    bankcode: String,
    chargeback: Double,
    chargeback_meta: Any,
    created_at: String,
    cron_status: String,
    currency: String,
    destination: String,
    disburse_message: Any,
    disburse_ref: Any,
    due_date: String,
    flagmessage: Any,
    fxdata: Any,
    gross_amount: Double,
    id: Double,
    is_batch: Boolean,
    is_local: Boolean,
    merchant_email: String,
    merchant_id: Double,
    merchant_name: String,
    merchantfees: Double,
    meta: Any,
    net_amount: Double,
    parent_id: Double,
    processed_date: Any,
    processor_ref: Any,
    refund: Double,
    refund_meta: String,
    settlement_account: String,
    source_bankcode: Any,
    status: String,
    transaction_count: Double,
    transaction_date: String,
    updated_at: String
  ): Account = {
    val __obj = js.Dynamic.literal(Account = Account.asInstanceOf[js.Any], appfees = appfees.asInstanceOf[js.Any], bankcode = bankcode.asInstanceOf[js.Any], chargeback = chargeback.asInstanceOf[js.Any], chargeback_meta = chargeback_meta.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], cron_status = cron_status.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], disburse_message = disburse_message.asInstanceOf[js.Any], disburse_ref = disburse_ref.asInstanceOf[js.Any], due_date = due_date.asInstanceOf[js.Any], flagmessage = flagmessage.asInstanceOf[js.Any], fxdata = fxdata.asInstanceOf[js.Any], gross_amount = gross_amount.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], is_batch = is_batch.asInstanceOf[js.Any], is_local = is_local.asInstanceOf[js.Any], merchant_email = merchant_email.asInstanceOf[js.Any], merchant_id = merchant_id.asInstanceOf[js.Any], merchant_name = merchant_name.asInstanceOf[js.Any], merchantfees = merchantfees.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], net_amount = net_amount.asInstanceOf[js.Any], parent_id = parent_id.asInstanceOf[js.Any], processed_date = processed_date.asInstanceOf[js.Any], processor_ref = processor_ref.asInstanceOf[js.Any], refund = refund.asInstanceOf[js.Any], refund_meta = refund_meta.asInstanceOf[js.Any], settlement_account = settlement_account.asInstanceOf[js.Any], source_bankcode = source_bankcode.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], transaction_count = transaction_count.asInstanceOf[js.Any], transaction_date = transaction_date.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any])
    __obj.asInstanceOf[Account]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Account] (val x: Self) extends AnyVal {
    
    inline def setAccount(value: Compliancestatus): Self = StObject.set(x, "Account", value.asInstanceOf[js.Any])
    
    inline def setAppfees(value: Double): Self = StObject.set(x, "appfees", value.asInstanceOf[js.Any])
    
    inline def setBankcode(value: String): Self = StObject.set(x, "bankcode", value.asInstanceOf[js.Any])
    
    inline def setChargeback(value: Double): Self = StObject.set(x, "chargeback", value.asInstanceOf[js.Any])
    
    inline def setChargeback_meta(value: Any): Self = StObject.set(x, "chargeback_meta", value.asInstanceOf[js.Any])
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setCron_status(value: String): Self = StObject.set(x, "cron_status", value.asInstanceOf[js.Any])
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setDisburse_message(value: Any): Self = StObject.set(x, "disburse_message", value.asInstanceOf[js.Any])
    
    inline def setDisburse_ref(value: Any): Self = StObject.set(x, "disburse_ref", value.asInstanceOf[js.Any])
    
    inline def setDue_date(value: String): Self = StObject.set(x, "due_date", value.asInstanceOf[js.Any])
    
    inline def setFlagmessage(value: Any): Self = StObject.set(x, "flagmessage", value.asInstanceOf[js.Any])
    
    inline def setFxdata(value: Any): Self = StObject.set(x, "fxdata", value.asInstanceOf[js.Any])
    
    inline def setGross_amount(value: Double): Self = StObject.set(x, "gross_amount", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIs_batch(value: Boolean): Self = StObject.set(x, "is_batch", value.asInstanceOf[js.Any])
    
    inline def setIs_local(value: Boolean): Self = StObject.set(x, "is_local", value.asInstanceOf[js.Any])
    
    inline def setMerchant_email(value: String): Self = StObject.set(x, "merchant_email", value.asInstanceOf[js.Any])
    
    inline def setMerchant_id(value: Double): Self = StObject.set(x, "merchant_id", value.asInstanceOf[js.Any])
    
    inline def setMerchant_name(value: String): Self = StObject.set(x, "merchant_name", value.asInstanceOf[js.Any])
    
    inline def setMerchantfees(value: Double): Self = StObject.set(x, "merchantfees", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: Any): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setNet_amount(value: Double): Self = StObject.set(x, "net_amount", value.asInstanceOf[js.Any])
    
    inline def setParent_id(value: Double): Self = StObject.set(x, "parent_id", value.asInstanceOf[js.Any])
    
    inline def setProcessed_date(value: Any): Self = StObject.set(x, "processed_date", value.asInstanceOf[js.Any])
    
    inline def setProcessor_ref(value: Any): Self = StObject.set(x, "processor_ref", value.asInstanceOf[js.Any])
    
    inline def setRefund(value: Double): Self = StObject.set(x, "refund", value.asInstanceOf[js.Any])
    
    inline def setRefund_meta(value: String): Self = StObject.set(x, "refund_meta", value.asInstanceOf[js.Any])
    
    inline def setSettlement_account(value: String): Self = StObject.set(x, "settlement_account", value.asInstanceOf[js.Any])
    
    inline def setSource_bankcode(value: Any): Self = StObject.set(x, "source_bankcode", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTransaction_count(value: Double): Self = StObject.set(x, "transaction_count", value.asInstanceOf[js.Any])
    
    inline def setTransaction_date(value: String): Self = StObject.set(x, "transaction_date", value.asInstanceOf[js.Any])
    
    inline def setUpdated_at(value: String): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
  }
}
