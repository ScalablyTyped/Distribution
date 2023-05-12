package typings.facebookNodejsBusinessSdk

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsServersideContentMod {
  
  @JSImport("facebook-nodejs-business-sdk/src/objects/serverside/content", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Content {
    def this(
      id: js.UndefOr[String],
      quantity: js.UndefOr[Double],
      item_price: js.UndefOr[Double],
      title: js.UndefOr[String],
      description: js.UndefOr[String],
      brand: js.UndefOr[String],
      category: js.UndefOr[String],
      delivery_category: js.UndefOr[String]
    ) = this()
  }
  
  @js.native
  trait Content extends StObject {
    
    var _brand: String = js.native
    
    var _category: String = js.native
    
    var _delivery_category: String = js.native
    
    var _description: String = js.native
    
    var _id: String = js.native
    
    var _item_price: Double = js.native
    
    var _quantity: Double = js.native
    
    var _title: String = js.native
    
    def brand: String = js.native
    def brand_=(brand: String): Unit = js.native
    
    def category: String = js.native
    def category_=(category: String): Unit = js.native
    
    def delivery_category: String = js.native
    def delivery_category_=(delivery_category: String): Unit = js.native
    
    def description: String = js.native
    def description_=(description: String): Unit = js.native
    
    def id: String = js.native
    def id_=(id: String): Unit = js.native
    
    def item_price: Double = js.native
    def item_price_=(item_price: Double): Unit = js.native
    
    def normalize(): Record[String, Any] = js.native
    
    def quantity: Double = js.native
    def quantity_=(quantity: Double): Unit = js.native
    
    def setBrand(brand: String): Content = js.native
    
    def setCategory(category: String): Content = js.native
    
    def setDeliveryCategory(delivery_category: String): Content = js.native
    
    def setDescription(description: String): Content = js.native
    
    def setId(id: String): Content = js.native
    
    def setItemPrice(item_price: Double): Content = js.native
    
    def setQuantity(quantity: Double): Content = js.native
    
    def setTitle(title: String): Content = js.native
    
    def title: String = js.native
    def title_=(title: String): Unit = js.native
  }
}
