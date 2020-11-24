package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PurchasedEnvelopesInformation extends js.Object {
  
  /**
    * The total amount of the purchase.
    */
  var amount: js.UndefOr[String] = js.native
  
  /**
    * The AppName of the client application.
    */
  var appName: js.UndefOr[String] = js.native
  
  /**
    * The currency code for the account, based on the [ISO 4217 currency code](https://www.iso.org/iso-4217-currency-codes.html).
    */
  var currencyCode: js.UndefOr[String] = js.native
  
  /**
    * The Platform of the client application
    */
  var platform: js.UndefOr[String] = js.native
  
  /**
    * The Product ID from the AppStore.
    */
  var productId: js.UndefOr[String] = js.native
  
  /**
    * The quantity of envelopes to add to the account.
    */
  var quantity: js.UndefOr[String] = js.native
  
  /**
    * The encrypted Base64 encoded receipt data.
    */
  var receiptData: js.UndefOr[String] = js.native
  
  /**
    * The name of the AppStore.
    */
  var storeName: js.UndefOr[String] = js.native
  
  /**
    * Specifies the Transaction ID from the AppStore.
    */
  var transactionId: js.UndefOr[String] = js.native
}
object PurchasedEnvelopesInformation {
  
  @scala.inline
  def apply(): PurchasedEnvelopesInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PurchasedEnvelopesInformation]
  }
  
  @scala.inline
  implicit class PurchasedEnvelopesInformationOps[Self <: PurchasedEnvelopesInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAmount(value: String): Self = this.set("amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmount: Self = this.set("amount", js.undefined)
    
    @scala.inline
    def setAppName(value: String): Self = this.set("appName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppName: Self = this.set("appName", js.undefined)
    
    @scala.inline
    def setCurrencyCode(value: String): Self = this.set("currencyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrencyCode: Self = this.set("currencyCode", js.undefined)
    
    @scala.inline
    def setPlatform(value: String): Self = this.set("platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlatform: Self = this.set("platform", js.undefined)
    
    @scala.inline
    def setProductId(value: String): Self = this.set("productId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductId: Self = this.set("productId", js.undefined)
    
    @scala.inline
    def setQuantity(value: String): Self = this.set("quantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuantity: Self = this.set("quantity", js.undefined)
    
    @scala.inline
    def setReceiptData(value: String): Self = this.set("receiptData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReceiptData: Self = this.set("receiptData", js.undefined)
    
    @scala.inline
    def setStoreName(value: String): Self = this.set("storeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStoreName: Self = this.set("storeName", js.undefined)
    
    @scala.inline
    def setTransactionId(value: String): Self = this.set("transactionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransactionId: Self = this.set("transactionId", js.undefined)
  }
}
