package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppStoreReceipt extends StObject {
  
  /**
    * The Product ID from the AppStore.
    */
  var productId: js.UndefOr[String] = js.undefined
  
  /**
    * Reserved: TBD
    */
  var receiptData: js.UndefOr[String] = js.undefined
}
object AppStoreReceipt {
  
  inline def apply(): AppStoreReceipt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppStoreReceipt]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppStoreReceipt] (val x: Self) extends AnyVal {
    
    inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
    
    inline def setReceiptData(value: String): Self = StObject.set(x, "receiptData", value.asInstanceOf[js.Any])
    
    inline def setReceiptDataUndefined: Self = StObject.set(x, "receiptData", js.undefined)
  }
}
