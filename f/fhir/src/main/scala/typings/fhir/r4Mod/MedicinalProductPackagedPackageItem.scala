package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MedicinalProductPackagedPackageItem
  extends StObject
     with BackboneElement {
  
  /**
    * A possible alternate material for the packaging.
    */
  var alternateMaterial: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * A device accompanying a medicinal product.
    */
  var device: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Including possibly Data Carrier Identifier.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * The manufactured item as contained in the packaged medicinal product.
    */
  var manufacturedItem: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Manufacturer of this Package Item.
    */
  var manufacturer: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Material type of the package item.
    */
  var material: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Other codeable characteristics.
    */
  var otherCharacteristics: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Allows containers within containers.
    */
  var packageItem: js.UndefOr[js.Array[MedicinalProductPackagedPackageItem]] = js.undefined
  
  /**
    * Dimensions, color etc.
    */
  var physicalCharacteristics: js.UndefOr[ProdCharacteristic] = js.undefined
  
  /**
    * The quantity of this package in the medicinal product, at the current level of packaging. The outermost is always 1.
    */
  var quantity: Quantity
  
  /**
    * Shelf Life and storage information.
    */
  var shelfLifeStorage: js.UndefOr[js.Array[ProductShelfLife]] = js.undefined
  
  /**
    * The physical type of the container of the medicine.
    */
  var `type`: CodeableConcept
}
object MedicinalProductPackagedPackageItem {
  
  inline def apply(quantity: Quantity, `type`: CodeableConcept): MedicinalProductPackagedPackageItem = {
    val __obj = js.Dynamic.literal(quantity = quantity.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MedicinalProductPackagedPackageItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MedicinalProductPackagedPackageItem] (val x: Self) extends AnyVal {
    
    inline def setAlternateMaterial(value: js.Array[CodeableConcept]): Self = StObject.set(x, "alternateMaterial", value.asInstanceOf[js.Any])
    
    inline def setAlternateMaterialUndefined: Self = StObject.set(x, "alternateMaterial", js.undefined)
    
    inline def setAlternateMaterialVarargs(value: CodeableConcept*): Self = StObject.set(x, "alternateMaterial", js.Array(value*))
    
    inline def setDevice(value: js.Array[Reference]): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
    
    inline def setDeviceVarargs(value: Reference*): Self = StObject.set(x, "device", js.Array(value*))
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setManufacturedItem(value: js.Array[Reference]): Self = StObject.set(x, "manufacturedItem", value.asInstanceOf[js.Any])
    
    inline def setManufacturedItemUndefined: Self = StObject.set(x, "manufacturedItem", js.undefined)
    
    inline def setManufacturedItemVarargs(value: Reference*): Self = StObject.set(x, "manufacturedItem", js.Array(value*))
    
    inline def setManufacturer(value: js.Array[Reference]): Self = StObject.set(x, "manufacturer", value.asInstanceOf[js.Any])
    
    inline def setManufacturerUndefined: Self = StObject.set(x, "manufacturer", js.undefined)
    
    inline def setManufacturerVarargs(value: Reference*): Self = StObject.set(x, "manufacturer", js.Array(value*))
    
    inline def setMaterial(value: js.Array[CodeableConcept]): Self = StObject.set(x, "material", value.asInstanceOf[js.Any])
    
    inline def setMaterialUndefined: Self = StObject.set(x, "material", js.undefined)
    
    inline def setMaterialVarargs(value: CodeableConcept*): Self = StObject.set(x, "material", js.Array(value*))
    
    inline def setOtherCharacteristics(value: js.Array[CodeableConcept]): Self = StObject.set(x, "otherCharacteristics", value.asInstanceOf[js.Any])
    
    inline def setOtherCharacteristicsUndefined: Self = StObject.set(x, "otherCharacteristics", js.undefined)
    
    inline def setOtherCharacteristicsVarargs(value: CodeableConcept*): Self = StObject.set(x, "otherCharacteristics", js.Array(value*))
    
    inline def setPackageItem(value: js.Array[MedicinalProductPackagedPackageItem]): Self = StObject.set(x, "packageItem", value.asInstanceOf[js.Any])
    
    inline def setPackageItemUndefined: Self = StObject.set(x, "packageItem", js.undefined)
    
    inline def setPackageItemVarargs(value: MedicinalProductPackagedPackageItem*): Self = StObject.set(x, "packageItem", js.Array(value*))
    
    inline def setPhysicalCharacteristics(value: ProdCharacteristic): Self = StObject.set(x, "physicalCharacteristics", value.asInstanceOf[js.Any])
    
    inline def setPhysicalCharacteristicsUndefined: Self = StObject.set(x, "physicalCharacteristics", js.undefined)
    
    inline def setQuantity(value: Quantity): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setShelfLifeStorage(value: js.Array[ProductShelfLife]): Self = StObject.set(x, "shelfLifeStorage", value.asInstanceOf[js.Any])
    
    inline def setShelfLifeStorageUndefined: Self = StObject.set(x, "shelfLifeStorage", js.undefined)
    
    inline def setShelfLifeStorageVarargs(value: ProductShelfLife*): Self = StObject.set(x, "shelfLifeStorage", js.Array(value*))
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
