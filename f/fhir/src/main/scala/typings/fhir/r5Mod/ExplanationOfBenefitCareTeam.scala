package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExplanationOfBenefitCareTeam
  extends StObject
     with BackboneElement {
  
  var _responsible: js.UndefOr[Element] = js.undefined
  
  /**
    * Member of the team who provided the product or service.
    */
  var provider: Reference
  
  /**
    * Responsible might not be required when there is only a single provider listed.
    */
  var responsible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Role might not be required when there is only a single provider listed.
    */
  var role: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * A number to uniquely identify care team entries.
    */
  var sequence: Double
  
  /**
    * The specialization of the practitioner or provider which is applicable for this service.
    */
  var specialty: js.UndefOr[CodeableConcept] = js.undefined
}
object ExplanationOfBenefitCareTeam {
  
  inline def apply(provider: Reference, sequence: Double): ExplanationOfBenefitCareTeam = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExplanationOfBenefitCareTeam]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExplanationOfBenefitCareTeam] (val x: Self) extends AnyVal {
    
    inline def setProvider(value: Reference): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    inline def setResponsible(value: Boolean): Self = StObject.set(x, "responsible", value.asInstanceOf[js.Any])
    
    inline def setResponsibleUndefined: Self = StObject.set(x, "responsible", js.undefined)
    
    inline def setRole(value: CodeableConcept): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setSequence(value: Double): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
    
    inline def setSpecialty(value: CodeableConcept): Self = StObject.set(x, "specialty", value.asInstanceOf[js.Any])
    
    inline def setSpecialtyUndefined: Self = StObject.set(x, "specialty", js.undefined)
    
    inline def set_responsible(value: Element): Self = StObject.set(x, "_responsible", value.asInstanceOf[js.Any])
    
    inline def set_responsibleUndefined: Self = StObject.set(x, "_responsible", js.undefined)
  }
}
