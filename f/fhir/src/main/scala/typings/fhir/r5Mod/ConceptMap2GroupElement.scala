package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConceptMap2GroupElement
  extends StObject
     with BackboneElement {
  
  var _code: js.UndefOr[Element] = js.undefined
  
  var _display: js.UndefOr[Element] = js.undefined
  
  var _noMap: js.UndefOr[Element] = js.undefined
  
  var _valueSet: js.UndefOr[Element] = js.undefined
  
  /**
    * Identity (code or path) or the element/item being mapped.
    */
  var code: js.UndefOr[String] = js.undefined
  
  /**
    * The display is ignored when processing the map.
    */
  var display: js.UndefOr[String] = js.undefined
  
  /**
    * If noMap = true this indicates that no mapping to a target concept exists for this source concept.
    */
  var noMap: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Ideally there would only be one map, with an 'equivalent' mapping. But multiple maps are allowed for several narrower (i.e. source-is-broader-than-target) options, or to assert that other concepts are not related.
    */
  var target: js.UndefOr[js.Array[ConceptMap2GroupElementTarget]] = js.undefined
  
  /**
    * The set of codes being mapped.
    */
  var valueSet: js.UndefOr[String] = js.undefined
}
object ConceptMap2GroupElement {
  
  inline def apply(): ConceptMap2GroupElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConceptMap2GroupElement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConceptMap2GroupElement] (val x: Self) extends AnyVal {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setDisplay(value: String): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    inline def setNoMap(value: Boolean): Self = StObject.set(x, "noMap", value.asInstanceOf[js.Any])
    
    inline def setNoMapUndefined: Self = StObject.set(x, "noMap", js.undefined)
    
    inline def setTarget(value: js.Array[ConceptMap2GroupElementTarget]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setTargetVarargs(value: ConceptMap2GroupElementTarget*): Self = StObject.set(x, "target", js.Array(value*))
    
    inline def setValueSet(value: String): Self = StObject.set(x, "valueSet", value.asInstanceOf[js.Any])
    
    inline def setValueSetUndefined: Self = StObject.set(x, "valueSet", js.undefined)
    
    inline def set_code(value: Element): Self = StObject.set(x, "_code", value.asInstanceOf[js.Any])
    
    inline def set_codeUndefined: Self = StObject.set(x, "_code", js.undefined)
    
    inline def set_display(value: Element): Self = StObject.set(x, "_display", value.asInstanceOf[js.Any])
    
    inline def set_displayUndefined: Self = StObject.set(x, "_display", js.undefined)
    
    inline def set_noMap(value: Element): Self = StObject.set(x, "_noMap", value.asInstanceOf[js.Any])
    
    inline def set_noMapUndefined: Self = StObject.set(x, "_noMap", js.undefined)
    
    inline def set_valueSet(value: Element): Self = StObject.set(x, "_valueSet", value.asInstanceOf[js.Any])
    
    inline def set_valueSetUndefined: Self = StObject.set(x, "_valueSet", js.undefined)
  }
}
