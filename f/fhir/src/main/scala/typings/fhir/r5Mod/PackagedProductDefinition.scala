package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PackagedProductDefinition
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _copackagedIndicator: js.UndefOr[Element] = js.undefined
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _name: js.UndefOr[Element] = js.undefined
  
  var _statusDate: js.UndefOr[Element] = js.undefined
  
  /**
    * Additional information or supporting documentation about the packaged product.
    */
  var attachedDocument: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Allows the key features to be recorded, such as "hospital pack", "nurse prescribable", "calendar pack".
    */
  var characteristic: js.UndefOr[js.Array[PackagedProductDefinitionPackagingProperty]] = js.undefined
  
  /**
    * A total of the complete count of contained items of a particular type/form, independent of sub-packaging or organization. This can be considered as the pack size. This attribute differs from containedItem.amount in that it can give a single aggregated count of all tablet types in a pack, even when these are different manufactured items. For example a pill pack of 21 tablets plus 7 sugar tablets, can be denoted here as '28 tablets'. This attribute is repeatable so that the different item types in one pack type can be counted (e.g. a count of vials and count of syringes). Each repeat must have different units, so that it is clear what the different sets of counted items are, and it is not intended to allow different counts of similar items (e.g. not '2 tubes and 3 tubes'). Repeats are not to be used to represent different pack sizes (e.g. 20 pack vs. 50 pack) - which would be different instances of this resource.
    */
  var containedItemQuantity: js.UndefOr[js.Array[Quantity]] = js.undefined
  
  /**
    * Identifies if the package contains different items, such as when a drug product is supplied with another item e.g. a diluent or adjuvant.
    */
  var copackagedIndicator: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Textual description. Note that this is not the name of the package or product.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * A unique identifier for this package as whole - not the the content of the package. Unique instance identifiers assigned to a package by manufacturers, regulators, drug catalogue custodians or other organizations.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * The legal status of supply of the packaged item as classified by the regulator.
    */
  var legalStatusOfSupply: js.UndefOr[js.Array[PackagedProductDefinitionLegalStatusOfSupply]] = js.undefined
  
  /**
    * Manufacturer of this package type. When there are multiple it means these are all possible manufacturers.
    */
  var manufacturer: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Allows specifying that an item is on the market for sale, or that it is not available, and the dates and locations associated.
    */
  var marketingStatus: js.UndefOr[js.Array[MarketingStatus]] = js.undefined
  
  /**
    * A name for this package. Typically what it would be listed as in a drug formulary or catalogue, inventory etc.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The product this package model relates to, not the contents of the package (for which see package.containedItem).
    */
  var packageFor: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * A packaging item, as a container for medically related items, possibly with other packaging items within, or a packaging component, such as bottle cap (which is not a device or a medication manufactured item).
    */
  var packaging: js.UndefOr[PackagedProductDefinitionPackaging] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_PackagedProductDefinition: typings.fhir.fhirStrings.PackagedProductDefinition
  
  /**
    * The status within the lifecycle of this item. A high level status, this is not intended to duplicate details carried elsewhere such as legal status, or authorization or marketing status.
    */
  var status: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The date at which the given status became applicable.
    */
  var statusDate: js.UndefOr[String] = js.undefined
  
  /**
    * A high level category e.g. medicinal product, raw material, shipping/transport container, etc.
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}
object PackagedProductDefinition {
  
  inline def apply(): PackagedProductDefinition = {
    val __obj = js.Dynamic.literal(resourceType = "PackagedProductDefinition")
    __obj.asInstanceOf[PackagedProductDefinition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PackagedProductDefinition] (val x: Self) extends AnyVal {
    
    inline def setAttachedDocument(value: js.Array[Reference]): Self = StObject.set(x, "attachedDocument", value.asInstanceOf[js.Any])
    
    inline def setAttachedDocumentUndefined: Self = StObject.set(x, "attachedDocument", js.undefined)
    
    inline def setAttachedDocumentVarargs(value: Reference*): Self = StObject.set(x, "attachedDocument", js.Array(value*))
    
    inline def setCharacteristic(value: js.Array[PackagedProductDefinitionPackagingProperty]): Self = StObject.set(x, "characteristic", value.asInstanceOf[js.Any])
    
    inline def setCharacteristicUndefined: Self = StObject.set(x, "characteristic", js.undefined)
    
    inline def setCharacteristicVarargs(value: PackagedProductDefinitionPackagingProperty*): Self = StObject.set(x, "characteristic", js.Array(value*))
    
    inline def setContainedItemQuantity(value: js.Array[Quantity]): Self = StObject.set(x, "containedItemQuantity", value.asInstanceOf[js.Any])
    
    inline def setContainedItemQuantityUndefined: Self = StObject.set(x, "containedItemQuantity", js.undefined)
    
    inline def setContainedItemQuantityVarargs(value: Quantity*): Self = StObject.set(x, "containedItemQuantity", js.Array(value*))
    
    inline def setCopackagedIndicator(value: Boolean): Self = StObject.set(x, "copackagedIndicator", value.asInstanceOf[js.Any])
    
    inline def setCopackagedIndicatorUndefined: Self = StObject.set(x, "copackagedIndicator", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setLegalStatusOfSupply(value: js.Array[PackagedProductDefinitionLegalStatusOfSupply]): Self = StObject.set(x, "legalStatusOfSupply", value.asInstanceOf[js.Any])
    
    inline def setLegalStatusOfSupplyUndefined: Self = StObject.set(x, "legalStatusOfSupply", js.undefined)
    
    inline def setLegalStatusOfSupplyVarargs(value: PackagedProductDefinitionLegalStatusOfSupply*): Self = StObject.set(x, "legalStatusOfSupply", js.Array(value*))
    
    inline def setManufacturer(value: js.Array[Reference]): Self = StObject.set(x, "manufacturer", value.asInstanceOf[js.Any])
    
    inline def setManufacturerUndefined: Self = StObject.set(x, "manufacturer", js.undefined)
    
    inline def setManufacturerVarargs(value: Reference*): Self = StObject.set(x, "manufacturer", js.Array(value*))
    
    inline def setMarketingStatus(value: js.Array[MarketingStatus]): Self = StObject.set(x, "marketingStatus", value.asInstanceOf[js.Any])
    
    inline def setMarketingStatusUndefined: Self = StObject.set(x, "marketingStatus", js.undefined)
    
    inline def setMarketingStatusVarargs(value: MarketingStatus*): Self = StObject.set(x, "marketingStatus", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPackageFor(value: js.Array[Reference]): Self = StObject.set(x, "packageFor", value.asInstanceOf[js.Any])
    
    inline def setPackageForUndefined: Self = StObject.set(x, "packageFor", js.undefined)
    
    inline def setPackageForVarargs(value: Reference*): Self = StObject.set(x, "packageFor", js.Array(value*))
    
    inline def setPackaging(value: PackagedProductDefinitionPackaging): Self = StObject.set(x, "packaging", value.asInstanceOf[js.Any])
    
    inline def setPackagingUndefined: Self = StObject.set(x, "packaging", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.PackagedProductDefinition): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: CodeableConcept): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusDate(value: String): Self = StObject.set(x, "statusDate", value.asInstanceOf[js.Any])
    
    inline def setStatusDateUndefined: Self = StObject.set(x, "statusDate", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def set_copackagedIndicator(value: Element): Self = StObject.set(x, "_copackagedIndicator", value.asInstanceOf[js.Any])
    
    inline def set_copackagedIndicatorUndefined: Self = StObject.set(x, "_copackagedIndicator", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    inline def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
    
    inline def set_statusDate(value: Element): Self = StObject.set(x, "_statusDate", value.asInstanceOf[js.Any])
    
    inline def set_statusDateUndefined: Self = StObject.set(x, "_statusDate", js.undefined)
  }
}
