package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProductDiscount extends StObject {
  
  // Docs: https://electronjs.org/docs/api/structures/product-discount
  /**
    * A string used to uniquely identify a discount offer for a product.
    */
  var identifier: String
  
  /**
    * An integer that indicates the number of periods the product discount is
    * available.
    */
  var numberOfPeriods: Double
  
  /**
    * The payment mode for this product discount. Can be `payAsYouGo`, `payUpFront`,
    * or `freeTrial`.
    */
  var paymentMode: "payAsYouGo" | "payUpFront" | "freeTrial"
  
  /**
    * The discount price of the product in the local currency.
    */
  var price: Double
  
  /**
    * The locale used to format the discount price of the product.
    */
  var priceLocale: String
  
  /**
    * An object that defines the period for the product discount.
    */
  var subscriptionPeriod: js.UndefOr[ProductSubscriptionPeriod] = js.undefined
  
  /**
    * The type of discount offer.
    */
  var `type`: Double
}
object ProductDiscount {
  
  inline def apply(
    identifier: String,
    numberOfPeriods: Double,
    paymentMode: "payAsYouGo" | "payUpFront" | "freeTrial",
    price: Double,
    priceLocale: String,
    `type`: Double
  ): ProductDiscount = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], numberOfPeriods = numberOfPeriods.asInstanceOf[js.Any], paymentMode = paymentMode.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], priceLocale = priceLocale.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductDiscount]
  }
  
  extension [Self <: ProductDiscount](x: Self) {
    
    inline def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setNumberOfPeriods(value: Double): Self = StObject.set(x, "numberOfPeriods", value.asInstanceOf[js.Any])
    
    inline def setPaymentMode(value: "payAsYouGo" | "payUpFront" | "freeTrial"): Self = StObject.set(x, "paymentMode", value.asInstanceOf[js.Any])
    
    inline def setPrice(value: Double): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    inline def setPriceLocale(value: String): Self = StObject.set(x, "priceLocale", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionPeriod(value: ProductSubscriptionPeriod): Self = StObject.set(x, "subscriptionPeriod", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionPeriodUndefined: Self = StObject.set(x, "subscriptionPeriod", js.undefined)
    
    inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
