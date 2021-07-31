package typings.googleMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransitFare extends StObject {
  
  /** An [ISO 4217 currency code](https://en.wikipedia.org/wiki/ISO_4217) indicating the currency that the amount is expressed in. */
  var currency: String
  
  /** The total fare amount, formatted in the requested language. */
  var text: String
  
  /** The total fare amount, in the currency specified above. */
  var value: Double
}
object TransitFare {
  
  @scala.inline
  def apply(currency: String, text: String, value: Double): TransitFare = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitFare]
  }
  
  @scala.inline
  implicit class TransitFareMutableBuilder[Self <: TransitFare] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
