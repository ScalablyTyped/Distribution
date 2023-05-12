package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubstanceAmountReferenceRange
  extends StObject
     with Element {
  
  /**
    * Upper limit possible or expected.
    */
  var highLimit: js.UndefOr[Quantity] = js.undefined
  
  /**
    * Lower limit possible or expected.
    */
  var lowLimit: js.UndefOr[Quantity] = js.undefined
}
object SubstanceAmountReferenceRange {
  
  inline def apply(): SubstanceAmountReferenceRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubstanceAmountReferenceRange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubstanceAmountReferenceRange] (val x: Self) extends AnyVal {
    
    inline def setHighLimit(value: Quantity): Self = StObject.set(x, "highLimit", value.asInstanceOf[js.Any])
    
    inline def setHighLimitUndefined: Self = StObject.set(x, "highLimit", js.undefined)
    
    inline def setLowLimit(value: Quantity): Self = StObject.set(x, "lowLimit", value.asInstanceOf[js.Any])
    
    inline def setLowLimitUndefined: Self = StObject.set(x, "lowLimit", js.undefined)
  }
}
