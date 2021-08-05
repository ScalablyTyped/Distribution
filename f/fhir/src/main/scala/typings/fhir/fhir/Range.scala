package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Set of values bounded by low and high
  */
trait Range
  extends StObject
     with Element {
  
  /**
    * High limit
    */
  var high: js.UndefOr[Quantity] = js.undefined
  
  /**
    * Low limit
    */
  var low: js.UndefOr[Quantity] = js.undefined
}
object Range {
  
  inline def apply(): Range = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Range]
  }
  
  extension [Self <: Range](x: Self) {
    
    inline def setHigh(value: Quantity): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
    
    inline def setHighUndefined: Self = StObject.set(x, "high", js.undefined)
    
    inline def setLow(value: Quantity): Self = StObject.set(x, "low", value.asInstanceOf[js.Any])
    
    inline def setLowUndefined: Self = StObject.set(x, "low", js.undefined)
  }
}
