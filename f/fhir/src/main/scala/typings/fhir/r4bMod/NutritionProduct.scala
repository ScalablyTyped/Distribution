package typings.fhir.r4bMod

import typings.fhir.fhirStrings.`entered-in-error`
import typings.fhir.fhirStrings.active
import typings.fhir.fhirStrings.inactive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NutritionProduct
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * Nutrition products can have different classifications - according to its nutritional properties, preparation methods, etc.
    */
  var category: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * The code assigned to the product, for example a manufacturer number or other terminology.
    */
  var code: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Ingredients contained in this product.
    */
  var ingredient: js.UndefOr[js.Array[NutritionProductIngredient]] = js.undefined
  
  /**
    * Conveys instance-level information about this product item. One or several physical, countable instances or occurrences of the product.
    */
  var instance: js.UndefOr[NutritionProductInstance] = js.undefined
  
  /**
    * Allergens that are known or suspected to be a part of this nutrition product.
    */
  var knownAllergen: js.UndefOr[js.Array[CodeableReference]] = js.undefined
  
  /**
    * The organisation (manufacturer, representative or legal authorisation holder) that is responsible for the device.
    */
  var manufacturer: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Comments made about the product.
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  
  /**
    * Note: This is a business identifier, not a resource identifier (see [discussion](resource.html#identifiers)).  It is best practice for the identifier to only appear on a single resource instance, however business practices may occasionally dictate that multiple resource instances with the same identifier can exist - possibly even with different resource types.  For example, multiple Patient and a Person resource instance might share the same social insurance number.
    */
  var nutrient: js.UndefOr[js.Array[NutritionProductNutrient]] = js.undefined
  
  /**
    * Specifies descriptive properties of the nutrition product.
    */
  var productCharacteristic: js.UndefOr[js.Array[NutritionProductProductCharacteristic]] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_NutritionProduct: typings.fhir.fhirStrings.NutritionProduct
  
  /**
    * Unknown does not represent "other" - one of the defined statuses must apply.  Unknown is used when the authoring system is not sure what the current status is.
    */
  var status: active | inactive | `entered-in-error`
}
object NutritionProduct {
  
  inline def apply(status: active | inactive | `entered-in-error`): NutritionProduct = {
    val __obj = js.Dynamic.literal(resourceType = "NutritionProduct", status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[NutritionProduct]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NutritionProduct] (val x: Self) extends AnyVal {
    
    inline def setCategory(value: js.Array[CodeableConcept]): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setCategoryVarargs(value: CodeableConcept*): Self = StObject.set(x, "category", js.Array(value*))
    
    inline def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setIngredient(value: js.Array[NutritionProductIngredient]): Self = StObject.set(x, "ingredient", value.asInstanceOf[js.Any])
    
    inline def setIngredientUndefined: Self = StObject.set(x, "ingredient", js.undefined)
    
    inline def setIngredientVarargs(value: NutritionProductIngredient*): Self = StObject.set(x, "ingredient", js.Array(value*))
    
    inline def setInstance(value: NutritionProductInstance): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
    
    inline def setKnownAllergen(value: js.Array[CodeableReference]): Self = StObject.set(x, "knownAllergen", value.asInstanceOf[js.Any])
    
    inline def setKnownAllergenUndefined: Self = StObject.set(x, "knownAllergen", js.undefined)
    
    inline def setKnownAllergenVarargs(value: CodeableReference*): Self = StObject.set(x, "knownAllergen", js.Array(value*))
    
    inline def setManufacturer(value: js.Array[Reference]): Self = StObject.set(x, "manufacturer", value.asInstanceOf[js.Any])
    
    inline def setManufacturerUndefined: Self = StObject.set(x, "manufacturer", js.undefined)
    
    inline def setManufacturerVarargs(value: Reference*): Self = StObject.set(x, "manufacturer", js.Array(value*))
    
    inline def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value*))
    
    inline def setNutrient(value: js.Array[NutritionProductNutrient]): Self = StObject.set(x, "nutrient", value.asInstanceOf[js.Any])
    
    inline def setNutrientUndefined: Self = StObject.set(x, "nutrient", js.undefined)
    
    inline def setNutrientVarargs(value: NutritionProductNutrient*): Self = StObject.set(x, "nutrient", js.Array(value*))
    
    inline def setProductCharacteristic(value: js.Array[NutritionProductProductCharacteristic]): Self = StObject.set(x, "productCharacteristic", value.asInstanceOf[js.Any])
    
    inline def setProductCharacteristicUndefined: Self = StObject.set(x, "productCharacteristic", js.undefined)
    
    inline def setProductCharacteristicVarargs(value: NutritionProductProductCharacteristic*): Self = StObject.set(x, "productCharacteristic", js.Array(value*))
    
    inline def setResourceType(value: typings.fhir.fhirStrings.NutritionProduct): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: active | inactive | `entered-in-error`): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
