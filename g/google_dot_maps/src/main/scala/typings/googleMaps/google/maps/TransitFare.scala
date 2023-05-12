package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransitFare extends StObject {
  
  /**
    * An <a href="http://en.wikipedia.org/wiki/ISO_4217">ISO 4217 currency
    * code</a> indicating the currency in which the fare is expressed.
    */
  var currency: String
  
  /**
    * The numerical value of the fare, expressed in the given
    * <code>currency</code>.
    */
  var value: Double
}
object TransitFare {
  
  inline def apply(currency: String, value: Double): TransitFare = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitFare]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransitFare] (val x: Self) extends AnyVal {
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
