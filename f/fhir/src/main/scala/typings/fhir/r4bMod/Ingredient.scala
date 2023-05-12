package typings.fhir.r4bMod

import typings.fhir.fhirStrings.active
import typings.fhir.fhirStrings.draft
import typings.fhir.fhirStrings.retired
import typings.fhir.fhirStrings.unknown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ingredient
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _allergenicIndicator: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * If the ingredient is a known or suspected allergen. Note that this is a property of the substance, so if a reference to a SubstanceDefinition is used to decribe that (rather than just a code), the allergen information should go there, not here.
    */
  var allergenicIndicator: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The product which this ingredient is a constituent part of.
    */
  var `for`: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * A classification of the ingredient identifying its precise purpose(s) in the drug product. This extends the Ingredient.role to add more detail. Example: antioxidant, alkalizing agent.
    */
  var function: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * The identifier(s) of this Ingredient that are assigned by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate.
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * The organization(s) that manufacture this ingredient. Can be used to indicate:         1) Organizations we are aware of that manufacture this ingredient         2) Specific Manufacturer(s) currently being used         3) Set of organisations allowed to manufacture this ingredient for this product         Users must be clear on the application of context relevant to their use case.
    */
  var manufacturer: js.UndefOr[js.Array[IngredientManufacturer]] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_Ingredient: typings.fhir.fhirStrings.Ingredient
  
  /**
    * A classification of the ingredient identifying its purpose within the product, e.g. active, inactive.
    */
  var role: CodeableConcept
  
  /**
    * Allows filtering of ingredient that are appropriate for use versus not.
    */
  var status: draft | active | retired | unknown
  
  /**
    * The substance that comprises this ingredient.
    */
  var substance: IngredientSubstance
}
object Ingredient {
  
  inline def apply(role: CodeableConcept, status: draft | active | retired | unknown, substance: IngredientSubstance): Ingredient = {
    val __obj = js.Dynamic.literal(resourceType = "Ingredient", role = role.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], substance = substance.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ingredient]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ingredient] (val x: Self) extends AnyVal {
    
    inline def setAllergenicIndicator(value: Boolean): Self = StObject.set(x, "allergenicIndicator", value.asInstanceOf[js.Any])
    
    inline def setAllergenicIndicatorUndefined: Self = StObject.set(x, "allergenicIndicator", js.undefined)
    
    inline def setFor(value: js.Array[Reference]): Self = StObject.set(x, "for", value.asInstanceOf[js.Any])
    
    inline def setForUndefined: Self = StObject.set(x, "for", js.undefined)
    
    inline def setForVarargs(value: Reference*): Self = StObject.set(x, "for", js.Array(value*))
    
    inline def setFunction(value: js.Array[CodeableConcept]): Self = StObject.set(x, "function", value.asInstanceOf[js.Any])
    
    inline def setFunctionUndefined: Self = StObject.set(x, "function", js.undefined)
    
    inline def setFunctionVarargs(value: CodeableConcept*): Self = StObject.set(x, "function", js.Array(value*))
    
    inline def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setManufacturer(value: js.Array[IngredientManufacturer]): Self = StObject.set(x, "manufacturer", value.asInstanceOf[js.Any])
    
    inline def setManufacturerUndefined: Self = StObject.set(x, "manufacturer", js.undefined)
    
    inline def setManufacturerVarargs(value: IngredientManufacturer*): Self = StObject.set(x, "manufacturer", js.Array(value*))
    
    inline def setResourceType(value: typings.fhir.fhirStrings.Ingredient): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setRole(value: CodeableConcept): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: draft | active | retired | unknown): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setSubstance(value: IngredientSubstance): Self = StObject.set(x, "substance", value.asInstanceOf[js.Any])
    
    inline def set_allergenicIndicator(value: Element): Self = StObject.set(x, "_allergenicIndicator", value.asInstanceOf[js.Any])
    
    inline def set_allergenicIndicatorUndefined: Self = StObject.set(x, "_allergenicIndicator", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
