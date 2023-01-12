package typings.flutterwaveNode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AmountConfirmed extends StObject {
  
  var AmountConfirmed: Double
  
  var Currency: String
  
  var CurrencyId: Double
  
  var DateCreated: String
  
  var Description: String
  
  var Fee: Double
  
  var Id: Double
  
  var Indicator: String
  
  var Narration: String
  
  var PaymentReference: Any
  
  var PaymentResponseCode: Any
  
  var PaymentResponseMessage: Any
  
  var PaymentType: Any
  
  var ProductId: Double
  
  var ProductName: String
  
  var ProviderReference: Any
  
  var ProviderResponseCode: Any
  
  var ProviderResponseMessage: Any
  
  var Status: Double
  
  var StatusName: String
  
  var TransactionAmount: Double
  
  var TransactionReference: String
  
  var UniqueReference: String
  
  var UniqueReferenceDetails: String
}
object AmountConfirmed {
  
  inline def apply(
    AmountConfirmed: Double,
    Currency: String,
    CurrencyId: Double,
    DateCreated: String,
    Description: String,
    Fee: Double,
    Id: Double,
    Indicator: String,
    Narration: String,
    PaymentReference: Any,
    PaymentResponseCode: Any,
    PaymentResponseMessage: Any,
    PaymentType: Any,
    ProductId: Double,
    ProductName: String,
    ProviderReference: Any,
    ProviderResponseCode: Any,
    ProviderResponseMessage: Any,
    Status: Double,
    StatusName: String,
    TransactionAmount: Double,
    TransactionReference: String,
    UniqueReference: String,
    UniqueReferenceDetails: String
  ): AmountConfirmed = {
    val __obj = js.Dynamic.literal(AmountConfirmed = AmountConfirmed.asInstanceOf[js.Any], Currency = Currency.asInstanceOf[js.Any], CurrencyId = CurrencyId.asInstanceOf[js.Any], DateCreated = DateCreated.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], Fee = Fee.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Indicator = Indicator.asInstanceOf[js.Any], Narration = Narration.asInstanceOf[js.Any], PaymentReference = PaymentReference.asInstanceOf[js.Any], PaymentResponseCode = PaymentResponseCode.asInstanceOf[js.Any], PaymentResponseMessage = PaymentResponseMessage.asInstanceOf[js.Any], PaymentType = PaymentType.asInstanceOf[js.Any], ProductId = ProductId.asInstanceOf[js.Any], ProductName = ProductName.asInstanceOf[js.Any], ProviderReference = ProviderReference.asInstanceOf[js.Any], ProviderResponseCode = ProviderResponseCode.asInstanceOf[js.Any], ProviderResponseMessage = ProviderResponseMessage.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], StatusName = StatusName.asInstanceOf[js.Any], TransactionAmount = TransactionAmount.asInstanceOf[js.Any], TransactionReference = TransactionReference.asInstanceOf[js.Any], UniqueReference = UniqueReference.asInstanceOf[js.Any], UniqueReferenceDetails = UniqueReferenceDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[AmountConfirmed]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AmountConfirmed] (val x: Self) extends AnyVal {
    
    inline def setAmountConfirmed(value: Double): Self = StObject.set(x, "AmountConfirmed", value.asInstanceOf[js.Any])
    
    inline def setCurrency(value: String): Self = StObject.set(x, "Currency", value.asInstanceOf[js.Any])
    
    inline def setCurrencyId(value: Double): Self = StObject.set(x, "CurrencyId", value.asInstanceOf[js.Any])
    
    inline def setDateCreated(value: String): Self = StObject.set(x, "DateCreated", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setFee(value: Double): Self = StObject.set(x, "Fee", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIndicator(value: String): Self = StObject.set(x, "Indicator", value.asInstanceOf[js.Any])
    
    inline def setNarration(value: String): Self = StObject.set(x, "Narration", value.asInstanceOf[js.Any])
    
    inline def setPaymentReference(value: Any): Self = StObject.set(x, "PaymentReference", value.asInstanceOf[js.Any])
    
    inline def setPaymentResponseCode(value: Any): Self = StObject.set(x, "PaymentResponseCode", value.asInstanceOf[js.Any])
    
    inline def setPaymentResponseMessage(value: Any): Self = StObject.set(x, "PaymentResponseMessage", value.asInstanceOf[js.Any])
    
    inline def setPaymentType(value: Any): Self = StObject.set(x, "PaymentType", value.asInstanceOf[js.Any])
    
    inline def setProductId(value: Double): Self = StObject.set(x, "ProductId", value.asInstanceOf[js.Any])
    
    inline def setProductName(value: String): Self = StObject.set(x, "ProductName", value.asInstanceOf[js.Any])
    
    inline def setProviderReference(value: Any): Self = StObject.set(x, "ProviderReference", value.asInstanceOf[js.Any])
    
    inline def setProviderResponseCode(value: Any): Self = StObject.set(x, "ProviderResponseCode", value.asInstanceOf[js.Any])
    
    inline def setProviderResponseMessage(value: Any): Self = StObject.set(x, "ProviderResponseMessage", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Double): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusName(value: String): Self = StObject.set(x, "StatusName", value.asInstanceOf[js.Any])
    
    inline def setTransactionAmount(value: Double): Self = StObject.set(x, "TransactionAmount", value.asInstanceOf[js.Any])
    
    inline def setTransactionReference(value: String): Self = StObject.set(x, "TransactionReference", value.asInstanceOf[js.Any])
    
    inline def setUniqueReference(value: String): Self = StObject.set(x, "UniqueReference", value.asInstanceOf[js.Any])
    
    inline def setUniqueReferenceDetails(value: String): Self = StObject.set(x, "UniqueReferenceDetails", value.asInstanceOf[js.Any])
  }
}
