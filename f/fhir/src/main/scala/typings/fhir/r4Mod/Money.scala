package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Money
  extends StObject
     with Element {
  
  var _currency: js.UndefOr[Element] = js.undefined
  
  /**
    * ISO 4217 Currency Code.
    */
  var currency: js.UndefOr[String] = js.undefined
  
  /**
    * Monetary values have their own rules for handling precision (refer to standard accounting text books).
    */
  var value: js.UndefOr[Double] = js.undefined
}
object Money {
  
  inline def apply(): Money = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Money]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Money] (val x: Self) extends AnyVal {
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def set_currency(value: Element): Self = StObject.set(x, "_currency", value.asInstanceOf[js.Any])
    
    inline def set_currencyUndefined: Self = StObject.set(x, "_currency", js.undefined)
  }
}
