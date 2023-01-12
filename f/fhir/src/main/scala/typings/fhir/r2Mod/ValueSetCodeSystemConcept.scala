package typings.fhir.r2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueSetCodeSystemConcept
  extends StObject
     with BackboneElement {
  
  var _abstract: js.UndefOr[Element] = js.undefined
  
  var _code: js.UndefOr[Element] = js.undefined
  
  var _definition: js.UndefOr[Element] = js.undefined
  
  var _display: js.UndefOr[Element] = js.undefined
  
  /**
    * If this code is not for use as a real concept.
    */
  var `abstract`: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A code - a text symbol - that uniquely identifies the concept within the code system.
    */
  var code: String
  
  /**
    * Defines children of a concept to produce a hierarchy of concepts. The nature of the relationships is variable (is-a/contains/categorizes) and can only be determined by examining the definitions of the concepts.
    */
  var concept: js.UndefOr[js.Array[ValueSetCodeSystemConcept]] = js.undefined
  
  /**
    * The formal definition of the concept. The value set resource does not make formal definitions required, because of the prevalence of legacy systems. However, they are highly recommended, as without them there is no formal meaning associated with the concept.
    */
  var definition: js.UndefOr[String] = js.undefined
  
  /**
    * Many concept definition systems support multiple representations, in multiple languages, and for multiple purposes.
    */
  var designation: js.UndefOr[js.Array[ValueSetCodeSystemConceptDesignation]] = js.undefined
  
  /**
    * A human readable string that is the recommended default way to present this concept to a user.
    */
  var display: js.UndefOr[String] = js.undefined
}
object ValueSetCodeSystemConcept {
  
  inline def apply(code: String): ValueSetCodeSystemConcept = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueSetCodeSystemConcept]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ValueSetCodeSystemConcept] (val x: Self) extends AnyVal {
    
    inline def setAbstract(value: Boolean): Self = StObject.set(x, "abstract", value.asInstanceOf[js.Any])
    
    inline def setAbstractUndefined: Self = StObject.set(x, "abstract", js.undefined)
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setConcept(value: js.Array[ValueSetCodeSystemConcept]): Self = StObject.set(x, "concept", value.asInstanceOf[js.Any])
    
    inline def setConceptUndefined: Self = StObject.set(x, "concept", js.undefined)
    
    inline def setConceptVarargs(value: ValueSetCodeSystemConcept*): Self = StObject.set(x, "concept", js.Array(value*))
    
    inline def setDefinition(value: String): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    inline def setDefinitionUndefined: Self = StObject.set(x, "definition", js.undefined)
    
    inline def setDesignation(value: js.Array[ValueSetCodeSystemConceptDesignation]): Self = StObject.set(x, "designation", value.asInstanceOf[js.Any])
    
    inline def setDesignationUndefined: Self = StObject.set(x, "designation", js.undefined)
    
    inline def setDesignationVarargs(value: ValueSetCodeSystemConceptDesignation*): Self = StObject.set(x, "designation", js.Array(value*))
    
    inline def setDisplay(value: String): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    inline def set_abstract(value: Element): Self = StObject.set(x, "_abstract", value.asInstanceOf[js.Any])
    
    inline def set_abstractUndefined: Self = StObject.set(x, "_abstract", js.undefined)
    
    inline def set_code(value: Element): Self = StObject.set(x, "_code", value.asInstanceOf[js.Any])
    
    inline def set_codeUndefined: Self = StObject.set(x, "_code", js.undefined)
    
    inline def set_definition(value: Element): Self = StObject.set(x, "_definition", value.asInstanceOf[js.Any])
    
    inline def set_definitionUndefined: Self = StObject.set(x, "_definition", js.undefined)
    
    inline def set_display(value: Element): Self = StObject.set(x, "_display", value.asInstanceOf[js.Any])
    
    inline def set_displayUndefined: Self = StObject.set(x, "_display", js.undefined)
  }
}
