package typings.fhir.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentReferenceContext
  extends StObject
     with BackboneElement {
  
  /**
    * Describes the clinical encounter or type of care that the document content is associated with.
    */
  var encounter: js.UndefOr[Reference] = js.undefined
  
  /**
    * This list of codes represents the main clinical acts, such as a colonoscopy or an appendectomy, being documented. In some cases, the event is inherent in the typeCode, such as a "History and Physical Report" in which the procedure being documented is necessarily a "History and Physical" act.
    */
  var event: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * The kind of facility where the patient was seen.
    */
  var facilityType: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The time period over which the service that is described by the document was provided.
    */
  var period: js.UndefOr[Period] = js.undefined
  
  /**
    * This is an important piece of metadata that providers often rely upon to quickly sort and/or filter out to find specific content.
    */
  var practiceSetting: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Related identifiers or resources associated with the DocumentReference.
    */
  var related: js.UndefOr[js.Array[DocumentReferenceContextRelated]] = js.undefined
  
  /**
    * The Patient Information as known when the document was published. May be a reference to a version specific, or contained.
    */
  var sourcePatientInfo: js.UndefOr[Reference] = js.undefined
}
object DocumentReferenceContext {
  
  inline def apply(): DocumentReferenceContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentReferenceContext]
  }
  
  extension [Self <: DocumentReferenceContext](x: Self) {
    
    inline def setEncounter(value: Reference): Self = StObject.set(x, "encounter", value.asInstanceOf[js.Any])
    
    inline def setEncounterUndefined: Self = StObject.set(x, "encounter", js.undefined)
    
    inline def setEvent(value: js.Array[CodeableConcept]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    inline def setEventVarargs(value: CodeableConcept*): Self = StObject.set(x, "event", js.Array(value*))
    
    inline def setFacilityType(value: CodeableConcept): Self = StObject.set(x, "facilityType", value.asInstanceOf[js.Any])
    
    inline def setFacilityTypeUndefined: Self = StObject.set(x, "facilityType", js.undefined)
    
    inline def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    inline def setPracticeSetting(value: CodeableConcept): Self = StObject.set(x, "practiceSetting", value.asInstanceOf[js.Any])
    
    inline def setPracticeSettingUndefined: Self = StObject.set(x, "practiceSetting", js.undefined)
    
    inline def setRelated(value: js.Array[DocumentReferenceContextRelated]): Self = StObject.set(x, "related", value.asInstanceOf[js.Any])
    
    inline def setRelatedUndefined: Self = StObject.set(x, "related", js.undefined)
    
    inline def setRelatedVarargs(value: DocumentReferenceContextRelated*): Self = StObject.set(x, "related", js.Array(value*))
    
    inline def setSourcePatientInfo(value: Reference): Self = StObject.set(x, "sourcePatientInfo", value.asInstanceOf[js.Any])
    
    inline def setSourcePatientInfoUndefined: Self = StObject.set(x, "sourcePatientInfo", js.undefined)
  }
}
