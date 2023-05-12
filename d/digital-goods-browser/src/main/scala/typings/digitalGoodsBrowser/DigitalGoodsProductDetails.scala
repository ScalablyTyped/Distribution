package typings.digitalGoodsBrowser

import typings.std.PaymentCurrencyAmount
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DigitalGoodsProductDetails extends StObject {
  
  var description: String
  
  var freeTrialPeriod: String
  
  var iconURLs: js.Array[String]
  
  var introductoryPrice: PaymentCurrencyAmount
  
  var introductoryPriceCycles: Double
  
  var introductoryPricePeriod: String
  
  var itemId: String
  
  var price: PaymentCurrencyAmount
  
  var subscriptionPeriod: String
  
  var title: String
  
  var `type`: ItemType
}
object DigitalGoodsProductDetails {
  
  inline def apply(
    description: String,
    freeTrialPeriod: String,
    iconURLs: js.Array[String],
    introductoryPrice: PaymentCurrencyAmount,
    introductoryPriceCycles: Double,
    introductoryPricePeriod: String,
    itemId: String,
    price: PaymentCurrencyAmount,
    subscriptionPeriod: String,
    title: String,
    `type`: ItemType
  ): DigitalGoodsProductDetails = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], freeTrialPeriod = freeTrialPeriod.asInstanceOf[js.Any], iconURLs = iconURLs.asInstanceOf[js.Any], introductoryPrice = introductoryPrice.asInstanceOf[js.Any], introductoryPriceCycles = introductoryPriceCycles.asInstanceOf[js.Any], introductoryPricePeriod = introductoryPricePeriod.asInstanceOf[js.Any], itemId = itemId.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], subscriptionPeriod = subscriptionPeriod.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DigitalGoodsProductDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DigitalGoodsProductDetails] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setFreeTrialPeriod(value: String): Self = StObject.set(x, "freeTrialPeriod", value.asInstanceOf[js.Any])
    
    inline def setIconURLs(value: js.Array[String]): Self = StObject.set(x, "iconURLs", value.asInstanceOf[js.Any])
    
    inline def setIconURLsVarargs(value: String*): Self = StObject.set(x, "iconURLs", js.Array(value*))
    
    inline def setIntroductoryPrice(value: PaymentCurrencyAmount): Self = StObject.set(x, "introductoryPrice", value.asInstanceOf[js.Any])
    
    inline def setIntroductoryPriceCycles(value: Double): Self = StObject.set(x, "introductoryPriceCycles", value.asInstanceOf[js.Any])
    
    inline def setIntroductoryPricePeriod(value: String): Self = StObject.set(x, "introductoryPricePeriod", value.asInstanceOf[js.Any])
    
    inline def setItemId(value: String): Self = StObject.set(x, "itemId", value.asInstanceOf[js.Any])
    
    inline def setPrice(value: PaymentCurrencyAmount): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionPeriod(value: String): Self = StObject.set(x, "subscriptionPeriod", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setType(value: ItemType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
