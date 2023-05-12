package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MedicinalProductPharmaceuticalCharacteristics
  extends StObject
     with BackboneElement {
  
  /**
    * A coded characteristic.
    */
  var code: CodeableConcept
  
  /**
    * The status of characteristic e.g. assigned or pending.
    */
  var status: js.UndefOr[CodeableConcept] = js.undefined
}
object MedicinalProductPharmaceuticalCharacteristics {
  
  inline def apply(code: CodeableConcept): MedicinalProductPharmaceuticalCharacteristics = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[MedicinalProductPharmaceuticalCharacteristics]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MedicinalProductPharmaceuticalCharacteristics] (val x: Self) extends AnyVal {
    
    inline def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: CodeableConcept): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
