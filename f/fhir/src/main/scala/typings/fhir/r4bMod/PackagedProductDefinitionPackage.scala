package typings.fhir.r4bMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PackagedProductDefinitionPackage
  extends StObject
     with BackboneElement {
  
  /**
    * Allows containers (and parts of containers) parwithin containers, still a single packaged product.  See also PackagedProductDefinition.package.containedItem.item(PackagedProductDefinition).
    */
  @JSName("package")
  var _package: js.UndefOr[js.Array[PackagedProductDefinitionPackage]] = js.undefined
  
  /**
    * A possible alternate material for this part of the packaging, that is allowed to be used instead of the usual material (e.g. different types of plastic for a blister sleeve).
    */
  var alternateMaterial: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * The item(s) within the packaging.
    */
  var containedItem: js.UndefOr[js.Array[PackagedProductDefinitionPackageContainedItem]] = js.undefined
  
  /**
    * An identifier that is specific to this particular part of the packaging. Including possibly Data Carrier Identifier (a GS1 barcode).
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Manufacturer of this package Item. When there are multiple it means these are all possible manufacturers.
    */
  var manufacturer: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Material type of the package item.
    */
  var material: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * General characteristics of this item.
    */
  var property: js.UndefOr[js.Array[PackagedProductDefinitionPackageProperty]] = js.undefined
  
  /**
    * The quantity of this level of packaging in the package that contains it. If specified, the outermost level is always 1.
    */
  var quantity: js.UndefOr[Double] = js.undefined
  
  /**
    * Shelf Life and storage information.
    */
  var shelfLifeStorage: js.UndefOr[js.Array[PackagedProductDefinitionPackageShelfLifeStorage]] = js.undefined
  
  /**
    * The physical type of the container of the items.
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}
object PackagedProductDefinitionPackage {
  
  inline def apply(): PackagedProductDefinitionPackage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PackagedProductDefinitionPackage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PackagedProductDefinitionPackage] (val x: Self) extends AnyVal {
    
    inline def setAlternateMaterial(value: js.Array[CodeableConcept]): Self = StObject.set(x, "alternateMaterial", value.asInstanceOf[js.Any])
    
    inline def setAlternateMaterialUndefined: Self = StObject.set(x, "alternateMaterial", js.undefined)
    
    inline def setAlternateMaterialVarargs(value: CodeableConcept*): Self = StObject.set(x, "alternateMaterial", js.Array(value*))
    
    inline def setContainedItem(value: js.Array[PackagedProductDefinitionPackageContainedItem]): Self = StObject.set(x, "containedItem", value.asInstanceOf[js.Any])
    
    inline def setContainedItemUndefined: Self = StObject.set(x, "containedItem", js.undefined)
    
    inline def setContainedItemVarargs(value: PackagedProductDefinitionPackageContainedItem*): Self = StObject.set(x, "containedItem", js.Array(value*))
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setManufacturer(value: js.Array[Reference]): Self = StObject.set(x, "manufacturer", value.asInstanceOf[js.Any])
    
    inline def setManufacturerUndefined: Self = StObject.set(x, "manufacturer", js.undefined)
    
    inline def setManufacturerVarargs(value: Reference*): Self = StObject.set(x, "manufacturer", js.Array(value*))
    
    inline def setMaterial(value: js.Array[CodeableConcept]): Self = StObject.set(x, "material", value.asInstanceOf[js.Any])
    
    inline def setMaterialUndefined: Self = StObject.set(x, "material", js.undefined)
    
    inline def setMaterialVarargs(value: CodeableConcept*): Self = StObject.set(x, "material", js.Array(value*))
    
    inline def setProperty(value: js.Array[PackagedProductDefinitionPackageProperty]): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
    
    inline def setPropertyVarargs(value: PackagedProductDefinitionPackageProperty*): Self = StObject.set(x, "property", js.Array(value*))
    
    inline def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    inline def setShelfLifeStorage(value: js.Array[PackagedProductDefinitionPackageShelfLifeStorage]): Self = StObject.set(x, "shelfLifeStorage", value.asInstanceOf[js.Any])
    
    inline def setShelfLifeStorageUndefined: Self = StObject.set(x, "shelfLifeStorage", js.undefined)
    
    inline def setShelfLifeStorageVarargs(value: PackagedProductDefinitionPackageShelfLifeStorage*): Self = StObject.set(x, "shelfLifeStorage", js.Array(value*))
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def set_package(value: js.Array[PackagedProductDefinitionPackage]): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
    
    inline def set_packageUndefined: Self = StObject.set(x, "package", js.undefined)
    
    inline def set_packageVarargs(value: PackagedProductDefinitionPackage*): Self = StObject.set(x, "package", js.Array(value*))
  }
}
