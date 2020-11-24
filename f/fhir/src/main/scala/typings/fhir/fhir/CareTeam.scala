package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Planned participants in the coordination and delivery of care for a patient or group
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ @js.native
trait CareTeam extends DomainResource {
  
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  
  /**
    * Type of team
    */
  var category: js.UndefOr[js.Array[CodeableConcept]] = js.native
  
  /**
    * Encounter or episode associated with CareTeam
    */
  var context: js.UndefOr[Reference] = js.native
  
  /**
    * External Ids for this team
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  
  /**
    * Organization responsible for the care team
    */
  var managingOrganization: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * Name of the team, such as crisis assessment team
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Comments made about the CareTeam
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.native
  
  /**
    * Members of the team
    */
  var participant: js.UndefOr[js.Array[CareTeamParticipant]] = js.native
  
  /**
    * Time period team covers
    */
  var period: js.UndefOr[Period] = js.native
  
  /**
    * Why the care team exists
    */
  var reasonCode: js.UndefOr[js.Array[CodeableConcept]] = js.native
  
  /**
    * Why the care team exists
    */
  var reasonReference: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * proposed | active | suspended | inactive | entered-in-error
    */
  var status: js.UndefOr[code] = js.native
  
  /**
    * Who care team is for
    */
  var subject: js.UndefOr[Reference] = js.native
}
object CareTeam {
  
  @scala.inline
  def apply(): CareTeam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CareTeam]
  }
  
  @scala.inline
  implicit class CareTeamOps[Self <: CareTeam] (val x: Self) extends AnyVal {
    
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
    def set_name(value: Element): Self = this.set("_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_name: Self = this.set("_name", js.undefined)
    
    @scala.inline
    def set_status(value: Element): Self = this.set("_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_status: Self = this.set("_status", js.undefined)
    
    @scala.inline
    def setCategoryVarargs(value: CodeableConcept*): Self = this.set("category", js.Array(value :_*))
    
    @scala.inline
    def setCategory(value: js.Array[CodeableConcept]): Self = this.set("category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategory: Self = this.set("category", js.undefined)
    
    @scala.inline
    def setContext(value: Reference): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    
    @scala.inline
    def setIdentifierVarargs(value: Identifier*): Self = this.set("identifier", js.Array(value :_*))
    
    @scala.inline
    def setIdentifier(value: js.Array[Identifier]): Self = this.set("identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
    
    @scala.inline
    def setManagingOrganizationVarargs(value: Reference*): Self = this.set("managingOrganization", js.Array(value :_*))
    
    @scala.inline
    def setManagingOrganization(value: js.Array[Reference]): Self = this.set("managingOrganization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManagingOrganization: Self = this.set("managingOrganization", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNoteVarargs(value: Annotation*): Self = this.set("note", js.Array(value :_*))
    
    @scala.inline
    def setNote(value: js.Array[Annotation]): Self = this.set("note", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNote: Self = this.set("note", js.undefined)
    
    @scala.inline
    def setParticipantVarargs(value: CareTeamParticipant*): Self = this.set("participant", js.Array(value :_*))
    
    @scala.inline
    def setParticipant(value: js.Array[CareTeamParticipant]): Self = this.set("participant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParticipant: Self = this.set("participant", js.undefined)
    
    @scala.inline
    def setPeriod(value: Period): Self = this.set("period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeriod: Self = this.set("period", js.undefined)
    
    @scala.inline
    def setReasonCodeVarargs(value: CodeableConcept*): Self = this.set("reasonCode", js.Array(value :_*))
    
    @scala.inline
    def setReasonCode(value: js.Array[CodeableConcept]): Self = this.set("reasonCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReasonCode: Self = this.set("reasonCode", js.undefined)
    
    @scala.inline
    def setReasonReferenceVarargs(value: Reference*): Self = this.set("reasonReference", js.Array(value :_*))
    
    @scala.inline
    def setReasonReference(value: js.Array[Reference]): Self = this.set("reasonReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReasonReference: Self = this.set("reasonReference", js.undefined)
    
    @scala.inline
    def setStatus(value: code): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setSubject(value: Reference): Self = this.set("subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubject: Self = this.set("subject", js.undefined)
  }
}
