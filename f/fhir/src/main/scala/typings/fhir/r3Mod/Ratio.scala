package typings.fhir.r3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ratio
  extends StObject
     with Element {
  
  /**
    * The value of the denominator.
    */
  var denominator: js.UndefOr[Quantity] = js.undefined
  
  /**
    * The value of the numerator.
    */
  var numerator: js.UndefOr[Quantity] = js.undefined
}
object Ratio {
  
  inline def apply(): Ratio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ratio]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ratio] (val x: Self) extends AnyVal {
    
    inline def setDenominator(value: Quantity): Self = StObject.set(x, "denominator", value.asInstanceOf[js.Any])
    
    inline def setDenominatorUndefined: Self = StObject.set(x, "denominator", js.undefined)
    
    inline def setNumerator(value: Quantity): Self = StObject.set(x, "numerator", value.asInstanceOf[js.Any])
    
    inline def setNumeratorUndefined: Self = StObject.set(x, "numerator", js.undefined)
  }
}
