package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Product extends StObject {
  
  // Docs: https://electronjs.org/docs/api/structures/product
  /**
    * The total size of the content, in bytes.
    */
  var contentLengths: js.Array[Double]
  
  /**
    * A string that identifies the version of the content.
    */
  var contentVersion: String
  
  /**
    * 3 character code presenting a product's currency based on the ISO 4217 standard.
    */
  var currencyCode: String
  
  /**
    * An array of discount offers
    */
  var discounts: js.Array[ProductDiscount]
  
  /**
    * The total size of the content, in bytes.
    */
  var downloadContentLengths: js.Array[Double]
  
  /**
    * A string that identifies the version of the content.
    */
  var downloadContentVersion: String
  
  /**
    * The locale formatted price of the product.
    */
  var formattedPrice: String
  
  /**
    * The object containing introductory price information for the product. available
    * for the product.
    */
  var introductoryPrice: js.UndefOr[ProductDiscount] = js.undefined
  
  /**
    * A boolean value that indicates whether the App Store has downloadable content
    * for this product. `true` if at least one file has been associated with the
    * product.
    */
  var isDownloadable: Boolean
  
  /**
    * A description of the product.
    */
  var localizedDescription: String
  
  /**
    * The name of the product.
    */
  var localizedTitle: String
  
  /**
    * The cost of the product in the local currency.
    */
  var price: Double
  
  /**
    * The string that identifies the product to the Apple App Store.
    */
  var productIdentifier: String
  
  /**
    * The identifier of the subscription group to which the subscription belongs.
    */
  var subscriptionGroupIdentifier: String
  
  /**
    * The period details for products that are subscriptions.
    */
  var subscriptionPeriod: js.UndefOr[ProductSubscriptionPeriod] = js.undefined
}
object Product {
  
  inline def apply(
    contentLengths: js.Array[Double],
    contentVersion: String,
    currencyCode: String,
    discounts: js.Array[ProductDiscount],
    downloadContentLengths: js.Array[Double],
    downloadContentVersion: String,
    formattedPrice: String,
    isDownloadable: Boolean,
    localizedDescription: String,
    localizedTitle: String,
    price: Double,
    productIdentifier: String,
    subscriptionGroupIdentifier: String
  ): Product = {
    val __obj = js.Dynamic.literal(contentLengths = contentLengths.asInstanceOf[js.Any], contentVersion = contentVersion.asInstanceOf[js.Any], currencyCode = currencyCode.asInstanceOf[js.Any], discounts = discounts.asInstanceOf[js.Any], downloadContentLengths = downloadContentLengths.asInstanceOf[js.Any], downloadContentVersion = downloadContentVersion.asInstanceOf[js.Any], formattedPrice = formattedPrice.asInstanceOf[js.Any], isDownloadable = isDownloadable.asInstanceOf[js.Any], localizedDescription = localizedDescription.asInstanceOf[js.Any], localizedTitle = localizedTitle.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], productIdentifier = productIdentifier.asInstanceOf[js.Any], subscriptionGroupIdentifier = subscriptionGroupIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[Product]
  }
  
  extension [Self <: Product](x: Self) {
    
    inline def setContentLengths(value: js.Array[Double]): Self = StObject.set(x, "contentLengths", value.asInstanceOf[js.Any])
    
    inline def setContentLengthsVarargs(value: Double*): Self = StObject.set(x, "contentLengths", js.Array(value*))
    
    inline def setContentVersion(value: String): Self = StObject.set(x, "contentVersion", value.asInstanceOf[js.Any])
    
    inline def setCurrencyCode(value: String): Self = StObject.set(x, "currencyCode", value.asInstanceOf[js.Any])
    
    inline def setDiscounts(value: js.Array[ProductDiscount]): Self = StObject.set(x, "discounts", value.asInstanceOf[js.Any])
    
    inline def setDiscountsVarargs(value: ProductDiscount*): Self = StObject.set(x, "discounts", js.Array(value*))
    
    inline def setDownloadContentLengths(value: js.Array[Double]): Self = StObject.set(x, "downloadContentLengths", value.asInstanceOf[js.Any])
    
    inline def setDownloadContentLengthsVarargs(value: Double*): Self = StObject.set(x, "downloadContentLengths", js.Array(value*))
    
    inline def setDownloadContentVersion(value: String): Self = StObject.set(x, "downloadContentVersion", value.asInstanceOf[js.Any])
    
    inline def setFormattedPrice(value: String): Self = StObject.set(x, "formattedPrice", value.asInstanceOf[js.Any])
    
    inline def setIntroductoryPrice(value: ProductDiscount): Self = StObject.set(x, "introductoryPrice", value.asInstanceOf[js.Any])
    
    inline def setIntroductoryPriceUndefined: Self = StObject.set(x, "introductoryPrice", js.undefined)
    
    inline def setIsDownloadable(value: Boolean): Self = StObject.set(x, "isDownloadable", value.asInstanceOf[js.Any])
    
    inline def setLocalizedDescription(value: String): Self = StObject.set(x, "localizedDescription", value.asInstanceOf[js.Any])
    
    inline def setLocalizedTitle(value: String): Self = StObject.set(x, "localizedTitle", value.asInstanceOf[js.Any])
    
    inline def setPrice(value: Double): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    inline def setProductIdentifier(value: String): Self = StObject.set(x, "productIdentifier", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionGroupIdentifier(value: String): Self = StObject.set(x, "subscriptionGroupIdentifier", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionPeriod(value: ProductSubscriptionPeriod): Self = StObject.set(x, "subscriptionPeriod", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionPeriodUndefined: Self = StObject.set(x, "subscriptionPeriod", js.undefined)
  }
}
