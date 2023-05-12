package typings.fhir.r5Mod

import typings.fhir.fhirStrings.`entered-in-error`
import typings.fhir.fhirStrings.`in-progress`
import typings.fhir.fhirStrings.allocated
import typings.fhir.fhirStrings.issued
import typings.fhir.fhirStrings.preparation
import typings.fhir.fhirStrings.returned
import typings.fhir.fhirStrings.unfulfilled
import typings.fhir.fhirStrings.unknown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BiologicallyDerivedProductDispense
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _preparedDate: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  var _usageInstruction: js.UndefOr[Element] = js.undefined
  
  var _whenHandedOver: js.UndefOr[Element] = js.undefined
  
  /**
    * The order or request that the dispense is fulfilling. This is a reference to a ServiceRequest resource.
    */
  var basedOn: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Link to a resource identifying the physical location that the product was dispatched to.
    */
  var destination: js.UndefOr[Reference] = js.undefined
  
  /**
    * Unique instance identifiers assigned to a biologically derived product dispense. Note: This is a business identifier, not a resource identifier.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * The physical location where the dispense was performed.
    */
  var location: js.UndefOr[Reference] = js.undefined
  
  /**
    * Indicates the type of matching associated with the dispense.
    */
  var matchStatus: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Additional notes.
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  
  /**
    * Indicates the relationship between the donor of the biologically derived product and the intended recipient.
    */
  var originRelationshipType: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * A larger event of which this particular event is a component.
    */
  var partOf: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * A link to a resource representing the patient that the product is dispensed for.
    */
  var patient: Reference
  
  /**
    * Indicates who or what performed an action.
    */
  var performer: js.UndefOr[js.Array[BiologicallyDerivedProductDispensePerformer]] = js.undefined
  
  /**
    * When the product was selected/ matched.
    */
  var preparedDate: js.UndefOr[String] = js.undefined
  
  /**
    * A link to a resource identifying the biologically derived product that is being dispensed.
    */
  var product: Reference
  
  /**
    * The amount of product in the dispense. Quantity will depend on the product being dispensed. Examples are: volume; cell count; concentration.
    */
  var quantity: js.UndefOr[Quantity] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_BiologicallyDerivedProductDispense: typings.fhir.fhirStrings.BiologicallyDerivedProductDispense
  
  /**
    * A code specifying the state of the dispense event.
    */
  var status: preparation | `in-progress` | allocated | issued | unfulfilled | returned | `entered-in-error` | unknown
  
  /**
    * Specific instructions for use.
    */
  var usageInstruction: js.UndefOr[String] = js.undefined
  
  /**
    * When the product was dispatched for clinical use.
    */
  var whenHandedOver: js.UndefOr[String] = js.undefined
}
object BiologicallyDerivedProductDispense {
  
  inline def apply(
    patient: Reference,
    product: Reference,
    status: preparation | `in-progress` | allocated | issued | unfulfilled | returned | `entered-in-error` | unknown
  ): BiologicallyDerivedProductDispense = {
    val __obj = js.Dynamic.literal(patient = patient.asInstanceOf[js.Any], product = product.asInstanceOf[js.Any], resourceType = "BiologicallyDerivedProductDispense", status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[BiologicallyDerivedProductDispense]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BiologicallyDerivedProductDispense] (val x: Self) extends AnyVal {
    
    inline def setBasedOn(value: js.Array[Reference]): Self = StObject.set(x, "basedOn", value.asInstanceOf[js.Any])
    
    inline def setBasedOnUndefined: Self = StObject.set(x, "basedOn", js.undefined)
    
    inline def setBasedOnVarargs(value: Reference*): Self = StObject.set(x, "basedOn", js.Array(value*))
    
    inline def setDestination(value: Reference): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setLocation(value: Reference): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setMatchStatus(value: CodeableConcept): Self = StObject.set(x, "matchStatus", value.asInstanceOf[js.Any])
    
    inline def setMatchStatusUndefined: Self = StObject.set(x, "matchStatus", js.undefined)
    
    inline def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value*))
    
    inline def setOriginRelationshipType(value: CodeableConcept): Self = StObject.set(x, "originRelationshipType", value.asInstanceOf[js.Any])
    
    inline def setOriginRelationshipTypeUndefined: Self = StObject.set(x, "originRelationshipType", js.undefined)
    
    inline def setPartOf(value: js.Array[Reference]): Self = StObject.set(x, "partOf", value.asInstanceOf[js.Any])
    
    inline def setPartOfUndefined: Self = StObject.set(x, "partOf", js.undefined)
    
    inline def setPartOfVarargs(value: Reference*): Self = StObject.set(x, "partOf", js.Array(value*))
    
    inline def setPatient(value: Reference): Self = StObject.set(x, "patient", value.asInstanceOf[js.Any])
    
    inline def setPerformer(value: js.Array[BiologicallyDerivedProductDispensePerformer]): Self = StObject.set(x, "performer", value.asInstanceOf[js.Any])
    
    inline def setPerformerUndefined: Self = StObject.set(x, "performer", js.undefined)
    
    inline def setPerformerVarargs(value: BiologicallyDerivedProductDispensePerformer*): Self = StObject.set(x, "performer", js.Array(value*))
    
    inline def setPreparedDate(value: String): Self = StObject.set(x, "preparedDate", value.asInstanceOf[js.Any])
    
    inline def setPreparedDateUndefined: Self = StObject.set(x, "preparedDate", js.undefined)
    
    inline def setProduct(value: Reference): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
    
    inline def setQuantity(value: Quantity): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.BiologicallyDerivedProductDispense): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setStatus(
      value: preparation | `in-progress` | allocated | issued | unfulfilled | returned | `entered-in-error` | unknown
    ): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
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
