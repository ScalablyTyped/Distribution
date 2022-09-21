package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConceptMap2Group
  extends StObject
     with BackboneElement {
  
  var _source: js.UndefOr[Element] = js.undefined
  
  var _target: js.UndefOr[Element] = js.undefined
  
  /**
    * Generally, the ideal is that there would only be one mapping for each concept in the source value set, but a given concept may be mapped multiple times with different comments or dependencies.
    */
  var element: js.Array[ConceptMap2GroupElement]
  
  /**
    * This is not needed if the source value set is specified and it contains concepts from only a single system.
    */
  var source: js.UndefOr[String] = js.undefined
  
  /**
    * This is not needed if the target value set is specified and it contains concepts from only a single system. The group target may also be omitted if all of the target element relationship values are 'not-related-to'.
    */
  var target: js.UndefOr[String] = js.undefined
  
  /**
    * This only applies if the source code has a system value that matches the system defined for the group.
    */
  var unmapped: js.UndefOr[ConceptMap2GroupUnmapped] = js.undefined
}
object ConceptMap2Group {
  
  inline def apply(element: js.Array[ConceptMap2GroupElement]): ConceptMap2Group = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConceptMap2Group]
  }
  
  extension [Self <: ConceptMap2Group](x: Self) {
    
    inline def setElement(value: js.Array[ConceptMap2GroupElement]): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementVarargs(value: ConceptMap2GroupElement*): Self = StObject.set(x, "element", js.Array(value*))
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setUnmapped(value: ConceptMap2GroupUnmapped): Self = StObject.set(x, "unmapped", value.asInstanceOf[js.Any])
    
    inline def setUnmappedUndefined: Self = StObject.set(x, "unmapped", js.undefined)
    
    inline def set_source(value: Element): Self = StObject.set(x, "_source", value.asInstanceOf[js.Any])
    
    inline def set_sourceUndefined: Self = StObject.set(x, "_source", js.undefined)
    
    inline def set_target(value: Element): Self = StObject.set(x, "_target", value.asInstanceOf[js.Any])
    
    inline def set_targetUndefined: Self = StObject.set(x, "_target", js.undefined)
  }
}
