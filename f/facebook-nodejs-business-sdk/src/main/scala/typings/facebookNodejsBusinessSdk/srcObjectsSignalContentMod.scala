package typings.facebookNodejsBusinessSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsSignalContentMod {
  
  @JSImport("facebook-nodejs-business-sdk/src/objects/signal/content", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Content {
    def this(
      id: String,
      quantity: Double,
      price: Double,
      item_price: Double,
      title: String,
      description: String,
      brand: String,
      category: String,
      delivery_category: String,
      tax: Double,
      external_content_id: String
    ) = this()
  }
  
  @js.native
  trait Content extends StObject {
    
    var _business_data_content: typings.facebookNodejsBusinessSdk.srcObjectsBusinessdataapiContentMod.default = js.native
    
    var _server_content: typings.facebookNodejsBusinessSdk.srcObjectsServersideContentMod.default = js.native
    
    def brand: String = js.native
    def brand_=(brand: String): Unit = js.native
    
    def business_data_content: typings.facebookNodejsBusinessSdk.srcObjectsBusinessdataapiContentMod.default = js.native
    
    def category: String = js.native
    def category_=(category: String): Unit = js.native
    
    def delivery_category: String = js.native
    def delivery_category_=(delivery_category: String): Unit = js.native
    
    def description: String = js.native
    def description_=(description: String): Unit = js.native
    
    def external_content_id: String = js.native
    def external_content_id_=(external_content_id: String): Unit = js.native
    
    def id: String = js.native
    def id_=(id: String): Unit = js.native
    
    def item_price: Double = js.native
    def item_price_=(item_price: Double): Unit = js.native
    
    def price: Double = js.native
    def price_=(price: Double): Unit = js.native
    
    def quantity: Double = js.native
    def quantity_=(quantity: Double): Unit = js.native
    
    def server_content: typings.facebookNodejsBusinessSdk.srcObjectsServersideContentMod.default = js.native
    
    def setBrand(brand: String): Content = js.native
    
    def setCategory(category: String): Content = js.native
    
    def setDeliveryCategory(delivery_category: String): Content = js.native
    
    def setDescription(description: String): Content = js.native
    
    def setExternalContentId(external_content_id: String): Content = js.native
    
    def setId(id: String): Content = js.native
    
    def setItemPrice(item_price: Double): Content = js.native
    
    def setPrice(price: Double): Content = js.native
    
    def setQuantity(quantity: Double): Content = js.native
    
    def setTax(tax: Double): Content = js.native
    
    def setTitle(title: String): Content = js.native
    
    def tax: Double = js.native
    def tax_=(tax: Double): Unit = js.native
    
    def title: String = js.native
    def title_=(title: String): Unit = js.native
  }
}
