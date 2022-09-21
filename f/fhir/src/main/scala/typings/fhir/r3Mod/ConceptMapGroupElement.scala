package typings.fhir.r3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConceptMapGroupElement
  extends StObject
     with BackboneElement {
  
  var _code: js.UndefOr[Element] = js.undefined
  
  var _display: js.UndefOr[Element] = js.undefined
  
  /**
    * Identity (code or path) or the element/item being mapped.
    */
  var code: js.UndefOr[String] = js.undefined
  
  /**
    * The display is ignored when processing the map.
    */
  var display: js.UndefOr[String] = js.undefined
  
  /**
    * Ideally there would only be one map, with equal or equivalent mapping. But multiple maps are allowed for several narrower options, or to assert that other concepts are unmatched.
    */
  var target: js.UndefOr[js.Array[ConceptMapGroupElementTarget]] = js.undefined
}
object ConceptMapGroupElement {
  
  inline def apply(): ConceptMapGroupElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConceptMapGroupElement]
  }
  
  extension [Self <: ConceptMapGroupElement](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setDisplay(value: String): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    inline def setTarget(value: js.Array[ConceptMapGroupElementTarget]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setTargetVarargs(value: ConceptMapGroupElementTarget*): Self = StObject.set(x, "target", js.Array(value*))
    
    inline def set_code(value: Element): Self = StObject.set(x, "_code", value.asInstanceOf[js.Any])
    
    inline def set_codeUndefined: Self = StObject.set(x, "_code", js.undefined)
    
    inline def set_display(value: Element): Self = StObject.set(x, "_display", value.asInstanceOf[js.Any])
    
    inline def set_displayUndefined: Self = StObject.set(x, "_display", js.undefined)
  }
}
