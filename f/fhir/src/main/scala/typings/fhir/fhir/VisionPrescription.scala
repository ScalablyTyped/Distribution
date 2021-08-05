package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Prescription for vision correction products for a patient
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait VisionPrescription
  extends StObject
     with DomainResource {
  
  /**
    * Contains extended information for property 'dateWritten'.
    */
  var _dateWritten: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * When prescription was authorized
    */
  var dateWritten: js.UndefOr[dateTime] = js.undefined
  
  /**
    * Vision supply authorization
    */
  var dispense: js.UndefOr[js.Array[VisionPrescriptionDispense]] = js.undefined
  
  /**
    * Created during encounter / admission / stay
    */
  var encounter: js.UndefOr[Reference] = js.undefined
  
  /**
    * Business identifier
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Who prescription is for
    */
  var patient: js.UndefOr[Reference] = js.undefined
  
  /**
    * Who authorizes the vision product
    */
  var prescriber: js.UndefOr[Reference] = js.undefined
  
  /**
    * Reason or indication for writing the prescription
    */
  var reasonCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Reason or indication for writing the prescription
    */
  var reasonReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * active | cancelled | draft | entered-in-error
    */
  var status: js.UndefOr[code] = js.undefined
}
object VisionPrescription {
  
  inline def apply(): VisionPrescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VisionPrescription]
  }
  
  extension [Self <: VisionPrescription](x: Self) {
    
    inline def setDateWritten(value: dateTime): Self = StObject.set(x, "dateWritten", value.asInstanceOf[js.Any])
    
    inline def setDateWrittenUndefined: Self = StObject.set(x, "dateWritten", js.undefined)
    
    inline def setDispense(value: js.Array[VisionPrescriptionDispense]): Self = StObject.set(x, "dispense", value.asInstanceOf[js.Any])
    
    inline def setDispenseUndefined: Self = StObject.set(x, "dispense", js.undefined)
    
    inline def setDispenseVarargs(value: VisionPrescriptionDispense*): Self = StObject.set(x, "dispense", js.Array(value :_*))
    
    inline def setEncounter(value: Reference): Self = StObject.set(x, "encounter", value.asInstanceOf[js.Any])
    
    inline def setEncounterUndefined: Self = StObject.set(x, "encounter", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value :_*))
    
    inline def setPatient(value: Reference): Self = StObject.set(x, "patient", value.asInstanceOf[js.Any])
    
    inline def setPatientUndefined: Self = StObject.set(x, "patient", js.undefined)
    
    inline def setPrescriber(value: Reference): Self = StObject.set(x, "prescriber", value.asInstanceOf[js.Any])
    
    inline def setPrescriberUndefined: Self = StObject.set(x, "prescriber", js.undefined)
    
    inline def setReasonCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "reasonCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setReasonCodeableConceptUndefined: Self = StObject.set(x, "reasonCodeableConcept", js.undefined)
    
    inline def setReasonReference(value: Reference): Self = StObject.set(x, "reasonReference", value.asInstanceOf[js.Any])
    
    inline def setReasonReferenceUndefined: Self = StObject.set(x, "reasonReference", js.undefined)
    
    inline def setStatus(value: code): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def set_dateWritten(value: Element): Self = StObject.set(x, "_dateWritten", value.asInstanceOf[js.Any])
    
    inline def set_dateWrittenUndefined: Self = StObject.set(x, "_dateWritten", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
