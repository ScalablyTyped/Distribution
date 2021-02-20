package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Mappings for a concept from the source set
  */
@js.native
trait ConceptMapGroupElement extends BackboneElement {
  
  /**
    * Contains extended information for property 'code'.
    */
  var _code: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'display'.
    */
  var _display: js.UndefOr[Element] = js.native
  
  /**
    * Identifies element being mapped
    */
  var code: js.UndefOr[typings.fhir.fhir.code] = js.native
  
  /**
    * Display for the code
    */
  var display: js.UndefOr[String] = js.native
  
  /**
    * Concept in target system for element
    */
  var target: js.UndefOr[js.Array[ConceptMapGroupElementTarget]] = js.native
}
object ConceptMapGroupElement {
  
  @scala.inline
  def apply(): ConceptMapGroupElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConceptMapGroupElement]
  }
  
  @scala.inline
  implicit class ConceptMapGroupElementMutableBuilder[Self <: ConceptMapGroupElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: code): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    @scala.inline
    def setDisplay(value: String): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    @scala.inline
    def setTarget(value: js.Array[ConceptMapGroupElementTarget]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    @scala.inline
    def setTargetVarargs(value: ConceptMapGroupElementTarget*): Self = StObject.set(x, "target", js.Array(value :_*))
    
    @scala.inline
    def set_code(value: Element): Self = StObject.set(x, "_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_codeUndefined: Self = StObject.set(x, "_code", js.undefined)
    
    @scala.inline
    def set_display(value: Element): Self = StObject.set(x, "_display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_displayUndefined: Self = StObject.set(x, "_display", js.undefined)
  }
}
