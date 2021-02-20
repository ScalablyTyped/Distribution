package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppStoreReceipt extends StObject {
  
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
  implicit class AppStoreReceiptMutableBuilder[Self <: AppStoreReceipt] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
    
    @scala.inline
    def setReceiptData(value: String): Self = StObject.set(x, "receiptData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceiptDataUndefined: Self = StObject.set(x, "receiptData", js.undefined)
  }
}
