package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
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
  implicit class CareTeamMutableBuilder[Self <: CareTeam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategory(value: js.Array[CodeableConcept]): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    @scala.inline
    def setCategoryVarargs(value: CodeableConcept*): Self = StObject.set(x, "category", js.Array(value :_*))
    
    @scala.inline
    def setContext(value: Reference): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    @scala.inline
    def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    @scala.inline
    def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value :_*))
    
    @scala.inline
    def setManagingOrganization(value: js.Array[Reference]): Self = StObject.set(x, "managingOrganization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagingOrganizationUndefined: Self = StObject.set(x, "managingOrganization", js.undefined)
    
    @scala.inline
    def setManagingOrganizationVarargs(value: Reference*): Self = StObject.set(x, "managingOrganization", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    @scala.inline
    def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value :_*))
    
    @scala.inline
    def setParticipant(value: js.Array[CareTeamParticipant]): Self = StObject.set(x, "participant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParticipantUndefined: Self = StObject.set(x, "participant", js.undefined)
    
    @scala.inline
    def setParticipantVarargs(value: CareTeamParticipant*): Self = StObject.set(x, "participant", js.Array(value :_*))
    
    @scala.inline
    def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    @scala.inline
    def setReasonCode(value: js.Array[CodeableConcept]): Self = StObject.set(x, "reasonCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonCodeUndefined: Self = StObject.set(x, "reasonCode", js.undefined)
    
    @scala.inline
    def setReasonCodeVarargs(value: CodeableConcept*): Self = StObject.set(x, "reasonCode", js.Array(value :_*))
    
    @scala.inline
    def setReasonReference(value: js.Array[Reference]): Self = StObject.set(x, "reasonReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonReferenceUndefined: Self = StObject.set(x, "reasonReference", js.undefined)
    
    @scala.inline
    def setReasonReferenceVarargs(value: Reference*): Self = StObject.set(x, "reasonReference", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: code): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    @scala.inline
    def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
    
    @scala.inline
    def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
