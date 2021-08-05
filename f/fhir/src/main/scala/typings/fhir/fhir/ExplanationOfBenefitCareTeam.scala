package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Care Team members
  */
trait ExplanationOfBenefitCareTeam
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'responsible'.
    */
  var _responsible: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'sequence'.
    */
  var _sequence: js.UndefOr[Element] = js.undefined
  
  /**
    * Member of the Care Team
    */
  var provider: Reference
  
  /**
    * Type, classification or Specialization
    */
  var qualification: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Billing practitioner
    */
  var responsible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Role on the team
    */
  var role: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Number to covey order of careteam
    */
  var sequence: positiveInt
}
object ExplanationOfBenefitCareTeam {
  
  inline def apply(provider: Reference, sequence: positiveInt): ExplanationOfBenefitCareTeam = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExplanationOfBenefitCareTeam]
  }
  
  extension [Self <: ExplanationOfBenefitCareTeam](x: Self) {
    
    inline def setProvider(value: Reference): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    inline def setQualification(value: CodeableConcept): Self = StObject.set(x, "qualification", value.asInstanceOf[js.Any])
    
    inline def setQualificationUndefined: Self = StObject.set(x, "qualification", js.undefined)
    
    inline def setResponsible(value: Boolean): Self = StObject.set(x, "responsible", value.asInstanceOf[js.Any])
    
    inline def setResponsibleUndefined: Self = StObject.set(x, "responsible", js.undefined)
    
    inline def setRole(value: CodeableConcept): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setSequence(value: positiveInt): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
    
    inline def set_responsible(value: Element): Self = StObject.set(x, "_responsible", value.asInstanceOf[js.Any])
    
    inline def set_responsibleUndefined: Self = StObject.set(x, "_responsible", js.undefined)
    
    inline def set_sequence(value: Element): Self = StObject.set(x, "_sequence", value.asInstanceOf[js.Any])
    
    inline def set_sequenceUndefined: Self = StObject.set(x, "_sequence", js.undefined)
  }
}
