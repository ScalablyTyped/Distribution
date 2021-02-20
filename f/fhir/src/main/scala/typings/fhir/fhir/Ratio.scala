package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A ratio of two Quantity values - a numerator and a denominator
  */
@js.native
trait Ratio extends Element {
  
  /**
    * Denominator value
    */
  var denominator: js.UndefOr[Quantity] = js.native
  
  /**
    * Numerator value
    */
  var numerator: js.UndefOr[Quantity] = js.native
}
object Ratio {
  
  @scala.inline
  def apply(): Ratio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ratio]
  }
  
  @scala.inline
  implicit class RatioMutableBuilder[Self <: Ratio] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDenominator(value: Quantity): Self = StObject.set(x, "denominator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDenominatorUndefined: Self = StObject.set(x, "denominator", js.undefined)
    
    @scala.inline
    def setNumerator(value: Quantity): Self = StObject.set(x, "numerator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumeratorUndefined: Self = StObject.set(x, "numerator", js.undefined)
  }
}
