package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Concepts in the code system
  */
@js.native
trait CodeSystemConcept extends BackboneElement {
  
  /**
    * Contains extended information for property 'code'.
    */
  var _code: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'definition'.
    */
  var _definition: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'display'.
    */
  var _display: js.UndefOr[Element] = js.native
  
  /**
    * Code that identifies concept
    */
  var code: typings.fhir.fhir.code = js.native
  
  /**
    * Child Concepts (is-a/contains/categorizes)
    */
  var concept: js.UndefOr[js.Array[CodeSystemConcept]] = js.native
  
  /**
    * Formal definition
    */
  var definition: js.UndefOr[String] = js.native
  
  /**
    * Additional representations for the concept
    */
  var designation: js.UndefOr[js.Array[CodeSystemConceptDesignation]] = js.native
  
  /**
    * Text to display to the user
    */
  var display: js.UndefOr[String] = js.native
  
  /**
    * Property value for the concept
    */
  var property: js.UndefOr[js.Array[CodeSystemConceptProperty]] = js.native
}
object CodeSystemConcept {
  
  @scala.inline
  def apply(code: code): CodeSystemConcept = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeSystemConcept]
  }
  
  @scala.inline
  implicit class CodeSystemConceptMutableBuilder[Self <: CodeSystemConcept] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: code): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConcept(value: js.Array[CodeSystemConcept]): Self = StObject.set(x, "concept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConceptUndefined: Self = StObject.set(x, "concept", js.undefined)
    
    @scala.inline
    def setConceptVarargs(value: CodeSystemConcept*): Self = StObject.set(x, "concept", js.Array(value :_*))
    
    @scala.inline
    def setDefinition(value: String): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefinitionUndefined: Self = StObject.set(x, "definition", js.undefined)
    
    @scala.inline
    def setDesignation(value: js.Array[CodeSystemConceptDesignation]): Self = StObject.set(x, "designation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesignationUndefined: Self = StObject.set(x, "designation", js.undefined)
    
    @scala.inline
    def setDesignationVarargs(value: CodeSystemConceptDesignation*): Self = StObject.set(x, "designation", js.Array(value :_*))
    
    @scala.inline
    def setDisplay(value: String): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    @scala.inline
    def setProperty(value: js.Array[CodeSystemConceptProperty]): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
    
    @scala.inline
    def setPropertyVarargs(value: CodeSystemConceptProperty*): Self = StObject.set(x, "property", js.Array(value :_*))
    
    @scala.inline
    def set_code(value: Element): Self = StObject.set(x, "_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_codeUndefined: Self = StObject.set(x, "_code", js.undefined)
    
    @scala.inline
    def set_definition(value: Element): Self = StObject.set(x, "_definition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_definitionUndefined: Self = StObject.set(x, "_definition", js.undefined)
    
    @scala.inline
    def set_display(value: Element): Self = StObject.set(x, "_display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_displayUndefined: Self = StObject.set(x, "_display", js.undefined)
  }
}
