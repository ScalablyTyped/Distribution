package typings.fhir.fhir

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
  implicit class ResearchSubjectOps[Self <: ResearchSubject] (val x: Self) extends AnyVal {
    
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
    def setIndividual(value: Reference): Self = this.set("individual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: code): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStudy(value: Reference): Self = this.set("study", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_actualArm(value: Element): Self = this.set("_actualArm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_actualArm: Self = this.set("_actualArm", js.undefined)
    
    @scala.inline
    def set_assignedArm(value: Element): Self = this.set("_assignedArm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_assignedArm: Self = this.set("_assignedArm", js.undefined)
    
    @scala.inline
    def set_status(value: Element): Self = this.set("_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_status: Self = this.set("_status", js.undefined)
    
    @scala.inline
    def setActualArm(value: String): Self = this.set("actualArm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActualArm: Self = this.set("actualArm", js.undefined)
    
    @scala.inline
    def setAssignedArm(value: String): Self = this.set("assignedArm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssignedArm: Self = this.set("assignedArm", js.undefined)
    
    @scala.inline
    def setConsent(value: Reference): Self = this.set("consent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConsent: Self = this.set("consent", js.undefined)
    
    @scala.inline
    def setIdentifier(value: Identifier): Self = this.set("identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
    
    @scala.inline
    def setPeriod(value: Period): Self = this.set("period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeriod: Self = this.set("period", js.undefined)
  }
}
