package typings.fhir.r2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConceptMapElement
  extends StObject
     with BackboneElement {
  
  var _code: js.UndefOr[Element] = js.undefined
  
  var _codeSystem: js.UndefOr[Element] = js.undefined
  
  /**
    * Identity (code or path) or the element/item being mapped.
    */
  var code: js.UndefOr[String] = js.undefined
  
  /**
    * An absolute URI that identifies the Code System (if the source is a value set that crosses more than one code system).
    */
  var codeSystem: js.UndefOr[String] = js.undefined
  
  /**
    * A concept from the target value set that this concept maps to.
    */
  var target: js.UndefOr[js.Array[ConceptMapElementTarget]] = js.undefined
}
object ConceptMapElement {
  
  inline def apply(): ConceptMapElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConceptMapElement]
  }
  
  extension [Self <: ConceptMapElement](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeSystem(value: String): Self = StObject.set(x, "codeSystem", value.asInstanceOf[js.Any])
    
    inline def setCodeSystemUndefined: Self = StObject.set(x, "codeSystem", js.undefined)
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setTarget(value: js.Array[ConceptMapElementTarget]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setTargetVarargs(value: ConceptMapElementTarget*): Self = StObject.set(x, "target", js.Array(value*))
    
    inline def set_code(value: Element): Self = StObject.set(x, "_code", value.asInstanceOf[js.Any])
    
    inline def set_codeSystem(value: Element): Self = StObject.set(x, "_codeSystem", value.asInstanceOf[js.Any])
    
    inline def set_codeSystemUndefined: Self = StObject.set(x, "_codeSystem", js.undefined)
    
    inline def set_codeUndefined: Self = StObject.set(x, "_code", js.undefined)
  }
}
