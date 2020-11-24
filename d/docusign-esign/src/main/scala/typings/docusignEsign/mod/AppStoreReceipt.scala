package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppStoreReceipt extends js.Object {
  
  /**
    * The Product ID from the AppStore.
    */
  var productId: js.UndefOr[String] = js.native
  
  /**
    * Reserved: TBD
    */
  var receiptData: js.UndefOr[String] = js.native
}
object AppStoreReceipt {
  
  @scala.inline
  def apply(): AppStoreReceipt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppStoreReceipt]
  }
  
  @scala.inline
  implicit class AppStoreReceiptOps[Self <: AppStoreReceipt] (val x: Self) extends AnyVal {
    
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
    def setProductId(value: String): Self = this.set("productId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductId: Self = this.set("productId", js.undefined)
    
    @scala.inline
    def setReceiptData(value: String): Self = this.set("receiptData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReceiptData: Self = this.set("receiptData", js.undefined)
  }
}
