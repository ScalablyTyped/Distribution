package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Members of the care team
  */
@js.native
trait ClaimCareTeam extends BackboneElement {
  
  /**
    * Contains extended information for property 'responsible'.
    */
  var _responsible: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'sequence'.
    */
  var _sequence: js.UndefOr[Element] = js.native
  
  /**
    * Provider individual or organization
    */
  var provider: Reference = js.native
  
  /**
    * Type, classification or Specialization
    */
  var qualification: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Billing provider
    */
  var responsible: js.UndefOr[Boolean] = js.native
  
  /**
    * Role on the team
    */
  var role: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Number to covey order of careTeam
    */
  var sequence: positiveInt = js.native
}
object ClaimCareTeam {
  
  @scala.inline
  def apply(provider: Reference, sequence: positiveInt): ClaimCareTeam = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClaimCareTeam]
  }
  
  @scala.inline
  implicit class ClaimCareTeamOps[Self <: ClaimCareTeam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setProvider(value: Reference): Self = this.set("provider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSequence(value: positiveInt): Self = this.set("sequence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_responsible(value: Element): Self = this.set("_responsible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_responsible: Self = this.set("_responsible", js.undefined)
    
    @scala.inline
    def set_sequence(value: Element): Self = this.set("_sequence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_sequence: Self = this.set("_sequence", js.undefined)
    
    @scala.inline
    def setQualification(value: CodeableConcept): Self = this.set("qualification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQualification: Self = this.set("qualification", js.undefined)
    
    @scala.inline
    def setResponsible(value: Boolean): Self = this.set("responsible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponsible: Self = this.set("responsible", js.undefined)
    
    @scala.inline
    def setRole(value: CodeableConcept): Self = this.set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
  }
}
