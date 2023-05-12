package typings.digitalGoodsBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DigitalGoodsService extends StObject {
  
  /**
    * Consume (i.e. use up) a purchased item.
    */
  def consume(purchaseToken: String): js.Promise[Unit]
  
  /**
    * Get details about specific SKUs from the payment provider.
    */
  def getDetails(skus: js.Array[String]): js.Promise[js.Array[DigitalGoodsProductDetails]]
  
  /**
    * Get information about the latest purchases for each item type ever purchased by the user
    */
  def listPurchaseHistory(): js.Promise[js.Array[PurchaseDetails]]
  
  /**
    * Get a list of purchases made by the user.
    */
  def listPurchases(): js.Promise[js.Array[PurchaseDetails]]
}
object DigitalGoodsService {
  
  inline def apply(
    consume: String => js.Promise[Unit],
    getDetails: js.Array[String] => js.Promise[js.Array[DigitalGoodsProductDetails]],
    listPurchaseHistory: () => js.Promise[js.Array[PurchaseDetails]],
    listPurchases: () => js.Promise[js.Array[PurchaseDetails]]
  ): DigitalGoodsService = {
    val __obj = js.Dynamic.literal(consume = js.Any.fromFunction1(consume), getDetails = js.Any.fromFunction1(getDetails), listPurchaseHistory = js.Any.fromFunction0(listPurchaseHistory), listPurchases = js.Any.fromFunction0(listPurchases))
    __obj.asInstanceOf[DigitalGoodsService]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DigitalGoodsService] (val x: Self) extends AnyVal {
    
    inline def setConsume(value: String => js.Promise[Unit]): Self = StObject.set(x, "consume", js.Any.fromFunction1(value))
    
    inline def setGetDetails(value: js.Array[String] => js.Promise[js.Array[DigitalGoodsProductDetails]]): Self = StObject.set(x, "getDetails", js.Any.fromFunction1(value))
    
    inline def setListPurchaseHistory(value: () => js.Promise[js.Array[PurchaseDetails]]): Self = StObject.set(x, "listPurchaseHistory", js.Any.fromFunction0(value))
    
    inline def setListPurchases(value: () => js.Promise[js.Array[PurchaseDetails]]): Self = StObject.set(x, "listPurchases", js.Any.fromFunction0(value))
  }
}
