package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Care Team members
  */
@js.native
trait ExplanationOfBenefitCareTeam extends BackboneElement {
  
  /**
    * Contains extended information for property 'responsible'.
    */
  var _responsible: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'sequence'.
    */
  var _sequence: js.UndefOr[Element] = js.native
  
  /**
    * Member of the Care Team
    */
  var provider: Reference = js.native
  
  /**
    * Type, classification or Specialization
    */
  var qualification: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Billing practitioner
    */
  var responsible: js.UndefOr[Boolean] = js.native
  
  /**
    * Role on the team
    */
  var role: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Number to covey order of careteam
    */
  var sequence: positiveInt = js.native
}
object ExplanationOfBenefitCareTeam {
  
  @scala.inline
  def apply(provider: Reference, sequence: positiveInt): ExplanationOfBenefitCareTeam = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExplanationOfBenefitCareTeam]
  }
  
  @scala.inline
  implicit class ExplanationOfBenefitCareTeamMutableBuilder[Self <: ExplanationOfBenefitCareTeam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProvider(value: Reference): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQualification(value: CodeableConcept): Self = StObject.set(x, "qualification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQualificationUndefined: Self = StObject.set(x, "qualification", js.undefined)
    
    @scala.inline
    def setResponsible(value: Boolean): Self = StObject.set(x, "responsible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponsibleUndefined: Self = StObject.set(x, "responsible", js.undefined)
    
    @scala.inline
    def setRole(value: CodeableConcept): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    @scala.inline
    def setSequence(value: positiveInt): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_responsible(value: Element): Self = StObject.set(x, "_responsible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_responsibleUndefined: Self = StObject.set(x, "_responsible", js.undefined)
    
    @scala.inline
    def set_sequence(value: Element): Self = StObject.set(x, "_sequence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_sequenceUndefined: Self = StObject.set(x, "_sequence", js.undefined)
  }
}
