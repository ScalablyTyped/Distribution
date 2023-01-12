package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClinicalUseDefinitionContraindicationOtherTherapy
  extends StObject
     with BackboneElement {
  
  /**
    * The type of relationship between the medicinal product indication or contraindication and another therapy.
    */
  var relationshipType: CodeableConcept
  
  /**
    * Reference to a specific medication (active substance, medicinal product or class of products) as part of an indication or contraindication.
    */
  var therapy: CodeableReference
}
object ClinicalUseDefinitionContraindicationOtherTherapy {
  
  inline def apply(relationshipType: CodeableConcept, therapy: CodeableReference): ClinicalUseDefinitionContraindicationOtherTherapy = {
    val __obj = js.Dynamic.literal(relationshipType = relationshipType.asInstanceOf[js.Any], therapy = therapy.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClinicalUseDefinitionContraindicationOtherTherapy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClinicalUseDefinitionContraindicationOtherTherapy] (val x: Self) extends AnyVal {
    
    inline def setRelationshipType(value: CodeableConcept): Self = StObject.set(x, "relationshipType", value.asInstanceOf[js.Any])
    
    inline def setTherapy(value: CodeableReference): Self = StObject.set(x, "therapy", value.asInstanceOf[js.Any])
  }
}
