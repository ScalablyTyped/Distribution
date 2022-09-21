package typings.fhir.r3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeSystemConcept
  extends StObject
     with BackboneElement {
  
  var _code: js.UndefOr[Element] = js.undefined
  
  var _definition: js.UndefOr[Element] = js.undefined
  
  var _display: js.UndefOr[Element] = js.undefined
  
  /**
    * A code - a text symbol - that uniquely identifies the concept within the code system.
    */
  var code: String
  
  /**
    * Defines children of a concept to produce a hierarchy of concepts. The nature of the relationships is variable (is-a/contains/categorizes) - see hierarchyMeaning.
    */
  var concept: js.UndefOr[js.Array[CodeSystemConcept]] = js.undefined
  
  /**
    * The formal definition of the concept. The code system resource does not make formal definitions required, because of the prevalence of legacy systems. However, they are highly recommended, as without them there is no formal meaning associated with the concept.
    */
  var definition: js.UndefOr[String] = js.undefined
  
  /**
    * Additional representations for the concept - other languages, aliases, specialized purposes, used for particular purposes, etc.
    */
  var designation: js.UndefOr[js.Array[CodeSystemConceptDesignation]] = js.undefined
  
  /**
    * A human readable string that is the recommended default way to present this concept to a user.
    */
  var display: js.UndefOr[String] = js.undefined
  
  /**
    * A property value for this concept.
    */
  var property: js.UndefOr[js.Array[CodeSystemConceptProperty]] = js.undefined
}
object CodeSystemConcept {
  
  inline def apply(code: String): CodeSystemConcept = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeSystemConcept]
  }
  
  extension [Self <: CodeSystemConcept](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setConcept(value: js.Array[CodeSystemConcept]): Self = StObject.set(x, "concept", value.asInstanceOf[js.Any])
    
    inline def setConceptUndefined: Self = StObject.set(x, "concept", js.undefined)
    
    inline def setConceptVarargs(value: CodeSystemConcept*): Self = StObject.set(x, "concept", js.Array(value*))
    
    inline def setDefinition(value: String): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    inline def setDefinitionUndefined: Self = StObject.set(x, "definition", js.undefined)
    
    inline def setDesignation(value: js.Array[CodeSystemConceptDesignation]): Self = StObject.set(x, "designation", value.asInstanceOf[js.Any])
    
    inline def setDesignationUndefined: Self = StObject.set(x, "designation", js.undefined)
    
    inline def setDesignationVarargs(value: CodeSystemConceptDesignation*): Self = StObject.set(x, "designation", js.Array(value*))
    
    inline def setDisplay(value: String): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    inline def setProperty(value: js.Array[CodeSystemConceptProperty]): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
    
    inline def setPropertyVarargs(value: CodeSystemConceptProperty*): Self = StObject.set(x, "property", js.Array(value*))
    
    inline def set_code(value: Element): Self = StObject.set(x, "_code", value.asInstanceOf[js.Any])
    
    inline def set_codeUndefined: Self = StObject.set(x, "_code", js.undefined)
    
    inline def set_definition(value: Element): Self = StObject.set(x, "_definition", value.asInstanceOf[js.Any])
    
    inline def set_definitionUndefined: Self = StObject.set(x, "_definition", js.undefined)
    
    inline def set_display(value: Element): Self = StObject.set(x, "_display", value.asInstanceOf[js.Any])
    
    inline def set_displayUndefined: Self = StObject.set(x, "_display", js.undefined)
  }
}
