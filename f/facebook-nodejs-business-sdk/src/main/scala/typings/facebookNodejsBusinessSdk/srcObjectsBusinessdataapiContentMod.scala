package typings.facebookNodejsBusinessSdk

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcObjectsBusinessdataapiContentMod {
  
  @JSImport("facebook-nodejs-business-sdk/src/objects/businessdataapi/content", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Content {
    def this(
      id: String,
      quantity: Double,
      price: Double,
      title: String,
      tax: Double,
      external_content_id: String
    ) = this()
  }
  
  @js.native
  trait Content extends StObject {
    
    var _external_content_id: String = js.native
    
    var _id: String = js.native
    
    var _price: Double = js.native
    
    var _quantity: Double = js.native
    
    var _tax: Double = js.native
    
    var _title: String = js.native
    
    def external_content_id: String = js.native
    def external_content_id_=(external_content_id: String): Unit = js.native
    
    def id: String = js.native
    def id_=(id: String): Unit = js.native
    
    def price: Double = js.native
    def price_=(price: Double): Unit = js.native
    
    def quantity: Double = js.native
    def quantity_=(quantity: Double): Unit = js.native
    
    def setExternalContentID(external_content_id: String): Content = js.native
    
    def setId(id: String): Content = js.native
    
    def setPrice(price: Double): Content = js.native
    
    def setQuantity(quantity: Double): Content = js.native
    
    def setTax(tax: Double): Content = js.native
    
    def setTitle(title: String): Content = js.native
    
    def tax: Double = js.native
    def tax_=(tax: Double): Unit = js.native
    
    def title: String = js.native
    def title_=(title: String): Unit = js.native
    
    def toJson(): Record[String, Any] = js.native
  }
}
