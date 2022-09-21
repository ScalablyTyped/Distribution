package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RatioRange
  extends StObject
     with Element {
  
  /**
    * The value of the denominator.
    */
  var denominator: js.UndefOr[Quantity] = js.undefined
  
  /**
    * If the high element is missing, the high boundary is not known.
    */
  var highNumerator: js.UndefOr[Quantity] = js.undefined
  
  /**
    * If the low element is missing, the low boundary is not known.
    */
  var lowNumerator: js.UndefOr[Quantity] = js.undefined
}
object RatioRange {
  
  inline def apply(): RatioRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RatioRange]
  }
  
  extension [Self <: RatioRange](x: Self) {
    
    inline def setDenominator(value: Quantity): Self = StObject.set(x, "denominator", value.asInstanceOf[js.Any])
    
    inline def setDenominatorUndefined: Self = StObject.set(x, "denominator", js.undefined)
    
    inline def setHighNumerator(value: Quantity): Self = StObject.set(x, "highNumerator", value.asInstanceOf[js.Any])
    
    inline def setHighNumeratorUndefined: Self = StObject.set(x, "highNumerator", js.undefined)
    
    inline def setLowNumerator(value: Quantity): Self = StObject.set(x, "lowNumerator", value.asInstanceOf[js.Any])
    
    inline def setLowNumeratorUndefined: Self = StObject.set(x, "lowNumerator", js.undefined)
  }
}
