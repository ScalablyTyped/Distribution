package typings.facebookInstantGames.FBInstant

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a game's product information.
  */
trait Product extends StObject {
  
  /**
    * The product description
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * A link to the product's associated image
    */
  var imageURI: js.UndefOr[String] = js.undefined
  
  /**
    * The price of the product
    */
  var price: String
  
  /**
    * The currency code for the product
    */
  var priceCurrencyCode: String
  
  /**
    * The product's game-specified identifier
    */
  var productID: String
  
  /**
    * The title of the product
    */
  var title: String
}
object Product {
  
  inline def apply(price: String, priceCurrencyCode: String, productID: String, title: String): Product = {
    val __obj = js.Dynamic.literal(price = price.asInstanceOf[js.Any], priceCurrencyCode = priceCurrencyCode.asInstanceOf[js.Any], productID = productID.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Product]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Product] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setImageURI(value: String): Self = StObject.set(x, "imageURI", value.asInstanceOf[js.Any])
    
    inline def setImageURIUndefined: Self = StObject.set(x, "imageURI", js.undefined)
    
    inline def setPrice(value: String): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    inline def setPriceCurrencyCode(value: String): Self = StObject.set(x, "priceCurrencyCode", value.asInstanceOf[js.Any])
    
    inline def setProductID(value: String): Self = StObject.set(x, "productID", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
