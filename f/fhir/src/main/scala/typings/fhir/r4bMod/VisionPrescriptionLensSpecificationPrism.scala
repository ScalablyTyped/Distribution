package typings.fhir.r4bMod

import typings.fhir.fhirStrings.down
import typings.fhir.fhirStrings.in
import typings.fhir.fhirStrings.out
import typings.fhir.fhirStrings.up
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VisionPrescriptionLensSpecificationPrism
  extends StObject
     with BackboneElement {
  
  var _base: js.UndefOr[Element] = js.undefined
  
  /**
    * Amount of prism to compensate for eye alignment in fractional units.
    */
  var amount: Double
  
  /**
    * The relative base, or reference lens edge, for the prism.
    */
  var base: up | down | in | out
}
object VisionPrescriptionLensSpecificationPrism {
  
  inline def apply(amount: Double, base: up | down | in | out): VisionPrescriptionLensSpecificationPrism = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisionPrescriptionLensSpecificationPrism]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VisionPrescriptionLensSpecificationPrism] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setBase(value: up | down | in | out): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    inline def set_base(value: Element): Self = StObject.set(x, "_base", value.asInstanceOf[js.Any])
    
    inline def set_baseUndefined: Self = StObject.set(x, "_base", js.undefined)
  }
}
