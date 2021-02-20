package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Product extends StObject {
  
  // Docs: https://electronjs.org/docs/api/structures/product
  /**
    * The total size of the content, in bytes.
    */
  var contentLengths: js.Array[Double] = js.native
  
  /**
    * A string that identifies the version of the content.
    */
  var contentVersion: String = js.native
  
  /**
    * 3 character code presenting a product's currency based on the ISO 4217 standard.
    */
  var currencyCode: String = js.native
  
  /**
    * The locale formatted price of the product.
    */
  var formattedPrice: String = js.native
  
  /**
    * A Boolean value that indicates whether the App Store has downloadable content
    * for this product. `true` if at least one file has been associated with the
    * product.
    */
  var isDownloadable: Boolean = js.native
  
  /**
    * A description of the product.
    */
  var localizedDescription: String = js.native
  
  /**
    * The name of the product.
    */
  var localizedTitle: String = js.native
  
  /**
    * The cost of the product in the local currency.
    */
  var price: Double = js.native
  
  /**
    * The string that identifies the product to the Apple App Store.
    */
  var productIdentifier: String = js.native
}
object Product {
  
  @scala.inline
  def apply(
    contentLengths: js.Array[Double],
    contentVersion: String,
    currencyCode: String,
    formattedPrice: String,
    isDownloadable: Boolean,
    localizedDescription: String,
    localizedTitle: String,
    price: Double,
    productIdentifier: String
  ): Product = {
    val __obj = js.Dynamic.literal(contentLengths = contentLengths.asInstanceOf[js.Any], contentVersion = contentVersion.asInstanceOf[js.Any], currencyCode = currencyCode.asInstanceOf[js.Any], formattedPrice = formattedPrice.asInstanceOf[js.Any], isDownloadable = isDownloadable.asInstanceOf[js.Any], localizedDescription = localizedDescription.asInstanceOf[js.Any], localizedTitle = localizedTitle.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], productIdentifier = productIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[Product]
  }
  
  @scala.inline
  implicit class ProductMutableBuilder[Self <: Product] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentLengths(value: js.Array[Double]): Self = StObject.set(x, "contentLengths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentLengthsVarargs(value: Double*): Self = StObject.set(x, "contentLengths", js.Array(value :_*))
    
    @scala.inline
    def setContentVersion(value: String): Self = StObject.set(x, "contentVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyCode(value: String): Self = StObject.set(x, "currencyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormattedPrice(value: String): Self = StObject.set(x, "formattedPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDownloadable(value: Boolean): Self = StObject.set(x, "isDownloadable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalizedDescription(value: String): Self = StObject.set(x, "localizedDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalizedTitle(value: String): Self = StObject.set(x, "localizedTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrice(value: Double): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductIdentifier(value: String): Self = StObject.set(x, "productIdentifier", value.asInstanceOf[js.Any])
  }
}
