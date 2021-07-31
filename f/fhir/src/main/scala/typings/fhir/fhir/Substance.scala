package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A homogeneous material with a definite composition
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait Substance
  extends StObject
     with DomainResource {
  
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * What class/type of substance this is
    */
  var category: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * What substance this is
    */
  var code: CodeableConcept
  
  /**
    * Textual description of the substance, comments
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Unique identifier
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Composition information about the substance
    */
  var ingredient: js.UndefOr[js.Array[SubstanceIngredient]] = js.undefined
  
  /**
    * If this describes a specific package/container of the substance
    */
  var instance: js.UndefOr[js.Array[SubstanceInstance]] = js.undefined
  
  /**
    * active | inactive | entered-in-error
    */
  var status: js.UndefOr[code] = js.undefined
}
object Substance {
  
  @scala.inline
  def apply(code: CodeableConcept): Substance = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[Substance]
  }
  
  @scala.inline
  implicit class SubstanceMutableBuilder[Self <: Substance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategory(value: js.Array[CodeableConcept]): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    @scala.inline
    def setCategoryVarargs(value: CodeableConcept*): Self = StObject.set(x, "category", js.Array(value :_*))
    
    @scala.inline
    def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    @scala.inline
    def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value :_*))
    
    @scala.inline
    def setIngredient(value: js.Array[SubstanceIngredient]): Self = StObject.set(x, "ingredient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIngredientUndefined: Self = StObject.set(x, "ingredient", js.undefined)
    
    @scala.inline
    def setIngredientVarargs(value: SubstanceIngredient*): Self = StObject.set(x, "ingredient", js.Array(value :_*))
    
    @scala.inline
    def setInstance(value: js.Array[SubstanceInstance]): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
    
    @scala.inline
    def setInstanceVarargs(value: SubstanceInstance*): Self = StObject.set(x, "instance", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: code): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    @scala.inline
    def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
