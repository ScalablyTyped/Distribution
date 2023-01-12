package typings.fhir.r5Mod

import typings.fhir.fhirStrings.`entered-in-error`
import typings.fhir.fhirStrings.`in-progress`
import typings.fhir.fhirStrings.`on-hold`
import typings.fhir.fhirStrings.cancelled
import typings.fhir.fhirStrings.completed
import typings.fhir.fhirStrings.declined
import typings.fhir.fhirStrings.preparation
import typings.fhir.fhirStrings.stopped
import typings.fhir.fhirStrings.unknown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceDispense
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _preparedDate: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  var _usageInstruction: js.UndefOr[Element] = js.undefined
  
  var _whenHandedOver: js.UndefOr[Element] = js.undefined
  
  /**
    * The order or request that this dispense is fulfilling.
    */
  var basedOn: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * The category can be used to include where the device is expected to be consumed or other types of dispenses.  Invariants can be used to bind to different value sets when profiling to bind.
    */
  var category: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Identification of the facility/location where the device was /should be shipped to, as part of the dispense process.
    */
  var destination: js.UndefOr[Reference] = js.undefined
  
  /**
    * Identifies the device being dispensed. This is either a link to a resource representing the details of the device or a simple attribute carrying a code that identifies the device from a known list of devices.
    */
  var device: CodeableReference
  
  /**
    * The encounter that establishes the context for this event.
    */
  var encounter: js.UndefOr[Reference] = js.undefined
  
  /**
    * This might not include provenances for all versions of the request – only those deemed “relevant” or important. This SHALL NOT include the Provenance associated with this current version of the resource. (If that provenance is deemed to be a “relevant” change, it will need to be added as part of a later update. Until then, it can be queried directly as the Provenance that points to this version using _revinclude All Provenances should have some historical version of this Request as their subject.).
    */
  var eventHistory: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * This is a business identifier, not a resource identifier.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * The principal physical location where the dispense was performed.
    */
  var location: js.UndefOr[Reference] = js.undefined
  
  /**
    * Extra information about the dispense that could not be conveyed in the other attributes.
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  
  /**
    * The bigger event that this dispense is a part of.
    */
  var partOf: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Indicates who or what performed the event.
    */
  var performer: js.UndefOr[js.Array[DeviceDispensePerformer]] = js.undefined
  
  /**
    * The time when the dispensed product was packaged and reviewed.
    */
  var preparedDate: js.UndefOr[String] = js.undefined
  
  /**
    * The number of devices that have been dispensed.
    */
  var quantity: js.UndefOr[Quantity] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_DeviceDispense: typings.fhir.fhirStrings.DeviceDispense
  
  /**
    * This element is labeled as a modifier because the status contains codes that mark the resource as not currently valid.
    */
  var status: preparation | `in-progress` | cancelled | `on-hold` | completed | `entered-in-error` | stopped | declined | unknown
  
  /**
    * Indicates the reason why a dispense was or was not performed.
    */
  var statusReason: js.UndefOr[CodeableReference] = js.undefined
  
  /**
    * What about 'this measuring Device is now asigned to Dr X who needs it now'?
    */
  var subject: Reference
  
  /**
    * Additional information that supports the device being dispensed.
    */
  var supportingInformation: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Indicates the type of dispensing event that is performed.
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The content of the renderedDosageInstructions must not be different than the dose represented in the dosageInstruction content.
    */
  var usageInstruction: js.UndefOr[String] = js.undefined
  
  /**
    * The time the dispensed product was made available to the patient or their representative.
    */
  var whenHandedOver: js.UndefOr[String] = js.undefined
}
object DeviceDispense {
  
