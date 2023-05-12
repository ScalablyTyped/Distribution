package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MedicinalProductManufactured
  extends StObject
     with DomainResource
     with _FhirResource {
  
  /**
    * Ingredient.
    */
  var ingredient: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Dose form as manufactured and before any transformation into the pharmaceutical product.
    */
  var manufacturedDoseForm: CodeableConcept
  
  /**
    * Manufacturer of the item (Note that this should be named "manufacturer" but it currently causes technical issues).
    */
  var manufacturer: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Other codeable characteristics.
    */
  var otherCharacteristics: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Dimensions, color etc.
    */
  var physicalCharacteristics: js.UndefOr[ProdCharacteristic] = js.undefined
  
  /**
    * The quantity or "count number" of the manufactured item.
    */
  var quantity: Quantity
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_MedicinalProductManufactured: typings.fhir.fhirStrings.MedicinalProductManufactured
  
  /**
    * The “real world” units in which the quantity of the manufactured item is described.
    */
  var unitOfPresentation: js.UndefOr[CodeableConcept] = js.undefined
}
object MedicinalProductManufactured {
  
  inline def apply(manufacturedDoseForm: CodeableConcept, quantity: Quantity): MedicinalProductManufactured = {
    val __obj = js.Dynamic.literal(manufacturedDoseForm = manufacturedDoseForm.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any], resourceType = "MedicinalProductManufactured")
    __obj.asInstanceOf[MedicinalProductManufactured]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MedicinalProductManufactured] (val x: Self) extends AnyVal {
    
    inline def setIngredient(value: js.Array[Reference]): Self = StObject.set(x, "ingredient", value.asInstanceOf[js.Any])
    
    inline def setIngredientUndefined: Self = StObject.set(x, "ingredient", js.undefined)
    
    inline def setIngredientVarargs(value: Reference*): Self = StObject.set(x, "ingredient", js.Array(value*))
    
    inline def setManufacturedDoseForm(value: CodeableConcept): Self = StObject.set(x, "manufacturedDoseForm", value.asInstanceOf[js.Any])
    
    inline def setManufacturer(value: js.Array[Reference]): Self = StObject.set(x, "manufacturer", value.asInstanceOf[js.Any])
    
    inline def setManufacturerUndefined: Self = StObject.set(x, "manufacturer", js.undefined)
    
    inline def setManufacturerVarargs(value: Reference*): Self = StObject.set(x, "manufacturer", js.Array(value*))
    
    inline def setOtherCharacteristics(value: js.Array[CodeableConcept]): Self = StObject.set(x, "otherCharacteristics", value.asInstanceOf[js.Any])
    
    inline def setOtherCharacteristicsUndefined: Self = StObject.set(x, "otherCharacteristics", js.undefined)
    
    inline def setOtherCharacteristicsVarargs(value: CodeableConcept*): Self = StObject.set(x, "otherCharacteristics", js.Array(value*))
    
    inline def setPhysicalCharacteristics(value: ProdCharacteristic): Self = StObject.set(x, "physicalCharacteristics", value.asInstanceOf[js.Any])
    
    inline def setPhysicalCharacteristicsUndefined: Self = StObject.set(x, "physicalCharacteristics", js.undefined)
    
    inline def setQuantity(value: Quantity): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setResourceType(value: typings.fhir.fhirStrings.MedicinalProductManufactured): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setUnitOfPresentation(value: CodeableConcept): Self = StObject.set(x, "unitOfPresentation", value.asInstanceOf[js.Any])
    
    inline def setUnitOfPresentationUndefined: Self = StObject.set(x, "unitOfPresentation", js.undefined)
  }
}
