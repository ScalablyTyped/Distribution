package typings.fhir.r4Mod

import typings.fhir.fhirStrings.`entered-in-error`
import typings.fhir.fhirStrings.active
import typings.fhir.fhirStrings.cancelled
import typings.fhir.fhirStrings.draft
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VisionPrescription
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _created: js.UndefOr[Element] = js.undefined
  
  var _dateWritten: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * The date this resource was created.
    */
  var created: String
  
  /**
    * Jurisdictions determine the valid lifetime of a prescription. Typically vision prescriptions are valid for two years from the date written.
    */
  var dateWritten: String
  
  /**
    * A reference to a resource that identifies the particular occurrence of contact between patient and health care provider during which the prescription was issued.
    */
  var encounter: js.UndefOr[Reference] = js.undefined
  
  /**
    * A unique identifier assigned to this vision prescription.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Contain the details of  the individual lens specifications and serves as the authorization for the fullfillment by certified professionals.
    */
  var lensSpecification: js.Array[VisionPrescriptionLensSpecification]
  
  /**
    * A resource reference to the person to whom the vision prescription applies.
    */
  var patient: Reference
  
  /**
    * The healthcare professional responsible for authorizing the prescription.
    */
  var prescriber: Reference
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_VisionPrescription: typings.fhir.fhirStrings.VisionPrescription
  
  /**
    * This element is labeled as a modifier because the status contains codes that mark the resource as not currently valid.
    */
  var status: active | cancelled | draft | `entered-in-error`
}
object VisionPrescription {
  
  inline def apply(
    created: String,
    dateWritten: String,
    lensSpecification: js.Array[VisionPrescriptionLensSpecification],
    patient: Reference,
    prescriber: Reference,
    status: active | cancelled | draft | `entered-in-error`
  ): VisionPrescription = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], dateWritten = dateWritten.asInstanceOf[js.Any], lensSpecification = lensSpecification.asInstanceOf[js.Any], patient = patient.asInstanceOf[js.Any], prescriber = prescriber.asInstanceOf[js.Any], resourceType = "VisionPrescription", status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisionPrescription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VisionPrescription] (val x: Self) extends AnyVal {
    
    inline def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setDateWritten(value: String): Self = StObject.set(x, "dateWritten", value.asInstanceOf[js.Any])
    
    inline def setEncounter(value: Reference): Self = StObject.set(x, "encounter", value.asInstanceOf[js.Any])
    
    inline def setEncounterUndefined: Self = StObject.set(x, "encounter", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setLensSpecification(value: js.Array[VisionPrescriptionLensSpecification]): Self = StObject.set(x, "lensSpecification", value.asInstanceOf[js.Any])
    
    inline def setLensSpecificationVarargs(value: VisionPrescriptionLensSpecification*): Self = StObject.set(x, "lensSpecification", js.Array(value*))
    
    inline def setPatient(value: Reference): Self = StObject.set(x, "patient", value.asInstanceOf[js.Any])
    
    inline def setPrescriber(value: Reference): Self = StObject.set(x, "prescriber", value.asInstanceOf[js.Any])
    
    inline def setResourceType(value: typings.fhir.fhirStrings.VisionPrescription): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: active | cancelled | draft | `entered-in-error`): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def set_created(value: Element): Self = StObject.set(x, "_created", value.asInstanceOf[js.Any])
    
    inline def set_createdUndefined: Self = StObject.set(x, "_created", js.undefined)
    
    inline def set_dateWritten(value: Element): Self = StObject.set(x, "_dateWritten", value.asInstanceOf[js.Any])
    
    inline def set_dateWrittenUndefined: Self = StObject.set(x, "_dateWritten", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
