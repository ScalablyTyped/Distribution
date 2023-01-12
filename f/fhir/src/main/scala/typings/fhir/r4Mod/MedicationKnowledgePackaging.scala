package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MedicationKnowledgePackaging
  extends StObject
     with BackboneElement {
  
  /**
    * The number of product units the package would contain if fully loaded.
    */
  var quantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * A code that defines the specific type of packaging that the medication can be found in (e.g. blister sleeve, tube, bottle).
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}
object MedicationKnowledgePackaging {
  
  inline def apply(): MedicationKnowledgePackaging = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MedicationKnowledgePackaging]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MedicationKnowledgePackaging] (val x: Self) extends AnyVal {
    
    inline def setQuantity(value: Quantity): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
