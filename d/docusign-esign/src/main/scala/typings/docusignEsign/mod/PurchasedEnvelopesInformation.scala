package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PurchasedEnvelopesInformation extends StObject {
  
  /**
    * The total amount of the purchase.
    */
  var amount: js.UndefOr[String] = js.undefined
  
  /**
    * The AppName of the client application.
    */
  var appName: js.UndefOr[String] = js.undefined
  
  /**
    * The currency code for the account, based on the [ISO 4217 currency code](https://www.iso.org/iso-4217-currency-codes.html).
    */
  var currencyCode: js.UndefOr[String] = js.undefined
  
  /**
    * The Platform of the client application
    */
  var platform: js.UndefOr[String] = js.undefined
  
  /**
    * The Product ID from the AppStore.
    */
  var productId: js.UndefOr[String] = js.undefined
  
  /**
    * The quantity of envelopes to add to the account.
    */
  var quantity: js.UndefOr[String] = js.undefined
  
  /**
    * The encrypted Base64 encoded receipt data.
    */
  var receiptData: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the AppStore.
    */
  var storeName: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the Transaction ID from the AppStore.
    */
  var transactionId: js.UndefOr[String] = js.undefined
}
object PurchasedEnvelopesInformation {
  
  inline def apply(): PurchasedEnvelopesInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PurchasedEnvelopesInformation]
  }
  
  extension [Self <: PurchasedEnvelopesInformation](x: Self) {
    
    inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    inline def setAppName(value: String): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
    
    inline def setAppNameUndefined: Self = StObject.set(x, "appName", js.undefined)
    
    inline def setCurrencyCode(value: String): Self = StObject.set(x, "currencyCode", value.asInstanceOf[js.Any])
    
    inline def setCurrencyCodeUndefined: Self = StObject.set(x, "currencyCode", js.undefined)
    
    inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
    
    inline def setQuantity(value: String): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    inline def setReceiptData(value: String): Self = StObject.set(x, "receiptData", value.asInstanceOf[js.Any])
    
    inline def setReceiptDataUndefined: Self = StObject.set(x, "receiptData", js.undefined)
    
    inline def setStoreName(value: String): Self = StObject.set(x, "storeName", value.asInstanceOf[js.Any])
    
    inline def setStoreNameUndefined: Self = StObject.set(x, "storeName", js.undefined)
    
    inline def setTransactionId(value: String): Self = StObject.set(x, "transactionId", value.asInstanceOf[js.Any])
    
    inline def setTransactionIdUndefined: Self = StObject.set(x, "transactionId", js.undefined)
  }
}
