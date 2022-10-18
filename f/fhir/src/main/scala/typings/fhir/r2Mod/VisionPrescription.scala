package typings.fhir.r2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VisionPrescription
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _dateWritten: js.UndefOr[Element] = js.undefined
  
  /**
    * The date (and perhaps time) when the prescription was written.
    */
  var dateWritten: js.UndefOr[String] = js.undefined
  
  /**
    * Deals with details of the dispense part of the supply specification.
    */
  var dispense: js.UndefOr[js.Array[VisionPrescriptionDispense]] = js.undefined
  
  /**
    * A link to a resource that identifies the particular occurrence of contact between patient and health care provider.
    */
  var encounter: js.UndefOr[Reference] = js.undefined
  
  /**
    * Business identifier which may be used by other parties to reference or identify the prescription.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * A link to a resource representing the person to whom the vision products will be supplied.
    */
  var patient: js.UndefOr[Reference] = js.undefined
  
  /**
    * The healthcare professional responsible for authorizing the prescription.
    */
  var prescriber: js.UndefOr[Reference] = js.undefined
  
  /**
    * Can be the reason or the indication for writing the prescription.
    */
  var reasonCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Can be the reason or the indication for writing the prescription.
    */
  var reasonReference: js.UndefOr[Reference] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_VisionPrescription: typings.fhir.fhirStrings.VisionPrescription
}
object VisionPrescription {
  
  inline def apply(): VisionPrescription = {
    val __obj = js.Dynamic.literal(resourceType = "VisionPrescription")
    __obj.asInstanceOf[VisionPrescription]
  }
  
  extension [Self <: VisionPrescription](x: Self) {
    
    inline def setDateWritten(value: String): Self = StObject.set(x, "dateWritten", value.asInstanceOf[js.Any])
    
    inline def setDateWrittenUndefined: Self = StObject.set(x, "dateWritten", js.undefined)
    
    inline def setDispense(value: js.Array[VisionPrescriptionDispense]): Self = StObject.set(x, "dispense", value.asInstanceOf[js.Any])
    
    inline def setDispenseUndefined: Self = StObject.set(x, "dispense", js.undefined)
    
    inline def setDispenseVarargs(value: VisionPrescriptionDispense*): Self = StObject.set(x, "dispense", js.Array(value*))
    
    inline def setEncounter(value: Reference): Self = StObject.set(x, "encounter", value.asInstanceOf[js.Any])
    
    inline def setEncounterUndefined: Self = StObject.set(x, "encounter", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setPatient(value: Reference): Self = StObject.set(x, "patient", value.asInstanceOf[js.Any])
    
    inline def setPatientUndefined: Self = StObject.set(x, "patient", js.undefined)
    
    inline def setPrescriber(value: Reference): Self = StObject.set(x, "prescriber", value.asInstanceOf[js.Any])
    
    inline def setPrescriberUndefined: Self = StObject.set(x, "prescriber", js.undefined)
    
    inline def setReasonCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "reasonCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setReasonCodeableConceptUndefined: Self = StObject.set(x, "reasonCodeableConcept", js.undefined)
    
    inline def setReasonReference(value: Reference): Self = StObject.set(x, "reasonReference", value.asInstanceOf[js.Any])
    
    inline def setReasonReferenceUndefined: Self = StObject.set(x, "reasonReference", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.VisionPrescription): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def set_dateWritten(value: Element): Self = StObject.set(x, "_dateWritten", value.asInstanceOf[js.Any])
    
    inline def set_dateWrittenUndefined: Self = StObject.set(x, "_dateWritten", js.undefined)
  }
}