  inline def apply(
    device: CodeableReference,
    status: preparation | `in-progress` | cancelled | `on-hold` | completed | `entered-in-error` | stopped | declined | unknown,
    subject: Reference
  ): DeviceDispense = {
    val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any], resourceType = "DeviceDispense", status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceDispense]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeviceDispense] (val x: Self) extends AnyVal {
    
    inline def setBasedOn(value: js.Array[Reference]): Self = StObject.set(x, "basedOn", value.asInstanceOf[js.Any])
    
    inline def setBasedOnUndefined: Self = StObject.set(x, "basedOn", js.undefined)
    
    inline def setBasedOnVarargs(value: Reference*): Self = StObject.set(x, "basedOn", js.Array(value*))
    
    inline def setCategory(value: js.Array[CodeableConcept]): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setCategoryVarargs(value: CodeableConcept*): Self = StObject.set(x, "category", js.Array(value*))
    
    inline def setDestination(value: Reference): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
    
    inline def setDevice(value: CodeableReference): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setEncounter(value: Reference): Self = StObject.set(x, "encounter", value.asInstanceOf[js.Any])
    
    inline def setEncounterUndefined: Self = StObject.set(x, "encounter", js.undefined)
    
    inline def setEventHistory(value: js.Array[Reference]): Self = StObject.set(x, "eventHistory", value.asInstanceOf[js.Any])
    
    inline def setEventHistoryUndefined: Self = StObject.set(x, "eventHistory", js.undefined)
    
    inline def setEventHistoryVarargs(value: Reference*): Self = StObject.set(x, "eventHistory", js.Array(value*))
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setLocation(value: Reference): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value*))
    
    inline def setPartOf(value: js.Array[Reference]): Self = StObject.set(x, "partOf", value.asInstanceOf[js.Any])
    
    inline def setPartOfUndefined: Self = StObject.set(x, "partOf", js.undefined)
    
    inline def setPartOfVarargs(value: Reference*): Self = StObject.set(x, "partOf", js.Array(value*))
    
    inline def setPerformer(value: js.Array[DeviceDispensePerformer]): Self = StObject.set(x, "performer", value.asInstanceOf[js.Any])
    
    inline def setPerformerUndefined: Self = StObject.set(x, "performer", js.undefined)
    
    inline def setPerformerVarargs(value: DeviceDispensePerformer*): Self = StObject.set(x, "performer", js.Array(value*))
    
    inline def setPreparedDate(value: String): Self = StObject.set(x, "preparedDate", value.asInstanceOf[js.Any])
    
    inline def setPreparedDateUndefined: Self = StObject.set(x, "preparedDate", js.undefined)
    
    inline def setQuantity(value: Quantity): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.DeviceDispense): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setStatus(
      value: preparation | `in-progress` | cancelled | `on-hold` | completed | `entered-in-error` | stopped | declined | unknown
    ): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusReason(value: CodeableReference): Self = StObject.set(x, "statusReason", value.asInstanceOf[js.Any])
    
    inline def setStatusReasonUndefined: Self = StObject.set(x, "statusReason", js.undefined)
    
    inline def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSupportingInformation(value: js.Array[Reference]): Self = StObject.set(x, "supportingInformation", value.asInstanceOf[js.Any])
    
    inline def setSupportingInformationUndefined: Self = StObject.set(x, "supportingInformation", js.undefined)
    
    inline def setSupportingInformationVarargs(value: Reference*): Self = StObject.set(x, "supportingInformation", js.Array(value*))
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUsageInstruction(value: String): Self = StObject.set(x, "usageInstruction", value.asInstanceOf[js.Any])
    
    inline def setUsageInstructionUndefined: Self = StObject.set(x, "usageInstruction", js.undefined)
    
    inline def setWhenHandedOver(value: String): Self = StObject.set(x, "whenHandedOver", value.asInstanceOf[js.Any])
    
    inline def setWhenHandedOverUndefined: Self = StObject.set(x, "whenHandedOver", js.undefined)
    
    inline def set_preparedDate(value: Element): Self = StObject.set(x, "_preparedDate", value.asInstanceOf[js.Any])
    
    inline def set_preparedDateUndefined: Self = StObject.set(x, "_preparedDate", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
    
    inline def set_usageInstruction(value: Element): Self = StObject.set(x, "_usageInstruction", value.asInstanceOf[js.Any])
    
    inline def set_usageInstructionUndefined: Self = StObject.set(x, "_usageInstruction", js.undefined)
    
    inline def set_whenHandedOver(value: Element): Self = StObject.set(x, "_whenHandedOver", value.asInstanceOf[js.Any])
    
    inline def set_whenHandedOverUndefined: Self = StObject.set(x, "_whenHandedOver", js.undefined)
  }
}
