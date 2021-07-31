package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPrice extends StObject {
  
  /**
    * 3 letter Currency code, as defined by ISO 4217.
    */
  var currency: js.UndefOr[String] = js.undefined
  
  /**
    * The price in millionths of the currency base unit represented as a
    * string.
    */
  var priceMicros: js.UndefOr[String] = js.undefined
}
object SchemaPrice {
  
  @scala.inline
  def apply(): SchemaPrice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPrice]
  }
  
  @scala.inline
  implicit class SchemaPriceMutableBuilder[Self <: SchemaPrice] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
    
    @scala.inline
    def setPriceMicros(value: String): Self = StObject.set(x, "priceMicros", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriceMicrosUndefined: Self = StObject.set(x, "priceMicros", js.undefined)
  }
}
