package typings.fhir.fhir

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
  implicit class VisionPrescriptionOps[Self <: VisionPrescription] (val x: Self) extends AnyVal {
    
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
    def set_dateWritten(value: Element): Self = this.set("_dateWritten", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_dateWritten: Self = this.set("_dateWritten", js.undefined)
    
    @scala.inline
    def set_status(value: Element): Self = this.set("_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_status: Self = this.set("_status", js.undefined)
    
    @scala.inline
    def setDateWritten(value: dateTime): Self = this.set("dateWritten", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateWritten: Self = this.set("dateWritten", js.undefined)
    
    @scala.inline
    def setDispenseVarargs(value: VisionPrescriptionDispense*): Self = this.set("dispense", js.Array(value :_*))
    
    @scala.inline
    def setDispense(value: js.Array[VisionPrescriptionDispense]): Self = this.set("dispense", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDispense: Self = this.set("dispense", js.undefined)
    
    @scala.inline
    def setEncounter(value: Reference): Self = this.set("encounter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncounter: Self = this.set("encounter", js.undefined)
    
    @scala.inline
    def setIdentifierVarargs(value: Identifier*): Self = this.set("identifier", js.Array(value :_*))
    
    @scala.inline
    def setIdentifier(value: js.Array[Identifier]): Self = this.set("identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
    
    @scala.inline
    def setPatient(value: Reference): Self = this.set("patient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePatient: Self = this.set("patient", js.undefined)
    
    @scala.inline
    def setPrescriber(value: Reference): Self = this.set("prescriber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrescriber: Self = this.set("prescriber", js.undefined)
    
    @scala.inline
    def setReasonCodeableConcept(value: CodeableConcept): Self = this.set("reasonCodeableConcept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReasonCodeableConcept: Self = this.set("reasonCodeableConcept", js.undefined)
    
    @scala.inline
    def setReasonReference(value: Reference): Self = this.set("reasonReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReasonReference: Self = this.set("reasonReference", js.undefined)
    
    @scala.inline
    def setStatus(value: code): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
}
