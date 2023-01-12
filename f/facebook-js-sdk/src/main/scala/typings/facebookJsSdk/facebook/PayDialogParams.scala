package typings.facebookJsSdk.facebook

import typings.facebookJsSdk.facebookJsSdkStrings.pay
import typings.facebookJsSdk.facebookJsSdkStrings.purchaseitem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PayDialogParams
  extends StObject
     with DialogParams {
  
  var action: purchaseitem
  
  var method: pay
  
  var pricepoint_id: js.UndefOr[String] = js.undefined
  
  var product: String
  
  var quantity: js.UndefOr[Double] = js.undefined
  
  var quantity_max: js.UndefOr[Double] = js.undefined
  
  var quantity_min: js.UndefOr[Double] = js.undefined
  
  var request_id: js.UndefOr[String] = js.undefined
  
  var test_currency: js.UndefOr[String] = js.undefined
}
object PayDialogParams {
  
  inline def apply(product: String): PayDialogParams = {
    val __obj = js.Dynamic.literal(action = "purchaseitem", method = "pay", product = product.asInstanceOf[js.Any])
    __obj.asInstanceOf[PayDialogParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PayDialogParams] (val x: Self) extends AnyVal {
    
    inline def setAction(value: purchaseitem): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: pay): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setPricepoint_id(value: String): Self = StObject.set(x, "pricepoint_id", value.asInstanceOf[js.Any])
    
    inline def setPricepoint_idUndefined: Self = StObject.set(x, "pricepoint_id", js.undefined)
    
    inline def setProduct(value: String): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
    
    inline def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    inline def setQuantity_max(value: Double): Self = StObject.set(x, "quantity_max", value.asInstanceOf[js.Any])
    
    inline def setQuantity_maxUndefined: Self = StObject.set(x, "quantity_max", js.undefined)
    
    inline def setQuantity_min(value: Double): Self = StObject.set(x, "quantity_min", value.asInstanceOf[js.Any])
    
    inline def setQuantity_minUndefined: Self = StObject.set(x, "quantity_min", js.undefined)
    
    inline def setRequest_id(value: String): Self = StObject.set(x, "request_id", value.asInstanceOf[js.Any])
    
    inline def setRequest_idUndefined: Self = StObject.set(x, "request_id", js.undefined)
    
    inline def setTest_currency(value: String): Self = StObject.set(x, "test_currency", value.asInstanceOf[js.Any])
    
    inline def setTest_currencyUndefined: Self = StObject.set(x, "test_currency", js.undefined)
  }
}
