package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Clinical context of document
  */
trait DocumentReferenceContext
  extends StObject
     with BackboneElement {
  
  /**
    * Context of the document  content
    */
  var encounter: js.UndefOr[Reference] = js.undefined
  
  /**
    * Main clinical acts documented
    */
  var event: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Kind of facility where patient was seen
    */
  var facilityType: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Time of service that is being documented
    */
  var period: js.UndefOr[Period] = js.undefined
  
  /**
    * Additional details about where the content was created (e.g. clinical specialty)
    */
  var practiceSetting: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Related identifiers or resources
    */
  var related: js.UndefOr[js.Array[DocumentReferenceContextRelated]] = js.undefined
  
  /**
    * Patient demographics from source
    */
  var sourcePatientInfo: js.UndefOr[Reference] = js.undefined
}
object DocumentReferenceContext {
  
  @scala.inline
  def apply(): DocumentReferenceContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentReferenceContext]
  }
  
  @scala.inline
  implicit class DocumentReferenceContextMutableBuilder[Self <: DocumentReferenceContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncounter(value: Reference): Self = StObject.set(x, "encounter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncounterUndefined: Self = StObject.set(x, "encounter", js.undefined)
    
    @scala.inline
    def setEvent(value: js.Array[CodeableConcept]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    @scala.inline
    def setEventVarargs(value: CodeableConcept*): Self = StObject.set(x, "event", js.Array(value :_*))
    
    @scala.inline
    def setFacilityType(value: CodeableConcept): Self = StObject.set(x, "facilityType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFacilityTypeUndefined: Self = StObject.set(x, "facilityType", js.undefined)
    
    @scala.inline
    def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    @scala.inline
    def setPracticeSetting(value: CodeableConcept): Self = StObject.set(x, "practiceSetting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPracticeSettingUndefined: Self = StObject.set(x, "practiceSetting", js.undefined)
    
    @scala.inline
    def setRelated(value: js.Array[DocumentReferenceContextRelated]): Self = StObject.set(x, "related", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelatedUndefined: Self = StObject.set(x, "related", js.undefined)
    
    @scala.inline
    def setRelatedVarargs(value: DocumentReferenceContextRelated*): Self = StObject.set(x, "related", js.Array(value :_*))
    
    @scala.inline
    def setSourcePatientInfo(value: Reference): Self = StObject.set(x, "sourcePatientInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcePatientInfoUndefined: Self = StObject.set(x, "sourcePatientInfo", js.undefined)
  }
}
