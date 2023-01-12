package typings.fhir.r2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Substance
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _description: js.UndefOr[Element] = js.undefined
  
  /**
    * A code that classifies the general type of substance.  This is used  for searching, sorting and display purposes.
    */
  var category: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * A code (or set of codes) that identify this substance.
    */
  var code: CodeableConcept
  
  /**
    * A description of the substance - its appearance, handling requirements, and other usage notes.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Unique identifier for the substance.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * A substance can be composed of other substances.
    */
  var ingredient: js.UndefOr[js.Array[SubstanceIngredient]] = js.undefined
  
  /**
    * Substance may be used to describe a kind of substance, or a specific package/container of the substance: an instance.
    */
  var instance: js.UndefOr[js.Array[SubstanceInstance]] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_Substance: typings.fhir.fhirStrings.Substance
}
object Substance {
  
  inline def apply(code: CodeableConcept): Substance = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], resourceType = "Substance")
    __obj.asInstanceOf[Substance]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Substance] (val x: Self) extends AnyVal {
    
    inline def setCategory(value: js.Array[CodeableConcept]): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setCategoryVarargs(value: CodeableConcept*): Self = StObject.set(x, "category", js.Array(value*))
    
    inline def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setIngredient(value: js.Array[SubstanceIngredient]): Self = StObject.set(x, "ingredient", value.asInstanceOf[js.Any])
    
    inline def setIngredientUndefined: Self = StObject.set(x, "ingredient", js.undefined)
    
    inline def setIngredientVarargs(value: SubstanceIngredient*): Self = StObject.set(x, "ingredient", js.Array(value*))
    
    inline def setInstance(value: js.Array[SubstanceInstance]): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
    
    inline def setInstanceVarargs(value: SubstanceInstance*): Self = StObject.set(x, "instance", js.Array(value*))
    
    inline def setResourceType(value: typings.fhir.fhirStrings.Substance): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
  }
}
