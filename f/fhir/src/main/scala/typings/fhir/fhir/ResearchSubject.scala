package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Investigation to increase healthcare-related patient-independent knowledge
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ @js.native
trait ResearchSubject extends DomainResource {
  
  /**
    * Contains extended information for property 'actualArm'.
    */
  var _actualArm: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'assignedArm'.
    */
  var _assignedArm: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  
  /**
    * What path was followed
    */
  var actualArm: js.UndefOr[String] = js.native
  
  /**
    * What path should be followed
    */
  var assignedArm: js.UndefOr[String] = js.native
  
  /**
    * Agreement to participate in study
    */
  var consent: js.UndefOr[Reference] = js.native
  
  /**
    * Business Identifier for research subject
    */
  var identifier: js.UndefOr[Identifier] = js.native
  
  /**
    * Who is part of study
    */
  var individual: Reference = js.native
  
  /**
    * Start and end of participation
    */
  var period: js.UndefOr[Period] = js.native
  
  /**
    * candidate | enrolled | active | suspended | withdrawn | completed
    */
  var status: code = js.native
  
  /**
    * Study subject is part of
    */
  var study: Reference = js.native
}
object ResearchSubject {
  
  @scala.inline
  def apply(individual: Reference, status: code, study: Reference): ResearchSubject = {
    val __obj = js.Dynamic.literal(individual = individual.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], study = study.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResearchSubject]
  }
  
  @scala.inline
  implicit class ResearchSubjectMutableBuilder[Self <: ResearchSubject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActualArm(value: String): Self = StObject.set(x, "actualArm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActualArmUndefined: Self = StObject.set(x, "actualArm", js.undefined)
    
    @scala.inline
    def setAssignedArm(value: String): Self = StObject.set(x, "assignedArm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssignedArmUndefined: Self = StObject.set(x, "assignedArm", js.undefined)
    
    @scala.inline
    def setConsent(value: Reference): Self = StObject.set(x, "consent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsentUndefined: Self = StObject.set(x, "consent", js.undefined)
    
    @scala.inline
    def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    @scala.inline
    def setIndividual(value: Reference): Self = StObject.set(x, "individual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    @scala.inline
    def setStatus(value: code): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStudy(value: Reference): Self = StObject.set(x, "study", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_actualArm(value: Element): Self = StObject.set(x, "_actualArm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_actualArmUndefined: Self = StObject.set(x, "_actualArm", js.undefined)
    
    @scala.inline
    def set_assignedArm(value: Element): Self = StObject.set(x, "_assignedArm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_assignedArmUndefined: Self = StObject.set(x, "_assignedArm", js.undefined)
    
    @scala.inline
    def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
