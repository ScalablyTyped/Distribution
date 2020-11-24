package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Clinical context of document
  */
@js.native
trait DocumentReferenceContext extends BackboneElement {
  
  /**
    * Context of the document  content
    */
  var encounter: js.UndefOr[Reference] = js.native
  
  /**
    * Main clinical acts documented
    */
  var event: js.UndefOr[js.Array[CodeableConcept]] = js.native
  
  /**
    * Kind of facility where patient was seen
    */
  var facilityType: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Time of service that is being documented
    */
  var period: js.UndefOr[Period] = js.native
  
  /**
    * Additional details about where the content was created (e.g. clinical specialty)
    */
  var practiceSetting: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Related identifiers or resources
    */
  var related: js.UndefOr[js.Array[DocumentReferenceContextRelated]] = js.native
  
  /**
    * Patient demographics from source
    */
  var sourcePatientInfo: js.UndefOr[Reference] = js.native
}
object DocumentReferenceContext {
  
  @scala.inline
  def apply(): DocumentReferenceContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentReferenceContext]
  }
  
  @scala.inline
  implicit class DocumentReferenceContextOps[Self <: DocumentReferenceContext] (val x: Self) extends AnyVal {
    
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
    def setEncounter(value: Reference): Self = this.set("encounter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncounter: Self = this.set("encounter", js.undefined)
    
    @scala.inline
    def setEventVarargs(value: CodeableConcept*): Self = this.set("event", js.Array(value :_*))
    
    @scala.inline
    def setEvent(value: js.Array[CodeableConcept]): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvent: Self = this.set("event", js.undefined)
    
    @scala.inline
    def setFacilityType(value: CodeableConcept): Self = this.set("facilityType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFacilityType: Self = this.set("facilityType", js.undefined)
    
    @scala.inline
    def setPeriod(value: Period): Self = this.set("period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeriod: Self = this.set("period", js.undefined)
    
    @scala.inline
    def setPracticeSetting(value: CodeableConcept): Self = this.set("practiceSetting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePracticeSetting: Self = this.set("practiceSetting", js.undefined)
    
    @scala.inline
    def setRelatedVarargs(value: DocumentReferenceContextRelated*): Self = this.set("related", js.Array(value :_*))
    
    @scala.inline
    def setRelated(value: js.Array[DocumentReferenceContextRelated]): Self = this.set("related", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelated: Self = this.set("related", js.undefined)
    
    @scala.inline
    def setSourcePatientInfo(value: Reference): Self = this.set("sourcePatientInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourcePatientInfo: Self = this.set("sourcePatientInfo", js.undefined)
  }
}
