package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PackagedProductDefinitionPackaging
  extends StObject
     with BackboneElement {
  
  var _componentPart: js.UndefOr[Element] = js.undefined
  
  /**
    * A possible alternate material for this part of the packaging, that is allowed to be used instead of the usual material (e.g. different types of plastic for a blister sleeve).
    */
  var alternateMaterial: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Is this a part of the packaging (e.g. a cap or bottle stopper), rather than the packaging itself (e.g. a bottle or vial). The latter type are designed be a container, but the former are not.
    */
  var componentPart: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The item(s) within the packaging.
    */
  var containedItem: js.UndefOr[js.Array[PackagedProductDefinitionPackagingContainedItem]] = js.undefined
  
  /**
    * A business identifier that is specific to this particular part of the packaging, often assigned by the manufacturer. Including possibly Data Carrier Identifier (a GS1 barcode).
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Manufacturer of this packaging item. When there are multiple values each one is a potential manufacturer of this packaging item.
    */
  var manufacturer: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Material type of the package item.
    */
  var material: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Allows containers (and parts of containers) within containers, still as a part of a single packaged product. See also PackagedProductDefinition.packaging.containedItem.item(PackagedProductDefinition).
    */
  var packaging: js.UndefOr[js.Array[PackagedProductDefinitionPackaging]] = js.undefined
  
  /**
    * General characteristics of this item.
    */
  var property: js.UndefOr[js.Array[PackagedProductDefinitionPackagingProperty]] = js.undefined
  
  /**
    * The quantity of packaging items contained at this layer of the package. This does not relate to the number of contained items but relates solely to the number of packaging items. When looking at the outermost layer it is always 1. If there are two boxes within, at the next layer it would be 2.
    */
  var quantity: js.UndefOr[Double] = js.undefined
  
  /**
    * Shelf Life and storage information.
    */
  var shelfLifeStorage: js.UndefOr[js.Array[ProductShelfLife]] = js.undefined
  
  /**
    * The physical type of the container of the items.
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}
object PackagedProductDefinitionPackaging {
  
  inline def apply(): PackagedProductDefinitionPackaging = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PackagedProductDefinitionPackaging]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PackagedProductDefinitionPackaging] (val x: Self) extends AnyVal {
    
    inline def setAlternateMaterial(value: js.Array[CodeableConcept]): Self = StObject.set(x, "alternateMaterial", value.asInstanceOf[js.Any])
    
    inline def setAlternateMaterialUndefined: Self = StObject.set(x, "alternateMaterial", js.undefined)
    
    inline def setAlternateMaterialVarargs(value: CodeableConcept*): Self = StObject.set(x, "alternateMaterial", js.Array(value*))
    
    inline def setComponentPart(value: Boolean): Self = StObject.set(x, "componentPart", value.asInstanceOf[js.Any])
    
    inline def setComponentPartUndefined: Self = StObject.set(x, "componentPart", js.undefined)
    
    inline def setContainedItem(value: js.Array[PackagedProductDefinitionPackagingContainedItem]): Self = StObject.set(x, "containedItem", value.asInstanceOf[js.Any])
    
    inline def setContainedItemUndefined: Self = StObject.set(x, "containedItem", js.undefined)
    
    inline def setContainedItemVarargs(value: PackagedProductDefinitionPackagingContainedItem*): Self = StObject.set(x, "containedItem", js.Array(value*))
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setManufacturer(value: js.Array[Reference]): Self = StObject.set(x, "manufacturer", value.asInstanceOf[js.Any])
    
    inline def setManufacturerUndefined: Self = StObject.set(x, "manufacturer", js.undefined)
    
    inline def setManufacturerVarargs(value: Reference*): Self = StObject.set(x, "manufacturer", js.Array(value*))
    
    inline def setMaterial(value: js.Array[CodeableConcept]): Self = StObject.set(x, "material", value.asInstanceOf[js.Any])
    
    inline def setMaterialUndefined: Self = StObject.set(x, "material", js.undefined)
    
    inline def setMaterialVarargs(value: CodeableConcept*): Self = StObject.set(x, "material", js.Array(value*))
    
    inline def setPackaging(value: js.Array[PackagedProductDefinitionPackaging]): Self = StObject.set(x, "packaging", value.asInstanceOf[js.Any])
    
    inline def setPackagingUndefined: Self = StObject.set(x, "packaging", js.undefined)
    
    inline def setPackagingVarargs(value: PackagedProductDefinitionPackaging*): Self = StObject.set(x, "packaging", js.Array(value*))
    
    inline def setProperty(value: js.Array[PackagedProductDefinitionPackagingProperty]): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
    
    inline def setPropertyVarargs(value: PackagedProductDefinitionPackagingProperty*): Self = StObject.set(x, "property", js.Array(value*))
    
    inline def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    inline def setShelfLifeStorage(value: js.Array[ProductShelfLife]): Self = StObject.set(x, "shelfLifeStorage", value.asInstanceOf[js.Any])
    
    inline def setShelfLifeStorageUndefined: Self = StObject.set(x, "shelfLifeStorage", js.undefined)
    
    inline def setShelfLifeStorageVarargs(value: ProductShelfLife*): Self = StObject.set(x, "shelfLifeStorage", js.Array(value*))
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def set_componentPart(value: Element): Self = StObject.set(x, "_componentPart", value.asInstanceOf[js.Any])
    
    inline def set_componentPartUndefined: Self = StObject.set(x, "_componentPart", js.undefined)
  }
}
