package typings.fhir.r4Mod

import typings.fhir.fhirStrings.active
import typings.fhir.fhirStrings.draft
import typings.fhir.fhirStrings.retired
import typings.fhir.fhirStrings.unknown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CatalogEntry
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _lastUpdated: js.UndefOr[Element] = js.undefined
  
  var _orderable: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  var _validTo: js.UndefOr[Element] = js.undefined
  
  /**
    * Used for examplefor Out of Formulary, or any specifics.
    */
  var additionalCharacteristic: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * User for example for ATC classification, or.
    */
  var additionalClassification: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Used in supporting related concepts, e.g. NDC to RxNorm.
    */
  var additionalIdentifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Classes of devices, or ATC for medication.
    */
  var classification: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Used in supporting different identifiers for the same product, e.g. manufacturer code and retailer code.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Perhaps not needed - if we use fhir resource metadata.
    */
  var lastUpdated: js.UndefOr[String] = js.undefined
  
  /**
    * Whether the entry represents an orderable item.
    */
  var orderable: Boolean
  
  /**
    * The item in a catalog or definition.
    */
  var referencedItem: Reference
  
  /**
    * Used for example, to point to a substance, or to a device used to administer a medication.
    */
  var relatedEntry: js.UndefOr[js.Array[CatalogEntryRelatedEntry]] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_CatalogEntry: typings.fhir.fhirStrings.CatalogEntry
  
  /**
    * Used to support catalog exchange even for unsupported products, e.g. getting list of medications even if not prescribable.
    */
  var status: js.UndefOr[draft | active | retired | unknown] = js.undefined
  
  /**
    * The type of item - medication, device, service, protocol or other.
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The date until which this catalog entry is expected to be active.
    */
  var validTo: js.UndefOr[String] = js.undefined
  
  /**
    * The time period in which this catalog entry is expected to be active.
    */
  var validityPeriod: js.UndefOr[Period] = js.undefined
}
object CatalogEntry {
  
  inline def apply(orderable: Boolean, referencedItem: Reference): CatalogEntry = {
    val __obj = js.Dynamic.literal(orderable = orderable.asInstanceOf[js.Any], referencedItem = referencedItem.asInstanceOf[js.Any], resourceType = "CatalogEntry")
    __obj.asInstanceOf[CatalogEntry]
  }
  
  extension [Self <: CatalogEntry](x: Self) {
    
    inline def setAdditionalCharacteristic(value: js.Array[CodeableConcept]): Self = StObject.set(x, "additionalCharacteristic", value.asInstanceOf[js.Any])
    
    inline def setAdditionalCharacteristicUndefined: Self = StObject.set(x, "additionalCharacteristic", js.undefined)
    
    inline def setAdditionalCharacteristicVarargs(value: CodeableConcept*): Self = StObject.set(x, "additionalCharacteristic", js.Array(value*))
    
    inline def setAdditionalClassification(value: js.Array[CodeableConcept]): Self = StObject.set(x, "additionalClassification", value.asInstanceOf[js.Any])
    
    inline def setAdditionalClassificationUndefined: Self = StObject.set(x, "additionalClassification", js.undefined)
    
    inline def setAdditionalClassificationVarargs(value: CodeableConcept*): Self = StObject.set(x, "additionalClassification", js.Array(value*))
    
    inline def setAdditionalIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "additionalIdentifier", value.asInstanceOf[js.Any])
    
    inline def setAdditionalIdentifierUndefined: Self = StObject.set(x, "additionalIdentifier", js.undefined)
    
    inline def setAdditionalIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "additionalIdentifier", js.Array(value*))
    
    inline def setClassification(value: js.Array[CodeableConcept]): Self = StObject.set(x, "classification", value.asInstanceOf[js.Any])
    
    inline def setClassificationUndefined: Self = StObject.set(x, "classification", js.undefined)
    
    inline def setClassificationVarargs(value: CodeableConcept*): Self = StObject.set(x, "classification", js.Array(value*))
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setLastUpdated(value: String): Self = StObject.set(x, "lastUpdated", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedUndefined: Self = StObject.set(x, "lastUpdated", js.undefined)
    
    inline def setOrderable(value: Boolean): Self = StObject.set(x, "orderable", value.asInstanceOf[js.Any])
    
    inline def setReferencedItem(value: Reference): Self = StObject.set(x, "referencedItem", value.asInstanceOf[js.Any])
    
    inline def setRelatedEntry(value: js.Array[CatalogEntryRelatedEntry]): Self = StObject.set(x, "relatedEntry", value.asInstanceOf[js.Any])
    
    inline def setRelatedEntryUndefined: Self = StObject.set(x, "relatedEntry", js.undefined)
    
    inline def setRelatedEntryVarargs(value: CatalogEntryRelatedEntry*): Self = StObject.set(x, "relatedEntry", js.Array(value*))
    
    inline def setResourceType(value: typings.fhir.fhirStrings.CatalogEntry): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: draft | active | retired | unknown): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValidTo(value: String): Self = StObject.set(x, "validTo", value.asInstanceOf[js.Any])
    
    inline def setValidToUndefined: Self = StObject.set(x, "validTo", js.undefined)
    
    inline def setValidityPeriod(value: Period): Self = StObject.set(x, "validityPeriod", value.asInstanceOf[js.Any])
    
    inline def setValidityPeriodUndefined: Self = StObject.set(x, "validityPeriod", js.undefined)
    
    inline def set_lastUpdated(value: Element): Self = StObject.set(x, "_lastUpdated", value.asInstanceOf[js.Any])
    
    inline def set_lastUpdatedUndefined: Self = StObject.set(x, "_lastUpdated", js.undefined)
    
    inline def set_orderable(value: Element): Self = StObject.set(x, "_orderable", value.asInstanceOf[js.Any])
    
    inline def set_orderableUndefined: Self = StObject.set(x, "_orderable", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
    
    inline def set_validTo(value: Element): Self = StObject.set(x, "_validTo", value.asInstanceOf[js.Any])
    
    inline def set_validToUndefined: Self = StObject.set(x, "_validTo", js.undefined)
  }
}
