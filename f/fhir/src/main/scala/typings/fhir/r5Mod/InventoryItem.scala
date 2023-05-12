package typings.fhir.r5Mod

import typings.fhir.fhirStrings.`entered-in-error`
import typings.fhir.fhirStrings.active
import typings.fhir.fhirStrings.inactive
import typings.fhir.fhirStrings.unknown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InventoryItem
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * Association with other items or products.
    */
  var association: js.UndefOr[js.Array[InventoryItemAssociation]] = js.undefined
  
  /**
    * The base unit of measure - the unit in which the product is used or counted.
    */
  var baseUnit: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Category or class of the item.
    */
  var category: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * The descriptive or identifying characteristics of the item.
    */
  var characteristic: js.UndefOr[js.Array[InventoryItemCharacteristic]] = js.undefined
  
  /**
    * Code designating the specific type of item.
    */
  var code: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * The descriptive characteristics of the inventory item.
    */
  var description: js.UndefOr[InventoryItemDescription] = js.undefined
  
  /**
    * Business identifier for the inventory item.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Instances or occurrences of the product.
    */
  var instance: js.UndefOr[InventoryItemInstance] = js.undefined
  
  /**
    * The usage status e.g. recalled, in use, discarded... This can be used to indicate that the items have been taken out of inventory, or are in use, etc.
    */
  var inventoryStatus: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * The item name(s) - the brand name, or common name, functional name, generic name.
    */
  var name: js.UndefOr[js.Array[InventoryItemName]] = js.undefined
  
  /**
    * Net content or amount present in the item.
    */
  var netContent: js.UndefOr[Quantity] = js.undefined
  
  /**
    * Link to a product resource used in clinical workflows.
    */
  var productReference: js.UndefOr[Reference] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_InventoryItem: typings.fhir.fhirStrings.InventoryItem
  
  /**
    * Organization(s) responsible for the product.
    */
  var responsibleOrganization: js.UndefOr[js.Array[InventoryItemResponsibleOrganization]] = js.undefined
  
  /**
    * Status of the item entry.
    */
  var status: active | inactive | `entered-in-error` | unknown
}
object InventoryItem {
  
  inline def apply(status: active | inactive | `entered-in-error` | unknown): InventoryItem = {
    val __obj = js.Dynamic.literal(resourceType = "InventoryItem", status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[InventoryItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InventoryItem] (val x: Self) extends AnyVal {
    
    inline def setAssociation(value: js.Array[InventoryItemAssociation]): Self = StObject.set(x, "association", value.asInstanceOf[js.Any])
    
    inline def setAssociationUndefined: Self = StObject.set(x, "association", js.undefined)
    
    inline def setAssociationVarargs(value: InventoryItemAssociation*): Self = StObject.set(x, "association", js.Array(value*))
    
    inline def setBaseUnit(value: CodeableConcept): Self = StObject.set(x, "baseUnit", value.asInstanceOf[js.Any])
    
    inline def setBaseUnitUndefined: Self = StObject.set(x, "baseUnit", js.undefined)
    
    inline def setCategory(value: js.Array[CodeableConcept]): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setCategoryVarargs(value: CodeableConcept*): Self = StObject.set(x, "category", js.Array(value*))
    
    inline def setCharacteristic(value: js.Array[InventoryItemCharacteristic]): Self = StObject.set(x, "characteristic", value.asInstanceOf[js.Any])
    
    inline def setCharacteristicUndefined: Self = StObject.set(x, "characteristic", js.undefined)
    
    inline def setCharacteristicVarargs(value: InventoryItemCharacteristic*): Self = StObject.set(x, "characteristic", js.Array(value*))
    
    inline def setCode(value: js.Array[CodeableConcept]): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setCodeVarargs(value: CodeableConcept*): Self = StObject.set(x, "code", js.Array(value*))
    
    inline def setDescription(value: InventoryItemDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setInstance(value: InventoryItemInstance): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
    
    inline def setInventoryStatus(value: js.Array[CodeableConcept]): Self = StObject.set(x, "inventoryStatus", value.asInstanceOf[js.Any])
    
    inline def setInventoryStatusUndefined: Self = StObject.set(x, "inventoryStatus", js.undefined)
    
    inline def setInventoryStatusVarargs(value: CodeableConcept*): Self = StObject.set(x, "inventoryStatus", js.Array(value*))
    
    inline def setName(value: js.Array[InventoryItemName]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNameVarargs(value: InventoryItemName*): Self = StObject.set(x, "name", js.Array(value*))
    
    inline def setNetContent(value: Quantity): Self = StObject.set(x, "netContent", value.asInstanceOf[js.Any])
    
    inline def setNetContentUndefined: Self = StObject.set(x, "netContent", js.undefined)
    
    inline def setProductReference(value: Reference): Self = StObject.set(x, "productReference", value.asInstanceOf[js.Any])
    
    inline def setProductReferenceUndefined: Self = StObject.set(x, "productReference", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.InventoryItem): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResponsibleOrganization(value: js.Array[InventoryItemResponsibleOrganization]): Self = StObject.set(x, "responsibleOrganization", value.asInstanceOf[js.Any])
    
    inline def setResponsibleOrganizationUndefined: Self = StObject.set(x, "responsibleOrganization", js.undefined)
    
    inline def setResponsibleOrganizationVarargs(value: InventoryItemResponsibleOrganization*): Self = StObject.set(x, "responsibleOrganization", js.Array(value*))
    
    inline def setStatus(value: active | inactive | `entered-in-error` | unknown): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
