package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Concepts in the code system
  */
trait CodeSystemConcept
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'code'.
    */
  var _code: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'definition'.
    */
  var _definition: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'display'.
    */
  var _display: js.UndefOr[Element] = js.undefined
  
  /**
    * Code that identifies concept
    */
  var code: typings.fhir.fhir.code
  
  /**
    * Child Concepts (is-a/contains/categorizes)
    */
  var concept: js.UndefOr[js.Array[CodeSystemConcept]] = js.undefined
  
  /**
    * Formal definition
    */
  var definition: js.UndefOr[String] = js.undefined
  
  /**
    * Additional representations for the concept
    */
  var designation: js.UndefOr[js.Array[CodeSystemConceptDesignation]] = js.undefined
  
  /**
    * Text to display to the user
    */
  var display: js.UndefOr[String] = js.undefined
  
  /**
    * Property value for the concept
    */
  var property: js.UndefOr[js.Array[CodeSystemConceptProperty]] = js.undefined
}
object CodeSystemConcept {
  
  inline def apply(code: code): CodeSystemConcept = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeSystemConcept]
  }
  
  extension [Self <: CodeSystemConcept](x: Self) {
    
    inline def setCode(value: code): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setConcept(value: js.Array[CodeSystemConcept]): Self = StObject.set(x, "concept", value.asInstanceOf[js.Any])
    
    inline def setConceptUndefined: Self = StObject.set(x, "concept", js.undefined)
    
    inline def setConceptVarargs(value: CodeSystemConcept*): Self = StObject.set(x, "concept", js.Array(value :_*))
    
    inline def setDefinition(value: String): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    inline def setDefinitionUndefined: Self = StObject.set(x, "definition", js.undefined)
    
    inline def setDesignation(value: js.Array[CodeSystemConceptDesignation]): Self = StObject.set(x, "designation", value.asInstanceOf[js.Any])
    
    inline def setDesignationUndefined: Self = StObject.set(x, "designation", js.undefined)
    
    inline def setDesignationVarargs(value: CodeSystemConceptDesignation*): Self = StObject.set(x, "designation", js.Array(value :_*))
    
    inline def setDisplay(value: String): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    inline def setProperty(value: js.Array[CodeSystemConceptProperty]): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
    
    inline def setPropertyVarargs(value: CodeSystemConceptProperty*): Self = StObject.set(x, "property", js.Array(value :_*))
    
    inline def set_code(value: Element): Self = StObject.set(x, "_code", value.asInstanceOf[js.Any])
    
    inline def set_codeUndefined: Self = StObject.set(x, "_code", js.undefined)
    
    inline def set_definition(value: Element): Self = StObject.set(x, "_definition", value.asInstanceOf[js.Any])
    
    inline def set_definitionUndefined: Self = StObject.set(x, "_definition", js.undefined)
    
    inline def set_display(value: Element): Self = StObject.set(x, "_display", value.asInstanceOf[js.Any])
    
    inline def set_displayUndefined: Self = StObject.set(x, "_display", js.undefined)
  }
}
