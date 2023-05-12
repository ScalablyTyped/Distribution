package typings.fhir.r4bMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentReferenceContext
  extends StObject
     with BackboneElement {
  
  /**
    * Describes the clinical encounter or type of care that the document content is associated with.
    */
  var encounter: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * An event can further specialize the act inherent in the type, such as  where it is simply "Procedure Report" and the procedure was a "colonoscopy". If one or more event codes are included, they shall not conflict with the values inherent in the class or type elements as such a conflict would create an ambiguous situation.
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
    * This element should be based on a coarse classification system for the class of specialty practice. Recommend the use of the classification system for Practice Setting, such as that described by the Subject Matter Domain in LOINC.
    */
  var practiceSetting: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * May be identifiers or resources that caused the DocumentReference or referenced Document to be created.
    */
  var related: js.UndefOr[js.Array[Reference]] = js.undefined
  
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DocumentReferenceContext] (val x: Self) extends AnyVal {
    
    inline def setEncounter(value: js.Array[Reference]): Self = StObject.set(x, "encounter", value.asInstanceOf[js.Any])
    
    inline def setEncounterUndefined: Self = StObject.set(x, "encounter", js.undefined)
    
    inline def setEncounterVarargs(value: Reference*): Self = StObject.set(x, "encounter", js.Array(value*))
    
    inline def setEvent(value: js.Array[CodeableConcept]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    inline def setEventVarargs(value: CodeableConcept*): Self = StObject.set(x, "event", js.Array(value*))
    
    inline def setFacilityType(value: CodeableConcept): Self = StObject.set(x, "facilityType", value.asInstanceOf[js.Any])
    
    inline def setFacilityTypeUndefined: Self = StObject.set(x, "facilityType", js.undefined)
    
    inline def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    inline def setPracticeSetting(value: CodeableConcept): Self = StObject.set(x, "practiceSetting", value.asInstanceOf[js.Any])
    
    inline def setPracticeSettingUndefined: Self = StObject.set(x, "practiceSetting", js.undefined)
    
    inline def setRelated(value: js.Array[Reference]): Self = StObject.set(x, "related", value.asInstanceOf[js.Any])
    
    inline def setRelatedUndefined: Self = StObject.set(x, "related", js.undefined)
    
    inline def setRelatedVarargs(value: Reference*): Self = StObject.set(x, "related", js.Array(value*))
    
    inline def setSourcePatientInfo(value: Reference): Self = StObject.set(x, "sourcePatientInfo", value.asInstanceOf[js.Any])
    
    inline def setSourcePatientInfoUndefined: Self = StObject.set(x, "sourcePatientInfo", js.undefined)
  }
}
