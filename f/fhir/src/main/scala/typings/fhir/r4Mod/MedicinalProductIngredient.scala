package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MedicinalProductIngredient
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _allergenicIndicator: js.UndefOr[Element] = js.undefined
  
  /**
    * If the ingredient is a known or suspected allergen.
    */
  var allergenicIndicator: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The identifier(s) of this Ingredient that are assigned by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate.
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * Manufacturer of this Ingredient.
    */
  var manufacturer: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_MedicinalProductIngredient: typings.fhir.fhirStrings.MedicinalProductIngredient
  
  /**
    * Ingredient role e.g. Active ingredient, excipient.
    */
  var role: CodeableConcept
  
  /**
    * A specified substance that comprises this ingredient.
    */
  var specifiedSubstance: js.UndefOr[js.Array[MedicinalProductIngredientSpecifiedSubstance]] = js.undefined
  
  /**
    * The ingredient substance.
    */
  var substance: js.UndefOr[MedicinalProductIngredientSubstance] = js.undefined
}
object MedicinalProductIngredient {
  
  inline def apply(role: CodeableConcept): MedicinalProductIngredient = {
    val __obj = js.Dynamic.literal(resourceType = "MedicinalProductIngredient", role = role.asInstanceOf[js.Any])
    __obj.asInstanceOf[MedicinalProductIngredient]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MedicinalProductIngredient] (val x: Self) extends AnyVal {
    
    inline def setAllergenicIndicator(value: Boolean): Self = StObject.set(x, "allergenicIndicator", value.asInstanceOf[js.Any])
    
    inline def setAllergenicIndicatorUndefined: Self = StObject.set(x, "allergenicIndicator", js.undefined)
    
    inline def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setManufacturer(value: js.Array[Reference]): Self = StObject.set(x, "manufacturer", value.asInstanceOf[js.Any])
    
    inline def setManufacturerUndefined: Self = StObject.set(x, "manufacturer", js.undefined)
    
    inline def setManufacturerVarargs(value: Reference*): Self = StObject.set(x, "manufacturer", js.Array(value*))
    
    inline def setResourceType(value: typings.fhir.fhirStrings.MedicinalProductIngredient): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setRole(value: CodeableConcept): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setSpecifiedSubstance(value: js.Array[MedicinalProductIngredientSpecifiedSubstance]): Self = StObject.set(x, "specifiedSubstance", value.asInstanceOf[js.Any])
    
    inline def setSpecifiedSubstanceUndefined: Self = StObject.set(x, "specifiedSubstance", js.undefined)
    
    inline def setSpecifiedSubstanceVarargs(value: MedicinalProductIngredientSpecifiedSubstance*): Self = StObject.set(x, "specifiedSubstance", js.Array(value*))
    
    inline def setSubstance(value: MedicinalProductIngredientSubstance): Self = StObject.set(x, "substance", value.asInstanceOf[js.Any])
    
    inline def setSubstanceUndefined: Self = StObject.set(x, "substance", js.undefined)
    
    inline def set_allergenicIndicator(value: Element): Self = StObject.set(x, "_allergenicIndicator", value.asInstanceOf[js.Any])
    
    inline def set_allergenicIndicatorUndefined: Self = StObject.set(x, "_allergenicIndicator", js.undefined)
  }
}
