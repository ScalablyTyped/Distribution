package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Prescription for vision correction products for a patient
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ @js.native
trait VisionPrescription extends DomainResource {
  
  /**
    * Contains extended information for property 'dateWritten'.
    */
  var _dateWritten: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  
  /**
    * When prescription was authorized
    */
  var dateWritten: js.UndefOr[dateTime] = js.native
  
  /**
    * Vision supply authorization
    */
  var dispense: js.UndefOr[js.Array[VisionPrescriptionDispense]] = js.native
  
  /**
    * Created during encounter / admission / stay
    */
  var encounter: js.UndefOr[Reference] = js.native
  
  /**
    * Business identifier
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  
  /**
    * Who prescription is for
    */
  var patient: js.UndefOr[Reference] = js.native
  
  /**
    * Who authorizes the vision product
    */
  var prescriber: js.UndefOr[Reference] = js.native
  
  /**
    * Reason or indication for writing the prescription
    */
  var reasonCodeableConcept: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Reason or indication for writing the prescription
    */
  var reasonReference: js.UndefOr[Reference] = js.native
  
  /**
    * active | cancelled | draft | entered-in-error
    */
  var status: js.UndefOr[code] = js.native
}
object VisionPrescription {
  
  @scala.inline
  def apply(): VisionPrescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VisionPrescription]
  }
  
  @scala.inline
  implicit class VisionPrescriptionMutableBuilder[Self <: VisionPrescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDateWritten(value: dateTime): Self = StObject.set(x, "dateWritten", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateWrittenUndefined: Self = StObject.set(x, "dateWritten", js.undefined)
    
    @scala.inline
    def setDispense(value: js.Array[VisionPrescriptionDispense]): Self = StObject.set(x, "dispense", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDispenseUndefined: Self = StObject.set(x, "dispense", js.undefined)
    
    @scala.inline
    def setDispenseVarargs(value: VisionPrescriptionDispense*): Self = StObject.set(x, "dispense", js.Array(value :_*))
    
    @scala.inline
    def setEncounter(value: Reference): Self = StObject.set(x, "encounter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncounterUndefined: Self = StObject.set(x, "encounter", js.undefined)
    
    @scala.inline
    def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    @scala.inline
    def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value :_*))
    
    @scala.inline
    def setPatient(value: Reference): Self = StObject.set(x, "patient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatientUndefined: Self = StObject.set(x, "patient", js.undefined)
    
    @scala.inline
    def setPrescriber(value: Reference): Self = StObject.set(x, "prescriber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrescriberUndefined: Self = StObject.set(x, "prescriber", js.undefined)
    
    @scala.inline
    def setReasonCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "reasonCodeableConcept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonCodeableConceptUndefined: Self = StObject.set(x, "reasonCodeableConcept", js.undefined)
    
    @scala.inline
    def setReasonReference(value: Reference): Self = StObject.set(x, "reasonReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonReferenceUndefined: Self = StObject.set(x, "reasonReference", js.undefined)
    
    @scala.inline
    def setStatus(value: code): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def set_dateWritten(value: Element): Self = StObject.set(x, "_dateWritten", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_dateWrittenUndefined: Self = StObject.set(x, "_dateWritten", js.undefined)
    
    @scala.inline
    def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
